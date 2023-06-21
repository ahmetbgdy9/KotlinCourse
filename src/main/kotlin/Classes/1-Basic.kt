package Classes


// constructor, yazmak  zorunda değilizvisibilty gibi zorunluluklarımız yoksa ,primary constructor
// init bloğu primary constructor'ın çağrımında çalışıyor
// secondary constuctor'ın en sonuna primary constructor'ı işaret etmemiz gerekiyor (this(wheelCount))
class  Car constructor(wheelCount: Int, color: String = "Red") {

    private val mWheelCount: Int
    private val mColor = color

    init {
        mWheelCount = wheelCount
        "primary const. created".printLog()
        "WhellCount : $mWheelCount, Color : $mColor".printLog()
    }

    constructor(
        wheelCount: Int,
        color: String = "Red",
        name: String? = null,
        madeOf: String? = null
    ) : this(wheelCount) {
        "1. secondary const. created".printLog()

        // business logic 1

        if (name == null) {
            //  business logic 2
            return
        }

        if (madeOf == null) {
            // business logic 3
            return
        }

        // business logic 1
    }

    constructor(wheelCount: Int, color: String = "Red", name: String) : this(4) {
        "2. secondary const. created".printLog()
        //  business logic 2
    }

    constructor(wheelCount: Int, color: String, name: String, madeOf: String, isGas: Boolean) : this(4) {

    }
}
fun main() {
    val car0 = Car(3)
    val car1= Car(3,"Black")
    val car2 = Car(3,"Black","BMW")
    val car3 = Car(3,"Blac","BMW","Metal")
    val car4 = Car(3,"Blac","BMW","Metal",true)
}

fun String.printLog() {
    println(this)
    println("-----------------------------")
}