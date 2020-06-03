package org.ankamu.protocol.parser.preprocessor.properties

import org.ankamu.prototype.protocol.parser.MessageTransformProperty
import org.ankamu.prototype.protocol.MessageReader
import org.ankamu.prototype.protocol.MessageWriter

internal class TransformPropertyString(val bytes: Int = -1): MessageTransformProperty {
    override fun serialize(writer: MessageWriter) = writer.writeString(bytes)
    override fun deserialize(reader: MessageReader) = reader.readString(bytes)
}