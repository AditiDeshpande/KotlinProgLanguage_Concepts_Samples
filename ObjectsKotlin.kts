// This object is singleton/single instance
// and read only right now in Java etc we do
//getInstance etc in kotlin just an object

object Global{
    //PI is property of Global object
    val PI = 3.14
}

fun localFun() {
    val localObject = object {
        val PI = 3.14159
    }
    println(localObject.PI)
}

//foll. line is giving me error PI same name is not
//allowed need to check this..
//println(localObject.PI)

println(Global.PI)

localFun()