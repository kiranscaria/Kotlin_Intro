fun main(args: Array<String>) {
	println( whatShouldIDoToday("sad") )
}

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24): String = 
when  {
    weather.toLowerCase() == "sunny" && mood.toLowerCase() == "happy" -> "Go for a walk."
    else -> "Stay home and read."
}
