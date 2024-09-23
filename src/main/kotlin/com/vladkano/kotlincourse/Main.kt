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

fun main() {
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

