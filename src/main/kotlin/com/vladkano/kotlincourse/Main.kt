package com.vladkano.com.vladkano.kotlincourse

import java.nio.DoubleBuffer

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
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