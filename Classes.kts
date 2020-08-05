class DailyActivity2{
    //Foll. are not fields but properties
    var actId = 0
    var actName: String = ""

    //Foll. is immutable property
    //Duration/timer for activity everyday
    //1 hour everyday and it's immutable
    val timer = 01.00
}

//instance of class
//note no "new" keyword in kotlin
val activity = DailyActivity2()

activity.actId = 11
activity.actName = "Singing"


//Different ways to initialize the params
//specially not before passing from main
//or not before class's object creation

class DailyActivity1(initId: Int , initName: String){
    //Foll lines giving error property must
    //be initialized or abstract

    /*var actId1: Int
    var actName: String*/

    var actId = initId
    var actName = initName
    val timer = 01.00
}

//no need to have body / curly braces too for
//foll. type of class declaration
class DailyActivity(var actId: Int , var actName: String = ""){
    init {
        actName = actName.toUpperCase()
    }
    //It's important to this secondary constructor
    //to call base constructor
    //constructor will be more useful and explained
    //more in the topic of inheritance
    constructor(actDesc: String): this(0, ""){
        //This block of constructor is equivalent to
        //init block
    }
}

var dailyActivity = DailyActivity(25 , "Painting")

println("Activity Id: ${dailyActivity.actId}" +
        "\nActivity Name: ${dailyActivity.actName}")