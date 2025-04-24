fun main(){

result(Status.Sucess("yeah"))
result(Status.Error("oh no"))

}


fun result(res : Status){
when(res){
is Status.Sucess -> println("wohoo sucess")
is Status.Error -> println("Error")
}
}

sealed class Status(val msg:String){

class Sucess(msg:String): Status(msg)
class Error(msg:String): Status(msg)

}
