class Car() {
    var Owner1: String? = null
    var Price: Double? = null
    var MilesDrive: Int? = null
    var Type: String? = null
    var Model: Int? = null
    constructor(Type: String, Model: Int, Price: Double, MilesDrive: Int, Owner1: String) : this() {
        println("Type: $Type")
        println("Model: $Model")
        println("Price: $Price")
        println("MilesDrive: $MilesDrive")
        println("Owner: $Owner1")
        this.Owner1 = Owner1
        this.Price = Price
        this.MilesDrive = MilesDrive
        this.Type = Type
        this.Model = Model
    }
    constructor(Name:String):this(){
        println("new  class")
    }
    fun GetOwner(): String? {
        return this.Owner1;

    }

    fun GetPrice(): Double? {
        return this.Price!! - this.MilesDrive!!.toDouble() * 10;
    }
}

fun main(args: Array<String>) {
    var huCar = Car("BMW", 2015, 10000.0, 105, "abhinav")
    println("price: " + huCar.GetOwner())
    println("price: " + huCar.GetPrice())
    var jeCar = Car("BMW", 2017, 10000.0, 15, "abc")
    println("price: " + jeCar.GetOwner())
    println("price: " + jeCar.GetPrice())
    Car("abc")
}