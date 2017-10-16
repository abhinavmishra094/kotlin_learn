fun sum(x: Double, y: Double): Double {
    var sum = x+y
    return  sum
}

fun display(n:Int):Unit
{
println(n)
}


fun main(args: Array<String>) {

    var sum = sum(10.0,12.0)
    println(sum)

    sum = sum(5.0,82.0)
    println(sum)

    sum = sum(109.0,212.0)
    println(sum)

    display(78)
    
}