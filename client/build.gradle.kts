plugins {
    kotlin("jvm") version "1.7.22"
    `java-library`
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("com.squareup.moshi:moshi-kotlin:1.13.0")
    implementation("com.squareup.moshi:moshi-adapters:1.13.0")
    implementation("com.squareup.okhttp3:okhttp:4.10.0")
    testImplementation("io.kotlintest:kotlintest-runner-junit5:3.4.2")
}

tasks.jar {
    archiveFileName.set("io.github.flaviolionelrita.lambdaorm.client-0.0.1.jar")
    manifest {
        attributes(mapOf("Implementation-Title" to project.name,
                         "Implementation-Version" to project.version))
    }
}