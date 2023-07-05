package com.example.livedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    lateinit var mainViewModel : MainViewModel
    lateinit var textView : TextView
    lateinit var btn_update : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        textView = findViewById(R.id.textView)

        btn_update = findViewById(R.id.button)

        mainViewModel.liveDataVar.observe(this, Observer {
            textView.text = mainViewModel.liveDataVar.value
        })

        btn_update.setOnClickListener {
            mainViewModel.updateLiveData()
        }


    }
}