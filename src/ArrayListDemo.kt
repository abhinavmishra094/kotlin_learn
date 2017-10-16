fun main(args: Array<String>) {
    var arrayList = ArrayList<String>()
    arrayList.add("abc")
    arrayList.add("hi")
    arrayList.add("hello")
    arrayList.add("bye")
    arrayList.add("greetings")
    arrayList.add("how")

    println("firstName: "+arrayList.get(0))
    arrayList.set(0,"bcd")
    for (item in arrayList){
        println(item)
    }
    
    for (i in 0..arrayList.size-1){
        println(arrayList.get(i))
    }
    if (arrayList.contains("bcd")){
        println("name is found")
    }else{
        println("name is not found")
    }

}