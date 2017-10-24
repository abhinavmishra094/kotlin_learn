abstract  class CreditCard() {
    fun creditId(): String {
        return "fd4g344gds"
    }
    abstract fun newCredit()
}
class UserInfo():CreditCard(){
    fun getInfo(): String {
      return creditId()
    }

    override fun newCredit() {
        println("new card")
    }
}
fun main(args: Array<String>) {
//    var credit = CreditCard()
//    println("creditId: "+credit.creditId())
    var user = UserInfo()
    println(user.getInfo())
}