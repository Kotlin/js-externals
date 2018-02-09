// Generated using ts2kt(https://github.com/Kotlin/ts2kt)
// from https://github.com/DefinitelyTyped/DefinitelyTyped/tree/56ce1312c8afcb526adfe93a09c9f1005644a02a/types/jquery/index.d.ts
//
// Original copyrights:
//
// Type definitions for jquery 3.3
// Project: https://jquery.com
// Definitions by: Leonard Thieu <https://github.com/leonard-thieu>
//                 Boris Yankov <https://github.com/borisyankov>
//                 Christian Hoffmeister <https://github.com/choffmeister>
//                 Steve Fenton <https://github.com/Steve-Fenton>
//                 Diullei Gomes <https://github.com/Diullei>
//                 Tass Iliopoulos <https://github.com/tasoili>
//                 Jason Swearingen <https://github.com/jasons-novaleaf>
//                 Sean Hill <https://github.com/seanski>
//                 Guus Goossens <https://github.com/Guuz>
//                 Kelly Summerlin <https://github.com/ksummerlin>
//                 Basarat Ali Syed <https://github.com/basarat>
//                 Nicholas Wolverson <https://github.com/nwolverson>
//                 Derek Cicerone <https://github.com/derekcicerone>
//                 Andrew Gaspar <https://github.com/AndrewGaspar>
//                 Seikichi Kondo <https://github.com/seikichi>
//                 Benjamin Jackman <https://github.com/benjaminjackman>
//                 Poul Sorensen <https://github.com/s093294>
//                 Josh Strobl <https://github.com/JoshStrobl>
//                 John Reilly <https://github.com/johnnyreilly>
//                 Dick van den Brink <https://github.com/DickvdBrink>
//                 Thomas Schulz <https://github.com/King2500>
// Definitions: https://github.com/DefinitelyTyped/DefinitelyTyped
// TypeScript Version: 2.3

@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")

package js.externals.jquery

import org.w3c.dom.*
import org.w3c.dom.events.Event
import org.w3c.dom.events.EventTarget

@JsModule("jquery")
@JsModule("jquery/dist/jquery.slim")
external val jQuery: JQueryStatic<HTMLElement> = definedExternally
external var `$`: JQueryStatic<HTMLElement> = definedExternally
external interface `T$0` {
    var interval: Number
    var off: Boolean
    var step: JQuery.PlainObject<JQuery.AnimationHook<Node>>
}
external interface `T$1` {
    var `0`: String
}
external interface JQueryStatic<TElement : Node> {
    var ajaxSettings: JQuery.AjaxSettings<Any>
    var Deferred: JQuery.DeferredStatic
    var Event: JQuery.EventStatic<TElement>
    var cssHooks: JQuery.PlainObject<JQuery.CSSHook<TElement>>
    var cssNumber: JQuery.PlainObject<Boolean>
    var fn: JQuery<TElement>
    var fx: `T$0`
    var ready: JQuery.Thenable<JQueryStatic<TElement>>
    var support: JQuery.PlainObject<Any>
    var valHooks: JQuery.PlainObject<JQuery.ValHook<TElement>>
    @nativeInvoke
    operator fun invoke(html: String, ownerDocument_attributes: JQuery.PlainObject<Any>): JQuery<TElement>
    @nativeInvoke
    operator fun invoke(html: String, ownerDocument_attributes: Document): JQuery<TElement>
    @nativeInvoke
    operator fun invoke(selector: String, context: Element): JQuery<TElement>
    @nativeInvoke
    operator fun invoke(selector: String, context: Document): JQuery<TElement>
    @nativeInvoke
    operator fun invoke(selector: String, context: JQuery<HTMLElement>): JQuery<TElement>
    @nativeInvoke
    operator fun invoke(selector: String, context: Nothing?): JQuery<TElement>
    @nativeInvoke
    operator fun <FElement : Node> invoke(window: Window, discriminator: Boolean): JQueryStatic<FElement>
    @nativeInvoke
    operator fun invoke(selector_object_callback: String? = definedExternally /* null */): JQuery<TElement>
    @nativeInvoke
    operator fun invoke(selector_object_callback: Element? = definedExternally /* null */): JQuery<TElement>
    @nativeInvoke
    operator fun invoke(selector_object_callback: JQuery.PlainObject<Any>? = definedExternally /* null */): JQuery<TElement>
    @nativeInvoke
    operator fun invoke(selector_object_callback: JQuery<HTMLElement>? = definedExternally /* null */): JQuery<TElement>
    @nativeInvoke
    operator fun invoke(selector_object_callback: Array<Element>? = definedExternally /* null */): JQuery<TElement>
    @nativeInvoke
    operator fun invoke(selector_object_callback: ((`this`: Document, `$`: JQueryStatic<TElement>) -> Unit)? = definedExternally /* null */): JQuery<TElement>
    fun <T : Function<*>> Callbacks(flags: String? = definedExternally /* null */): JQuery.Callbacks<T>
    fun ajax(url: String, settings: JQuery.AjaxSettings<Any>? = definedExternally /* null */): JQuery.jqXHR<Any>
    fun ajax(settings: JQuery.AjaxSettings<Any>? = definedExternally /* null */): JQuery.jqXHR<Any>
    fun ajaxPrefilter(dataTypes: String, handler: (options: JQuery.AjaxSettings<Any>, originalOptions: JQuery.AjaxSettings<Any>, jqXHR: JQuery.jqXHR<Any>) -> dynamic /* String | Unit */)
    fun ajaxPrefilter(handler: (options: JQuery.AjaxSettings<Any>, originalOptions: JQuery.AjaxSettings<Any>, jqXHR: JQuery.jqXHR<Any>) -> dynamic /* String | Unit */)
    fun ajaxSetup(options: JQuery.AjaxSettings<Any>): JQuery.AjaxSettings<Any>
    fun ajaxTransport(dataType: String, handler: (options: JQuery.AjaxSettings<Any>, originalOptions: JQuery.AjaxSettings<Any>, jqXHR: JQuery.jqXHR<Any>) -> dynamic /* Unit | JQuery.Transport */)
    fun camelCase(value: String): String
    fun contains(container: Element, contained: Element): Boolean
    fun css(elem: Element, unknown: Any): Any
    fun data(element: Element, key: String, undefined: Nothing?): Any
    fun <T> data(element: Element, key: String, value: T): T
    fun data(element: Element, key: String? = definedExternally /* null */): Any
    fun dequeue(element: Element, queueName: String? = definedExternally /* null */)
    fun <T> each(array: ArrayLike<T>, callback: (`this`: T, indexInArray: Number, value: T) -> dynamic /* Boolean | Any */): ArrayLike<T>
    fun <T, K : Any?> each(obj: T, callback: (`this`: Any?, propertyName: K, valueOfProperty: Any?) -> dynamic /* Boolean | Any */): T
    fun error(message: String): Any
    fun escapeSelector(selector: String): String
    fun <T, U, V, W, X, Y, Z> extend(deep: Boolean, target: T, object1: U, object2: V, object3: W, object4: X, object5: Y, object6: Z): T /* T & U & V & W & X & Y & Z */
    fun <T, U, V, W, X, Y> extend(deep: Boolean, target: T, object1: U, object2: V, object3: W, object4: X, object5: Y): T /* T & U & V & W & X & Y */
    fun <T, U, V, W, X> extend(deep: Boolean, target: T, object1: U, object2: V, object3: W, object4: X): T /* T & U & V & W & X */
    fun <T, U, V, W> extend(deep: Boolean, target: T, object1: U, object2: V, object3: W): T /* T & U & V & W */
    fun <T, U, V> extend(deep: Boolean, target: T, object1: U, object2: V): T /* T & U & V */
    fun <T, U> extend(deep: Boolean, target: T, object1: U): T /* T & U */
    fun extend(deep: Boolean, target: Any, object1: Any, vararg objects: Any): Any
    fun <T, U, V, W, X, Y, Z> extend(target: T, object1: U, object2: V, object3: W, object4: X, object5: Y, object6: Z): T /* T & U & V & W & X & Y & Z */
    fun <T, U, V, W, X, Y> extend(target: T, object1: U, object2: V, object3: W, object4: X, object5: Y): T /* T & U & V & W & X & Y */
    fun <T, U, V, W, X> extend(target: T, object1: U, object2: V, object3: W, object4: X): T /* T & U & V & W & X */
    fun <T, U, V, W> extend(target: T, object1: U, object2: V, object3: W): T /* T & U & V & W */
    fun <T, U, V> extend(target: T, object1: U, object2: V): T /* T & U & V */
    fun <T, U> extend(target: T, object1: U): T /* T & U */
    fun extend(target: Any, object1: Any, vararg objects: Any): Any
    fun get(url: String, data: String, success: JQuery.jqXHR.DoneCallback<Any, JQuery.jqXHR<Any>>?, dataType: String? = definedExternally /* null */): JQuery.jqXHR<Any>
    fun get(url: String, data: JQuery.PlainObject<Any>, success: JQuery.jqXHR.DoneCallback<Any, JQuery.jqXHR<Any>>?, dataType: String? = definedExternally /* null */): JQuery.jqXHR<Any>
    fun get(url: String, success: JQuery.jqXHR.DoneCallback<Any, JQuery.jqXHR<Any>>?, dataType: String): JQuery.jqXHR<Any>
    fun get(url: String, success_data: String): JQuery.jqXHR<Any>
    fun get(url: String, success_data: JQuery.PlainObject<Any>): JQuery.jqXHR<Any>
    fun get(url: String, success_data: JQuery.jqXHR.DoneCallback<Any, JQuery.jqXHR<Any>>): JQuery.jqXHR<Any>
    fun get(url_settings: String? = definedExternally /* null */): JQuery.jqXHR<Any>
    fun get(url_settings: JQuery.UrlAjaxSettings<Any>? = definedExternally /* null */): JQuery.jqXHR<Any>
    fun getJSON(url: String, data: String, success: JQuery.jqXHR.DoneCallback<Any, JQuery.jqXHR<Any>>): JQuery.jqXHR<Any>
    fun getJSON(url: String, data: JQuery.PlainObject<Any>, success: JQuery.jqXHR.DoneCallback<Any, JQuery.jqXHR<Any>>): JQuery.jqXHR<Any>
    fun getJSON(url: String, success_data: String? = definedExternally /* null */): JQuery.jqXHR<Any>
    fun getJSON(url: String, success_data: JQuery.PlainObject<Any>? = definedExternally /* null */): JQuery.jqXHR<Any>
    fun getJSON(url: String, success_data: JQuery.jqXHR.DoneCallback<Any, JQuery.jqXHR<Any>>? = definedExternally /* null */): JQuery.jqXHR<Any>
    fun getScript(url: String, success: JQuery.jqXHR.DoneCallback<String?, JQuery.jqXHR<String>>? = definedExternally /* null */): JQuery.jqXHR<String?>
    fun globalEval(code: String)
    fun <T> grep(array: ArrayLike<T>, fn: (elementOfArray: T, indexInArray: Number) -> Boolean, invert: Boolean? = definedExternally /* null */): Array<T>
    fun hasData(element: Element): Boolean
    fun holdReady(hold: Boolean)
    fun htmlPrefilter(html: String): String
    fun <T> inArray(value: T, array: Array<T>, fromIndex: Number? = definedExternally /* null */): Number
    fun isArray(obj: Any): Boolean
    fun isEmptyObject(obj: Any): Boolean
    fun isFunction(obj: Any): Boolean
    fun isNumeric(value: Any): Boolean
    fun isPlainObject(obj: Any): Boolean
    fun isWindow(obj: Any): Boolean
    fun isXMLDoc(node: Node): Boolean
    fun <T> makeArray(obj: ArrayLike<T>): Array<T>
    fun <T, R> map(array: Array<T>, callback: (elementOfArray: T, indexInArray: Number) -> R): Array<R>
    fun <T, K : Any?, R> map(obj: T, callback: (propertyOfObject: Any?, key: K) -> R): Array<R>
    fun <T, U> merge(first: ArrayLike<T>, second: ArrayLike<U>): Array<dynamic /* T | U */>
    fun noConflict(removeAll: Boolean? = definedExternally /* null */): JQueryStatic<TElement> /* this */
    fun noop(): Nothing?
    fun now(): Number
    fun param(obj: Array<Any>, traditional: Boolean? = definedExternally /* null */): String
    fun param(obj: JQuery.PlainObject<Any>, traditional: Boolean? = definedExternally /* null */): String
    fun param(obj: JQuery<HTMLElement>, traditional: Boolean? = definedExternally /* null */): String
    fun parseHTML(data: String, context: Document?, keepScripts: Boolean): Array<dynamic /* Element | Text | Comment */>
    fun parseHTML(data: String, context_keepScripts: Boolean? = definedExternally /* null */): Array<dynamic /* Element | Text | Comment */>
    fun parseHTML(data: String, context_keepScripts: Document? = definedExternally /* null */): Array<dynamic /* Element | Text | Comment */>
    fun parseHTML(data: String, context_keepScripts: Nothing? = definedExternally /* null */): Array<dynamic /* Element | Text | Comment */>
    fun parseJSON(json: String): Any
    fun parseXML(data: String): XMLDocument
    fun post(url: String, data: String, success: JQuery.jqXHR.DoneCallback<Any, JQuery.jqXHR<Any>>?, dataType: String? = definedExternally /* null */): JQuery.jqXHR<Any>
    fun post(url: String, data: JQuery.PlainObject<Any>, success: JQuery.jqXHR.DoneCallback<Any, JQuery.jqXHR<Any>>?, dataType: String? = definedExternally /* null */): JQuery.jqXHR<Any>
    fun post(url: String, success: JQuery.jqXHR.DoneCallback<Any, JQuery.jqXHR<Any>>?, dataType: String): JQuery.jqXHR<Any>
    fun post(url: String, success_data: String): JQuery.jqXHR<Any>
    fun post(url: String, success_data: JQuery.PlainObject<Any>): JQuery.jqXHR<Any>
    fun post(url: String, success_data: JQuery.jqXHR.DoneCallback<Any, JQuery.jqXHR<Any>>): JQuery.jqXHR<Any>
    fun post(url_settings: String? = definedExternally /* null */): JQuery.jqXHR<Any>
    fun post(url_settings: JQuery.UrlAjaxSettings<Any>? = definedExternally /* null */): JQuery.jqXHR<Any>
    fun <TReturn, A, B, C, D, E, F, G> proxy(fn: (a: A, b: B, c: C, d: D, e: E, f: F, g: G) -> TReturn, context: Nothing?, a: A, b: B, c: C, d: D, e: E, f: F, g: G): () -> TReturn
    fun <TReturn, A, B, C, D, E, F> proxy(fn: (a: A, b: B, c: C, d: D, e: E, f: F) -> TReturn, context: Nothing?, a: A, b: B, c: C, d: D, e: E, f: F): () -> TReturn
    fun <TReturn, A, B, C, D, E> proxy(fn: (a: A, b: B, c: C, d: D, e: E) -> TReturn, context: Nothing?, a: A, b: B, c: C, d: D, e: E): () -> TReturn
    fun <TReturn, A, B, C, D> proxy(fn: (a: A, b: B, c: C, d: D) -> TReturn, context: Nothing?, a: A, b: B, c: C, d: D): () -> TReturn
    fun <TReturn, A, B, C> proxy(fn: (a: A, b: B, c: C) -> TReturn, context: Nothing?, a: A, b: B, c: C): () -> TReturn
    fun <TReturn, A, B> proxy(fn: (a: A, b: B) -> TReturn, context: Nothing?, a: A, b: B): () -> TReturn
    fun <TReturn, A> proxy(fn: (a: A) -> TReturn, context: Nothing?, a: A): () -> TReturn
    fun <TReturn> proxy(fn: () -> TReturn, context: Nothing?): () -> TReturn
    fun <TReturn, A, B, C, D, E, F, G, T> proxy(fn: (a: A, b: B, c: C, d: D, e: E, f: F, g: G, t: T) -> TReturn, context: Nothing?, a: A, b: B, c: C, d: D, e: E, f: F, g: G): (t: T) -> TReturn
    fun <TReturn, A, B, C, D, E, F, T> proxy(fn: (a: A, b: B, c: C, d: D, e: E, f: F, t: T) -> TReturn, context: Nothing?, a: A, b: B, c: C, d: D, e: E, f: F): (t: T) -> TReturn
    fun <TReturn, A, B, C, D, E, T> proxy(fn: (a: A, b: B, c: C, d: D, e: E, t: T) -> TReturn, context: Nothing?, a: A, b: B, c: C, d: D, e: E): (t: T) -> TReturn
    fun <TReturn, A, B, C, D, T> proxy(fn: (a: A, b: B, c: C, d: D, t: T) -> TReturn, context: Nothing?, a: A, b: B, c: C, d: D): (t: T) -> TReturn
    fun <TReturn, A, B, C, T> proxy(fn: (a: A, b: B, c: C, t: T) -> TReturn, context: Nothing?, a: A, b: B, c: C): (t: T) -> TReturn
    fun <TReturn, A, B, T> proxy(fn: (a: A, b: B, t: T) -> TReturn, context: Nothing?, a: A, b: B): (t: T) -> TReturn
    fun <TReturn, A, T> proxy(fn: (a: A, t: T) -> TReturn, context: Nothing?, a: A): (t: T) -> TReturn
    fun <TReturn, T> proxy(fn: (t: T) -> TReturn, context: Nothing?): (t: T) -> TReturn
    fun <TReturn, A, B, C, D, E, F, G, T, U> proxy(fn: (a: A, b: B, c: C, d: D, e: E, f: F, g: G, t: T, u: U) -> TReturn, context: Nothing?, a: A, b: B, c: C, d: D, e: E, f: F, g: G): (t: T, u: U) -> TReturn
    fun <TReturn, A, B, C, D, E, F, T, U> proxy(fn: (a: A, b: B, c: C, d: D, e: E, f: F, t: T, u: U) -> TReturn, context: Nothing?, a: A, b: B, c: C, d: D, e: E, f: F): (t: T, u: U) -> TReturn
    fun <TReturn, A, B, C, D, E, T, U> proxy(fn: (a: A, b: B, c: C, d: D, e: E, t: T, u: U) -> TReturn, context: Nothing?, a: A, b: B, c: C, d: D, e: E): (t: T, u: U) -> TReturn
    fun <TReturn, A, B, C, D, T, U> proxy(fn: (a: A, b: B, c: C, d: D, t: T, u: U) -> TReturn, context: Nothing?, a: A, b: B, c: C, d: D): (t: T, u: U) -> TReturn
    fun <TReturn, A, B, C, T, U> proxy(fn: (a: A, b: B, c: C, t: T, u: U) -> TReturn, context: Nothing?, a: A, b: B, c: C): (t: T, u: U) -> TReturn
    fun <TReturn, A, B, T, U> proxy(fn: (a: A, b: B, t: T, u: U) -> TReturn, context: Nothing?, a: A, b: B): (t: T, u: U) -> TReturn
    fun <TReturn, A, T, U> proxy(fn: (a: A, t: T, u: U) -> TReturn, context: Nothing?, a: A): (t: T, u: U) -> TReturn
    fun <TReturn, T, U> proxy(fn: (t: T, u: U) -> TReturn, context: Nothing?): (t: T, u: U) -> TReturn
    fun <TReturn, A, B, C, D, E, F, G, T, U, V> proxy(fn: (a: A, b: B, c: C, d: D, e: E, f: F, g: G, t: T, u: U, v: V) -> TReturn, context: Nothing?, a: A, b: B, c: C, d: D, e: E, f: F, g: G): (t: T, u: U, v: V) -> TReturn
    fun <TReturn, A, B, C, D, E, F, T, U, V> proxy(fn: (a: A, b: B, c: C, d: D, e: E, f: F, t: T, u: U, v: V) -> TReturn, context: Nothing?, a: A, b: B, c: C, d: D, e: E, f: F): (t: T, u: U, v: V) -> TReturn
    fun <TReturn, A, B, C, D, E, T, U, V> proxy(fn: (a: A, b: B, c: C, d: D, e: E, t: T, u: U, v: V) -> TReturn, context: Nothing?, a: A, b: B, c: C, d: D, e: E): (t: T, u: U, v: V) -> TReturn
    fun <TReturn, A, B, C, D, T, U, V> proxy(fn: (a: A, b: B, c: C, d: D, t: T, u: U, v: V) -> TReturn, context: Nothing?, a: A, b: B, c: C, d: D): (t: T, u: U, v: V) -> TReturn
    fun <TReturn, A, B, C, T, U, V> proxy(fn: (a: A, b: B, c: C, t: T, u: U, v: V) -> TReturn, context: Nothing?, a: A, b: B, c: C): (t: T, u: U, v: V) -> TReturn
    fun <TReturn, A, B, T, U, V> proxy(fn: (a: A, b: B, t: T, u: U, v: V) -> TReturn, context: Nothing?, a: A, b: B): (t: T, u: U, v: V) -> TReturn
    fun <TReturn, A, T, U, V> proxy(fn: (a: A, t: T, u: U, v: V) -> TReturn, context: Nothing?, a: A): (t: T, u: U, v: V) -> TReturn
    fun <TReturn, T, U, V> proxy(fn: (t: T, u: U, v: V) -> TReturn, context: Nothing?): (t: T, u: U, v: V) -> TReturn
    fun <TReturn, A, B, C, D, E, F, G, T, U, V, W> proxy(fn: (a: A, b: B, c: C, d: D, e: E, f: F, g: G, t: T, u: U, v: V, w: W) -> TReturn, context: Nothing?, a: A, b: B, c: C, d: D, e: E, f: F, g: G): (t: T, u: U, v: V, w: W) -> TReturn
    fun <TReturn, A, B, C, D, E, F, T, U, V, W> proxy(fn: (a: A, b: B, c: C, d: D, e: E, f: F, t: T, u: U, v: V, w: W) -> TReturn, context: Nothing?, a: A, b: B, c: C, d: D, e: E, f: F): (t: T, u: U, v: V, w: W) -> TReturn
    fun <TReturn, A, B, C, D, E, T, U, V, W> proxy(fn: (a: A, b: B, c: C, d: D, e: E, t: T, u: U, v: V, w: W) -> TReturn, context: Nothing?, a: A, b: B, c: C, d: D, e: E): (t: T, u: U, v: V, w: W) -> TReturn
    fun <TReturn, A, B, C, D, T, U, V, W> proxy(fn: (a: A, b: B, c: C, d: D, t: T, u: U, v: V, w: W) -> TReturn, context: Nothing?, a: A, b: B, c: C, d: D): (t: T, u: U, v: V, w: W) -> TReturn
    fun <TReturn, A, B, C, T, U, V, W> proxy(fn: (a: A, b: B, c: C, t: T, u: U, v: V, w: W) -> TReturn, context: Nothing?, a: A, b: B, c: C): (t: T, u: U, v: V, w: W) -> TReturn
    fun <TReturn, A, B, T, U, V, W> proxy(fn: (a: A, b: B, t: T, u: U, v: V, w: W) -> TReturn, context: Nothing?, a: A, b: B): (t: T, u: U, v: V, w: W) -> TReturn
    fun <TReturn, A, T, U, V, W> proxy(fn: (a: A, t: T, u: U, v: V, w: W) -> TReturn, context: Nothing?, a: A): (t: T, u: U, v: V, w: W) -> TReturn
    fun <TReturn, T, U, V, W> proxy(fn: (t: T, u: U, v: V, w: W) -> TReturn, context: Nothing?): (t: T, u: U, v: V, w: W) -> TReturn
    fun <TReturn, A, B, C, D, E, F, G, T, U, V, W, X> proxy(fn: (a: A, b: B, c: C, d: D, e: E, f: F, g: G, t: T, u: U, v: V, w: W, x: X) -> TReturn, context: Nothing?, a: A, b: B, c: C, d: D, e: E, f: F, g: G): (t: T, u: U, v: V, w: W, x: X) -> TReturn
    fun <TReturn, A, B, C, D, E, F, T, U, V, W, X> proxy(fn: (a: A, b: B, c: C, d: D, e: E, f: F, t: T, u: U, v: V, w: W, x: X) -> TReturn, context: Nothing?, a: A, b: B, c: C, d: D, e: E, f: F): (t: T, u: U, v: V, w: W, x: X) -> TReturn
    fun <TReturn, A, B, C, D, E, T, U, V, W, X> proxy(fn: (a: A, b: B, c: C, d: D, e: E, t: T, u: U, v: V, w: W, x: X) -> TReturn, context: Nothing?, a: A, b: B, c: C, d: D, e: E): (t: T, u: U, v: V, w: W, x: X) -> TReturn
    fun <TReturn, A, B, C, D, T, U, V, W, X> proxy(fn: (a: A, b: B, c: C, d: D, t: T, u: U, v: V, w: W, x: X) -> TReturn, context: Nothing?, a: A, b: B, c: C, d: D): (t: T, u: U, v: V, w: W, x: X) -> TReturn
    fun <TReturn, A, B, C, T, U, V, W, X> proxy(fn: (a: A, b: B, c: C, t: T, u: U, v: V, w: W, x: X) -> TReturn, context: Nothing?, a: A, b: B, c: C): (t: T, u: U, v: V, w: W, x: X) -> TReturn
    fun <TReturn, A, B, T, U, V, W, X> proxy(fn: (a: A, b: B, t: T, u: U, v: V, w: W, x: X) -> TReturn, context: Nothing?, a: A, b: B): (t: T, u: U, v: V, w: W, x: X) -> TReturn
    fun <TReturn, A, T, U, V, W, X> proxy(fn: (a: A, t: T, u: U, v: V, w: W, x: X) -> TReturn, context: Nothing?, a: A): (t: T, u: U, v: V, w: W, x: X) -> TReturn
    fun <TReturn, T, U, V, W, X> proxy(fn: (t: T, u: U, v: V, w: W, x: X) -> TReturn, context: Nothing?): (t: T, u: U, v: V, w: W, x: X) -> TReturn
    fun <TReturn, A, B, C, D, E, F, G, T, U, V, W, X, Y> proxy(fn: (a: A, b: B, c: C, d: D, e: E, f: F, g: G, t: T, u: U, v: V, w: W, x: X, y: Y) -> TReturn, context: Nothing?, a: A, b: B, c: C, d: D, e: E, f: F, g: G): (t: T, u: U, v: V, w: W, x: X, y: Y) -> TReturn
    fun <TReturn, A, B, C, D, E, F, T, U, V, W, X, Y> proxy(fn: (a: A, b: B, c: C, d: D, e: E, f: F, t: T, u: U, v: V, w: W, x: X, y: Y) -> TReturn, context: Nothing?, a: A, b: B, c: C, d: D, e: E, f: F): (t: T, u: U, v: V, w: W, x: X, y: Y) -> TReturn
    fun <TReturn, A, B, C, D, E, T, U, V, W, X, Y> proxy(fn: (a: A, b: B, c: C, d: D, e: E, t: T, u: U, v: V, w: W, x: X, y: Y) -> TReturn, context: Nothing?, a: A, b: B, c: C, d: D, e: E): (t: T, u: U, v: V, w: W, x: X, y: Y) -> TReturn
    fun <TReturn, A, B, C, D, T, U, V, W, X, Y> proxy(fn: (a: A, b: B, c: C, d: D, t: T, u: U, v: V, w: W, x: X, y: Y) -> TReturn, context: Nothing?, a: A, b: B, c: C, d: D): (t: T, u: U, v: V, w: W, x: X, y: Y) -> TReturn
    fun <TReturn, A, B, C, T, U, V, W, X, Y> proxy(fn: (a: A, b: B, c: C, t: T, u: U, v: V, w: W, x: X, y: Y) -> TReturn, context: Nothing?, a: A, b: B, c: C): (t: T, u: U, v: V, w: W, x: X, y: Y) -> TReturn
    fun <TReturn, A, B, T, U, V, W, X, Y> proxy(fn: (a: A, b: B, t: T, u: U, v: V, w: W, x: X, y: Y) -> TReturn, context: Nothing?, a: A, b: B): (t: T, u: U, v: V, w: W, x: X, y: Y) -> TReturn
    fun <TReturn, A, T, U, V, W, X, Y> proxy(fn: (a: A, t: T, u: U, v: V, w: W, x: X, y: Y) -> TReturn, context: Nothing?, a: A): (t: T, u: U, v: V, w: W, x: X, y: Y) -> TReturn
    fun <TReturn, T, U, V, W, X, Y> proxy(fn: (t: T, u: U, v: V, w: W, x: X, y: Y) -> TReturn, context: Nothing?): (t: T, u: U, v: V, w: W, x: X, y: Y) -> TReturn
    fun <TReturn, A, B, C, D, E, F, G, T, U, V, W, X, Y, Z> proxy(fn: (a: A, b: B, c: C, d: D, e: E, f: F, g: G, t: T, u: U, v: V, w: W, x: X, y: Y, z: Z, args: Any) -> TReturn, context: Nothing?, a: A, b: B, c: C, d: D, e: E, f: F, g: G): (t: T, u: U, v: V, w: W, x: X, y: Y, z: Z, args: Any) -> TReturn
    fun <TReturn, A, B, C, D, E, F, T, U, V, W, X, Y, Z> proxy(fn: (a: A, b: B, c: C, d: D, e: E, f: F, t: T, u: U, v: V, w: W, x: X, y: Y, z: Z, args: Any) -> TReturn, context: Nothing?, a: A, b: B, c: C, d: D, e: E, f: F): (t: T, u: U, v: V, w: W, x: X, y: Y, z: Z, args: Any) -> TReturn
    fun <TReturn, A, B, C, D, E, T, U, V, W, X, Y, Z> proxy(fn: (a: A, b: B, c: C, d: D, e: E, t: T, u: U, v: V, w: W, x: X, y: Y, z: Z, args: Any) -> TReturn, context: Nothing?, a: A, b: B, c: C, d: D, e: E): (t: T, u: U, v: V, w: W, x: X, y: Y, z: Z, args: Any) -> TReturn
    fun <TReturn, A, B, C, D, T, U, V, W, X, Y, Z> proxy(fn: (a: A, b: B, c: C, d: D, t: T, u: U, v: V, w: W, x: X, y: Y, z: Z, args: Any) -> TReturn, context: Nothing?, a: A, b: B, c: C, d: D): (t: T, u: U, v: V, w: W, x: X, y: Y, z: Z, args: Any) -> TReturn
    fun <TReturn, A, B, C, T, U, V, W, X, Y, Z> proxy(fn: (a: A, b: B, c: C, t: T, u: U, v: V, w: W, x: X, y: Y, z: Z, args: Any) -> TReturn, context: Nothing?, a: A, b: B, c: C): (t: T, u: U, v: V, w: W, x: X, y: Y, z: Z, args: Any) -> TReturn
    fun <TReturn, A, B, T, U, V, W, X, Y, Z> proxy(fn: (a: A, b: B, t: T, u: U, v: V, w: W, x: X, y: Y, z: Z, args: Any) -> TReturn, context: Nothing?, a: A, b: B): (t: T, u: U, v: V, w: W, x: X, y: Y, z: Z, args: Any) -> TReturn
    fun <TReturn, A, T, U, V, W, X, Y, Z> proxy(fn: (a: A, t: T, u: U, v: V, w: W, x: X, y: Y, z: Z, args: Any) -> TReturn, context: Nothing?, a: A): (t: T, u: U, v: V, w: W, x: X, y: Y, z: Z, args: Any) -> TReturn
    fun <TReturn, T, U, V, W, X, Y, Z> proxy(fn: (t: T, u: U, v: V, w: W, x: X, y: Y, z: Z, args: Any) -> TReturn, context: Nothing?): (t: T, u: U, v: V, w: W, x: X, y: Y, z: Z, args: Any) -> TReturn
    fun <TReturn> proxy(fn: (args: Any) -> TReturn, context: Nothing?, vararg additionalArguments: Any): (args: Any) -> TReturn
    fun <TContext : Any, TReturn, A, B, C, D, E, F, G> proxy(fn: (a: A, b: B, c: C, d: D, e: E, f: F, g: G) -> TReturn, context: TContext, a: A, b: B, c: C, d: D, e: E, f: F, g: G): (`this`: TContext) -> TReturn
    fun <TContext : Any, TReturn, A, B, C, D, E, F> proxy(fn: (a: A, b: B, c: C, d: D, e: E, f: F) -> TReturn, context: TContext, a: A, b: B, c: C, d: D, e: E, f: F): (`this`: TContext) -> TReturn
    fun <TContext : Any, TReturn, A, B, C, D, E> proxy(fn: (a: A, b: B, c: C, d: D, e: E) -> TReturn, context: TContext, a: A, b: B, c: C, d: D, e: E): (`this`: TContext) -> TReturn
    fun <TContext : Any, TReturn, A, B, C, D> proxy(fn: (a: A, b: B, c: C, d: D) -> TReturn, context: TContext, a: A, b: B, c: C, d: D): (`this`: TContext) -> TReturn
    fun <TContext : Any, TReturn, A, B, C> proxy(fn: (a: A, b: B, c: C) -> TReturn, context: TContext, a: A, b: B, c: C): (`this`: TContext) -> TReturn
    fun <TContext : Any, TReturn, A, B> proxy(fn: (a: A, b: B) -> TReturn, context: TContext, a: A, b: B): (`this`: TContext) -> TReturn
    fun <TContext : Any, TReturn, A> proxy(fn: (a: A) -> TReturn, context: TContext, a: A): (`this`: TContext) -> TReturn
    fun <TContext : Any, TReturn> proxy(fn: () -> TReturn, context: TContext): (`this`: TContext) -> TReturn
    fun <TContext : Any, TReturn, A, B, C, D, E, F, G, T> proxy(fn: (a: A, b: B, c: C, d: D, e: E, f: F, g: G, t: T) -> TReturn, context: TContext, a: A, b: B, c: C, d: D, e: E, f: F, g: G): (`this`: TContext, t: T) -> TReturn
    fun <TContext : Any, TReturn, A, B, C, D, E, F, T> proxy(fn: (a: A, b: B, c: C, d: D, e: E, f: F, t: T) -> TReturn, context: TContext, a: A, b: B, c: C, d: D, e: E, f: F): (`this`: TContext, t: T) -> TReturn
    fun <TContext : Any, TReturn, A, B, C, D, E, T> proxy(fn: (a: A, b: B, c: C, d: D, e: E, t: T) -> TReturn, context: TContext, a: A, b: B, c: C, d: D, e: E): (`this`: TContext, t: T) -> TReturn
    fun <TContext : Any, TReturn, A, B, C, D, T> proxy(fn: (a: A, b: B, c: C, d: D, t: T) -> TReturn, context: TContext, a: A, b: B, c: C, d: D): (`this`: TContext, t: T) -> TReturn
    fun <TContext : Any, TReturn, A, B, C, T> proxy(fn: (a: A, b: B, c: C, t: T) -> TReturn, context: TContext, a: A, b: B, c: C): (`this`: TContext, t: T) -> TReturn
    fun <TContext : Any, TReturn, A, B, T> proxy(fn: (a: A, b: B, t: T) -> TReturn, context: TContext, a: A, b: B): (`this`: TContext, t: T) -> TReturn
    fun <TContext : Any, TReturn, A, T> proxy(fn: (a: A, t: T) -> TReturn, context: TContext, a: A): (`this`: TContext, t: T) -> TReturn
    fun <TContext : Any, TReturn, T> proxy(fn: (t: T) -> TReturn, context: TContext): (`this`: TContext, t: T) -> TReturn
    fun <TContext : Any, TReturn, A, B, C, D, E, F, G, T, U> proxy(fn: (a: A, b: B, c: C, d: D, e: E, f: F, g: G, t: T, u: U) -> TReturn, context: TContext, a: A, b: B, c: C, d: D, e: E, f: F, g: G): (`this`: TContext, t: T, u: U) -> TReturn
    fun <TContext : Any, TReturn, A, B, C, D, E, F, T, U> proxy(fn: (a: A, b: B, c: C, d: D, e: E, f: F, t: T, u: U) -> TReturn, context: TContext, a: A, b: B, c: C, d: D, e: E, f: F): (`this`: TContext, t: T, u: U) -> TReturn
    fun <TContext : Any, TReturn, A, B, C, D, E, T, U> proxy(fn: (a: A, b: B, c: C, d: D, e: E, t: T, u: U) -> TReturn, context: TContext, a: A, b: B, c: C, d: D, e: E): (`this`: TContext, t: T, u: U) -> TReturn
    fun <TContext : Any, TReturn, A, B, C, D, T, U> proxy(fn: (a: A, b: B, c: C, d: D, t: T, u: U) -> TReturn, context: TContext, a: A, b: B, c: C, d: D): (`this`: TContext, t: T, u: U) -> TReturn
    fun <TContext : Any, TReturn, A, B, C, T, U> proxy(fn: (a: A, b: B, c: C, t: T, u: U) -> TReturn, context: TContext, a: A, b: B, c: C): (`this`: TContext, t: T, u: U) -> TReturn
    fun <TContext : Any, TReturn, A, B, T, U> proxy(fn: (a: A, b: B, t: T, u: U) -> TReturn, context: TContext, a: A, b: B): (`this`: TContext, t: T, u: U) -> TReturn
    fun <TContext : Any, TReturn, A, T, U> proxy(fn: (a: A, t: T, u: U) -> TReturn, context: TContext, a: A): (`this`: TContext, t: T, u: U) -> TReturn
    fun <TContext : Any, TReturn, T, U> proxy(fn: (t: T, u: U) -> TReturn, context: TContext): (`this`: TContext, t: T, u: U) -> TReturn
    fun <TContext : Any, TReturn, A, B, C, D, E, F, G, T, U, V> proxy(fn: (a: A, b: B, c: C, d: D, e: E, f: F, g: G, t: T, u: U, v: V) -> TReturn, context: TContext, a: A, b: B, c: C, d: D, e: E, f: F, g: G): (`this`: TContext, t: T, u: U, v: V) -> TReturn
    fun <TContext : Any, TReturn, A, B, C, D, E, F, T, U, V> proxy(fn: (a: A, b: B, c: C, d: D, e: E, f: F, t: T, u: U, v: V) -> TReturn, context: TContext, a: A, b: B, c: C, d: D, e: E, f: F): (`this`: TContext, t: T, u: U, v: V) -> TReturn
    fun <TContext : Any, TReturn, A, B, C, D, E, T, U, V> proxy(fn: (a: A, b: B, c: C, d: D, e: E, t: T, u: U, v: V) -> TReturn, context: TContext, a: A, b: B, c: C, d: D, e: E): (`this`: TContext, t: T, u: U, v: V) -> TReturn
    fun <TContext : Any, TReturn, A, B, C, D, T, U, V> proxy(fn: (a: A, b: B, c: C, d: D, t: T, u: U, v: V) -> TReturn, context: TContext, a: A, b: B, c: C, d: D): (`this`: TContext, t: T, u: U, v: V) -> TReturn
    fun <TContext : Any, TReturn, A, B, C, T, U, V> proxy(fn: (a: A, b: B, c: C, t: T, u: U, v: V) -> TReturn, context: TContext, a: A, b: B, c: C): (`this`: TContext, t: T, u: U, v: V) -> TReturn
    fun <TContext : Any, TReturn, A, B, T, U, V> proxy(fn: (a: A, b: B, t: T, u: U, v: V) -> TReturn, context: TContext, a: A, b: B): (`this`: TContext, t: T, u: U, v: V) -> TReturn
    fun <TContext : Any, TReturn, A, T, U, V> proxy(fn: (a: A, t: T, u: U, v: V) -> TReturn, context: TContext, a: A): (`this`: TContext, t: T, u: U, v: V) -> TReturn
    fun <TContext : Any, TReturn, T, U, V> proxy(fn: (t: T, u: U, v: V) -> TReturn, context: TContext): (`this`: TContext, t: T, u: U, v: V) -> TReturn
    fun <TContext : Any, TReturn, A, B, C, D, E, F, G, T, U, V, W> proxy(fn: (a: A, b: B, c: C, d: D, e: E, f: F, g: G, t: T, u: U, v: V, w: W) -> TReturn, context: TContext, a: A, b: B, c: C, d: D, e: E, f: F, g: G): (`this`: TContext, t: T, u: U, v: V, w: W) -> TReturn
    fun <TContext : Any, TReturn, A, B, C, D, E, F, T, U, V, W> proxy(fn: (a: A, b: B, c: C, d: D, e: E, f: F, t: T, u: U, v: V, w: W) -> TReturn, context: TContext, a: A, b: B, c: C, d: D, e: E, f: F): (`this`: TContext, t: T, u: U, v: V, w: W) -> TReturn
    fun <TContext : Any, TReturn, A, B, C, D, E, T, U, V, W> proxy(fn: (a: A, b: B, c: C, d: D, e: E, t: T, u: U, v: V, w: W) -> TReturn, context: TContext, a: A, b: B, c: C, d: D, e: E): (`this`: TContext, t: T, u: U, v: V, w: W) -> TReturn
    fun <TContext : Any, TReturn, A, B, C, D, T, U, V, W> proxy(fn: (a: A, b: B, c: C, d: D, t: T, u: U, v: V, w: W) -> TReturn, context: TContext, a: A, b: B, c: C, d: D): (`this`: TContext, t: T, u: U, v: V, w: W) -> TReturn
    fun <TContext : Any, TReturn, A, B, C, T, U, V, W> proxy(fn: (a: A, b: B, c: C, t: T, u: U, v: V, w: W) -> TReturn, context: TContext, a: A, b: B, c: C): (`this`: TContext, t: T, u: U, v: V, w: W) -> TReturn
    fun <TContext : Any, TReturn, A, B, T, U, V, W> proxy(fn: (a: A, b: B, t: T, u: U, v: V, w: W) -> TReturn, context: TContext, a: A, b: B): (`this`: TContext, t: T, u: U, v: V, w: W) -> TReturn
    fun <TContext : Any, TReturn, A, T, U, V, W> proxy(fn: (a: A, t: T, u: U, v: V, w: W) -> TReturn, context: TContext, a: A): (`this`: TContext, t: T, u: U, v: V, w: W) -> TReturn
    fun <TContext : Any, TReturn, T, U, V, W> proxy(fn: (t: T, u: U, v: V, w: W) -> TReturn, context: TContext): (`this`: TContext, t: T, u: U, v: V, w: W) -> TReturn
    fun <TContext : Any, TReturn, A, B, C, D, E, F, G, T, U, V, W, X> proxy(fn: (a: A, b: B, c: C, d: D, e: E, f: F, g: G, t: T, u: U, v: V, w: W, x: X) -> TReturn, context: TContext, a: A, b: B, c: C, d: D, e: E, f: F, g: G): (`this`: TContext, t: T, u: U, v: V, w: W, x: X) -> TReturn
    fun <TContext : Any, TReturn, A, B, C, D, E, F, T, U, V, W, X> proxy(fn: (a: A, b: B, c: C, d: D, e: E, f: F, t: T, u: U, v: V, w: W, x: X) -> TReturn, context: TContext, a: A, b: B, c: C, d: D, e: E, f: F): (`this`: TContext, t: T, u: U, v: V, w: W, x: X) -> TReturn
    fun <TContext : Any, TReturn, A, B, C, D, E, T, U, V, W, X> proxy(fn: (a: A, b: B, c: C, d: D, e: E, t: T, u: U, v: V, w: W, x: X) -> TReturn, context: TContext, a: A, b: B, c: C, d: D, e: E): (`this`: TContext, t: T, u: U, v: V, w: W, x: X) -> TReturn
    fun <TContext : Any, TReturn, A, B, C, D, T, U, V, W, X> proxy(fn: (a: A, b: B, c: C, d: D, t: T, u: U, v: V, w: W, x: X) -> TReturn, context: TContext, a: A, b: B, c: C, d: D): (`this`: TContext, t: T, u: U, v: V, w: W, x: X) -> TReturn
    fun <TContext : Any, TReturn, A, B, C, T, U, V, W, X> proxy(fn: (a: A, b: B, c: C, t: T, u: U, v: V, w: W, x: X) -> TReturn, context: TContext, a: A, b: B, c: C): (`this`: TContext, t: T, u: U, v: V, w: W, x: X) -> TReturn
    fun <TContext : Any, TReturn, A, B, T, U, V, W, X> proxy(fn: (a: A, b: B, t: T, u: U, v: V, w: W, x: X) -> TReturn, context: TContext, a: A, b: B): (`this`: TContext, t: T, u: U, v: V, w: W, x: X) -> TReturn
    fun <TContext : Any, TReturn, A, T, U, V, W, X> proxy(fn: (a: A, t: T, u: U, v: V, w: W, x: X) -> TReturn, context: TContext, a: A): (`this`: TContext, t: T, u: U, v: V, w: W, x: X) -> TReturn
    fun <TContext : Any, TReturn, T, U, V, W, X> proxy(fn: (t: T, u: U, v: V, w: W, x: X) -> TReturn, context: TContext): (`this`: TContext, t: T, u: U, v: V, w: W, x: X) -> TReturn
    fun <TContext : Any, TReturn, A, B, C, D, E, F, G, T, U, V, W, X, Y> proxy(fn: (a: A, b: B, c: C, d: D, e: E, f: F, g: G, t: T, u: U, v: V, w: W, x: X, y: Y) -> TReturn, context: TContext, a: A, b: B, c: C, d: D, e: E, f: F, g: G): (`this`: TContext, t: T, u: U, v: V, w: W, x: X, y: Y) -> TReturn
    fun <TContext : Any, TReturn, A, B, C, D, E, F, T, U, V, W, X, Y> proxy(fn: (a: A, b: B, c: C, d: D, e: E, f: F, t: T, u: U, v: V, w: W, x: X, y: Y) -> TReturn, context: TContext, a: A, b: B, c: C, d: D, e: E, f: F): (`this`: TContext, t: T, u: U, v: V, w: W, x: X, y: Y) -> TReturn
    fun <TContext : Any, TReturn, A, B, C, D, E, T, U, V, W, X, Y> proxy(fn: (a: A, b: B, c: C, d: D, e: E, t: T, u: U, v: V, w: W, x: X, y: Y) -> TReturn, context: TContext, a: A, b: B, c: C, d: D, e: E): (`this`: TContext, t: T, u: U, v: V, w: W, x: X, y: Y) -> TReturn
    fun <TContext : Any, TReturn, A, B, C, D, T, U, V, W, X, Y> proxy(fn: (a: A, b: B, c: C, d: D, t: T, u: U, v: V, w: W, x: X, y: Y) -> TReturn, context: TContext, a: A, b: B, c: C, d: D): (`this`: TContext, t: T, u: U, v: V, w: W, x: X, y: Y) -> TReturn
    fun <TContext : Any, TReturn, A, B, C, T, U, V, W, X, Y> proxy(fn: (a: A, b: B, c: C, t: T, u: U, v: V, w: W, x: X, y: Y) -> TReturn, context: TContext, a: A, b: B, c: C): (`this`: TContext, t: T, u: U, v: V, w: W, x: X, y: Y) -> TReturn
    fun <TContext : Any, TReturn, A, B, T, U, V, W, X, Y> proxy(fn: (a: A, b: B, t: T, u: U, v: V, w: W, x: X, y: Y) -> TReturn, context: TContext, a: A, b: B): (`this`: TContext, t: T, u: U, v: V, w: W, x: X, y: Y) -> TReturn
    fun <TContext : Any, TReturn, A, T, U, V, W, X, Y> proxy(fn: (a: A, t: T, u: U, v: V, w: W, x: X, y: Y) -> TReturn, context: TContext, a: A): (`this`: TContext, t: T, u: U, v: V, w: W, x: X, y: Y) -> TReturn
    fun <TContext : Any, TReturn, T, U, V, W, X, Y> proxy(fn: (t: T, u: U, v: V, w: W, x: X, y: Y) -> TReturn, context: TContext): (`this`: TContext, t: T, u: U, v: V, w: W, x: X, y: Y) -> TReturn
    fun <TContext : Any, TReturn, A, B, C, D, E, F, G, T, U, V, W, X, Y, Z> proxy(fn: (a: A, b: B, c: C, d: D, e: E, f: F, g: G, t: T, u: U, v: V, w: W, x: X, y: Y, z: Z, args: Any) -> TReturn, context: TContext, a: A, b: B, c: C, d: D, e: E, f: F, g: G): (`this`: TContext, t: T, u: U, v: V, w: W, x: X, y: Y, z: Z, args: Any) -> TReturn
    fun <TContext : Any, TReturn, A, B, C, D, E, F, T, U, V, W, X, Y, Z> proxy(fn: (a: A, b: B, c: C, d: D, e: E, f: F, t: T, u: U, v: V, w: W, x: X, y: Y, z: Z, args: Any) -> TReturn, context: TContext, a: A, b: B, c: C, d: D, e: E, f: F): (`this`: TContext, t: T, u: U, v: V, w: W, x: X, y: Y, z: Z, args: Any) -> TReturn
    fun <TContext : Any, TReturn, A, B, C, D, E, T, U, V, W, X, Y, Z> proxy(fn: (a: A, b: B, c: C, d: D, e: E, t: T, u: U, v: V, w: W, x: X, y: Y, z: Z, args: Any) -> TReturn, context: TContext, a: A, b: B, c: C, d: D, e: E): (`this`: TContext, t: T, u: U, v: V, w: W, x: X, y: Y, z: Z, args: Any) -> TReturn
    fun <TContext : Any, TReturn, A, B, C, D, T, U, V, W, X, Y, Z> proxy(fn: (a: A, b: B, c: C, d: D, t: T, u: U, v: V, w: W, x: X, y: Y, z: Z, args: Any) -> TReturn, context: TContext, a: A, b: B, c: C, d: D): (`this`: TContext, t: T, u: U, v: V, w: W, x: X, y: Y, z: Z, args: Any) -> TReturn
    fun <TContext : Any, TReturn, A, B, C, T, U, V, W, X, Y, Z> proxy(fn: (a: A, b: B, c: C, t: T, u: U, v: V, w: W, x: X, y: Y, z: Z, args: Any) -> TReturn, context: TContext, a: A, b: B, c: C): (`this`: TContext, t: T, u: U, v: V, w: W, x: X, y: Y, z: Z, args: Any) -> TReturn
    fun <TContext : Any, TReturn, A, B, T, U, V, W, X, Y, Z> proxy(fn: (a: A, b: B, t: T, u: U, v: V, w: W, x: X, y: Y, z: Z, args: Any) -> TReturn, context: TContext, a: A, b: B): (`this`: TContext, t: T, u: U, v: V, w: W, x: X, y: Y, z: Z, args: Any) -> TReturn
    fun <TContext : Any, TReturn, A, T, U, V, W, X, Y, Z> proxy(fn: (a: A, t: T, u: U, v: V, w: W, x: X, y: Y, z: Z, args: Any) -> TReturn, context: TContext, a: A): (`this`: TContext, t: T, u: U, v: V, w: W, x: X, y: Y, z: Z, args: Any) -> TReturn
    fun <TContext : Any, TReturn, T, U, V, W, X, Y, Z> proxy(fn: (t: T, u: U, v: V, w: W, x: X, y: Y, z: Z, args: Any) -> TReturn, context: TContext): (`this`: TContext, t: T, u: U, v: V, w: W, x: X, y: Y, z: Z, args: Any) -> TReturn
    fun <TContext : Any, TReturn> proxy(fn: (args: Any) -> TReturn, context: TContext, vararg additionalArguments: Any): (`this`: TContext, args: Any) -> TReturn
    fun <TContext : Any> proxy(context: TContext, name: Any?, vararg additionalArguments: Any): (`this`: TContext, args: Any) -> Any
    fun <T : Element> queue(element: T, queueName: String? = definedExternally /* null */, newQueue: JQuery.QueueFunction<T>? = definedExternally /* null */): `T$1` /* `T$1` & Array<JQuery.QueueFunction<T>> */
    fun <T : Element> queue(element: T, queueName: String? = definedExternally /* null */, newQueue: Array<JQuery.QueueFunction<T>>? = definedExternally /* null */): `T$1` /* `T$1` & Array<JQuery.QueueFunction<T>> */
    fun readyException(error: Error): Any
    fun removeData(element: Element, name: String? = definedExternally /* null */)
    fun speed(duration: Number, easing: String, complete: (`this`: TElement) -> Unit): JQuery.EffectsOptions<TElement>
    fun speed(duration: String /* "fast" */, easing: String, complete: (`this`: TElement) -> Unit): JQuery.EffectsOptions<TElement>
    fun speed(duration: String /* "slow" */, easing: String, complete: (`this`: TElement) -> Unit): JQuery.EffectsOptions<TElement>
    fun speed(duration: Number, easing_complete: String): JQuery.EffectsOptions<TElement>
    fun speed(duration: Number, easing_complete: (`this`: TElement) -> Unit): JQuery.EffectsOptions<TElement>
    fun speed(duration: String /* "fast" */, easing_complete: String): JQuery.EffectsOptions<TElement>
    fun speed(duration: String /* "fast" */, easing_complete: (`this`: TElement) -> Unit): JQuery.EffectsOptions<TElement>
    fun speed(duration: String /* "slow" */, easing_complete: String): JQuery.EffectsOptions<TElement>
    fun speed(duration: String /* "slow" */, easing_complete: (`this`: TElement) -> Unit): JQuery.EffectsOptions<TElement>
    fun speed(duration_complete_settings: Number? = definedExternally /* null */): JQuery.EffectsOptions<TElement>
    fun speed(duration_complete_settings: String? /* "fast" */ = definedExternally /* null */): JQuery.EffectsOptions<TElement>
    fun speed(duration_complete_settings: String? /* "slow" */ = definedExternally /* null */): JQuery.EffectsOptions<TElement>
    fun speed(duration_complete_settings: ((`this`: TElement) -> Unit)? = definedExternally /* null */): JQuery.EffectsOptions<TElement>
    fun speed(duration_complete_settings: JQuery.SpeedSettings<TElement>? = definedExternally /* null */): JQuery.EffectsOptions<TElement>
    fun trim(str: String): String
    fun type(obj: Any): dynamic /* String /* "string" */ | String /* "number" */ | String /* "boolean" */ | String /* "symbol" */ | String /* "undefined" */ | String /* "object" */ | String /* "function" */ | String /* "array" */ | String /* "date" */ | String /* "error" */ | String /* "null" */ | String /* "regexp" */ */
    fun <T : Element> unique(array: Array<T>): Array<T>
    fun <T : Element> uniqueSort(array: Array<T>): Array<T>
    fun <TR1, UR1, VR1, TJ1, UJ1, VJ1> `when`(deferredT: TR1, deferredU: UR1, deferredV: dynamic /* VR1 | JQuery.Promise<VR1, VJ1, Any> | JQuery.Thenable<VR1> */): JQuery.Promise3<TR1, TJ1, Any?, UR1, UJ1, Any?, VR1, VJ1, Any?>
    fun <TR1, UR1, VR1, TJ1, UJ1, VJ1> `when`(deferredT: TR1, deferredU: JQuery.Promise<UR1, UJ1, Any>, deferredV: dynamic /* VR1 | JQuery.Promise<VR1, VJ1, Any> | JQuery.Thenable<VR1> */): JQuery.Promise3<TR1, TJ1, Any?, UR1, UJ1, Any?, VR1, VJ1, Any?>
    fun <TR1, UR1, VR1, TJ1, UJ1, VJ1> `when`(deferredT: TR1, deferredU: JQuery.Thenable<UR1>, deferredV: dynamic /* VR1 | JQuery.Promise<VR1, VJ1, Any> | JQuery.Thenable<VR1> */): JQuery.Promise3<TR1, TJ1, Any?, UR1, UJ1, Any?, VR1, VJ1, Any?>
    fun <TR1, UR1, VR1, TJ1, UJ1, VJ1> `when`(deferredT: JQuery.Promise<TR1, TJ1, Any>, deferredU: UR1, deferredV: dynamic /* VR1 | JQuery.Promise<VR1, VJ1, Any> | JQuery.Thenable<VR1> */): JQuery.Promise3<TR1, TJ1, Any?, UR1, UJ1, Any?, VR1, VJ1, Any?>
    fun <TR1, UR1, VR1, TJ1, UJ1, VJ1> `when`(deferredT: JQuery.Promise<TR1, TJ1, Any>, deferredU: JQuery.Promise<UR1, UJ1, Any>, deferredV: dynamic /* VR1 | JQuery.Promise<VR1, VJ1, Any> | JQuery.Thenable<VR1> */): JQuery.Promise3<TR1, TJ1, Any?, UR1, UJ1, Any?, VR1, VJ1, Any?>
    fun <TR1, UR1, VR1, TJ1, UJ1, VJ1> `when`(deferredT: JQuery.Promise<TR1, TJ1, Any>, deferredU: JQuery.Thenable<UR1>, deferredV: dynamic /* VR1 | JQuery.Promise<VR1, VJ1, Any> | JQuery.Thenable<VR1> */): JQuery.Promise3<TR1, TJ1, Any?, UR1, UJ1, Any?, VR1, VJ1, Any?>
    fun <TR1, UR1, VR1, TJ1, UJ1, VJ1> `when`(deferredT: JQuery.Thenable<TR1>, deferredU: UR1, deferredV: dynamic /* VR1 | JQuery.Promise<VR1, VJ1, Any> | JQuery.Thenable<VR1> */): JQuery.Promise3<TR1, TJ1, Any?, UR1, UJ1, Any?, VR1, VJ1, Any?>
    fun <TR1, UR1, VR1, TJ1, UJ1, VJ1> `when`(deferredT: JQuery.Thenable<TR1>, deferredU: JQuery.Promise<UR1, UJ1, Any>, deferredV: dynamic /* VR1 | JQuery.Promise<VR1, VJ1, Any> | JQuery.Thenable<VR1> */): JQuery.Promise3<TR1, TJ1, Any?, UR1, UJ1, Any?, VR1, VJ1, Any?>
    fun <TR1, UR1, VR1, TJ1, UJ1, VJ1> `when`(deferredT: JQuery.Thenable<TR1>, deferredU: JQuery.Thenable<UR1>, deferredV: dynamic /* VR1 | JQuery.Promise<VR1, VJ1, Any> | JQuery.Thenable<VR1> */): JQuery.Promise3<TR1, TJ1, Any?, UR1, UJ1, Any?, VR1, VJ1, Any?>
    fun <TR1, UR1, TJ1, UJ1> `when`(deferredT: TR1, deferredU: UR1): JQuery.Promise2<TR1, TJ1, Any?, UR1, UJ1, Any?>
    fun <TR1, UR1, TJ1, UJ1> `when`(deferredT: TR1, deferredU: JQuery.Promise<UR1, UJ1, Any>): JQuery.Promise2<TR1, TJ1, Any?, UR1, UJ1, Any?>
    fun <TR1, UR1, TJ1, UJ1> `when`(deferredT: TR1, deferredU: JQuery.Thenable<UR1>): JQuery.Promise2<TR1, TJ1, Any?, UR1, UJ1, Any?>
    fun <TR1, UR1, TJ1, UJ1> `when`(deferredT: JQuery.Promise<TR1, TJ1, Any>, deferredU: UR1): JQuery.Promise2<TR1, TJ1, Any?, UR1, UJ1, Any?>
    fun <TR1, UR1, TJ1, UJ1> `when`(deferredT: JQuery.Promise<TR1, TJ1, Any>, deferredU: JQuery.Promise<UR1, UJ1, Any>): JQuery.Promise2<TR1, TJ1, Any?, UR1, UJ1, Any?>
    fun <TR1, UR1, TJ1, UJ1> `when`(deferredT: JQuery.Promise<TR1, TJ1, Any>, deferredU: JQuery.Thenable<UR1>): JQuery.Promise2<TR1, TJ1, Any?, UR1, UJ1, Any?>
    fun <TR1, UR1, TJ1, UJ1> `when`(deferredT: JQuery.Thenable<TR1>, deferredU: UR1): JQuery.Promise2<TR1, TJ1, Any?, UR1, UJ1, Any?>
    fun <TR1, UR1, TJ1, UJ1> `when`(deferredT: JQuery.Thenable<TR1>, deferredU: JQuery.Promise<UR1, UJ1, Any>): JQuery.Promise2<TR1, TJ1, Any?, UR1, UJ1, Any?>
    fun <TR1, UR1, TJ1, UJ1> `when`(deferredT: JQuery.Thenable<TR1>, deferredU: JQuery.Thenable<UR1>): JQuery.Promise2<TR1, TJ1, Any?, UR1, UJ1, Any?>
    fun <TR1, TJ1, TR2, TJ2, TR3, TJ3> `when`(deferredT: JQuery.Promise3<TR1, TJ1, Any, TR2, TJ2, Any, TR3, TJ3, Any>): JQuery.Promise3<TR1, TJ1, Any?, TR2, TJ2, Any?, TR3, TJ3, Any?>
    fun <TR1, TJ1, TR2, TJ2, TR3, TJ3> `when`(deferredT: JQuery.Promise2<TR1, TJ1, Any, TR2, TJ2, Any>): JQuery.Promise3<TR1, TJ1, Any?, TR2, TJ2, Any?, TR3, TJ3, Any?>
    fun <TR1, TJ1> `when`(deferred: TR1): JQuery.Promise<TR1, TJ1, Any?>
    fun <TR1, TJ1> `when`(deferred: JQuery.Promise<TR1, TJ1, Any>): JQuery.Promise<TR1, TJ1, Any?>
    fun <TR1, TJ1> `when`(deferred: JQuery.Thenable<TR1>): JQuery.Promise<TR1, TJ1, Any?>
    fun <TR1, TJ1> `when`(vararg deferreds: TR1): JQuery.Promise<TR1, TJ1, Any?>
    fun <TR1, TJ1> `when`(vararg deferreds: JQuery.Promise<TR1, TJ1, Any>): JQuery.Promise<TR1, TJ1, Any?>
    fun <TR1, TJ1> `when`(vararg deferreds: JQuery.Thenable<TR1>): JQuery.Promise<TR1, TJ1, Any?>
    fun `when`(vararg deferreds: Any): JQuery.Promise<Any, Any, Any?>
    @nativeInvoke
    operator fun invoke(): JQuery<TElement>
    fun get(): JQuery.jqXHR<Any>
    fun getJSON(url: String): JQuery.jqXHR<Any>
    fun parseHTML(data: String): Array<dynamic /* Element | Text | Comment */>
    fun post(): JQuery.jqXHR<Any>
    fun <T : Element> queue(element: T): `T$1` /* `T$1` & Array<JQuery.QueueFunction<T>> */
    fun speed(): JQuery.EffectsOptions<TElement>
}
external interface JQuery<TElement : Node> : Iterable<TElement> {
    var jquery: String
    var length: Number
    fun add(selector: String, context: Element): JQuery<TElement> /* this */
    fun add(selector: String): JQuery<TElement> /* this */
    fun add(selector: Element): JQuery<TElement> /* this */
    fun add(selector: JQuery<HTMLElement>): JQuery<TElement> /* this */
    fun add(selector: Array<Element>): JQuery<TElement> /* this */
    fun addBack(selector: String? = definedExternally /* null */): JQuery<TElement> /* this */
    fun addClass(className: String): JQuery<TElement> /* this */
    fun addClass(className: Array<String>): JQuery<TElement> /* this */
    fun addClass(className: (`this`: TElement, index: Number, currentClassName: String) -> String): JQuery<TElement> /* this */
    fun after(vararg contents: String): JQuery<TElement> /* this */
    fun after(vararg contents: Element): JQuery<TElement> /* this */
    fun after(vararg contents: Text): JQuery<TElement> /* this */
    fun after(vararg contents: Comment): JQuery<TElement> /* this */
    fun after(vararg contents: JQuery<dynamic /* Element | Text | Comment */>): JQuery<TElement> /* this */
    fun after(vararg contents: Array<dynamic /* Element | Text | Comment | JQuery<dynamic /* Element | Text | Comment */> */>): JQuery<TElement> /* this */
    fun after(fn: (`this`: TElement, index: Number, html: String) -> dynamic /* String | Element | Text | Comment | JQuery<dynamic /* Element | Text | Comment */> | Array<dynamic /* Element | Text | Comment | JQuery<dynamic /* Element | Text | Comment */> */> */): JQuery<TElement> /* this */
    fun ajaxComplete(handler: (`this`: Document, event: JQuery.Event<Document, Nothing?>, jqXHR: JQuery.jqXHR<Any>, ajaxOptions: JQuery.AjaxSettings<Any>) -> dynamic /* Boolean | Unit */): JQuery<TElement> /* this */
    fun ajaxError(handler: (`this`: Document, event: JQuery.Event<Document, Nothing?>, jqXHR: JQuery.jqXHR<Any>, ajaxSettings: JQuery.AjaxSettings<Any>, thrownError: String) -> dynamic /* Boolean | Unit */): JQuery<TElement> /* this */
    fun ajaxSend(handler: (`this`: Document, event: JQuery.Event<Document, Nothing?>, jqXHR: JQuery.jqXHR<Any>, ajaxOptions: JQuery.AjaxSettings<Any>) -> dynamic /* Boolean | Unit */): JQuery<TElement> /* this */
    fun ajaxStart(handler: (`this`: Document) -> dynamic /* Boolean | Unit */): JQuery<TElement> /* this */
    fun ajaxStop(handler: (`this`: Document) -> dynamic /* Boolean | Unit */): JQuery<TElement> /* this */
    fun ajaxSuccess(handler: (`this`: Document, event: JQuery.Event<Document, Nothing?>, jqXHR: JQuery.jqXHR<Any>, ajaxOptions: JQuery.AjaxSettings<Any>, data: JQuery.PlainObject<Any>) -> dynamic /* Boolean | Unit */): JQuery<TElement> /* this */
    fun animate(properties: JQuery.PlainObject<Any>, duration: Number, easing: String, complete: ((`this`: TElement) -> Unit)? = definedExternally /* null */): JQuery<TElement> /* this */
    fun animate(properties: JQuery.PlainObject<Any>, duration: String /* "fast" */, easing: String, complete: ((`this`: TElement) -> Unit)? = definedExternally /* null */): JQuery<TElement> /* this */
    fun animate(properties: JQuery.PlainObject<Any>, duration: String /* "slow" */, easing: String, complete: ((`this`: TElement) -> Unit)? = definedExternally /* null */): JQuery<TElement> /* this */
    fun animate(properties: JQuery.PlainObject<Any>, duration_easing: String, complete: ((`this`: TElement) -> Unit)? = definedExternally /* null */): JQuery<TElement> /* this */
    fun animate(properties: JQuery.PlainObject<Any>, duration_easing: Number, complete: ((`this`: TElement) -> Unit)? = definedExternally /* null */): JQuery<TElement> /* this */
    fun animate(properties: JQuery.PlainObject<Any>, options: JQuery.EffectsOptions<TElement>): JQuery<TElement> /* this */
    fun animate(properties: JQuery.PlainObject<Any>, complete: ((`this`: TElement) -> Unit)? = definedExternally /* null */): JQuery<TElement> /* this */
    fun append(vararg contents: String): JQuery<TElement> /* this */
    fun append(vararg contents: Element): JQuery<TElement> /* this */
    fun append(vararg contents: Text): JQuery<TElement> /* this */
    fun append(vararg contents: Comment): JQuery<TElement> /* this */
    fun append(vararg contents: JQuery<dynamic /* Element | Text | Comment */>): JQuery<TElement> /* this */
    fun append(vararg contents: Array<dynamic /* Element | Text | Comment | JQuery<dynamic /* Element | Text | Comment */> */>): JQuery<TElement> /* this */
    fun append(fn: (`this`: TElement, index: Number, html: String) -> dynamic /* String | Element | Text | Comment | JQuery<dynamic /* Element | Text | Comment */> | Array<dynamic /* Element | Text | Comment | JQuery<dynamic /* Element | Text | Comment */> */> */): JQuery<TElement> /* this */
    fun appendTo(target: String): JQuery<TElement> /* this */
    fun appendTo(target: Element): JQuery<TElement> /* this */
    fun appendTo(target: JQuery<HTMLElement>): JQuery<TElement> /* this */
    fun appendTo(target: Array<Element>): JQuery<TElement> /* this */
    fun attr(attributeName: String, value: String): JQuery<TElement> /* this */
    fun attr(attributeName: String, value: Number): JQuery<TElement> /* this */
    fun attr(attributeName: String, value: (`this`: TElement, index: Number, attr: String) -> dynamic /* String | Number | Unit | Nothing? */): JQuery<TElement> /* this */
    fun attr(attributeName: String, value: Nothing?): JQuery<TElement> /* this */
    fun attr(attributes: JQuery.PlainObject<Any>): JQuery<TElement> /* this */
    fun attr(attributeName: String): String?
    fun before(vararg contents: String): JQuery<TElement> /* this */
    fun before(vararg contents: Element): JQuery<TElement> /* this */
    fun before(vararg contents: Text): JQuery<TElement> /* this */
    fun before(vararg contents: Comment): JQuery<TElement> /* this */
    fun before(vararg contents: JQuery<dynamic /* Element | Text | Comment */>): JQuery<TElement> /* this */
    fun before(vararg contents: Array<dynamic /* Element | Text | Comment | JQuery<dynamic /* Element | Text | Comment */> */>): JQuery<TElement> /* this */
    fun before(fn: (`this`: TElement, index: Number, html: String) -> dynamic /* String | Element | Text | Comment | JQuery<dynamic /* Element | Text | Comment */> | Array<dynamic /* Element | Text | Comment | JQuery<dynamic /* Element | Text | Comment */> */> */): JQuery<TElement> /* this */
    fun <TData> bind(eventType: String, eventData: TData, handler: JQuery.EventHandler<TElement, TData>): JQuery<TElement> /* this */
    fun <TData> bind(eventType: String, eventData: TData, handler: JQuery.EventHandlerBase<Any, JQuery.Event<TElement, TData>>): JQuery<TElement> /* this */
    fun bind(eventType: String, handler: Boolean): JQuery<TElement> /* this */
    fun bind(eventType: String, handler: JQuery.EventHandler<TElement, Nothing?>): JQuery<TElement> /* this */
    fun bind(eventType: String, handler: JQuery.EventHandlerBase<Any, JQuery.Event<TElement, Nothing?>>): JQuery<TElement> /* this */
    fun bind(eventType: String, handler: Nothing?): JQuery<TElement> /* this */
    fun bind(events: JQuery.PlainObject<dynamic /* Boolean | JQuery.EventHandler<TElement, Nothing?> | JQuery.EventHandlerBase<Any, JQuery.Event<TElement, Nothing?>> | Nothing? */>): JQuery<TElement> /* this */
    fun <TData> blur(eventData: TData, handler: JQuery.EventHandler<TElement, TData>): JQuery<TElement> /* this */
    fun <TData> blur(eventData: TData, handler: JQuery.EventHandlerBase<Any, JQuery.Event<TElement, TData>>): JQuery<TElement> /* this */
    fun blur(handler: Boolean? = definedExternally /* null */): JQuery<TElement> /* this */
    fun blur(handler: JQuery.EventHandler<TElement, Nothing?>? = definedExternally /* null */): JQuery<TElement> /* this */
    fun blur(handler: JQuery.EventHandlerBase<Any, JQuery.Event<TElement, Nothing?>>? = definedExternally /* null */): JQuery<TElement> /* this */
    fun blur(handler: Nothing? = definedExternally /* null */): JQuery<TElement> /* this */
    fun <TData> change(eventData: TData, handler: JQuery.EventHandler<TElement, TData>): JQuery<TElement> /* this */
    fun <TData> change(eventData: TData, handler: JQuery.EventHandlerBase<Any, JQuery.Event<TElement, TData>>): JQuery<TElement> /* this */
    fun change(handler: Boolean? = definedExternally /* null */): JQuery<TElement> /* this */
    fun change(handler: JQuery.EventHandler<TElement, Nothing?>? = definedExternally /* null */): JQuery<TElement> /* this */
    fun change(handler: JQuery.EventHandlerBase<Any, JQuery.Event<TElement, Nothing?>>? = definedExternally /* null */): JQuery<TElement> /* this */
    fun change(handler: Nothing? = definedExternally /* null */): JQuery<TElement> /* this */
    fun children(selector: String? = definedExternally /* null */): JQuery<TElement> /* this */
    fun clearQueue(queueName: String? = definedExternally /* null */): JQuery<TElement> /* this */
    fun <TData> click(eventData: TData, handler: JQuery.EventHandler<TElement, TData>): JQuery<TElement> /* this */
    fun <TData> click(eventData: TData, handler: JQuery.EventHandlerBase<Any, JQuery.Event<TElement, TData>>): JQuery<TElement> /* this */
    fun click(handler: Boolean? = definedExternally /* null */): JQuery<TElement> /* this */
    fun click(handler: JQuery.EventHandler<TElement, Nothing?>? = definedExternally /* null */): JQuery<TElement> /* this */
    fun click(handler: JQuery.EventHandlerBase<Any, JQuery.Event<TElement, Nothing?>>? = definedExternally /* null */): JQuery<TElement> /* this */
    fun click(handler: Nothing? = definedExternally /* null */): JQuery<TElement> /* this */
    fun clone(withDataAndEvents: Boolean? = definedExternally /* null */, deepWithDataAndEvents: Boolean? = definedExternally /* null */): JQuery<TElement> /* this */
    fun closest(selector: String, context: Element): JQuery<TElement> /* this */
    fun closest(selector: String): JQuery<TElement> /* this */
    fun closest(selector: Element): JQuery<TElement> /* this */
    fun closest(selector: JQuery<HTMLElement>): JQuery<TElement> /* this */
    fun contents(): JQuery<dynamic /* TElement | Text | Comment */>
    fun <TData> contextmenu(eventData: TData, handler: JQuery.EventHandler<TElement, TData>): JQuery<TElement> /* this */
    fun <TData> contextmenu(eventData: TData, handler: JQuery.EventHandlerBase<Any, JQuery.Event<TElement, TData>>): JQuery<TElement> /* this */
    fun contextmenu(handler: Boolean? = definedExternally /* null */): JQuery<TElement> /* this */
    fun contextmenu(handler: JQuery.EventHandler<TElement, Nothing?>? = definedExternally /* null */): JQuery<TElement> /* this */
    fun contextmenu(handler: JQuery.EventHandlerBase<Any, JQuery.Event<TElement, Nothing?>>? = definedExternally /* null */): JQuery<TElement> /* this */
    fun contextmenu(handler: Nothing? = definedExternally /* null */): JQuery<TElement> /* this */
    fun css(propertyName: String, value: String): JQuery<TElement> /* this */
    fun css(propertyName: String, value: Number): JQuery<TElement> /* this */
    fun css(propertyName: String, value: (`this`: TElement, index: Number, value: String) -> dynamic /* String | Number | Unit | Nothing? */): JQuery<TElement> /* this */
    fun css(properties: JQuery.PlainObject<dynamic /* String | Number | (`this`: TElement, index: Number, value: String) -> dynamic /* String | Number | Unit | Nothing? */ */>): JQuery<TElement> /* this */
    fun css(propertyName: String): String
    fun css(propertyNames: Array<String>): JQuery.PlainObject<String>
    fun data(key: String, undefined: Nothing?): Any
    fun data(key: String, value: Any): JQuery<TElement> /* this */
    fun data(obj: JQuery.PlainObject<Any>): JQuery<TElement> /* this */
    fun data(key: String): Any
    fun data(): JQuery.PlainObject<Any>
    fun <TData> dblclick(eventData: TData, handler: JQuery.EventHandler<TElement, TData>): JQuery<TElement> /* this */
    fun <TData> dblclick(eventData: TData, handler: JQuery.EventHandlerBase<Any, JQuery.Event<TElement, TData>>): JQuery<TElement> /* this */
    fun dblclick(handler: Boolean? = definedExternally /* null */): JQuery<TElement> /* this */
    fun dblclick(handler: JQuery.EventHandler<TElement, Nothing?>? = definedExternally /* null */): JQuery<TElement> /* this */
    fun dblclick(handler: JQuery.EventHandlerBase<Any, JQuery.Event<TElement, Nothing?>>? = definedExternally /* null */): JQuery<TElement> /* this */
    fun dblclick(handler: Nothing? = definedExternally /* null */): JQuery<TElement> /* this */
    fun delay(duration: Number, queueName: String? = definedExternally /* null */): JQuery<TElement> /* this */
    fun delay(duration: String /* "fast" */, queueName: String? = definedExternally /* null */): JQuery<TElement> /* this */
    fun delay(duration: String /* "slow" */, queueName: String? = definedExternally /* null */): JQuery<TElement> /* this */
    fun <TData> delegate(selector: String, eventType: String, eventData: TData, handler: JQuery.EventHandler<TElement, TData>): JQuery<TElement> /* this */
    fun <TData> delegate(selector: String, eventType: String, eventData: TData, handler: JQuery.EventHandlerBase<Any, JQuery.Event<TElement, TData>>): JQuery<TElement> /* this */
    fun delegate(selector: String, eventType: String, handler: Boolean): JQuery<TElement> /* this */
    fun delegate(selector: String, eventType: String, handler: JQuery.EventHandler<TElement, Nothing?>): JQuery<TElement> /* this */
    fun delegate(selector: String, eventType: String, handler: JQuery.EventHandlerBase<Any, JQuery.Event<TElement, Nothing?>>): JQuery<TElement> /* this */
    fun delegate(selector: String, eventType: String, handler: Nothing?): JQuery<TElement> /* this */
    fun delegate(selector: String, events: JQuery.PlainObject<dynamic /* Boolean | JQuery.EventHandler<TElement, Nothing?> | JQuery.EventHandlerBase<Any, JQuery.Event<TElement, Nothing?>> | Nothing? */>): JQuery<TElement> /* this */
    fun dequeue(queueName: String? = definedExternally /* null */): JQuery<TElement> /* this */
    fun detach(selector: String? = definedExternally /* null */): JQuery<TElement> /* this */
    fun each(fn: (`this`: TElement, index: Number, element: TElement) -> dynamic /* Boolean | Unit */): JQuery<TElement> /* this */
    fun empty(): JQuery<TElement> /* this */
    fun end(): JQuery<TElement> /* this */
    fun eq(index: Number): JQuery<TElement> /* this */
    fun extend(obj: Any): JQuery<TElement> /* this */
    fun fadeIn(duration: Number, easing: String, complete: ((`this`: TElement) -> Unit)? = definedExternally /* null */): JQuery<TElement> /* this */
    fun fadeIn(duration: String /* "fast" */, easing: String, complete: ((`this`: TElement) -> Unit)? = definedExternally /* null */): JQuery<TElement> /* this */
    fun fadeIn(duration: String /* "slow" */, easing: String, complete: ((`this`: TElement) -> Unit)? = definedExternally /* null */): JQuery<TElement> /* this */
    fun fadeIn(duration_easing: String, complete: (`this`: TElement) -> Unit): JQuery<TElement> /* this */
    fun fadeIn(duration_easing: Number, complete: (`this`: TElement) -> Unit): JQuery<TElement> /* this */
    fun fadeIn(duration_easing_complete_options: String? = definedExternally /* null */): JQuery<TElement> /* this */
    fun fadeIn(duration_easing_complete_options: Number? = definedExternally /* null */): JQuery<TElement> /* this */
    fun fadeIn(duration_easing_complete_options: JQuery.EffectsOptions<TElement>? = definedExternally /* null */): JQuery<TElement> /* this */
    fun fadeIn(duration_easing_complete_options: ((`this`: TElement) -> Unit)? = definedExternally /* null */): JQuery<TElement> /* this */
    fun fadeOut(duration: Number, easing: String, complete: ((`this`: TElement) -> Unit)? = definedExternally /* null */): JQuery<TElement> /* this */
    fun fadeOut(duration: String /* "fast" */, easing: String, complete: ((`this`: TElement) -> Unit)? = definedExternally /* null */): JQuery<TElement> /* this */
    fun fadeOut(duration: String /* "slow" */, easing: String, complete: ((`this`: TElement) -> Unit)? = definedExternally /* null */): JQuery<TElement> /* this */
    fun fadeOut(duration_easing: String, complete: (`this`: TElement) -> Unit): JQuery<TElement> /* this */
    fun fadeOut(duration_easing: Number, complete: (`this`: TElement) -> Unit): JQuery<TElement> /* this */
    fun fadeOut(duration_easing_complete_options: String? = definedExternally /* null */): JQuery<TElement> /* this */
    fun fadeOut(duration_easing_complete_options: Number? = definedExternally /* null */): JQuery<TElement> /* this */
    fun fadeOut(duration_easing_complete_options: JQuery.EffectsOptions<TElement>? = definedExternally /* null */): JQuery<TElement> /* this */
    fun fadeOut(duration_easing_complete_options: ((`this`: TElement) -> Unit)? = definedExternally /* null */): JQuery<TElement> /* this */
    fun fadeTo(duration: Number, opacity: Number, easing: String, complete: ((`this`: TElement) -> Unit)? = definedExternally /* null */): JQuery<TElement> /* this */
    fun fadeTo(duration: String /* "fast" */, opacity: Number, easing: String, complete: ((`this`: TElement) -> Unit)? = definedExternally /* null */): JQuery<TElement> /* this */
    fun fadeTo(duration: String /* "slow" */, opacity: Number, easing: String, complete: ((`this`: TElement) -> Unit)? = definedExternally /* null */): JQuery<TElement> /* this */
    fun fadeTo(duration: Number, opacity: Number, complete: ((`this`: TElement) -> Unit)? = definedExternally /* null */): JQuery<TElement> /* this */
    fun fadeTo(duration: String /* "fast" */, opacity: Number, complete: ((`this`: TElement) -> Unit)? = definedExternally /* null */): JQuery<TElement> /* this */
    fun fadeTo(duration: String /* "slow" */, opacity: Number, complete: ((`this`: TElement) -> Unit)? = definedExternally /* null */): JQuery<TElement> /* this */
    fun fadeToggle(duration: Number, easing: String, complete: ((`this`: TElement) -> Unit)? = definedExternally /* null */): JQuery<TElement> /* this */
    fun fadeToggle(duration: String /* "fast" */, easing: String, complete: ((`this`: TElement) -> Unit)? = definedExternally /* null */): JQuery<TElement> /* this */
    fun fadeToggle(duration: String /* "slow" */, easing: String, complete: ((`this`: TElement) -> Unit)? = definedExternally /* null */): JQuery<TElement> /* this */
    fun fadeToggle(duration_easing: String, complete: (`this`: TElement) -> Unit): JQuery<TElement> /* this */
    fun fadeToggle(duration_easing: Number, complete: (`this`: TElement) -> Unit): JQuery<TElement> /* this */
    fun fadeToggle(duration_easing_complete_options: String? = definedExternally /* null */): JQuery<TElement> /* this */
    fun fadeToggle(duration_easing_complete_options: Number? = definedExternally /* null */): JQuery<TElement> /* this */
    fun fadeToggle(duration_easing_complete_options: JQuery.EffectsOptions<TElement>? = definedExternally /* null */): JQuery<TElement> /* this */
    fun fadeToggle(duration_easing_complete_options: ((`this`: TElement) -> Unit)? = definedExternally /* null */): JQuery<TElement> /* this */
    fun filter(selector: String): JQuery<TElement> /* this */
    fun filter(selector: Element): JQuery<TElement> /* this */
    fun filter(selector: JQuery<HTMLElement>): JQuery<TElement> /* this */
    fun filter(selector: Array<Element>): JQuery<TElement> /* this */
    fun filter(selector: (`this`: TElement, index: Number, element: TElement) -> Boolean): JQuery<TElement> /* this */
    fun find(selector: String): JQuery<TElement> /* this */
    fun find(selector: Element): JQuery<TElement> /* this */
    fun find(selector: JQuery<HTMLElement>): JQuery<TElement> /* this */
    fun finish(queue: String? = definedExternally /* null */): JQuery<TElement> /* this */
    fun first(): JQuery<TElement> /* this */
    fun <TData> focus(eventData: TData, handler: JQuery.EventHandler<TElement, TData>): JQuery<TElement> /* this */
    fun <TData> focus(eventData: TData, handler: JQuery.EventHandlerBase<Any, JQuery.Event<TElement, TData>>): JQuery<TElement> /* this */
    fun focus(handler: Boolean? = definedExternally /* null */): JQuery<TElement> /* this */
    fun focus(handler: JQuery.EventHandler<TElement, Nothing?>? = definedExternally /* null */): JQuery<TElement> /* this */
    fun focus(handler: JQuery.EventHandlerBase<Any, JQuery.Event<TElement, Nothing?>>? = definedExternally /* null */): JQuery<TElement> /* this */
    fun focus(handler: Nothing? = definedExternally /* null */): JQuery<TElement> /* this */
    fun <TData> focusin(eventData: TData, handler: JQuery.EventHandler<TElement, TData>): JQuery<TElement> /* this */
    fun <TData> focusin(eventData: TData, handler: JQuery.EventHandlerBase<Any, JQuery.Event<TElement, TData>>): JQuery<TElement> /* this */
    fun focusin(handler: Boolean? = definedExternally /* null */): JQuery<TElement> /* this */
    fun focusin(handler: JQuery.EventHandler<TElement, Nothing?>? = definedExternally /* null */): JQuery<TElement> /* this */
    fun focusin(handler: JQuery.EventHandlerBase<Any, JQuery.Event<TElement, Nothing?>>? = definedExternally /* null */): JQuery<TElement> /* this */
    fun focusin(handler: Nothing? = definedExternally /* null */): JQuery<TElement> /* this */
    fun <TData> focusout(eventData: TData, handler: JQuery.EventHandler<TElement, TData>): JQuery<TElement> /* this */
    fun <TData> focusout(eventData: TData, handler: JQuery.EventHandlerBase<Any, JQuery.Event<TElement, TData>>): JQuery<TElement> /* this */
    fun focusout(handler: Boolean? = definedExternally /* null */): JQuery<TElement> /* this */
    fun focusout(handler: JQuery.EventHandler<TElement, Nothing?>? = definedExternally /* null */): JQuery<TElement> /* this */
    fun focusout(handler: JQuery.EventHandlerBase<Any, JQuery.Event<TElement, Nothing?>>? = definedExternally /* null */): JQuery<TElement> /* this */
    fun focusout(handler: Nothing? = definedExternally /* null */): JQuery<TElement> /* this */
    fun get(index: Number): TElement
    fun get(): Array<TElement>
    fun has(selector: String): JQuery<TElement> /* this */
    fun has(selector: Element): JQuery<TElement> /* this */
    fun hasClass(className: String): Boolean
    fun height(value: String): JQuery<TElement> /* this */
    fun height(value: Number): JQuery<TElement> /* this */
    fun height(value: (`this`: TElement, index: Number, height: Number) -> dynamic /* String | Number */): JQuery<TElement> /* this */
    fun height(): Number?
    fun hide(duration: Number, easing: String, complete: (`this`: TElement) -> Unit): JQuery<TElement> /* this */
    fun hide(duration: String /* "fast" */, easing: String, complete: (`this`: TElement) -> Unit): JQuery<TElement> /* this */
    fun hide(duration: String /* "slow" */, easing: String, complete: (`this`: TElement) -> Unit): JQuery<TElement> /* this */
    fun hide(duration: Number, easing_complete: String): JQuery<TElement> /* this */
    fun hide(duration: Number, easing_complete: (`this`: TElement) -> Unit): JQuery<TElement> /* this */
    fun hide(duration: String /* "fast" */, easing_complete: String): JQuery<TElement> /* this */
    fun hide(duration: String /* "fast" */, easing_complete: (`this`: TElement) -> Unit): JQuery<TElement> /* this */
    fun hide(duration: String /* "slow" */, easing_complete: String): JQuery<TElement> /* this */
    fun hide(duration: String /* "slow" */, easing_complete: (`this`: TElement) -> Unit): JQuery<TElement> /* this */
    fun hide(duration_complete_options: Number? = definedExternally /* null */): JQuery<TElement> /* this */
    fun hide(duration_complete_options: String? /* "fast" */ = definedExternally /* null */): JQuery<TElement> /* this */
    fun hide(duration_complete_options: String? /* "slow" */ = definedExternally /* null */): JQuery<TElement> /* this */
    fun hide(duration_complete_options: JQuery.EffectsOptions<TElement>? = definedExternally /* null */): JQuery<TElement> /* this */
    fun hide(duration_complete_options: ((`this`: TElement) -> Unit)? = definedExternally /* null */): JQuery<TElement> /* this */
    fun <T> hover(handlerInOut: Boolean, handlerOut: dynamic /* Boolean? | JQuery.EventHandler<TElement, Nothing?>? | JQuery.EventHandlerBase<Any, JQuery.Event<TElement, Nothing?>>? | Nothing? */ = definedExternally /* null */): JQuery<TElement> /* this */
    fun <T> hover(handlerInOut: JQuery.EventHandler<TElement, Nothing?>, handlerOut: dynamic /* Boolean? | JQuery.EventHandler<TElement, Nothing?>? | JQuery.EventHandlerBase<Any, JQuery.Event<TElement, Nothing?>>? | Nothing? */ = definedExternally /* null */): JQuery<TElement> /* this */
    fun <T> hover(handlerInOut: JQuery.EventHandlerBase<Any, JQuery.Event<TElement, Nothing?>>, handlerOut: dynamic /* Boolean? | JQuery.EventHandler<TElement, Nothing?>? | JQuery.EventHandlerBase<Any, JQuery.Event<TElement, Nothing?>>? | Nothing? */ = definedExternally /* null */): JQuery<TElement> /* this */
    fun <T> hover(handlerInOut: Nothing?, handlerOut: dynamic /* Boolean? | JQuery.EventHandler<TElement, Nothing?>? | JQuery.EventHandlerBase<Any, JQuery.Event<TElement, Nothing?>>? | Nothing? */ = definedExternally /* null */): JQuery<TElement> /* this */
    fun html(htmlString: String): JQuery<TElement> /* this */
    fun html(htmlString: (`this`: TElement, index: Number, oldhtml: String) -> String): JQuery<TElement> /* this */
    fun html(): String
    fun index(element: String? = definedExternally /* null */): Number
    fun index(element: Element? = definedExternally /* null */): Number
    fun index(element: JQuery<HTMLElement>? = definedExternally /* null */): Number
    fun innerHeight(value: String): JQuery<TElement> /* this */
    fun innerHeight(value: Number): JQuery<TElement> /* this */
    fun innerHeight(value: (`this`: TElement, index: Number, height: Number) -> dynamic /* String | Number */): JQuery<TElement> /* this */
    fun innerHeight(): Number?
    fun innerWidth(value: String): JQuery<TElement> /* this */
    fun innerWidth(value: Number): JQuery<TElement> /* this */
    fun innerWidth(value: (`this`: TElement, index: Number, width: Number) -> dynamic /* String | Number */): JQuery<TElement> /* this */
    fun innerWidth(): Number?
    fun insertAfter(target: String): JQuery<TElement> /* this */
    fun insertAfter(target: Element): JQuery<TElement> /* this */
    fun insertAfter(target: JQuery<HTMLElement>): JQuery<TElement> /* this */
    fun insertAfter(target: Array<Element>): JQuery<TElement> /* this */
    fun insertBefore(target: String): JQuery<TElement> /* this */
    fun insertBefore(target: Element): JQuery<TElement> /* this */
    fun insertBefore(target: JQuery<HTMLElement>): JQuery<TElement> /* this */
    fun insertBefore(target: Array<Element>): JQuery<TElement> /* this */
    fun `is`(selector: String): Boolean
    fun `is`(selector: Element): Boolean
    fun `is`(selector: JQuery<HTMLElement>): Boolean
    fun `is`(selector: Array<Element>): Boolean
    fun `is`(selector: (`this`: TElement, index: Number, element: TElement) -> Boolean): Boolean
    fun <TData> keydown(eventData: TData, handler: JQuery.EventHandler<TElement, TData>): JQuery<TElement> /* this */
    fun <TData> keydown(eventData: TData, handler: JQuery.EventHandlerBase<Any, JQuery.Event<TElement, TData>>): JQuery<TElement> /* this */
    fun keydown(handler: Boolean? = definedExternally /* null */): JQuery<TElement> /* this */
    fun keydown(handler: JQuery.EventHandler<TElement, Nothing?>? = definedExternally /* null */): JQuery<TElement> /* this */
    fun keydown(handler: JQuery.EventHandlerBase<Any, JQuery.Event<TElement, Nothing?>>? = definedExternally /* null */): JQuery<TElement> /* this */
    fun keydown(handler: Nothing? = definedExternally /* null */): JQuery<TElement> /* this */
    fun <TData> keypress(eventData: TData, handler: JQuery.EventHandler<TElement, TData>): JQuery<TElement> /* this */
    fun <TData> keypress(eventData: TData, handler: JQuery.EventHandlerBase<Any, JQuery.Event<TElement, TData>>): JQuery<TElement> /* this */
    fun keypress(handler: Boolean? = definedExternally /* null */): JQuery<TElement> /* this */
    fun keypress(handler: JQuery.EventHandler<TElement, Nothing?>? = definedExternally /* null */): JQuery<TElement> /* this */
    fun keypress(handler: JQuery.EventHandlerBase<Any, JQuery.Event<TElement, Nothing?>>? = definedExternally /* null */): JQuery<TElement> /* this */
    fun keypress(handler: Nothing? = definedExternally /* null */): JQuery<TElement> /* this */
    fun <TData> keyup(eventData: TData, handler: JQuery.EventHandler<TElement, TData>): JQuery<TElement> /* this */
    fun <TData> keyup(eventData: TData, handler: JQuery.EventHandlerBase<Any, JQuery.Event<TElement, TData>>): JQuery<TElement> /* this */
    fun keyup(handler: Boolean? = definedExternally /* null */): JQuery<TElement> /* this */
    fun keyup(handler: JQuery.EventHandler<TElement, Nothing?>? = definedExternally /* null */): JQuery<TElement> /* this */
    fun keyup(handler: JQuery.EventHandlerBase<Any, JQuery.Event<TElement, Nothing?>>? = definedExternally /* null */): JQuery<TElement> /* this */
    fun keyup(handler: Nothing? = definedExternally /* null */): JQuery<TElement> /* this */
    fun last(): JQuery<TElement> /* this */
    fun load(url: String, data: String, complete: (`this`: TElement, responseText: String, textStatus: dynamic /* String /* "error" */ | String /* "success" */ | String /* "notmodified" */ | String /* "nocontent" */ | String /* "timeout" */ | String /* "abort" */ | String /* "parsererror" */ */, jqXHR: JQuery.jqXHR<Any>) -> Unit): JQuery<TElement> /* this */
    fun load(url: String, data: JQuery.PlainObject<Any>, complete: (`this`: TElement, responseText: String, textStatus: dynamic /* String /* "error" */ | String /* "success" */ | String /* "notmodified" */ | String /* "nocontent" */ | String /* "timeout" */ | String /* "abort" */ | String /* "parsererror" */ */, jqXHR: JQuery.jqXHR<Any>) -> Unit): JQuery<TElement> /* this */
    fun load(url: String, complete_data: String? = definedExternally /* null */): JQuery<TElement> /* this */
    fun load(url: String, complete_data: JQuery.PlainObject<Any>? = definedExternally /* null */): JQuery<TElement> /* this */
    fun load(url: String, complete_data: ((`this`: TElement, responseText: String, textStatus: dynamic /* String /* "error" */ | String /* "success" */ | String /* "notmodified" */ | String /* "nocontent" */ | String /* "timeout" */ | String /* "abort" */ | String /* "parsererror" */ */, jqXHR: JQuery.jqXHR<Any>) -> Unit)? = definedExternally /* null */): JQuery<TElement> /* this */
    fun map(callback: (`this`: TElement, index: Number, domElement: TElement) -> dynamic /* Any | Array<Any> | Nothing? */): JQuery<TElement> /* this */
    fun <TData> mousedown(eventData: TData, handler: JQuery.EventHandler<TElement, TData>): JQuery<TElement> /* this */
    fun <TData> mousedown(eventData: TData, handler: JQuery.EventHandlerBase<Any, JQuery.Event<TElement, TData>>): JQuery<TElement> /* this */
    fun mousedown(handler: Boolean? = definedExternally /* null */): JQuery<TElement> /* this */
    fun mousedown(handler: JQuery.EventHandler<TElement, Nothing?>? = definedExternally /* null */): JQuery<TElement> /* this */
    fun mousedown(handler: JQuery.EventHandlerBase<Any, JQuery.Event<TElement, Nothing?>>? = definedExternally /* null */): JQuery<TElement> /* this */
    fun mousedown(handler: Nothing? = definedExternally /* null */): JQuery<TElement> /* this */
    fun <TData> mouseenter(eventData: TData, handler: JQuery.EventHandler<TElement, TData>): JQuery<TElement> /* this */
    fun <TData> mouseenter(eventData: TData, handler: JQuery.EventHandlerBase<Any, JQuery.Event<TElement, TData>>): JQuery<TElement> /* this */
    fun mouseenter(handler: Boolean? = definedExternally /* null */): JQuery<TElement> /* this */
    fun mouseenter(handler: JQuery.EventHandler<TElement, Nothing?>? = definedExternally /* null */): JQuery<TElement> /* this */
    fun mouseenter(handler: JQuery.EventHandlerBase<Any, JQuery.Event<TElement, Nothing?>>? = definedExternally /* null */): JQuery<TElement> /* this */
    fun mouseenter(handler: Nothing? = definedExternally /* null */): JQuery<TElement> /* this */
    fun <TData> mouseleave(eventData: TData, handler: JQuery.EventHandler<TElement, TData>): JQuery<TElement> /* this */
    fun <TData> mouseleave(eventData: TData, handler: JQuery.EventHandlerBase<Any, JQuery.Event<TElement, TData>>): JQuery<TElement> /* this */
    fun mouseleave(handler: Boolean? = definedExternally /* null */): JQuery<TElement> /* this */
    fun mouseleave(handler: JQuery.EventHandler<TElement, Nothing?>? = definedExternally /* null */): JQuery<TElement> /* this */
    fun mouseleave(handler: JQuery.EventHandlerBase<Any, JQuery.Event<TElement, Nothing?>>? = definedExternally /* null */): JQuery<TElement> /* this */
    fun mouseleave(handler: Nothing? = definedExternally /* null */): JQuery<TElement> /* this */
    fun <TData> mousemove(eventData: TData, handler: JQuery.EventHandler<TElement, TData>): JQuery<TElement> /* this */
    fun <TData> mousemove(eventData: TData, handler: JQuery.EventHandlerBase<Any, JQuery.Event<TElement, TData>>): JQuery<TElement> /* this */
    fun mousemove(handler: Boolean? = definedExternally /* null */): JQuery<TElement> /* this */
    fun mousemove(handler: JQuery.EventHandler<TElement, Nothing?>? = definedExternally /* null */): JQuery<TElement> /* this */
    fun mousemove(handler: JQuery.EventHandlerBase<Any, JQuery.Event<TElement, Nothing?>>? = definedExternally /* null */): JQuery<TElement> /* this */
    fun mousemove(handler: Nothing? = definedExternally /* null */): JQuery<TElement> /* this */
    fun <TData> mouseout(eventData: TData, handler: JQuery.EventHandler<TElement, TData>): JQuery<TElement> /* this */
    fun <TData> mouseout(eventData: TData, handler: JQuery.EventHandlerBase<Any, JQuery.Event<TElement, TData>>): JQuery<TElement> /* this */
    fun mouseout(handler: Boolean? = definedExternally /* null */): JQuery<TElement> /* this */
    fun mouseout(handler: JQuery.EventHandler<TElement, Nothing?>? = definedExternally /* null */): JQuery<TElement> /* this */
    fun mouseout(handler: JQuery.EventHandlerBase<Any, JQuery.Event<TElement, Nothing?>>? = definedExternally /* null */): JQuery<TElement> /* this */
    fun mouseout(handler: Nothing? = definedExternally /* null */): JQuery<TElement> /* this */
    fun <TData> mouseover(eventData: TData, handler: JQuery.EventHandler<TElement, TData>): JQuery<TElement> /* this */
    fun <TData> mouseover(eventData: TData, handler: JQuery.EventHandlerBase<Any, JQuery.Event<TElement, TData>>): JQuery<TElement> /* this */
    fun mouseover(handler: Boolean? = definedExternally /* null */): JQuery<TElement> /* this */
    fun mouseover(handler: JQuery.EventHandler<TElement, Nothing?>? = definedExternally /* null */): JQuery<TElement> /* this */
    fun mouseover(handler: JQuery.EventHandlerBase<Any, JQuery.Event<TElement, Nothing?>>? = definedExternally /* null */): JQuery<TElement> /* this */
    fun mouseover(handler: Nothing? = definedExternally /* null */): JQuery<TElement> /* this */
    fun <TData> mouseup(eventData: TData, handler: JQuery.EventHandler<TElement, TData>): JQuery<TElement> /* this */
    fun <TData> mouseup(eventData: TData, handler: JQuery.EventHandlerBase<Any, JQuery.Event<TElement, TData>>): JQuery<TElement> /* this */
    fun mouseup(handler: Boolean? = definedExternally /* null */): JQuery<TElement> /* this */
    fun mouseup(handler: JQuery.EventHandler<TElement, Nothing?>? = definedExternally /* null */): JQuery<TElement> /* this */
    fun mouseup(handler: JQuery.EventHandlerBase<Any, JQuery.Event<TElement, Nothing?>>? = definedExternally /* null */): JQuery<TElement> /* this */
    fun mouseup(handler: Nothing? = definedExternally /* null */): JQuery<TElement> /* this */
    fun next(selector: String? = definedExternally /* null */): JQuery<TElement> /* this */
    fun nextAll(selector: String? = definedExternally /* null */): JQuery<TElement> /* this */
    fun nextUntil(selector: String? = definedExternally /* null */, filter: String? = definedExternally /* null */): JQuery<TElement> /* this */
    fun nextUntil(selector: Element? = definedExternally /* null */, filter: String? = definedExternally /* null */): JQuery<TElement> /* this */
    fun nextUntil(selector: JQuery<HTMLElement>? = definedExternally /* null */, filter: String? = definedExternally /* null */): JQuery<TElement> /* this */
    fun not(selector: String): JQuery<TElement> /* this */
    fun not(selector: Element): JQuery<TElement> /* this */
    fun not(selector: JQuery<HTMLElement>): JQuery<TElement> /* this */
    fun not(selector: Array<Element>): JQuery<TElement> /* this */
    fun not(selector: (`this`: TElement, index: Number, element: TElement) -> Boolean): JQuery<TElement> /* this */
    fun off(events: String, selector: String, handler: Boolean): JQuery<TElement> /* this */
    fun off(events: String, selector: String, handler: JQuery.EventHandlerBase<Any, JQuery.Event<TElement, Any>>): JQuery<TElement> /* this */
    fun off(events: String, selector_handler: String? = definedExternally /* null */): JQuery<TElement> /* this */
    fun off(events: String, selector_handler: Boolean? = definedExternally /* null */): JQuery<TElement> /* this */
    fun off(events: String, selector_handler: JQuery.EventHandlerBase<Any, JQuery.Event<TElement, Any>>? = definedExternally /* null */): JQuery<TElement> /* this */
    fun off(events: JQuery.PlainObject<dynamic /* Boolean | JQuery.EventHandlerBase<Any, JQuery.Event<TElement, Any>> */>, selector: String? = definedExternally /* null */): JQuery<TElement> /* this */
    fun off(event: JQuery.Event<TElement, Nothing?>? = definedExternally /* null */): JQuery<TElement> /* this */
    fun offset(coordinates: JQuery.Coordinates): JQuery<TElement> /* this */
    fun offset(coordinates: (`this`: TElement, index: Number, coords: JQuery.Coordinates) -> JQuery.Coordinates): JQuery<TElement> /* this */
    fun offset(): JQuery.Coordinates?
    fun offsetParent(): JQuery<TElement> /* this */
    fun <TData> on(events: String, selector: String?, data: TData, handler: JQuery.EventHandler<TElement, TData>): JQuery<TElement> /* this */
    fun <TData> on(events: String, selector: String?, data: TData, handler: JQuery.EventHandlerBase<Any, JQuery.Event<TElement, TData>>): JQuery<TElement> /* this */
    fun on(events: String, selector: String, handler: Boolean): JQuery<TElement> /* this */
    fun on(events: String, selector: String, handler: JQuery.EventHandler<TElement, Nothing?>): JQuery<TElement> /* this */
    fun on(events: String, selector: String, handler: JQuery.EventHandlerBase<Any, JQuery.Event<TElement, Nothing?>>): JQuery<TElement> /* this */
    fun on(events: String, selector: String, handler: Nothing?): JQuery<TElement> /* this */
    fun <TData> on(events: String, data: TData, handler: JQuery.EventHandler<TElement, TData>): JQuery<TElement> /* this */
    fun <TData> on(events: String, data: TData, handler: JQuery.EventHandlerBase<Any, JQuery.Event<TElement, TData>>): JQuery<TElement> /* this */
    fun on(events: String, handler: Boolean): JQuery<TElement> /* this */
    fun on(events: String, handler: JQuery.EventHandler<TElement, Nothing?>): JQuery<TElement> /* this */
    fun on(events: String, handler: JQuery.EventHandlerBase<Any, JQuery.Event<TElement, Nothing?>>): JQuery<TElement> /* this */
    fun on(events: String, handler: Nothing?): JQuery<TElement> /* this */
    fun <TData> on(events: JQuery.PlainObject<dynamic /* Boolean | JQuery.EventHandler<TElement, TData> | JQuery.EventHandlerBase<Any, JQuery.Event<TElement, TData>> */>, selector: String?, data: TData): JQuery<TElement> /* this */
    fun on(events: JQuery.PlainObject<dynamic /* Boolean | JQuery.EventHandler<TElement, Nothing?> | JQuery.EventHandlerBase<Any, JQuery.Event<TElement, Nothing?>> | Nothing? */>, selector: String): JQuery<TElement> /* this */
    fun <TData> on(events: JQuery.PlainObject<dynamic /* Boolean | JQuery.EventHandler<TElement, TData> | JQuery.EventHandlerBase<Any, JQuery.Event<TElement, TData>> */>, data: TData): JQuery<TElement> /* this */
    fun on(events: JQuery.PlainObject<dynamic /* Boolean | JQuery.EventHandler<TElement, Nothing?> | JQuery.EventHandlerBase<Any, JQuery.Event<TElement, Nothing?>> | Nothing? */>): JQuery<TElement> /* this */
    fun <TData> one(events: String, selector: String?, data: TData, handler: JQuery.EventHandler<TElement, TData>): JQuery<TElement> /* this */
    fun <TData> one(events: String, selector: String?, data: TData, handler: JQuery.EventHandlerBase<Any, JQuery.Event<TElement, TData>>): JQuery<TElement> /* this */
    fun one(events: String, selector: String, handler: Boolean): JQuery<TElement> /* this */
    fun one(events: String, selector: String, handler: JQuery.EventHandler<TElement, Nothing?>): JQuery<TElement> /* this */
    fun one(events: String, selector: String, handler: JQuery.EventHandlerBase<Any, JQuery.Event<TElement, Nothing?>>): JQuery<TElement> /* this */
    fun one(events: String, selector: String, handler: Nothing?): JQuery<TElement> /* this */
    fun <TData> one(events: String, data: TData, handler: JQuery.EventHandler<TElement, TData>): JQuery<TElement> /* this */
    fun <TData> one(events: String, data: TData, handler: JQuery.EventHandlerBase<Any, JQuery.Event<TElement, TData>>): JQuery<TElement> /* this */
    fun one(events: String, handler: Boolean): JQuery<TElement> /* this */
    fun one(events: String, handler: JQuery.EventHandler<TElement, Nothing?>): JQuery<TElement> /* this */
    fun one(events: String, handler: JQuery.EventHandlerBase<Any, JQuery.Event<TElement, Nothing?>>): JQuery<TElement> /* this */
    fun one(events: String, handler: Nothing?): JQuery<TElement> /* this */
    fun <TData> one(events: JQuery.PlainObject<dynamic /* Boolean | JQuery.EventHandler<TElement, TData> | JQuery.EventHandlerBase<Any, JQuery.Event<TElement, TData>> */>, selector: String?, data: TData): JQuery<TElement> /* this */
    fun one(events: JQuery.PlainObject<dynamic /* Boolean | JQuery.EventHandler<TElement, Nothing?> | JQuery.EventHandlerBase<Any, JQuery.Event<TElement, Nothing?>> | Nothing? */>, selector: String): JQuery<TElement> /* this */
    fun <TData> one(events: JQuery.PlainObject<dynamic /* Boolean | JQuery.EventHandler<TElement, TData> | JQuery.EventHandlerBase<Any, JQuery.Event<TElement, TData>> */>, data: TData): JQuery<TElement> /* this */
    fun one(events: JQuery.PlainObject<dynamic /* Boolean | JQuery.EventHandler<TElement, Nothing?> | JQuery.EventHandlerBase<Any, JQuery.Event<TElement, Nothing?>> | Nothing? */>): JQuery<TElement> /* this */
    fun outerHeight(value: String): JQuery<TElement> /* this */
    fun outerHeight(value: Number): JQuery<TElement> /* this */
    fun outerHeight(value: (`this`: TElement, index: Number, height: Number) -> dynamic /* String | Number */): JQuery<TElement> /* this */
    fun outerHeight(includeMargin: Boolean? = definedExternally /* null */): Number?
    fun outerWidth(value: String): JQuery<TElement> /* this */
    fun outerWidth(value: Number): JQuery<TElement> /* this */
    fun outerWidth(value: (`this`: TElement, index: Number, width: Number) -> dynamic /* String | Number */): JQuery<TElement> /* this */
    fun outerWidth(includeMargin: Boolean? = definedExternally /* null */): Number?
    fun parent(selector: String? = definedExternally /* null */): JQuery<TElement> /* this */
    fun parents(selector: String? = definedExternally /* null */): JQuery<TElement> /* this */
    fun parentsUntil(selector: String? = definedExternally /* null */, filter: String? = definedExternally /* null */): JQuery<TElement> /* this */
    fun parentsUntil(selector: Element? = definedExternally /* null */, filter: String? = definedExternally /* null */): JQuery<TElement> /* this */
    fun parentsUntil(selector: JQuery<HTMLElement>? = definedExternally /* null */, filter: String? = definedExternally /* null */): JQuery<TElement> /* this */
    fun position(): JQuery.Coordinates
    fun prepend(vararg contents: String): JQuery<TElement> /* this */
    fun prepend(vararg contents: Element): JQuery<TElement> /* this */
    fun prepend(vararg contents: Text): JQuery<TElement> /* this */
    fun prepend(vararg contents: Comment): JQuery<TElement> /* this */
    fun prepend(vararg contents: JQuery<dynamic /* Element | Text | Comment */>): JQuery<TElement> /* this */
    fun prepend(vararg contents: Array<dynamic /* Element | Text | Comment | JQuery<dynamic /* Element | Text | Comment */> */>): JQuery<TElement> /* this */
    fun prepend(fn: (`this`: TElement, index: Number, html: String) -> dynamic /* String | Element | Text | Comment | JQuery<dynamic /* Element | Text | Comment */> | Array<dynamic /* Element | Text | Comment | JQuery<dynamic /* Element | Text | Comment */> */> */): JQuery<TElement> /* this */
    fun prependTo(target: String): JQuery<TElement> /* this */
    fun prependTo(target: Element): JQuery<TElement> /* this */
    fun prependTo(target: JQuery<HTMLElement>): JQuery<TElement> /* this */
    fun prependTo(target: Array<Element>): JQuery<TElement> /* this */
    fun prev(selector: String? = definedExternally /* null */): JQuery<TElement> /* this */
    fun prevAll(selector: String? = definedExternally /* null */): JQuery<TElement> /* this */
    fun prevUntil(selector: String? = definedExternally /* null */, filter: String? = definedExternally /* null */): JQuery<TElement> /* this */
    fun prevUntil(selector: Element? = definedExternally /* null */, filter: String? = definedExternally /* null */): JQuery<TElement> /* this */
    fun prevUntil(selector: JQuery<HTMLElement>? = definedExternally /* null */, filter: String? = definedExternally /* null */): JQuery<TElement> /* this */
    fun <T : Any> promise(type: String, target: T): T /* T & JQuery.Promise<Any, Any> */
    fun <T : Any> promise(target: T): T /* T & JQuery.Promise<Any, Any> */
    fun promise(type: String? = definedExternally /* null */): JQuery.Promise<JQuery<TElement> /* this */, Any>
    fun prop(propertyName: String, value: (`this`: TElement, index: Number, oldPropertyValue: Any) -> Any): JQuery<TElement> /* this */
    fun prop(propertyName: String, value: Any): JQuery<TElement> /* this */
    fun prop(properties: JQuery.PlainObject<Any>): JQuery<TElement> /* this */
    fun prop(propertyName: String): Any?
    fun pushStack(elements: ArrayLike<Element>, name: String, args: Array<Any>): JQuery<TElement> /* this */
    fun pushStack(elements: ArrayLike<Element>): JQuery<TElement> /* this */
    fun queue(queueName: String, newQueue: JQuery.QueueFunction<TElement>): JQuery<TElement> /* this */
    fun queue(queueName: String, newQueue: Array<JQuery.QueueFunction<TElement>>): JQuery<TElement> /* this */
    fun queue(newQueue: JQuery.QueueFunction<TElement>): JQuery<TElement> /* this */
    fun queue(newQueue: Array<JQuery.QueueFunction<TElement>>): JQuery<TElement> /* this */
    fun queue(queueName: String? = definedExternally /* null */): `T$1` /* `T$1` & Array<JQuery.QueueFunction<Node>> */
    fun ready(handler: (`$`: JQueryStatic<TElement>) -> Unit): JQuery<TElement> /* this */
    fun remove(selector: String? = definedExternally /* null */): JQuery<TElement> /* this */
    fun removeAttr(attributeName: String): JQuery<TElement> /* this */
    fun removeClass(className: String? = definedExternally /* null */): JQuery<TElement> /* this */
    fun removeClass(className: Array<String>? = definedExternally /* null */): JQuery<TElement> /* this */
    fun removeClass(className: ((`this`: TElement, index: Number, className: String) -> String)? = definedExternally /* null */): JQuery<TElement> /* this */
    fun removeData(name: String? = definedExternally /* null */): JQuery<TElement> /* this */
    fun removeData(name: Array<String>? = definedExternally /* null */): JQuery<TElement> /* this */
    fun removeProp(propertyName: String): JQuery<TElement> /* this */
    fun replaceAll(target: String): JQuery<TElement> /* this */
    fun replaceAll(target: Element): JQuery<TElement> /* this */
    fun replaceAll(target: JQuery<HTMLElement>): JQuery<TElement> /* this */
    fun replaceAll(target: Array<Element>): JQuery<TElement> /* this */
    fun replaceWith(newContent: String): JQuery<TElement> /* this */
    fun replaceWith(newContent: Element): JQuery<TElement> /* this */
    fun replaceWith(newContent: JQuery<HTMLElement>): JQuery<TElement> /* this */
    fun replaceWith(newContent: Array<Element>): JQuery<TElement> /* this */
    fun replaceWith(newContent: (`this`: TElement) -> Any): JQuery<TElement> /* this */
    fun <TData> resize(eventData: TData, handler: JQuery.EventHandler<TElement, TData>): JQuery<TElement> /* this */
    fun <TData> resize(eventData: TData, handler: JQuery.EventHandlerBase<Any, JQuery.Event<TElement, TData>>): JQuery<TElement> /* this */
    fun resize(handler: Boolean? = definedExternally /* null */): JQuery<TElement> /* this */
    fun resize(handler: JQuery.EventHandler<TElement, Nothing?>? = definedExternally /* null */): JQuery<TElement> /* this */
    fun resize(handler: JQuery.EventHandlerBase<Any, JQuery.Event<TElement, Nothing?>>? = definedExternally /* null */): JQuery<TElement> /* this */
    fun resize(handler: Nothing? = definedExternally /* null */): JQuery<TElement> /* this */
    fun <TData> scroll(eventData: TData, handler: JQuery.EventHandler<TElement, TData>): JQuery<TElement> /* this */
    fun <TData> scroll(eventData: TData, handler: JQuery.EventHandlerBase<Any, JQuery.Event<TElement, TData>>): JQuery<TElement> /* this */
    fun scroll(handler: Boolean? = definedExternally /* null */): JQuery<TElement> /* this */
    fun scroll(handler: JQuery.EventHandler<TElement, Nothing?>? = definedExternally /* null */): JQuery<TElement> /* this */
    fun scroll(handler: JQuery.EventHandlerBase<Any, JQuery.Event<TElement, Nothing?>>? = definedExternally /* null */): JQuery<TElement> /* this */
    fun scroll(handler: Nothing? = definedExternally /* null */): JQuery<TElement> /* this */
    fun scrollLeft(value: Number): JQuery<TElement> /* this */
    fun scrollLeft(): Number?
    fun scrollTop(value: Number): JQuery<TElement> /* this */
    fun scrollTop(): Number?
    fun <TData> select(eventData: TData, handler: JQuery.EventHandler<TElement, TData>): JQuery<TElement> /* this */
    fun <TData> select(eventData: TData, handler: JQuery.EventHandlerBase<Any, JQuery.Event<TElement, TData>>): JQuery<TElement> /* this */
    fun select(handler: Boolean? = definedExternally /* null */): JQuery<TElement> /* this */
    fun select(handler: JQuery.EventHandler<TElement, Nothing?>? = definedExternally /* null */): JQuery<TElement> /* this */
    fun select(handler: JQuery.EventHandlerBase<Any, JQuery.Event<TElement, Nothing?>>? = definedExternally /* null */): JQuery<TElement> /* this */
    fun select(handler: Nothing? = definedExternally /* null */): JQuery<TElement> /* this */
    fun serialize(): String
    fun serializeArray(): Array<JQuery.NameValuePair>
    fun show(duration: Number, easing: String, complete: (`this`: TElement) -> Unit): JQuery<TElement> /* this */
    fun show(duration: String /* "fast" */, easing: String, complete: (`this`: TElement) -> Unit): JQuery<TElement> /* this */
    fun show(duration: String /* "slow" */, easing: String, complete: (`this`: TElement) -> Unit): JQuery<TElement> /* this */
    fun show(duration: Number, easing_complete: String): JQuery<TElement> /* this */
    fun show(duration: Number, easing_complete: (`this`: TElement) -> Unit): JQuery<TElement> /* this */
    fun show(duration: String /* "fast" */, easing_complete: String): JQuery<TElement> /* this */
    fun show(duration: String /* "fast" */, easing_complete: (`this`: TElement) -> Unit): JQuery<TElement> /* this */
    fun show(duration: String /* "slow" */, easing_complete: String): JQuery<TElement> /* this */
    fun show(duration: String /* "slow" */, easing_complete: (`this`: TElement) -> Unit): JQuery<TElement> /* this */
    fun show(duration_complete_options: Number? = definedExternally /* null */): JQuery<TElement> /* this */
    fun show(duration_complete_options: String? /* "fast" */ = definedExternally /* null */): JQuery<TElement> /* this */
    fun show(duration_complete_options: String? /* "slow" */ = definedExternally /* null */): JQuery<TElement> /* this */
    fun show(duration_complete_options: JQuery.EffectsOptions<TElement>? = definedExternally /* null */): JQuery<TElement> /* this */
    fun show(duration_complete_options: ((`this`: TElement) -> Unit)? = definedExternally /* null */): JQuery<TElement> /* this */
    fun siblings(selector: String? = definedExternally /* null */): JQuery<TElement> /* this */
    fun slice(start: Number, end: Number? = definedExternally /* null */): JQuery<TElement> /* this */
    fun slideDown(duration: Number, easing: String, complete: ((`this`: TElement) -> Unit)? = definedExternally /* null */): JQuery<TElement> /* this */
    fun slideDown(duration: String /* "fast" */, easing: String, complete: ((`this`: TElement) -> Unit)? = definedExternally /* null */): JQuery<TElement> /* this */
    fun slideDown(duration: String /* "slow" */, easing: String, complete: ((`this`: TElement) -> Unit)? = definedExternally /* null */): JQuery<TElement> /* this */
    fun slideDown(duration_easing: String, complete: (`this`: TElement) -> Unit): JQuery<TElement> /* this */
    fun slideDown(duration_easing: Number, complete: (`this`: TElement) -> Unit): JQuery<TElement> /* this */
    fun slideDown(duration_easing_complete_options: String? = definedExternally /* null */): JQuery<TElement> /* this */
    fun slideDown(duration_easing_complete_options: Number? = definedExternally /* null */): JQuery<TElement> /* this */
    fun slideDown(duration_easing_complete_options: JQuery.EffectsOptions<TElement>? = definedExternally /* null */): JQuery<TElement> /* this */
    fun slideDown(duration_easing_complete_options: ((`this`: TElement) -> Unit)? = definedExternally /* null */): JQuery<TElement> /* this */
    fun slideToggle(duration: Number, easing: String, complete: ((`this`: TElement) -> Unit)? = definedExternally /* null */): JQuery<TElement> /* this */
    fun slideToggle(duration: String /* "fast" */, easing: String, complete: ((`this`: TElement) -> Unit)? = definedExternally /* null */): JQuery<TElement> /* this */
    fun slideToggle(duration: String /* "slow" */, easing: String, complete: ((`this`: TElement) -> Unit)? = definedExternally /* null */): JQuery<TElement> /* this */
    fun slideToggle(duration_easing: String, complete: (`this`: TElement) -> Unit): JQuery<TElement> /* this */
    fun slideToggle(duration_easing: Number, complete: (`this`: TElement) -> Unit): JQuery<TElement> /* this */
    fun slideToggle(duration_easing_complete_options: String? = definedExternally /* null */): JQuery<TElement> /* this */
    fun slideToggle(duration_easing_complete_options: Number? = definedExternally /* null */): JQuery<TElement> /* this */
    fun slideToggle(duration_easing_complete_options: JQuery.EffectsOptions<TElement>? = definedExternally /* null */): JQuery<TElement> /* this */
    fun slideToggle(duration_easing_complete_options: ((`this`: TElement) -> Unit)? = definedExternally /* null */): JQuery<TElement> /* this */
    fun slideUp(duration: Number, easing: String, complete: ((`this`: TElement) -> Unit)? = definedExternally /* null */): JQuery<TElement> /* this */
    fun slideUp(duration: String /* "fast" */, easing: String, complete: ((`this`: TElement) -> Unit)? = definedExternally /* null */): JQuery<TElement> /* this */
    fun slideUp(duration: String /* "slow" */, easing: String, complete: ((`this`: TElement) -> Unit)? = definedExternally /* null */): JQuery<TElement> /* this */
    fun slideUp(duration_easing: String, complete: (`this`: TElement) -> Unit): JQuery<TElement> /* this */
    fun slideUp(duration_easing: Number, complete: (`this`: TElement) -> Unit): JQuery<TElement> /* this */
    fun slideUp(duration_easing_complete_options: String? = definedExternally /* null */): JQuery<TElement> /* this */
    fun slideUp(duration_easing_complete_options: Number? = definedExternally /* null */): JQuery<TElement> /* this */
    fun slideUp(duration_easing_complete_options: JQuery.EffectsOptions<TElement>? = definedExternally /* null */): JQuery<TElement> /* this */
    fun slideUp(duration_easing_complete_options: ((`this`: TElement) -> Unit)? = definedExternally /* null */): JQuery<TElement> /* this */
    fun stop(queue: String, clearQueue: Boolean? = definedExternally /* null */, jumpToEnd: Boolean? = definedExternally /* null */): JQuery<TElement> /* this */
    fun stop(clearQueue: Boolean? = definedExternally /* null */, jumpToEnd: Boolean? = definedExternally /* null */): JQuery<TElement> /* this */
    fun <TData> submit(eventData: TData, handler: JQuery.EventHandler<TElement, TData>): JQuery<TElement> /* this */
    fun <TData> submit(eventData: TData, handler: JQuery.EventHandlerBase<Any, JQuery.Event<TElement, TData>>): JQuery<TElement> /* this */
    fun submit(handler: Boolean? = definedExternally /* null */): JQuery<TElement> /* this */
    fun submit(handler: JQuery.EventHandler<TElement, Nothing?>? = definedExternally /* null */): JQuery<TElement> /* this */
    fun submit(handler: JQuery.EventHandlerBase<Any, JQuery.Event<TElement, Nothing?>>? = definedExternally /* null */): JQuery<TElement> /* this */
    fun submit(handler: Nothing? = definedExternally /* null */): JQuery<TElement> /* this */
    fun text(text: String): JQuery<TElement> /* this */
    fun text(text: Number): JQuery<TElement> /* this */
    fun text(text: Boolean): JQuery<TElement> /* this */
    fun text(text: (`this`: TElement, index: Number, text: String) -> dynamic /* String | Number | Boolean */): JQuery<TElement> /* this */
    fun text(): String
    fun toArray(): Array<TElement>
    fun toggle(duration: Number, easing: String, complete: ((`this`: TElement) -> Unit)? = definedExternally /* null */): JQuery<TElement> /* this */
    fun toggle(duration: String /* "fast" */, easing: String, complete: ((`this`: TElement) -> Unit)? = definedExternally /* null */): JQuery<TElement> /* this */
    fun toggle(duration: String /* "slow" */, easing: String, complete: ((`this`: TElement) -> Unit)? = definedExternally /* null */): JQuery<TElement> /* this */
    fun toggle(duration: Number, complete: (`this`: TElement) -> Unit): JQuery<TElement> /* this */
    fun toggle(duration: String /* "fast" */, complete: (`this`: TElement) -> Unit): JQuery<TElement> /* this */
    fun toggle(duration: String /* "slow" */, complete: (`this`: TElement) -> Unit): JQuery<TElement> /* this */
    fun toggle(duration_complete_options_display: Number? = definedExternally /* null */): JQuery<TElement> /* this */
    fun toggle(duration_complete_options_display: Boolean? = definedExternally /* null */): JQuery<TElement> /* this */
    fun toggle(duration_complete_options_display: String? /* "fast" */ = definedExternally /* null */): JQuery<TElement> /* this */
    fun toggle(duration_complete_options_display: String? /* "slow" */ = definedExternally /* null */): JQuery<TElement> /* this */
    fun toggle(duration_complete_options_display: JQuery.EffectsOptions<TElement>? = definedExternally /* null */): JQuery<TElement> /* this */
    fun toggle(duration_complete_options_display: ((`this`: TElement) -> Unit)? = definedExternally /* null */): JQuery<TElement> /* this */
    fun <TState : Boolean> toggleClass(className: String, state: TState? = definedExternally /* null */): JQuery<TElement> /* this */
    fun <TState : Boolean> toggleClass(className: Array<String>, state: TState? = definedExternally /* null */): JQuery<TElement> /* this */
    fun <TState : Boolean> toggleClass(className: (`this`: TElement, index: Number, className: String, state: TState) -> String, state: TState? = definedExternally /* null */): JQuery<TElement> /* this */
    fun toggleClass(state: Boolean? = definedExternally /* null */): JQuery<TElement> /* this */
    fun trigger(eventType: String, extraParameters: String? = definedExternally /* null */): JQuery<TElement> /* this */
    fun trigger(eventType: String, extraParameters: Number? = definedExternally /* null */): JQuery<TElement> /* this */
    fun trigger(eventType: String, extraParameters: Array<Any>? = definedExternally /* null */): JQuery<TElement> /* this */
    fun trigger(eventType: String, extraParameters: JQuery.PlainObject<Any>? = definedExternally /* null */): JQuery<TElement> /* this */
    fun trigger(eventType: JQuery.Event<TElement, Nothing?>, extraParameters: String? = definedExternally /* null */): JQuery<TElement> /* this */
    fun trigger(eventType: JQuery.Event<TElement, Nothing?>, extraParameters: Number? = definedExternally /* null */): JQuery<TElement> /* this */
    fun trigger(eventType: JQuery.Event<TElement, Nothing?>, extraParameters: Array<Any>? = definedExternally /* null */): JQuery<TElement> /* this */
    fun trigger(eventType: JQuery.Event<TElement, Nothing?>, extraParameters: JQuery.PlainObject<Any>? = definedExternally /* null */): JQuery<TElement> /* this */
    fun triggerHandler(eventType: String, extraParameters: String? = definedExternally /* null */): Any?
    fun triggerHandler(eventType: String, extraParameters: Number? = definedExternally /* null */): Any?
    fun triggerHandler(eventType: String, extraParameters: Array<Any>? = definedExternally /* null */): Any?
    fun triggerHandler(eventType: String, extraParameters: JQuery.PlainObject<Any>? = definedExternally /* null */): Any?
    fun triggerHandler(eventType: JQuery.Event<TElement, Nothing?>, extraParameters: String? = definedExternally /* null */): Any?
    fun triggerHandler(eventType: JQuery.Event<TElement, Nothing?>, extraParameters: Number? = definedExternally /* null */): Any?
    fun triggerHandler(eventType: JQuery.Event<TElement, Nothing?>, extraParameters: Array<Any>? = definedExternally /* null */): Any?
    fun triggerHandler(eventType: JQuery.Event<TElement, Nothing?>, extraParameters: JQuery.PlainObject<Any>? = definedExternally /* null */): Any?
    fun unbind(event: String, handler: Boolean): JQuery<TElement> /* this */
    fun unbind(event: String, handler: JQuery.EventHandlerBase<Any, JQuery.Event<TElement, Any>>): JQuery<TElement> /* this */
    fun unbind(event: String? = definedExternally /* null */): JQuery<TElement> /* this */
    fun unbind(event: JQuery.Event<TElement, Nothing?>? = definedExternally /* null */): JQuery<TElement> /* this */
    fun undelegate(selector: String, eventType: String, handler: Boolean): JQuery<TElement> /* this */
    fun undelegate(selector: String, eventType: String, handler: JQuery.EventHandlerBase<Any, JQuery.Event<TElement, Any>>): JQuery<TElement> /* this */
    fun undelegate(selector: String, eventTypes: String): JQuery<TElement> /* this */
    fun undelegate(selector: String, eventTypes: JQuery.PlainObject<dynamic /* Boolean | JQuery.EventHandlerBase<Any, JQuery.Event<TElement, Any>> */>): JQuery<TElement> /* this */
    fun undelegate(namespace: String? = definedExternally /* null */): JQuery<TElement> /* this */
    fun unwrap(selector: String? = definedExternally /* null */): JQuery<TElement> /* this */
    fun `val`(value: String): JQuery<TElement> /* this */
    fun `val`(value: Number): JQuery<TElement> /* this */
    fun `val`(value: Array<String>): JQuery<TElement> /* this */
    fun `val`(value: (`this`: TElement, index: Number, value: String) -> String): JQuery<TElement> /* this */
    fun `val`(): dynamic /* String | Number | Array<String> | Nothing? */
    fun width(value: String): JQuery<TElement> /* this */
    fun width(value: Number): JQuery<TElement> /* this */
    fun width(value: (`this`: TElement, index: Number, value: Number) -> dynamic /* String | Number */): JQuery<TElement> /* this */
    fun width(): Number?
    fun wrap(wrappingElement: String): JQuery<TElement> /* this */
    fun wrap(wrappingElement: Element): JQuery<TElement> /* this */
    fun wrap(wrappingElement: JQuery<HTMLElement>): JQuery<TElement> /* this */
    fun wrap(wrappingElement: (`this`: TElement, index: Number) -> dynamic /* String | JQuery<HTMLElement> */): JQuery<TElement> /* this */
    fun wrapAll(wrappingElement: String): JQuery<TElement> /* this */
    fun wrapAll(wrappingElement: Element): JQuery<TElement> /* this */
    fun wrapAll(wrappingElement: JQuery<HTMLElement>): JQuery<TElement> /* this */
    fun wrapAll(wrappingElement: (`this`: TElement) -> dynamic /* String | JQuery<HTMLElement> */): JQuery<TElement> /* this */
    fun wrapInner(wrappingElement: String): JQuery<TElement> /* this */
    fun wrapInner(wrappingElement: Element): JQuery<TElement> /* this */
    fun wrapInner(wrappingElement: JQuery<HTMLElement>): JQuery<TElement> /* this */
    fun wrapInner(wrappingElement: (`this`: TElement, index: Number) -> dynamic /* String | Element | JQuery<HTMLElement> */): JQuery<TElement> /* this */
    @nativeGetter
    operator fun get(n: Number): TElement?
    @nativeSetter
    operator fun set(n: Number, value: TElement)
    fun blur(): JQuery<TElement> /* this */
    fun change(): JQuery<TElement> /* this */
    fun click(): JQuery<TElement> /* this */
    fun contextmenu(): JQuery<TElement> /* this */
    fun dblclick(): JQuery<TElement> /* this */
    fun fadeIn(): JQuery<TElement> /* this */
    fun fadeOut(): JQuery<TElement> /* this */
    fun fadeToggle(): JQuery<TElement> /* this */
    fun focus(): JQuery<TElement> /* this */
    fun focusin(): JQuery<TElement> /* this */
    fun focusout(): JQuery<TElement> /* this */
    fun hide(): JQuery<TElement> /* this */
    fun index(): Number
    fun keydown(): JQuery<TElement> /* this */
    fun keypress(): JQuery<TElement> /* this */
    fun keyup(): JQuery<TElement> /* this */
    fun load(url: String): JQuery<TElement> /* this */
    fun mousedown(): JQuery<TElement> /* this */
    fun mouseenter(): JQuery<TElement> /* this */
    fun mouseleave(): JQuery<TElement> /* this */
    fun mousemove(): JQuery<TElement> /* this */
    fun mouseout(): JQuery<TElement> /* this */
    fun mouseover(): JQuery<TElement> /* this */
    fun mouseup(): JQuery<TElement> /* this */
    fun nextUntil(): JQuery<TElement> /* this */
    fun off(events: String): JQuery<TElement> /* this */
    fun parentsUntil(): JQuery<TElement> /* this */
    fun prevUntil(): JQuery<TElement> /* this */
    fun removeClass(): JQuery<TElement> /* this */
    fun removeData(): JQuery<TElement> /* this */
    fun resize(): JQuery<TElement> /* this */
    fun scroll(): JQuery<TElement> /* this */
    fun select(): JQuery<TElement> /* this */
    fun show(): JQuery<TElement> /* this */
    fun slideDown(): JQuery<TElement> /* this */
    fun slideToggle(): JQuery<TElement> /* this */
    fun slideUp(): JQuery<TElement> /* this */
    fun submit(): JQuery<TElement> /* this */
    fun toggle(): JQuery<TElement> /* this */
    fun trigger(eventType: String): JQuery<TElement> /* this */
    fun trigger(eventType: JQuery.Event<TElement, Nothing?>): JQuery<TElement> /* this */
    fun triggerHandler(eventType: String): Any?
    fun triggerHandler(eventType: JQuery.Event<TElement, Nothing?>): Any?
    fun unbind(): JQuery<TElement> /* this */
}
external interface Iterable<T>
external interface JQueryCallback : JQuery.Callbacks<Function<*>>
external interface JQueryDeferred<T> : JQuery.Deferred<T, Any, Any>
external interface JQueryEventConstructor : JQuery.Event<EventTarget, Nothing?>
external interface JQueryAjaxSettings : JQuery.AjaxSettings<Any>
external interface JQueryAnimationOptions : JQuery.EffectsOptions<Element>
external interface JQueryCoordinates : JQuery.Coordinates
external interface JQueryGenericPromise<T> : JQuery.Thenable<T>
external interface JQueryXHR : JQuery.jqXHR<Any>
external interface JQueryPromise<T> : JQuery.Promise<T, Any, Any>
external interface JQuerySerializeArrayElement : JQuery.NameValuePair
external interface JQuerySupport : JQuery.PlainObject<Any>
external interface JQueryPromiseCallback<T> {
    @nativeInvoke
    operator fun invoke(value: T? = definedExternally /* null */, vararg args: Any)
}
external interface JQueryParam {
    @nativeInvoke
    operator fun invoke(obj: Any, traditional: Boolean? = definedExternally /* null */): String
}
external interface BaseJQueryEventObject : Event {
    override var currentTarget: Element
    var data: Any
    var delegateTarget: Element
    fun isDefaultPrevented(): Boolean
    fun isImmediatePropagationStopped(): Boolean
    fun isPropagationStopped(): Boolean
    var namespace: String
    var originalEvent: Event
    override fun preventDefault(): Any
    var relatedTarget: Element
    var result: Any
    override fun stopImmediatePropagation()
    override fun stopPropagation()
    override var target: Element
    var pageX: Number
    var pageY: Number
    var which: Number
    var metaKey: Boolean
}
external interface JQueryInputEventObject : BaseJQueryEventObject {
    var altKey: Boolean
    var ctrlKey: Boolean
    override var metaKey: Boolean
    var shiftKey: Boolean
}
external interface JQueryMouseEventObject : JQueryInputEventObject {
    var button: Number
    var clientX: Number
    var clientY: Number
    var offsetX: Number
    var offsetY: Number
    override var pageX: Number
    override var pageY: Number
    var screenX: Number
    var screenY: Number
}
external interface JQueryKeyEventObject : JQueryInputEventObject {
    var char: Any
    var charCode: Number
    var key: Any
    var keyCode: Number
}
external interface JQueryEventObject : BaseJQueryEventObject, JQueryInputEventObject, JQueryMouseEventObject, JQueryKeyEventObject
external interface JQueryPromiseOperator<T, U> {
    @nativeInvoke
    operator fun invoke(callback1: JQueryPromiseCallback<T>, vararg callbacksN: JQueryPromiseCallback<Any>): JQueryPromise<U>
    @nativeInvoke
    operator fun invoke(callback1: JQueryPromiseCallback<T>, vararg callbacksN: Array<JQueryPromiseCallback<Any>>): JQueryPromise<U>
    @nativeInvoke
    operator fun invoke(callback1: Array<JQueryPromiseCallback<T>>, vararg callbacksN: JQueryPromiseCallback<Any>): JQueryPromise<U>
    @nativeInvoke
    operator fun invoke(callback1: Array<JQueryPromiseCallback<T>>, vararg callbacksN: Array<JQueryPromiseCallback<Any>>): JQueryPromise<U>
}
external interface JQueryEasingFunction {
    @nativeInvoke
    operator fun invoke(percent: Number): Number
}
external interface JQueryEasingFunctions {
    @nativeGetter
    operator fun get(name: String): JQueryEasingFunction?
    @nativeSetter
    operator fun set(name: String, value: JQueryEasingFunction)
    var linear: JQueryEasingFunction
    var swing: JQueryEasingFunction
}
