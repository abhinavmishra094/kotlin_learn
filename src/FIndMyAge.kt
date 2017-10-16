import java.util.*

fun main(args: Array<String>) {
    println("enter your dob")
    var DOB:Int = readLine()!!.toInt()
    var year = Calendar.getInstance().get(Calendar.YEAR)
    var age = year-DOB

    println("your age is $age years")
}