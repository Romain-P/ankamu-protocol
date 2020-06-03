package org.ankamu.prototype.protocol

import org.ankamu.prototype.protocol.parser.MessageRoutine
import org.ankamu.prototype.protocol.parser.MessageTransformProperty

interface MessageReader {
    fun readInt(hex: Boolean = false, bytes: Int = -1)
    fun readFloat(hex: Boolean = false, bytes: Int = -1)
    fun readDouble(hex: Boolean = false, bytes: Int = -1)
    fun readString(bytes: Int = -1)
    fun readChar()
    fun readList(forEach: MessageTransformProperty, fixedSize: Int = -1)
    fun readObject(routine: MessageRoutine)
}