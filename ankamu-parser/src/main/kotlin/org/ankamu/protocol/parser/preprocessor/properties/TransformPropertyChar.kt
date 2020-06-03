package org.ankamu.protocol.parser.preprocessor.properties

import org.ankamu.prototype.protocol.parser.MessageTransformProperty
import org.ankamu.prototype.protocol.MessageReader
import org.ankamu.prototype.protocol.MessageWriter

internal data class TransformPropertyChar(val bytes: Int = -1): MessageTransformProperty {
    override fun serialize(writer: MessageWriter) = writer.writeChar()
    override fun deserialize(reader: MessageReader) = reader.readChar()
}