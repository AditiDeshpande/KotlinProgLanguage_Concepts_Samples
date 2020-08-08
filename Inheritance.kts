/*
Base class for all the classes in Kotlin is "Any"
In Java we can inherit from base class only if
the class is declared of type final then we can't
inherit it.
But in Kotlin all types are final by default
so foll. code is going to give me an error

ProgLangs is final be default so KotlinLang can't
inherit it , so we need to open the class by
mentioning open before class

class ProgLangs{}

class KotlinLang: ProgLangs(){}
 */

open class ProgLangs(){
open fun syntax(){
    println("Syntax means way to declare variables" +
            "whether the ; is need to notify End" +
            "of the line or not")
}
}

class KotlinLang: ProgLangs{
override fun syntax(){
    //'syntax' in 'ProgLangs' is final and cannot be overridden
    //so need to declare syntax function as open too
    println("No need to worry about semicolons in Kotlin :D " +
            "Except for few cases :) ")
}
//for following line to work I have added constructor
//to ProgLang class just by putting () after the name
//name ProgLang of the class.
//and also need to remove the () after the
// ProgLang inheritance for KotlinLang
//This is a bit tricky to understand.. :(
//Need to search for some explanation.
    constructor(): super(){

    }
}

val kotlinLang = KotlinLang()

kotlinLang.syntax()