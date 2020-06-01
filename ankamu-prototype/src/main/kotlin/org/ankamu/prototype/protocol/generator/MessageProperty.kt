package org.ankamu.prototype.protocol.generator

annotation class MessageProperty(
    val delimiter: String = "",
    val encodingHex: Boolean = false,
    val fixedSize: Int = -1
)