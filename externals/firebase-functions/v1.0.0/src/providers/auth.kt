@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")

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

external fun user(): UserBuilder = definedExternally
external interface `T$0` {
    var creationTime: String
    var lastSignInTime: String
}
external open class UserRecordMetadata(creationTime: String, lastSignInTime: String) : firebase.auth.UserMetadata {
    open var creationTime: String = definedExternally
    open var lastSignInTime: String = definedExternally
    open fun toJSON(): `T$0` = definedExternally
}
external open class UserBuilder {
    open var triggerResource: Any = definedExternally
    open fun onCreate(handler: (user: UserRecord, context: EventContext? /*= null*/) -> dynamic /* PromiseLike<Any> | Any */): CloudFunction<UserRecord> = definedExternally
    open fun onDelete(handler: (user: UserRecord, context: EventContext? /*= null*/) -> dynamic /* PromiseLike<Any> | Any */): CloudFunction<UserRecord> = definedExternally
    open fun onOperation(handler: Any, eventType: Any): Unit = definedExternally
    companion object {
        fun dataConstructor(raw: Any): Unit = definedExternally
    }
}
external fun userRecordConstructor(wireData: Any): firebase.auth.UserRecord = definedExternally
