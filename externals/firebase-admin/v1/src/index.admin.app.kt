@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("admin.app")
package admin.app

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

external interface App {
    var name: String
    var options: admin.AppOptions
    fun auth(): admin.auth.Auth
    fun database(url: String? = definedExternally /* null */): admin.database.Database
    fun firestore(): admin.firestore.Firestore
    fun instanceId(): admin.instanceId.InstanceId
    fun messaging(): admin.messaging.Messaging
    fun storage(): admin.storage.Storage
    fun delete(): Promise<Unit>
}
