fun main(args: Array<String>) {
    
    val allBooks = mutableListOf("King Lear", "Hamlet", "Antony and Cleopatra", "Julius Ceasar")
    val library = mapOf("William Shakespeare" to allBooks)
    
    println(library.any { it.value.contains("Hamlet") })
    
    val moreBooks = mutableMapOf<String, String>("Shakuntala" to "Kalidasan")
    
    moreBooks.getOrPut("Jungle Book"){ "Rudyard Kipling" }
    moreBooks.getOrPut("The Dialogue"){ "Galileo Galilei" }
    
    println(moreBooks)
}