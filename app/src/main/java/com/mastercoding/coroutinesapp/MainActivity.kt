package com.mastercoding.coroutinesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.mastercoding.coroutinesapp.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding

    private var counter : Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.countBtn.setOnClickListener {
            binding.counterText.text = counter++.toString()
        }

        binding.downloadBtn.setOnClickListener {


            // Using Coroutines
           // CoroutineScope(Dispatchers.IO).launch {
                downloadBigFileFromNet()


        }
        //When the user click on the download button, it will simulate a downloading file from internet and this
        //will be triggering a function called download big file from net.
        //I made a loop for loop that counts from 1 to 100000 times.

    }
    private fun downloadBigFileFromNet() {
        for(i in 1..100000){
            //Log.i("TAGY", "Downloading $i in ${Thread.currentThread().name}")
            binding.tvdownloadProgress.text="$i in ${Thread.currentThread().name}"
        }
        //And this playing log message with tag tag.
        //And the message is downloading.
        //And here is the number that it is currently
        //currently like counting it and here it displaying the name of the thread.
        //That it's working in it.
    }
}