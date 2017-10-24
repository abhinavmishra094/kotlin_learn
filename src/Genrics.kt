class UserAdmin<T> (credit:T){
    init {
        println(credit)
    }
}
fun <T> display(process:T){
    println(process)
}
fun main(args: Array<String>) {
    var userAdmin = UserAdmin<String>("abhinav")
    var userAdmin2 = UserAdmin<Int>(12)
    var userAdmin3 = UserAdmin<Double>(12.5)
    display<Int>(22)
    display<String>("aac")


}