const val MAX_BOOKS = 3

class Book (val booksBorrowed: Int = 0, val title: String) {
    fun canBorrow() = if (booksBorrowed < MAX_BOOKS) true else false   
    fun printUrl(): String = Constants.BASE_URL + title + ".html"
    
    companion object {
        const val BASE_URL= "http://12.345.333.123/library/"
    }
}

object Constants{
    const val BASE_URL = "http://12.345.333.123/library/"
}

fun main(args: Array<String>) {
    
    const val MAX_BOOKS = 3
    
}