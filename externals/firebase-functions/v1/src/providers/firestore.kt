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
package js.externals.firebase.functions.providers.firestore

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
import js.externals.firebase.functions.Change
import js.externals.firebase.functions.EventContext

external interface DocumentSnapshot {
    @nativeInvoke
    operator fun invoke(): dynamic /* DocumentSnapshot */
}
external fun document(path: String): DocumentBuilder = definedExternally
external open class DatabaseBuilder {
    open var database: Any = definedExternally
    open fun namespace(namespace: String): NamespaceBuilder = definedExternally
    open fun document(path: String): DocumentBuilder = definedExternally
}
external open class NamespaceBuilder {
    open var database: Any = definedExternally
    open var namespace: Any = definedExternally
    open fun document(path: String): DocumentBuilder = definedExternally
}
external open class DocumentBuilder {
    open var triggerResource: Any = definedExternally
    open fun onWrite(handler: (change: Change<DocumentSnapshot>, context: EventContext? /*= null*/) -> dynamic /* PromiseLike<Any> | Any */): CloudFunction<Change<DocumentSnapshot>> = definedExternally
    open fun onUpdate(handler: (change: Change<DocumentSnapshot>, context: EventContext? /*= null*/) -> dynamic /* PromiseLike<Any> | Any */): CloudFunction<Change<DocumentSnapshot>> = definedExternally
    open fun onCreate(handler: (snapshot: DocumentSnapshot, context: EventContext? /*= null*/) -> dynamic /* PromiseLike<Any> | Any */): CloudFunction<DocumentSnapshot> = definedExternally
    open fun onDelete(handler: (snapshot: DocumentSnapshot, context: EventContext? /*= null*/) -> dynamic /* PromiseLike<Any> | Any */): CloudFunction<DocumentSnapshot> = definedExternally
    open fun <T> onOperation(handler: Any, eventType: Any, dataConstructor: Any): Unit = definedExternally
}
