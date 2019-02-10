fun main(args: Array<String>) {
    val cures: Map<String, String> = mapOf("white spots" to "ich", "red sores" to "hole disease")
    
    println(cures.get("white spots"))
    println(cures["white spots"])
    
    println(cures.getOrDefault(key = "red sores", defaultValue = "Sorry, I don't know"))
    println(cures.getOrElse(key="bloating") { "No cure for this" })
    
    val inventory = mutableMapOf("fishnet" to 1)
    inventory.put("tank scrubber", 3)
    inventory.remove("fish net")
}