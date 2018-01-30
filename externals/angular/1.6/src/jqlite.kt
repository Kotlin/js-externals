@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")

package js.externals.angular.jqlite

import js.externals.angular.IScope
import js.externals.angular.auto.IInjectorService
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

external interface JQLite : JQuery {
    @nativeGetter
    operator fun get(index: Number): HTMLElement?
    @nativeSetter
    operator fun set(index: Number, value: HTMLElement)
}
external interface `T$0` {
    @nativeGetter
    operator fun get(key: String): ((eventObject: JQueryEventObject, args: Any) -> Any)?
    @nativeSetter
    operator fun set(key: String, value: (eventObject: JQueryEventObject, args: Any) -> Any)
}
external interface JQuery {
    fun addClass(className: String): JQuery /* this */
    fun after(content1: String, vararg content2: Any): JQuery /* this */
    fun after(content1: Array<Any>, vararg content2: Any): JQuery /* this */
    fun after(content1: JQuery, vararg content2: Any): JQuery /* this */
    fun after(content1: Element, vararg content2: Any): JQuery /* this */
    fun after(content1: DocumentFragment, vararg content2: Any): JQuery /* this */
    fun after(content1: Text, vararg content2: Any): JQuery /* this */
    fun after(func: (index: Number, html: String) -> dynamic /* String | JQuery | Element */): JQuery /* this */
    fun append(content1: String, vararg content2: Any): JQuery /* this */
    fun append(content1: Array<Any>, vararg content2: Any): JQuery /* this */
    fun append(content1: JQuery, vararg content2: Any): JQuery /* this */
    fun append(content1: Element, vararg content2: Any): JQuery /* this */
    fun append(content1: DocumentFragment, vararg content2: Any): JQuery /* this */
    fun append(content1: Text, vararg content2: Any): JQuery /* this */
    fun append(func: (index: Number, html: String) -> dynamic /* String | JQuery | Element */): JQuery /* this */
    fun attr(attributeName: String): String
    fun attr(attributeName: String, value: String): JQuery /* this */
    fun attr(attributeName: String, value: Number): JQuery /* this */
    fun attr(attributeName: String, value: Nothing?): JQuery /* this */
    fun attr(attributes: Any): JQuery /* this */
    fun bind(eventType: String, handler: (eventObject: JQueryEventObject) -> Any): JQuery /* this */
    fun bind(eventType: String, preventBubble: Boolean): JQuery /* this */
    fun bind(events: Any): JQuery /* this */
    fun children(): JQuery /* this */
    fun clone(withDataAndEvents: Boolean? = definedExternally /* null */, deepWithDataAndEvents: Boolean? = definedExternally /* null */): JQuery /* this */
    fun contents(): JQuery /* this */
    fun css(propertyName: String): String
    fun css(propertyNames: Array<String>): Any
    fun css(propertyName: String, value: String): JQuery /* this */
    fun css(propertyName: String, value: Number): JQuery /* this */
    fun css(propertyName: String, value: Nothing?): JQuery /* this */
    fun css(propertyName: String, value: (index: Number, value: String) -> dynamic /* String | Number | Nothing? */): JQuery /* this */
    fun css(properties: JQLiteCssProperties): JQuery /* this */
    fun data(key: String, value: Any): JQuery /* this */
    fun data(key: String): Any
    fun data(obj: Json): JQuery /* this */
    fun data(): Any
    fun detach(selector: String? = definedExternally /* null */): JQuery /* this */
    fun empty(): JQuery /* this */
    fun eq(index: Number): JQuery /* this */
    fun find(selector: String): JQuery /* this */
    fun find(element: Any): JQuery /* this */
    fun find(obj: JQuery): JQuery /* this */
    fun hasClass(className: String): Boolean
    fun html(): String
    fun html(htmlString: String): JQuery /* this */
    fun html(func: (index: Number, oldhtml: String) -> String): JQuery /* this */
    fun next(): JQuery /* this */
    fun on(events: String, handler: (eventObject: JQueryEventObject, args: Any) -> Any): JQuery /* this */
    fun on(events: String, data: Any, handler: (eventObject: JQueryEventObject, args: Any) -> Any): JQuery /* this */
    fun on(events: String, selector: String, handler: (eventObject: JQueryEventObject, eventData: Any) -> Any): JQuery /* this */
    fun on(events: String, selector: String, data: Any, handler: (eventObject: JQueryEventObject, eventData: Any) -> Any): JQuery /* this */
    fun on(events: `T$0`, selector: String? = definedExternally /* null */, data: Any? = definedExternally /* null */): JQuery /* this */
    fun on(events: `T$0`, data: Any? = definedExternally /* null */): JQuery /* this */
    fun off(): JQuery /* this */
    fun off(events: String, selector: String? = definedExternally /* null */, handler: ((eventObject: JQueryEventObject) -> Any)? = definedExternally /* null */): JQuery /* this */
    fun off(events: String, handler: (eventObject: JQueryEventObject, args: Any) -> Any): JQuery /* this */
    fun off(events: String, handler: (eventObject: JQueryEventObject) -> Any): JQuery /* this */
    fun off(events: Json, selector: String? = definedExternally /* null */): JQuery /* this */
    fun one(events: String, handler: (eventObject: JQueryEventObject) -> Any): JQuery /* this */
    fun one(events: String, data: Any, handler: (eventObject: JQueryEventObject) -> Any): JQuery /* this */
    fun one(events: String, selector: String, handler: (eventObject: JQueryEventObject) -> Any): JQuery /* this */
    fun one(events: String, selector: String, data: Any, handler: (eventObject: JQueryEventObject) -> Any): JQuery /* this */
    fun one(events: Json, selector: String? = definedExternally /* null */, data: Any? = definedExternally /* null */): JQuery /* this */
    fun one(events: Json, data: Any? = definedExternally /* null */): JQuery /* this */
    fun parent(): JQuery /* this */
    fun prepend(content1: String, vararg content2: Any): JQuery /* this */
    fun prepend(content1: Array<Any>, vararg content2: Any): JQuery /* this */
    fun prepend(content1: JQuery, vararg content2: Any): JQuery /* this */
    fun prepend(content1: Element, vararg content2: Any): JQuery /* this */
    fun prepend(content1: DocumentFragment, vararg content2: Any): JQuery /* this */
    fun prepend(content1: Text, vararg content2: Any): JQuery /* this */
    fun prepend(func: (index: Number, html: String) -> dynamic /* String | JQuery | Element */): JQuery /* this */
    fun prop(propertyName: String): Any
    fun prop(propertyName: String, value: String): JQuery /* this */
    fun prop(propertyName: String, value: Number): JQuery /* this */
    fun prop(propertyName: String, value: Boolean): JQuery /* this */
    fun prop(properties: Any): JQuery /* this */
    fun prop(propertyName: String, func: (index: Number, oldPropertyValue: Any) -> Any): JQuery /* this */
    fun ready(handler: (jQueryAlias: JQueryStatic? /*= null*/) -> Any): JQuery /* this */
    fun remove(selector: String? = definedExternally /* null */): JQuery /* this */
    fun removeAttr(attributeName: String): JQuery /* this */
    fun removeClass(className: String? = definedExternally /* null */): JQuery /* this */
    fun removeData(name: String): JQuery /* this */
    fun removeData(list: Array<String>): JQuery /* this */
    fun removeData(): JQuery /* this */
    fun replaceWith(newContent: String): JQuery /* this */
    fun replaceWith(newContent: Array<Any>): JQuery /* this */
    fun replaceWith(newContent: JQuery): JQuery /* this */
    fun replaceWith(newContent: Element): JQuery /* this */
    fun replaceWith(newContent: Text): JQuery /* this */
    fun replaceWith(func: () -> dynamic /* JQuery | Element */): JQuery /* this */
    fun text(): String
    fun text(text: String): JQuery /* this */
    fun text(text: Number): JQuery /* this */
    fun text(text: Boolean): JQuery /* this */
    fun text(func: (index: Number, text: String) -> String): JQuery /* this */
    fun toggleClass(className: String, swtch: Boolean? = definedExternally /* null */): JQuery /* this */
    fun toggleClass(swtch: Boolean? = definedExternally /* null */): JQuery /* this */
    fun triggerHandler(eventType: String, vararg extraParameters: Any): Any
    fun triggerHandler(event: JQueryEventObject, vararg extraParameters: Any): Any
    fun unbind(eventType: String? = definedExternally /* null */, handler: ((eventObject: JQueryEventObject) -> Any)? = definedExternally /* null */): JQuery /* this */
    fun unbind(eventType: String, fls: Boolean): JQuery /* this */
    fun unbind(evt: Any): JQuery /* this */
    fun `val`(): Any
    fun `val`(value: String): JQuery /* this */
    fun `val`(value: Number): JQuery /* this */
    fun `val`(value: Array<String>): JQuery /* this */
    fun `val`(func: (index: Number, value: String) -> String): JQuery /* this */
    fun wrap(wrappingElement: String): JQuery /* this */
    fun wrap(wrappingElement: JQuery): JQuery /* this */
    fun wrap(wrappingElement: Element): JQuery /* this */
    fun wrap(func: (index: Number) -> dynamic /* String | JQuery */): JQuery /* this */
    var length: Number
    fun controller(name: String? = definedExternally /* null */): Any
    fun injector(): IInjectorService
    fun <T : IScope> scope(): T
    fun <T : IScope> isolateScope(): T
    fun inheritedData(key: String, value: Any): JQuery /* this */
    fun inheritedData(obj: Json): JQuery /* this */
    fun inheritedData(key: String? = definedExternally /* null */): Any
    fun on(events: `T$0`): JQuery /* this */
    fun one(events: Json): JQuery /* this */
}
external interface JQueryStatic {
    @nativeInvoke
    operator fun invoke(element: String): JQLite
    @nativeInvoke
    operator fun invoke(element: JQuery): JQLite
    @nativeInvoke
    operator fun invoke(element: Element): JQLite
    @nativeInvoke
    operator fun invoke(element: Document): JQLite
    @nativeInvoke
    operator fun invoke(element: Array<Element>): JQLite
    @nativeInvoke
    operator fun invoke(element: () -> Unit): JQLite
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
external interface cssPropertySetter {
    @nativeInvoke
    operator fun invoke(index: Number, value: String? = definedExternally /* null */): dynamic /* String | Number | Nothing? */
}
external interface JQLiteCssProperties {
    @nativeGetter
    operator fun get(propertyName: String): dynamic /* String | Number | cssPropertySetter */
    @nativeSetter
    operator fun set(propertyName: String, value: String)
    @nativeSetter
    operator fun set(propertyName: String, value: Number)
    @nativeSetter
    operator fun set(propertyName: String, value: cssPropertySetter)
}
