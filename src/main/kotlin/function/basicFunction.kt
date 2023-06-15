package function

fun main() {

    /**
     *      fun keywordü ile fonksiyonlar
     *      fonksiypn ismi verilir.
     *      parametre parantezleri açılır ve parantezler girilir
     *      : operatörü ve geri dönnüş değeri yazılır
     *      fonksiyon body'si açılır ve kapatılır
     *      Geri donus degeri verilmeyen fonksiyonlar unit tipini geri dondurur
     */


    // Fonksiyon çağrılırken ismi ve parametreleri kullanılır
    // Eğer bir geri donusu varsa bir degiskene atabilir

    takeSquare(2)
    val squareValue = takeSquare(2)

    /*--------------------------------------------------------------------------------------*/

    // Bir class'in fonksiyonu çağırırken ise nokta işaretini kullanırız
    Math.pow(2.0, 3.0)

    /*--------------------------------------------------------------------------------------*/

    // Default degeri olan parametrelere sahip bir fonksiyon cagrilirken, default degeri olan parametrelere
    // deger atamak sart degildir. Defaulr degeri olan bu paramatreler "OPSİYONEL" parametrelerdir
    // Default degeri olan parametrelere deger atanmadan fonskiyon cagrilacaksa bu durumda parametre sirasi degisir
    // Ide'ye hangi parametreye deger atadiginizi soylemek için Named Argumnets'leri kullanmamiz gerekir

    reFormatMessage("Message",true,7,"tr")
    reFormatMessage("Message", size = 7, lang = "tr")
    reFormatMessage("Message",true,7)
    reFormatMessage("Message", size = 7)
    /*--------------------------------------------------------------------------------------*/

    // vararg kullanimina ornek. key = 3'den onceki parametreler vararg parametresine denk gelir.
    getUserInfo("Ahmet", "Buğday", "Kahramanmaras","Turkiye","", key = 4)

    // vararg parametresi olarak arrayOf kullanılmak istenirse * operatoru eklenmelidir. (spread operator)
    // bu operator diger dillerdeki pointer kullanimi anlamina gelmez. Kotlinde poiterlar yok.
    getUserInfo(*arrayOf("AHMET","BUĞDAY","KAHRAMANARAS","TURKIYE"), key = 5)

    getUserInfo2(2,"ahmet","buğday","kahramanmaraş")

}
/*--------------------------------------------------------------------------------------*/
/*--------------------------------------------------------------------------------------*/


    /**
     *      @param number degisken tanimlanir gibi tanimlanir
     *      Fonksiyon parametresi tanimlanirken, val var gibi betimleyeciler kullanilmaz.
     */

    fun takeSquare(number: Int): Int {

        //qqweqwe
        //WErewr
        //^'%^+5efwe

        return number * number
    }

/*--------------------------------------------------------------------------------------*/

/**
 *      = ile fonksiyonlara default deger verilebilir. (Default Argument)
 *      Default deger atamasi yapmak function overloaa islemi yapmamizi saglar.
 *      Tekrar tekrar ayni fonksiyonun farkli varyasyonlarini yazmak durumunda kalmayiz.
 */

    fun reFormatMessage(message: String, isUpperCase: Boolean = false, size: Int, lang: String = "tr") {
    println("Message : " + message + "isUpperCase : " + isUpperCase + "Size : " + size + "lang : " + lang)
}

// DEFAULT arguments sayesinde asagidaki fonksiyonlari yazmak zorunda kalmayız.
// fun reformatMessage(message: String, size: Int, lang: String = "tr) {
//   println("Message : " + message + "isUpperCase : " + isUpperCase + "Size : " + size + "lang : " + lang)
//}
//
// fun reformatMessage(message: String, isUpperCase: Boolean = false, size: Int) {
//   println("Message : " + message + "isUpperCase : " + isUpperCase + "Size : " + size + "lang : " + lang)
//}
//
//  fun reformatMessage(message: String,size: Int) {
//  println("Message : " + message + "isUpperCase : " + false + "Size : " + size + "lang : " + "en")
//  }


/**
 *      Default değeri olan parametrelere sahip bir fonskiyon Java siniflarindan cagrilacaksa eger
 *      Bu fonksiyona @JvmOverloads annotation'i verilmelidir. Boylece yazilan kod Jvm'e hazir hale gelir
 *      ilgili fonksiyonun tum varyasyonlari yazilir (overload edilir)
 */

    @JvmOverloads
    fun printss(message: String = "Message", size: Int = 0) {
        val dd = size
        println(message)
    }

    fun boo() {
        printss()
        printss("fsaf")
        printss(size = 4)
        printss("sfaf",5)
    }

/**
 *      Extend edilebilir bir sinif, yavru (child) sinif tarafindan miras (inherit) alinirsa
 *      ve by sinifin override edilebilir open bir methodu varsa, bu methot defult argument'e sahip
 *      bu sinifi miras alan sinifda method override edilirse, override edilen methodun parametresine
 *      Ust sinifin methodundaki defult argumen geçerli olur
 */

    open class A {
        open fun foo(i: Int = 10) {

        }
    }

    class B : A() {
        override fun foo(i: Int) {
            println(i)
        } // no default value allowed (defaut değere izin vermez)
    }

/*--------------------------------------------------------------------------------------*/


/**
 *      Cok uzun sayida parametremiz olacaksa "variable number of arguments" - vararg tanimlanabilir.
 *      Bu sayede fonksiyon tek bir parametre aliyor gibi gozukurken kendisine cok miktarda degisken atanabilir
 *      Bu Degiskenlere array'e erisir gibi erisebilirsiniz. [index] ya da .get(index) seklinde
 *
 *      vararg tek ya da son parametre olarak yazilirsa, Jvm'e hazirlanirken, Java'daki "String..." gibi ayni kod derlenir
 *      Ancak vararg param birden fazla  tanimlanirken ordada ya da basta yer alirsa, Jvm'e hazirlanirken, Arraye donusturulur
 *      Bu da performans farki olusturur demektir
 */

fun getUserInfo(vararg userInfo: String, key: Int) {
    userInfo[3]
    userInfo.get(3)
}

fun getUserInfo2(key: Int, vararg userInfo: String) {
    userInfo[3]
    userInfo.get(3)
    println(key)
}

/**
 *      AYNI FONKSİYON İCERİSİNDE BİRDEN FAZLA VARARG TANİMİ YAPİLMASİNA İZİN VERİLMEZ
 */


/**
 *      Bir fonksiyona = koyularak da return edecegi deger yazilabilir. (Single - Expression kullanimi)
 */

val userList = arrayOfNulls<String>(5)

fun getListCount(): Int = userList.size

fun getListCount2(): Int {
    return userList.size
}







