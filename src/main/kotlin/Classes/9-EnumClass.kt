package Classes


/**
 * Tip guvenligini (type-safety) saglar.
 * kullanim amaci ayni veri kumlerinin gruplanabilir olmasını saglar
 * Opsiyonlarin tamaminin neler oldugunu rahatca gorebilmemizi saglar.
 *
 * abtract, open, inner, saled olamazlar.
 * yapisi geregi zaten final'dirlar. final keyword'u kullanmak redundant uyarisi verir.
 *
 * ozunde class oldukları icin, constructor kullanabilirler ve bu constructor icerisinde veri tutabilirler.
 * java karsiliginda bu enum sabitleri static final class'lar seklinde tutulurlar. BU sayede, kullanırken
 bu sabitlerin nesnesini olusturmak zorunda kalmayiz
 *
 * Enum class larinin nesnesi olsturulamaz.
 *
 * Her enum sabiti final name:String ve final ordinal:Int degiskenlere  default olarak sahiptir.
 name ifadesi, enum'in kendisinin string halini verir
 ordinal ifadesi, enum'daki sabitin index'ini verir ve 0'dan baslar.
 bu degiskenler final olduklari icin, enum sabitleri icerisinde override edilemezler.
 *
 * enum class'lar herhangi bir baska class'i miras alamazlar.
 * enum class'lar herangi bir interface'i implement edebilirler
 *
 * enum class'lar abstract property'ler ya da abstract func.'lar alabilirler
 Bunlari aldiklarinda tum sabitler bu abstract yapilari override etmek zorundadir.
 *
 * bir open function da yazilabilir. open olmasindan dolayi override etne zorunlulugu yoktur.
 Ancak open olarak belirtilen func.'nun body'si olmak zorundadir.
 *
 */


interface TeamsFunctionality {
 fun practice()
}

enum class ColorType {
   RED, BLUE, WHITE, GREEN
}

enum class TeamsType(val starCount: Int) {
 FENERBAHÇE(3),
 GALATASARAY(4),
 BEŞİKTAŞ(3),
 TRABZONSPOR(1)
}

enum class Teams(val starCount:Int) : TeamsFunctionality {
 FENERBAHÇE(3) {
  override fun practice() {
   TODO("Not yet implemented")
  }
 },

 GALATASARAY(4) {
  override fun practice() {
   TODO("Not yet implemented")
  }
 },

 BEŞİKTAŞ(2) {
  override fun practice() {
   TODO("Not yet implemented")
  }
 },

 TRABZONSPOR(1) {
  override fun practice() {
   TODO("Not yet implemented")
  }
 }

}

enum class DaysOfWeek(val dayNumber: Int) {
 Pazartesi(1),
 Sali(2),
 Carsamba(3),
 Persembe(4),
 Cuma(5),
 Cumartesi(6),
 Pazar(7)
}

enum class Sex {
 Male {
  override val typeCount: Int
   get() = TODO("Not yet implemented")

  override fun isOptional() {
   TODO("Not yet implemented")
  }

  override fun log() {
   super.log()
   println("MALE")
  }
 },

 Female {
  override val typeCount: Int
   get() = TODO("Not yet implemented")

  override fun isOptional() {
   TODO("Not yet implemented")
  }
 },

 Other {
  override val typeCount: Int
   get() = TODO("Not yet implemented")

  override fun isOptional() {
   TODO("Not yet implemented")
  }
 };

 abstract val typeCount: Int
 abstract fun isOptional()
 open fun log() {}
 }

fun main() {
 val fb = "FENERBAHÇE"
 val gs = "GALATASARAY"
 val bjk = "BEŞİKTAŞ"
 val ts =  "TRABZONSPOR"

 val pzt = "Pazartesi"
 val sal = "Salı"
 val car = "Çarşamba"
 val per = "Perşembe"
 val cum = "Cuma"
 val cmt = "Cumartesi"
 val paz = "Pazar"

 val male = "MALE"
 val female = "FEMALE"

 println("4 Büyük takımdan birini taziniz : ")
 val team : String = readln()













}



