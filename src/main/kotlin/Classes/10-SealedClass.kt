package Classes

import function.logWhenImageDownloaded

/**
 * sinirli kumede, gruplanabilir, class'lar yazmayi saglar.
 * kisitlanmis bir class hiyerarsisi kurmamızı saglar,
 * bu classlar arka planda statik olarak tutulmazlar. Enumaration'lardan en buyuk farkı budur.
 * enumarationlar verileri gruplarken, sealed classlar classları gruplar.
 *
 * Sealed classlar abstract classlardır aynı zamanda. Abstract oldukları için open olamazlar.
 * Sealde classlar abstract oldukları için final olamazlar. Anlamsal olarak zaten saçmadır.
 *
 * Sealed classların nesnesi oluşturulmaz. Constructorları protected ve private olarak bulunur.
 *
 * sealed classları miras alan subclasslar final oldukları için miras alınamazlar. SDK'Ler için önemlidr.
 *
 * Sealed clasin subclasslarının neler olduğu compiletime'da biilinmektedir BUndan dolayı when ve if yapılarında
 * else case'lerini yazmanıza ihtiyac duymazlar
 *
 * Sealed classlar icerisine object tanımlamaları da yapılabilir.
 * Sealed classlar icereisine sadece object tanimi yapiyorsanız, bu kullanım emuration'dan  teknik olarak
 * hiç bir farkkı kalmıyor
 */

//1.kullanım
sealed class Response
class Succes : Response()
class Error : Response()

//2.kullanım
sealed class Response2 {
    class Success2 : Response2()
    class Error2 : Response2()
}


fun handle(response: Response) {
    when (response) {
        is Succes -> {
            // response'dan gelen bilgilerle ui'ini doldur.
        }

        is Error -> {
            // pop-up ile kullaniciya bilgi ver.
        }
    }
}

// bu yanlıştır. enum kullanmanız gerekiyor.
sealed class PaymentOption {
    object Cash
    object Card
    object Transfer
}

enum class PaymentOption2 {
    Cash, Card, Transfer
}

// class Ass : Success()

fun main() {
//    val response = Response()
    val succes = Succes()
    val error = Error()

    handle(succes)
    handle(error)

    println(PaymentOption2.Cash.name)
}