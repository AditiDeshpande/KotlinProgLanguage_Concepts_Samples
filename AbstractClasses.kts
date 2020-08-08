/*
Abstract class : Class on which we can't create
an instance
 */

abstract class Worksheet{
    val numberOfSheetsMarathi = 20
    val numberOfSheetsGerman = 15


    fun getNumberOfSheets(languageCode: String): Int{
        var numberofSheets = 0
        when(languageCode){
            "Marathi" -> numberofSheets = numberOfSheetsMarathi
            "German" -> numberofSheets = numberOfSheetsGerman
        }
        return numberofSheets;
    }
abstract fun Chapter()
}

class MarathiLang: Worksheet(){
    override fun Chapter() {
        println("अक्षर ओळख")
    }


}

class GermanLang: Worksheet(){
    override fun Chapter() {
        println("Die Buchstaben")
    }

}

//Can't create instance of abstract class
//val worksheet = Worksheet()

val marathi = MarathiLang()
println("Number of sheets for Marathi Language: "+marathi.getNumberOfSheets("Marathi"))

val german = GermanLang()
println("Number of sheets for German Language: "+german.getNumberOfSheets("German"))

println(marathi.numberOfSheetsMarathi)
println(german.numberOfSheetsGerman)