plugins {
    id("java-library")
    alias(libs.plugins.jetbrains.kotlin.jvm)
    id("kotlin-kapt")
}
java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}
kotlin {
    compilerOptions {
        jvmTarget = org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_17
    }
}
// Allow references to generated code
kapt {
    correctErrorTypes = true
}
dependencies {
    implementation(project(":data:product"))
    implementation(libs.kotlinx.coroutines.android)
    implementation(libs.hilt.core)
    implementation(libs.hilt.compiler)
}
