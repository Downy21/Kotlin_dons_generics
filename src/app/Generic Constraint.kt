package app

interface CanSayHellow {
    fun sayHellow (name: String ) {
    }
}

open class Employe


class Manager: Employe() {

 }

class VicePresisident : Employe(),CanSayHellow{
    override fun sayHellow(name: String) {
        println("Hello $name , Iam Vice President")
    }
}
class Company<T>(val employe: T ) where T: Employe, T:CanSayHellow

fun main() {

//    val data1 = Company(Employe()) // ini error karena tidak sama seperti class vicepresident
//    val data2 = Company(Manager()) // ini juga error karena tidak sama seperti class vicepresident
    val data3 =Company(VicePresisident()) // ini berhasil
//    val data4 = Company("String") // // ini error karena tidak boleh value string




}







