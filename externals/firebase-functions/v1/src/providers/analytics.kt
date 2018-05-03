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
package js.externals.firebase.functions.providers.analytics

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

external fun event(analyticsEventType: String): AnalyticsEventBuilder = definedExternally
external open class AnalyticsEventBuilder {
    open var triggerResource: Any = definedExternally
    open fun onLog(handler: (event: AnalyticsEvent, context: EventContext? /*= null*/) -> dynamic /* PromiseLike<Any> | Any */): CloudFunction<AnalyticsEvent> = definedExternally
}
external open class AnalyticsEvent {
    open var reportingDate: String = definedExternally
    open var name: String = definedExternally
    open var params: Json = definedExternally
    open var logTime: String = definedExternally
    open var previousLogTime: String = definedExternally
    open var valueInUSD: Number = definedExternally
    open var user: UserDimensions = definedExternally
}
external interface `T$0` {
    @nativeGetter
    operator fun get(key: String): UserPropertyValue?
    @nativeSetter
    operator fun set(key: String, value: UserPropertyValue)
}
external open class UserDimensions {
    open var userId: String = definedExternally
    open var firstOpenTime: String = definedExternally
    open var userProperties: `T$0` = definedExternally
    open var deviceInfo: DeviceInfo = definedExternally
    open var geoInfo: GeoInfo = definedExternally
    open var appInfo: AppInfo = definedExternally
    open var bundleInfo: ExportBundleInfo = definedExternally
}
external open class UserPropertyValue {
    open var value: String = definedExternally
    open var setTime: String = definedExternally
}
external interface DeviceInfo {
    var deviceCategory: String? get() = definedExternally; set(value) = definedExternally
    var mobileBrandName: String? get() = definedExternally; set(value) = definedExternally
    var mobileModelName: String? get() = definedExternally; set(value) = definedExternally
    var mobileMarketingName: String? get() = definedExternally; set(value) = definedExternally
    var deviceModel: String? get() = definedExternally; set(value) = definedExternally
    var platformVersion: String? get() = definedExternally; set(value) = definedExternally
    var deviceId: String? get() = definedExternally; set(value) = definedExternally
    var resettableDeviceId: String? get() = definedExternally; set(value) = definedExternally
    var userDefaultLanguage: String
    var deviceTimeZoneOffsetSeconds: Number
    var limitedAdTracking: Boolean
}
external interface GeoInfo {
    var continent: String? get() = definedExternally; set(value) = definedExternally
    var country: String? get() = definedExternally; set(value) = definedExternally
    var region: String? get() = definedExternally; set(value) = definedExternally
    var city: String? get() = definedExternally; set(value) = definedExternally
}
external interface AppInfo {
    var appVersion: String? get() = definedExternally; set(value) = definedExternally
    var appInstanceId: String
    var appStore: String? get() = definedExternally; set(value) = definedExternally
    var appPlatform: String
    var appId: String? get() = definedExternally; set(value) = definedExternally
}
external open class ExportBundleInfo {
    open var bundleSequenceId: Number = definedExternally
    open var serverTimestampOffset: Number = definedExternally
}
