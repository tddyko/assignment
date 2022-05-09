plugins {
    id("kotlin")
    kotlin("kapt")
    id("java-library")
    id("kotlinx-serialization")
}

dependencies {
    implementation(Dep.inject)
    implementation(Dep.Kotlin.Coroutine.coroutineCore)

    implementation(Dep.Kotlin.Serialization.serialization)
    implementation(Dep.Square.serializationConverter)
    implementation(Dep.Square.timber)
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}