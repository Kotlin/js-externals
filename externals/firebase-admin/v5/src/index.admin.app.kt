// Generated using ts2kt(https://github.com/Kotlin/ts2kt)
//
// Headers for firebase-admin
// 
// Package: firebase-admin (https://www.npmjs.com/package/firebase-admin)
//
// Firebase Admin Node.js SDK is licensed under the Apache License, version 2.0 (http://www.apache.org/licenses/LICENSE-2.0)
//
// Contributed by: Pavlos-Petros Tournaris <p.tournaris@gmail.com>

@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("admin.app")
@file:JsNonModule
@file:JsModule("firebase-admin")
package js.externals.firebase.admin.app

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
import js.externals.firebase.admin.AppOptions
import js.externals.firebase.admin.auth.Auth
import js.externals.firebase.admin.database.Database
import js.externals.firebase.admin.FirebaseFirestore.Firestore
import js.externals.firebase.admin.instanceId.InstanceId
import js.externals.firebase.admin.messaging.Messaging
import js.externals.firebase.admin.storage.Storage

external interface App {
    var name: String
    var options: AppOptions
    fun auth(): Auth
    fun database(url: String? = definedExternally /* null */): Database
    fun firestore(): Firestore
    fun instanceId(): InstanceId
    fun messaging(): Messaging
    fun storage(): Storage
    fun delete(): Promise<Unit>
}
