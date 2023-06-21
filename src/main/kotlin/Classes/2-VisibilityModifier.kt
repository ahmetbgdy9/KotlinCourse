package Classes

//      encapsullation : bir classın üye değişkenlerine , private tutup bu değikene erişecek olan fonksiyonları publicte
//      tutma olayı.

open class Foo() {

    private val name = "ahmet"

    public var surName = "bugday"

    protected  val email = "sfsdfsd@gmail.com" // child class larda public - harici tüm class'larda private

    internal  val age = 22 // module içerisinde public harici modullerde private

    fun printName() {
        println("Merhaba $name")
    }

    fun getName():String {
        return name
    }
}


class  Boo private  constructor(): Foo() {
    init {
        // name erisilemez
        surName
        age
        email
    }
}

class Doo() {
    init {
        val foo = Foo()
    //  foo.name
        foo.surName
        foo.age
    //  foo.email
    }
}


fun main() {
    val foo = Foo()
    // foo.name = "fas"
    foo.surName = "sada"
    // foo.email = "sdasa"
    foo.getName()
}