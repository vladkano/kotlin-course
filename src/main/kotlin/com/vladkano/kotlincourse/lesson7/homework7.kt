package com.vladkano.kotlincourse.lesson7

import com.vladkano.com.vladkano.kotlincourse.count
import com.vladkano.kotlincourse.lesson6.convertTemperature

//Прямой Диапазон:
//
//Напишите цикл for, который выводит числа от 1 до 5.
//Напишите цикл for, который выводит четные числа от 1 до 10.
//Обратный Диапазон:
//
//Создайте цикл for, который выводит числа от 5 до 1.
//Создайте цикл for, который выводит числа от 10 до 1, уменьшая их на 2.
//С Шагом (step):
//
//Используйте цикл for с шагом 2 для вывода чисел от 1 до 9.
//Напишите цикл for, который выводит каждое третье число в диапазоне от 1 до 20.
//Использование До (until):
//
//Используйте цикл for и until, чтобы вывести числа из диапазона 1-9 (9 не включается).
//Напишите цикл for с until, чтобы вывести числа от 3 до 15, не включая 15.

fun mains() {
    for (i in 1..5) {
        println(i) //Напишите цикл for, который выводит числа от 1 до 5.
    }
    for (i in 2..10 step 2) {
        println(i) //Напишите цикл for, который выводит четные числа от 1 до 10.
    }
    for (i in 5 downTo 1) {
        println(i) //Создайте цикл for, который выводит числа от 5 до 1.
    }
    for (i in 10 downTo 1 step 2 ) {
        println(i) //Создайте цикл for, который выводит числа от 10 до 1, уменьшая их на 2.
    }
    for (i in 1..9 step 2) {
        println(i) //Используйте цикл for с шагом 2 для вывода чисел от 1 до 9.
    }
    for (i in 1..20 step 3) {
        println(i) //Напишите цикл for, который выводит каждое третье число в диапазоне от 1 до 20.
    }
    for (i in 1 until 9) {
        println(i) //Используйте цикл for и until, чтобы вывести числа из диапазона 1-9 (9 не включается).
    }
    for (i in 3 until 15) {
        println(i) //Напишите цикл for с until, чтобы вывести числа от 3 до 15, не включая 15.
    }
//    Цикл while:
//
//        Создайте цикл while, который выводит квадраты чисел от 1 до 5.
//    Напишите цикл while, который уменьшает число от 10 до 5. После этого вывести результат в консоль
//            Цикл do...while:
//
//    Используйте цикл do...while, чтобы вывести числа от 5 до 1.
//    Создайте цикл do...while, который повторяется, пока счетчик меньше 10, начиная с 5.

    var count = 1
   while (count <= 5) {
        println(count* count++) // Создайте цикл while, который выводит квадраты чисел от 1 до 5.
    }
    var i = 10
    while (i >= 5) {
        println(i--) //Напишите цикл while, который уменьшает число от 10 до 5. После этого вывести результат в консоль
    }

    var number = 5
    do {
        println(number)
        number--
    } while (number >= 1) //Используйте цикл do...while, чтобы вывести числа от 5 до 1.

    var counter = 5
    do {
        println(counter)
        counter++
    } while (counter < 10) //Создайте цикл do...while, который повторяется, пока счетчик меньше 10, начиная с 5.
//    Использование break:
//
//    Напишите цикл for от 1 до 10 и используйте break, чтобы выйти из цикла при достижении 6.
//
//    Создайте цикл while, который бесконечно выводит числа, начиная с 1, но прерывается при достижении 10.
//    Использование continue:
//
//    В цикле for от 1 до 10 используйте continue, чтобы пропустить четные числа.
//
//    Напишите цикл while, который выводит числа от 1 до 10, но пропускает числа, кратные 3.

    for (i in 1..10){
        if (i == 6) break
        println(i) // Напишите цикл for от 1 до 10 и используйте break, чтобы выйти из цикла при достижении 6.
    }
    var count1 = 1
    while (true) {
        println(count1)
        count1++
        if (count1 > 10) {
            break // Создайте цикл while, который бесконечно выводит числа, начиная с 1, но прерывается при достижении 10.
        }
        for (i in 1..10){
            if (i % 2 == 0) continue
            println(i) //  В цикле for от 1 до 10 используйте continue, чтобы пропустить четные числа.
        }

        var count2 = 1
        while (count2 <= 10){
            if (count2 % 3 == 0) {
                count2++
                continue
            }
            println(count2++) //Напишите цикл while, который выводит числа от 1 до 10, но пропускает числа, кратные 3.
        }
        for (i in 1..10) {
            for (j in 1..10) {
                print(i * j)
                print(" ")
            }
            println()
        }

}}





