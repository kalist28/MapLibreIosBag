package com.maplibreiosbag

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform