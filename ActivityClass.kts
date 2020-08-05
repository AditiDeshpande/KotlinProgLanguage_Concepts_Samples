import java.util.*

class DailyActivity(var actId: Int, var actName: String = "", val yearOfBirth: Int){
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
}

var dailyActivity = DailyActivity(25, "Painting",1987)

dailyActivity.actStatus = "STComplete"

println("Activity Id: ${dailyActivity.actId}" +
        "\nActivity Name: ${dailyActivity.actName}" +
        "\nAge : ${dailyActivity.age}" +
        "\nActivity Status : ${dailyActivity.actStatus}")

/*
Output
Activity Id: 25
Activity Name: Painting
Age : 33
Activity Status : STComplete
 */