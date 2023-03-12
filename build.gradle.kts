import org.springframework.boot.gradle.tasks.bundling.BootJar
plugins {
    id("org.springframework.boot") version "3.0.4"
    id("io.spring.dependency-management") version "1.1.0"
    `java-library`
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-webflux")
    implementation("org.springframework.boot:spring-boot-starter-actuator")	
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.9.1")
}

tasks.getByName<BootJar>("bootJar") {
    enabled = false
}

tasks.jar {
    archiveFileName.set("io.github.flaviolionelrita.lambdaorm.client-1.1.0.jar")
}
