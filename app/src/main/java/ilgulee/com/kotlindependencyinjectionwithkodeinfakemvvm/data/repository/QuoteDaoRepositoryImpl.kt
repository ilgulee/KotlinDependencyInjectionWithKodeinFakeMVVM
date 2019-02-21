package ilgulee.com.kotlindependencyinjectionwithkodeinfakemvvm.data.repository

import ilgulee.com.kotlindependencyinjectionwithkodeinfakemvvm.data.db.QuoteDao
import ilgulee.com.kotlindependencyinjectionwithkodeinfakemvvm.data.model.Quote
//we are going to use dependency injection and singleton
class QuoteDaoRepositoryImpl(private val quoteDao: QuoteDao): QuoteDaoRepository {
    override fun addQuote(quote: Quote) {
        quoteDao.addQuote(quote)
    }

    override fun getQuotes()=quoteDao.getQuotes()
}