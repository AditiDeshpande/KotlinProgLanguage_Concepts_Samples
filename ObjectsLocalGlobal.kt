/*
Wrote and run this code on kotlin's online compiler
 */

object Global{
    //PI is property of Global object
    val PI = 3.14
}

fun main() {
    val localObject = object {
        val PI = 3.14159
    }
    println(localObject.PI)

    println(Global.PI)

}

/*
Output
3.14159
3.14
 */