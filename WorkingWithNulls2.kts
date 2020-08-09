/*
Another null safe operator used is
!! : non null asserted call
 */

val message: String = "Msg"

val nullMsg: String? = null

println(nullMsg!!.length)

/*
Output
Exception in thread "main"
kotlin.KotlinNullPointerException

So compiler won't complain but we will be getting
NPE but we want that.. there r some examples maybe
in future we will see... :)
 */