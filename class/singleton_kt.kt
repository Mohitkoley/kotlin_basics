fun main(){
val user1 = User.getInstance()
val user2 = User.getInstance()
println(user2)
println(user1)
}

class User private constructor(){
	init{
	println("Initialized");
}
	
	companion object{
	private var instance: User? = null

 	fun getInstance(): User? { 
	if(instance == null){
	instance = User()
}
return instance
}
}
}

