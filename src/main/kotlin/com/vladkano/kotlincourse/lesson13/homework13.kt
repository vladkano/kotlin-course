package com.vladkano.kotlincourse.lesson13

fun main() {
//     Проверить, что размер коллекции больше 5 элементов. - size
//     Проверить, что коллекция пустая - isEmpty
//     Проверить, что коллекция не пустая - isNotEmpty
//     Взять элемент по индексу или создать значение если индекса не существует - getOrElse
//     Собрать коллекцию в строку - joinToString
//     Посчитать сумму всех значений - sum
//     Посчитать среднее - average
//     Взять максимальное число - maxOrNull
//     Взять минимальное число - minOrNull
//     Взять первое число или null - firstOrNull
//     Проверить что коллекция содержит элемент - contains


//    Отфильтровать коллекцию по диапазону 18-30 - filter
//    Выбрать числа, которые не делятся на 2 и 3 одновременно - filterNot
//    Очистить текстовую коллекцию от null элементов - filterNotNull
//    Преобразовать текстовую коллекцию в коллекцию длин слов - map
//    Преобразовать текстовую коллекцию в мапу, где ключи - слова, а значения - перевёрнутые слова - associate
//    Отсортировать список в алфавитном порядке - sorted
//    Отсортировать список по убыванию - sortedDescending
//    Распечатать квадраты элементов списка - forEach
//    Группировать список по первой букве слов - groupBy
//    Очистить список от дублей - distinct
//    Взять первые 3 элемента списка - take
//    Взять последние 3 элемента списка - takeLast


    fun collectionOfNumbers(numbers: List<Int>): String {
        return when {
            numbers.isEmpty() -> "Пусто"
            numbers.size < 5 -> "Короткая"
            numbers.first() == 0 -> "Стартовая"
            numbers.sum() > 10000 -> "Массивная"
            numbers.average() == 10.0 -> "Сбалансированная"
            numbers.joinToString("").length == 20 -> "Клейкая"
            (numbers.maxOrNull() ?: 0) < -10 -> "Отрицательная"
            (numbers.minOrNull() ?: 0) > 1000 -> "Положительная"
            numbers.contains(3) && numbers.contains(14) -> "Пи***тая"
            else -> "Уникальная"
        }
    }

    println(collectionOfNumbers(listOf())) // Пусто
    println(collectionOfNumbers(listOf(1, 2, 3))) // Короткая
    println(collectionOfNumbers(listOf(0, 1, 2, 3, 4))) // Стартовая
    println(collectionOfNumbers(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20))) // Массивная
    println(collectionOfNumbers(listOf(5, 5, 5, 5, 5, 5, 5, 5, 5, 5))) // Сбалансированная
    println(collectionOfNumbers(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))) // Клейкая
    println(collectionOfNumbers(listOf(-11, -12, -13, -14, -15))) // Отрицательная
    println(collectionOfNumbers(listOf(1001, 1002, 1003, 1004, 1005))) // Положительная
    println(collectionOfNumbers(listOf(3, 1, 2, 5, 7, 14, 9))) // Пи***тая
    println(collectionOfNumbers(listOf(6, 7, 8, 9, 10))) // Уникальная




    val grades = listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)
    val passingGrades = grades.filter { it >= 60 } // Отфильтровать удовлетворительные оценки (>=60)
    val sortedPassingGrades = passingGrades.sorted() // Отсортировать оставшиеся по возрастанию
    val top3PassingGrades = sortedPassingGrades.take(3) // Взять первые 3
    println(top3PassingGrades)




    val list = listOf(
        "Стол", "табурет", "ваза", "Кружка", "Зеркало", "ковер", "Шкаф", "часы", "Люстра", "подушка", "Картина", "столик", "Вазон", "шторы", "Пуф", "книга", "Фоторамка", "светильник", "Коврик", "вешалка", "Подставка", "телевизор", "Комод", "полка", "Абажур", "диван", "Кресло", "занавеска", "Бра", "пепельница", "Глобус", "статуэтка", "Поднос", "фигурка", "Ключница", "плед", "Тумба", "игрушка", "Настенные часы", "подсвечник", "Журнальный столик", "сувенир", "Корзина для белья", "посуда", "Настольная лампа", "торшер", "Этажерка"
    )
    val lowercaseList = list.map { it.lowercase() } // Привести все слова в списке к нижнему регистру
    val groupedList = lowercaseList.groupBy { it[0] }.toSortedMap() // Сгруппировать в каталог по первой букве
    println(groupedList)


    val grades1 = listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)
    val passingGrades1 = grades1.filter { it >= 60 } // Отфильтровать удовлетворительные оценки (>=60)
    val wordLengths = passingGrades1.map { it.toString().length } // Преобразовать оценки в количество букв
    val averageWordLength = wordLengths.average() // Подсчитать среднее значение
    println(String.format("%.2f", averageWordLength)) // Вывести форматированный текст с двумя знаками после запятой


    val numbers = listOf(1, 3, 5, 7, 3, 1, 8, 9, 9, 7)
    val uniqueNumbers = numbers.distinct()
    val sortedUniqueNumbers = uniqueNumbers.sortedDescending()
    val groupedNumbers = sortedUniqueNumbers.groupBy { it % 2 == 0 }
    println("Четные числа: ${groupedNumbers[true]}")
    println("Нечетные числа: ${groupedNumbers[false]}")



    val ages = listOf(22, 18, 30, 45, 17, null, 60)
    val firstValidAge = ages.firstOrNull { it != null && it > 18 }?.toString() ?: "Подходящий возраст не найден"
    println(firstValidAge)
}


