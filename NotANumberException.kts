class NotANumberException(message: String): Throwable(message){
}

//throw NotANumberException()

/*
Output on Online Kotlin Compiler

Exception in thread "main" NotANumberException
 */

fun checkIsNumber(obj: Any){
    when(obj) {
        !is Int, Float, Double, Long ->
            throw NotANumberException("It was not a number!!")
    }
}

checkIsNumber("a")


/*
Output on Online Kotlin Compiler

Exception in thread "main" NotANumberException

 */

/*
We can have catch with try or finally or both
 */
try{
    checkIsNumber("A")
}catch (e: NotANumberException){
   // println("It was not a number!")
    println("${e.message}")
}

/*
Output on Online Kotlin Compiler

It was not a number! this o/p is for first commented
println stmt

Output for second println with message passing changes
and passing message to Throwable is as follows in scratch
file
Exception in thread "main" org.jetbrains.kotlin.idea.scratch.generated.ScratchFileRunnerGenerated$ScratchFileRunnerGenerated$NotANumberException: It was not a number!!

output On online Kotlin compiler is as follows

It was not a number!!
 */
