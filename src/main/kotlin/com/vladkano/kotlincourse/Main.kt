@file:Suppress("UNREACHABLE_CODE")

package com.vladkano.com.vladkano.kotlincourse

import java.nio.DoubleBuffer

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main1() {
    val name = "Kotlin"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, " + name + "!")

    for (i in 1..5) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        println("i = $i")
    }
}
val name: String = "Alice" //постоянная

var age: Double = 30.0 //изменяемая

const val PI: Double = 3.14 //константа для числа

lateinit var userInfo: String //поздняя инициация

val lazyValue: String by lazy {
    "Hello"
} //необязательное поле

var speed: Double? = null //неизвестное значение

var count: Int = 0
    get() = field
    set(value){
        if (value >= 0) field = value
    } //если значение придет 1 то филд будет 1,если -1,то будет ошибка

val chasis: String = "car"
var colour: String = "gold"
var distance: Double = 0.0
lateinit var owner: String
const val WHEELS: Int = 4
val report: String by lazy {
    "report"
}
var fuel: Double = 0.0
    get() = field
    set(value){
        if (value >= 0) field += value
    }
var member: Int = 100
get() = field
set(value){
if (value >= 0) field -= value }


//lesson4
val myInt: Int = 1231231
val myFloat: Float = 0.6F
val myLong: Long =  2_123_1231_123L
val myShort: Short = 2345
val myByte: Byte = 22
val myDouble: Double = 2.0

val myBoolean: Boolean = true //false
val myChar: Char = '#'
val text: String = "text"

val numbers: Array<Int> = arrayOf(1, 2, 3)
val strings: MutableList<String> = mutableListOf("one", "two", "free")
val doubles: Set<Double> = setOf(11.1 , 22.2)

val keysToValues: Map<String, String> = mapOf("ключ1" to "значение1", "ключ2" to "значение2")

val anyfing: Any = false

fun printMassages(massages: String): Unit {
    println(massages)
}

fun fail(massages: String): Nothing {
    throw IllegalArgumentException(massages)
}

//lesson5
fun mains() {
    val sum = 10 + 5 //15
    val diff = 10 - 5 //5
    val product = 10 * 5 //50
    val quotient = 10 / 5 //2
    val remainder = 10 % 5 //0
    val esEqual = 5 == 5 //(true)
    val isNotEqual = (5 != 4) //true
    val isGreater = (5 > 3) //true
    val isLesser = (5 < 4) // false
    val isGreaterOrEqual = (5 >= 6) //false
    val isLesserOrEqual = (5 <= 5) //true
    val andResult = true && true //true // и
    val andResult1 = true && false //false
    val andResult2 = false && false //false
    val orResult = true || false // true //или
    val orResult1 = false || false // false
    val orResul2 = true || true // true
    val notResult =  !(5 > 3) //false
    var number = 5
    number += 5 //number = number + 5 //10
    number -= 3 //number = number - 3 //2
    number /= 2 //деление
    //5+5-3 = 7
    number ++ //сделает +1 от последнего
    number -- //сделает -1 от последнегго
    ++number
    println(number++) //будет +1 к последнему значению
    println(++number) //будет +1 к изначальному числу

    //приоритеты операций
    //() - сначала в скобках
    //если операции все имюется ,то сначала умножение и деление,а потом сложение и вычитание
    val example = ((8 + 1 >= 9) || (6 - 2 != 4) && (2 * 3 == 6))
                //      true    ||    false     &&      true = true


    var name: String? = null
    val result = name ?: "Unknown" //либо налл либо анкнаун
              //         throw IllegalArgumentException("Не может быть null")











    println(number)
}

fun main6() {
    printVolume(null)
}
fun printVolume(userVolume: Int?) {
    val defaultVolume = 30
    println(userVolume ?: defaultVolume)
}

fun main3() {
   printPrice(123.8 , null)
    printPrice(100.0 , 10)
}
fun printPrice(price: Double, s: Int?) {
    val coef = (100 - (s ?: 0))/100.0
    println(price * coef)
}
fun main4() {
    printSiteLang("Rus")
    printSiteLang(null)
}
fun printSiteLang(lang: String?) {
    val defaultLang = "Eng"
    println(lang?: defaultLang)
}

fun main5() {
   printBox("")
    printBox(null)
}
fun printBox(box: String?) {
    println(box ?: throw Exception("Box is empty"))
}





//lesson6
fun main18() {
    val number = 6
    if(number > 5) { //если номер больше 5,а если меньше, то иначе..
        println("Число больше 5") //печатаем
    }
    else{ //иначе
    println("Число меньше или равно 5")


        val numbers = 0
        if(number > 5) { //если номер больше 5,а если меньше, то иначе..
            println("Число больше 5") //печатаем
        }
        else if (number < 0) {
            println("Число меньше 0")

        }
        else{ //иначе
            println("Число меньше или равно 5")

            //диапазон
            val intRange: IntRange = 1..10 //возрастающий диапазон от 1 до 10 включительно
            val intRangeUntil = 1 until 10 //возрастающий диапазон от 1 до 9
            val downTo = 10 downTo 1 //диапазон наоборот от 10 до 1 включительно
            val charRange: CharRange = 'd' .. 's' //диапазон символов от кода d до кода s
            val inRange = 2 in intRange //2 в диапазоне от 1 до 10
            val notInRange = 20 !in intRange //20 не в диапазоне от 1 до 10

//            when (значение) {
//                выражение1 -> {/*код*/}
//                    выражение2 -> {/*код*/}
//                else -> {/*код*/}
//            }
            //если проверки 2 то иф элс если больше то лучше вен
            //если у нас много проверок и много выводов информации,то лушче иф элс
            val score = 95
            when {
                score in 90..100 -> println("Отлично")
                score in 80..89 -> println("Хорошо")
                score in 70..79 -> println("Удовлетворительно")
                else -> println("Нужно подучить")
            }
            val a = 3
            val b = 4
            val max = if (a > b) a else b //если условие верно то а будет числом макс,а если неверно то б будет числом макс
            fun getTimesOfDay(hour: Int) {
                if (hour >= 0 && hour < 5)
                if (hour in 5..11)
                if (hour in 12..16)
                return getTimesOfDay(hour)
                println(hour)
            }
            }

            }
        }
//lesson7
fun mainp() {
    val range = 1..10
    for (i in listOf(1,2,3)) { //можно и диапазон 1..3 или listOf("test", "test1") иди i in 1..10 step 2 - с шагом 2 будет счиать
        //тело цикла
        println(i) //результат 1 2 3
    }
    for (i in 1..10 step 5) {
        println(i)
    }
    for (i in 10 downTo 1) {
        println(i)
    }
    for (i in 1..10) {
        println(i)
    }
    for (i in 1 until 10 step 5) {
        println(i)
    }
    for (i in range) {
        println(i)
    }
    while (true) {
        println("+") //бесконечный цикл +++++++++++
    }
//    var counter = 10
//    while (counter-- > 0) {
//        println(counter) - 9...0
//    }
    do { println("+") //думмаем

    } while (false) //делаем

    for (i in 1..10 ) {
        if (i == 2) continue
        if (i == 7) break
        println(i)
    }
    for (i in 1..5){
        println(i*i) //квадраты числе от 1 до 5
    }
    for (i in 10 downTo 1) {
        println(i)
    }
    for (i in 20 downTo 2 ){
        if (i % 2 == 0)
            println(i) //числа с шагом 2 будут выводиться
    }
    for (i in 1..30 step 3) {
        println(i) //шаг 3
    }
    var count = 1
    var sum = 0
    while (count <= 10) {
        sum = count++ + sum
    }
    println(sum)


}

//lesson8
fun main9() {


    val simpleString = "Это простая строка"
    val firsName = "Иван"
    val lastName = "Иванов"
    val fullName = "$firsName $lastName"
    val age = 30
    val greeting = "Привет! Меня зовут $fullName, и мне $age лет"
    println(greeting)
    val person = Person("Алексей", 25)
    val introduction = "Привет! Меня зовут $person.name , и мне ${person.age} лет"
    val details = "Здесь находятся ${getDetails()}"
    println(details)
    val x = 10
    val y = 20
    val resultString = "Результат сложения x и y равен ${x + y}"
}
class Person(val name: String ,val age: Int)

fun getDetails(): String {
    return "очень интересны детали"
}

fun mains2() {
    val originalString = "Kotlin is fun"
//   val subString = originalString.substring(7) откуда начинать (7 буква)
    val subString2 = originalString.substring(3,6) //кусочек из сообщения (начинаем с 0) и 6 не включительно,а 3 вкключительно
    val replaceString = originalString.replace("n", "w") //заменяет одну букву на другую
    val splitString = originalString.split("") //делит обьекты,в данном случае через пробел
    val length = "Hello".length //5 букв
    val upper = "hello".uppercase() //переводит в верхний регистр
    val lower = "HELLO".lowercase() //в нижний
    val trimmed = " hello ".trim() //убирает лишние наружние пробелы,а так же может убрать символ через "h"
    val starts = "Kotlin".startsWith("Kot") //начинается ли страка с "" - true
    val end = "Kotlin".endsWith("lin") //заканчивается ли с
    val contains = "Hello".contains("ell") //проверяет есть ли ell
    val e: String? = null
    val empty = e.isNullOrEmpty() //проверяет null ли конкретный обьект (нет вообще ничего)
    val blank = "  ".isNullOrBlank() //здесь есть пробел,но будет true
    val repeat = "ab".repeat(3) //повторит 3 раза
    val letter = originalString[5] //вернет букву n - 5 по счету
    val indexOfChar = "Kotlin".indexOf("t") //выведет цифру 2,место ,на котором буква t
    val indexOfWord = "Lotlin is the best language".indexOf("best") // вхождение по целой строке начинается на 14 индексе
    val backReverse = "nilkoT".reversed() //вернет наоборот
    val multiLineString = """
             первая строка
             вторая строка
             третья строка
        """.trimIndent() //каждую строку отчищает от пробелов слева
    val string = "Sweet summer child"
    val subString = string.substring(6) //6 индекс - с него начнет попадать в вывод
    val subString1 = string.substring(6,12) //стартовый и конечный индекс

    println(subString)
    val name = "Алексей"
    val city = "Москва"
    val age = 32
    val friendCount = 1052
    val rating = 4.948
    val balance = 2534.75856
    val text = """
        Имя: %s 
        Город: %s
        Возраст: %d
        Количество друзей: %,d
        Рейтинг пользователя: %.1f
        Баланс счета: $%,.2f
    """.trimIndent()
    println(text.format(name, city, age, friendCount, rating, balance)) } //%s - строка, d - число, f - плавающая точка, .d - точка разбивает (делает пробел) на тысячи, .1 - точка это знак после запятой а 1 это кол-во знаков

//lesson10 массивы
fun main() {
    val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    val doubles: DoubleArray = doubleArrayOf(1.1, 1.2, 1.3)

    val emptyArray = Array(5) { "" } //может быть { 1 } то есть int
    val emptyNullableArray: Array<Int?> = arrayOfNulls<Int>(5)

    val readOnlyList: List<String> = listOf("a", "b", "c") //лист оф создает список неизменяемых эллеметнов
    val mutableList: MutableList<String> = mutableListOf("a", "b", "c") //изменяемы список

    val numbersSet: Set<Int> = setOf(1, 2, 3, 4, 5) //все эл-ты множества уникальны
    val mutableNumberSet: Set<Int> = mutableSetOf(1, 2, 3, 4, 5)

    val set = setOf("k", "o", "t", "l", "i", "n")
    for (letter in set) {
        println("| $letter |")
    }

    val list = listOf(32, 53,1, -76)
    for (index in list.indices) {
        if (index == list.lastIndex) {
            println(list[index] + list[0])
        } else {
            println(list[index] + list[index + 1])
        }
    }

    var index = list.lastIndex
    while (index >= 0) {
        println("'${list[index--]}'")
    }

    val number = Array(100) {0}
    println(number[0])

    val numberDouble = doubleArrayOf(1.0, 2.0, 3.0, 4.0, 5.0)
    println(numberDouble[2])

    val number0 = Array(10) { 0 }
    number0[0]=10
    for (i in number0.indices) {
        number0[i]
        println(i)
    }
}
