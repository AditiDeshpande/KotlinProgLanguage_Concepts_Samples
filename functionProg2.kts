/*
Kotlin Object oriented as well as functional
programming lang.
 */

fun hello() {
    println("Hello")
}

fun throwingExceptions(): Nothing {
    throw Exception("This function throws an exception")
}

hello()

//throwingExceptions()
//Above method is not giving any output
//Need to check issue

/*
Can eliminate the return type in following
function
 */
fun returnsFour(): Int {
    return 4
}

val value = returnsFour()

println("returnsFour() is returning " + value)

fun takingString(name: String){
    println("Your String is : " + name)
}

takingString("Aditi")

fun sum(int1: Int , int2: Int): Int {
    return int1 + int2
}

println("Sum of 9 and 10 " +
"is " + sum(9,10))

//we can eliminate the body of the function like
//follows

//fun sub(int1: Int , int2:Int): Int = int1 - int2

//we can eliminate the return type too as we r
//passing 2 Ints it is going to return Int only

fun sub(int1: Int , int2:Int) = int1 - int2

println("Subtraction of 9 and 10 " +
        "is " +sub(9,10))

fun multiply(a: Int , b: Int , c: Int=2)
= a * b * c

//All these println are / should be in main
//when u write kotlin file instead of scratch
//file
println("Multiplication of 3 , 4 ,5 is " +
         multiply(3,4,5))

println("Multiplication of 3 , 4 is " +
        multiply(3,4))


fun printDetails(name: String , email: String = "" ,
phone: String){
    println("Name: $name - email: $email" +
            "- phone: $phone")
}
//Foll. is giving me error no value passed for phone
//so second value is taken for email
//but as there is assigned "" default value for email
//we wanted to pass second parameter as phone
//but compiler didn't understand it that we wanted
//to pass specific parameter let's see how we can
//do it

//printDetails("Aditi" , "95669-34556")

//Foll won't give an error
printDetails("Aditi" , phone = "9566 3455")

printDetails(email = "aditid11" , phone = "123 456" ,
name = "Aditi")