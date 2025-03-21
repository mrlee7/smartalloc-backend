plugins {
    kotlin("jvm") version "2.0.21" apply false
    id("org.springframework.boot") version "3.3.2" apply false
    id("io.spring.dependency-management") version "1.1.6" apply false
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

subprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")
    apply(plugin = "io.spring.dependency-management")

    repositories {
        mavenCentral()
    }

    kotlin {
        jvmToolchain(21)
    }

    dependencies {
        // 공통 로깅
        implementation("ch.qos.logback:logback-classic")

        // 테스트
        testImplementation(kotlin("test"))
        testImplementation("org.springframework.boot:spring-boot-starter-test")
        testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    }

    tasks.test {
        useJUnitPlatform()
    }
}

project(":smartalloc-api") {
    apply(plugin = "org.springframework.boot")
}

project(":smartalloc-batch") {
    apply(plugin = "org.springframework.boot")
}
