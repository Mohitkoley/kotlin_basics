fun main(){
var list1 = mutableListOf<String>("Name","Name 2","name 3")
var listSet = setOf("Mohit", "Rohit", "Sonu")
var listMap = mapOf<Int, String>(1 to "doc",2 to "croc")
list1.add("Mohit")

list1.removeAt(0)

list1.forEach({
println(it)
})


listSet.forEach({ 
println(it)
})


listMap.forEach{
i, v -> println("$i and $v")
}
}



