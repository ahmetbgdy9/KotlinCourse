import java.io.IOException

fun main() {

   print("Öğrenci misin?")
    val answer = readln()

    //State kullanimi
    if (answer.contains("Evet", ignoreCase = true)) {
        println("Öğrenci")
    } else{
            println("Öğrenci Değil")
    }

    // expression kullanimi. {} icerisindeki son satir, deger oalrak degiskene atanir
    val result: String = if  (answer == "Evet") {
        "Öğrenci"
    } else {
        "Öğrenci Değil"
    }

    println(result)

    /**
     *         Kotlin'de if else Expression kullaniminda ötürü ternary operatoru yoktur.
     *         Ternary yerine asagidaki gibi kullanim yapabiliriz.
     */

    val isStudent = false
    val isStudent2 = if (isStudent) {"true"} else {"false"}
    // String name2 = isStudent ? "true" : "false" ternary operator

    print("Notunuzu Giriniz : ")
    val grade = readln().toDouble() //TODO "readline()!! ile readln() farkına bak

    if (grade <= 100 && grade >= 85) {
        println("AA")
    } else if (grade < 85 && grade >= 70) {
        println("BB")
    } else if (grade < 70 && grade >= 55) {
        println("CC")
    } else if (grade < 55 && grade >= 40) {
        println("DD")
    } else {
        println("OKULU BIRAK")
    }

    /**
     *      2 farklı tipteki number değişkenler karşılaşrıllırken equals fonksiyonu önce tiplerini karşılaştırır
     *      eğer tipler uyuşmuyorsa, ide hata verecektir
     */
    //if(10 == 10L){ // Çalışmaz
      //  println("birbirlerine eşit")
    //} else{
     //   println("birbirlerine eşit değil")
    //}

    if(10 == 10L.toInt()){
        println("ture")
    }

    /**
     *      Şartlar birbirinde bağımsız ise alt alta if kullan eğer şarlar birbirleri alakalı ise "else if"
            kullan
     */

    if (grade <= 100){

    }
    if (grade <= 85){

    }
    if (grade <= 70){

    }
    if (grade <= 50){

    }

    /**
     *      Bazi durumlarda if else yazmaktansa, if case'ini yazip return yada throw gibi kodun devam etmesini bozan
     *      ifadelerle kodu sonlandırabilirsiniz. Kod calışırken bu if case'ine girmezse devm eden kod bloğu calışır
     *      bu da pratikte ekse case'i demek olur. Bu şekilde yazim kodu biraz daha temiz gosterecektir.
     */

    if (isStudent) {
        println("Student")
    } else {
        otherMethot()
    }

    if (isStudent) {
        println("Student")
        throw IOException()
        //RETURN
    }

    otherMethot()
}

    private  fun otherMethot() {


    }
