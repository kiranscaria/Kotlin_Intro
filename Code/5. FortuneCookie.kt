fun main(args: Array<String>) {
   val hai = getFortune()
   println("\nYour fortune is: ${hai}")
}

fun getFortune() : String {
   val fortunes = listOf( "You will have a great day!",
      "Things will go well for you today.",
      "Enjoy a wonderful day of success.",
      "Be humble and all will turn out well.",
      "Today is a good day for exercising restraint.",
      "Take it easy and enjoy life!",
      "Treasure your friends, because they are your greatest fortune.")
   print("\nEnter your birthday:")
   var birthday = readLine()?.toIntOrNull() ?: 1
   return fortunes[birthday.rem(fortunes.size)]
}
