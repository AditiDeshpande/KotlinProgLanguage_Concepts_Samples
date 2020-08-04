fun printStrings(vararg strings: String){

    //giving this -> error for foll. line type mismatch
    // string and array of strings
    //reallyPrintingStrings(strings)

    //adding * to remove error
    //Check why the *
    reallyPrintingStrings(*strings)
}

printStrings("Objective","Projects","Educational Qualification",
"Hobbies","Personal Details")

//fun reallyPrintingStrings(strings: Array<out String>) {

fun reallyPrintingStrings(vararg strings: String) {
    for (string in strings) {
        println(string)
    }
}