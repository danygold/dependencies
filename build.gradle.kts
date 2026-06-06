plugins {
    id("java")
    id("application")
    id("checkstyle")
    id("org.openjfx.javafxplugin") version "0.1.0"
    id("com.gradleup.shadow") version "9.4.2"
    id("org.panteleyev.jpackageplugin") version "2.0.1"
    id("com.github.jk1.dependency-license-report") version "3.1.2"
    id("org.jetbrains.changelog") version "2.5.0"
    id("net.researchgate.release") version "3.1.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.apache.logging.log4j:log4j-core:2.26.0")
    implementation("org.apache.logging.log4j:log4j-slf4j2-impl:2.26.0") // tika-core slf4j2 logger
    implementation("org.apache.commons:commons-lang3:3.20.0")
    implementation("org.apache.commons:commons-text:1.15.0")
    implementation("org.apache.commons:commons-csv:1.14.1")
    implementation("commons-io:commons-io:2.22.0")
    implementation("commons-codec:commons-codec:1.22.0")
    implementation("org.json:json:20260522")
    implementation("com.squareup.moshi:moshi:1.15.2")
    implementation("com.squareup.moshi:moshi-adapters:1.15.2")
    implementation("io.github.danygold:fx-moshi:1.0.0")
    implementation("org.controlsfx:controlsfx:11.2.3")
    implementation("com.squareup.okhttp3:okhttp:5.3.2")
    implementation("org.xerial:sqlite-jdbc:3.53.2.0")
    implementation("com.github.albfernandez:juniversalchardet:2.5.0")
    implementation("org.apache.tika:tika-core:3.3.1")
    implementation("com.github.oshi:oshi-core-ffm:7.2.1")

    implementation("org.jetbrains:annotations:26.1.0")
    implementation("com.google.errorprone:error_prone_annotations:2.49.0")

    implementation("com.puppycrawl.tools:checkstyle:13.5.0")

    testImplementation("org.testfx:testfx-junit5:4.0.18")
    testImplementation("org.hamcrest:hamcrest:3.0") // testfx-junit5 dependency
    testImplementation("org.junit.jupiter:junit-jupiter:6.0.3")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher:6.0.3") // Gradle 9+
}

application {
    mainClass = "org.example.Main"
}

tasks {
    test {
        useJUnitPlatform()
    }
}
