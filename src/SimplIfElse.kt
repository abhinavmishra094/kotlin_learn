fun main(args: Array<String>) {
    println("Enter your grade")
    var grade = readLine()!!.toDouble()
    if (grade >= 90) {
        grade +=3
        println("you arein 'a' level")
    }else{
        println("you r not 'a' level")
    }


    println("grade u entered $grade")

}