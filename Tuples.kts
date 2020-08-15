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