package com.roynaldi19.bfaa5_01widgets

import java.util.*

internal object NumberGenerator {
    fun generate(max: Int): Int {
        val random = Random()
        return random.nextInt(max)
    }
}