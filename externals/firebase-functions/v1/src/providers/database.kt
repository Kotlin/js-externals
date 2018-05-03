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
package js.externals.firebase.functions.providers.database

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
import js.externals.firebase.functions.EventContext
import js.externals.firebase.functions.CloudFunction
import js.externals.firebase.functions.Change

external interface App {}
external interface Reference {}
external fun instance(instance: String): InstanceBuilder = definedExternally
external open class InstanceBuilder {
    open var instance: Any = definedExternally
    open fun ref(path: String): RefBuilder = definedExternally
}
external fun ref(path: String): RefBuilder = definedExternally
external open class RefBuilder {
    open var apps: Any = definedExternally
    open var triggerResource: Any = definedExternally
    open fun onWrite(handler: (change: Change<DataSnapshot>, context: EventContext? /*= null*/) -> dynamic /* PromiseLike<Any> | Any */): CloudFunction<Change<DataSnapshot>> = definedExternally
    open fun onUpdate(handler: (change: Change<DataSnapshot>, context: EventContext? /*= null*/) -> dynamic /* PromiseLike<Any> | Any */): CloudFunction<Change<DataSnapshot>> = definedExternally
    open fun onCreate(handler: (snapshot: DataSnapshot, context: EventContext? /*= null*/) -> dynamic /* PromiseLike<Any> | Any */): CloudFunction<DataSnapshot> = definedExternally
    open fun onDelete(handler: (snapshot: DataSnapshot, context: EventContext? /*= null*/) -> dynamic /* PromiseLike<Any> | Any */): CloudFunction<DataSnapshot> = definedExternally
    open fun <T> onOperation(handler: Any, eventType: Any, dataConstructor: Any): Unit = definedExternally
    open var changeConstructor: Any = definedExternally
}
external open class DataSnapshot(data: Any, path: String? = definedExternally /* null */, app: App? = definedExternally /* null */, instance: String? = definedExternally /* null */) {
    open var app: Any = definedExternally
    open var instance: String = definedExternally
    open var _ref: Any = definedExternally
    open var _path: Any = definedExternally
    open var _data: Any = definedExternally
    open var _childPath: Any = definedExternally
    open var ref: Reference = definedExternally
    open var key: String = definedExternally
    open fun `val`(): Any = definedExternally
    open fun exportVal(): Any = definedExternally
    open fun getPriority(): dynamic /* String | Number | Nothing? */ = definedExternally
    open fun exists(): Boolean = definedExternally
    open fun child(childPath: String): DataSnapshot = definedExternally
    open fun forEach(action: (a: DataSnapshot) -> Boolean): Boolean = definedExternally
    open fun hasChild(childPath: String): Boolean = definedExternally
    open fun hasChildren(): Boolean = definedExternally
    open fun numChildren(): Number = definedExternally
    open fun toJSON(): Any = definedExternally
    open fun _checkAndConvertToArray(node: Any): Unit = definedExternally
    open fun _dup(childPath: Any? = definedExternally /* null */): Unit = definedExternally
    open fun _fullPath(): Unit = definedExternally
}
