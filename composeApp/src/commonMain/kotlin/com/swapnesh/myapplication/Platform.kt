package com.swapnesh.myapplication

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform