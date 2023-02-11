package com.javr.examplemvvm.data

import com.javr.examplemvvm.data.model.QuoteModel
import com.javr.examplemvvm.data.model.QuoteProvider
import com.javr.examplemvvm.data.network.QuoteService

class QuoteRespository {
    private val api = QuoteService()

    suspend fun  getAllQuotes(): List<QuoteModel>{
        val response = api.getQuotes()
        QuoteProvider.quotesList = response
        return response
    }
}