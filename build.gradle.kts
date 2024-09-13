plugins {
    kotlin("jvm") version "2.0.10"
}

group = "com.vladkano"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}