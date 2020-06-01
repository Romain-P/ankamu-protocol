package org.ankamu.prototype.protocol

abstract class ServerMessage: NetworkMessage {
    final override val origin get() = MessageOrigin.SERVER

    override fun serialize(writer: MessageWriter) = Unit
    final override fun deserialize(reader: MessageReader) = error("A server message can't implement #Deserialize method")
}