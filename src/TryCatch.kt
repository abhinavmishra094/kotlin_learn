fun main(args: Array<String>) {
    try {
        println("Enter a number")
        var n2: Int = readLine()!!.toInt()
        var div = 100 / n2

        println("Div: $div")
    }catch (ex:Exception){
        println(ex.message)
    }
    println("app is done")
}