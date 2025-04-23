fun main(){
val bigNumber : Int = getMax(10, 20)
print(bigNumber)
}


fun getMax(a: Int, b: Int) = if (a > b) a else b
