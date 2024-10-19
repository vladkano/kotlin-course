package com.vladkano.kotlincourse.lesson14

fun main() {
    val testResults = mapOf(
        "test1" to "10s",
        "test2" to "15s",
        "test3" to "20s"
    )
    val totalTime = testResults.values.sumBy { it.dropLast(1).toInt() }
    val averageTime = totalTime / testResults.size
    println("Среднее время выполнения теста: $averageTime секунд")


    val testMetadata = mapOf(
        "test1" to "meta1",
        "test2" to "meta2",
        "test3" to "meta3"
    )
    println("Список всех тестовых методов:")
    testMetadata.keys.forEach { println(it) }


    val testResults1 = mutableMapOf(
        "test1" to "Passed",
        "test2" to "Failed"
    )
    testResults1["test3"] = "Passed"
    println(testResults1)


    val testResults2 = mapOf(
        "test1" to "Passed",
        "test2" to "Failed",
        "test3" to "Passed"
    )
    val successfulTests = testResults2.count { it.value == "Passed" }
    println("Количество успешных тестов: $successfulTests")


    val bugTracking = mutableMapOf(
        "bug1" to "Исправлена",
        "bug2" to "В работе",
        "bug3" to "Новая"
    )
    bugTracking.remove("bug1")
    println(bugTracking)

    val pageTestResults = mapOf(
        "google.com" to "200 OK",
        "amazon.com" to "500 Internal Server Error"
    )
    pageTestResults.forEach { (page, status) ->
        println("Страница: $page, статус: $status")
    }


    val serviceResponseTimes = mapOf(
        "service1" to "100ms",
        "service2" to "200ms",
        "service3" to "300ms",
        "service4" to "400ms"
    )
    val threshold = 250
    val slowServices = serviceResponseTimes.filter { it.value.dropLast(2).toInt() > threshold }
    println("Сервисы с временем ответа выше $threshold мс:")
    slowServices.keys.forEach { println(it) }


    val apiTestResults = mapOf(
        "endpoint1" to "200 OK",
        "endpoint2" to "500 Internal Server Error"
    )
    val endpoint = "endpoint3"
    val status = apiTestResults[endpoint] ?: "Не протестирован"
    println("Статус ответа для $endpoint: $status")


    val testEnvironmentConfig = mapOf(
        "browserType" to "Chrome",
        "platform" to "Windows"
    )
    val browserType = testEnvironmentConfig["browserType"]!!
    println(browserType)


    val immutableTestVersions = mapOf("v1" to "1.0.0", "v2" to "2.0.0")
    val mutableTestVersions = immutableTestVersions.toMutableMap()
    mutableTestVersions["v3"] = "3.0.0"
    println(immutableTestVersions)


    val deviceTestSettings = mapOf(
        "Pixel_3" to "config1",
        "iPhone_12" to "config2",
        "default" to "config3"
    )
    val deviceModel = "Pixel_3"
    val settings = deviceTestSettings[deviceModel] ?: deviceTestSettings["default"]
    println(settings)


    val testErrors = mapOf(
        "err1" to "Ошибка 1",
        "err2" to "Ошибка 2"
    )
    val errorCode = "err3"
    val errorExists = testErrors.containsKey(errorCode)
    println(errorExists)


    val testResults4 = mapOf(
        "TestID_v1" to "Passed",
        "TestID_v2" to "Failed",
        "TestID_v3" to "Skipped"
    )
    val version = "v2"
    val filteredResults = testResults4.filter { it.key.endsWith(version) }
    println(filteredResults)


    val moduleTestResults = mapOf(
        "Модуль 1" to "Passed",
        "Модуль 2" to "Failed",
        "Модуль 3" to "Passed"
    )
    val hasFailedTests = moduleTestResults.any { it.value == "Failed" }
    println(hasFailedTests)


    val existingTestConfig = mutableMapOf(
        "browserType" to "Chrome"
    )
    val newTestConfig = mapOf(
        "platform" to "Windows"
    )
    existingTestConfig.putAll(newTestConfig)
    println(existingTestConfig)



    val bugReports1 = mapOf(
        "id1" to "Ошибка 1",
        "id2" to "Ошибка 2"
    )
    val bugReports2 = mapOf(
        "id3" to "Ошибка 3",
        "id4" to "Ошибка 4"
    )
    val combinedBugReports = bugReports1 + bugReports2
    println(combinedBugReports)


    val tempData = mutableMapOf(
        "test1" to "Результат 1",
        "test2" to "Результат 2"
    )
    tempData.clear()
    println(tempData)


    val testResults5 = mapOf(
        "test1" to "Passed",
        "test2" to "Failed",
        "test3" to "Skipped"
    )

    val filteredResults2 = testResults5.filter { it.value != "Skipped" }
    println(filteredResults2)


    val testConfigurations = mutableMapOf(
        "config1" to "устаревшая",
        "config2" to "актуальная"
    )
    testConfigurations.remove("config1")
    println(testConfigurations)


    val testResults6 = mapOf(
        "test1" to "Passed",
        "test2" to "Failed",
        "test3" to "Skipped"
    )
    val report = testResults6.map { "${it.key}: ${it.value}" }
    println(report)


    val mutableTestResults = mutableMapOf(
        "test1" to "Passed",
        "test2" to "Failed"
    )
    val immutableTestResults = mutableTestResults.toMap()
    println(immutableTestResults)


    val testResultsById = mapOf(
        "test1" to "1.0",
        "test2" to "1.1"
    )
    val getNameById: (String) -> String = { "Тест $it" }
    val testResultsByName = testResultsById.map { it.key to getNameById(it.key) }
    println(testResultsByName)


    val performanceScores = mutableMapOf(
        "v1" to 50,
        "v2" to 60
    )
    performanceScores.replaceAll { key, value -> (value * 1.1).toInt() }
    println(performanceScores)


    val compilationErrors = mutableMapOf<String, String>()
    if (compilationErrors.isEmpty()) {
        println("Нет ошибок компиляции")
    }


    val loadTestResults = mapOf(
        "test1" to "Passed",
        "test2" to "Failed"
    )
    if (loadTestResults.isNotEmpty()) {
        println("Результаты нагрузочного тестирования есть")
    }


    val testResults7 = mapOf(
        "test1" to "Passed",
        "test2" to "Failed"
    )
    val allTestsPassed = testResults7.all { it.value == "Passed" }
    if (allTestsPassed) {
        println("Все тесты пройдены успешно")
    }


    val testResults8 = mapOf(
        "test1" to "Passed",
        "test2" to "Error"
    )
    val hasError = testResults8.any { it.value == "Error" }
    if (hasError) {
        println("Есть хотя бы один тест с ошибкой")
    }


    val serviceTestResults = mapOf(
        "service1_optional" to "Error",
        "service2" to "Passed",
        "service3_optional" to "Failed"
    )

    val filteredResults3 = serviceTestResults.filter { it.key.contains("optional") && it.value != "Passed" }
    if (filteredResults3.isNotEmpty()) {
        println("Найдены тесты с ошибками и названием, содержащим \"optional\"")
    }
}