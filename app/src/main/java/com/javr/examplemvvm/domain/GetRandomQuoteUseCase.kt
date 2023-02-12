package com.javr.examplemvvm.domain

import com.javr.examplemvvm.data.model.QuoteModel
import com.javr.examplemvvm.data.model.QuoteProvider
import javax.inject.Inject

class GetRandomQuoteUseCase @Inject constructor(private val quoteProvider: QuoteProvider){

    operator fun invoke(): QuoteModel?{
        val quotesList = quoteProvider.quotesList
        if (!quotesList.isNullOrEmpty()){
            val randomNumber = (0..quotesList.size -1).random()
            return quotesList[randomNumber]
        }
        return null
    }
}