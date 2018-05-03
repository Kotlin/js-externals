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
package js.externals.firebase.functions.providers.storage

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

external fun bucket(bucket: String? = definedExternally /* null */): BucketBuilder = definedExternally
external fun `object`(): ObjectBuilder = definedExternally
external open class BucketBuilder {
    open var triggerResource: Any = definedExternally
    open fun `object`(): ObjectBuilder = definedExternally
}
external open class ObjectBuilder {
    open var triggerResource: Any = definedExternally
    open fun onArchive(handler: (`object`: ObjectMetadata, context: EventContext? /*= null*/) -> dynamic /* PromiseLike<Any> | Any */): CloudFunction<ObjectMetadata> = definedExternally
    open fun onDelete(handler: (`object`: ObjectMetadata, context: EventContext? /*= null*/) -> dynamic /* PromiseLike<Any> | Any */): CloudFunction<ObjectMetadata> = definedExternally
    open fun onFinalize(handler: (`object`: ObjectMetadata, context: EventContext? /*= null*/) -> dynamic /* PromiseLike<Any> | Any */): CloudFunction<ObjectMetadata> = definedExternally
    open fun onMetadataUpdate(handler: (`object`: ObjectMetadata, context: EventContext? /*= null*/) -> dynamic /* PromiseLike<Any> | Any */): CloudFunction<ObjectMetadata> = definedExternally
    open fun onOperation(handler: Any, eventType: Any): Unit = definedExternally
}
external interface `T$0` {
    @nativeGetter
    operator fun get(key: String): String?
    @nativeSetter
    operator fun set(key: String, value: String)
}
external interface `T$1` {
    var projectNumber: String? get() = definedExternally; set(value) = definedExternally
    var team: String? get() = definedExternally; set(value) = definedExternally
}
external interface `T$2` {
    var kind: String? get() = definedExternally; set(value) = definedExternally
    var id: String? get() = definedExternally; set(value) = definedExternally
    var selfLink: String? get() = definedExternally; set(value) = definedExternally
    var bucket: String? get() = definedExternally; set(value) = definedExternally
    var `object`: String? get() = definedExternally; set(value) = definedExternally
    var generation: String? get() = definedExternally; set(value) = definedExternally
    var entity: String? get() = definedExternally; set(value) = definedExternally
    var role: String? get() = definedExternally; set(value) = definedExternally
    var email: String? get() = definedExternally; set(value) = definedExternally
    var entityId: String? get() = definedExternally; set(value) = definedExternally
    var domain: String? get() = definedExternally; set(value) = definedExternally
    var projectTeam: `T$1`? get() = definedExternally; set(value) = definedExternally
    var etag: String? get() = definedExternally; set(value) = definedExternally
}
external interface `T$3` {
    var entity: String? get() = definedExternally; set(value) = definedExternally
    var entityId: String? get() = definedExternally; set(value) = definedExternally
}
external interface `T$4` {
    var encryptionAlgorithm: String? get() = definedExternally; set(value) = definedExternally
    var keySha256: String? get() = definedExternally; set(value) = definedExternally
}
external interface ObjectMetadata {
    var kind: String
    var id: String
    var bucket: String
    var storageClass: String
    var size: String
    var timeCreated: String
    var updated: String
    var selfLink: String? get() = definedExternally; set(value) = definedExternally
    var name: String? get() = definedExternally; set(value) = definedExternally
    var generation: String? get() = definedExternally; set(value) = definedExternally
    var contentType: String? get() = definedExternally; set(value) = definedExternally
    var metageneration: String? get() = definedExternally; set(value) = definedExternally
    var timeDeleted: String? get() = definedExternally; set(value) = definedExternally
    var timeStorageClassUpdated: String? get() = definedExternally; set(value) = definedExternally
    var md5Hash: String? get() = definedExternally; set(value) = definedExternally
    var mediaLink: String? get() = definedExternally; set(value) = definedExternally
    var contentEncoding: String? get() = definedExternally; set(value) = definedExternally
    var contentDisposition: String? get() = definedExternally; set(value) = definedExternally
    var contentLanguage: String? get() = definedExternally; set(value) = definedExternally
    var cacheControl: String? get() = definedExternally; set(value) = definedExternally
    var metadata: `T$0`? get() = definedExternally; set(value) = definedExternally
    var acl: dynamic /* JsTuple<`T$2`> */ get() = definedExternally; set(value) = definedExternally
    var owner: `T$3`? get() = definedExternally; set(value) = definedExternally
    var crc32c: String? get() = definedExternally; set(value) = definedExternally
    var componentCount: String? get() = definedExternally; set(value) = definedExternally
    var etag: String? get() = definedExternally; set(value) = definedExternally
    var customerEncryption: `T$4`? get() = definedExternally; set(value) = definedExternally
}
