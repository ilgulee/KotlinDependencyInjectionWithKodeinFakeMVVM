package ilgulee.com.kotlindependencyinjectionwithkodeinfakemvvm.data.model

data class Quote(val quoteText: String,
                 val author: String) {

    override fun toString(): String = "$quoteText - $author"

}