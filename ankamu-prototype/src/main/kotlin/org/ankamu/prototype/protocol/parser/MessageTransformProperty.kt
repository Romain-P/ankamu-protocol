package org.ankamu.prototype.protocol.parser

import org.ankamu.prototype.protocol.MessageReader
import org.ankamu.prototype.protocol.MessageWriter

interface MessageTransformProperty {
    fun serialize(writer: MessageWriter)
    fun deserialize(reader: MessageReader)
}