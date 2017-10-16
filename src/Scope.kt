var fullname= "abhinav mishra"
fun display(x: Any): Unit {
    println("display :$fullname")
}

fun main(args: Array<String>) {
    println("main :$fullname")
    display("abc")

}