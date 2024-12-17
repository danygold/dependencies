plugins {
    id("java")
    id("application")
    id("checkstyle")
    id("org.openjfx.javafxplugin") version "0.1.0"
    id("com.gradleup.shadow") version "8.3.5"
    id("org.panteleyev.jpackageplugin") version "1.6.0"
    id("com.github.jk1.dependency-license-report") version "2.9"
    id("org.jetbrains.changelog") version "2.2.1"
    id("net.researchgate.release") version "3.0.2"
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
    implementation("org.apache.logging.log4j:log4j-core:2.24.1")
    implementation("org.apache.logging.log4j:log4j-slf4j2-impl:2.24.3") // tika-core slf4j2 logger
    implementation("org.apache.commons:commons-lang3:3.17.0")
    implementation("org.apache.commons:commons-text:1.13.0")
    implementation("org.apache.commons:commons-csv:1.12.0")
    implementation("commons-io:commons-io:2.18.0")
    implementation("commons-codec:commons-codec:1.17.1")
    implementation("org.json:json:20240303")
    implementation("com.squareup.moshi:moshi:1.15.2")
    implementation("com.squareup.moshi:moshi-adapters:1.15.2")
    implementation("io.github.danygold:fx-moshi:1.0.0")
    implementation("org.controlsfx:controlsfx:11.2.1")
    implementation("com.squareup.okhttp3:okhttp:4.12.0")
    implementation("org.xerial:sqlite-jdbc:3.47.1.0")
    implementation("com.github.albfernandez:juniversalchardet:2.5.0")
    implementation("org.apache.tika:tika-core:3.0.0")
    implementation("net.java.dev.jna:jna-platform:5.15.0")

    implementation("org.jetbrains:annotations:26.0.1")
    implementation("com.google.errorprone:error_prone_annotations:2.36.0")

    implementation("com.puppycrawl.tools:checkstyle:10.21.0")

    testImplementation("org.testfx:testfx-junit5:4.0.18")
    testImplementation("org.hamcrest:hamcrest:3.0") // testfx-junit5 dependency
    testImplementation("org.junit.jupiter:junit-jupiter:5.11.3")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher:1.11.3") // Gradle 9+
}

application {
    mainClass = "org.example.Main"
}

tasks {
    test {
        useJUnitPlatform()
    }
}
