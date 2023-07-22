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
    val prop: Int  // abstract

    val propertyWithImplementation: String
        get() = "Foo"

//    fun getPropertyWithImplementation(): String{
//        return "foo"
//    }
    fun foo()  {
        print(prop)
    }

    fun foo2()

    //  abstract olabilir
    abstract fun bar()
}

/**
 * Interface'lere tanimlanan property'lerde (field) inital deger alma zorunluluğı yoktur.
 */

interface Named {
    val fullName: String?
//    val fullName: String = "dsad"

    interface Person : Named {
        val firstName: String
        val lastName: String

        override val fullName: String?
            get() = "$firstName $lastName"
    }



    /**
     * Eger implement edilen interface, baska bir interface'i implement ediyorsa
     * ve bu interdace'in uyeleri child interface'de override edilmis ise,
     * Child interface'i implement eden class'da, bu propertyninn
     */


    class Employee : Person {
        override val firstName: String
            get() = TODO("Not yet implemented")
        override val lastName: String
            get() = TODO("Not yet implemented")
        override val fullName: String?
            get() = super.fullName

    }

    /**
     *  Bir class Abstract ise bir interface'i implement ettikten sonra bu interface'in fonksiyonlarını
     *  override etmek zorunda kalmiyor.
     *
     *
     * abstract class Employee : Person {
     *
     * }
     *
     *  Bir interface icerisindeki fonksiyonlardan body'si olanlar override edilmek zorunda değildir
     *  Body'si olmayan tum fonksiyonlar ise class'a implement edildiğinde override edilmek zorunda.
     *
     *  Propertyler (field) de interfacelere tanimlanabilirler.
     *  propertylerden de değer atamasi yapilmamis olanlar zorunlu olarak override edilirler
     *  eger property get fonksiyonu ile bir statik değer geri donunoyrsa, override etme zorunluluğu kalkar.
     *
     *  interface içerisine tanimli ve override edilme zorunluluğu olan propertyler
     *  primary constructor icerisinde de override edilebilirler
     *
     *  body'si olan (override edilme zorunluluğu olmayan) bir interface fonksiyonu override edilirse
     *  override edildiği yerde body'si içerisinde super'i cağirabilir. (çağırmak zorunda değilsiniz)
     */


    class Child(override val prop: Int = 29) : MyInterface {

        //  override edilmesi zorunlu değildir.
        override val propertyWithImplementation: String
            get() = "Implemented Property"

        //  body'si oldugu icin override edilme zorunlulugu yok
        override fun foo() {
            super.foo()
        }
        override fun foo2() {
//            super.foo2() //hata verir
        }

        override fun bar() {
            TODO("Not yet implemented")
        }
    }

    interface A {
        fun foo() {
            print("A")
        }
        fun bar()
    }

    interface B {
        fun foo() {
            print("B")
        }

        fun bar() {
            print("Bar")
        }
    }

    class C : A {
        override fun bar() {
            print("bar")
        }
    }

    /**
     *  Birden fazla interface bir class'a tanimlanabilir.
     *
     *  Birden fazla interface bir class'a tanimlanirken aralarina virgul koyulur.
     *
     *
     *  : isaretinden sonra eklenen yapilarin hangilerinin class (inherittance)
     *  hangilerinin interface (implementation) olduğunu karistirmamak icin
     *  bu yapilarin sonuna bakmaniz lazim. sonunda () parentezlerini goruyorsaniz : 'dan sonra
     *  gelen yapi class'tir (inheritance) miras alma islemi yapiliyordur. () yoksa interface'dir (implement.)
     *  islemi yapılıyor
      */

    open class E() {

    }

    /**
     *  2 farkli interface'in ayni fonksiyonlari olmasi durumunda, bu fonksiyonalrin override edilmesi
     *  sirasinda ayi fonksiyonu 2 kere yazarak override edemeyiz
     *
     *  Eger implement ettigimiz interface'lerin ayni isimde fonksiyonlari bulunuyorsa, tek bir fonksiyon
     *  override islemi yapilir. BUnun icerisinden hangisinin body'sine erismek istiyorsak
     *  o interface'in ismini <> isaretleri arasina yazmamiz gerekiyor.
     *
     *  Eger implement edilen 2 interface de ayni fonksiyonlar varsa bu durumda bodyleri olsada
     *  override eilmeleri zorunludur.
     */

    class D: E(),A,B {
        override fun foo() {
            super<A>.foo()
            super<B>.foo()
        }

        override fun bar() {
            //  super<A>.bar() A interface'inin bar fonksiyonun body'si yok. Dolayisiyla super ile erisiliemez
            super<B>.bar() //   <B> arayuzunu yazmak zorunda kalmiyorsunuz. Buna redundant uyarisi verilir.
            super.bar()
        }
    }
}

/**
 * interface yetenek seti gibidir.
 *
 */

/**  İNTERFACE VS ABSTRACT
 *
 * interface yetenek seti gibidir. Abstract class bir sözleşme gibidir.
 * ikisindede final ve open keywordünü kullanmak anlamsız.
 * içerisinde inital değeri olmayan değişken(field) veya bodysi olmayan fonksiyoon yazabiliriz.
 * istisnalar dışında implement,miras alındıkları durumlarda override edilmek zorunda.
 * open olarak yazdığımız property veya fun override etmek zorunda değiliz.(mümkün olduğunca open ve düz kullanıım yapmammalıyız)
 *
 */