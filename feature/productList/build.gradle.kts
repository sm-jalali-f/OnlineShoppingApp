plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.google.hilt.android)
    id("dagger.hilt.android.plugin")
    kotlin("kapt")
}
android {
    namespace = "com.freez.onlineshopping.feature.productlist" // پکیج ماژول شما
    compileSdk = 34

    defaultConfig {
        minSdk = 21
        targetSdk =34
    }

    buildFeatures {
        compose =true
    }

    composeOptions {
        kotlinCompilerExtensionVersion=  "1.5.0"
    }

    kotlinOptions {
        jvmTarget = "11"
    }
    kapt {
        correctErrorTypes = true
    }
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
dependencies {

    implementation(project(":domain:product"))
    implementation(libs.kotlinx.coroutines.android)
    implementation(libs.kotlinx.coroutines.core)
    implementation(libs.lifecycle.viewmodel.compose)
    debugImplementation(libs.androidx.ui.tooling)
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.hilt.android)
    kapt(libs.hilt.android.compiler)
    implementation("androidx.compose.foundation:foundation:1.7.6")
    implementation("androidx.compose.material3:material3:1.3.1")
    implementation("io.coil-kt.coil3:coil-compose:3.0.4")
    // Hilt integration with Jetpack Compose
    implementation("androidx.hilt:hilt-navigation-compose:1.0.0")



}
