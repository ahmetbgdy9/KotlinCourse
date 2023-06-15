package function

/**
 *      Bir fonksiyon herhangi bir sinifin icerisinde degil de bir dosyanin icerissinde boslukta tanimlaniyorsa,
 *      top level function adini alir.
 *
 *      Bir fonksiyon olusturulurkne top level tanimlama yapialmiyor, sadece bir sinifa ait fonksiyonlar yazilabiliyorsa
 *      bunlara fonksiyon degil, methot denir. Bir fonksiyona fonksiyon diyebilmemiz top level tanımlanabiliyor olmasi lazim
 */


fun main() {
    calculateAtomPhysics()
}

/*---------------------------------------------------------------------------------------------------------------------------*/


/**
 *      Fonksiyon icerisinde fonksiyon tanimi kotlin'de yapılabilir. Bu fonksiyoonlara LOcal function denir.
 *      Sebebi ise, yazdığınız fonksiyonun kendi sinifinizdan dahi cagrilmasini isteyemebilirsiniz.
 *      Bu fonksiyonun herhangi bir baska fonksiyona ya da sinif icin degistirilmesini istemeyebilirsiniz.
 *      Reflection ile fonksiyonalriniz erisilirken gizli kalsın isteyebilirsiniz.
 *      Bu gibi durumlarda bu cok onemli fonksiyonunuzu baska bir fonksiyon icerisinde yazabilirsiniz.
 */

fun calculateAtomPhysics() {

    val userName = "Codemy"
    println("Initialize Process....")


    fun getValuesFromUserAndPrint() {
        userName.length
        val numberOne = readln().toInt()
        val numberTwo = readln().toInt()
        val result = numberOne + numberTwo
        println("$result")
    }

    getValuesFromUserAndPrint()
    println("process has been done")

}


/*---------------------------------------------------------------------------------------------------------------------------*/

/**
 *      Bir sinifin icerisindeki fonksiyonlara, uye fonksiyonlar denir.
 */

class Car {
    fun setColor(colorCodeId: Int) {

    }
}

/*---------------------------------------------------------------------------------------------------------------------------*/

/**
 *      Bİr fonksiyon Generic tip aliyorsa, Generic Function olarak adlandırılır.
 */
fun <T> setColor(colorCodeId: T) {

}





