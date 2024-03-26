plugins {
    id("java")
    id("application")
    id("checkstyle")
    id("org.openjfx.javafxplugin") version "0.0.14"
    id("com.github.johnrengelman.shadow") version "8.1.1"
    id("org.panteleyev.jpackageplugin") version "1.6.0"
    id("com.github.jk1.dependency-license-report") version "2.5"
    id("org.jetbrains.changelog") version "2.2.0"
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
    implementation("org.apache.logging.log4j:log4j-core:2.23.1")
    implementation("org.apache.logging.log4j:log4j-slf4j2-impl:2.23.0") // tika-core slf4j2 logger
    implementation("org.apache.commons:commons-lang3:3.14.0")
    implementation("org.apache.commons:commons-text:1.11.0")
    implementation("org.apache.commons:commons-csv:1.10.0")
    implementation("commons-io:commons-io:2.15.1")
    implementation("commons-codec:commons-codec:1.16.1")
    implementation("org.json:json:20240303")
    implementation("com.squareup.moshi:moshi:1.15.1")
    implementation("com.squareup.moshi:moshi-adapters:1.15.1")
    implementation("io.github.danygold:fx-moshi:1.0.0")
    implementation("org.ahocorasick:ahocorasick:0.6.3")
    implementation("org.controlsfx:controlsfx:11.2.0")
    implementation("com.squareup.okhttp3:okhttp:4.12.0")
    implementation("org.xerial:sqlite-jdbc:3.45.1.0")
    implementation("com.github.albfernandez:juniversalchardet:2.4.0")
    implementation("org.apache.tika:tika-core:2.9.1")
    implementation("net.java.dev.jna:jna-platform:5.14.0")

    implementation("org.jetbrains:annotations:24.1.0")
    implementation("com.google.errorprone:error_prone_annotations:2.25.0")

    implementation("com.puppycrawl.tools:checkstyle:10.14.2")

    testImplementation("org.testfx:testfx-junit5:4.0.18")
    testImplementation("org.hamcrest:hamcrest:2.2") // testfx-junit5 dependency
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.2")
}

application {
    mainClass = "org.example.Main"
}

tasks {
    test {
        useJUnitPlatform()
    }
}
