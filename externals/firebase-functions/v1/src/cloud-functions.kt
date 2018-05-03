// Generated using ts2kt(https://github.com/Kotlin/ts2kt)
//
// Headers for firebase-functions
// 
// Package: firebase-functions (https://www.npmjs.com/package/firebase-functions)
//
// © Google, 2017. Licensed under The MIT License. (https://github.com/firebase/firebase-functions/blob/master/LICENSE)
//
// Contributed by: Pavlos-Petros Tournaris <p.tournaris@gmail.com>

@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsNonModule
@file:JsModule("firebase-functions")
package js.externals.firebase.functions

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

external interface `T$0` {
    var uid: String
    var token: Any
}
external interface EventContext {
    var eventId: String
    var timestamp: String
    var eventType: String
    var resource: Resource
    var params: Json
    var authType: dynamic /* String /* "ADMIN" */ | String /* "USER" */ | String /* "UNAUTHENTICATED" */ */ get() = definedExternally; set(value) = definedExternally
    var auth: `T$0`? get() = definedExternally; set(value) = definedExternally
}
external open class Change<T>(before: T? = definedExternally /* null */, after: T? = definedExternally /* null */) {
    open var before: T = definedExternally
    open var after: T = definedExternally
    companion object {
        fun <T> fromObjects(before: T, after: T): Change<T> = definedExternally
        fun <T> fromJSON(json: ChangeJson, customizer: ((any: Any) -> T)? = definedExternally /* null */): Change<T> = definedExternally
    }
}
external interface ChangeJson {
    var before: Any? get() = definedExternally; set(value) = definedExternally
    var after: Any? get() = definedExternally; set(value) = definedExternally
    var fieldMask: String? get() = definedExternally; set(value) = definedExternally
}
external interface `T$1` {
    @nativeGetter
    operator fun get(tag: String): String?
    @nativeSetter
    operator fun set(tag: String, value: String)
}
external interface Resource {
    var service: String
    var name: String
    var type: String? get() = definedExternally; set(value) = definedExternally
    var labels: `T$1`? get() = definedExternally; set(value) = definedExternally
}
external interface `T$2` {
    var eventType: String
    var resource: String
    var service: String
}
external interface `T$3` {
    var httpsTrigger: Any? get() = definedExternally; set(value) = definedExternally
    var eventTrigger: `T$2`? get() = definedExternally; set(value) = definedExternally
}
external interface TriggerAnnotated {
    var __trigger: `T$3`
}
external interface Runnable<T> {
    var run: (data: T, context: EventContext? /*= null*/) -> dynamic /* PromiseLike<Any> | Any */
}
external interface HttpsFunction: TriggerAnnotated {
    @nativeInvoke
    operator fun invoke(req: Request, resp: Response)
}
external interface CloudFunction<T>: Runnable<T>, TriggerAnnotated {
    @nativeInvoke
    operator fun invoke(input: Any): dynamic /* PromiseLike<Any> | Any */
}
