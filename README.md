# Android Loading Dialog


[![License: Apache-2.0](https://img.shields.io/badge/License-Apache%202.0-yellow.svg)](http://www.apache.org/licenses/LICENSE-2.0)


## Download and Import

### Android Studio/Gradle

- Maven:

 ```groovy
	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
	
	
	

	<dependency>
	    <groupId>com.github.jkanTech</groupId>
	    <artifactId>goma</artifactId>
	    <version>1.0.2</version>
	</dependency>


 ```

- JitPack.io, add `jitpack.io` repositiory and dependency to your `build.gradle`:

 ```groovy
    repositories {
        maven {
            url "https://jitpack.io"
        }
    }
	
    dependencies {
	        implementation 'jkaninda:loadingdialog:1.0'
		}
```


### Android Studio

 ```groovy
    repositories {
        maven {
            url "https://jitpack.io"
        }
    }
	
    dependencies {
	        implementation 'jkaninda:loadingdialog:1.0'
		}
 ```




### Sample Kotlin Usage
#### 

```Kotlin
private lateinit var loadingDialog: LoadingDialog
//Initialize Loading Dialog
loadingDialog=LoadingDialog(this)
//Start dialog
loadingDialog.startLoadingDialog(true)

//Dismiss dialog
loadingDialog.dismissDialog()


 
```


<h2 id="examples">Examples :eyes:</h2>

Download the [Loading Dialog Example App]() or look at the [source code](https://github.com/jkaninda/loadingdialog/tree/master/app).


<br/>

## Authors

* **Jonas Kaninda**  - [jkaninda](https://github.com/jkaninda)


## License

This project is licensed under the Apache License 2.0 - see the [LICENSE](LICENSE) file for details.