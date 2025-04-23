fun main(){
	val car1 = Car(name= "Benz", color= "Blue", model= "Benz",doors= 4 )
	//car1.name = "Benz"
	//car1.color = "White"
	//car1.model = "Mercedez"
	//car1.doors = 2
	println("Name is ${car1.name}")
	println("color is ${car1.color}")
	println("model is ${car1.model}")
	println("doors are ${car1.doors}")

car1.move()
car1.stop()
}

class Car(val name: String,val color: String,val model: String,val doors:Int  ){

fun move(){
println("the car is moving")
}

fun stop(){
println("The car has stopped")
}
}
