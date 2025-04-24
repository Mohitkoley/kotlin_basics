fun main(){
	val user = User("mohit")
	//val user = User("Mohit", 24)
	println("name is ${user.name} and lastName is ${user.lastName}")
}

class User(var name: String,var lastName: String, age: Int){

constructor(name: String): this(name, "lastName", 10){
println("1st constructor")
}

constructor(name: String, age: Int) : this(name, "family",age){
println("2nd constructor")
}
}
