plugins {
    id("java")
}

group = "io.github.tt432"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    implementation("org.antlr:antlr4-runtime:4.13.0")
}

tasks.test {
    useJUnitPlatform()
}