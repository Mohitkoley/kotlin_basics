fun main(){
val p1 = Person("Mohit", 24, "Koley")
println(p1.name)
println(p1.age)
println(p1.lastName)
}

class Person(name: String,age : Int ,lastName: String){
var name  = name

get() {
println("value is $field")
return field;
}

set(value){
field = value
}

var age=age
get(){
println("age is $field")
return field
}

set(value){
field = value
}


var lastName= lastName
get(){
println("lastname is $field")
return field
}


set(value){
field=value
}
}
