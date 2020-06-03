package org.ankamu.protocol.parser.serialization

import org.ankamu.prototype.protocol.parser.MessageRoutine

class MessageMetadata
(
    val header: String,
    val routine: MessageRoutine?
)