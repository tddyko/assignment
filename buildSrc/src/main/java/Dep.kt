object Versions {
    const val compileSdk = 31
    const val buildTools = "30.0.3"

    const val minSdk        = 23
    const val targetSdk     = 32
    const val versionCode   = 1
    const val versionName   = "1.0.0"
}

object Dep {
    const val androidGradlePlugin   = "com.android.tools.build:gradle:7.1.2"
    const val startUp               = "androidx.startup:startup-runtime:1.1.0"

    object Lifecycle {
        private const val version   = "2.4.1"
        const val viewModel         = "androidx.lifecycle:lifecycle-viewmodel-ktx:$version"
        const val composeViewModel  = "androidx.lifecycle:lifecycle-viewmodel-compose:$version"
    }

    object Compose {
        const val version   = "1.1.1"
        const val ui        = "androidx.compose.ui:ui:$version"
        const val material  = "androidx.compose.material:material:$version"
        const val tooling   = "androidx.compose.ui:ui-tooling:$version"

    }

    object Kotlin {
        private const val version   = "1.6.10"
        const val gradlePlugin      = "org.jetbrains.kotlin:kotlin-gradle-plugin:$version"

        object Serialization{
            const val serialization         = "org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.2"
            const val serializationPlugin   = "org.jetbrains.kotlin:kotlin-serialization:$version"
        }

        object Coroutine {
            private const val coroutineVersion  = "1.6.1"
            const val coroutineCore             = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutineVersion"
            const val coroutineAndroid          = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutineVersion"
        }

        const val reflect = "org.jetbrains.kotlin:kotlin-reflect:1.6.0"
    }

    object Accompanist {
        const val systemController          = "com.google.accompanist:accompanist-systemuicontroller:0.24.7-alpha"
    }

    object Dagger {
        private const val daggerVersion     = "2.40.1"
        const val android                   = "com.google.dagger:hilt-android:$daggerVersion"
        const val compiler                  = "com.google.dagger:hilt-compiler:$daggerVersion"
        const val androidGradlePlugin       = "com.google.dagger:hilt-android-gradle-plugin:$daggerVersion"
        const val lifecycleViewModel        = "androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha03"
        const val navigationCompose         = "androidx.hilt:hilt-navigation-compose:1.0.0"
    }

    object Square {
        const val retrofit                  = "com.squareup.retrofit2:retrofit:2.9.0"
        const val okhttp3Logging            = "com.squareup.okhttp3:logging-interceptor:4.9.1"
        const val leak_canary               = "com.squareup.leakcanary:leakcanary-android:2.9.1"
        const val serializationConverter    = "com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:0.8.0"
        const val timber                    = "com.jakewharton.timber:timber:4.7.1"
    }

    object Room {
        private const val version   = "2.4.1"
        const val room              = "androidx.room:room-runtime:$version"
        const val roomKtx           = "androidx.room:room-ktx:$version"
        const val roomCompiler      = "androidx.room:room-compiler:$version"
    }

    object Chucker {
        private const val chuckerVersion    = "3.5.2"
        const val chucker                   = "com.github.chuckerteam.chucker:library:$chuckerVersion"
        const val chucker_no_op             = "com.github.chuckerteam.chucker:library-no-op:$chuckerVersion"
    }

    object Server {
        const val testUrl = "https://091d0619-b76d-402f-9e9b-17449c3f2029.mock.pstmn.io/"
    }

    const val inject = "javax.inject:javax.inject:1"
}