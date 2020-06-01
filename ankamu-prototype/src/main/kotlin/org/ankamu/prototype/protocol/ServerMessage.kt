package org.ankamu.prototype.protocol

abstract class ServerMessage: NetworkMessage {
    final override val origin get() = MessageOrigin.SERVER

    final override fun deserialize() = error("A server message can't implement #Deserialize method")
}