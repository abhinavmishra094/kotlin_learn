fun main(args: Array<String>) {
    var arrayInt = Array<Int>(5){0}
    arrayInt[3] = 55
    println("Array[3]: "+arrayInt[3])
    println("all array elements")
    for (elment in arrayInt){
        println(elment)
    }
    for (i in 0..4){
        println(arrayInt[i])
    }
    var str = Array<String>(4){""}
    for (id in 0..3){
        println("arryStr{$id]")
        str[id] = readLine()!!
    }
    for (id in 0..3){
        println("arryStr[$id] = "+ str[id])

    }

}