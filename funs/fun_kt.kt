fun main(){
	greet("Mohit")
	greet("Monu", 5)
}

fun greet(name: String,age: Int? = 20){
	println("name is $name and age is $age")
}
