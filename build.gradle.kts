import org.jetbrains.dokka.gradle.DokkaTask

/*
 * This file was generated by the Gradle 'init' task.
 *
 * This is a general purpose Gradle build.
 * To learn more about Gradle by exploring our Samples at https://docs.gradle.org/8.7/samples
 */

plugins {
    kotlin("jvm") version "2.0.0"
    id("org.jetbrains.dokka") version "1.9.20"
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

kotlin {
    jvmToolchain(21)
}

tasks.withType<DokkaTask>().configureEach {
    dokkaSourceSets.configureEach {
        samples.from(
            "src/test/kotlin"
        )
    }
}
