import java.util.*

data class DailyActivity(var actId: Int, var actName: String = "", val yearOfBirth: Int){
    val age: Int
        get() = Calendar.getInstance().get(
                Calendar.YEAR) - yearOfBirth

    var actStatus: String = ""
        //if there is setter there shd be getter
        //otherwise it is going to print blank
        //string / nothing
        set(value) {
            if(!value.startsWith("ST")){
                throw IllegalArgumentException("Status" +
                    " should start with ST")
            }
                field = value
        }

    fun activityAsString(): String{
        return "Activity Id: $actId - " +
                "Activity Name: $actName - " +
                "Activity Status: $actStatus"
    }
}

var dailyActivity = DailyActivity(25, "Painting",1987)

dailyActivity.actStatus = "STComplete"

println("Activity Id: ${dailyActivity.actId}" +
        "\nActivity Name: ${dailyActivity.actName}" +
        "\nAge : ${dailyActivity.age}" +
        "\nActivity Status : ${dailyActivity.actStatus}")

println(dailyActivity.activityAsString())


/*
Output
Activity Id: 25
Activity Name: Painting
Age : 33
Activity Status : STComplete

activityAsString Output
Activity Id: 25 - Activity Name: Painting - Activity Status: STComplete

 */

/*
Object creation using deconstructing values
It's giving error to create member function in
scratch file
Giving error on online compiler too
Destructuring declaration initializer of type DailyActivity must have a 'component1()' function
Destructuring declaration initializer of type DailyActivity must have a 'component2()' function
Destructuring declaration initializer of type DailyActivity must have a 'component3()' function

Solution is we need to declare class as data class
 */

val (actId , actName , yearOfBirth) =
        DailyActivity(12 , "Cooking" , 1999)

/*println(actId)
println(actName)
println(yearOfBirth)
*/
/*
And now unresolved reference as checking it on scratch
file
 */
/*
Output from online compiler is as follows
12
Cooking
1999
 */

