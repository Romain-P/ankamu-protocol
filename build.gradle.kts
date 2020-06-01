plugins {
    kotlin("jvm") version "1.3.72"
}

allprojects {
    apply(plugin = "kotlin")

    group = "org.ankamu"
    version = "1.0.0"

    repositories {
        mavenCentral()
    }

    dependencies {
        implementation(kotlin("stdlib-jdk8"))
    }

    tasks {
        compileKotlin {
            kotlinOptions.jvmTarget = "1.8"
        }
        compileTestKotlin {
            kotlinOptions.jvmTarget = "1.8"
        }
    }
}