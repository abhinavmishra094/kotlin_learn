fun main(args: Array<String>) {
    var map = hashMapOf(1 to "aws",2 to "yui")
    map.put(3,"kup")
    println(map.get(3))
    println(map[3])
    var ar = arrayOf(1,5.6,80,88)
    println(ar[0])

    var l = listOf(11,22,33,44)
    var lm = mutableListOf(11,22,33,44)
    lm[0]= 78
    for (i in l){
        println(i)
    }
    for (il in lm){
        println(il)
    }
}