plugins {
    kotlinAndroid
    androidApplication
}

val packageName = "ru.myitschool.work"

android {
    namespace = packageName
    compileSdk = Version.Android.Sdk.compile

    defaultConfig {
        applicationId = packageName
        minSdk = Version.Android.Sdk.min
        targetSdk = Version.Android.Sdk.target
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildFeatures.viewBinding = true

    compileOptions {
        sourceCompatibility = Version.Kotlin.javaSource
        targetCompatibility = Version.Kotlin.javaSource
    }

    kotlinOptions {
        jvmTarget = Version.Kotlin.jvmTarget
    }
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.activity:activity:1.9.3")
    implementation("androidx.constraintlayout:constraintlayout:2.2.0")
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    defaultLibrary()

}
