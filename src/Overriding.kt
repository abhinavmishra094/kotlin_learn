open class Operations1() {
    public var ProcessName:String?=null
    open fun sum(n1: Int, n2: Int): Int {
        return n1 + n2
    }

    fun div(n1: Int, n2: Int): Int {
        return n1 / n2
    }
}

class MultiOperations1 : Operations1 {
    constructor():super(){

    }
    override fun sum(n1: Int, n2: Int): Int {
        super.sum(n1, n2)
        return n1 + n2*3
    }
    fun subtract(n1: Int, n2: Int): Int {
        return n1 - n2
    }

    fun multiply(n1: Int, n2: Int): Int {
        return n1 * n2
    }
}

fun main(args: Array<String>) {
    var multiOperation = MultiOperations1()
    println("multiOperation.ProcessName: "+multiOperation.ProcessName)
    var sum = multiOperation.sum(10, 20)
    println("sum: $sum")
    var div = multiOperation.div(12, 11)
    println("div: $div")

    var sub = multiOperation.subtract(12, 11)
    println("sub: $sub")
    var mul = multiOperation.multiply(12, 11)
    println("mul: $mul")

    var op2 = MultiOperations1() as Operations1
    println("sum op2: "+ op2.sum(10,15))
    println("sum op2: "+ op2.div(50,10))


}