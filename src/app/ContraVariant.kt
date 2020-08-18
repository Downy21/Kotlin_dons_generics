package app

class ContraVariant<in T> {
    fun sayHellow(param: T) {
        println("Hellow $param")
    }
}


fun main() {

    val contraVariantAny = ContraVariant<Any>()
    val contraVariantString: ContraVariant<String> = contraVariantAny

    contraVariantAny.sayHellow("Alberts")




}