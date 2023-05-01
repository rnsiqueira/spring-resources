plugins {
    kotlin("jvm") version "1.8.21"
    id("io.spring.dependency-management") version "1.1.0"
    kotlin("plugin.spring") version "1.6.21"
    application
}

group = "br.com.rnsiqueira"
version = "1.0.0-SNAPSHOT"

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.springframework.boot:spring-boot-starter-actuator:3.0.6")
    implementation("org.springframework.boot:spring-boot-starter-web:3.0.6")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa:3.0.6")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa:3.0.6")
    implementation("org.springframework.boot:spring-boot-starter-security:3.0.6")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.15.0")
    testImplementation("org.springframework.boot:spring-boot-starter-test:3.0.6") {
        exclude(group = "org.junit.vintage", module = "junit-vintage-engine")
    }
    // https://mvnrepository.com/artifact/com.h2database/h2
    implementation("com.h2database:h2:2.1.214")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}

application {
    mainClass.set("MainKt")
}