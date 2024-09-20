package com.vladkano.kotlincourse.lesson5

//Простой уровень
//(12 / 3 > 3) && (5 * 2 == 10) пример решения: true && true = true
fun main1(){
val example = (12 / 3 > 3) && (5 * 2 == 10)
    println(example)
    }
val result: String = "true && true = true"

//(14 - 4 <= 10) || (6 / 2 != 3)
val example1 = (14 - 4 <= 10) || (6 / 2 != 3)
val result1: String = "true || false = true"

//(9 + 1 == 10) && (8 % 2 == 0)
val example2 = (9 + 1 == 10) && (8 % 2 == 0)
val result2: String = "true && true = true"

//(7 - 2 < 5) || (4 * 3 != 12)
val example3 = (7 - 2 < 5) || (4 * 3 != 12)
val result3: String = "false || false = false"

//(18 / 6 >= 3) && (5 + 5 == 10)
val example4 = (18 / 6 >= 3) && (5 + 5 == 10)
val result4: String = "true && true = true"

//(11 % 3 != 2) || (9 - 3 == 6)
val example5 = (11 % 3 != 2) || (9 - 3 == 6)
val result5: String = "false || true = true"

//(5 * 2 < 11) && (14 / 2 == 7)
val example6 = (5 * 2 < 11) && (14 / 2 == 7)
val result6: String = "true && true = true"

//(8 + 2 <= 10) || (7 % 2 != 1)
val example7 = (8 + 2 <= 10) || (7 % 2 != 1)
val result7: String = "true || false = true"

//(16 / 4 > 3) && (3 + 4 == 7)
val example8 = (16 / 4 > 3) && (3 + 4 == 7)
val result8: String = "true && true = true"

//(10 % 2 == 0) || (5 - 3 != 1)
val example9 = (10 % 2 == 0) || (5 - 3 != 1)
val result9: String = "true || true = true"


//
//
//Сложный уровень
//((4 * 3) < 13) && !(8 / 4 == 2) || (10 % 3 != 1)
val example10 = ((4 * 3) < 13) && !(8 / 4 == 2) || (10 % 3 != 1)
val result10: String = "(true && true) || false = true"

//((14 - 5) > 8) || (9 / 3 == 3) && !(7 + 0 != 7)
val example11 = ((14 - 5) > 8) || (9 / 3 == 3) && !(7 + 0 != 7)
val result11: String = "true || (true && true) = true"

//((2 + 3) <= 5) && (16 / 4 == 4) || !(6 % 2 == 0)
val example12 = ((2 + 3) <= 5) && (16 / 4 == 4) || !(6 % 2 == 0)
val result12: String = "(true && true) || false = true"

//((5 * 3) != 15) && !(10 / 2 > 4) || (4 + 4 == 8)
val example13 = ((5 * 3) != 15) && !(10 / 2 > 4) || (4 + 4 == 8)
val result13: String = "(false && false) || true = true"

//((12 / 4) >= 3) || (7 % 2 != 1) && !(3 + 3 == 6)
val example14 = ((12 / 4) >= 3) || (7 % 2 != 1) && !(3 + 3 == 6)
val result14: String = "true || (false && false) = true"

//
//
//Продвинутый уровень
//(var f = 6; --f >= 5) || ((3 * 2 == 6) && (9 - 4 != 5))
val result15: String = "true || (true && false) = true"
//((var g = 0; g++ != 0) && (4 + 2 == 6)) || (5 / 1 == 5)
val result16: String = "(false && true) || true = true"
//(var h = 7; h-- > 6) || (8 + 1 == 9) && (3 % 2 != 1)
val result17: String = "(true || true) && false = false"
//((var i = 5; i++ == 5) || (2 * 2 != 4)) && (10 / 2 == 5)
val result18: String = "(true || false) && true = true"
//(var j = 4; j-- < 4) && ((6 + 0 == 6) || (5 % 2 != 1))
val result19: String = "false && (true || false) = false"


//Контекст: Вы изучаете физическое явление затухания звука в помещении.
// У вас есть измеренное значение начальной интенсивности звука, но из-за ограничений оборудования
// данные о коэффициенте затухания иногда могут быть неизвестны.
//Задача: Рассчитать предполагаемую интенсивность звука после затухания.
// Интенсивность звука после затухания пропорциональна начальной интенсивности,
// умноженной на коэффициент затухания. Если коэффициент затухания неизвестен,
// использовать стандартное значение 0.5.




fun soundАttenuation(initialIntensity: Double, attenuationCoef: Double? = null): Double {
    val defaultVolume = attenuationCoef ?: 0.5
    return initialIntensity * defaultVolume
}

fun main() {
    val initialIntensityCoef = 100.0
    val attenuationCoeff = 0.4
    val result = soundАttenuation(initialIntensityCoef, attenuationCoeff)
    println(result)


}
