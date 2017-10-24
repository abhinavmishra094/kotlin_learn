enum class Direction {
    NORTH, SOUTH, EAST, WEST
}


fun main(args: Array<String>) {
    var userDirection = Direction.SOUTH

    if (userDirection == Direction.NORTH) {
        println("he went to north")
    } else {
        println("i dont know")
    }
}