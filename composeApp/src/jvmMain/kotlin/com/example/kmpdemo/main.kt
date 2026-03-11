package com.example.kmpdemo

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.example.kmpdemo.app.App
import com.example.kmpdemo.di.initKoin

fun main() = application {
    initKoin()
    Window(
        onCloseRequest = ::exitApplication,
        title = "MyApplication",
    ) {
        App()
    }
}