package com.vladkano.kotlincourse.lesson10

fun main() {

    val emptySet = setOf<Int>()
    println(emptySet)

    val numberSet = setOf(1, 2, 3)
    println(numberSet)

    val mutableStringSet = mutableSetOf("один", "два", "три")
    println(mutableStringSet)

    val mutableStringSet1 = mutableSetOf("один", "два", "три")
    mutableStringSet1.add("четыре")
    mutableStringSet1.add("пять")
    println(mutableStringSet1)

    val mutableNumberSet = mutableSetOf(1, 2, 3, 4, 5)
    mutableNumberSet.remove(2)
    println(mutableNumberSet)

    val numberSetForLoop = setOf(1, 2, 3, 4, 5)
    for (number in numberSetForLoop) {
        println(number)
    }
    val stringSet = setOf("Kotlin", "Java", "Scala")
    val exists = containsElement(stringSet, "Java") // true
    println(exists)

    val set1 = setOf("Apple", "Banana")
    val set2 = setOf("Cherry", "Banana")
    val combinedSet = mutableSetOf<String>()
    println(set1 + set2)
    for (item in set1) {
        combinedSet.add(item)
    }
    for (item in set2) {
        combinedSet.add(item)
    }

    val setA = setOf(1, 2, 3)
    val setB = setOf(2, 3, 4)
    val intersectionSet = mutableSetOf<Int>()
    for (a in setA) {
        for (b in setB) {
            if (a == b) {
                intersectionSet.add(a)
                println(intersectionSet)
            }
        }
    }

    val setC = setOf("A", "B", "C")
    val setD = setOf("B", "C", "D")
    val differenceSet = mutableSetOf<String>()
    for (c in setC) {
        var found = false
        for (d in setD) {
            if (c == d) {
                found = true
                break
            }
        }
        if (!found) {
            differenceSet.add(c)
            println(differenceSet)
        }
    }

    val stringSetToConvert = setOf("One", "Two", "Three")
    val listFromSet = mutableListOf<String>()

    for (item in stringSetToConvert) {
        listFromSet.add(item)
        println(listFromSet)
    }
}
    fun containsElement(set: Set<String>, element: String): Boolean {
        for (item in set) {
            if (item == element) {
                return true
            }
        }
        return false
    }



