package Classes

/**
 * Interface'lerin Abstract class'lardan en buyuk farki state tutamiyor oluslari.(içerisine bir değişken tanimlayip o değişkende
 * veri saklayamıyoruz)
 *
 * Interface icerisindeki intial degeri olmayan bir property(field) ya da body'si olmayan bir fonk.
 * abstract olarak da tanımlanabilir.
 *
 * interfaceleri anlami gereği final yapamazsiniz. open yazilmasi da gereksizdir(redundant)
 */

interface MyInterface {
    val prop: Int // abstract

//    val propertyWithImplementation: String
//        get() = "Foo"

//    fun getPropertyWithImplementation(): String{
//        return "foo"
//    }

}