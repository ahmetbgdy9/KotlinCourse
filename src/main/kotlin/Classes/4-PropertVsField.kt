package Classes

// Property; bir değişkenin get ve set fonksiyonlari.
// Kotlinde aslinda bir değişken tanimlamayiz. onun get ve set fonksiyoynlarını tanımlarız

class BankAccount {

    // değişken arka planda private olarak oluşturulur ona ulaşan
    // fonksiyonlar public olarak tutulur
    var balance =  1_000_000

    // private var balance = 1_000_000


/*  fun getBalance() {

    }

    fun setBalance(value: Int) {

    }*/

    private var dept = 4000000
    // private var dept = 4000000

    //  private > protected > internal > public

}

fun main() {
    val bankAccount = BankAccount()
    println(bankAccount.balance)
   // println(bankAccount.getbalance())
    bankAccount.balance = 500_000
  //  bankAccount.setBalance(500_000)
    println(bankAccount.balance)
}