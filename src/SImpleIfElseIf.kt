fun main(args: Array<String>) {
    println("Enter your grade")
    var grade = readLine()!!.toDouble()
    if (grade >= 90) {
        grade +=3
        println("you arein 'a' level")
    }else if (grade>=80 && grade< 90){
        println("you r not 'b' level")
    }else if (grade>=70 && grade< 80){
        println("you r not 'c' level")
    }else {
        println("you failed")
    }


    println("grade u entered $grade")

}