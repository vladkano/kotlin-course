package com.vladkano.kotlincourse.lesson15

import kotlin.math.exp

class Party(val location: String, val attendees: Int) {

    // Метод details, который выводит информацию о вечеринке
    fun details() {
        println("Вечеринка проводится в: $location");
        println("Количество гостей: $attendees")
    }
}

// Основная функция, где будет создан экземпляр класса Party
fun main() {
    // Создаём экземпляр класса Party
    val myParty = Party("Островок надежды", 123)
    // Вызываем метод details для отображения информации о вечеринке
    myParty.details()


    val myEmotion = Emotion("Радость",1)
    myEmotion.express()


    val myMoon = Moon(true,"Full moon")
    myMoon.showPhase()


    val myAutoGoods = AutoGoods("Continental",400.5,4)
    myAutoGoods.wheels()

    val myAutoGoods1 = AutoGoods("Gold",30.0,5)
    myAutoGoods1.bolts()

    val product = Product("Помелло", 99.99, 20)
    println("Название продукта: ${product.name}");
    println("Цена продукта: ${product.price} рублей")
    println("Количество на складе: ${product.quantity} кг")


    val concert = Concert("Pink Floyd", "Стадион Лужники", 3000.0, 50000)
    concert.details()
    concert.buyTicket()
    concert.buyTicket()
    concert.details()

    //доп задание
    // Тестирование
    val rack = Rack(3)
    val shelf1 = Shelf(20)
    val shelf2 = Shelf(30)

    // Добавляем полки
    println("Добавляем полку 1: ${rack.addShelf(shelf1)}") // true
    println("Добавляем полку 2: ${rack.addShelf(shelf2)}") // true

    // Добавляем предметы
    println("Добавляем предмет 'Книга': ${rack.addItem("Книга")}") // true
    println("Добавляем предмет 'Ручка': ${rack.addItem("Ручка")}") // true
    println("Добавляем предмет 'Тетрадь': ${rack.addItem("Тетрадь")}") // true
    println("Добавляем предмет 'Карандаш': ${rack.addItem("Карандаш")}") // true
    println("Добавляем предмет 'Блокнот': ${rack.addItem("Блокнот")}") // false (слишком много предметов)

    // Печать содержимого
    rack.printContents()

    // Удаление предмета
    println("Удаляем предмет 'Ручка': ${rack.removeItem("Ручка")}") // true
    println("Удаляем предмет 'Линейка': ${rack.removeItem("Линейка")}") // false

    // Печать содержимого после удаления
    rack.printContents()

    // Сложное удаление полки
    val remainingItems = rack.advancedRemoveShelf(0)
    println("Оставшиеся предметы после удаления полки: $remainingItems")

    // Печать содержимого после сложного удаления полки
    rack.printContents()
}

class Emotion(val type: String, val intensity: Int) {
    //Метод express,который выводит описание эмоции
    fun express() {
        println("Тип эмоции: $type");
        println("Интенсивность: $intensity")
    }
}

class Moon(val isVisible: Boolean, val phase: String) {
    fun showPhase() {
        println("Видимость луны: $isVisible");
        println("Фаза луны: $phase")
    }
}

class AutoGoods(val name: String, val price: Double , val quantity: Int) {
    fun wheels () {
        println("Фирма: $name")
        println("Стоимость: $price")
        println("Колличество: $quantity")
    }
    fun bolts() {
        println("Фирма: $name")
        println("Стоимость: $price")
        println("Колличество: $quantity")
    }
}


data class Product(
    val name: String,
    val price: Double,
    val quantity: Int
)

class Concert(val band: String,val location: String,val price: Double,val venueCapacity: Int) {
    private var ticketsSold: Int = 49900
    fun details() {
        println("Концерт группы: $band")
        println("Место проведения: $location")
        println("Стоимость: $price рублей")
        println("Вместимость зала: $venueCapacity")
        println("Проданные билеты: $ticketsSold")
    }
    fun buyTicket() {
        if (ticketsSold < venueCapacity) {
            ticketsSold++
            println("Билет куплен! Количество проданных билетов: $ticketsSold")
        } else {
            println("Нет доступных мест!")}
    }}


class Shelf(private val capacity: Int) {
    private val items = mutableListOf<String>()

    fun addItem(item: String): Boolean {
        return if (canAccommodate(item)) {
            items.add(item)
            true
        } else {
            false
        }
    }

    fun removeItem(item: String): Boolean {
        return if (items.contains(item)) {
            items.remove(item)
            true
        } else {
            false
        }
    }

    fun canAccommodate(item: String): Boolean {
        return currentFill() + item.length <= capacity
    }

    fun containsItem(item: String): Boolean {
        return items.contains(item)
    }

    fun getItems(): List<String> {
        return items.toList() // Возвращаем неизменяемый список
    }

    fun currentFill(): Int {
        return items.sumOf { it.length } // Суммируем длины названий
    }

    fun remainingCapacity(): Int {
        return capacity - currentFill() // Остаточная вместимость
    }

    fun printContent(index: Int) {
        println("Полка $index: вместимость = $capacity, оставшаяся вместимость = ${remainingCapacity()}")
        println("Предметы: $items")
    }
}

class Rack(private val maxShelves: Int) {
    private val shelves = mutableListOf<Shelf>()

    fun addShelf(shelf: Shelf): Boolean {
        if (shelves.size < maxShelves && !shelves.contains(shelf)) {
            shelves.add(shelf)
            return true
        }
        return false
    }

    fun removeShelf(index: Int): Boolean {
        return if (index in shelves.indices) {
            shelves.removeAt(index)
            true
        } else {
            false
        }
    }

    fun addItem(item: String): Boolean {
        for (shelf in shelves) {
            if (shelf.addItem(item)) {
                return true
            }
        }
        return false
    }

    fun removeItem(item: String): Boolean {
        for (shelf in shelves) {
            if (shelf.removeItem(item)) {
                return true
            }
        }
        return false
    }

    fun containsItem(item: String): Boolean {
        return shelves.any { it.containsItem(item) }
    }

    fun printContents() {
        for ((index, shelf) in shelves.withIndex()) {
            shelf.printContent(index)
        }
    }

    fun advancedRemoveShelf(index: Int): List<String> {
        if (index !in shelves.indices) return emptyList()

        val remainingItems = mutableListOf<String>()
        val itemsToReallocate = shelves[index].getItems().toMutableList()
        shelves.removeAt(index)

        itemsToReallocate.forEach { item ->
            var placed = false
            for (shelf in shelves) {
                if (shelf.addItem(item)) {
                    placed = true
                    break
                }
            }
            if (!placed) {
                remainingItems.add(item)
            }
        }

        return remainingItems
    }

    fun getShelves(): List<Shelf> {
        return shelves.toList() // Неизменяемый список полок
    }
}




