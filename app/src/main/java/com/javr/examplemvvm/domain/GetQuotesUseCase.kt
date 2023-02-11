package com.javr.examplemvvm.domain

import com.javr.examplemvvm.data.QuoteRespository
import com.javr.examplemvvm.data.model.QuoteModel

class GetQuotesUseCase {
    private val repository = QuoteRespository()

    suspend operator fun invoke(): List<QuoteModel>? = repository.getAllQuotes()

}