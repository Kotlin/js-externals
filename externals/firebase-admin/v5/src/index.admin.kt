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
@file:JsQualifier("admin")
@file:JsNonModule
@file:JsModule("firebase-admin")
package js.externals.firebase.admin

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
import js.externals.firebase.admin.app.App
import js.externals.firebase.admin.AppOptions
import js.externals.firebase.admin.auth.Auth
import js.externals.firebase.admin.credential.Credential
import js.externals.firebase.admin.database.Database
import js.externals.firebase.admin.FirebaseFirestore.Firestore
import js.externals.firebase.admin.messaging.Messaging
import js.externals.firebase.admin.storage.Storage
import js.externals.firebase.admin.instanceId.InstanceId

external interface FirebaseError {
    var code: String
    var message: String
    var stack: String
    fun toJSON(): Any
}
external interface FirebaseArrayIndexError {
    var index: Number
    var error: FirebaseError
}
external interface ServiceAccount {
    var projectId: String? get() = definedExternally; set(value) = definedExternally
    var clientEmail: String? get() = definedExternally; set(value) = definedExternally
    var privateKey: String? get() = definedExternally; set(value) = definedExternally
}
external interface GoogleOAuthAccessToken {
    var access_token: String
    var expires_in: Number
}
external interface AppOptions {
    var credential: Credential? get() = definedExternally; set(value) = definedExternally
    var databaseAuthVariableOverride: Any? get() = definedExternally; set(value) = definedExternally
    var databaseURL: String? get() = definedExternally; set(value) = definedExternally
    var storageBucket: String? get() = definedExternally; set(value) = definedExternally
    var projectId: String? get() = definedExternally; set(value) = definedExternally
}
external var SDK_VERSION: String = definedExternally
external var apps: Array<App> = definedExternally
external fun app(name: String? = definedExternally /* null */): App = definedExternally
external fun auth(app: App? = definedExternally /* null */): Auth = definedExternally
external fun database(app: App? = definedExternally /* null */): Database = definedExternally
external fun messaging(app: App? = definedExternally /* null */): Messaging = definedExternally
external fun storage(app: App? = definedExternally /* null */): Storage = definedExternally
external fun firestore(app: App? = definedExternally /* null */): Firestore = definedExternally
external fun instanceId(app: App? = definedExternally /* null */): InstanceId = definedExternally
external fun initializeApp(options: AppOptions? = definedExternally /* null */, name: String? = definedExternally /* null */): App = definedExternally
