import sollecitom.plugins.RepositoryConfiguration

buildscript {
    repositories {
        mavenLocal()
    }

    dependencies {
        classpath(libs.sollecitom.gradle.plugins.base)
        classpath(libs.sollecitom.gradle.plugins.kotlin.jvm)
    }
}

plugins {
    alias(libs.plugins.kotlin.jvm)
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
    RepositoryConfiguration.BuildScript.apply(this)
}