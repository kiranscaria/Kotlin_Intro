open class Book(val title: String, val author: String) {
    private var currentPage: Int = 1
    
    open fun readPage() {
        currentPage++
    }
}

class eBook(title: String, author: String, val format: String = "text"): Book(title, author) {
    private var wordCount: Int = 0
    override fun readPage() {
        wordCount += 250
    }
}

fun main(args: Array<String>) {
    println("Checking Inheritance")
}