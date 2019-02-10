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
}

fun main(args: Array<String>) { 
    val game = Game()
    println(game.path)
    game.north()
    game.east()
    game.south()
    game.west()
    game.end()
    println(game.path)
}