package com.example.livedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    private val liveDataVarObject = MutableLiveData<String>("Hello People!!")

    val liveDataVar : LiveData<String> = liveDataVarObject

    fun updateLiveData(){
        liveDataVarObject.value = "Hi Coder!!"
    }
}