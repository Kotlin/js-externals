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

external fun issue(): IssueBuilder = definedExternally
external open class IssueBuilder {
    open var triggerResource: Any = definedExternally
    open fun onNew(handler: (issue: Issue, context: EventContext? /*= null*/) -> dynamic /* PromiseLike<Any> | Any */): CloudFunction<Issue> = definedExternally
    open fun onRegressed(handler: (issue: Issue, context: EventContext? /*= null*/) -> dynamic /* PromiseLike<Any> | Any */): CloudFunction<Issue> = definedExternally
    open fun onVelocityAlert(handler: (issue: Issue, context: EventContext? /*= null*/) -> dynamic /* PromiseLike<Any> | Any */): CloudFunction<Issue> = definedExternally
    open fun onEvent(handler: Any, eventType: Any): Unit = definedExternally
}
external interface Issue {
    var issueId: String
    var issueTitle: String
    var appInfo: AppInfo
    var createTime: String
    var resolvedTime: String? get() = definedExternally; set(value) = definedExternally
    var velocityAlert: VelocityAlert? get() = definedExternally; set(value) = definedExternally
}
external interface VelocityAlert {
    var crashPercentage: Number
    var crashes: Number
}
external interface AppInfo {
    var appName: String
    var appPlatform: String
    var appId: String
    var latestAppVersion: String
}
