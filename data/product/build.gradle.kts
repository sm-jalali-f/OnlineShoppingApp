plugins {
    id("java-library")
    alias(libs.plugins.jetbrains.kotlin.jvm)
    id("kotlin")
    kotlin("kapt")
}
java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}
kotlin {
    compilerOptions {
        jvmTarget = org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_11
    }
}
kapt {
    correctErrorTypes = true
}
dependencies {
    implementation(project(":domain:product"))
    implementation(libs.kotlinx.coroutines.android)
    implementation("com.google.dagger:hilt-core:2.51.1")
    kapt("com.google.dagger:hilt-compiler:2.51.1")
//    implementation(libs.androidx.hilt.lifecycle.viewmodel)
    kapt("androidx.hilt:hilt-compiler:1.2.0")
}