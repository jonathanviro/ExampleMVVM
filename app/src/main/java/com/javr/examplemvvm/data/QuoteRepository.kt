package com.javr.examplemvvm.data

import com.javr.examplemvvm.data.model.QuoteModel
import com.javr.examplemvvm.data.model.QuoteProvider
import com.javr.examplemvvm.data.network.QuoteService
import javax.inject.Inject

class QuoteRepository @Inject constructor(private val api: QuoteService, private val quoteProvider: QuoteProvider){
    suspend fun  getAllQuotes(): List<QuoteModel>{
        val response = api.getQuotes()
        quoteProvider.quotesList = response
        return response
    }
}