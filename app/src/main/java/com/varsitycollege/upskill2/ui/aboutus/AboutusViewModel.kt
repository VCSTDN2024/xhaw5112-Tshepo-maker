package com.varsitycollege.upskill2.ui.aboutus

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AboutusViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Empowering the Nation was established in 2018 and offers courses in Johannesburg.\n" +
                "Hundreds of domestic workers and gardeners have been trained and on both the six-month long Leanerships and six-week Short Skills Training Programmes to empower themselves and can provide more marketable skills.\n" +

                "The six-month programmes take place over 12 weeks and the short courses take six weeks."
    }
    val text: LiveData<String> = _text
}