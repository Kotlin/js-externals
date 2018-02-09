@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("JQuery")

package js.externals.jquery.JQuery

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

external interface PlainObject<T> {
    @nativeGetter
    operator fun get(key: String): T?
    @nativeSetter
    operator fun set(key: String, value: T)
}
external interface AjaxSettings<TContext> : JQuery.Ajax.AjaxSettingsBase<TContext> {
    var url: String? get() = definedExternally; set(value) = definedExternally
    val beforeSend: ((`this`: TContext, jqXHR: jqXHR<Any>, settings: AjaxSettings<TContext>) -> dynamic /* Boolean | Unit */)? get() = definedExternally
}
external interface UrlAjaxSettings<TContext> : JQuery.Ajax.AjaxSettingsBase<TContext> {
    var url: String
    val beforeSend: ((`this`: TContext, jqXHR: jqXHR<Any>, settings: UrlAjaxSettings<TContext>) -> dynamic /* Boolean | Unit */)? get() = definedExternally
}
external interface Transport {
    fun send(headers: PlainObject<Any>, completeCallback: JQuery.Transport.SuccessCallback)
    fun abort()
    interface SuccessCallback {
        @nativeInvoke
        operator fun invoke(status: Number, statusText: String /* "error" */, responses: JQuery.PlainObject<Any>? = definedExternally /* null */, headers: String? = definedExternally /* null */)
        @nativeInvoke
        operator fun invoke(status: Number, statusText: String /* "success" */, responses: JQuery.PlainObject<Any>? = definedExternally /* null */, headers: String? = definedExternally /* null */)
        @nativeInvoke
        operator fun invoke(status: Number, statusText: String /* "notmodified" */, responses: JQuery.PlainObject<Any>? = definedExternally /* null */, headers: String? = definedExternally /* null */)
        @nativeInvoke
        operator fun invoke(status: Number, statusText: String /* "nocontent" */, responses: JQuery.PlainObject<Any>? = definedExternally /* null */, headers: String? = definedExternally /* null */)
        @nativeInvoke
        operator fun invoke(status: Number, statusText: String /* "timeout" */, responses: JQuery.PlainObject<Any>? = definedExternally /* null */, headers: String? = definedExternally /* null */)
        @nativeInvoke
        operator fun invoke(status: Number, statusText: String /* "abort" */, responses: JQuery.PlainObject<Any>? = definedExternally /* null */, headers: String? = definedExternally /* null */)
        @nativeInvoke
        operator fun invoke(status: Number, statusText: String /* "parsererror" */, responses: JQuery.PlainObject<Any>? = definedExternally /* null */, headers: String? = definedExternally /* null */)
    }
}
external interface `T$4` {
    var `200`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `201`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `202`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `203`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `204`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `205`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `206`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `207`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `208`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `209`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `210`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `211`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `212`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `213`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `214`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `215`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `216`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `217`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `218`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `219`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `220`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `221`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `222`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `223`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `224`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `225`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `226`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `227`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `228`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `229`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `230`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `231`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `232`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `233`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `234`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `235`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `236`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `237`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `238`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `239`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `240`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `241`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `242`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `243`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `244`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `245`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `246`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `247`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `248`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `249`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `250`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `251`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `252`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `253`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `254`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `255`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `256`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `257`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `258`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `259`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `260`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `261`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `262`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `263`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `264`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `265`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `266`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `267`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `268`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `269`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `270`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `271`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `272`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `273`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `274`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `275`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `276`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `277`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `278`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `279`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `280`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `281`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `282`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `283`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `284`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `285`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `286`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `287`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `288`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `289`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `290`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `291`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `292`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `293`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `294`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `295`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `296`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `297`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `298`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `299`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `304`: JQuery.Ajax.SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `300`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `301`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `302`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `303`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `305`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `306`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `307`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `308`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `309`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `310`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `311`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `312`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `313`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `314`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `315`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `316`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `317`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `318`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `319`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `320`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `321`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `322`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `323`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `324`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `325`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `326`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `327`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `328`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `329`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `330`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `331`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `332`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `333`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `334`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `335`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `336`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `337`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `338`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `339`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `340`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `341`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `342`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `343`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `344`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `345`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `346`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `347`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `348`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `349`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `350`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `351`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `352`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `353`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `354`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `355`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `356`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `357`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `358`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `359`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `360`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `361`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `362`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `363`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `364`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `365`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `366`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `367`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `368`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `369`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `370`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `371`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `372`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `373`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `374`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `375`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `376`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `377`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `378`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `379`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `380`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `381`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `382`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `383`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `384`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `385`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `386`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `387`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `388`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `389`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `390`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `391`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `392`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `393`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `394`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `395`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `396`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `397`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `398`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `399`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `400`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `401`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `402`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `403`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `404`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `405`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `406`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `407`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `408`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `409`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `410`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `411`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `412`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `413`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `414`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `415`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `416`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `417`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `418`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `419`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `420`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `421`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `422`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `423`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `424`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `425`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `426`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `427`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `428`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `429`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `430`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `431`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `432`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `433`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `434`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `435`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `436`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `437`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `438`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `439`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `440`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `441`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `442`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `443`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `444`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `445`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `446`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `447`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `448`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `449`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `450`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `451`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `452`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `453`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `454`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `455`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `456`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `457`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `458`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `459`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `460`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `461`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `462`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `463`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `464`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `465`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `466`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `467`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `468`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `469`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `470`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `471`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `472`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `473`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `474`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `475`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `476`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `477`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `478`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `479`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `480`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `481`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `482`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `483`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `484`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `485`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `486`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `487`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `488`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `489`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `490`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `491`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `492`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `493`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `494`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `495`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `496`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `497`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `498`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `499`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `500`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `501`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `502`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `503`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `504`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `505`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `506`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `507`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `508`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `509`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `510`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `511`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `512`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `513`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `514`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `515`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `516`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `517`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `518`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `519`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `520`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `521`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `522`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `523`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `524`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `525`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `526`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `527`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `528`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `529`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `530`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `531`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `532`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `533`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `534`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `535`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `536`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `537`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `538`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `539`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `540`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `541`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `542`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `543`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `544`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `545`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `546`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `547`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `548`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `549`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `550`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `551`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `552`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `553`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `554`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `555`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `556`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `557`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `558`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `559`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `560`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `561`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `562`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `563`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `564`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `565`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `566`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `567`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `568`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `569`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `570`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `571`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `572`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `573`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `574`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `575`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `576`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `577`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `578`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `579`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `580`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `581`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `582`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `583`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `584`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `585`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `586`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `587`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `588`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `589`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `590`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `591`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `592`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `593`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `594`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `595`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `596`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `597`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `598`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
    var `599`: JQuery.Ajax.ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
}
external interface `T$5` {
    @nativeGetter
    operator fun get(index: Number): dynamic /* JQuery.Ajax.SuccessCallback<TContext> | JQuery.Ajax.ErrorCallback<TContext> */
    @nativeSetter
    operator fun set(index: Number, value: JQuery.Ajax.SuccessCallback<TContext>)
    @nativeSetter
    operator fun set(index: Number, value: JQuery.Ajax.ErrorCallback<TContext>)
}
external interface jqXHR<TResolve> : Promise3<TResolve, jqXHR<TResolve>, Any?, dynamic /* String /* "success" */ | String /* "notmodified" */ | String /* "nocontent" */ */, dynamic /* String /* "error" */ | String /* "timeout" */ | String /* "abort" */ | String /* "parsererror" */ */, Any?, jqXHR<TResolve>, String, Any?>, Any?, Any? {
    var responseJSON: Any? get() = definedExternally; set(value) = definedExternally
    override fun state(): dynamic /* String /* "pending" */ | String /* "resolved" */ | String /* "rejected" */ */
    fun statusCode(map: `T$4` /* `T$4` & `T$5` */)
    interface DoneCallback<TResolve, TjqXHR> : JQuery.Deferred.Callback3<TResolve, dynamic /* String /* "success" */ | String /* "notmodified" */ | String /* "nocontent" */ */, TjqXHR>
    interface FailCallback<TjqXHR> : JQuery.Deferred.Callback3<TjqXHR, dynamic /* String /* "error" */ | String /* "timeout" */ | String /* "abort" */ | String /* "parsererror" */ */, String>
    interface AlwaysCallback<TResolve, TjqXHR> : JQuery.Deferred.Callback3<dynamic /* TResolve | TjqXHR */, dynamic /* String /* "error" */ | String /* "success" */ | String /* "notmodified" */ | String /* "nocontent" */ | String /* "timeout" */ | String /* "abort" */ | String /* "parsererror" */ */, dynamic /* String | TjqXHR */>
}
external interface Callbacks<T : Function<*>> {
    fun add(callback: T, vararg callbacks: T): Callbacks<T> /* this */
    fun add(callback: T, vararg callbacks: Array<T>): Callbacks<T> /* this */
    fun add(callback: Array<T>, vararg callbacks: T): Callbacks<T> /* this */
    fun add(callback: Array<T>, vararg callbacks: Array<T>): Callbacks<T> /* this */
    fun disable(): Callbacks<T> /* this */
    fun disabled(): Boolean
    fun empty(): Callbacks<T> /* this */
    fun fire(vararg args: Any): Callbacks<T> /* this */
    fun fireWith(context: Any, args: ArrayLike<Any>? = definedExternally /* null */): Callbacks<T> /* this */
    fun fired(): Boolean
    fun has(callback: T? = definedExternally /* null */): Boolean
    fun lock(): Callbacks<T> /* this */
    fun locked(): Boolean
    fun remove(vararg callbacks: T): Callbacks<T> /* this */
}
external interface CSSHook<TElement> {
    fun get(`this`: CSSHook<TElement> /* this */, elem: TElement, computed: Any, extra: Any): Any
    fun set(`this`: CSSHook<TElement> /* this */, elem: TElement, value: Any)
}
external interface Thenable<T> : PromiseLike<T>
external interface PromiseBase<TR, TJ, TN, UR, UJ, UN, VR, VJ, VN, SR, SJ, SN> : Promise<TR>, PromiseLike<TR> {
    fun always(alwaysCallback: JQuery.Deferred.CallbackBase<dynamic /* TR | TJ */, dynamic /* UR | UJ */, dynamic /* VR | VJ */, dynamic /* SR | SJ */>, vararg alwaysCallbacks: JQuery.Deferred.CallbackBase<dynamic /* TR | TJ */, dynamic /* UR | UJ */, dynamic /* VR | VJ */, dynamic /* SR | SJ */>): PromiseBase<TR, TJ, TN, UR, UJ, UN, VR, VJ, VN, SR, SJ, SN> /* this */
    fun always(alwaysCallback: JQuery.Deferred.CallbackBase<dynamic /* TR | TJ */, dynamic /* UR | UJ */, dynamic /* VR | VJ */, dynamic /* SR | SJ */>, vararg alwaysCallbacks: Array<JQuery.Deferred.CallbackBase<dynamic /* TR | TJ */, dynamic /* UR | UJ */, dynamic /* VR | VJ */, dynamic /* SR | SJ */>>): PromiseBase<TR, TJ, TN, UR, UJ, UN, VR, VJ, VN, SR, SJ, SN> /* this */
    fun always(alwaysCallback: Array<JQuery.Deferred.CallbackBase<dynamic /* TR | TJ */, dynamic /* UR | UJ */, dynamic /* VR | VJ */, dynamic /* SR | SJ */>>, vararg alwaysCallbacks: JQuery.Deferred.CallbackBase<dynamic /* TR | TJ */, dynamic /* UR | UJ */, dynamic /* VR | VJ */, dynamic /* SR | SJ */>): PromiseBase<TR, TJ, TN, UR, UJ, UN, VR, VJ, VN, SR, SJ, SN> /* this */
    fun always(alwaysCallback: Array<JQuery.Deferred.CallbackBase<dynamic /* TR | TJ */, dynamic /* UR | UJ */, dynamic /* VR | VJ */, dynamic /* SR | SJ */>>, vararg alwaysCallbacks: Array<JQuery.Deferred.CallbackBase<dynamic /* TR | TJ */, dynamic /* UR | UJ */, dynamic /* VR | VJ */, dynamic /* SR | SJ */>>): PromiseBase<TR, TJ, TN, UR, UJ, UN, VR, VJ, VN, SR, SJ, SN> /* this */
    fun done(doneCallback: JQuery.Deferred.CallbackBase<TR, UR, VR, SR>, vararg doneCallbacks: JQuery.Deferred.CallbackBase<TR, UR, VR, SR>): PromiseBase<TR, TJ, TN, UR, UJ, UN, VR, VJ, VN, SR, SJ, SN> /* this */
    fun done(doneCallback: JQuery.Deferred.CallbackBase<TR, UR, VR, SR>, vararg doneCallbacks: Array<JQuery.Deferred.CallbackBase<TR, UR, VR, SR>>): PromiseBase<TR, TJ, TN, UR, UJ, UN, VR, VJ, VN, SR, SJ, SN> /* this */
    fun done(doneCallback: Array<JQuery.Deferred.CallbackBase<TR, UR, VR, SR>>, vararg doneCallbacks: JQuery.Deferred.CallbackBase<TR, UR, VR, SR>): PromiseBase<TR, TJ, TN, UR, UJ, UN, VR, VJ, VN, SR, SJ, SN> /* this */
    fun done(doneCallback: Array<JQuery.Deferred.CallbackBase<TR, UR, VR, SR>>, vararg doneCallbacks: Array<JQuery.Deferred.CallbackBase<TR, UR, VR, SR>>): PromiseBase<TR, TJ, TN, UR, UJ, UN, VR, VJ, VN, SR, SJ, SN> /* this */
    fun fail(failCallback: JQuery.Deferred.CallbackBase<TJ, UJ, VJ, SJ>, vararg failCallbacks: JQuery.Deferred.CallbackBase<TJ, UJ, VJ, SJ>): PromiseBase<TR, TJ, TN, UR, UJ, UN, VR, VJ, VN, SR, SJ, SN> /* this */
    fun fail(failCallback: JQuery.Deferred.CallbackBase<TJ, UJ, VJ, SJ>, vararg failCallbacks: Array<JQuery.Deferred.CallbackBase<TJ, UJ, VJ, SJ>>): PromiseBase<TR, TJ, TN, UR, UJ, UN, VR, VJ, VN, SR, SJ, SN> /* this */
    fun fail(failCallback: Array<JQuery.Deferred.CallbackBase<TJ, UJ, VJ, SJ>>, vararg failCallbacks: JQuery.Deferred.CallbackBase<TJ, UJ, VJ, SJ>): PromiseBase<TR, TJ, TN, UR, UJ, UN, VR, VJ, VN, SR, SJ, SN> /* this */
    fun fail(failCallback: Array<JQuery.Deferred.CallbackBase<TJ, UJ, VJ, SJ>>, vararg failCallbacks: Array<JQuery.Deferred.CallbackBase<TJ, UJ, VJ, SJ>>): PromiseBase<TR, TJ, TN, UR, UJ, UN, VR, VJ, VN, SR, SJ, SN> /* this */
    fun progress(progressCallback: JQuery.Deferred.CallbackBase<TN, UN, VN, SN>, vararg progressCallbacks: JQuery.Deferred.CallbackBase<TN, UN, VN, SN>): PromiseBase<TR, TJ, TN, UR, UJ, UN, VR, VJ, VN, SR, SJ, SN> /* this */
    fun progress(progressCallback: JQuery.Deferred.CallbackBase<TN, UN, VN, SN>, vararg progressCallbacks: Array<JQuery.Deferred.CallbackBase<TN, UN, VN, SN>>): PromiseBase<TR, TJ, TN, UR, UJ, UN, VR, VJ, VN, SR, SJ, SN> /* this */
    fun progress(progressCallback: Array<JQuery.Deferred.CallbackBase<TN, UN, VN, SN>>, vararg progressCallbacks: JQuery.Deferred.CallbackBase<TN, UN, VN, SN>): PromiseBase<TR, TJ, TN, UR, UJ, UN, VR, VJ, VN, SR, SJ, SN> /* this */
    fun progress(progressCallback: Array<JQuery.Deferred.CallbackBase<TN, UN, VN, SN>>, vararg progressCallbacks: Array<JQuery.Deferred.CallbackBase<TN, UN, VN, SN>>): PromiseBase<TR, TJ, TN, UR, UJ, UN, VR, VJ, VN, SR, SJ, SN> /* this */
    fun <TTarget : Any> promise(target: TTarget): PromiseBase /* PromiseBase & TTarget */
    fun promise(): PromiseBase<TR, TJ, TN, UR, UJ, UN, VR, VJ, VN, SR, SJ, SN> /* this */
    fun state(): dynamic /* String /* "pending" */ | String /* "resolved" */ | String /* "rejected" */ */
    fun <ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND, ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF, ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP> pipe(doneFilter: (t: TR, u: UR, v: VR, s: SR) -> dynamic /* ARD | PromiseBase<ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND> | Thenable<ARD> */, failFilter: (t: TJ, u: UJ, v: VJ, s: SJ) -> dynamic /* AJF | PromiseBase<ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF> | Thenable<AJF> */, progressFilter: (t: TN, u: UN, v: VN, s: SN) -> dynamic /* ANP | PromiseBase<ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP> | Thenable<ANP> */): PromiseBase<dynamic /* ARD | ARF | ARP */, dynamic /* AJD | AJF | AJP */, dynamic /* AND | ANF | ANP */, dynamic /* BRD | BRF | BRP */, dynamic /* BJD | BJF | BJP */, dynamic /* BND | BNF | BNP */, dynamic /* CRD | CRF | CRP */, dynamic /* CJD | CJF | CJP */, dynamic /* CND | CNF | CNP */, dynamic /* RRD | RRF | RRP */, dynamic /* RJD | RJF | RJP */, dynamic /* RND | RNF | RNP */>
    fun <ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF, ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP> pipe(doneFilter: Nothing?, failFilter: (t: TJ, u: UJ, v: VJ, s: SJ) -> dynamic /* AJF | PromiseBase<ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF> | Thenable<AJF> */, progressFilter: (t: TN, u: UN, v: VN, s: SN) -> dynamic /* ANP | PromiseBase<ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP> | Thenable<ANP> */): PromiseBase<dynamic /* ARF | ARP */, dynamic /* AJF | AJP */, dynamic /* ANF | ANP */, dynamic /* BRF | BRP */, dynamic /* BJF | BJP */, dynamic /* BNF | BNP */, dynamic /* CRF | CRP */, dynamic /* CJF | CJP */, dynamic /* CNF | CNP */, dynamic /* RRF | RRP */, dynamic /* RJF | RJP */, dynamic /* RNF | RNP */>
    fun <ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND, ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP> pipe(doneFilter: (t: TR, u: UR, v: VR, s: SR) -> dynamic /* ARD | PromiseBase<ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND> | Thenable<ARD> */, failFilter: Nothing?, progressFilter: (t: TN, u: UN, v: VN, s: SN) -> dynamic /* ANP | PromiseBase<ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP> | Thenable<ANP> */): PromiseBase<dynamic /* ARD | ARP */, dynamic /* AJD | AJP */, dynamic /* AND | ANP */, dynamic /* BRD | BRP */, dynamic /* BJD | BJP */, dynamic /* BND | BNP */, dynamic /* CRD | CRP */, dynamic /* CJD | CJP */, dynamic /* CND | CNP */, dynamic /* RRD | RRP */, dynamic /* RJD | RJP */, dynamic /* RND | RNP */>
    fun <ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP> pipe(doneFilter: Nothing?, failFilter: Nothing?, progressFilter: ((t: TN, u: UN, v: VN, s: SN) -> dynamic /* ANP | PromiseBase<ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP> | Thenable<ANP> */)? = definedExternally /* null */): PromiseBase<ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP>
    fun <ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND, ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF> pipe(doneFilter: (t: TR, u: UR, v: VR, s: SR) -> dynamic /* ARD | PromiseBase<ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND> | Thenable<ARD> */, failFilter: (t: TJ, u: UJ, v: VJ, s: SJ) -> dynamic /* AJF | PromiseBase<ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF> | Thenable<AJF> */, progressFilter: Nothing? = definedExternally /* null */): PromiseBase<dynamic /* ARD | ARF */, dynamic /* AJD | AJF */, dynamic /* AND | ANF */, dynamic /* BRD | BRF */, dynamic /* BJD | BJF */, dynamic /* BND | BNF */, dynamic /* CRD | CRF */, dynamic /* CJD | CJF */, dynamic /* CND | CNF */, dynamic /* RRD | RRF */, dynamic /* RJD | RJF */, dynamic /* RND | RNF */>
    fun <ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF> pipe(doneFilter: Nothing?, failFilter: (t: TJ, u: UJ, v: VJ, s: SJ) -> dynamic /* AJF | PromiseBase<ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF> | Thenable<AJF> */, progressFilter: Nothing? = definedExternally /* null */): PromiseBase<ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF>
    fun <ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND> pipe(doneFilter: (t: TR, u: UR, v: VR, s: SR) -> dynamic /* ARD | PromiseBase<ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND> | Thenable<ARD> */, failFilter: Nothing? = definedExternally /* null */, progressFilter: Nothing? = definedExternally /* null */): PromiseBase<ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND>
    fun <ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND, ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF, ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP> then(doneFilter: (t: TR, u: UR, v: VR, s: SR) -> dynamic /* ARD | PromiseBase<ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND> | Thenable<ARD> */, failFilter: (t: TJ, u: UJ, v: VJ, s: SJ) -> dynamic /* ARF | PromiseBase<ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF> | Thenable<ARF> */, progressFilter: (t: TN, u: UN, v: VN, s: SN) -> dynamic /* ANP | PromiseBase<ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP> | Thenable<ANP> */): PromiseBase<dynamic /* ARD | ARF | ARP */, dynamic /* AJD | AJF | AJP */, dynamic /* AND | ANF | ANP */, dynamic /* BRD | BRF | BRP */, dynamic /* BJD | BJF | BJP */, dynamic /* BND | BNF | BNP */, dynamic /* CRD | CRF | CRP */, dynamic /* CJD | CJF | CJP */, dynamic /* CND | CNF | CNP */, dynamic /* RRD | RRF | RRP */, dynamic /* RJD | RJF | RJP */, dynamic /* RND | RNF | RNP */>
    fun <ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF, ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP> then(doneFilter: Nothing?, failFilter: (t: TJ, u: UJ, v: VJ, s: SJ) -> dynamic /* ARF | PromiseBase<ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF> | Thenable<ARF> */, progressFilter: (t: TN, u: UN, v: VN, s: SN) -> dynamic /* ANP | PromiseBase<ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP> | Thenable<ANP> */): PromiseBase<dynamic /* ARF | ARP */, dynamic /* AJF | AJP */, dynamic /* ANF | ANP */, dynamic /* BRF | BRP */, dynamic /* BJF | BJP */, dynamic /* BNF | BNP */, dynamic /* CRF | CRP */, dynamic /* CJF | CJP */, dynamic /* CNF | CNP */, dynamic /* RRF | RRP */, dynamic /* RJF | RJP */, dynamic /* RNF | RNP */>
    fun <ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND, ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP> then(doneFilter: (t: TR, u: UR, v: VR, s: SR) -> dynamic /* ARD | PromiseBase<ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND> | Thenable<ARD> */, failFilter: Nothing?, progressFilter: (t: TN, u: UN, v: VN, s: SN) -> dynamic /* ANP | PromiseBase<ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP> | Thenable<ANP> */): PromiseBase<dynamic /* ARD | ARP */, dynamic /* AJD | AJP */, dynamic /* AND | ANP */, dynamic /* BRD | BRP */, dynamic /* BJD | BJP */, dynamic /* BND | BNP */, dynamic /* CRD | CRP */, dynamic /* CJD | CJP */, dynamic /* CND | CNP */, dynamic /* RRD | RRP */, dynamic /* RJD | RJP */, dynamic /* RND | RNP */>
    fun <ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP> then(doneFilter: Nothing?, failFilter: Nothing?, progressFilter: ((t: TN, u: UN, v: VN, s: SN) -> dynamic /* ANP | PromiseBase<ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP> | Thenable<ANP> */)? = definedExternally /* null */): PromiseBase<ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP>
    fun <ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND, ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF> then(doneFilter: (t: TR, u: UR, v: VR, s: SR) -> dynamic /* ARD | PromiseBase<ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND> | Thenable<ARD> */, failFilter: (t: TJ, u: UJ, v: VJ, s: SJ) -> dynamic /* ARF | PromiseBase<ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF> | Thenable<ARF> */, progressFilter: Nothing? = definedExternally /* null */): PromiseBase<dynamic /* ARD | ARF */, dynamic /* AJD | AJF */, dynamic /* AND | ANF */, dynamic /* BRD | BRF */, dynamic /* BJD | BJF */, dynamic /* BND | BNF */, dynamic /* CRD | CRF */, dynamic /* CJD | CJF */, dynamic /* CND | CNF */, dynamic /* RRD | RRF */, dynamic /* RJD | RJF */, dynamic /* RND | RNF */>
    fun <ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF> then(doneFilter: Nothing?, failFilter: (t: TJ, u: UJ, v: VJ, s: SJ) -> dynamic /* ARF | PromiseBase<ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF> | Thenable<ARF> */, progressFilter: Nothing? = definedExternally /* null */): PromiseBase<ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF>
    fun <ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND> then(doneFilter: (t: TR, u: UR, v: VR, s: SR) -> dynamic /* ARD | PromiseBase<ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND> | Thenable<ARD> */, failFilter: Nothing? = definedExternally /* null */, progressFilter: Nothing? = definedExternally /* null */): PromiseBase<ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND>
    fun <ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF> catch(failFilter: ((t: TJ, u: UJ, v: VJ, s: SJ) -> dynamic /* ARF | PromiseBase<ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF> | Thenable<ARF> */)? = definedExternally /* null */): PromiseBase<ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF>
}
external interface Promise3<TR, TJ, TN, UR, UJ, UN, VR, VJ, VN> : PromiseBase<TR, TJ, TN, UR, UJ, UN, VR, VJ, VN, Any?, Any?, Any?>
external interface Promise2<TR, TJ, TN, UR, UJ, UN> : PromiseBase<TR, TJ, TN, UR, UJ, UN, Any?, Any?, Any?, Any?, Any?, Any?>
external interface Promise<TR, TJ, TN> : PromiseBase<TR, TJ, TN, TR, TJ, TN, TR, TJ, TN, TR, TJ, TN>
external interface DeferredStatic {
    var exceptionHook: Any
    @nativeInvoke
    operator fun <TR, TJ, TN> invoke(beforeStart: ((`this`: Deferred<TR, TJ, TN>, deferred: Deferred<TR, TJ, TN>) -> Unit)? = definedExternally /* null */): Deferred<TR, TJ, TN>
}
external interface Deferred<TR, TJ, TN> {
    fun notify(vararg args: TN): Deferred<TR, TJ, TN> /* this */
    fun notifyWith(context: Any, args: ArrayLike<TN>? = definedExternally /* null */): Deferred<TR, TJ, TN> /* this */
    fun reject(vararg args: TJ): Deferred<TR, TJ, TN> /* this */
    fun rejectWith(context: Any, args: ArrayLike<TJ>? = definedExternally /* null */): Deferred<TR, TJ, TN> /* this */
    fun resolve(vararg args: TR): Deferred<TR, TJ, TN> /* this */
    fun resolveWith(context: Any, args: ArrayLike<TR>? = definedExternally /* null */): Deferred<TR, TJ, TN> /* this */
    fun always(alwaysCallback: JQuery.Deferred.Callback<dynamic /* TR | TJ */>, vararg alwaysCallbacks: JQuery.Deferred.Callback<dynamic /* TR | TJ */>): Deferred<TR, TJ, TN> /* this */
    fun always(alwaysCallback: JQuery.Deferred.Callback<dynamic /* TR | TJ */>, vararg alwaysCallbacks: Array<JQuery.Deferred.Callback<dynamic /* TR | TJ */>>): Deferred<TR, TJ, TN> /* this */
    fun always(alwaysCallback: Array<JQuery.Deferred.Callback<dynamic /* TR | TJ */>>, vararg alwaysCallbacks: JQuery.Deferred.Callback<dynamic /* TR | TJ */>): Deferred<TR, TJ, TN> /* this */
    fun always(alwaysCallback: Array<JQuery.Deferred.Callback<dynamic /* TR | TJ */>>, vararg alwaysCallbacks: Array<JQuery.Deferred.Callback<dynamic /* TR | TJ */>>): Deferred<TR, TJ, TN> /* this */
    fun done(doneCallback: JQuery.Deferred.Callback<TR>, vararg doneCallbacks: JQuery.Deferred.Callback<TR>): Deferred<TR, TJ, TN> /* this */
    fun done(doneCallback: JQuery.Deferred.Callback<TR>, vararg doneCallbacks: Array<JQuery.Deferred.Callback<TR>>): Deferred<TR, TJ, TN> /* this */
    fun done(doneCallback: Array<JQuery.Deferred.Callback<TR>>, vararg doneCallbacks: JQuery.Deferred.Callback<TR>): Deferred<TR, TJ, TN> /* this */
    fun done(doneCallback: Array<JQuery.Deferred.Callback<TR>>, vararg doneCallbacks: Array<JQuery.Deferred.Callback<TR>>): Deferred<TR, TJ, TN> /* this */
    fun fail(failCallback: JQuery.Deferred.Callback<TJ>, vararg failCallbacks: JQuery.Deferred.Callback<TJ>): Deferred<TR, TJ, TN> /* this */
    fun fail(failCallback: JQuery.Deferred.Callback<TJ>, vararg failCallbacks: Array<JQuery.Deferred.Callback<TJ>>): Deferred<TR, TJ, TN> /* this */
    fun fail(failCallback: Array<JQuery.Deferred.Callback<TJ>>, vararg failCallbacks: JQuery.Deferred.Callback<TJ>): Deferred<TR, TJ, TN> /* this */
    fun fail(failCallback: Array<JQuery.Deferred.Callback<TJ>>, vararg failCallbacks: Array<JQuery.Deferred.Callback<TJ>>): Deferred<TR, TJ, TN> /* this */
    fun progress(progressCallback: JQuery.Deferred.Callback<TN>, vararg progressCallbacks: JQuery.Deferred.Callback<TN>): Deferred<TR, TJ, TN> /* this */
    fun progress(progressCallback: JQuery.Deferred.Callback<TN>, vararg progressCallbacks: Array<JQuery.Deferred.Callback<TN>>): Deferred<TR, TJ, TN> /* this */
    fun progress(progressCallback: Array<JQuery.Deferred.Callback<TN>>, vararg progressCallbacks: JQuery.Deferred.Callback<TN>): Deferred<TR, TJ, TN> /* this */
    fun progress(progressCallback: Array<JQuery.Deferred.Callback<TN>>, vararg progressCallbacks: Array<JQuery.Deferred.Callback<TN>>): Deferred<TR, TJ, TN> /* this */
    fun <TTarget : Any> promise(target: TTarget): Promise<TR, TJ, TN> /* Promise<TR, TJ, TN> & TTarget */
    fun promise(): Promise<TR, TJ, TN>
    fun state(): dynamic /* String /* "pending" */ | String /* "resolved" */ | String /* "rejected" */ */
    fun <ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND, ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF, ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP> pipe(doneFilter: (t: TR) -> dynamic /* ARD | PromiseBase<ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND> | Thenable<ARD> */, failFilter: (t: TJ) -> dynamic /* AJF | PromiseBase<ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF> | Thenable<AJF> */, progressFilter: (t: TN) -> dynamic /* ANP | PromiseBase<ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP> | Thenable<ANP> */): PromiseBase<dynamic /* ARD | ARF | ARP */, dynamic /* AJD | AJF | AJP */, dynamic /* AND | ANF | ANP */, dynamic /* BRD | BRF | BRP */, dynamic /* BJD | BJF | BJP */, dynamic /* BND | BNF | BNP */, dynamic /* CRD | CRF | CRP */, dynamic /* CJD | CJF | CJP */, dynamic /* CND | CNF | CNP */, dynamic /* RRD | RRF | RRP */, dynamic /* RJD | RJF | RJP */, dynamic /* RND | RNF | RNP */>
    fun <ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF, ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP> pipe(doneFilter: Nothing?, failFilter: (t: TJ) -> dynamic /* AJF | PromiseBase<ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF> | Thenable<AJF> */, progressFilter: (t: TN) -> dynamic /* ANP | PromiseBase<ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP> | Thenable<ANP> */): PromiseBase<dynamic /* ARF | ARP */, dynamic /* AJF | AJP */, dynamic /* ANF | ANP */, dynamic /* BRF | BRP */, dynamic /* BJF | BJP */, dynamic /* BNF | BNP */, dynamic /* CRF | CRP */, dynamic /* CJF | CJP */, dynamic /* CNF | CNP */, dynamic /* RRF | RRP */, dynamic /* RJF | RJP */, dynamic /* RNF | RNP */>
    fun <ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND, ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP> pipe(doneFilter: (t: TR) -> dynamic /* ARD | PromiseBase<ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND> | Thenable<ARD> */, failFilter: Nothing?, progressFilter: (t: TN) -> dynamic /* ANP | PromiseBase<ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP> | Thenable<ANP> */): PromiseBase<dynamic /* ARD | ARP */, dynamic /* AJD | AJP */, dynamic /* AND | ANP */, dynamic /* BRD | BRP */, dynamic /* BJD | BJP */, dynamic /* BND | BNP */, dynamic /* CRD | CRP */, dynamic /* CJD | CJP */, dynamic /* CND | CNP */, dynamic /* RRD | RRP */, dynamic /* RJD | RJP */, dynamic /* RND | RNP */>
    fun <ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP> pipe(doneFilter: Nothing?, failFilter: Nothing?, progressFilter: ((t: TN) -> dynamic /* ANP | PromiseBase<ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP> | Thenable<ANP> */)? = definedExternally /* null */): PromiseBase<ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP>
    fun <ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND, ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF> pipe(doneFilter: (t: TR) -> dynamic /* ARD | PromiseBase<ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND> | Thenable<ARD> */, failFilter: (t: TJ) -> dynamic /* AJF | PromiseBase<ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF> | Thenable<AJF> */, progressFilter: Nothing? = definedExternally /* null */): PromiseBase<dynamic /* ARD | ARF */, dynamic /* AJD | AJF */, dynamic /* AND | ANF */, dynamic /* BRD | BRF */, dynamic /* BJD | BJF */, dynamic /* BND | BNF */, dynamic /* CRD | CRF */, dynamic /* CJD | CJF */, dynamic /* CND | CNF */, dynamic /* RRD | RRF */, dynamic /* RJD | RJF */, dynamic /* RND | RNF */>
    fun <ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF> pipe(doneFilter: Nothing?, failFilter: (t: TJ) -> dynamic /* AJF | PromiseBase<ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF> | Thenable<AJF> */, progressFilter: Nothing? = definedExternally /* null */): PromiseBase<ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF>
    fun <ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND> pipe(doneFilter: (t: TR) -> dynamic /* ARD | PromiseBase<ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND> | Thenable<ARD> */, failFilter: Nothing? = definedExternally /* null */, progressFilter: Nothing? = definedExternally /* null */): PromiseBase<ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND>
    fun <ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND, ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF, ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP> then(doneFilter: (t: TR) -> dynamic /* ARD | PromiseBase<ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND> | Thenable<ARD> */, failFilter: (t: TJ) -> dynamic /* ARF | PromiseBase<ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF> | Thenable<ARF> */, progressFilter: (t: TN) -> dynamic /* ANP | PromiseBase<ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP> | Thenable<ANP> */): PromiseBase<dynamic /* ARD | ARF | ARP */, dynamic /* AJD | AJF | AJP */, dynamic /* AND | ANF | ANP */, dynamic /* BRD | BRF | BRP */, dynamic /* BJD | BJF | BJP */, dynamic /* BND | BNF | BNP */, dynamic /* CRD | CRF | CRP */, dynamic /* CJD | CJF | CJP */, dynamic /* CND | CNF | CNP */, dynamic /* RRD | RRF | RRP */, dynamic /* RJD | RJF | RJP */, dynamic /* RND | RNF | RNP */>
    fun <ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF, ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP> then(doneFilter: Nothing?, failFilter: (t: TJ) -> dynamic /* ARF | PromiseBase<ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF> | Thenable<ARF> */, progressFilter: (t: TN) -> dynamic /* ANP | PromiseBase<ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP> | Thenable<ANP> */): PromiseBase<dynamic /* ARF | ARP */, dynamic /* AJF | AJP */, dynamic /* ANF | ANP */, dynamic /* BRF | BRP */, dynamic /* BJF | BJP */, dynamic /* BNF | BNP */, dynamic /* CRF | CRP */, dynamic /* CJF | CJP */, dynamic /* CNF | CNP */, dynamic /* RRF | RRP */, dynamic /* RJF | RJP */, dynamic /* RNF | RNP */>
    fun <ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND, ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP> then(doneFilter: (t: TR) -> dynamic /* ARD | PromiseBase<ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND> | Thenable<ARD> */, failFilter: Nothing?, progressFilter: (t: TN) -> dynamic /* ANP | PromiseBase<ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP> | Thenable<ANP> */): PromiseBase<dynamic /* ARD | ARP */, dynamic /* AJD | AJP */, dynamic /* AND | ANP */, dynamic /* BRD | BRP */, dynamic /* BJD | BJP */, dynamic /* BND | BNP */, dynamic /* CRD | CRP */, dynamic /* CJD | CJP */, dynamic /* CND | CNP */, dynamic /* RRD | RRP */, dynamic /* RJD | RJP */, dynamic /* RND | RNP */>
    fun <ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP> then(doneFilter: Nothing?, failFilter: Nothing?, progressFilter: ((t: TN) -> dynamic /* ANP | PromiseBase<ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP> | Thenable<ANP> */)? = definedExternally /* null */): PromiseBase<ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP>
    fun <ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND, ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF> then(doneFilter: (t: TR) -> dynamic /* ARD | PromiseBase<ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND> | Thenable<ARD> */, failFilter: (t: TJ) -> dynamic /* ARF | PromiseBase<ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF> | Thenable<ARF> */, progressFilter: Nothing? = definedExternally /* null */): PromiseBase<dynamic /* ARD | ARF */, dynamic /* AJD | AJF */, dynamic /* AND | ANF */, dynamic /* BRD | BRF */, dynamic /* BJD | BJF */, dynamic /* BND | BNF */, dynamic /* CRD | CRF */, dynamic /* CJD | CJF */, dynamic /* CND | CNF */, dynamic /* RRD | RRF */, dynamic /* RJD | RJF */, dynamic /* RND | RNF */>
    fun <ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF> then(doneFilter: Nothing?, failFilter: (t: TJ) -> dynamic /* ARF | PromiseBase<ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF> | Thenable<ARF> */, progressFilter: Nothing? = definedExternally /* null */): PromiseBase<ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF>
    fun <ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND> then(doneFilter: (t: TR) -> dynamic /* ARD | PromiseBase<ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND> | Thenable<ARD> */, failFilter: Nothing? = definedExternally /* null */, progressFilter: Nothing? = definedExternally /* null */): PromiseBase<ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND>
    fun <ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF> catch(failFilter: ((t: TJ) -> dynamic /* ARF | PromiseBase<ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF> | Thenable<ARF> */)? = definedExternally /* null */): PromiseBase<ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF>
    interface CallbackBase<T, U, V, R> {
        @nativeInvoke
        operator fun invoke(t: T, u: U, v: V, vararg r: R)
    }
    interface Callback3<T, U, V> : CallbackBase<T, U, V, Any?>
    interface Callback<T> {
        @nativeInvoke
        operator fun invoke(vararg args: T)
    }
    interface DoneCallback<TResolve> : Callback<TResolve>
    interface FailCallback<TReject> : Callback<TReject>
    interface AlwaysCallback<TResolve, TReject> : Callback<dynamic /* TResolve | TReject */>
    interface ProgressCallback<TNotify> : Callback<TNotify>
}
external interface QueueFunction<TElement> {
    @nativeInvoke
    operator fun invoke(`this`: TElement, next: () -> Unit)
}
external interface EffectsOptions<TElement> {
    val always: ((`this`: TElement, animation: Promise<Any, Any, Any>, jumpedToEnd: Boolean) -> Unit)? get() = definedExternally
    val complete: ((`this`: TElement) -> Unit)? get() = definedExternally
    val done: ((`this`: TElement, animation: Promise<Any, Any, Any>, jumpedToEnd: Boolean) -> Unit)? get() = definedExternally
    var duration: dynamic /* Number | String /* "fast" */ | String /* "slow" */ */ get() = definedExternally; set(value) = definedExternally
    var easing: String? get() = definedExternally; set(value) = definedExternally
    val fail: ((`this`: TElement, animation: Promise<Any, Any, Any>, jumpedToEnd: Boolean) -> Unit)? get() = definedExternally
    val progress: ((`this`: TElement, animation: Promise<Any, Any, Any>, progress: Number, remainingMs: Number) -> Unit)? get() = definedExternally
    var queue: dynamic /* String | Boolean */ get() = definedExternally; set(value) = definedExternally
    var specialEasing: PlainObject<String>? get() = definedExternally; set(value) = definedExternally
    val start: ((`this`: TElement, animation: Promise<Any, Any, Any>) -> Unit)? get() = definedExternally
    val step: ((`this`: TElement, now: Number, tween: Tween<TElement>) -> Unit)? get() = definedExternally
}
external interface SpeedSettings<TElement> {
    var duration: dynamic /* Number | String /* "fast" */ | String /* "slow" */ */ get() = definedExternally; set(value) = definedExternally
    var easing: String? get() = definedExternally; set(value) = definedExternally
    val complete: ((`this`: TElement) -> Unit)? get() = definedExternally
}
external interface Tween<TElement> {
    var easing: String
    var elem: TElement
    var end: Number
    var now: Number
    var options: EffectsOptions<TElement>
    var pos: Number
    var prop: String
    var start: Number
    var unit: String
}
external interface AnimationHook<TElement> {
    @nativeInvoke
    operator fun invoke(fx: Tween<TElement>)
}
external interface EventStatic<TTarget> {
    @nativeInvoke
    operator fun <T : Any> invoke(event: String, properties: T? = definedExternally /* null */): Event<TTarget, Nothing?> /* Event<TTarget, Nothing?> & T */
    @nativeInvoke
    operator fun <T : EventLike> invoke(properties: T): Event<TTarget, Nothing?> /* Event<TTarget, Nothing?> & T */
}
external interface Event {
    var metaKey: Boolean
    var namespace: String
    var pageX: Number
    var pageY: Number
    var result: Any
    var timeStamp: Number
    var type: String
    var which: Number
    fun isDefaultPrevented(): Boolean
    fun isImmediatePropagationStopped(): Boolean
    fun isPropagationStopped(): Boolean
    fun preventDefault()
    fun stopImmediatePropagation()
    fun stopPropagation()
    var currentTarget: TTarget
    var data: TData
    var delegateTarget: TTarget
    var originalEvent: Event
    var relatedTarget: TTarget?
    var target: TTarget
}
external interface EventLike {
    var type: String
}
external interface EventHandler<TCurrentTarget : EventTarget, TData> : EventHandlerBase<TCurrentTarget, Event<TCurrentTarget, TData>>
external interface EventHandlerBase<TContext : Any, T> {
    @nativeInvoke
    operator fun invoke(`this`: TContext, t: T, vararg args: Any): dynamic /* Unit | Boolean | Any */
}
external enum class Mouse {
    None /* = 0 */,
    Left /* = 1 */,
    Middle /* = 2 */,
    Right /* = 3 */
}
external enum class Key {
    Backspace /* = 8 */,
    Tab /* = 9 */,
    Enter /* = 13 */,
    Shift /* = 16 */,
    Control /* = 17 */,
    Alt /* = 18 */,
    CapsLock /* = 20 */,
    Escape /* = 27 */,
    Space /* = 32 */,
    PageUp /* = 33 */,
    PageDown /* = 34 */,
    End /* = 35 */,
    Home /* = 36 */,
    ArrowLeft /* = 37 */,
    ArrowUp /* = 38 */,
    ArrowRight /* = 39 */,
    ArrowDown /* = 40 */,
    Semicolon /* = 186 */,
    Colon /* = 186 */,
    EqualsSign /* = 187 */,
    Plus /* = 187 */,
    Comma /* = 188 */,
    LessThanSign /* = 188 */,
    Minus /* = 189 */,
    Underscore /* = 189 */,
    Period /* = 190 */,
    GreaterThanSign /* = 190 */,
    ForwardSlash /* = 191 */,
    QuestionMark /* = 191 */,
    Backtick /* = 192 */,
    Tilde /* = 192 */,
    OpeningSquareBracket /* = 219 */,
    OpeningCurlyBrace /* = 219 */,
    Backslash /* = 220 */,
    Pipe /* = 220 */,
    ClosingSquareBracket /* = 221 */,
    ClosingCurlyBrace /* = 221 */,
    SingleQuote /* = 222 */,
    DoubleQuote /* = 222 */,
    Pause /* = 19 */,
    PrintScreen /* = 44 */,
    Insert /* = 45 */,
    Delete /* = 46 */,
    Num0 /* = 48 */,
    Num1 /* = 49 */,
    Num2 /* = 50 */,
    Num3 /* = 51 */,
    Num4 /* = 52 */,
    Num5 /* = 53 */,
    Num6 /* = 54 */,
    Num7 /* = 55 */,
    Num8 /* = 56 */,
    Num9 /* = 57 */,
    A /* = 65 */,
    B /* = 66 */,
    C /* = 67 */,
    D /* = 68 */,
    E /* = 69 */,
    F /* = 70 */,
    G /* = 71 */,
    H /* = 72 */,
    I /* = 73 */,
    J /* = 74 */,
    K /* = 75 */,
    L /* = 76 */,
    M /* = 77 */,
    N /* = 78 */,
    O /* = 79 */,
    P /* = 80 */,
    Q /* = 81 */,
    R /* = 82 */,
    S /* = 83 */,
    T /* = 84 */,
    U /* = 85 */,
    V /* = 86 */,
    W /* = 87 */,
    X /* = 88 */,
    Y /* = 89 */,
    Z /* = 90 */,
    MetaLeft /* = 91 */,
    MetaRight /* = 92 */,
    ContextMenu /* = 93 */,
    Numpad0 /* = 96 */,
    Numpad1 /* = 97 */,
    Numpad2 /* = 98 */,
    Numpad3 /* = 99 */,
    Numpad4 /* = 100 */,
    Numpad5 /* = 101 */,
    Numpad6 /* = 102 */,
    Numpad7 /* = 103 */,
    Numpad8 /* = 104 */,
    Numpad9 /* = 105 */,
    NumpadMultiply /* = 106 */,
    NumpadAdd /* = 107 */,
    NumpadSubtract /* = 109 */,
    NumpadDecimal /* = 110 */,
    NumpadDivide /* = 111 */,
    F1 /* = 112 */,
    F2 /* = 113 */,
    F3 /* = 114 */,
    F4 /* = 115 */,
    F5 /* = 116 */,
    F6 /* = 117 */,
    F7 /* = 118 */,
    F8 /* = 119 */,
    F9 /* = 120 */,
    F10 /* = 121 */,
    F11 /* = 122 */,
    F12 /* = 123 */,
    NumLock /* = 144 */,
    ScrollLock /* = 145 */
}
external interface NameValuePair {
    var name: String
    var value: String
}
external interface Coordinates {
    var left: Number
    var top: Number
}
external interface ValHook<TElement> {
    val get: ((elem: TElement) -> Any)? get() = definedExternally
    val set: ((elem: TElement, value: Any) -> Any)? get() = definedExternally
}
