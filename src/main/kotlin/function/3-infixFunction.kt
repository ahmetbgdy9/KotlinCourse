package function

import java.awt.Image
import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction
import kotlin.contracts.Returns

fun main() {
    /**
     *      Daha okunakli kodlar yazmak için kullanilir.
     *      (nokta) kullanimini kaldirir.
     *      true or false
     *      true.or(false)
     *      true.or(false, true)
     *      true or false or true //CALİSMAZ
     *      true or
     *      Bir fonksiyonu infix hale getirebilmek için 5 şart vardır
     *      1. infix keywordu ile baslar.
     *      2. fonksiyon bir üye fonksiyon olmalıdır
     *      3. ya da bir extension fonksiyon olmalıdır
     *      4. sadece bir parametre almalidir. Bu parametre var arg olamaz !!! :D :D :D
     *      5. infix methodun parametresi default deger alamaz
     *
     *      Yapisal olarak;
     *
     *      infix fun infixMethod(justOneParam : AwesomeParam)
     *
     */

    val isStudent = false
    val isMale = true

    /**
     *      and, or, xor gibi onlarca infix methot vardir.
     */
    if (!isStudent and isMale) {
        print("Öğrenci olmayan erkek")
    }

    // infix kullanimi
    isStudent and isMale
    isStudent.and(isMale)

    val awesomeInstance = AwesomeClass()
    // infix kullanimi
    awesomeInstance downloadImage "www.google.com.tr"


    /* ---------------------------------------------------------------------------------------------------- */

    val number = 5
    // matematiksel operatorlerin, tip donusumlerin (type conversion), range kullanimin, infix methotlara
    if (number + number - 2 * (awesomeInstance specialPlus 4) == 5) {

    }


    /* ---------------------------------------------------------------------------------------------------- */

    // infix methotlarin da mantik operatorlerine gore onceligi vardir.
    if (number == 3 && number < 5 || awesomeInstance specialPlus 4 == 5) {

    }
}

/* ---------------------------------------------------------------------------------------------------- */

class AwesomeClass {
 //Calismaz
 //   infix fun downloadImage(imageUrl : String = "Ahmet") {
 //
 //   }

/* ---------------------------------------------------------------------------------------------------- */

    infix fun downloadImage(imageUrl: String) {

    }

    infix fun specialPlus(number: Int): Int {
        return 4
    }

    /* ---------------------------------------------------------------------------------------------------- */

    // Calismaz
    infix fun <T> downloadImage2(mageUrl : T) {

    }

    /* ---------------------------------------------------------------------------------------------------- */

    // Bir sinifin içindeyken this kullanimi size bulundugu sinifi isaret eder
    // asagidaki kullanimda AwesomeVLass().downloadImage(imageUrl) kullanimi olusur aslinda. (implicit)

    fun logWhenImageDownloaded(imageUrl: String) {
        downloadImage(imageUrl)
 //     downloadImage imageUrl
        this downloadImage imageUrl
    }
}

/* ---------------------------------------------------------------------------------------------------- */

// Bir sinifin disindayken infix method cagrimi yapilirsa this kullanilamaz
    fun logWhenImageDownloaded(imageUrl: String) {
    //  this downloadImage imageUrl
}

