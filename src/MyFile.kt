import java.io.FileReader
import java.io.FileWriter


fun main(args: Array<String>) {
    println("1- read \n2- write \n")
    val op = readLine()!!.toInt()
    when(op){
        1->{
            readFromFile()
        }
        2->{
            println("text to write")
            var str: String = readLine()!!
            writeToFile(str)
        }
    }

}

fun writeToFile(str: String) {

    try {
        val fo = FileWriter("test.txt",true)
        fo.write(str+"\n")
        fo.close()
        println("data is saved")
    }catch (ex:Exception){
        println(ex.message)
    }
}

fun readFromFile() {
    try {
        val fin = FileReader("test.txt")
        var c:Int?
        do{
           c= fin.read()
            print(c.toChar())

        }while (c!=-1)
    }catch (ex:Exception){
        println(ex.message)
    }
}