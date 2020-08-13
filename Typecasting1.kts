/*
Foll. prog is giving error for input variable
smart cast to String is impossible because input is
mutable property that could have been changed by this
time
Cast expression input to String
 */


var input: Any = 10

/*if(input is String){

    input.length
}*/

//val str = input as String

//println(str.length)

/*
Output of above code is
Exception in thread "main" java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
	at org.jetbrains.kotlin.idea.scratch.generated.ScratchFileRunnerGenerated$ScratchFileRunnerGenerated.<init>(tmp.kt:9)
	at org.jetbrains.kotlin.idea.scratch.generated.ScratchFileRunnerGenerated.main(tmp.kt:15)

	As there is no implicit type conversions in Kotlin
	solution is as follows
 */

/*
adding ? after as saying I am trying to do safe
casting but now it's mandatory to add ? in println too
as it is used only for nullable
 */
val str1 = input as? String

println(str1?.length)

/*
Output is printed null
 */
