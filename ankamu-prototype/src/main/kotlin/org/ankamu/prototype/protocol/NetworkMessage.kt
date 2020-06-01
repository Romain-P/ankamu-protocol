package org.ankamu.prototype.protocol

interface NetworkMessage {
    val origin: MessageOrigin get() = MessageOrigin.BOTH

    fun serialize(writer: MessageWriter) = Unit
    fun deserialize(reader: MessageReader) = Unit
}