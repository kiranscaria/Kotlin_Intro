enum class Direction {
    NORTH, SOUTH, EAST, WEST, START, END
}

class Game() {
    var path = mutableListOf<Direction>(Direction.START)
    var north = { path.add(Direction.NORTH) }
    var south = { path.add(Direction.SOUTH) }
    var east = { path.add(Direction.EAST) }
    var west = { path.add(Direction.WEST) }
    var end = {
        path.add(Direction.END)
        println("Game Over: ${path}")
        path.clear()
        false
    }
    fun move(where: () -> Boolean) {
        where.invoke()
    }
    fun makeMove(command: String?) {
        when (command) {
            "e" -> move(east)
            "w" -> move(west)
            "n" -> move(north)
            "s" -> move(south)
            else -> move(end)
        }
    }
}

fun main(args: Array<String>) { 
    val game = Game()
 
    while (! game.end()) {
        print("Enter a direction: n/s/e/w:")
        game.makeMove(readLine())
    }
}