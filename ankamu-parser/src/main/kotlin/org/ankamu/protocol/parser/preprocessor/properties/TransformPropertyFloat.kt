package org.ankamu.protocol.parser.preprocessor.properties

import org.ankamu.prototype.protocol.parser.MessageTransformProperty
import org.ankamu.prototype.protocol.MessageReader
import org.ankamu.prototype.protocol.MessageWriter

internal data class TransformPropertyFloat(val hexadecimal: Boolean = false, val bytes: Int = -1): MessageTransformProperty {
    override fun serialize(writer: MessageWriter) = writer.writeFloat(hexadecimal, bytes)
    override fun deserialize(reader: MessageReader) = reader.readFloat(hexadecimal, bytes)
}