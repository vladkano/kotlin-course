package com.vladkano.kotlincourse.lesson3

import com.vladkano.com.vladkano.kotlincourse.lazyValue
import kotlin.properties.Delegates

//Погрузимся в атмосферу "Hackathon Survival": Марафон, где участники пытаются завершить реальный проект в условиях
// искусственно созданного хаоса (например, часто меняющиеся требования, неожиданные "сбои" в оборудовании)
//Для каждого из полей подбери наилучший способ хранения из известных тебе. Учитывай такие факторы, как изменяемость,
// обязательность, возможность начальной установки, ресурсоёмкие вычисления значения, необходимость проверки
// устанавливаемого значения на валидность или запрет доступа на установку при возможности чтения, публичность и
// приватность данных.


const val nameOfTheEvent: String = "Hackathon Survival" //Название мероприятия

var dateOfTheEvent: String = "13.09.2024" //Дата проведения

val placeOfTheEvent: String = "Платформа ZOOM" //Место проведения


val budget: String by lazy {
    "budget"
} //Подробный бюджет мероприятия, включая расходы на оборудование, кейтеринг и другие операционные расходы.


var numberOfParticipants: Int = 0
    set(value) {
        if (field + value < 200) {
            field += value
        }
    }//Количество участников

var durationOfTheEvent: Double = 2.0 //Длительность хакатона


val contactInformation: String by lazy {
    "info"
} //Контактная информация и условия соглашений с поставщиками пищи, оборудования и других услуг.



var eventStatus: String = ""  //Текущее состояние хакатона


lateinit var listOfSponsors: String //Список спонсоров


var eventBudget: Double = 1000.0 //Бюджет мероприятия



