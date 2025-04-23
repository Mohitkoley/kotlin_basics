fun main(){
	val user = User("mohit")
	println("name is ${user.name}")
}

class User(var name: String,lastName: String, age: Int){

constructor(name: String): this(name, "lastName", 10)
}
