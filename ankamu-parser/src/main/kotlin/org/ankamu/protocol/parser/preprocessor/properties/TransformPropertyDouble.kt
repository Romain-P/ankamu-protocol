package org.ankamu.protocol.parser.preprocessor.properties

import org.ankamu.prototype.protocol.parser.MessageTransformProperty
import org.ankamu.prototype.protocol.MessageReader
import org.ankamu.prototype.protocol.MessageWriter

internal data class TransformPropertyDouble(val hexadecimal: Boolean = false, val bytes: Int = -1): MessageTransformProperty {
    override fun serialize(writer: MessageWriter) = writer.writeDouble(hexadecimal, bytes)
    override fun deserialize(reader: MessageReader) = reader.readDouble(hexadecimal, bytes)
}