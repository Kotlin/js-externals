@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
package js.externals.firebase.functions.providers.pubsub

import kotlin.js.*
import kotlin.js.Json
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*

external fun topic(topic: String): TopicBuilder = definedExternally
external open class TopicBuilder {
    open var triggerResource: Any = definedExternally
    open fun onPublish(handler: (message: Message, context: EventContext? /*= null*/) -> dynamic /* PromiseLike<Any> | Any */): CloudFunction<Message> = definedExternally
}
external interface `T$0` {
    @nativeGetter
    operator fun get(key: String): String?
    @nativeSetter
    operator fun set(key: String, value: String)
}
external open class Message(data: Any) {
    open var data: String = definedExternally
    open var attributes: `T$0` = definedExternally
    open var _json: Any = definedExternally
    open var json: Any = definedExternally
    open fun toJSON(): Any = definedExternally
}
