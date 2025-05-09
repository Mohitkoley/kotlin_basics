fun main(){

val i1 =  normalClass("Mohit")
val i2 =  normalClass("Mohit")
val d1 = exampleDataClass("Data")
val d2 = exampleDataClass("Data")
println(i1 === i2) 

println( d1.equals(d2))
}

class normalClass(name:String){
 
 override fun hashCode(): Int{
	return 0
}

override fun toString(): String{
return super.toString()
}

}


data class exampleDataClass(var name:String){



}
