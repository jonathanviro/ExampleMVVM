package com.javr.examplemvvm.data.model

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class QuoteProvider @Inject constructor() {
    var quotesList: List<QuoteModel> = emptyList()
}