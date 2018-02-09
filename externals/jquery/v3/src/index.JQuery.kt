@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "PACKAGE_OR_CLASSIFIER_REDECLARATION")
@file:JsQualifier("JQuery")

package js.externals.jquery.JQuery

import js.externals.jquery.JQuery.Ajax.AjaxSettingsBase
import js.externals.jquery.JQuery.Ajax.StatusCodeCallbacks
import org.w3c.dom.events.EventTarget

external interface PlainObject<T> {
    @nativeGetter
    operator fun get(key: String): T?
    @nativeSetter
    operator fun set(key: String, value: T)
}
external interface AjaxSettings<TContext> : AjaxSettingsBase<TContext> {
    var url: String? get() = definedExternally; set(value) = definedExternally
//    override val beforeSend: ((`this`: TContext, jqXHR: jqXHR<Any>, settings: AjaxSettings<TContext>) -> dynamic /* Boolean | Unit */)? get() = definedExternally
}
external interface UrlAjaxSettings<TContext> : AjaxSettingsBase<TContext> {
    var url: String
//    override val beforeSend: ((`this`: TContext, jqXHR: jqXHR<Any>, settings: UrlAjaxSettings<TContext>) -> dynamic /* Boolean | Unit */)? get() = definedExternally
}
external interface Transport {
    fun send(headers: PlainObject<Any>, completeCallback: SuccessCallback)
    fun abort()
    interface SuccessCallback {
        @nativeInvoke
        operator fun invoke(status: Number, statusText: String /* "error" */, responses: PlainObject<Any>? = definedExternally /* null */, headers: String? = definedExternally /* null */)
        @nativeInvoke
        operator fun invoke(status: Number, statusText: String /* "success" */, responses: PlainObject<Any>? = definedExternally /* null */, headers: String? = definedExternally /* null */)
        @nativeInvoke
        operator fun invoke(status: Number, statusText: String /* "notmodified" */, responses: PlainObject<Any>? = definedExternally /* null */, headers: String? = definedExternally /* null */)
        @nativeInvoke
        operator fun invoke(status: Number, statusText: String /* "nocontent" */, responses: PlainObject<Any>? = definedExternally /* null */, headers: String? = definedExternally /* null */)
        @nativeInvoke
        operator fun invoke(status: Number, statusText: String /* "timeout" */, responses: PlainObject<Any>? = definedExternally /* null */, headers: String? = definedExternally /* null */)
        @nativeInvoke
        operator fun invoke(status: Number, statusText: String /* "abort" */, responses: PlainObject<Any>? = definedExternally /* null */, headers: String? = definedExternally /* null */)
        @nativeInvoke
        operator fun invoke(status: Number, statusText: String /* "parsererror" */, responses: PlainObject<Any>? = definedExternally /* null */, headers: String? = definedExternally /* null */)
    }
}
external interface jqXHR<TResolve> : Promise3<TResolve, jqXHR<TResolve>, Any?, dynamic /* String /* "success" */ | String /* "notmodified" */ | String /* "nocontent" */ */, dynamic /* String /* "error" */ | String /* "timeout" */ | String /* "abort" */ | String /* "parsererror" */ */, Any?, jqXHR<TResolve>, String, Any?>, Any {
    var responseJSON: Any? get() = definedExternally; set(value) = definedExternally
    override fun state(): dynamic /* String /* "pending" */ | String /* "resolved" */ | String /* "rejected" */ */
    fun statusCode(map: StatusCodeCallbacks<Any> /* StatusCodeCallbacks<TContext> & `T$5` */)
    interface DoneCallback<TResolve, TjqXHR> : Deferred.Callback3<TResolve, dynamic /* String /* "success" */ | String /* "notmodified" */ | String /* "nocontent" */ */, TjqXHR>
    interface FailCallback<TjqXHR> : Deferred.Callback3<TjqXHR, dynamic /* String /* "error" */ | String /* "timeout" */ | String /* "abort" */ | String /* "parsererror" */ */, String>
    interface AlwaysCallback<TResolve, TjqXHR> : Deferred.Callback3<dynamic /* TResolve | TjqXHR */, dynamic /* String /* "error" */ | String /* "success" */ | String /* "notmodified" */ | String /* "nocontent" */ | String /* "timeout" */ | String /* "abort" */ | String /* "parsererror" */ */, dynamic /* String | TjqXHR */>
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
    fun fireWith(context: Any, args: Array<Any>? = definedExternally /* null */): Callbacks<T> /* this */
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
external interface Thenable<T> {
    //TODO
}
external interface PromiseBase<TR, TJ, TN, UR, UJ, UN, VR, VJ, VN, SR, SJ, SN> : kotlin.js.Promise<TR> {
    fun always(alwaysCallback: Deferred.CallbackBase<dynamic /* TR | TJ */, dynamic /* UR | UJ */, dynamic /* VR | VJ */, dynamic /* SR | SJ */>, vararg alwaysCallbacks: Deferred.CallbackBase<dynamic /* TR | TJ */, dynamic /* UR | UJ */, dynamic /* VR | VJ */, dynamic /* SR | SJ */>): PromiseBase<TR, TJ, TN, UR, UJ, UN, VR, VJ, VN, SR, SJ, SN> /* this */
    fun always(alwaysCallback: Deferred.CallbackBase<dynamic /* TR | TJ */, dynamic /* UR | UJ */, dynamic /* VR | VJ */, dynamic /* SR | SJ */>, vararg alwaysCallbacks: Array<Deferred.CallbackBase<dynamic /* TR | TJ */, dynamic /* UR | UJ */, dynamic /* VR | VJ */, dynamic /* SR | SJ */>>): PromiseBase<TR, TJ, TN, UR, UJ, UN, VR, VJ, VN, SR, SJ, SN> /* this */
    fun always(alwaysCallback: Array<Deferred.CallbackBase<dynamic /* TR | TJ */, dynamic /* UR | UJ */, dynamic /* VR | VJ */, dynamic /* SR | SJ */>>, vararg alwaysCallbacks: Deferred.CallbackBase<dynamic /* TR | TJ */, dynamic /* UR | UJ */, dynamic /* VR | VJ */, dynamic /* SR | SJ */>): PromiseBase<TR, TJ, TN, UR, UJ, UN, VR, VJ, VN, SR, SJ, SN> /* this */
    fun always(alwaysCallback: Array<Deferred.CallbackBase<dynamic /* TR | TJ */, dynamic /* UR | UJ */, dynamic /* VR | VJ */, dynamic /* SR | SJ */>>, vararg alwaysCallbacks: Array<Deferred.CallbackBase<dynamic /* TR | TJ */, dynamic /* UR | UJ */, dynamic /* VR | VJ */, dynamic /* SR | SJ */>>): PromiseBase<TR, TJ, TN, UR, UJ, UN, VR, VJ, VN, SR, SJ, SN> /* this */
    fun done(doneCallback: Deferred.CallbackBase<TR, UR, VR, SR>, vararg doneCallbacks: Deferred.CallbackBase<TR, UR, VR, SR>): PromiseBase<TR, TJ, TN, UR, UJ, UN, VR, VJ, VN, SR, SJ, SN> /* this */
    fun done(doneCallback: Deferred.CallbackBase<TR, UR, VR, SR>, vararg doneCallbacks: Array<Deferred.CallbackBase<TR, UR, VR, SR>>): PromiseBase<TR, TJ, TN, UR, UJ, UN, VR, VJ, VN, SR, SJ, SN> /* this */
    fun done(doneCallback: Array<Deferred.CallbackBase<TR, UR, VR, SR>>, vararg doneCallbacks: Deferred.CallbackBase<TR, UR, VR, SR>): PromiseBase<TR, TJ, TN, UR, UJ, UN, VR, VJ, VN, SR, SJ, SN> /* this */
    fun done(doneCallback: Array<Deferred.CallbackBase<TR, UR, VR, SR>>, vararg doneCallbacks: Array<Deferred.CallbackBase<TR, UR, VR, SR>>): PromiseBase<TR, TJ, TN, UR, UJ, UN, VR, VJ, VN, SR, SJ, SN> /* this */
    fun fail(failCallback: Deferred.CallbackBase<TJ, UJ, VJ, SJ>, vararg failCallbacks: Deferred.CallbackBase<TJ, UJ, VJ, SJ>): PromiseBase<TR, TJ, TN, UR, UJ, UN, VR, VJ, VN, SR, SJ, SN> /* this */
    fun fail(failCallback: Deferred.CallbackBase<TJ, UJ, VJ, SJ>, vararg failCallbacks: Array<Deferred.CallbackBase<TJ, UJ, VJ, SJ>>): PromiseBase<TR, TJ, TN, UR, UJ, UN, VR, VJ, VN, SR, SJ, SN> /* this */
    fun fail(failCallback: Array<Deferred.CallbackBase<TJ, UJ, VJ, SJ>>, vararg failCallbacks: Deferred.CallbackBase<TJ, UJ, VJ, SJ>): PromiseBase<TR, TJ, TN, UR, UJ, UN, VR, VJ, VN, SR, SJ, SN> /* this */
    fun fail(failCallback: Array<Deferred.CallbackBase<TJ, UJ, VJ, SJ>>, vararg failCallbacks: Array<Deferred.CallbackBase<TJ, UJ, VJ, SJ>>): PromiseBase<TR, TJ, TN, UR, UJ, UN, VR, VJ, VN, SR, SJ, SN> /* this */
    fun progress(progressCallback: Deferred.CallbackBase<TN, UN, VN, SN>, vararg progressCallbacks: Deferred.CallbackBase<TN, UN, VN, SN>): PromiseBase<TR, TJ, TN, UR, UJ, UN, VR, VJ, VN, SR, SJ, SN> /* this */
    fun progress(progressCallback: Deferred.CallbackBase<TN, UN, VN, SN>, vararg progressCallbacks: Array<Deferred.CallbackBase<TN, UN, VN, SN>>): PromiseBase<TR, TJ, TN, UR, UJ, UN, VR, VJ, VN, SR, SJ, SN> /* this */
    fun progress(progressCallback: Array<Deferred.CallbackBase<TN, UN, VN, SN>>, vararg progressCallbacks: Deferred.CallbackBase<TN, UN, VN, SN>): PromiseBase<TR, TJ, TN, UR, UJ, UN, VR, VJ, VN, SR, SJ, SN> /* this */
    fun progress(progressCallback: Array<Deferred.CallbackBase<TN, UN, VN, SN>>, vararg progressCallbacks: Array<Deferred.CallbackBase<TN, UN, VN, SN>>): PromiseBase<TR, TJ, TN, UR, UJ, UN, VR, VJ, VN, SR, SJ, SN> /* this */
    fun <TTarget : Any> promise(target: TTarget): PromiseBase<TR, TJ, TN, UR, UJ, UN, VR, VJ, VN, SR, SJ, SN> /* PromiseBase & TTarget */
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
external interface Promise<TR, TJ /* = Any */, TN /* = Any */> : PromiseBase<TR, TJ, TN, TR, TJ, TN, TR, TJ, TN, TR, TJ, TN>
external interface DeferredStatic {
    var exceptionHook: Any
    @nativeInvoke
    operator fun <TR, TJ, TN> invoke(beforeStart: ((`this`: Deferred<TR, TJ, TN>, deferred: Deferred<TR, TJ, TN>) -> Unit)? = definedExternally /* null */): Deferred<TR, TJ, TN>
}
external interface Deferred<TR, TJ, TN> {
    fun notify(vararg args: TN): Deferred<TR, TJ, TN> /* this */
    fun notifyWith(context: Any, args: Array<TN>? = definedExternally /* null */): Deferred<TR, TJ, TN> /* this */
    fun reject(vararg args: TJ): Deferred<TR, TJ, TN> /* this */
    fun rejectWith(context: Any, args: Array<TJ>? = definedExternally /* null */): Deferred<TR, TJ, TN> /* this */
    fun resolve(vararg args: TR): Deferred<TR, TJ, TN> /* this */
    fun resolveWith(context: Any, args: Array<TR>? = definedExternally /* null */): Deferred<TR, TJ, TN> /* this */
    fun always(alwaysCallback: Deferred.Callback<dynamic /* TR | TJ */>, vararg alwaysCallbacks: Deferred.Callback<dynamic /* TR | TJ */>): Deferred<TR, TJ, TN> /* this */
    fun always(alwaysCallback: Deferred.Callback<dynamic /* TR | TJ */>, vararg alwaysCallbacks: Array<Deferred.Callback<dynamic /* TR | TJ */>>): Deferred<TR, TJ, TN> /* this */
    fun always(alwaysCallback: Array<Deferred.Callback<dynamic /* TR | TJ */>>, vararg alwaysCallbacks: Deferred.Callback<dynamic /* TR | TJ */>): Deferred<TR, TJ, TN> /* this */
    fun always(alwaysCallback: Array<Deferred.Callback<dynamic /* TR | TJ */>>, vararg alwaysCallbacks: Array<Deferred.Callback<dynamic /* TR | TJ */>>): Deferred<TR, TJ, TN> /* this */
    fun done(doneCallback: Deferred.Callback<TR>, vararg doneCallbacks: Deferred.Callback<TR>): Deferred<TR, TJ, TN> /* this */
    fun done(doneCallback: Deferred.Callback<TR>, vararg doneCallbacks: Array<Deferred.Callback<TR>>): Deferred<TR, TJ, TN> /* this */
    fun done(doneCallback: Array<Deferred.Callback<TR>>, vararg doneCallbacks: Deferred.Callback<TR>): Deferred<TR, TJ, TN> /* this */
    fun done(doneCallback: Array<Deferred.Callback<TR>>, vararg doneCallbacks: Array<Deferred.Callback<TR>>): Deferred<TR, TJ, TN> /* this */
    fun fail(failCallback: Deferred.Callback<TJ>, vararg failCallbacks: Deferred.Callback<TJ>): Deferred<TR, TJ, TN> /* this */
    fun fail(failCallback: Deferred.Callback<TJ>, vararg failCallbacks: Array<Deferred.Callback<TJ>>): Deferred<TR, TJ, TN> /* this */
    fun fail(failCallback: Array<Deferred.Callback<TJ>>, vararg failCallbacks: Deferred.Callback<TJ>): Deferred<TR, TJ, TN> /* this */
    fun fail(failCallback: Array<Deferred.Callback<TJ>>, vararg failCallbacks: Array<Deferred.Callback<TJ>>): Deferred<TR, TJ, TN> /* this */
    fun progress(progressCallback: Deferred.Callback<TN>, vararg progressCallbacks: Deferred.Callback<TN>): Deferred<TR, TJ, TN> /* this */
    fun progress(progressCallback: Deferred.Callback<TN>, vararg progressCallbacks: Array<Deferred.Callback<TN>>): Deferred<TR, TJ, TN> /* this */
    fun progress(progressCallback: Array<Deferred.Callback<TN>>, vararg progressCallbacks: Deferred.Callback<TN>): Deferred<TR, TJ, TN> /* this */
    fun progress(progressCallback: Array<Deferred.Callback<TN>>, vararg progressCallbacks: Array<Deferred.Callback<TN>>): Deferred<TR, TJ, TN> /* this */
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
external interface Event<TTarget, TData> {
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
    var originalEvent: Event<*, *>
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
