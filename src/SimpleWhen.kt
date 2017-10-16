fun main(args: Array<String>) {
    var x = 25
    when (x) {
        1, 2 -> {
            println("value is 1 or 2")
        }
        in 10..30 -> {
            println("value is between 10 and 30\"")
        }
        !in 10..30 -> {
            println("value is not between 10 and 30")
        }
        3 -> {
            println("value is 3")
        }
        4 -> println("value is 4")
        else -> println("value out of range")

    }

}