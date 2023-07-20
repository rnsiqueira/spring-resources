plugins {
    kotlin("jvm") version "1.8.21"
    id("io.spring.dependency-management") version "1.1.0"
    id("org.springframework.boot") version "3.0.6"
    kotlin("plugin.spring") version "1.6.21"
    kotlin("plugin.jpa") version "1.6.21"
    application
}

group = "br.com.rnsiqueira"
version = "1.0.0-SNAPSHOT"

repositories {
    mavenCentral()
    jcenter()
}

dependencies {

    implementation("org.springframework.boot:spring-boot-starter-actuator:3.0.6")
    implementation("org.springframework.boot:spring-boot-starter-web:3.0.6")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa:3.0.6")
    implementation("org.springframework.boot:spring-boot-starter-security:3.0.6")
    implementation("org.springframework.boot:spring-boot-starter-validation:3.0.6")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.15.0")
    // https://mvnrepository.com/artifact/io.hawt/hawtio-springboot
    implementation("io.hawt:hawtio-springboot:2.14.4")
    implementation("org.liquibase:liquibase-core:4.21.1")
    // https://mvnrepository.com/artifact/com.h2database/h2
    implementation("com.h2database:h2:2.1.214")
    // https://mvnrepository.com/artifact/io.jsonwebtoken/jjwt-api
    implementation("io.jsonwebtoken:jjwt-api:0.11.5")
    // https://mvnrepository.com/artifact/org.apache.spark/spark-core
    implementation("org.apache.spark:spark-core_2.13:3.4.1"){
        exclude("org.apache.logging.log4j")
    }
    implementation("org.apache.spark:spark-sql_2.13:3.4.1"){
        exclude("org.apache.logging.log4j")
    }



    testImplementation("org.springframework.boot:spring-boot-starter-test:3.0.6") {
        exclude(group = "org.junit.vintage", module = "junit-vintage-engine")
        exclude(module = "mockito-core")
    }
    testImplementation(kotlin("test"))
    // https://mvnrepository.com/artifact/com.ninja-squad/springmockk
    testImplementation("org.junit.jupiter:junit-jupiter-api")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
    testImplementation("com.ninja-squad:springmockk:4.0.2")
    testImplementation("org.springframework.security:spring-security-test:6.0.3")

}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}
