data class SpiceContainer(val spice: Spice) {
    val label: String = spice.name
}

fun main(args: Array<String>) {
    val spiceCabinet = listOf(
    	SpiceContainer(Curry("Yellow Curry", "mild")),
    	SpiceContainer(Curry("Red Curry", "moderate")),
        SpiceContainer(Curry("Green Curry", "hot"))
    )
    
    for (element in spiceCabinet) println(element.label)
}