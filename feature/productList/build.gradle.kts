plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    kotlin("kapt")
}
android {
    namespace = "com.freez.onlineshopping.feature.productlist"
    compileSdk = 35

    defaultConfig {
        minSdk = 24
        targetSdk =35
    }

    buildFeatures {
        compose =true
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
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
//java {
//    sourceCompatibility = JavaVersion.VERSION_11
//    targetCompatibility = JavaVersion.VERSION_11
//}
//kotlin {
//    compilerOptions {
//        jvmTarget = org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_11
//    }
//}
dependencies {
    implementation(project(":domain:product"))
    implementation(libs.kotlinx.coroutines.android)
    implementation(libs.kotlinx.coroutines.core)
    implementation(libs.lifecycle.viewmodel.compose)
    debugImplementation(libs.androidx.ui.tooling)
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.foundation)
    implementation(libs.androidx.material3)
}
