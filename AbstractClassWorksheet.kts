/*
Abstract class : Class on which we can't create
an instance
 */

abstract class Worksheet{

    val languageList = "\nMarathi\nHindi\nGerman\nEnglish"

    fun getListOfLanguages(): String{

        return languageList
    }
    abstract fun numberOfWorksheets()
}

class Languages: Worksheet(){
    override fun numberOfWorksheets() {
       println("Number of worksheets are 100")
    }
}

val languages = Languages()
languages.numberOfWorksheets()
languages.getListOfLanguages()

