package com.vladkano.kotlincourse.lesson10

fun main() {
    val emptyList = listOf<Int>()
    println(emptyList)

    val stringList = listOf("Hello", "World", "Kotlin")
    println(stringList)

    val mutableList = mutableListOf(1, 2, 3, 4, 5)
    println(mutableList)

    val mutableList1 = mutableListOf(1, 2, 3, 4, 5)
    mutableList1.add(6)
    mutableList1.add(7)
    mutableList1.add(8)
    println(mutableList1)

    val mutableStringList = mutableListOf("Hello", "World", "Kotlin")
    mutableStringList.remove("World")
    println(mutableStringList)

    val numberList = listOf(1, 2, 3, 4, 5)
    for (number in numberList) {
        println(number)
    }

    val anotherStringList = listOf("One", "Two", "Three")
    val secondElement = anotherStringList[1]
    println("Второй эл-т:$secondElement")

    val mutableNumberList = mutableListOf(1, 2, 3, 4, 5)
    mutableNumberList[4] = 10 // Заменяем 5 на 10
    println(mutableNumberList)

    val list1 = listOf("Apple", "Banana")
    val list2 = listOf("Cherry", "Date")
    val combinedList = mutableListOf<String>()
    println(list1 + list2)
    for (item in list1) {
        combinedList.add(item)
    }
    for (item in list2) {
        combinedList.add(item)
    }

    val numbersForMinMax = listOf(3, 5, 1, 8, 4)
    var min = numbersForMinMax[0]
    var max = numbersForMinMax[0]
    for (number in numbersForMinMax) {
        if (number < min) min = number
        if (number > max) max = number
    }
    println("Минимальный: $min, Максимальный: $max")

    val originalList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenList = mutableListOf<Int>()
    for (number in originalList) {
        if (number % 2 == 0) {
            evenList.add(number)
            println(number)
        }
    }
}
