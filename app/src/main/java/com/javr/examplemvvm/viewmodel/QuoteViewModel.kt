package com.javr.examplemvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.javr.examplemvvm.model.QuoteModel
import com.javr.examplemvvm.model.QuoteProvider

class QuoteViewModel : ViewModel(){

    val quoteModel = MutableLiveData<QuoteModel>()

    fun randomQuote(){
        val currentQuote = QuoteProvider.random()
        quoteModel.postValue(currentQuote)
    }

}