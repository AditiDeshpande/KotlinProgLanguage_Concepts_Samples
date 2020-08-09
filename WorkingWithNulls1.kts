class Service{
    fun evaluate(){}
}
class ServiceProvider{
    fun createService(): Service? {
        return Service()
    }
}

val sp = ServiceProvider()
val sp1 = createServiceProvider()

//I need to have ?. for sp1 too now becoz I
//have added ServiceProvider? in fun createServiceProvider
sp1?.createService()?.evaluate()
//Service can be null so we need to use
//safe operator
sp.createService()?.evaluate()

fun createServiceProvider(): ServiceProvider?
        = ServiceProvider()
