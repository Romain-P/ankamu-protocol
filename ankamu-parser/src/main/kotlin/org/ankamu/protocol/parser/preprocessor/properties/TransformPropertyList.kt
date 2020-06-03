package org.ankamu.protocol.parser.preprocessor.properties

import org.ankamu.prototype.protocol.parser.MessageTransformProperty
import org.ankamu.prototype.protocol.MessageReader
import org.ankamu.prototype.protocol.MessageWriter

internal class TransformPropertyList(val forEach: MessageTransformProperty, val fixedSize: Int = -1): MessageTransformProperty {
    override fun serialize(writer: MessageWriter) = writer.writeList(forEach, fixedSize)
    override fun deserialize(reader: MessageReader) = reader.readList(forEach, fixedSize)
}