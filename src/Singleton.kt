class Singleton{
    var name:String?=null
    private constructor(){
        println("instance created")
    }
    companion object {
        val instance:Singleton by lazy { Singleton() }
    }
}

fun main(args: Array<String>) {
    var sin1 = Singleton.instance
    sin1.name = "abhinav"
    println("name: ${sin1.name}")

    var sin2 = Singleton.instance
    println("nae: ${sin2.name}")

    var sin3 = Singleton.instance
    println("nae: ${sin3.name}")


}