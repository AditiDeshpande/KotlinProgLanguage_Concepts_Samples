/*
Type casting in Kotlin
 */

var nullMessage: String? = null
nullMessage = "Some String"

//Gives suggestion ? is unnecessary
//unnecessary safe call
//check in actual kotlin .kt file or online compiler
//this is also smart casting as it is seeing nullMessage
//is declared can be null but actually has a string value
//assigned to it later so it's saying ? is unnecessary
//now
println(nullMessage?.length)

open class Person{

}

class Employee: Person(){
fun vacationDays(days: Int){
    if(days < 60){
        println("You need more vacation")
    }
}
}
class Contractor: Person(){

}
fun hasVacations(obj: Person){
    if(obj is Employee){
        //once u write obj. u will get completion
        //IDE is suggesting vacationDays method
        //this is called smart casting coz obj is not
        //declared as type Employee
        obj.vacationDays(20)
    }
}

