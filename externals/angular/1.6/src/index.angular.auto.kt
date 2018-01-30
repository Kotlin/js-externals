@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("angular.auto")
package js.externals.angular.auto

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

external interface IInjectorService {
    fun annotate(fn: Function<*>, strictDi: Boolean? = definedExternally /* null */): Array<String>
    fun annotate(inlineAnnotatedFunction: Array<Any>): Array<String>
    fun <T> get(name: String, caller: String? = definedExternally /* null */): T
    fun get(name: String /* "$anchorScroll" */): js.externals.angular.IAnchorScrollService
    fun get(name: String /* "$cacheFactory" */): js.externals.angular.ICacheFactoryService
    fun get(name: String /* "$compile" */): js.externals.angular.ICompileService
    fun get(name: String /* "$controller" */): js.externals.angular.IControllerService
    fun get(name: String /* "$document" */): js.externals.angular.IDocumentService
    fun get(name: String /* "$exceptionHandler" */): js.externals.angular.IExceptionHandlerService
    fun get(name: String /* "$filter" */): js.externals.angular.IFilterService
    fun get(name: String /* "$http" */): js.externals.angular.IHttpService
    fun get(name: String /* "$httpBackend" */): js.externals.angular.IHttpBackendService
    fun get(name: String /* "$httpParamSerializer" */): js.externals.angular.IHttpParamSerializer
    fun get(name: String /* "$httpParamSerializerJQLike" */): js.externals.angular.IHttpParamSerializer
    fun get(name: String /* "$interpolate" */): js.externals.angular.IInterpolateService
    fun get(name: String /* "$interval" */): js.externals.angular.IIntervalService
    fun get(name: String /* "$locale" */): js.externals.angular.ILocaleService
    fun get(name: String /* "$location" */): js.externals.angular.ILocationService
    fun get(name: String /* "$log" */): js.externals.angular.ILogService
    fun get(name: String /* "$parse" */): js.externals.angular.IParseService
    fun get(name: String /* "$q" */): js.externals.angular.IQService
    fun get(name: String /* "$rootElement" */): js.externals.angular.IRootElementService
    fun get(name: String /* "$rootScope" */): js.externals.angular.IRootScopeService
    fun get(name: String /* "$sce" */): js.externals.angular.ISCEService
    fun get(name: String /* "$sceDelegate" */): js.externals.angular.ISCEDelegateService
    fun get(name: String /* "$templateCache" */): js.externals.angular.ITemplateCacheService
    fun get(name: String /* "$templateRequest" */): js.externals.angular.ITemplateRequestService
    fun get(name: String /* "$timeout" */): js.externals.angular.ITimeoutService
    fun get(name: String /* "$window" */): js.externals.angular.IWindowService
    fun <T> get(name: String /* "$xhrFactory" */): js.externals.angular.IXhrFactory<T>
    fun has(name: String): Boolean
    fun <T> instantiate(typeConstructor: Any, locals: Any? = definedExternally /* null */): T
    fun <T> invoke(func: Function<*>, context: Any? = definedExternally /* null */, locals: Any? = definedExternally /* null */): T
    fun <T> invoke(func: (args: Any) -> T, context: Any? = definedExternally /* null */, locals: Any? = definedExternally /* null */): T
    fun <T> invoke(func: Array<dynamic /* String | Function<*> | (args: Any) -> T */>, context: Any? = definedExternally /* null */, locals: Any? = definedExternally /* null */): T
    var strictDi: Boolean
}
external interface IProvideService {
    fun constant(name: String, value: Any)
    fun decorator(name: String, decorator: Function<*>)
    fun decorator(name: String, inlineAnnotatedFunction: Array<Any>)
    fun factory(name: String, serviceFactoryFunction: Function<*>): js.externals.angular.IServiceProvider
    fun factory(name: String, inlineAnnotatedFunction: Array<Any>): js.externals.angular.IServiceProvider
    fun provider(name: String, provider: js.externals.angular.IServiceProvider): js.externals.angular.IServiceProvider
    fun provider(name: String, serviceProviderConstructor: Function<*>): js.externals.angular.IServiceProvider
    fun service(name: String, constructor: Function<*>): js.externals.angular.IServiceProvider
    fun service(name: String, inlineAnnotatedFunction: Array<Any>): js.externals.angular.IServiceProvider
    fun value(name: String, value: Any): js.externals.angular.IServiceProvider
}
