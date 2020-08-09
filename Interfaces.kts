
/*
Previous to Java8 Interfaces should not be having
default methods with body but from Java8 Interfaces
can have their own implementations of methods
so same is the case with Kotlin then what's the diff
between Interface and Abstract class
1. We can't maintain a state in interface , need
to check with example what does it mean u can have
abstract property but u can't maintain state
2. Multiple inheritance not allowed but one class
extending another class and also implementing
an interface is allowed
 */

interface WorksheetRepository{
    //Foll line means isEmpty is always true
    //and u need to use get u can't assign value to
    //isEmpty directly like
    //val isEmpty: Boolean = true

    val isEmpty: Boolean
        get() = true


    fun store(obj: Languages){
        //Implement code to store Languages Object
        //so here we can have implementation for
        //a method in Interface
    }
    fun getById(id: Int):Languages
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

interface Interface1{
    fun funA(){
        println("FunA from interface1")
    }
}

interface Interface2{
    fun funA(){
        println("FunA from interface2")
    }
}

class Class1And2: Interface1 , Interface2{
    override fun funA() {
        super<Interface2>.funA()
        //println("Class1And2 own funA")
    }
}

val c: Class1And2 = Class1And2()
c.funA()