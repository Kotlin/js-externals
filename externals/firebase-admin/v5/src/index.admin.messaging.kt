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
@file:JsQualifier("admin.messaging")
@file:JsNonModule
@file:JsModule("firebase-admin")
package js.externals.firebase.admin.messaging

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
import js.externals.firebase.ConditionMessage
import js.externals.firebase.TokenMessage
import js.externals.firebase.TopicMessage
import js.externals.firebase.admin.FirebaseError
import js.externals.firebase.admin.FirebaseArrayIndexError

external interface `T$6` {
    @nativeGetter
    operator fun get(key: String): String?
    @nativeSetter
    operator fun set(key: String, value: String)
}
external interface AndroidConfig {
    var collapseKey: String? get() = definedExternally; set(value) = definedExternally
    var priority: dynamic /* String /* "high" */ | String /* "normal" */ */ get() = definedExternally; set(value) = definedExternally
    var ttl: Number? get() = definedExternally; set(value) = definedExternally
    var restrictedPackageName: String? get() = definedExternally; set(value) = definedExternally
    var data: `T$6`? get() = definedExternally; set(value) = definedExternally
    var notification: AndroidNotification? get() = definedExternally; set(value) = definedExternally
}
external interface AndroidNotification {
    var title: String? get() = definedExternally; set(value) = definedExternally
    var body: String? get() = definedExternally; set(value) = definedExternally
    var icon: String? get() = definedExternally; set(value) = definedExternally
    var color: String? get() = definedExternally; set(value) = definedExternally
    var sound: String? get() = definedExternally; set(value) = definedExternally
    var tag: String? get() = definedExternally; set(value) = definedExternally
    var clickAction: String? get() = definedExternally; set(value) = definedExternally
    var bodyLocKey: String? get() = definedExternally; set(value) = definedExternally
    var bodyLocArgs: Array<String>? get() = definedExternally; set(value) = definedExternally
    var titleLocKey: String? get() = definedExternally; set(value) = definedExternally
    var titleLocArgs: Array<String>? get() = definedExternally; set(value) = definedExternally
}
external interface ApnsConfig {
    var headers: `T$6`? get() = definedExternally; set(value) = definedExternally
    var payload: ApnsPayload? get() = definedExternally; set(value) = definedExternally
}
external interface ApnsPayload {
    var aps: Aps
    @nativeGetter
    operator fun get(customData: String): Any?
    @nativeSetter
    operator fun set(customData: String, value: Any)
}
external interface Aps {
    var alert: dynamic /* String | admin.messaging.ApsAlert */ get() = definedExternally; set(value) = definedExternally
    var badge: Number? get() = definedExternally; set(value) = definedExternally
    var sound: String? get() = definedExternally; set(value) = definedExternally
    var contentAvailable: Boolean? get() = definedExternally; set(value) = definedExternally
    var category: String? get() = definedExternally; set(value) = definedExternally
    var threadId: String? get() = definedExternally; set(value) = definedExternally
}
external interface ApsAlert {
    var title: String? get() = definedExternally; set(value) = definedExternally
    var body: String? get() = definedExternally; set(value) = definedExternally
    var locKey: String? get() = definedExternally; set(value) = definedExternally
    var locArgs: Array<String>? get() = definedExternally; set(value) = definedExternally
    var titleLocKey: String? get() = definedExternally; set(value) = definedExternally
    var titleLocArgs: Array<String>? get() = definedExternally; set(value) = definedExternally
    var actionLocKey: String? get() = definedExternally; set(value) = definedExternally
    var launchImage: String? get() = definedExternally; set(value) = definedExternally
}
external interface Notification {
    var title: String? get() = definedExternally; set(value) = definedExternally
    var body: String? get() = definedExternally; set(value) = definedExternally
}
external interface WebpushConfig {
    var headers: `T$6`? get() = definedExternally; set(value) = definedExternally
    var data: `T$6`? get() = definedExternally; set(value) = definedExternally
    var notification: WebpushNotification? get() = definedExternally; set(value) = definedExternally
}
external interface WebpushNotification {
    var title: String? get() = definedExternally; set(value) = definedExternally
    var body: String? get() = definedExternally; set(value) = definedExternally
    var icon: String? get() = definedExternally; set(value) = definedExternally
}
external interface DataMessagePayload {
    @nativeGetter
    operator fun get(key: String): String?
    @nativeSetter
    operator fun set(key: String, value: String)
}
external interface NotificationMessagePayload {
    var tag: String? get() = definedExternally; set(value) = definedExternally
    var body: String? get() = definedExternally; set(value) = definedExternally
    var icon: String? get() = definedExternally; set(value) = definedExternally
    var badge: String? get() = definedExternally; set(value) = definedExternally
    var color: String? get() = definedExternally; set(value) = definedExternally
    var sound: String? get() = definedExternally; set(value) = definedExternally
    var title: String? get() = definedExternally; set(value) = definedExternally
    var bodyLocKey: String? get() = definedExternally; set(value) = definedExternally
    var bodyLocArgs: String? get() = definedExternally; set(value) = definedExternally
    var clickAction: String? get() = definedExternally; set(value) = definedExternally
    var titleLocKey: String? get() = definedExternally; set(value) = definedExternally
    var titleLocArgs: String? get() = definedExternally; set(value) = definedExternally
    @nativeGetter
    operator fun get(key: String): String?
    @nativeSetter
    operator fun set(key: String, value: String?)
}
external interface MessagingPayload {
    var data: DataMessagePayload? get() = definedExternally; set(value) = definedExternally
    var notification: NotificationMessagePayload? get() = definedExternally; set(value) = definedExternally
}
external interface MessagingOptions {
    var dryRun: Boolean? get() = definedExternally; set(value) = definedExternally
    var priority: String? get() = definedExternally; set(value) = definedExternally
    var timeToLive: Number? get() = definedExternally; set(value) = definedExternally
    var collapseKey: String? get() = definedExternally; set(value) = definedExternally
    var mutableContent: Boolean? get() = definedExternally; set(value) = definedExternally
    var contentAvailable: Boolean? get() = definedExternally; set(value) = definedExternally
    var restrictedPackageName: String? get() = definedExternally; set(value) = definedExternally
    @nativeGetter
    operator fun get(key: String): Any?
    @nativeSetter
    operator fun set(key: String, value: Any?)
}
external interface MessagingDeviceResult {
    var error: FirebaseError? get() = definedExternally; set(value) = definedExternally
    var messageId: String? get() = definedExternally; set(value) = definedExternally
    var canonicalRegistrationToken: String? get() = definedExternally; set(value) = definedExternally
}
external interface MessagingDevicesResponse {
    var canonicalRegistrationTokenCount: Number
    var failureCount: Number
    var multicastId: Number
    var results: Array<MessagingDeviceResult>
    var successCount: Number
}
external interface MessagingDeviceGroupResponse {
    var successCount: Number
    var failureCount: Number
    var failedRegistrationTokens: Array<String>
}
external interface MessagingTopicResponse {
    var messageId: Number
}
external interface MessagingConditionResponse {
    var messageId: Number
}
external interface MessagingTopicManagementResponse {
    var failureCount: Number
    var successCount: Number
    var errors: Array<FirebaseArrayIndexError>
}
external interface Messaging {
    var app: App
    fun send(message: TokenMessage, dryRun: Boolean? = definedExternally /* null */): Promise<String>
    fun send(message: TopicMessage, dryRun: Boolean? = definedExternally /* null */): Promise<String>
    fun send(message: ConditionMessage, dryRun: Boolean? = definedExternally /* null */): Promise<String>
    fun sendToDevice(registrationToken: String, payload: MessagingPayload, options: MessagingOptions? = definedExternally /* null */): Promise<MessagingDevicesResponse>
    fun sendToDevice(registrationToken: Array<String>, payload: MessagingPayload, options: MessagingOptions? = definedExternally /* null */): Promise<MessagingDevicesResponse>
    fun sendToDeviceGroup(notificationKey: String, payload: MessagingPayload, options: MessagingOptions? = definedExternally /* null */): Promise<MessagingDeviceGroupResponse>
    fun sendToTopic(topic: String, payload: MessagingPayload, options: MessagingOptions? = definedExternally /* null */): Promise<MessagingTopicResponse>
    fun sendToCondition(condition: String, payload: MessagingPayload, options: MessagingOptions? = definedExternally /* null */): Promise<MessagingConditionResponse>
    fun subscribeToTopic(registrationToken: String, topic: String): Promise<MessagingTopicManagementResponse>
    fun subscribeToTopic(registrationTokens: Array<String>, topic: String): Promise<MessagingTopicManagementResponse>
    fun unsubscribeFromTopic(registrationToken: String, topic: String): Promise<MessagingTopicManagementResponse>
    fun unsubscribeFromTopic(registrationTokens: Array<String>, topic: String): Promise<MessagingTopicManagementResponse>
}
