package Classes

import java.time.Clock

interface McDonaldsService {
    fun motoCarrierr()

//     fun sellCoffee(): McCoffee
}


/**
 * final ve open modifier'ları kullanmak anlamasız ve yanlıştır.
 * abstract olarak yazilmis class'a yeni eklenen tum abstract yapilar, tum child class'larda override edilmek zorunda.
 * eger abstract class'imiza eklemek istediğimiz opsiyonel yapilar varsa, bunlari child class'larin tamaminda override
 * etmek zorunda olmayalim diye, open keyword'u ile tanimlayabiliriz.
 * abstract bir class, abstract bir class'i miras alirsa, abstract yapilari(degisken,fonksiyon) override etmek zorunda değildir.
 * abstract fun. body'si olmaz. propertylerin de default degeri olmaz
 * abstract class'lar ayni zamanda instance'i oluşturulmayan class'lar. bu sebeple singleton gibi pattern'ler içinde
 * kullanılabiliyorlar.
 * */


/**
 * Abstract classlar şablon class lar gibidirzzzzz
 */

abstract class MCDonalds {
    abstract val fridge: Fridge
    abstract val superVisor: SuperVisor
    abstract val employeeOne: Employee
    abstract val employeeTwo: Employee
    abstract val employeeThree: Employee
    abstract val menuList: List<McHamburger>

    //    val specialBranchName: String = "Taksim"
    abstract fun clean(clock: Int)
//    abstract infix fun clean(clock: Int)

    // opsiyonel
    open val policeOfficer: Police = Police()
}

//infix fun McDonaldsExpress.print(message:String) {
//
//}

abstract class McDonaldsExpress : MCDonalds() {
    abstract fun sellCoffee(): McCoffee
    override fun clean(clock: Int) {
        println("Clean time : $clock")
    }

//    fun main() {
//        fridge
//        superVisor
//    }

    override val fridge: Fridge
        get() = TODO("Not yet implemented")
}

class McDonaldsMaltepe : MCDonalds(), McDonaldsService {
    override val fridge: Fridge
        get() = TODO("Not yet implemented")
    override val superVisor: SuperVisor
        get() = TODO("Not yet implemented")
    override val employeeOne: Employee
        get() = TODO("Not yet implemented")
    override val employeeTwo: Employee
        get() = TODO("Not yet implemented")
    override val employeeThree: Employee
        get() = TODO("Not yet implemented")
    override val menuList: List<McHamburger>
        get() = TODO("Not yet implemented")

    override fun clean(clock: Int) {
        TODO("Not yet implemented")
    }

    override fun motoCarrierr() {
        TODO("Not yet implemented")
    }

//    fun main() {
//        fridge
//        superVisor
//    }
}

class McDonaldsKadikoy : MCDonalds() {
    override val fridge: Fridge
        get() = TODO("Not yet implemented")
    override val superVisor: SuperVisor
        get() = TODO("Not yet implemented")
    override val employeeOne: Employee
        get() = TODO("Not yet implemented")
    override val employeeTwo: Employee
        get() = TODO("Not yet implemented")
    override val employeeThree: Employee
        get() = TODO("Not yet implemented")
    override val menuList: List<McHamburger>
        get() = TODO("Not yet implemented")

    override fun clean(clock: Int) {
        TODO("Not yet implemented")
    }

    // Opsiyonel
    override val policeOfficer: Police
        get() = Police()

}

class McDonaldsMaltepeExpress : McDonaldsExpress() {
    override fun sellCoffee(): McCoffee {
        TODO("Not yet implemented")
    }

    override val fridge: Fridge
        get() = TODO("Not yet implemented")
    override val superVisor: SuperVisor
        get() = TODO("Not yet implemented")
    override val employeeOne: Employee
        get() = TODO("Not yet implemented")
    override val employeeTwo: Employee
        get() = TODO("Not yet implemented")
    override val employeeThree: Employee
        get() = TODO("Not yet implemented")
    override val menuList: List<McHamburger>
        get() = TODO("Not yet implemented")

    override fun clean(clock: Int) {
        super.clean(clock)
        println("Clean flor : 1")
    }
}

fun main() {
//    val mcDonalds = MCDonalds()
}

class Fridge
class SuperVisor
class Employee
class McHamburger
class Police
class McCoffee


/**
 * Abstract class bir sözleşme gibidir. child classlarda yapılması zorunlu olmasını istediklerimizi
 * abstract class larda topluyoruz dolayısıyla child classlarda daha az kod yazarak daha çok iş yapabilmemizi sağlar.
 * final ve open keywordünü kullanmak anlamsız.
 */