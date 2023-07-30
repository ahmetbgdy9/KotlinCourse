package Classes
//**Polimorfizm : üst classa yazdığın bir fonksiyon veya degiskenini override ederek child classlarda
// görevini değiştirip yeni bir görev tanımlamak

//  Java da tüm class lar default olarak open, kotlin de ise final durumdadır.
//  Eğer bir sınıfı miras almak istersek o sınıfın önüne "open" keywordunu eklemeliyiz.
//  inheritance işlemleri için open ve final erişim düzenleyicilerini kullanırız

//  Class ları open yaparsak miraslayabiliriz, fonksiyon veya değişkeni open yaparasak override edebiliriz.
//
open class Shape(val name: String) {
    var mColor: String = ""
    open var mEdgeCount: Int = 0

    constructor(name: String, color: String) : this(name) {
        mColor = color
    }

    constructor(name: String, color: String, edgeCount: Int) : this(name) {
        mColor = color
        mEdgeCount = edgeCount
    }

    open fun drawShape() {
        println("Name : $name")
        println("Color : $mColor")
        println("EdgeCount : $mEdgeCount")
    }

    fun calculateArea(): Int = if (mEdgeCount != 0) {
        mEdgeCount * mEdgeCount
    } else {
        0
    }
}

class Rectangle(name: String) : Shape(name) {

    fun main() {
        mColor
        mEdgeCount
        drawShape()
        calculateArea()
    }

    override var mEdgeCount: Int
        get() = 1238489
        set(value) {}

    override fun drawShape() {
//      drawShape()
//      this.drawShape()
        super.drawShape()

        calculateArea()

        val rectangle = """"
            *************
            *           *
            *           *
            *************
        """.trimMargin()

        println(rectangle)
    }
}

class Circle(name: String, color: String) : Shape(name, color) {
    override fun drawShape() {
        super.drawShape()

        val circle = """"
               .....
            ddddddddddd
         dd            dd
       dd               dd
      dd                 dd
     dd                   dd  
    dd                     dd    
   dd                       dd
  dd                         dd 
  dd                         dd  
  dd                         dd
   dd                       dd
    dd                     dd
     dd                   dd
      dd                 dd 
       dd               dd   
         dddddddddddddd
         
         """".trimIndent()
        println(circle)
    }
}


open class Square(name: String, color: String, edgeCount: Int) : Shape(name, color, edgeCount) {
    final override fun drawShape() {
        val square = """
            **********
            *        *
            *        *
            *        *
            **********
        """.trimIndent()
        println(square)
    }
}

fun main() {
    val shape = Shape("Shape")
    val rectangle = Rectangle("Rectangle")
    val circle = Circle("Circle", "Magenta")
    val square = Square("Square", "Cyan", 4)

    shape.drawShape()

    rectangle.drawShape()
    circle.drawShape()
    square.drawShape()
}
