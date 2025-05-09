fun main(){
val user = User()
with(user){
firstName = "Mohit"
lastName = "Koley"
}
println(user)
}

class App : First by ImplOne(), Second by ImplTwo(){
override fun print1(){ 
println("from print1")
}

override fun print2(){}
println("from print 2")
}

interface First{
	fun print1()
}

interface Second{

fun print2()
}


open class ImplOne: First{

override fun print1(){

}
}

open class ImplTwo: Second{

override fun print2(){

}
}

class User{
var firstName by FormateDelegate()
var lastName by FormateDelegate()
}


class FormatDelegate : ReadWriteProperty<Any?, String>{
private var formattedString: String = ""


override fun getValue(
thisRef: Any?, 
property: KProperty<*>
):String{
return formatedString
}

override fun setValue(
thisRef : Any? 
property: KProperty<*>,
value: String
){
 formattedString = value.lowercase()
}

}
