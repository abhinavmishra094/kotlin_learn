interface op{
    fun sum(n1: Int, n2: Int);
    fun div(n1: Int,n2: Int);
}


class UserOp:op{
    override fun sum(n1: Int, n2: Int) {
      println("sum: "+n1+n2)
    }

    override fun div(n1: Int, n2: Int) {
        println("div: "+n1/n2)

    }

}

class Admin:op{
    override fun sum(n1: Int, n2: Int) {
        println("sum: "+n1+n2-2)
    }

    override fun div(n1: Int, n2: Int) {
        println("div: "+n1/n2-2)

    }

}