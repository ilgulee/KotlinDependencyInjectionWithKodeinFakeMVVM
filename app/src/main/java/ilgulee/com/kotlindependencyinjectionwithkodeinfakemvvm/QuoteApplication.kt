package ilgulee.com.kotlindependencyinjectionwithkodeinfakemvvm

import android.app.Application
import ilgulee.com.kotlindependencyinjectionwithkodeinfakemvvm.data.db.QuoteDao
import ilgulee.com.kotlindependencyinjectionwithkodeinfakemvvm.data.db.QuoteDatabase
import ilgulee.com.kotlindependencyinjectionwithkodeinfakemvvm.data.db.QuoteDatabaseImpl
import ilgulee.com.kotlindependencyinjectionwithkodeinfakemvvm.data.repository.QuoteDaoRepository
import ilgulee.com.kotlindependencyinjectionwithkodeinfakemvvm.data.repository.QuoteDaoRepositoryImpl
import ilgulee.com.kotlindependencyinjectionwithkodeinfakemvvm.ui.QuotesViewModelFactory

import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider
import org.kodein.di.generic.singleton

class QuoteApplication:Application(),KodeinAware {
    override val kodein=Kodein.lazy{
        bind<QuoteDatabase>() with singleton { QuoteDatabaseImpl() }
        bind<QuoteDao>() with singleton { instance<QuoteDatabase>().quoteDao }
        bind<QuoteDaoRepository>() with singleton { QuoteDaoRepositoryImpl(instance()) }
//        bind<QuotesViewModelFactory>() with singleton { QuotesViewModelFactory(instance()) }
        bind() from provider { QuotesViewModelFactory(instance()) }
    }
}