plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("com.google.android.libraries.mapsplatform.secrets-gradle-plugin")
}

android {
    namespace = "com.ghostdev.plantpal"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.ghostdev.plantpal"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        dataBinding = true
        viewBinding = true
        buildConfig = true
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    //Google Gemini
    implementation("com.google.ai.client.generativeai:generativeai:0.1.1")

    // CameraX core library
    implementation ("androidx.camera:camera-core:1.3.1")
    // CameraX Camera2 extension library
    implementation ("androidx.camera:camera-camera2:1.3.1")
    // CameraX Lifecycle library
    implementation ("androidx.camera:camera-lifecycle:1.3.1")
    // CameraX View library
    implementation ("androidx.camera:camera-view:1.3.1")

    //Glide
    implementation ("com.github.bumptech.glide:glide:4.16.0")

    //Rive
    implementation ("app.rive:rive-android:8.7.0")
    //Rive Startup
    implementation ("androidx.startup:startup-runtime:1.1.1")
}