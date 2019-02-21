package ilgulee.com.kotlindependencyinjectionwithkodeinfakemvvm.data.repository

import androidx.lifecycle.LiveData
import ilgulee.com.kotlindependencyinjectionwithkodeinfakemvvm.data.model.Quote

interface QuoteDaoRepository {
    fun addQuote(quote: Quote)
    fun getQuotes(): LiveData<List<Quote>>
}