// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
    id("com.google.dagger.hilt.android") version "2.49" apply false
}

buildscript {
    repositories {
        google() // Mueve esta línea aquí
        mavenCentral()
        maven {
            url = uri("https://jitpack.io")
        }
        dependencies {
            classpath("com.google.gms:google-services:4.4.0")
            val nav_version = "2.5.3"
            classpath("androidx.navigation:navigation-safe-args-gradle-plugin:$nav_version")
            classpath("com.google.dagger:hilt-android-gradle-plugin:2.49")
        }
    }
}
tasks.withType<JavaCompile> {
    options.compilerArgs.add("-Xlint:deprecation")
}



