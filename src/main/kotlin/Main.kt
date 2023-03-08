fun main() {
    var car = Car("nissan","altima","grey",15)
    car.identity()
    car.carry(20)
    println( car.calculateParkingFees(20))

    var bus = Bus("typec","martz","yello",52)
//    println( bus.calculateParkingFees(15))
    println( bus.calculateParkingFees(5))
    bus.capacity
    println( bus.maxTripFare(200.50))








}
open class Motors(var make: String,var model: String,var color: String,var capacity: Int){
    fun carry(people:Int){
        val x = people - capacity
        if (people <= capacity){
            println("carrying $people passengers")
        }
        else{
            println("over capacity by $x people")
        }
    }
    fun identity(){
        println("I am a $color $make $model")
    }
    open fun calculateParkingFees(hours:Int): Int{
        var multiply = hours * 20
        return multiply

    }

}
class Car(make:String,model:String,color:String,capacity:Int):Motors(make, model, color, capacity){

}
class Bus(make: String,model: String,color: String,capacity: Int):Motors(make, model, color, capacity) {
  fun maxTripFare(fare: Double):Double{
      var trip = fare.times(capacity)
      return trip
  }

    override fun calculateParkingFees(hours: Int): Int {
        var product = hours * capacity
        return product

    }


}
