fun main(){ 

val user = User("mohit")
val user2 by lazy{
User("rohit")
}
}

class User(var firstname: String){

init{
println("initialized $firstname")
}

}
