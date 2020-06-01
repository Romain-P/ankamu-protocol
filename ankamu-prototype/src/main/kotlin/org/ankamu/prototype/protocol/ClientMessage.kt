package org.ankamu.prototype.protocol

abstract class ClientMessage: NetworkMessage {
    final override val origin get() = MessageOrigin.CLIENT

    final override fun serialize() = error("A server message can't implement #Serialize method")
}