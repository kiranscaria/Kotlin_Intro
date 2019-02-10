class Book (val title: String, val author: String) {
    
}

var Book.pages: Int = 0
fun Book.weight(): Double = 1.5 * pages
fun Book.tornPages(torn: Int): Int = if (pages >= torn) pages -= torn else pages = 0

class Puppy() {
    fun playWithBook(book: Book) {
        book.tornPages(Random().nextInt(12))
    }
}

fun main(args: Array<String>) {
	val puppy = Puppy()
    val book = Book("Oliver Twist", "Charles Dickens", 1837, 540)
    while (book.pages > 0) {
        puppy.playWithBook(book)
        println("${book.pages} left in ${book.title}")
    }
    println("Sad puppy, no more pages left in ${book.title}.")    
}