package com.example.kmpdemo

interface Platform {
    val name: String
}



class WasmPlatform: Platform {
    override val name: String = "Web with Kotlin/Wasm"
}

actual fun getPlatform(): Platform = WasmPlatform()