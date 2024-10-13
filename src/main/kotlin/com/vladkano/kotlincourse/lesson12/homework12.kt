
package com.vladkano.kotlincourse.lesson12

fun mains() {


    fun noArgsNoReturn() {
        println(noArgsNoReturn())
    }

    fun sum(a: Int, b: Int): Int {
        return sum(1, 2)
    }

    fun printString(s: String) {
        println(printString("null"))
    }

    fun average(numbers: List<Int>): Double {
        return (average(listOf(1)))
    }

    fun nullableStringLength(s: String?): Int? {
        return nullableStringLength("nullable")
    }

    fun nullableDouble(): Double? {
        return nullableDouble()

    }

    fun nullableList(list: List<Int?>?) {
        println(nullableList(null))
    }

    fun intToNullableString(i: Int): String? {
        return intToNullableString(1)
    }

    fun nullableStrings(): List<String?>? {
        return nullableStrings()
    }

    fun nullableBoolean(s: String?, i: Int?): Boolean? {
        return nullableBoolean("s", 1)
    }

    //Рабочий код

    fun multiplyByTwo(number: Int): Int {
        return number * 2
        println(multiplyByTwo(5))
    }

    fun isEven(number: Int): Boolean {
        return number % 2 == 0
        println(isEven(5))
    }

    fun printNumbersUntil(n: Int) {
        if (n < 1) return
        for (i in 1..n) {
            println(i)
        }
        println(printNumbersUntil(7))
    }

    fun findFirstNegative(numbers: List<Int>): Int? {
        val firstNegative = numbers.firstOrNull { it < 0 }
        println(firstNegative)
        return firstNegative
    }

    fun processList(strings: List<String?>) {
        for (string in strings) {
            if (string != null) {
                println(string)
            } else {
                return
            }
        }
    }

}
    //рефакторинг

        fun drawRectangle(width: Int, height: Int) {
        if (width <= 0) throw IllegalArgumentException("width должно быть положительным и больше нуля")
        if (height <= 0) throw IllegalArgumentException("height должно быть положительным и больше нуля")

        // Верхняя граница
        var topLine = "+"
        for (i in 1 until width - 1) {
            topLine += "-"
        }
        topLine += "+\n"
        print(topLine)

        // Боковые границы
        for (i in 1 until height - 1) {
            var middleLine = "|"
            for (j in 1 until width - 1) {
                middleLine += " "
            }
            middleLine += "|\n"
            print(middleLine)
        }

        // Нижняя граница
        var bottomLine = "+"
        for (i in 1 until width - 1) {
            bottomLine += "-"
        }
        bottomLine += "+\n"
        print(bottomLine)
    }
// исправленная часть
fun main2() {
    drawRectangle3(5, 3)
}
fun drawRectangle3(width: Int, height: Int) {
    if (width <= 0 || height <= 0) throw IllegalArgumentException("Ширина и высота должны быть положительными и больше нуля")

    val topAndBottomLine = drawHorizontalLine(width)
    val middleLines = (1 until height - 1).map { drawVerticalLine(width) }

    println(topAndBottomLine)
    middleLines.forEach { println(it) }
    println(topAndBottomLine)
}

private fun drawHorizontalLine(width: Int) = "+${"-".repeat(width - 2)}+"

private fun drawVerticalLine(height: Int) = "|${" ".repeat(height - 2)}|"


//доп задание
fun main() {
    println(printMap(5,10))
}
fun printMap(xSize: Int, ySize: Int) {
    if (xSize == 0) throw IllegalArgumentException("xSize не должно быть равным нулю")
    if (ySize == 0) throw IllegalArgumentException("ySize не должно быть равным нулю")
    val formatterSize = " $xSize".length
    val xRange = if (xSize > 0) {
        0..xSize
    } else {
        0 downTo xSize
    }
    val yRange = if (ySize > 0) {
        0..ySize
    } else {
        0 downTo ySize
    }
    print(" ".repeat(formatterSize))
    for (i in xRange) {
        print("%${formatterSize}s".format(i))
    }
    println()
    for (i in yRange) {
        print("%${formatterSize}s".format(i))
        for (j in xRange) {
            val m = i * j
            val result = when {
                m % 2 == 0 -> if (m % 3 == 0) "." else "*"
                m % 5 == 0 -> if (i < 0) "-" else "+"
                else -> "?"
            }
            print("%${formatterSize}s".format(result))
        }
        println()
    }
}







