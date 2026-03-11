package com.example.kmpdemo



interface Platform {
    val name: String
}


class JsPlatform: Platform {
    override val name: String = "Web with Kotlin/JS"
}

actual fun getPlatform(): Platform = JsPlatform()