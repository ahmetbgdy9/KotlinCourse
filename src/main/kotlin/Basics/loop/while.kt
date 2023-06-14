package Basics.loop

fun main() {
    /**
     *      For + if kullanmak yerine while kullanabilriz performans açısından daha faydalıdır fakat
     *      android projelerin de fark etmez.
     */

    var number = 0

    while (number < 5) {
        print("${number++} , ")
    }

    println("-----------------")

    for (value in 0..5) {
        if (value < 5) {
            print("$value , ")
        }
    }
}