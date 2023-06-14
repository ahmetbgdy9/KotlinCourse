package Basics.controlflow

fun main() {
    /**
     *      Switch caselerin yerine gelmiştir
     *      when(karşılaştırılacak ifade)
     *          value -> {}
     *          value -> {}
     *          value -> {}
     *          else  -> {}
     *       foormatiyla kullanilir.
     *       Yine {} arasina tek satir kod yazilacaksa bu durumda {}'leri kullanmayabiliriz.
     *       "tr", "az" gibi aynı kodu çalıştıracak case'ler varsa araya virgül koyarak kullanılabilir.
     *       BU "veya" kullanımı yapmayı sağlar. "tr veya az" gibi
     */

    val countryCode = readln()
    when (countryCode.lowercase()) {
        "tr", "az" -> println("türk")
        "ar" -> println("arap")
        "fr" -> println("fransız")
    }

    //karşılatırılacak sey "değer" yerine "değisken" de olabilir.
    val trCode = "tr"
    val arCode = "ar"
    val frCode = "fr"
    val ruCode = "ru"
    when (countryCode.lowercase()) {
        trCode, "az" -> println("TC vatandaşı")
        arCode -> println("Arap vatandaşı")
        frCode -> println("Fransız vatandaşı")
        ruCode -> println("Rus vatandaşı")
    }



    // is !is ile  bir class'in referansı olup olmadığı kontrol edilir.
    val phoneNumber: Long = 5425811207
    when (phoneNumber) {
        is Long -> {
            println("Long value")
        }
        !is Long -> {
            println("long value değil")
        }
    }

    // range'leri in !in şeklinde kontrolü yapılabilir.
    val number = 3
    when (number) {
        in 0..10 -> {
            println("Long value")
        }
        in 11..20 -> {
            println("Long value")
        }
        in 0..10 -> {
            println("Long value")
        }
    }

















}