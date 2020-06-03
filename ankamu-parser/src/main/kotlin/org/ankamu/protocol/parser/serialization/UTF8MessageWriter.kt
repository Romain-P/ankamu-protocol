package org.ankamu.protocol.parser.serialization

import org.ankamu.prototype.protocol.MessageWriter
import org.ankamu.prototype.protocol.parser.MessageRoutine
import org.ankamu.prototype.protocol.parser.MessageTransformProperty

class UTF8MessageWriter: MessageWriter {
    override fun writeInt(hex: Boolean, bytes: Int) {
        TODO("Not yet implemented")
    }

    override fun writeFloat(hex: Boolean, bytes: Int) {
        TODO("Not yet implemented")
    }

    override fun writeDouble(hex: Boolean, bytes: Int) {
        TODO("Not yet implemented")
    }

    override fun writeString(bytes: Int) {
        TODO("Not yet implemented")
    }

    override fun writeChar() {
        TODO("Not yet implemented")
    }

    override fun writeList(forEach: MessageTransformProperty, fixedSize: Int) {
        TODO("Not yet implemented")
    }

    override fun writeObject(routine: MessageRoutine) {
        TODO("Not yet implemented")
    }

}