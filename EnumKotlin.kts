enum class CompletionStatus{
    WIP ,
    RESUMED ,
    PARTIALLY_COMPLETE ,
    COMPLETE
}

val status = CompletionStatus.PARTIALLY_COMPLETE

println("Status of Activity1 is $status")