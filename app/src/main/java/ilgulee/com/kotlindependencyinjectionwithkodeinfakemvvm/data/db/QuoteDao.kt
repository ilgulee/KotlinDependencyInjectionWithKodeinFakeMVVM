package ilgulee.com.kotlindependencyinjectionwithkodeinfakemvvm.data.db

import androidx.lifecycle.LiveData
import ilgulee.com.kotlindependencyinjectionwithkodeinfakemvvm.data.model.Quote

interface QuoteDao {
    fun addQuote(quote: Quote)
    fun getQuotes():LiveData<List<Quote>>
}