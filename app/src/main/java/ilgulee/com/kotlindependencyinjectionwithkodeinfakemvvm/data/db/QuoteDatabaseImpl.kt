package ilgulee.com.kotlindependencyinjectionwithkodeinfakemvvm.data.db


class QuoteDatabaseImpl: QuoteDatabase {
    override val quoteDao: QuoteDao = QuoteDaoFakeImpl()
}