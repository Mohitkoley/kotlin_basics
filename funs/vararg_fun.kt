fun main(){

	val res: Int = sum(1,2,3,4,5,6)
	print("addition is $res")
}

fun sum(vararg numbers: Int):Int {
	 return numbers.sum()
}
