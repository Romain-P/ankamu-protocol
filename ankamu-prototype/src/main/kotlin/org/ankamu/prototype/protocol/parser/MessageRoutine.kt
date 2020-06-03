package org.ankamu.prototype.protocol.parser

data class MessageRoutine
(
    val delimiter: String,
    val routine: List<MessageTransformProperty>
)