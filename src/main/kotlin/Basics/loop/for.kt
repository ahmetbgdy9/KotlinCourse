package Basics.loop

fun main() {

    /**
     *      3 farklı şekilde for tanımlayabiliriz
     *      value in list                       seklinde value değerlerini alabiliriz
     *      index in list.indicies              seklinde index değerlerini alabiliriz
     *      (index,value) in list.withIndex()   seklinde index,value değerlerini alabiliriz
     */



    for (value: Int in 1..10) {
        print("$value")
    }

    val countryCodeArray = arrayOf("tr", "az", "en", "fr")

    for (value in countryCodeArray) {
        print(value)
    }

    for (index in countryCodeArray.indices) {
        print("\n$index . değeri : ${countryCodeArray[index]}")
    }

    for ((index,value) in countryCodeArray.withIndex()) {
        print("\n$index . değeri : $value ")
    }


    /**
     *          repeat(size) şeklinde herhangi bir listeye ihtiyaç duymadan tekrarlayan işler yapabilirisiniz
     */
    repeat(10) {
        print("\nDaha çok tekrar et")
    }


    /***
     *      break kullanarak ilgili sart saglanırsa, donguden çıkabilrisiniz.
     *      continue kullanarak ilgili sart saglanırsa, donguye o değeri atlayarak devam edebilirsiniz
     */

    for (value in 1..50) {
        if (value % 2 == 1) {
            continue
        }
        print("\n$value")
    }

    for (value in 1..50) {
        if (value % 2 == 1) {
            break
        }
        println("$value")
    }


    /**
     *      iç içe döngüleri kullanıyorsak bir ustteki for'a değil de iki ustteki, üç üstteki for'a donmek istersek
     *      label kullanabilriz. bunun için labelname@ ifadesini ilgili for'un onune yazip return yada continue gelecek yere
     *      ise @labelname seklinde yazmamız yeterli
     */

    for (value in 1..50) {
        for (value2 in 0..10) {
            if (value2 == 5) {
                continue
            }
            print("continue 1 : $value2 | ")
        }
    }

    println()

   returnLabel@ for (value in 1..50) {
        for (value2 in 0..10) {
            if (value2 == 5) {
                continue@returnLabel
            }
            print("continue 2 : $value2 | ")
        }
    }

    for (value in 1..50) {
        for (value2 in 0..10) {
            if (value2 == 5) {
                break
            }
            print("break 1 : $value2 | ")
        }
    }


    returnLabel@ for (value in 1..50) {
        for (value2 in 0..10) {
            if (value2 == 5) {
                break@returnLabel
            }
            print("break 2 : $value2 | ")
        }
    }












}