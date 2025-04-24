fun main(){
	
val car = Car(
4, "Audi")
val bike = Bike(2, "KTM")
car.type()
bike.type()
}



open class Vehicle(var tireNumber:Int){ 

fun type(){
println(" tyres are $tireNumber")
}

}

class Car( tireNumber: Int, var name: String): Vehicle(tireNumber){

}

class Bike(tireNumber: Int, var name: String): Vehicle(tireNumber ){


}

