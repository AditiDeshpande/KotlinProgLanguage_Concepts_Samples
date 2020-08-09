/*
Check the 2 interfaces WorksheetRepository ,
BooksRepository they r same , functions are same
except for the types they are returning.
Languages and Books respectively. So to not repeat
code we use generics chk the file
GenericClassInterface for the solution
In Repository u generally just need to read values
one shouldn't do store and getById etc.
 */


interface WorksheetRepository{
    val isEmpty: Boolean
        get() = true

    fun store(obj: Languages){
    }
    fun getById(id: Int):Languages
}
interface BooksRepository{
    fun store(obj: Books){
}
    fun getById(id: Int): Books
}

class Books{

}


class SQLWorksheetRepository(): WorksheetRepository{
    override fun getById(id: Int): Languages {
        return Languages()
    }

    override fun store(obj: Languages) {
        super.store(obj)
    }

    override val isEmpty: Boolean
        get() = false
}





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

