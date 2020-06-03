package org.ankamu.protocol.parser.preprocessor.properties

import org.ankamu.prototype.protocol.parser.MessageTransformProperty
import org.ankamu.prototype.protocol.MessageReader
import org.ankamu.prototype.protocol.MessageWriter
import org.ankamu.prototype.protocol.parser.MessageRoutine

internal data class TransformPropertyObject(val routine: MessageRoutine): MessageTransformProperty {
    override fun serialize(writer: MessageWriter) = writer.writeObject(routine)
    override fun deserialize(reader: MessageReader) = reader.readObject(routine)
}