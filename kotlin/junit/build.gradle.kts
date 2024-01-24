plugins {
    kotlin("jvm") version "1.9.22"
    java
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.9.22")
    testImplementation("org.jetbrains.kotlin:kotlin-test:1.9.22")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
    testImplementation("io.mockk:mockk:1.13.9")
}

java.sourceCompatibility = JavaVersion.VERSION_17

tasks.test {
    useJUnitPlatform()
}
