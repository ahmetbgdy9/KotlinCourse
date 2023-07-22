package Classes

import javax.print.attribute.standard.Media

/**
 * ---Data class olabilme şartları
 * Data class'lar en azindan mutlaka bir parametre almak zorundadir
 * Parametreler mutlaka val ya da var ile tanimlanmak zorundadir.(12 'de ki fonks. erişim için)
 * Data classlar Open, abstract, sealed, inner class yapilamaz
 * Tüm data class'lari final olduğu için final modifer'i redundant uyarisi verir.
 * child class olabilirler ama üst class olaamzlar.
 *
 * ----Düz classlardan farklari
 * equals, hashcode, toString,  copy, componentN fonksiyonlari arka planda default olarak olusturulurlar.
 *
 * Yukaridaki fonksiyonlardan biri override edilirse, oto generate edilen hali yazilmaz.
 *
 * yukarıdaki fonksiyonlar sadece primary const. icerisindeki degiskenlerle calisir
 *
 * componentN fonks sebebiyle destructturing declaration olarak data class'lar set edilebiliyor
 *
 * toString gibi fonksiyonlarda primary const. degiskenleri kullanildigi icin var yada val zorunl u
 *
 * Pair, Triple ozellestirilmis generic data class'lar mevcut
 */


data class News(
    val title: String = "Title",
    val descrition: String,
    val hasMediaContent: Boolean,
    val mediaList: List<Media>
){
    val relatedNewsList : List<News> = arrayListOf()
    override fun toString(): String {
        return "return super.toString()"
    }

    fun log() {
        println("Title : $title, description : $descrition")
    }
}

class NewsData(
    val title: String = "Title",
    val descrition: String,
    val hasMediaContent: Boolean,
    val mediaList: List<Media>
){
    override fun toString(): String =
        "News(title=" + this.title + ", description = " + this.descrition + ", hasMediaContent =" + this.hasMediaContent + ", mediaList=" + this.mediaList

    fun copy(): NewsData {
        return NewsData(title,descrition,hasMediaContent,mediaList)
    }
}

class Media

fun main() {

    val newsOne = News (
        title = "yeni dönem basladi",
        descrition = "egitim basladi",
        hasMediaContent = true,
        mediaList = arrayListOf()
    )

    val newsTwo = NewsData(
        title = "yeni dönem basladi",
        descrition = "egitim basladi",
        true,
        mediaList = arrayListOf()
    )

    val (title, descrition, hasMediaContent, mediaList) = newsOne

//    newsOne.mediaList
//    newsOne.toString()
//    newsOne.hasMediaContent
//    newsOne.descrition

    val newsThree = newsOne.copy(descrition = "Farklı description")
    // düz class kullansaydık böyle yazmak zorunda kalırdık
    val newsFour = News(
        title = newsOne.title,
        descrition = "farklı description",
        hasMediaContent = newsOne.hasMediaContent,
        mediaList = newsOne.mediaList
    )

    newsOne.component1()
    newsOne.relatedNewsList
    newsOne.title

//    newsTwo.equals()
    newsTwo.toString()
    newsTwo.hashCode()
    newsTwo.copy()

    println("Data class tostring : $newsOne")
    println("class tostring : $newsTwo")

    val pair = Pair("Ahmet","Buğday")
    val (firtssad,asdas,asdsa) = Triple("ahmet","buğday",21)

}

/**
 * 1 -> value tuttuğumuz class lar data classlar olacak.
 * 2 -> data classların equals, hashcode, toString,  copy fonksiyonalrı arka planda yazılır
 * 3 -> parametre sayısı kadar component yazılır
 *  bu öz. kullanılması için constructora yazılması gerek, class  içine yazılırsa kullanılmaz
 */

