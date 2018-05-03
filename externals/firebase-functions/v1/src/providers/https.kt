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
package js.externals.firebase.functions.providers.https

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
import js.externals.firebase.functions.CloudFunction
import js.externals.firebase.functions.EventContext
import js.externals.firebase.functions.HttpsFunction

external interface Error {}
external interface FunctionsErrorCode {
    @nativeInvoke
    operator fun invoke(): dynamic /* String /* "ok" */ | String /* "cancelled" */ | String /* "unknown" */ | String /* "invalid-argument" */ | String /* "deadline-exceeded" */ | String /* "not-found" */ | String /* "already-exists" */ | String /* "permission-denied" */ | String /* "resource-exhausted" */ | String /* "failed-precondition" */ | String /* "aborted" */ | String /* "out-of-range" */ | String /* "unimplemented" */ | String /* "internal" */ | String /* "unavailable" */ | String /* "data-loss" */ | String /* "unauthenticated" */ */
}
external fun onRequest(handler: (req: dynamic /* express.Request */, resp: dynamic /* express.Response */) -> Unit): HttpsFunction = definedExternally
external open class HttpsError(code: dynamic /* String /* "ok" */ | String /* "cancelled" */ | String /* "unknown" */ | String /* "invalid-argument" */ | String /* "deadline-exceeded" */ | String /* "not-found" */ | String /* "already-exists" */ | String /* "permission-denied" */ | String /* "resource-exhausted" */ | String /* "failed-precondition" */ | String /* "aborted" */ | String /* "out-of-range" */ | String /* "unimplemented" */ | String /* "internal" */ | String /* "unavailable" */ | String /* "data-loss" */ | String /* "unauthenticated" */ */, message: String? = definedExternally /* null */, details: Any? = definedExternally /* null */) : Error {
    open var code: dynamic /* String /* "ok" */ | String /* "cancelled" */ | String /* "unknown" */ | String /* "invalid-argument" */ | String /* "deadline-exceeded" */ | String /* "not-found" */ | String /* "already-exists" */ | String /* "permission-denied" */ | String /* "resource-exhausted" */ | String /* "failed-precondition" */ | String /* "aborted" */ | String /* "out-of-range" */ | String /* "unimplemented" */ | String /* "internal" */ | String /* "unavailable" */ | String /* "data-loss" */ | String /* "unauthenticated" */ */ = definedExternally
    open var details: Any = definedExternally
}
external interface `T$0` {
    var uid: String
    // var token: firebase.auth.DecodedIdToken
}
external interface CallableContext {
    var auth: `T$0`? get() = definedExternally; set(value) = definedExternally
    var instanceIdToken: String? get() = definedExternally; set(value) = definedExternally
}
external fun onCall(handler: (data: Any, context: CallableContext) -> dynamic /* Any | Promise<Any> */): HttpsFunction = definedExternally
