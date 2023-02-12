package com.javr.examplemvvm.domain

import com.javr.examplemvvm.data.QuoteRepository
import com.javr.examplemvvm.data.model.QuoteModel
import javax.inject.Inject

class GetQuotesUseCase @Inject constructor(private val repository: QuoteRepository){
    suspend operator fun invoke() = repository.getAllQuotes()

}