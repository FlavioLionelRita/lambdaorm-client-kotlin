import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
// import org.gradle.api.tasks.bundling.Jar
// import org.springframework.boot.gradle.tasks.bundling.BootJar
plugins {
    id("org.springframework.boot") version "3.0.4"
    id("io.spring.dependency-management") version "1.1.0"
    id("org.jetbrains.kotlin.jvm") version "1.7.22"
    kotlin("plugin.spring") version "1.7.22"
    `java-library`
}

group = "io.github.flaviolionelrita"
version = "0.0.1"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-webflux")
    implementation("org.springframework.boot:spring-boot-starter-actuator")	
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.9.1")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "17"
	}
}

// tasks.getByName<BootJar>("bootJar") {
//     enabled = false
// }
// tasks.getByName<Jar>("jar") {
//     enabled = true
// }

// tasks.jar {
//     archiveFileName.set("io.github.flaviolionelrita.lambdaorm.client-1.1.1.jar")
// }
