import org.gradle.internal.impldep.com.amazonaws.util.IOUtils.release

plugins {
    id("java-library")
    id("org.jetbrains.kotlin.jvm") version "1.9.22"
    id("maven-publish")
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

afterEvaluate {
    publishing {
        publications {
            create<MavenPublication>("release") {
                from(components["java"])
                groupId = "com.github.lukasmadr"
                artifactId = "domain-utils"
                version = "1.0"
            }
        }
    }
}