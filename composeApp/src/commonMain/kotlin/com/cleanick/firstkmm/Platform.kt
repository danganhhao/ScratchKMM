package com.cleanick.firstkmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform