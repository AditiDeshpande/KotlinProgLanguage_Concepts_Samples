var myString = "Not Empty!"
var myString1 = "nope"
val result = if (myString.startsWith("N")) {
    println("Starts with N")
}else if (myString != ""){
    println("Not Empty")
}else {
    println("Empty")
}
println(result)

/*
Output
Starts with N
var myString: String
val result: Unit
kotlin.Unit
*/
/*
value of result is printed as kotlin.Unit that means
void
*/

val result1 = if (myString1.startsWith("N")) {
    "Starts with N"
    //100
    //can write 100 here it will print 100
    //reuslt1 can be caste to Int and also to
    //String in foll. else if that's possible
}
else if (myString1.equals("value")){
    "value"
}else if (myString1 != ""){
    "Not Empty"
}else {
    //Empty String so returning 0
    0
}
println(result1)

/*
Output of result1 is
Starts with N
now if startswith "N"
if I change it to "n" it is giving following
output
Not Empty
assignment operator assigns last value mentioned
inside condition so it is println stmt in first
code and direct statements written in double quotes
"Not Empty" etc so those r getting assigned to
result1 here.
if we use val result1 and assign value to it
by if stmt and expression inside else block is
a must
 */

when (result1){
    "value" -> println("It's a value")
    is String -> println("Excellent!")
    is Int -> println("It's " + result1)

}
/*
Output
It's a value

if var myString1 = ""
Output will be
It's 0

if var myString1 = "Nope"
Output will be
Excellent!
as it starts with N and the String will get
assigned to result1
 */