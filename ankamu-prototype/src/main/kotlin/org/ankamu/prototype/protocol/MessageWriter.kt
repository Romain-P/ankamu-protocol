package org.ankamu.prototype.protocol

import org.ankamu.prototype.protocol.parser.MessageRoutine
import org.ankamu.prototype.protocol.parser.MessageTransformProperty

interface MessageWriter {
    fun writeInt(hex: Boolean = false, bytes: Int = -1)
    fun writeFloat(hex: Boolean = false, bytes: Int = -1)
    fun writeDouble(hex: Boolean = false, bytes: Int = -1)
    fun writeString(bytes: Int = -1)
    fun writeChar()
    fun writeList(forEach: MessageTransformProperty, fixedSize: Int = -1)
    fun writeObject(routine: MessageRoutine)
}