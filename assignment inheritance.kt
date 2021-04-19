open class Vehicle(var make: String, var model: String, var color: String, var capacity: Int){
    fun carry(people: Int){
        var x= people-capacity
        if (capacity>=people)
            println("Carrying $people passengers")
        else
            println("Over capacity by $x people")
    }
    fun identity(){
        println("I am $color $make $model")
    }
    open fun calculateParkingFees(hours:Int): Int{
        return 20*hours
    }
}

class Car(make: String,model: String,color: String,capacity: Int): Vehicle(make, model, color, capacity) {
}
class Bus(make: String, model: String,color: String, capacity: Int): Vehicle(make, model, color, capacity){

    fun maxTripFare(fare: Double):Double{
       return fare
    }

    override fun calculateParkingFees(hours: Int): Int {
        return hours*capacity
    }
}

fun main() {
    var car=Car("Subaru","legacy","white",15)
    car.carry(14)
    car.carry(20)
    car.identity()
    println(car.calculateParkingFees(4))
    var bus=Bus("toyota","cx10","yellow",50)
    bus.carry(34)
    bus.carry(66)
    bus.identity()
    println(bus.calculateParkingFees(3))
    println(bus.maxTripFare(67647000.0))
}