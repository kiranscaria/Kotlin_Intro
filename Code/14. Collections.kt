fun main(args: Array<String>) {
    val symptoms: MutableList<String> = mutableListOf("white spots", "red spots", "not eating", "bloated", "belly up")
    
    symptoms.add("white fungus")
    symptoms.remove(element: "white fungus")
    
    symptoms.contains("red") // false
    symptoms.contains("red spots") // true
    
    println(symptoms.subList(4, symptons.size))  // [belly up]
    
    listOf(1, 5, 3).sum()  // 9
    listOf("a", "b", "cc").sumBy { it.length }  // 4
}