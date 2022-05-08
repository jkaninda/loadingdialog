package com.jkantech.loadingdialogexample

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.jkaninda.loadingdialog.LoadingDialog
import com.jkantech.loadingdialogexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var loadingDialog: LoadingDialog
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        loadingDialog=LoadingDialog(this)
        binding.bnLoading.setOnClickListener {
            loadingDialog.startLoadingDialog(true)
        }

    }
}