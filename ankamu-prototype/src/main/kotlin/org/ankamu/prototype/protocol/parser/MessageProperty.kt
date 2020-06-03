package org.ankamu.prototype.protocol.parser

annotation class MessageProperty(
    val delimiter: String = "",
    val encodingHex: Boolean = false,
    val fixedSize: Int = -1
)