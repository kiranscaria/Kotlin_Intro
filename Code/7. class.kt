class SimpleSpice() {
    val nameOfSpice: String = "curry"
    val levelOfSpiciness: String = "mild"
    val heat: Int
    	get() = when (levelOfSpiciness) {
            "mild" -> 5
            "hot" -> 10
            else -> 0
        }
}

fun main(args: Array<String>) {
    println("Hello, world!")

	val x = SimpleSpice()
    println("Name of Spice: ${x.nameOfSpice}, Heat: ${x.heat}")
}