package com.vladkano.kotlincourse.lesson10

//Работа с массивами Array
//Задание 1: Создание и Инициализация Массива
//Создайте массив из 5 целых чисел и инициализируйте его значениями от 1 до 5.
//Задание 2: Создание Пустого Массива
//Создайте пустой массив строк размером 10 элементов.
//Задание 3: Заполнение Массива в Цикле
//Создайте массив из 5 элементов типа Double и заполните его значениями, являющимися удвоенным индексом элемента.
//Задание 4: Изменение Элементов Массива
//Создайте массив из 5 элементов типа Int. Используйте цикл, чтобы присвоить каждому элементу значение, равное его
// индексу, умноженному на 3.
//Задание 5: Работа с Nullable Элементами
//Создайте массив из 3 nullable строк. Инициализируйте его одним null значением и двумя строками.
//Задание 6: Копирование Массива
//Создайте массив целых чисел и скопируйте его в новый массив в цикле.
//Задание 7: Разница Двух Массивов
//Создайте два массива целых чисел одинаковой длины. Создайте третий массив, вычев значения одного из другого.
//Задание 8: Поиск Индекса Элемента
//Создайте массив целых чисел. Найдите индекс элемента со значением 5. Если значения 5 нет в массиве, возвращаем -1.
// Реши задачу через цикл while.
//Задание 9: Перебор Массива
//Создайте массив целых чисел. Используйте цикл для перебора массива и вывода каждого элемента в консоль. Напротив
// каждого элемента должно быть написано “чётное” или “нечётное”.
//Задание 10: Поиск Значения в Массиве по вхождению
//Создай функцию, которая принимает массив строк и строку для поиска. Функция должна находить в массиве элемент,
// в котором принятая строка является подстрокой (метод contains()). Верни найденный элемент из функции в виде строки.

fun main() {
    val number: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    println(number[0]) //Создайте массив из 5 целых чисел и инициализируйте его значениями от 1 до 5.


    val emptyNumber = Array<String>(size = 10) { "" }
    println(emptyNumber[1]) //Создайте пустой массив строк размером 10 элементов.


    val doubleNumber: DoubleArray = doubleArrayOf(1.1, 1.2, 1.3, 1.4, 1.5)
    println(doubleNumber[2]) //Создайте массив из 5 элементов типа Double и заполните его значениями, являющимися удвоенным индексом элемента.

    val intNumber = IntArray(5)
    for (index in intNumber.indices) {
        intNumber[index] = index * 3
        println(intNumber[index]) //Создайте массив из 5 элементов типа Int. Используйте цикл, чтобы присвоить каждому элементу значение, равное его
    }

    val nullableNumber: Array<String?> = arrayOfNulls<String>(3)
    nullableNumber[0] = null
    nullableNumber[1] = "Hello"
    nullableNumber[2] = "kotlin"
//    println(nullableNumber[0])
//    println(nullableNumber[1])
    println(nullableNumber[2]) //Создайте массив из 3 nullable строк. Инициализируйте его одним null значением и двумя строками.

    val numbersInNumbers: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    val numbersCopy = IntArray(numbersInNumbers.size)
    for (i in numbersInNumbers.indices) {
        numbersCopy[i] = numbersInNumbers[i]
        println("${numbersCopy[i]}") //Создайте массив целых чисел и скопируйте его в новый массив в цикле.
    }

    val numbers1 = intArrayOf(10, 20, 30, 40, 50)
    val numbers2 = intArrayOf(5, 10, 15, 20, 25)
    val resultArray = IntArray(numbers1.size)
    for (i in numbers1.indices) {
        resultArray[i] = numbers1[i] - numbers2[i]
        println(resultArray[i]) //Создайте два массива целых чисел одинаковой длины. Создайте третий массив, вычев значения одного из другого.
    }

    val array = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8)
    val index = findIndexOf5(array)
    if (index == -1) {
        println("$index")
    } else {
        println("Индекс элемента со значением 5 равен:$index")
    } //Создайте массив целых чисел. Найдите индекс элемента со значением 5. Если значения 5 нет в массиве, возвращаем -1.

    val numbers4 = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for (number5 in numbers4) {
        val parity = if (number5 % 2 == 0) "чётное" else "нечётное"
        println("$number5 - $parity") //Создайте массив целых чисел. Используйте цикл для перебора массива и вывода каждого элемента в консоль. Напротив
    }

    val array3 = arrayOf("Hello", "World", "Kotlin", "is", "awesome")
    val substring = "is"
    val foundElement = findElementWithSubstring(array3, substring)
    if (foundElement != null) {
        println("'$substring': $foundElement")
    } else {
        println("Элемент не найден") //Создай функцию, которая принимает массив строк и строку для поиска. Функция должна находить в массиве элемент,
    }

}
fun findIndexOf5(array: IntArray): Int {
    var index = 4

    while (index < array.size) {
        if (array[index] == 5) {
            return index
        }
        index++
    }
    return -1
}
fun findElementWithSubstring(array3: Array<String>, substring: String): String? {
    for (element in array3) {
        if (element.contains(substring)) {
            return element
        }
    }
    return null
}







