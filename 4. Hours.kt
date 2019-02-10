fun main(args: Array<String>) {
    if (args[0].toInt() < 12) 
    	println("Good morning, Kotlin!") 
    else if (args[0].toInt() < 24)
    	println("Good night, Kotlin!")
    else 
    	println("Hours should be between ${0} and ${24}")
}