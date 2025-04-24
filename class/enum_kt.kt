fun main(){

for(value in Direction.values()){
when(value){
Direction.SOUTH -> println("South direction")
else -> println("other direction")
}

}

}

enum class Direction(var direction: String){
SOUTH(direction= "south"),
NORTH("north"),
EAST("east"),
WEST("west"),
}

