class Book (val title: String, val author: String, val year: Int) {
    fun getTitleAuthor(): Pair<String, String> = (title to author)
    fun getTitleAuthorYear() = Triple(title, author, year)
}

fun main(args: Array<String>) {
    val (book, author, year) = Book("My Experiments with Truth", "Mohandas Karamchand Gandhi", 1948).getTitleAuthorYear()
    println("Here is your book $book written in $author in $year.")
}