//package com.aditi.kotlinlangcourse
//Above line will create 3 folders com aditi kotlinlangcourse
//and create the scratch file in the folder kotlinlangcourse

val message = "Hello from IDEA!"
println(message)

//var is not dynamic variable it's Mutable means u
//can't assign any other type value to var if it's
//declared Int it shd take only Int value
var streetNumber: Int = 30
var streetName: String = "Tilak Road"
var streetName1 = "Bajirao Road"

//Foll. line will give error type mismatch
//Int String
//streetNumber = "Aditi"

//val is Immutable
val zip = "Pune 411030"
//Foll line is giving me error that val can't be
//reassigned
//zip = "Pune 411090"

val myLong = 10
//In above assignment it will have confusion whether
//myLong is Integer or Long so the convention is to
//add L F at the end
val myLong1 = 10L
val myFloat = 100F
val myHex = 0x0F
val myBinary = 0xb01

val myInt = 100
//Foll line won't have prob as it considers myLongAgain
//as Int coz it's not initialized
val myLongAgain = myInt
//Foll line will give error as here we r mentioning
//type as Long as there is no implicit type
//conversion in kotlin
//val myLong1 : Long = myInt

//We need explicit conversion like foll in Kotlin
val myLong1 : Long = myInt.toLong()

//String
val myChar = 'A'
val myString = "Aditi"
val escapeChars = "A new line \n"
val rawString = "Working on Kotlin prog" +
        "need a rest :P " +
        "will continue next chapter tomorrow"
//New feature
val mutilpleString = """
There r only 2 ways to live life.
One is as though nothing is a miracle.
The other is as though everything is a miracle.
-Einstein
"""

println(rawString)
println(mutilpleString)

/*
Output of Strings
Working on Kotlin progneed a rest :P will continue next chapter tomorrow

There r only 2 ways to live life.
One is as though nothing is a miracle.
The other is as though everything is a miracle.
-Einstein
 */

//String Interpolation

val years = 12
val message1 = "एक तप म्हणजे $years वर्षं "

println(message1)

val book = "Little Women"
val bookNameLengthMsg = "Length of book ( $book ) name is " +
        "${book.length}"
println(bookNameLengthMsg)
