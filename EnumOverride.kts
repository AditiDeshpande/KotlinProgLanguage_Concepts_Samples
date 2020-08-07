enum class CompletionStatus(val value: Int) {
    WIP(-1){
        override fun text(): String {
            return "Status WIP: Activity's Work In Progress"
        }

        override fun toString(): String {
            return "Status WIP: Activity's Work In Progress"
        }
    } ,
    RESUMED(0) {
        override fun text(): String {
            return "Status RESUMED: Activity Resumed"
        }
    },
    PARTIALLY_COMPLETE(1) {
        override fun text(): String {
            return "Status PARTIALLY_COMPLETE: Activity is Partially Complete"
        }
    },
    COMPLETE(10) {
        override fun text(): String {
            return "Status COMPLETE: Activity Completed"
        }
    };

    abstract fun text(): String
}

val status = CompletionStatus.WIP

println("Status: "+status)
println("Ordinal: "+status.ordinal)
println("Name: "+status.name)
println("Value: "+status.value)
println("Status: "+status.text())

/*
Output
Status: Status WIP: Activity's Work In Progress
Ordinal: 0
Name: WIP
Value: -1
Status: Status WIP: Activity's Work In Progress
 */