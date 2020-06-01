package org.ankamu.prototype.protocol

interface NetworkMessage {
    val header: String
    val origin: MessageOrigin get() = MessageOrigin.BOTH

    fun serialize(): ByteArray
    fun deserialize()
}