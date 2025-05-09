fun main(){
val car = Car("Audi",4)
car.move()
car.stop()
}

abstract class Vehicle{

abstract fun move()

abstract fun stop()

}


class Car(name: String, tireNumber : Int): Vehicle(){

override fun move(){
println("Car is moving")
}

override fun stop(){
println("Car has stopped")
}
}
