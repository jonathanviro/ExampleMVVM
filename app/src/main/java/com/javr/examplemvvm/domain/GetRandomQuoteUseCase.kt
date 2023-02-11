package com.javr.examplemvvm.domain

import com.javr.examplemvvm.data.model.QuoteModel
import com.javr.examplemvvm.data.model.QuoteProvider

class GetRandomQuoteUseCase {

    operator fun invoke(): QuoteModel?{
        val quotesList = QuoteProvider.quotesList
        if (!quotesList.isNullOrEmpty()){
            val randomNumber = (0..quotesList.size -1).random()
            return quotesList[randomNumber]
        }
        return null
    }
}