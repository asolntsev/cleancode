plugins {
    id("java")
}

group = "io.asolntsev"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.assertj:assertj-core:3.26.3")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.11.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.11.2")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}