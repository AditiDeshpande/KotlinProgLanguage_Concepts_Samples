/*
Any method etc want to return multiple pairs maybe
returning multiple values just use data classes
 */

fun capitalAndPopulation(country: String): Pair<String ,
        Long>{
    return Pair("Delhi" , 1350000000)
}

fun countryInformation(country: String): Triple<String ,
        String , Long>{
return Triple("Delhi" ,"Asia" ,  1350000000)
}

val result = capitalAndPopulation("India")
println("result: " + result)
println("Capital: " + result.first)
println("Population: "+ result.second)

val result1 = countryInformation("India")
println("result1: " + result1)
println("Capital: " + result1.first)
println("Continent: "+result1.second)
println("Population: "+ result1.third)


/*
Output

val result: Pair<String, Long>
result: (Delhi, 1350000000)
Capital: Delhi
Population: 1350000000

val result1: Triple<String, String, Long>
result1: (Delhi, Asia, 1350000000)
Capital: Delhi
Continent: Asia
Population: 1350000000
 */

/*
Deconstructing values
 */
val (capital , population) =
        capitalAndPopulation("India")

/*println("Capital: " + capital)
println("Population: "+ population)*/

/*
Scratch files not supporting deconstructing values I guess
giving following output

Unresolved reference: capital
Unresolved reference: population
 */
/*
Online kotlin compiler giving foll. output

Capital: Delhi
Population: 1350000000
 */

val listCapitalsAndCountries = listOf(Pair("Madrid"
, "Spain") , "Paris" to "France")

println(listCapitalsAndCountries)

/*
Deconstructing used with for loops
 */
for((capital,country) in listCapitalsAndCountries) {
    println("Capital: " + capital)
    println("Country: "+ country)
}

/*
Output

[(Madrid, Spain), (Paris, France)]

Capital: Madrid
Country: Spain
Capital: Paris
Country: France
 */