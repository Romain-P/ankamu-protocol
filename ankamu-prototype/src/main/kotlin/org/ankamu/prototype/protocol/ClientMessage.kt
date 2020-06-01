package org.ankamu.prototype.protocol

abstract class ClientMessage: NetworkMessage {
    final override val origin get() = MessageOrigin.CLIENT

    override fun deserialize(reader: MessageReader) = Unit
    final override fun serialize(writer: MessageWriter) = error("A server message can't implement #Serialize method")
}