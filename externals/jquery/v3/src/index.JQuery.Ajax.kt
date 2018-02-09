@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "PACKAGE_OR_CLASSIFIER_REDECLARATION")
@file:JsQualifier("JQuery.Ajax")
package js.externals.jquery.JQuery.Ajax

import js.externals.jquery.JQuery.PlainObject
import js.externals.jquery.JQuery.jqXHR
import org.w3c.xhr.XMLHttpRequest
import kotlin.js.*

external interface SuccessCallback<TContext> {
    @nativeInvoke
    operator fun invoke(`this`: TContext, data: Any, textStatus: String /* "success" */, jqXHR: jqXHR<Any>)
    @nativeInvoke
    operator fun invoke(`this`: TContext, data: Any, textStatus: String /* "notmodified" */, jqXHR: jqXHR<Any>)
    @nativeInvoke
    operator fun invoke(`this`: TContext, data: Any, textStatus: String /* "nocontent" */, jqXHR: jqXHR<Any>)
}
external interface ErrorCallback<TContext> {
    @nativeInvoke
    operator fun invoke(`this`: TContext, jqXHR: jqXHR<Any>, textStatus: String /* "error" */, errorThrown: String)
    @nativeInvoke
    operator fun invoke(`this`: TContext, jqXHR: jqXHR<Any>, textStatus: String /* "timeout" */, errorThrown: String)
    @nativeInvoke
    operator fun invoke(`this`: TContext, jqXHR: jqXHR<Any>, textStatus: String /* "abort" */, errorThrown: String)
    @nativeInvoke
    operator fun invoke(`this`: TContext, jqXHR: jqXHR<Any>, textStatus: String /* "parsererror" */, errorThrown: String)
}
external interface CompleteCallback<TContext> {
    @nativeInvoke
    operator fun invoke(`this`: TContext, jqXHR: jqXHR<Any>, textStatus: String /* "error" */)
    @nativeInvoke
    operator fun invoke(`this`: TContext, jqXHR: jqXHR<Any>, textStatus: String /* "success" */)
    @nativeInvoke
    operator fun invoke(`this`: TContext, jqXHR: jqXHR<Any>, textStatus: String /* "notmodified" */)
    @nativeInvoke
    operator fun invoke(`this`: TContext, jqXHR: jqXHR<Any>, textStatus: String /* "nocontent" */)
    @nativeInvoke
    operator fun invoke(`this`: TContext, jqXHR: jqXHR<Any>, textStatus: String /* "timeout" */)
    @nativeInvoke
    operator fun invoke(`this`: TContext, jqXHR: jqXHR<Any>, textStatus: String /* "abort" */)
    @nativeInvoke
    operator fun invoke(`this`: TContext, jqXHR: jqXHR<Any>, textStatus: String /* "parsererror" */)
}
external interface StatusCodeCallbacks<TContext> {
//    var `200`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `201`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `202`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `203`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `204`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `205`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `206`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `207`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `208`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `209`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `210`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `211`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `212`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `213`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `214`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `215`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `216`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `217`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `218`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `219`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `220`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `221`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `222`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `223`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `224`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `225`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `226`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `227`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `228`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `229`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `230`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `231`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `232`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `233`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `234`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `235`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `236`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `237`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `238`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `239`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `240`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `241`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `242`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `243`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `244`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `245`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `246`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `247`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `248`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `249`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `250`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `251`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `252`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `253`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `254`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `255`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `256`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `257`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `258`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `259`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `260`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `261`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `262`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `263`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `264`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `265`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `266`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `267`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `268`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `269`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `270`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `271`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `272`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `273`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `274`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `275`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `276`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `277`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `278`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `279`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `280`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `281`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `282`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `283`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `284`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `285`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `286`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `287`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `288`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `289`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `290`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `291`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `292`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `293`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `294`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `295`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `296`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `297`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `298`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `299`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `304`: SuccessCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `300`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `301`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `302`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `303`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `305`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `306`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `307`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `308`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `309`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `310`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `311`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `312`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `313`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `314`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `315`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `316`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `317`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `318`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `319`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `320`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `321`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `322`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `323`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `324`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `325`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `326`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `327`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `328`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `329`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `330`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `331`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `332`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `333`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `334`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `335`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `336`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `337`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `338`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `339`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `340`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `341`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `342`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `343`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `344`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `345`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `346`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `347`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `348`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `349`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `350`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `351`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `352`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `353`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `354`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `355`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `356`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `357`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `358`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `359`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `360`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `361`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `362`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `363`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `364`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `365`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `366`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `367`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `368`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `369`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `370`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `371`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `372`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `373`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `374`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `375`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `376`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `377`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `378`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `379`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `380`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `381`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `382`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `383`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `384`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `385`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `386`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `387`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `388`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `389`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `390`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `391`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `392`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `393`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `394`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `395`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `396`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `397`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `398`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `399`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `400`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `401`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `402`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `403`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `404`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `405`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `406`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `407`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `408`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `409`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `410`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `411`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `412`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `413`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `414`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `415`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `416`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `417`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `418`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `419`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `420`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `421`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `422`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `423`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `424`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `425`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `426`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `427`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `428`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `429`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `430`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `431`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `432`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `433`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `434`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `435`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `436`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `437`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `438`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `439`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `440`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `441`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `442`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `443`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `444`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `445`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `446`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `447`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `448`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `449`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `450`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `451`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `452`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `453`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `454`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `455`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `456`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `457`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `458`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `459`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `460`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `461`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `462`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `463`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `464`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `465`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `466`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `467`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `468`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `469`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `470`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `471`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `472`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `473`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `474`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `475`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `476`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `477`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `478`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `479`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `480`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `481`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `482`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `483`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `484`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `485`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `486`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `487`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `488`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `489`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `490`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `491`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `492`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `493`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `494`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `495`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `496`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `497`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `498`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `499`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `500`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `501`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `502`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `503`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `504`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `505`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `506`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `507`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `508`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `509`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `510`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `511`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `512`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `513`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `514`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `515`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `516`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `517`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `518`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `519`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `520`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `521`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `522`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `523`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `524`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `525`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `526`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `527`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `528`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `529`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `530`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `531`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `532`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `533`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `534`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `535`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `536`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `537`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `538`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `539`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `540`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `541`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `542`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `543`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `544`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `545`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `546`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `547`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `548`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `549`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `550`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `551`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `552`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `553`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `554`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `555`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `556`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `557`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `558`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `559`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `560`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `561`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `562`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `563`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `564`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `565`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `566`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `567`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `568`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `569`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `570`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `571`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `572`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `573`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `574`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `575`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `576`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `577`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `578`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `579`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `580`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `581`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `582`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `583`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `584`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `585`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `586`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `587`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `588`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `589`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `590`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `591`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `592`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `593`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `594`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `595`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `596`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `597`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `598`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally
//    var `599`: ErrorCallback<TContext>? get() = definedExternally; set(value) = definedExternally

    @nativeGetter
    operator fun get(index: Number): dynamic /* SuccessCallback<TContext> | ErrorCallback<TContext> */
    @nativeSetter
    operator fun set(index: Number, value: SuccessCallback<TContext>)
    @nativeSetter
    operator fun set(index: Number, value: ErrorCallback<TContext>)
}
external interface AjaxSettingsBase<TContext> {
    var accepts: PlainObject<String>? get() = definedExternally; set(value) = definedExternally
    var async: Boolean? get() = definedExternally; set(value) = definedExternally
    val beforeSend: ((`this`: TContext, jqXHR: jqXHR<Any>, settings: AjaxSettingsBase<TContext>) -> dynamic /* Boolean | Unit */)? get() = definedExternally
    var cache: Boolean? get() = definedExternally; set(value) = definedExternally
    var complete: dynamic /* CompleteCallback<TContext> | Array<CompleteCallback<TContext>> */ get() = definedExternally; set(value) = definedExternally
    var contents: PlainObject<RegExp>? get() = definedExternally; set(value) = definedExternally
    var contentType: dynamic /* String | Boolean */ get() = definedExternally; set(value) = definedExternally
    var context: TContext? get() = definedExternally; set(value) = definedExternally
    var converters: PlainObject<dynamic /* Boolean | (value: Any) -> Any */>? get() = definedExternally; set(value) = definedExternally
    var crossDomain: Boolean? get() = definedExternally; set(value) = definedExternally
    var data: dynamic /* String | PlainObject<Any> */ get() = definedExternally; set(value) = definedExternally
    val dataFilter: ((data: String, type: String) -> Any)? get() = definedExternally
    var dataType: dynamic /* String /* "xml" */ | String /* "html" */ | String /* "script" */ | String /* "json" */ | String /* "jsonp" */ | String /* "text" */ | String */ get() = definedExternally; set(value) = definedExternally
    var error: dynamic /* ErrorCallback<TContext> | Array<ErrorCallback<TContext>> */ get() = definedExternally; set(value) = definedExternally
    var global: Boolean? get() = definedExternally; set(value) = definedExternally
    var headers: PlainObject<String?>? get() = definedExternally; set(value) = definedExternally
    var ifModified: Boolean? get() = definedExternally; set(value) = definedExternally
    var isLocal: Boolean? get() = definedExternally; set(value) = definedExternally
    var jsonp: dynamic /* String | Boolean */ get() = definedExternally; set(value) = definedExternally
    var jsonpCallback: dynamic /* String | (`this`: TContext) -> String */ get() = definedExternally; set(value) = definedExternally
    var method: String? get() = definedExternally; set(value) = definedExternally
    var mimeType: String? get() = definedExternally; set(value) = definedExternally
    var password: String? get() = definedExternally; set(value) = definedExternally
    var processData: Boolean? get() = definedExternally; set(value) = definedExternally
    var scriptCharset: String? get() = definedExternally; set(value) = definedExternally
    var statusCode: StatusCodeCallbacks<TContext>? get() = definedExternally; set(value) = definedExternally
    var success: dynamic /* SuccessCallback<TContext> | Array<SuccessCallback<TContext>> */ get() = definedExternally; set(value) = definedExternally
    var timeout: Number? get() = definedExternally; set(value) = definedExternally
    var traditional: Boolean? get() = definedExternally; set(value) = definedExternally
    var type: String? get() = definedExternally; set(value) = definedExternally
    var username: String? get() = definedExternally; set(value) = definedExternally
    val xhr: (() -> XMLHttpRequest)? get() = definedExternally
    var xhrFields: XHRFields? get() = definedExternally; set(value) = definedExternally
}
external interface XHRFields : Any
