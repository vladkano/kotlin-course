package com.vladkano.kotlincourse.lesson9
import java.util.Random




fun main(args: Array<String>) {

    val name = "Александр"
    val lastName = "Молокович"
    val age = "30?"
    // Создаём объект Random
    val random = Random()

    // Генерируем случайный возраст в годах
    var ageYears = random.nextInt(101) + 1

    // Вычисляем возраст в днях, минутах и т.д.
    val ageDays = ageYears * 365
    val ageMinutes = ageDays * 24 * 60

    // Используем do-while для вывода поздравления в цикле
    do {
        println("Дорогой $name $lastName, поздравляю тебя с $ageYears-летием!")
        println("Это $ageDays дней прекрасной жизни или $ageMinutes минут интересных событий!")
        when (ageYears) {
            in 1..15 -> println("Я очень удивлен, что ты понимаешь Котлин")
            in 15..25-> println("Борода делает тебя взрослее")
            in 25..35 -> println("Желаю тебе здоровья и ярких впечатлений!")
            in 35..50 -> println("Ну,врешь пади,тебе правда столько?!")
            else -> println("Ты искусственный интелект")
        }


        // Используем for для вывода возраста в разных форматах
        for (i in 1..3) {
            when (i) {
                1 -> println("Твой возраст в годах: ${ageYears}")
                2 -> println("Твой возраст в днях: ${ageYears * 365}")
                3 -> println("Твой возраст в минутах: ${ageYears * 365 * 24 * 60}")
            }
        }

        // Используем substring для получения подстроки из возраста
        val nameSubstring = name.substring(0, 5)
        val nameSubstring1 = name.substring(6,8)
        val nameValue = nameSubstring + " " + nameSubstring1

        // Используем replace для замены подстроки в возрасте
        val ageReplaced = age.replace("3", "2")

        // Используем split для разделения возраста на подстроки
        val ageSplit = age.split("?")

        // Используем length для получения длины возраста
        val ageLength = age.length

        // Используем uppercase для преобразования имени в верхний регистр
        val nameUppercase = name.uppercase()

        // Используем lowercase для преобразования фамилии в нижний регистр
        val lastNameLowercase = lastName.lowercase()

        // Используем trim для удаления пробелов из возраста
        val ageTrimmed = age.trim()

        // Используем startsWith для проверки, начинается ли возраст с подстроки
        val ageStartsWith = age.startsWith("3")

        // Используем endsWith для проверки, заканчивается ли возраст подстрокой
        val ageEndsWith = age.endsWith("0")

        // Используем contains для проверки, содержит ли возраст подстроку
        val ageContains = age.contains("?")

        // Используем repeat для повторения возраста указанное количество раз
        val ageRepeated = age.repeat(3)

        // Выводим все полученные значения
        println("Подстрока возраста: $nameValue")
        println("Заменённый возраст: $ageReplaced")
        println("Разделённый возраст: ${ageSplit.joinToString("! ")}")
        println("Длина возраста: $ageLength")
        println("Имя в верхнем регистре: $nameUppercase")
        println("Фамилия в нижнем регистре: $lastNameLowercase")
        println("Обрезанный возраст: $ageTrimmed")
        println("Возраст начинается с '3': $ageStartsWith")
        println("Возраст заканчивается на '0': $ageEndsWith")
        println("Возраст содержит '?': $ageContains")
        println("Повторённый возраст: $ageRepeated")


        // Запрашиваем ввод нового возраста
        print("Введи новый возраст: ")
        ageYears = readLine()?.toInt() ?: 100

    } while (ageYears != -1)

}