var i = 9
while(i > 0){
    i--
    println(i)
}

var x = 8
do{
   x--
    println(x)
}while(x > 0)

loop@ for(i in 1..5){
    for(j in 1..5){
        if(j % i == 0 ){
            println("Breaking at i = "+ i +
                    "j = "+ j )
            break@loop
            //continue
            //continue can also be used
        }
    }
}
/*
Output of first 3 loops

8
7
6
5
4
3
2
1
0


7
6
5
4
3
2
1
0

Breaking at i = 1j = 1
 */

