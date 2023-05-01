plugins {
    kotlin("multiplatform")
}

kotlin {
    jvm {}
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(project(":repr:library"))
            }
        }

        val jvmMain by getting
    }
}