class Spice (val name: String, val spiciness: String = "mild")  {
    init {
        println("Spice: $name -> Spiciness: $spiciness")
    }
    private val heat: Int
    	get() = when (spiciness) {
            "mild" -> 1
            "moderate" -> 3
            "hot" -> 5
            "very hot" -> 7
            "extremely hot" -> 10
            else -> 0
        }
}

fun makeSalt() = Spice(name = "salt", spiciness = "mild")

fun main(args: Array<String>) {
	val spices = listOf(
        makeSalt(),
    	Spice(name = "pepper", spiciness = "very hot"),
        Spice(name = "chilly", spiciness = "extremely hot"),
        Spice(name = "cardamom", spiciness = "mild"),
        Spice(name = "clove", spiciness = "moderate")
    )
    
    val spice = Spice("cayenne", spiciness = "hot")
    
    val spicy = spices.filter{ it.heat > 10 }
    val lessSpicy = spices - spicy
    
    println("$lessSpicy")
}
    