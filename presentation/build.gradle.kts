plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
    id("dagger.hilt.android.plugin")
}

android {
    compileSdk = Versions.compileSdk

    defaultConfig {
        applicationId = "com.assignment"
        targetSdk = Versions.targetSdk
        versionCode = Versions.versionCode
        versionName = Versions.versionName
        minSdk = Versions.minSdk
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
    signingConfigs {
        create("release") {
        }
    }

    buildTypes {
        debug {
            isDebuggable = true
        }
        release {
            isDebuggable = false
        }
    }

    composeOptions {
        kotlinCompilerExtensionVersion = Dep.Compose.version
    }
    buildFeatures {
        compose = true
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

}

dependencies {
    implementation(project(":domain"))
    implementation(Dep.startUp)

    implementation(Dep.Square.timber)
    implementation(Dep.Square.leak_canary)

    implementation(Dep.Lifecycle.composeViewModel)
    implementation(Dep.Lifecycle.viewModel)

    implementation(Dep.Compose.ui)
    implementation(Dep.Compose.tooling)
    implementation(Dep.Compose.material)

    implementation(Dep.Accompanist.systemController)

    implementation(Dep.Dagger.android)
    implementation(Dep.Dagger.lifecycleViewModel)
    implementation(Dep.Dagger.navigationCompose)
    kapt(Dep.Dagger.compiler)

    implementation(Dep.Kotlin.reflect)
    implementation(Dep.Kotlin.Serialization.serialization)
    implementation(Dep.Kotlin.Coroutine.coroutineAndroid)

}