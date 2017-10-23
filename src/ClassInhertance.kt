open class Operations() {
    fun sum(n1: Int, n2: Int): Int {
        return n1 + n2
    }

    fun div(n1: Int, n2: Int): Int {
        return n1 / n2
    }
}

class MultiOperations() : Operations() {
    fun subtract(n1: Int, n2: Int): Int {
        return n1 - n2
    }

    fun multiply(n1: Int, n2: Int): Int {
        return n1 * n2
    }
}

fun main(args: Array<String>) {
    var multiOperation = MultiOperations()
    var sum = multiOperation.sum(10, 20)
    println("sum: $sum")
    var div = multiOperation.div(12, 11)
    println("div: $div")

    var sub = multiOperation.subtract(12, 11)
    println("sub: $sub")
    var mul = multiOperation.multiply(12, 11)
    println("mul: $mul")
}