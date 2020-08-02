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