package function

fun main() {

    val name = "Ahmet"
    val surName = "Buğday"
    val fullName = name + " " + surName

    fun deneme(fullName: String): String {
        return "Merhaba" + fullName
    }

    fun deneme2(fullName: String): String {
        return "Merhaba" + fullName
    }

    val welcomeMessage: String = deneme(fullName)

    deneme(deneme2(fullName))

    /**
     *      Fonksiyonlar kotlinde "first class Citizen" dır. Yani degiskenlere deger olaarak atanabilir. baska fonksiyona
     *      parametre olarak verilebilir ya da bir fonksiyoynun geri donus deger olabilir demektir.
     *
     *      Higher Order Function'lar daha da basitce fonksiyon body'sidir.
     *      Hİgher Order Functionlar basitce bir fonksiyona parametre olarak verilen fonksiyonlardır. parametre
     *      verilmekten kasit, fonksiyonun cagriminin parametre kisminda yapilmasi degil, fonksiyonun govdesinin
     *      yani süslü parantezler arasinda kalan gorev alaninin baska bir fonksiyona parametre olarak verilmesidir.
     *
     *      Yapisal olarak;
     *
     *      fun foo(higherOrderFunction: (message: String) -> ünit) {
     *
     *          diğer kodlar
     *          diğer kodlar
     *          diğer kodlar
     *          diğer kodlar
     *
     *
     *          higherOrderFUnction("Comedy")
     *      }
     *
     *      fun boo(boo: String) {
     *      }
     *
     *      Cgrilirken ;
     *
     *      fun main() {
     *
     *          boo("Merhaba)
     *
     *          foo({ message ->
     *              println("Message : $message")
     *          })
     *      }
     */

/* ---------------------------------------------------------------------------------------------------------- */

    /**
     *          Higher Order Function'lari tanilalmanin 3 yolu vardır.
     */

    //  Bir degiskene atayarak Higher Order FUnction tanimlayabilirsiniz.
    //  BU durumda suslu parantezler yanina higher order funtion'in aldiği lambda okundan once aralık
    //  koyularak yazilir. Hİgher orden function tek parametre aliyorsa, bu parametreleri yazmak zorunda degili<
    //  Bu durumda higher order function size "it" keliimesi ile higher order function'in parametresi tipinde bir

    val higherOrderFunction = { surName: String ->
        println("surName : $surName")
        "surName : $surName"
    }

    //  İsmi olmayan "anonymous function" tanimlamalari da Higher Order Function olarak, normal bir fonksiyona parametre
    // oalrak verilebilir.

    val anonymousFunction = fun(surName: String): String {
        return "surName : $surName"
    }

    //  Anonymous Funtion'in expression kullanimi da yine Higher Order Function olarak normal bir fonksiyona parametre
    //  olarak verilir

    val anonymousFunction2 = fun(surName: String): String = "surName : $surName"

    // Higher order function

    fun logPrint(message: String, count: Int): String {
        return "Log: $message"
    }

    fun foo(higherOrderFunction: (message: String, count: Int) -> String) {
        higherOrderFunction("Cod",1)
    }

    logPrint("selam ",23)
    //foo(::logPrint("selam"))
    //foo(logPrint("selam"))
    foo(::logPrint)

    //  Higher order function'la ayni parametre sayisina sahip ve bu parametrelerin hespinin tipleri higher order
    //  parametre tipleri ile aynı ise, bu normal fonksiyon da higher function olarak normal bir fonksiyona
    //  olarak verilebilir. Bunu yapmak icin sadece basina :: isareti koymak yeterlidir














}