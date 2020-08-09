/*
To avoid NPE Null reference Exceptions Kotlin is
null safe
 */

val message = null

//foll. code is giving me error
//create extension property Nothing?.length

//println(message.length)

//Error is gone in foll. It's a string now
//non null
val message1 = "null"

println(message1.length)


//? means can hold a null value
val nullMessage: String? = null
//for length it gives me error and suggestion
//replace with safe(?.) call
//or
//add non-null asserted(!!)call

//println(nullMessage.length)

if(nullMessage != null){
    println(nullMessage.length)
}
else{
    println("Message is null")
}

/*
Kotlin interoperates with Java and there can be
value returning null from Java how to handle it
when Kotlin is actually null safe and can't add
so many if if if so the solution is as follows
 */

//This means if the value is not null then
//access it's length and print it
println(nullMessage?.length)

//Output
//null
//it actually sees null and converts it to string
//and prints null wow

