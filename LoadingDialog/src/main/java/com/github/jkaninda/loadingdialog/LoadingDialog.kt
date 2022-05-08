package com.github.jkaninda.loadingdialog

import android.app.Activity
import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import com.github.jkaninda.loadingdialog.databinding.LoadingDialogBinding

class LoadingDialog(private var activity: Activity) {
    var dialog: Dialog? = null


    fun startLoadingDialog(cancelable:Boolean=false,message:String?=null) {
        dialog = Dialog(activity)
        val binding: LoadingDialogBinding = LoadingDialogBinding.inflate(activity.layoutInflater)
        dialog?.apply {
            window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            setContentView(binding.root)
            message?.let {
                binding.tvLoading.text=message

            }
            setCancelable(cancelable)
            show()
        }
    }

    fun dismissDialog() {
        dialog?.dismiss()
    }


}