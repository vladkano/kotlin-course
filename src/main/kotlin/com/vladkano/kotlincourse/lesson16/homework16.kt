package com.vladkano.kotlincourse.lesson16

object ItemType {
    const val LIQUIDS = "liquids"
    const val ALCOHOL = "alcohol"
    const val FRUIT = "fruit"
    const val VEGETABLE = "vegetable"
}

val conversionFactors = mapOf(
    ItemType.LIQUIDS to 0.95,
    ItemType.ALCOHOL to 0.8,
    ItemType.FRUIT to 0.65,
    ItemType.VEGETABLE to 0.55
)

data class Item(
    val name: String,
    val type: String,
    val weight: Int
)

class Section(
    val type: String,
    val capacity: Int
) {
    val items = mutableListOf<Item>()

    fun addItem(item: Item): Boolean {
        val currentWeight = items.sumOf { it.weight }
        if (currentWeight + item.weight <= capacity) {
            items.add(item)
            return true
        }
        return false
    }

    fun findItemByName(name: String): Item? {
        return items.find { it.name == name }
    }

    fun remove(item: Item): Boolean {
        return items.remove(item)
    }

    fun getFreeSpace(): Int {
        return capacity - items.sumOf { it.weight }
    }

    fun formatData(): String {
        return """
        type: $type
        capacity: $capacity
        free: ${getFreeSpace()}
        items:
            ${items.joinToString("\n\t\t") { it.name }}
        """.trimIndent()
    }

    private fun convertWeightToVolume(item: Item): Int {
        return (item.weight / conversionFactors.getValue(item.type)).toInt()
    }
}

class Fridge(val capacity: Int) {
    private val sections = mutableListOf<Section>()

    fun addSection(section: Section): Boolean {
        if (sections.size < capacity) {
            sections.add(section)
            return true
        }
        return false
    }

    fun removeSectionsByType(type: String): Boolean {
        val removedSections = sections.removeAll { it.type == type }
        return removedSections
    }

    fun removeSectionWithRedistribution(section: Section): List<Item> {
        val itemsToRedistribute = section.items.toList()
        section.items.clear()
        sections.remove(section)

        val notPlacedItems = mutableListOf<Item>()
        for (item in itemsToRedistribute) {
            if (!addItem(item)) {
                notPlacedItems.add(item)
            }
        }
        return notPlacedItems
    }

    fun addItem(item: Item): Boolean {
        for (section in sections) {
            if (section.addItem(item)) {
                return true
            }
        }
        return false
    }

    fun findItemByNameAndType(name: String, type: String): Item? {
        return sections.flatMap { it.items }.find { it.name == name && it.type == type }
    }

    fun removeItem(item: Item): Boolean {
        for (section in sections) {
            if (section.remove(item)) {
                return true
            }
        }
        return false
    }

    fun removeAllItemsByName(name: String): Int {
        var count = 0
        sections.forEach { section ->
            val itemsToRemove = section.items.filter { it.name == name }
            count += itemsToRemove.size
            itemsToRemove.forEach { section.remove(it) }
        }
        return count
    }

    fun viewFridge() {
        println(sections.joinToString("\n\n") { it.formatData() })
    }
}

fun main() {
    val fridge = Fridge(5)

    val liquidsSection = Section(ItemType.LIQUIDS, 100)
    val alcoholSection = Section(ItemType.ALCOHOL, 50)
    val fruitSection = Section(ItemType.FRUIT, 80)

    fridge.addSection(liquidsSection)
    fridge.addSection(alcoholSection)
    fridge.addSection(fruitSection)

    val water = Item("Вода", ItemType.LIQUIDS, 20)
    val wine = Item("Вино", ItemType.ALCOHOL, 15)
    val apple = Item("Яблоко", ItemType.FRUIT, 10)

    listOf(water, wine, apple).forEach { item ->
        if (!fridge.addItem(item)) {
            println("Не добавлено: ${item.name}")
        }
    }

    fridge.viewFridge()

    fridge.removeItem(wine)

    fridge.viewFridge()

    val notPlacedItems = fridge.removeSectionWithRedistribution(alcoholSection)
    println("Не удалось разместить следующие предметы: ${notPlacedItems.joinToString(", ")

    { it.name }}")
}
