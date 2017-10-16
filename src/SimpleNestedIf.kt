fun main(args: Array<String>) {
    println("Enter your grade")
    var grade = readLine()!!.toDouble()
    if (grade >= 90) {
       if (grade<93) {
           println("you arein 'A-' level")
       }else{
           println("you arein 'A+' level")
       }
    }


    println("grade u entered $grade")

}