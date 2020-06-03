package org.ankamu.protocol.parser.serialization

import org.ankamu.prototype.protocol.MessageReader
import org.ankamu.prototype.protocol.parser.MessageRoutine
import org.ankamu.prototype.protocol.parser.MessageTransformProperty

class UTF8MessageReader: MessageReader {
    override fun readInt(hex: Boolean, bytes: Int) {
        TODO("Not yet implemented")
    }

    override fun readFloat(hex: Boolean, bytes: Int) {
        TODO("Not yet implemented")
    }

    override fun readDouble(hex: Boolean, bytes: Int) {
        TODO("Not yet implemented")
    }

    override fun readString(bytes: Int) {
        TODO("Not yet implemented")
    }

    override fun readChar() {
        TODO("Not yet implemented")
    }

    override fun readList(forEach: MessageTransformProperty, fixedSize: Int) {
        TODO("Not yet implemented")
    }

    override fun readObject(routine: MessageRoutine) {
        TODO("Not yet implemented")
    }

}