
plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("kapt")
    id("dagger.hilt.android.plugin")
    id("kotlinx-serialization")
}

android {
    compileSdk = Versions.compileSdk

    defaultConfig {
        minSdk = Versions.minSdk
        targetSdk = Versions.targetSdk

    }

    buildTypes {
        debug {
            buildConfigField(
                "String",
                "TEST_URL",
                "\"" + Dep.Server.testUrl + "\""
            )
        }
        release {
            isMinifyEnabled = true
            buildConfigField(
                "String",
                "TEST_URL",
                "\"" + Dep.Server.testUrl + "\""
            )
        }
    }
}

dependencies {
    implementation(project(":domain"))
    implementation(Dep.Dagger.android)
    kapt(Dep.Dagger.compiler)

    implementation(Dep.Kotlin.Coroutine.coroutineCore)
    implementation(Dep.Kotlin.Serialization.serialization)

    implementation(Dep.Room.room)
    implementation(Dep.Room.roomKtx)
    kapt(Dep.Room.roomCompiler)

    implementation(Dep.Square.retrofit)
    implementation(Dep.Square.okhttp3Logging)
    implementation(Dep.Square.serializationConverter)
    implementation(Dep.Chucker.chucker)
    implementation(Dep.Chucker.chucker_no_op)
}