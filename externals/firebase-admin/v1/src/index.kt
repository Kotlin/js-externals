@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
package js.externals.firebase

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

external interface `T$5` {
    @nativeGetter
    operator fun get(key: String): String?
    @nativeSetter
    operator fun set(key: String, value: String)
}
external interface BaseMessage {
    var data: `T$5`? get() = definedExternally; set(value) = definedExternally
    var notification: admin.messaging.Notification? get() = definedExternally; set(value) = definedExternally
    var android: admin.messaging.AndroidConfig? get() = definedExternally; set(value) = definedExternally
    var webpush: admin.messaging.WebpushConfig? get() = definedExternally; set(value) = definedExternally
    var apns: admin.messaging.ApnsConfig? get() = definedExternally; set(value) = definedExternally
}
external interface TokenMessage : BaseMessage {
    var token: String
}
external interface TopicMessage : BaseMessage {
    var topic: String
}
external interface ConditionMessage : BaseMessage {
    var condition: String
}
