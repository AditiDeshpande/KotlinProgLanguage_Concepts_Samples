enum class CompletionStatus(val value: Int) {
    WIP(-1) ,
    RESUMED(0) ,
    PARTIALLY_COMPLETE(1) ,
    COMPLETE(10)
}

val status = CompletionStatus.PARTIALLY_COMPLETE

println("Status of Activity1 is $status")
println("Status Value is $status.value")
println("Ordinal Value is ${status.ordinal}")
println("Value of status Completed is ${CompletionStatus.COMPLETE.value}")
println("Ordinal Value of status Completed is ${CompletionStatus.COMPLETE.ordinal}")
println("Name status Resumed is ${CompletionStatus.RESUMED.name}")



/*
Output
Status of Activity1 is PARTIALLY_COMPLETE
Status Value is PARTIALLY_COMPLETE.value
Ordinal Value is 2
Value of status Completed is 10
Ordinal Value of status Completed is 3
Name status Resumed is RESUMED
 */

for (statusInList in CompletionStatus.values()){
println(statusInList)
}

/*
Output
WIP
RESUMED
PARTIALLY_COMPLETE
COMPLETE
 */

println("Ordinal of status WIP is " +
        CompletionStatus.valueOf("WIP").ordinal)

/*
Output
Ordinal of status WIP is 0
 */

