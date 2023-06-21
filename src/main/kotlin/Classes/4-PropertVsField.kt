package Classes

class BankAccount {
    var balance =  1_000_000
        get() {


            return field //baking field
        }
        private set(value) {
            field = value
        }

    fun uyeFonksiyon() {
        balance
    }
}

fun main() {
    val bankAccount = BankAccount()
  //  bankAccount.balance
  //  bankAccount.balance = 500_000
}