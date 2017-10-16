fun main(args: Array<String>) {
    println("Enter your grade")
    var grade = readLine()!!.toDouble()
    if (grade >= 90) {
        grade +=3
        println("you arein 'a' level")
    }
    if (grade>=50 && grade<=70)
    {
        grade += 10
        println("u get extra 10 pt")
    }

    println("grade u entered $grade")

}