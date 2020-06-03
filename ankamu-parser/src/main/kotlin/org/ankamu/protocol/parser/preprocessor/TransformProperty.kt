package org.ankamu.protocol.parser.preprocessor

import org.ankamu.protocol.parser.preprocessor.properties.*
import org.ankamu.protocol.parser.preprocessor.properties.TransformPropertyChar
import org.ankamu.protocol.parser.preprocessor.properties.TransformPropertyDouble
import org.ankamu.protocol.parser.preprocessor.properties.TransformPropertyFloat
import org.ankamu.protocol.parser.preprocessor.properties.TransformPropertyInt
import org.ankamu.protocol.parser.preprocessor.properties.TransformPropertyString
import org.ankamu.prototype.protocol.parser.MessageRoutine
import org.ankamu.prototype.protocol.parser.MessageTransformProperty
import kotlin.reflect.KClass

object TransformProperty {
    private val cache = mutableMapOf<KClass<out MessageTransformProperty>, MutableMap<Int, MessageTransformProperty>>()

    fun int(hexadecimal: Boolean = false, bytes: Int = -1) = transform<TransformPropertyInt>(hexadecimal, bytes)
    fun float(hexadecimal: Boolean = false, bytes: Int = -1) = transform<TransformPropertyFloat>(hexadecimal, bytes)
    fun double(hexadecimal: Boolean = false, bytes: Int = -1) = transform<TransformPropertyDouble>(hexadecimal, bytes)
    fun string(bytes: Int = -1) = transform<TransformPropertyString>(bytes)
    fun char(bytes: Int = -1) = transform<TransformPropertyChar>(bytes)
    fun list(forEach: MessageTransformProperty, fixedSize: Int = -1) = transform<TransformPropertyList>(forEach, fixedSize)
    fun entity(routine: MessageRoutine) = transform<TransformPropertyObject>(routine)

    private inline fun <reified T> transform(vararg args: Any): MessageTransformProperty  where T: MessageTransformProperty {
        val cached = cache[T::class]
        val hashcode = args.map { it.hashCode() }.sum()

        if (cached == null) {
            val transform = T::class.constructors.firstOrNull()?.call(*args)!!
            cache[T::class] = mutableMapOf(hashcode to transform)
            return transform
        }

        var transform = cached[hashcode]

        if (transform == null) {
            transform = T::class.constructors.firstOrNull()?.call(*args)!!
            cached[hashcode] = transform
        }

        return transform
    }
}