package function

import java.awt.Shape
import kotlin.math.log2

fun main() {

    /**
     *      Uzerinde degisiklik yapamdigimiz (readOnly) siniflara, ya da yapmak istediğimiz siniflara,
     *      bu siniflarin icerisinde yazmadan fonksiyon tanimlayabilmemiz saglar. BOylece o sinifa uye bir fonksiyon
     *      kazandırabiliriz. Bunu yaparken unutmamamız gereken; yazdigimiz extension fonksiyon aslinda o sinifin gercek
     *      bir fonksiyonu olmayacaktir.
     *
     *      Reciver diye adlandiracagimiz bir sinifa ihtiyac duyar. Extension yazacagimizi ifade eder Reciver tanimi
     *
     *      Yapisal oalrak;
     *
     *      fun String.exPrint(handsomeValue : HandsomeOne) : Unit {
     *
     *      }
     */


    // normalde degiskenler deger atayip, print islemini asagidakiler gibi yapariz.
    val pi: Double = 3 + 0.14
    println(pi)

    val schoolNumber: Int = 13541
    println(schoolNumber)

    val tc: Long = 36235466879
    println(tc)

    // yukaridaki kullanimlarin yerine normal bir log2 fonksiyonu yazilabilir ve asagidaki gibi kullanilabilir.
    log2(pi)
    log2(schoolNumber)
    log2(tc)

/* ------------------------------------------------------------------------------------------------------------------------------------ */

    // extension fonksiyonlar ister direkt value'lar uzerinden cagrilabilir.
    (3 + 0.14).log("")
    1341.log("")
    1341.toFloat()
    18615165115.log("")

    (3 + 0.14) log ""

    //  isterseniz de degiskenler uzerinden.
    pi.log("")
    schoolNumber.log("")
    tc.log("")

/* ------------------------------------------------------------------------------------------------------------------------------------ */

    //  extension fonksiyonlar sarı renkte gözükürler
    var result: Int = "3".extPlus("5")
    val result2: Int = "3" extPlus "5"

    //  infix fonksiyonlar extension fonksiyonlarla kullanılabilir.
    //  extPlus infx extension oldugu icin . (nokta) kullanimina ihtiyac dutmaz.
    //  log ise sadece extension fonksiyon oldugu icin. (nokta) ile cagrilir.
    ("3" extPlus  "5").log("")

/* ------------------------------------------------------------------------------------------------------------------------------------ */

    /**
     *      Extension fonksiyonlar bir sınıfın içerisinde yazildilar ise kullanim alani sadece o sinifin icerisi olacaktir
     *      Sinifn disindan, Global cagirim yapilamaz
     *      Int.exToString() methodu Shape sinifi icinde yazilmistir. Dolayisiyla Shape sinifi disindan erisilemez
      */

    // 4.extToString() // Calismaz.

    // yine de extension methodu veren asagidaki main gibi bir method ile erisilebilir.
    val shape = Shape()
    shape.setNumber(54)
    shape.main()

}
/* ------------------------------------------------------------------------------------------------------------------------------------ */
  // normal fonksiyon
fun log2(number: Number) {
        println(number)
    }

/* ------------------------------------------------------------------------------------------------------------------------------------ */

/**
 *      Number (reciever) sinifina extension olarak yazilmis log fonksiyonu. Ayni zamanda infix yapilmistir.
 *      this ifadesi, extension yapilan degeri verir. 3 log "4" yaparsaniz,
 *      agasidaki kod size emptyParam = "4", this = 3 olarak verilir
 */

infix fun Number.log(emptyParam: String) {
        println(emptyParam + this)
    }

/* ------------------------------------------------------------------------------------------------------------------------------------ */

/**
 *      Infix extension fonksiyon expression formunda kullanilabilir.
 */
infix fun String.extPlus(otherString: String): Int = this.toInt() + otherString.toInt()

/* ------------------------------------------------------------------------------------------------------------------------------------ */

open class Shape {


    var intNumber: Int = 0


    fun setNumber(intNumber: Int) {
        this.intNumber = intNumber
    }

    fun main() {
        intNumber.extToString()
        intNumber.log("")
    }


/* ------------------------------------------------------------------------------------------------------------------------------------ */

    /**
     *      Bİr sinifin icinde, farkli bir sinifa ait extension fonksiyon yazilirsa, bu sinifin icinde ayni isimde normal
     *      bir fonksiyon olsa bile, extension fonksiyonun içerisinde, ayni isme sahip fonksiyon cagrilirsa, bu extension
     *      fonksiyona isaret eder demektir. sinifin ayni isimdeki uye fonksiyonunu extension fonksiyon icerisinde cagirmak icim
     *      this@sinifismi.uyefonksiyon() seklinde cagrim yapilmalidir.
     */

    open fun Int.extToString() {
        println("")

        // Int.extToString() methodunu isaret eder.
        extToString()

        // SHAPE'E ait asagidaki uye methodu isaret eder.
        this@Shape.extToString()
        println("Awesome class printi")


    }

    fun extToString() {
        println("clas printi")
    }
}

/* ------------------------------------------------------------------------------------------------------------------------------------ */


/**
 *      Bir sinifin, yazilmis extension fonksiyonun aynisini (isim ayni, parametre sayisi ve tipleri ayni, ayrica geri donus )
 *      kendi icinde barindiriyorsa, bu durumda yazilan extension fonksiyon gecersizdir. sinifin uye fonksiyonu cagrilir.
 */

fun Shape.setNumber(intNumber: Int) { //!!
    val result = intNumber + intNumber
    println(result)
}

/* ------------------------------------------------------------------------------------------------------------------------------------ */


/**
 *      Bİr sinifa extension fonksiyon yazilabildigi gibi ectension property de yazilabilir
 *      Bunun sebebi aslında propertylerin get() ve set() methotlarından oluşşmasından dolayıdır
 *      Bu extension property'lerin icerisinde field tanimlanamaz
 *      Dolayisiyla aslinda gercek anlamda bir degisken extension yapilamaz.
 *      Bu konu property vs feild konusunda sınıflarla detayladnırılacak
 */


var Shape.type
    get() = "Rectangle"
    set(value)  {
        type = value
    }

/* ------------------------------------------------------------------------------------------------------------------------------------ */

/**
 *      Open (Extend edilebilir) bir sinifa, sinifin icinde bir open (override edilebilir) extension fonksiyon yazilirsa
 *      bu sinifi miras (inherit) olan siniflar, ilgili etension fonksiyonunu override edebilirler.
 */

/*
class Reactangle : Shape() {
    override fun Int.extToString() {
    }
}

class Ashape() : Shape() {
    fun deneme() {
        4.extToString()
    }
}
*/

/* ------------------------------------------------------------------------------------------------------------------------------------ */

/**
 *      NOTES :
 *      Nullable extension dunction da yazilabilir.
 *      Companion object'lere de extension yazilabilir. Siniflar'da ornek yapılacak
 */




