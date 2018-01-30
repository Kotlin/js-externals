@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("angular")
package js.externals.angular

import js.externals.angular.jqlite.*
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

external interface IServiceProviderClass
external interface IServiceProviderFactory {
    @nativeInvoke
    operator fun invoke(vararg args: Any): IServiceProvider
}
external interface IServiceProvider {
    var `$get`: Any
}
external interface IAngularBootstrapConfig {
    var strictDi: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface `T$0`<T> {
    @nativeGetter
    operator fun get(index: String): T?
    @nativeSetter
    operator fun set(index: String, value: T)
}
external interface `T$1` {
    var full: String
    var major: Number
    var minor: Number
    var dot: Number
    var codeName: String
}
external interface IAngularStatic {
    fun bind(context: Any, fn: Function<*>, vararg args: Any): Function<*>
    fun bootstrap(element: String, modules: Array<dynamic /* String | Function<*> | Array<Any> */>? = definedExternally /* null */, config: IAngularBootstrapConfig? = definedExternally /* null */): js.externals.angular.auto.IInjectorService
    fun bootstrap(element: Element, modules: Array<dynamic /* String | Function<*> | Array<Any> */>? = definedExternally /* null */, config: IAngularBootstrapConfig? = definedExternally /* null */): js.externals.angular.auto.IInjectorService
    fun bootstrap(element: JQuery, modules: Array<dynamic /* String | Function<*> | Array<Any> */>? = definedExternally /* null */, config: IAngularBootstrapConfig? = definedExternally /* null */): js.externals.angular.auto.IInjectorService
    fun bootstrap(element: Document, modules: Array<dynamic /* String | Function<*> | Array<Any> */>? = definedExternally /* null */, config: IAngularBootstrapConfig? = definedExternally /* null */): js.externals.angular.auto.IInjectorService
    fun <T> copy(source: T, destination: T? = definedExternally /* null */): T
    var element: JQueryStatic
    fun equals(value1: Any, value2: Any): Boolean
    fun extend(destination: Any, vararg sources: Any): Any
    fun <T> forEach(obj: Array<T>, iterator: (value: T, key: Number, obj: Array<T>) -> Unit, context: Any? = definedExternally /* null */): Array<T>
    fun <T> forEach(obj: `T$0`<T>, iterator: (value: T, key: String, obj: `T$0`<T>) -> Unit, context: Any? = definedExternally /* null */): `T$0`<T>
    fun forEach(obj: Any, iterator: (value: Any, key: Any, obj: Any) -> Unit, context: Any? = definedExternally /* null */): Any
    fun fromJson(json: String): Any
    fun <T> identity(arg: T? = definedExternally /* null */): T
    fun injector(modules: Array<Any>? = definedExternally /* null */, strictDi: Boolean? = definedExternally /* null */): js.externals.angular.auto.IInjectorService
    fun isArray(value: Any): Boolean
    fun isDate(value: Any): Boolean
    fun isDefined(value: Any): Boolean
    fun isElement(value: Any): Boolean
    fun isFunction(value: Any): Boolean
    fun isNumber(value: Any): Boolean
    fun isObject(value: Any): Boolean
    fun <T> isObject(value: Any): Boolean
    fun isString(value: Any): Boolean
    fun isUndefined(value: Any): Boolean
    fun lowercase(str: String): String
    fun merge(dst: Any, vararg src: Any): Any
    fun module(name: String, requires: Array<String>? = definedExternally /* null */, configFn: Function<*>? = definedExternally /* null */): IModule
    fun module(name: String, requires: Array<String>? = definedExternally /* null */, configFn: Array<dynamic /* String | Function<*> */>? = definedExternally /* null */): IModule
    fun noop(vararg args: Any)
    fun reloadWithDebugInfo()
    fun toJson(obj: Any, pretty: Number? = definedExternally /* null */): String
    fun toJson(obj: Any, pretty: Boolean? = definedExternally /* null */): String
    fun uppercase(str: String): String
    var version: `T$1`
    val resumeBootstrap: ((extraModules: Array<String>? /*= null*/) -> js.externals.angular.auto.IInjectorService)? get() = definedExternally
    fun module(name: String): IModule
    fun toJson(obj: Any): String
}
external interface `T$2` {
    @nativeGetter
    operator fun get(name: String): dynamic /* Any? | (args: Any) -> dynamic /* Unit | IController */ | Array<dynamic /* String | Any? | (args: Any) -> dynamic /* Unit | IController */ */> */
    @nativeSetter
    operator fun set(name: String, value: Any?)
    @nativeSetter
    operator fun set(name: String, value: (args: Any) -> dynamic /* Unit | IController */)
    @nativeSetter
    operator fun set(name: String, value: Array<dynamic /* String | Any? | (args: Any) -> dynamic /* Unit | IController */ */>)
}
external interface `T$3`<TScope: IScope> {
    @nativeGetter
    operator fun get(directiveName: String): dynamic /* IDirectiveFactory<TScope> | Array<dynamic /* String | IDirectiveFactory<TScope> */> */
    @nativeSetter
    operator fun set(directiveName: String, value: IDirectiveFactory<TScope>)
    @nativeSetter
    operator fun set(directiveName: String, value: Array<dynamic /* String | IDirectiveFactory<TScope> */>)
}
external interface `T$4` {
    @nativeGetter
    operator fun get(name: String): dynamic /* Function<*> | Array<dynamic /* String | Function<*> */> */
    @nativeSetter
    operator fun set(name: String, value: Function<*>)
    @nativeSetter
    operator fun set(name: String, value: Array<dynamic /* String | Function<*> */>)
}
external interface IModule {
    fun component(name: String, options: IComponentOptions): IModule
    fun config(configFn: Function<*>): IModule
    fun config(inlineAnnotatedFunction: Array<Any>): IModule
    fun config(`object`: Any): IModule
    fun <T> constant(name: String, value: T): IModule
    fun constant(`object`: Any): IModule
    fun controller(name: String, controllerConstructor: Any?): IModule
    fun controller(name: String, controllerConstructor: (args: Any) -> dynamic /* Unit | IController */): IModule
    fun controller(name: String, controllerConstructor: Array<dynamic /* String | Any? | (args: Any) -> dynamic /* Unit | IController */ */>): IModule
    fun controller(`object`: `T$2`): IModule
    fun <TScope : IScope> directive(name: String, directiveFactory: IDirectiveFactory<TScope>): IModule
    fun <TScope : IScope> directive(name: String, directiveFactory: Array<dynamic /* String | IDirectiveFactory<TScope> */>): IModule
    fun <TScope : IScope> directive(`object`: `T$3`<TScope>): IModule
    fun factory(name: String, `$getFn`: Function<*>): IModule
    fun factory(name: String, `$getFn`: Array<dynamic /* String | Function<*> */>): IModule
    fun factory(`object`: `T$4`): IModule
    fun filter(name: String, filterFactoryFunction: Function<*>): IModule
    fun filter(name: String, filterFactoryFunction: Array<dynamic /* String | Function<*> */>): IModule
    fun filter(`object`: `T$4`): IModule
    fun provider(name: String, serviceProviderFactory: IServiceProviderFactory): IModule
    fun provider(name: String, serviceProviderConstructor: IServiceProviderClass): IModule
    fun provider(name: String, inlineAnnotatedConstructor: Array<Any>): IModule
    fun provider(name: String, providerObject: IServiceProvider): IModule
    fun provider(`object`: Any): IModule
    fun run(initializationFunction: Function<*>): IModule
    fun run(initializationFunction: Array<dynamic /* String | Function<*> */>): IModule
    fun service(name: String, serviceConstructor: Function<*>): IModule
    fun service(name: String, serviceConstructor: Array<dynamic /* String | Function<*> */>): IModule
    fun service(`object`: `T$4`): IModule
    fun <T> value(name: String, value: T): IModule
    fun value(`object`: Any): IModule
    fun decorator(name: String, decorator: Function<*>): IModule
    fun decorator(name: String, decorator: Array<dynamic /* String | Function<*> */>): IModule
    var name: String
    var requires: Array<String>
}
external interface IAttributes {
    @nativeGetter
    operator fun get(name: String): Any?
    @nativeSetter
    operator fun set(name: String, value: Any)
    fun `$normalize`(name: String): String
    fun `$addClass`(classVal: String)
    fun `$removeClass`(classVal: String)
    fun `$updateClass`(newClasses: String, oldClasses: String)
    fun `$set`(key: String, value: Any)
    fun <T> `$observe`(name: String, fn: (value: T? /*= null*/) -> Any): Function<*>
    var `$attr`: Any
}
external interface IFormController {
    @nativeGetter
    operator fun get(name: String): Any?
    @nativeSetter
    operator fun set(name: String, value: Any)
    var `$pristine`: Boolean
    var `$dirty`: Boolean
    var `$valid`: Boolean
    var `$invalid`: Boolean
    var `$submitted`: Boolean
    var `$error`: Any
    var `$name`: String
    var `$pending`: Any
    fun `$addControl`(control: INgModelController)
    fun `$addControl`(control: IFormController)
    fun `$removeControl`(control: INgModelController)
    fun `$removeControl`(control: IFormController)
    fun `$setValidity`(validationErrorKey: String, isValid: Boolean, control: INgModelController)
    fun `$setValidity`(validationErrorKey: String, isValid: Boolean, control: IFormController)
    fun `$setDirty`()
    fun `$setPristine`()
    fun `$commitViewValue`()
    fun `$rollbackViewValue`()
    fun `$setSubmitted`()
    fun `$setUntouched`()
}
external interface INgModelController {
    fun `$render`()
    fun `$setValidity`(validationErrorKey: String, isValid: Boolean)
    fun `$setViewValue`(value: Any, trigger: String? = definedExternally /* null */)
    fun `$setPristine`()
    fun `$setDirty`()
    fun `$validate`()
    fun `$setTouched`()
    fun `$setUntouched`()
    fun `$rollbackViewValue`()
    fun `$commitViewValue`()
    fun `$processModelValue`()
    fun `$isEmpty`(value: Any): Boolean
    fun `$overrideModelOptions`(options: INgModelOptions)
    var `$viewValue`: Any
    var `$modelValue`: Any
    var `$parsers`: Array<IModelParser>
    var `$formatters`: Array<IModelFormatter>
    var `$viewChangeListeners`: Array<IModelViewChangeListener>
    var `$error`: Any
    var `$name`: String
    var `$touched`: Boolean
    var `$untouched`: Boolean
    var `$validators`: IModelValidators
    var `$asyncValidators`: IAsyncModelValidators
    var `$pending`: Any
    var `$pristine`: Boolean
    var `$dirty`: Boolean
    var `$valid`: Boolean
    var `$invalid`: Boolean
}
external interface `T$5` {
    @nativeGetter
    operator fun get(key: String): Number?
    @nativeSetter
    operator fun set(key: String, value: Number)
}
external interface INgModelOptions {
    var updateOn: String? get() = definedExternally; set(value) = definedExternally
    var debounce: dynamic /* Number | `T$5` */ get() = definedExternally; set(value) = definedExternally
    var allowInvalid: Boolean? get() = definedExternally; set(value) = definedExternally
    var getterSetter: Boolean? get() = definedExternally; set(value) = definedExternally
    var timezone: String? get() = definedExternally; set(value) = definedExternally
}
external interface IModelValidators {
    @nativeGetter
    operator fun get(index: String): ((modelValue: Any, viewValue: Any) -> Boolean)?
    @nativeSetter
    operator fun set(index: String, value: (modelValue: Any, viewValue: Any) -> Boolean)
}
external interface IAsyncModelValidators {
    @nativeGetter
    operator fun get(index: String): ((modelValue: Any, viewValue: Any) -> IPromise<Any>)?
    @nativeSetter
    operator fun set(index: String, value: (modelValue: Any, viewValue: Any) -> IPromise<Any>)
}
external interface IModelParser {
    @nativeInvoke
    operator fun invoke(value: Any): Any
}
external interface IModelFormatter {
    @nativeInvoke
    operator fun invoke(value: Any): Any
}
external interface IModelViewChangeListener {
    @nativeInvoke
    operator fun invoke()
}
external interface `T$6` {
    @nativeInvoke
    operator fun invoke(scope: IScope): Any
}
external interface IRootScopeService {
    fun `$apply`(): Any
    fun `$apply`(exp: String): Any
    fun `$apply`(exp: (scope: IScope) -> Any): Any
    fun `$applyAsync`(): Any
    fun `$applyAsync`(exp: String): Any
    fun `$applyAsync`(exp: (scope: IScope) -> Any): Any
    fun `$broadcast`(name: String, vararg args: Any): IAngularEvent
    fun `$destroy`()
    fun `$digest`()
    fun `$emit`(name: String, vararg args: Any): IAngularEvent
    fun `$eval`(): Any
    fun `$eval`(expression: String, locals: Any? = definedExternally /* null */): Any
    fun `$eval`(expression: (scope: IScope) -> Any, locals: Any? = definedExternally /* null */): Any
    fun `$evalAsync`()
    fun `$evalAsync`(expression: String, locals: Any? = definedExternally /* null */)
    fun `$evalAsync`(expression: (scope: IScope) -> Unit, locals: Any? = definedExternally /* null */)
    fun `$new`(isolate: Boolean? = definedExternally /* null */, parent: IScope? = definedExternally /* null */): IScope
    fun `$on`(name: String, listener: (event: IAngularEvent, args: Any) -> Any): () -> Unit
    fun `$watch`(watchExpression: String, listener: String? = definedExternally /* null */, objectEquality: Boolean? = definedExternally /* null */): () -> Unit
    fun <T> `$watch`(watchExpression: String, listener: ((newValue: T, oldValue: T, scope: IScope) -> Any)? = definedExternally /* null */, objectEquality: Boolean? = definedExternally /* null */): () -> Unit
    fun `$watch`(watchExpression: (scope: IScope) -> Any, listener: String? = definedExternally /* null */, objectEquality: Boolean? = definedExternally /* null */): () -> Unit
    fun <T> `$watch`(watchExpression: (scope: IScope) -> T, listener: ((newValue: T, oldValue: T, scope: IScope) -> Any)? = definedExternally /* null */, objectEquality: Boolean? = definedExternally /* null */): () -> Unit
    fun <T> `$watchCollection`(watchExpression: String, listener: (newValue: T, oldValue: T, scope: IScope) -> Any): () -> Unit
    fun <T> `$watchCollection`(watchExpression: (scope: IScope) -> T, listener: (newValue: T, oldValue: T, scope: IScope) -> Any): () -> Unit
    fun `$watchGroup`(watchExpressions: Array<Any>, listener: (newValue: Any, oldValue: Any, scope: IScope) -> Any): () -> Unit
    fun `$watchGroup`(watchExpressions: Array<`T$6`>, listener: (newValue: Any, oldValue: Any, scope: IScope) -> Any): () -> Unit
    var `$parent`: IScope
    var `$root`: IRootScopeService
    var `$id`: Number
    var `$$isolateBindings`: Any
    var `$$phase`: Any
}
external interface IScope : IRootScopeService
external interface IRepeatScope : IScope {
    var `$index`: Number
    var `$first`: Boolean
    var `$middle`: Boolean
    var `$last`: Boolean
    var `$even`: Boolean
    var `$odd`: Boolean
}
external interface IAngularEvent {
    var targetScope: IScope
    var currentScope: IScope
    var name: String
    val stopPropagation: (() -> Unit)? get() = definedExternally
    fun preventDefault()
    var defaultPrevented: Boolean
}
external interface IWindowService : Window {
    @nativeGetter
    operator fun get(key: String): Any?
    @nativeSetter
    operator fun set(key: String, value: Any)
}
external interface ITimeoutService {
    @nativeInvoke
    operator fun invoke(delay: Number? = definedExternally /* null */, invokeApply: Boolean? = definedExternally /* null */): IPromise<Unit>
    @nativeInvoke
    operator fun <T> invoke(fn: (args: Any) -> dynamic /* T | IPromise<T> */, delay: Number? = definedExternally /* null */, invokeApply: Boolean? = definedExternally /* null */, vararg args: Any): IPromise<T>
    fun cancel(promise: IPromise<Any>? = definedExternally /* null */): Boolean
}
external interface IIntervalService {
    @nativeInvoke
    operator fun invoke(func: Function<*>, delay: Number, count: Number? = definedExternally /* null */, invokeApply: Boolean? = definedExternally /* null */, vararg args: Any): IPromise<Any>
    fun cancel(promise: IPromise<Any>): Boolean
}
external interface IFilterService {
    @nativeInvoke
    operator fun invoke(name: String /* "filter" */): IFilterFilter
    @nativeInvoke
    operator fun invoke(name: String /* "currency" */): IFilterCurrency
    @nativeInvoke
    operator fun invoke(name: String /* "number" */): IFilterNumber
    @nativeInvoke
    operator fun invoke(name: String /* "date" */): IFilterDate
    @nativeInvoke
    operator fun invoke(name: String /* "json" */): IFilterJson
    @nativeInvoke
    operator fun invoke(name: String /* "lowercase" */): IFilterLowercase
    @nativeInvoke
    operator fun invoke(name: String /* "uppercase" */): IFilterUppercase
    @nativeInvoke
    operator fun invoke(name: String /* "limitTo" */): IFilterLimitTo
    @nativeInvoke
    operator fun invoke(name: String /* "orderBy" */): IFilterOrderBy
    @nativeInvoke
    operator fun <T> invoke(name: String): T
}
external interface IFilterFilter {
    @nativeInvoke
    operator fun <T> invoke(array: Array<T>, expression: String, comparator: Boolean? = definedExternally /* null */): Array<T>
    @nativeInvoke
    operator fun <T> invoke(array: Array<T>, expression: String, comparator: IFilterFilterComparatorFunc<T>? = definedExternally /* null */): Array<T>
    @nativeInvoke
    operator fun <T> invoke(array: Array<T>, expression: IFilterFilterPatternObject, comparator: Boolean? = definedExternally /* null */): Array<T>
    @nativeInvoke
    operator fun <T> invoke(array: Array<T>, expression: IFilterFilterPatternObject, comparator: IFilterFilterComparatorFunc<T>? = definedExternally /* null */): Array<T>
    @nativeInvoke
    operator fun <T> invoke(array: Array<T>, expression: IFilterFilterPredicateFunc<T>, comparator: Boolean? = definedExternally /* null */): Array<T>
    @nativeInvoke
    operator fun <T> invoke(array: Array<T>, expression: IFilterFilterPredicateFunc<T>, comparator: IFilterFilterComparatorFunc<T>? = definedExternally /* null */): Array<T>
    @nativeInvoke
    operator fun <T> invoke(array: Array<T>, expression: String): Array<T>
    @nativeInvoke
    operator fun <T> invoke(array: Array<T>, expression: IFilterFilterPatternObject): Array<T>
    @nativeInvoke
    operator fun <T> invoke(array: Array<T>, expression: IFilterFilterPredicateFunc<T>): Array<T>
}
external interface IFilterFilterPatternObject {
    @nativeGetter
    operator fun get(name: String): Any?
    @nativeSetter
    operator fun set(name: String, value: Any)
}
external interface IFilterFilterPredicateFunc<T> {
    @nativeInvoke
    operator fun invoke(value: T, index: Number, array: Array<T>): Boolean
}
external interface IFilterFilterComparatorFunc<T> {
    @nativeInvoke
    operator fun invoke(actual: T, expected: T): Boolean
}
external interface IFilterOrderByItem {
    var value: Any
    var type: String
    var index: Any
}
external interface IFilterOrderByComparatorFunc {
    @nativeInvoke
    operator fun invoke(left: IFilterOrderByItem, right: IFilterOrderByItem): dynamic /* Number /* 0 */ | Number /* 1 */ | Number /* -1 */ */
}
external interface IFilterCurrency {
    @nativeInvoke
    operator fun invoke(amount: Number, symbol: String? = definedExternally /* null */, fractionSize: Number? = definedExternally /* null */): String
}
external interface IFilterNumber {
    @nativeInvoke
    operator fun invoke(value: String, fractionSize: String? = definedExternally /* null */): String
    @nativeInvoke
    operator fun invoke(value: String, fractionSize: Number? = definedExternally /* null */): String
    @nativeInvoke
    operator fun invoke(value: Number, fractionSize: String? = definedExternally /* null */): String
    @nativeInvoke
    operator fun invoke(value: Number, fractionSize: Number? = definedExternally /* null */): String
    @nativeInvoke
    operator fun invoke(value: String): String
    @nativeInvoke
    operator fun invoke(value: Number): String
}
external interface IFilterDate {
    @nativeInvoke
    operator fun invoke(date: String, format: String? = definedExternally /* null */, timezone: String? = definedExternally /* null */): String
    @nativeInvoke
    operator fun invoke(date: Number, format: String? = definedExternally /* null */, timezone: String? = definedExternally /* null */): String
    @nativeInvoke
    operator fun invoke(date: Date, format: String? = definedExternally /* null */, timezone: String? = definedExternally /* null */): String
}
external interface IFilterJson {
    @nativeInvoke
    operator fun invoke(`object`: Any, spacing: Number? = definedExternally /* null */): String
}
external interface IFilterLowercase {
    @nativeInvoke
    operator fun invoke(value: String): String
}
external interface IFilterUppercase {
    @nativeInvoke
    operator fun invoke(value: String): String
}
external interface IFilterLimitTo {
    @nativeInvoke
    operator fun <T> invoke(input: Array<T>, limit: String, begin: String? = definedExternally /* null */): Array<T>
    @nativeInvoke
    operator fun <T> invoke(input: Array<T>, limit: String, begin: Number? = definedExternally /* null */): Array<T>
    @nativeInvoke
    operator fun <T> invoke(input: Array<T>, limit: Number, begin: String? = definedExternally /* null */): Array<T>
    @nativeInvoke
    operator fun <T> invoke(input: Array<T>, limit: Number, begin: Number? = definedExternally /* null */): Array<T>
    @nativeInvoke
    operator fun invoke(input: String, limit: String, begin: String? = definedExternally /* null */): String
    @nativeInvoke
    operator fun invoke(input: String, limit: String, begin: Number? = definedExternally /* null */): String
    @nativeInvoke
    operator fun invoke(input: String, limit: Number, begin: String? = definedExternally /* null */): String
    @nativeInvoke
    operator fun invoke(input: String, limit: Number, begin: Number? = definedExternally /* null */): String
    @nativeInvoke
    operator fun invoke(input: Number, limit: String, begin: String? = definedExternally /* null */): String
    @nativeInvoke
    operator fun invoke(input: Number, limit: String, begin: Number? = definedExternally /* null */): String
    @nativeInvoke
    operator fun invoke(input: Number, limit: Number, begin: String? = definedExternally /* null */): String
    @nativeInvoke
    operator fun invoke(input: Number, limit: Number, begin: Number? = definedExternally /* null */): String
    @nativeInvoke
    operator fun <T> invoke(input: Array<T>, limit: String): Array<T>
    @nativeInvoke
    operator fun <T> invoke(input: Array<T>, limit: Number): Array<T>
    @nativeInvoke
    operator fun invoke(input: String, limit: String): String
    @nativeInvoke
    operator fun invoke(input: String, limit: Number): String
    @nativeInvoke
    operator fun invoke(input: Number, limit: String): String
    @nativeInvoke
    operator fun invoke(input: Number, limit: Number): String
}
external interface IFilterOrderBy {
    @nativeInvoke
    operator fun <T> invoke(array: Array<T>, expression: String, reverse: Boolean? = definedExternally /* null */, comparator: IFilterOrderByComparatorFunc? = definedExternally /* null */): Array<T>
    @nativeInvoke
    operator fun <T> invoke(array: Array<T>, expression: (value: T) -> Any, reverse: Boolean? = definedExternally /* null */, comparator: IFilterOrderByComparatorFunc? = definedExternally /* null */): Array<T>
    @nativeInvoke
    operator fun <T> invoke(array: Array<T>, expression: Array<dynamic /* String | (value: T) -> Any */>, reverse: Boolean? = definedExternally /* null */, comparator: IFilterOrderByComparatorFunc? = definedExternally /* null */): Array<T>
}
external interface IFilterProvider : IServiceProvider {
    fun register(name: String): IServiceProvider
    fun register(name: Any?): IServiceProvider
}
external interface ILocaleService {
    var id: String
    var NUMBER_FORMATS: ILocaleNumberFormatDescriptor
    var DATETIME_FORMATS: ILocaleDateTimeFormatDescriptor
    fun pluralCat(num: Any): String
}
external interface ILocaleNumberFormatDescriptor {
    var DECIMAL_SEP: String
    var GROUP_SEP: String
    var PATTERNS: Array<ILocaleNumberPatternDescriptor>
    var CURRENCY_SYM: String
}
external interface ILocaleNumberPatternDescriptor {
    var minInt: Number
    var minFrac: Number
    var maxFrac: Number
    var posPre: String
    var posSuf: String
    var negPre: String
    var negSuf: String
    var gSize: Number
    var lgSize: Number
}
external interface ILocaleDateTimeFormatDescriptor {
    var MONTH: Array<String>
    var SHORTMONTH: Array<String>
    var DAY: Array<String>
    var SHORTDAY: Array<String>
    var AMPMS: Array<String>
    var medium: String
    var short: String
    var fullDate: String
    var longDate: String
    var mediumDate: String
    var shortDate: String
    var mediumTime: String
    var shortTime: String
}
external interface ILogService {
    var debug: ILogCall
    var error: ILogCall
    var info: ILogCall
    var log: ILogCall
    var warn: ILogCall
}
external interface ILogProvider : IServiceProvider {
    fun debugEnabled(): Boolean
    fun debugEnabled(enabled: Boolean): ILogProvider
}
external interface ILogCall {
    @nativeInvoke
    operator fun invoke(vararg args: Any)
}
external interface IParseService {
    @nativeInvoke
    operator fun invoke(expression: String, interceptorFn: ((value: Any, scope: IScope, locals: Any) -> Any)? = definedExternally /* null */, expensiveChecks: Boolean? = definedExternally /* null */): ICompiledExpression
}
external interface IParseProvider {
    fun logPromiseWarnings(): Boolean
    fun logPromiseWarnings(value: Boolean): IParseProvider
    fun unwrapPromises(): Boolean
    fun unwrapPromises(value: Boolean): IParseProvider
    fun addLiteral(literalName: String, literalValue: Any)
    fun setIdentifierFns(identifierStart: ((character: String, codePoint: Number) -> Boolean)? = definedExternally /* null */, identifierContinue: ((character: String, codePoint: Number) -> Boolean)? = definedExternally /* null */)
}
external interface ICompiledExpression {
    @nativeInvoke
    operator fun invoke(context: Any, locals: Any? = definedExternally /* null */): Any
    var literal: Boolean
    var constant: Boolean
    fun assign(context: Any, value: Any): Any
}
external interface ILocationService {
    fun absUrl(): String
    fun hash(): String
    fun hash(newHash: String?): ILocationService
    fun host(): String
    fun path(): String
    fun path(path: String): ILocationService
    fun port(): Number
    fun protocol(): String
    fun replace(): ILocationService
    fun search(): Any
    fun search(search: Any): ILocationService
    fun search(search: String, paramValue: String): ILocationService
    fun search(search: String, paramValue: Number): ILocationService
    fun search(search: String, paramValue: Boolean): ILocationService
    fun search(search: String, paramValue: Array<String>): ILocationService
    fun search(search: String, paramValue: Nothing?): ILocationService
    fun state(): Any
    fun state(state: Any): ILocationService
    fun url(): String
    fun url(url: String): ILocationService
}
external interface `T$7` {
    var enabled: Boolean? get() = definedExternally; set(value) = definedExternally
    var requireBase: Boolean? get() = definedExternally; set(value) = definedExternally
    var rewriteLinks: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface ILocationProvider : IServiceProvider {
    fun hashPrefix(): String
    fun hashPrefix(prefix: String): ILocationProvider
    fun html5Mode(): Boolean
    fun html5Mode(active: Boolean): ILocationProvider
    fun html5Mode(mode: `T$7`): ILocationProvider
}
external interface IDocumentService : JQLite {
    @nativeGetter
    override operator fun get(index: Number): HTMLElement? /* HTMLElement & Document */
    @nativeSetter
    override operator fun set(index: Number, value: HTMLElement /* HTMLElement & Document */)
}
external interface IExceptionHandlerService {
    @nativeInvoke
    operator fun invoke(exception: Error, cause: String? = definedExternally /* null */)
}
external interface IRootElementService : JQLite
external interface IQResolveReject<T> {
    @nativeInvoke
    operator fun invoke()
    @nativeInvoke
    operator fun invoke(value: T)
}
external interface `T$8`<T> {
    @nativeGetter
    operator fun get(key: String): IPromise<T>?
    @nativeSetter
    operator fun set(key: String, value: IPromise<T>)
}
external interface IQService {
    @nativeInvoke
    operator fun <T> invoke(resolver: (resolve: IQResolveReject<T>, reject: IQResolveReject<Any>) -> Any): IPromise<T>
    fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> all(values: dynamic /* JsTuple<dynamic /* T1 | IPromise<T1> */, dynamic /* T2 | IPromise<T2> */, dynamic /* T3 | IPromise<T3> */, dynamic /* T4 | IPromise<T4> */, dynamic /* T5 | IPromise<T5> */, dynamic /* T6 | IPromise<T6> */, dynamic /* T7 | IPromise<T7> */, dynamic /* T8 | IPromise<T8> */, dynamic /* T9 | IPromise<T9> */, dynamic /* T10 | IPromise<T10> */> */): IPromise<dynamic /* JsTuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> */>
    fun <T1, T2, T3, T4, T5, T6, T7, T8, T9> all(values: dynamic /* JsTuple<dynamic /* T1 | IPromise<T1> */, dynamic /* T2 | IPromise<T2> */, dynamic /* T3 | IPromise<T3> */, dynamic /* T4 | IPromise<T4> */, dynamic /* T5 | IPromise<T5> */, dynamic /* T6 | IPromise<T6> */, dynamic /* T7 | IPromise<T7> */, dynamic /* T8 | IPromise<T8> */, dynamic /* T9 | IPromise<T9> */> */): IPromise<dynamic /* JsTuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> */>
    fun <T1, T2, T3, T4, T5, T6, T7, T8> all(values: dynamic /* JsTuple<dynamic /* T1 | IPromise<T1> */, dynamic /* T2 | IPromise<T2> */, dynamic /* T3 | IPromise<T3> */, dynamic /* T4 | IPromise<T4> */, dynamic /* T5 | IPromise<T5> */, dynamic /* T6 | IPromise<T6> */, dynamic /* T7 | IPromise<T7> */, dynamic /* T8 | IPromise<T8> */> */): IPromise<dynamic /* JsTuple<T1, T2, T3, T4, T5, T6, T7, T8> */>
    fun <T1, T2, T3, T4, T5, T6, T7> all(values: dynamic /* JsTuple<dynamic /* T1 | IPromise<T1> */, dynamic /* T2 | IPromise<T2> */, dynamic /* T3 | IPromise<T3> */, dynamic /* T4 | IPromise<T4> */, dynamic /* T5 | IPromise<T5> */, dynamic /* T6 | IPromise<T6> */, dynamic /* T7 | IPromise<T7> */> */): IPromise<dynamic /* JsTuple<T1, T2, T3, T4, T5, T6, T7> */>
    fun <T1, T2, T3, T4, T5, T6> all(values: dynamic /* JsTuple<dynamic /* T1 | IPromise<T1> */, dynamic /* T2 | IPromise<T2> */, dynamic /* T3 | IPromise<T3> */, dynamic /* T4 | IPromise<T4> */, dynamic /* T5 | IPromise<T5> */, dynamic /* T6 | IPromise<T6> */> */): IPromise<dynamic /* JsTuple<T1, T2, T3, T4, T5, T6> */>
    fun <T1, T2, T3, T4, T5> all(values: dynamic /* JsTuple<dynamic /* T1 | IPromise<T1> */, dynamic /* T2 | IPromise<T2> */, dynamic /* T3 | IPromise<T3> */, dynamic /* T4 | IPromise<T4> */, dynamic /* T5 | IPromise<T5> */> */): IPromise<dynamic /* JsTuple<T1, T2, T3, T4, T5> */>
    fun <T1, T2, T3, T4> all(values: dynamic /* JsTuple<dynamic /* T1 | IPromise<T1> */, dynamic /* T2 | IPromise<T2> */, dynamic /* T3 | IPromise<T3> */, dynamic /* T4 | IPromise<T4> */> */): IPromise<dynamic /* JsTuple<T1, T2, T3, T4> */>
    fun <T1, T2, T3> all(values: dynamic /* JsTuple<dynamic /* T1 | IPromise<T1> */, dynamic /* T2 | IPromise<T2> */, dynamic /* T3 | IPromise<T3> */> */): IPromise<dynamic /* JsTuple<T1, T2, T3> */>
    fun <T1, T2> all(values: dynamic /* JsTuple<dynamic /* T1 | IPromise<T1> */, dynamic /* T2 | IPromise<T2> */> */): IPromise<dynamic /* JsTuple<T1, T2> */>
    fun <TAll> all(promises: Array<IPromise<TAll>>): IPromise<Array<TAll>>
    fun <T> all(promises: Any?): IPromise<T>
    fun <T> defer(): IDeferred<T>
    fun <T> race(promises: Array<IPromise<T>>): IPromise<T>
    fun <T> race(promises: `T$8`<T>): IPromise<T>
    fun reject(reason: Any? = definedExternally /* null */): IPromise<Any?>
    fun <T> resolve(value: T): IPromise<T>
    fun <T> resolve(value: IPromise<T>): IPromise<T>
    fun <T1, T2> resolve(value: IPromise<T1>): IPromise<dynamic /* T1 | T2 */>
    fun <T1, T2> resolve(value: T2): IPromise<dynamic /* T1 | T2 */>
    fun resolve(): IPromise<Unit>
    fun <T> `when`(value: T): IPromise<T>
    fun <T> `when`(value: IPromise<T>): IPromise<T>
    fun <T1, T2> `when`(value: IPromise<T1>): IPromise<dynamic /* T1 | T2 */>
    fun <T1, T2> `when`(value: T2): IPromise<dynamic /* T1 | T2 */>
    fun <TResult, T> `when`(value: T, successCallback: (promiseValue: T) -> dynamic /* TResult | IPromise<TResult> */): IPromise<TResult>
    fun <TResult, T> `when`(value: IPromise<T>, successCallback: (promiseValue: T) -> dynamic /* TResult | IPromise<TResult> */): IPromise<TResult>
    fun <TResult, T> `when`(value: T, successCallback: (promiseValue: T) -> dynamic /* TResult | IPromise<TResult> */, errorCallback: ((reason: Any) -> Any)?, notifyCallback: ((state: Any) -> Any)? = definedExternally /* null */): IPromise<TResult>
    fun <TResult, TResult2, T> `when`(value: IPromise<T>, successCallback: (promiseValue: T) -> dynamic /* TResult | IPromise<TResult> */, errorCallback: (reason: Any) -> dynamic /* TResult2 | IPromise<TResult2> */, notifyCallback: ((state: Any) -> Any)? = definedExternally /* null */): IPromise<dynamic /* TResult | TResult2 */>
    fun `when`(): IPromise<Unit>
}
external interface IQProvider {
    fun errorOnUnhandledRejections(): Boolean
    fun errorOnUnhandledRejections(value: Boolean): IQProvider
}
external interface IPromise<T> {
    fun <TResult> then(successCallback: (promiseValue: T) -> dynamic /* TResult | IPromise<TResult> */, errorCallback: Nothing? = definedExternally /* null */, notifyCallback: ((state: Any) -> Any)? = definedExternally /* null */): IPromise<TResult>
    fun <TResult1, TResult2> then(successCallback: (promiseValue: T) -> dynamic /* IPromise<TResult1> | TResult2 */, errorCallback: Nothing? = definedExternally /* null */, notifyCallback: ((state: Any) -> Any)? = definedExternally /* null */): IPromise<dynamic /* TResult1 | TResult2 */>
    fun <TResult, TCatch> then(successCallback: (promiseValue: T) -> dynamic /* TResult | IPromise<TResult> */, errorCallback: (reason: Any) -> dynamic /* TCatch | IPromise<TCatch> */, notifyCallback: ((state: Any) -> Any)? = definedExternally /* null */): IPromise<dynamic /* TResult | TCatch */>
    fun <TResult1, TResult2, TCatch1, TCatch2> then(successCallback: (promiseValue: T) -> dynamic /* IPromise<TResult1> | TResult2 */, errorCallback: (reason: Any) -> dynamic /* IPromise<TCatch1> | TCatch2 */, notifyCallback: ((state: Any) -> Any)? = definedExternally /* null */): IPromise<dynamic /* TResult1 | TResult2 | TCatch1 | TCatch2 */>
    fun <TCatch> catch(onRejected: (reason: Any) -> dynamic /* TCatch | IPromise<TCatch> */): IPromise<dynamic /* T | TCatch */>
    fun <TCatch1, TCatch2> catch(onRejected: (reason: Any) -> dynamic /* IPromise<TCatch1> | TCatch2 */): IPromise<dynamic /* T | TCatch1 | TCatch2 */>
    fun finally(finallyCallback: () -> Any): IPromise<T>
}
external interface IDeferred<T> {
    fun resolve(value: T? = definedExternally /* null */)
    fun resolve(value: IPromise<T>? = definedExternally /* null */)
    fun reject(reason: Any? = definedExternally /* null */)
    fun notify(state: Any? = definedExternally /* null */)
    var promise: IPromise<T>
    fun resolve()
}
external interface IAnchorScrollService {
    @nativeInvoke
    operator fun invoke()
    @nativeInvoke
    operator fun invoke(hash: String)
    var yOffset: Any
}
external interface IAnchorScrollProvider : IServiceProvider {
    fun disableAutoScrolling()
}
external interface `T$9` {
    var capacity: Number? get() = definedExternally; set(value) = definedExternally
}
external interface ICacheFactoryService {
    @nativeInvoke
    operator fun invoke(cacheId: String, optionsMap: `T$9`? = definedExternally /* null */): ICacheObject
    fun info(): Any
    fun get(cacheId: String): ICacheObject
}
external interface `T$10` {
    var id: String
    var size: Number
}
external interface ICacheObject {
    fun info(): `T$10`
    fun <T> put(key: String, value: T? = definedExternally /* null */): T
    fun <T> get(key: String): T
    fun remove(key: String)
    fun removeAll()
    fun destroy()
}
external interface ICompileService {
    @nativeInvoke
    operator fun invoke(element: String, transclude: ITranscludeFunction? = definedExternally /* null */, maxPriority: Number? = definedExternally /* null */): ITemplateLinkingFunction
    @nativeInvoke
    operator fun invoke(element: Element, transclude: ITranscludeFunction? = definedExternally /* null */, maxPriority: Number? = definedExternally /* null */): ITemplateLinkingFunction
    @nativeInvoke
    operator fun invoke(element: JQuery, transclude: ITranscludeFunction? = definedExternally /* null */, maxPriority: Number? = definedExternally /* null */): ITemplateLinkingFunction
}
external interface ICompileProvider : IServiceProvider {
    fun <TScope : IScope> directive(name: String, directiveFactory: IDirectiveFactory<TScope>): ICompileProvider
    fun <TScope : IScope> directive(name: String, directiveFactory: Array<dynamic /* String | IDirectiveFactory<TScope> */>): ICompileProvider
    fun <TScope : IScope> directive(`object`: `T$3`<TScope>): ICompileProvider
    fun component(name: String, options: IComponentOptions): ICompileProvider
    fun aHrefSanitizationWhitelist(): RegExp
    fun aHrefSanitizationWhitelist(regexp: RegExp): ICompileProvider
    fun imgSrcSanitizationWhitelist(): RegExp
    fun imgSrcSanitizationWhitelist(regexp: RegExp): ICompileProvider
    fun debugInfoEnabled(): Boolean
    fun debugInfoEnabled(enabled: Boolean): ICompileProvider
    fun preAssignBindingsEnabled(): Boolean
    fun preAssignBindingsEnabled(enabled: Boolean): ICompileProvider
    fun onChangesTtl(): Number
    fun onChangesTtl(limit: Number): ICompileProvider
    fun commentDirectivesEnabled(): Boolean
    fun commentDirectivesEnabled(enabled: Boolean): ICompileProvider
    fun cssClassDirectivesEnabled(): Boolean
    fun cssClassDirectivesEnabled(enabled: Boolean): ICompileProvider
    fun strictComponentBindingsEnabled(): Boolean
    fun strictComponentBindingsEnabled(enabled: Boolean): ICompileProvider
}
external interface ICloneAttachFunction {
    @nativeInvoke
    operator fun invoke(clonedElement: JQLite? = definedExternally /* null */, scope: IScope? = definedExternally /* null */): Any
}
external interface ITemplateLinkingFunction {
    @nativeInvoke
    operator fun invoke(scope: IScope, cloneAttachFn: ICloneAttachFunction? = definedExternally /* null */, options: ITemplateLinkingFunctionOptions? = definedExternally /* null */): JQLite
}
external interface `T$11` {
    var instance: IController
}
external interface `T$12` {
    @nativeGetter
    operator fun get(controller: String): `T$11`?
    @nativeSetter
    operator fun set(controller: String, value: `T$11`)
}
external interface ITemplateLinkingFunctionOptions {
    var parentBoundTranscludeFn: ITranscludeFunction? get() = definedExternally; set(value) = definedExternally
    var transcludeControllers: `T$12`? get() = definedExternally; set(value) = definedExternally
    var futureParentElement: JQuery? get() = definedExternally; set(value) = definedExternally
}
external interface ITranscludeFunction {
    @nativeInvoke
    operator fun invoke(scope: IScope, cloneAttachFn: ICloneAttachFunction, futureParentElement: JQuery? = definedExternally /* null */, slotName: String? = definedExternally /* null */): JQLite
    @nativeInvoke
    operator fun invoke(cloneAttachFn: ICloneAttachFunction? = definedExternally /* null */, futureParentElement: JQuery? = definedExternally /* null */, slotName: String? = definedExternally /* null */): JQLite
    fun isSlotFilled(slotName: String): Boolean
}
external interface IControllerLocals {
    var `$scope`: IScope
    var `$element`: JQuery
}
external interface IControllerService {
    @nativeInvoke
    operator fun <T> invoke(controllerConstructor: Any?, locals: Any? = definedExternally /* null */, later: Boolean? = definedExternally /* null */, ident: String? = definedExternally /* null */): T
    @nativeInvoke
    operator fun <T> invoke(controllerConstructor: Function<*>, locals: IControllerLocals? = definedExternally /* null */, later: Boolean? = definedExternally /* null */, ident: String? = definedExternally /* null */): T
    @nativeInvoke
    operator fun <T> invoke(controllerConstructor: Function<*>, locals: Any? = definedExternally /* null */, later: Boolean? = definedExternally /* null */, ident: String? = definedExternally /* null */): T
    @nativeInvoke
    operator fun <T> invoke(controllerName: String, locals: Any? = definedExternally /* null */, later: Boolean? = definedExternally /* null */, ident: String? = definedExternally /* null */): T
    @nativeInvoke
    operator fun <T> invoke(controllerConstructor: Function<*>): T
}
external interface IControllerProvider : IServiceProvider {
    fun register(name: String, controllerConstructor: Function<*>)
    fun register(name: String, dependencyAnnotatedConstructor: Array<Any>)
    fun allowGlobals()
}
external interface IXhrFactory<T> {
    @nativeInvoke
    operator fun invoke(method: String, url: String): T
}
external interface IHttpService {
    @nativeInvoke
    operator fun <T> invoke(config: IRequestConfig): IPromise<IHttpResponse<T>>
    fun <T> get(url: String, config: IRequestShortcutConfig? = definedExternally /* null */): IPromise<IHttpResponse<T>>
    fun <T> delete(url: String, config: IRequestShortcutConfig? = definedExternally /* null */): IPromise<IHttpResponse<T>>
    fun <T> head(url: String, config: IRequestShortcutConfig? = definedExternally /* null */): IPromise<IHttpResponse<T>>
    fun <T> jsonp(url: String, config: IRequestShortcutConfig? = definedExternally /* null */): IPromise<IHttpResponse<T>>
    fun <T> post(url: String, data: Any, config: IRequestShortcutConfig? = definedExternally /* null */): IPromise<IHttpResponse<T>>
    fun <T> put(url: String, data: Any, config: IRequestShortcutConfig? = definedExternally /* null */): IPromise<IHttpResponse<T>>
    fun <T> patch(url: String, data: Any, config: IRequestShortcutConfig? = definedExternally /* null */): IPromise<IHttpResponse<T>>
    var defaults: IHttpProviderDefaults
    var pendingRequests: Array<IRequestConfig>
}
external interface IRequestShortcutConfig : IHttpProviderDefaults {
    var params: Any? get() = definedExternally; set(value) = definedExternally
    var data: Any? get() = definedExternally; set(value) = definedExternally
    var timeout: dynamic /* Number | IPromise<Any> */ get() = definedExternally; set(value) = definedExternally
    var responseType: String? get() = definedExternally; set(value) = definedExternally
    var jsonpCallbackParam: String? get() = definedExternally; set(value) = definedExternally
}
external interface `T$13` {
    @nativeGetter
    operator fun get(type: String): dynamic /* EventListener | EventListenerObject */
    @nativeSetter
    operator fun set(type: String, value: EventListener)
    @nativeSetter
    operator fun set(type: String, value: (Event) -> Unit)
}
external interface IRequestConfig : IRequestShortcutConfig {
    var method: String
    var url: String
    var eventHandlers: `T$13`? get() = definedExternally; set(value) = definedExternally
    var uploadEventHandlers: `T$13`? get() = definedExternally; set(value) = definedExternally
}
external interface `T$14` {
    @nativeGetter
    operator fun get(name: String): String?
    @nativeSetter
    operator fun set(name: String, value: String)
}
external interface IHttpHeadersGetter {
    @nativeInvoke
    operator fun invoke(): `T$14`
    @nativeInvoke
    operator fun invoke(headerName: String): String
}
external interface IHttpPromiseCallback<T> {
    @nativeInvoke
    operator fun invoke(data: T, status: Number, headers: IHttpHeadersGetter, config: IRequestConfig)
}
external interface IHttpResponse<T> {
    var data: T
    var status: Number
    var headers: IHttpHeadersGetter
    var config: IRequestConfig
    var statusText: String
    var xhrStatus: dynamic /* String /* "complete" */ | String /* "error" */ | String /* "timeout" */ | String /* "abort" */ */
}
external interface IHttpRequestTransformer {
    @nativeInvoke
    operator fun invoke(data: Any, headersGetter: IHttpHeadersGetter): Any
}
external interface IHttpResponseTransformer {
    @nativeInvoke
    operator fun invoke(data: Any, headersGetter: IHttpHeadersGetter, status: Number): Any
}
external interface HttpHeaderType {
    @nativeGetter
    operator fun get(requestType: String): dynamic /* String | (config: IRequestConfig) -> String */
    @nativeSetter
    operator fun set(requestType: String, value: String)
    @nativeSetter
    operator fun set(requestType: String, value: (config: IRequestConfig) -> String)
}
external interface IHttpRequestConfigHeaders {
    @nativeGetter
    operator fun get(requestType: String): Any?
    @nativeSetter
    operator fun set(requestType: String, value: Any)
    var common: Any? get() = definedExternally; set(value) = definedExternally
    var get: Any? get() = definedExternally; set(value) = definedExternally
    var post: Any? get() = definedExternally; set(value) = definedExternally
    var put: Any? get() = definedExternally; set(value) = definedExternally
    var patch: Any? get() = definedExternally; set(value) = definedExternally
}
external interface IHttpProviderDefaults {
    var cache: Any? get() = definedExternally; set(value) = definedExternally
    var transformRequest: dynamic /* IHttpRequestTransformer | Array<IHttpRequestTransformer> */ get() = definedExternally; set(value) = definedExternally
    var transformResponse: dynamic /* IHttpResponseTransformer | Array<IHttpResponseTransformer> */ get() = definedExternally; set(value) = definedExternally
    var headers: IHttpRequestConfigHeaders? get() = definedExternally; set(value) = definedExternally
    var xsrfHeaderName: String? get() = definedExternally; set(value) = definedExternally
    var xsrfCookieName: String? get() = definedExternally; set(value) = definedExternally
    var withCredentials: Boolean? get() = definedExternally; set(value) = definedExternally
    var paramSerializer: dynamic /* String | (obj: Any) -> String */ get() = definedExternally; set(value) = definedExternally
}
external interface IHttpInterceptor {
    val request: ((config: IRequestConfig) -> dynamic /* IRequestConfig | IPromise<IRequestConfig> */)? get() = definedExternally
    val requestError: ((rejection: Any) -> dynamic /* IRequestConfig | IPromise<IRequestConfig> */)? get() = definedExternally
    val response: ((response: IHttpResponse<Any>) -> dynamic /* IHttpResponse<T> | IPromise<IHttpResponse<T>> */)? get() = definedExternally
    val responseError: ((rejection: Any) -> dynamic /* IHttpResponse<T> | IPromise<IHttpResponse<T>> */)? get() = definedExternally
}
external interface IHttpInterceptorFactory {
    @nativeInvoke
    operator fun invoke(vararg args: Any): IHttpInterceptor
}
external interface IHttpProvider : IServiceProvider {
    var defaults: IHttpProviderDefaults
    var interceptors: Array<dynamic /* String | IHttpInterceptorFactory | Array<dynamic /* String | IHttpInterceptorFactory */> */>
    fun useApplyAsync(): Boolean
    fun useApplyAsync(value: Boolean): IHttpProvider
    fun useLegacyPromiseExtensions(value: Boolean): dynamic /* Boolean | IHttpProvider */
}
external interface IHttpBackendService {
    @nativeInvoke
    operator fun invoke(method: String, url: String, post: Any? = definedExternally /* null */, callback: Function<*>? = definedExternally /* null */, headers: Any? = definedExternally /* null */, timeout: Number? = definedExternally /* null */, withCredentials: Boolean? = definedExternally /* null */)
}
external interface IInterpolateService {
    @nativeInvoke
    operator fun invoke(text: String, mustHaveExpression: Boolean? = definedExternally /* null */, trustedContext: String? = definedExternally /* null */, allOrNothing: Boolean? = definedExternally /* null */): IInterpolationFunction
    fun endSymbol(): String
    fun startSymbol(): String
}
external interface IInterpolationFunction {
    @nativeInvoke
    operator fun invoke(context: Any): String
}
external interface IInterpolateProvider : IServiceProvider {
    fun startSymbol(): String
    fun startSymbol(value: String): IInterpolateProvider
    fun endSymbol(): String
    fun endSymbol(value: String): IInterpolateProvider
}
external interface ITemplateCacheService : ICacheObject
external interface ISCEService {
    fun getTrusted(type: String, mayBeTrusted: Any): Any
    fun getTrustedCss(value: Any): Any
    fun getTrustedHtml(value: Any): Any
    fun getTrustedJs(value: Any): Any
    fun getTrustedResourceUrl(value: Any): Any
    fun getTrustedUrl(value: Any): Any
    fun parse(type: String, expression: String): (context: Any, locals: Any) -> Any
    fun parseAsCss(expression: String): (context: Any, locals: Any) -> Any
    fun parseAsHtml(expression: String): (context: Any, locals: Any) -> Any
    fun parseAsJs(expression: String): (context: Any, locals: Any) -> Any
    fun parseAsResourceUrl(expression: String): (context: Any, locals: Any) -> Any
    fun parseAsUrl(expression: String): (context: Any, locals: Any) -> Any
    fun trustAs(type: String, value: Any): Any
    fun trustAsHtml(value: Any): Any
    fun trustAsJs(value: Any): Any
    fun trustAsResourceUrl(value: Any): Any
    fun trustAsUrl(value: Any): Any
    fun isEnabled(): Boolean
}
external interface ISCEProvider : IServiceProvider {
    fun enabled(value: Boolean)
}
external interface ISCEDelegateService {
    fun getTrusted(type: String, mayBeTrusted: Any): Any
    fun trustAs(type: String, value: Any): Any
    fun valueOf(value: Any): Any
}
external interface ISCEDelegateProvider : IServiceProvider {
    fun resourceUrlBlacklist(): Array<Any>
    fun resourceUrlBlacklist(blacklist: Array<Any>)
    fun resourceUrlWhitelist(): Array<Any>
    fun resourceUrlWhitelist(whitelist: Array<Any>)
}
external interface ITemplateRequestService {
    @nativeInvoke
    operator fun invoke(tpl: String, ignoreRequestError: Boolean? = definedExternally /* null */): IPromise<String>
    var totalPendingRequests: Number
}
external interface IComponentOptions {
    var controller: dynamic /* String | Any? | (args: Any) -> dynamic /* Unit | IController */ | Array<dynamic /* String | Any? | (args: Any) -> dynamic /* Unit | IController */ */> */ get() = definedExternally; set(value) = definedExternally
    var controllerAs: String? get() = definedExternally; set(value) = definedExternally
    var template: dynamic /* String | (args: Any) -> String | Array<dynamic /* String | (args: Any) -> String */> */ get() = definedExternally; set(value) = definedExternally
    var templateUrl: dynamic /* String | (args: Any) -> String | Array<dynamic /* String | (args: Any) -> String */> */ get() = definedExternally; set(value) = definedExternally
    var bindings: `T$14`? get() = definedExternally; set(value) = definedExternally
    var transclude: dynamic /* Boolean | `T$14` */ get() = definedExternally; set(value) = definedExternally
    var require: `T$14`? get() = definedExternally; set(value) = definedExternally
}
external interface IController {
    val `$onInit`: (() -> Unit)? get() = definedExternally
    val `$doCheck`: (() -> Unit)? get() = definedExternally
    val `$onChanges`: ((onChangesObj: IOnChangesObject) -> Unit)? get() = definedExternally
    val `$onDestroy`: (() -> Unit)? get() = definedExternally
    val `$postLink`: (() -> Unit)? get() = definedExternally
    @nativeGetter
    operator fun get(s: String): Any?
    @nativeSetter
    operator fun set(s: String, value: Any)
}
external interface IOnInit {
    fun `$onInit`()
}
external interface IDoCheck {
    fun `$doCheck`()
}
external interface IOnChanges {
    fun `$onChanges`(onChangesObj: IOnChangesObject)
}
external interface IOnDestroy {
    fun `$onDestroy`()
}
external interface IPostLink {
    fun `$postLink`()
}
external interface IOnChangesObject {
    @nativeGetter
    operator fun get(property: String): IChangesObject<Any>?
    @nativeSetter
    operator fun set(property: String, value: IChangesObject<Any>)
}
external interface IChangesObject<T> {
    var currentValue: T
    var previousValue: T
    fun isFirstChange(): Boolean
}
external interface IDirectiveFactory<TScope : IScope> {
    @nativeInvoke
    operator fun invoke(vararg args: Any): dynamic /* IDirective<TScope> | IDirectiveLinkFn<TScope> */
}
external interface `T$15` {
    @nativeGetter
    operator fun get(key: String): IController?
    @nativeSetter
    operator fun set(key: String, value: IController)
}
external interface IDirectiveLinkFn<TScope : IScope> {
    @nativeInvoke
    operator fun invoke(scope: TScope, instanceElement: JQLite, instanceAttributes: IAttributes, controller: IController? = definedExternally /* null */, transclude: ITranscludeFunction? = definedExternally /* null */)
    @nativeInvoke
    operator fun invoke(scope: TScope, instanceElement: JQLite, instanceAttributes: IAttributes, controller: Array<IController>? = definedExternally /* null */, transclude: ITranscludeFunction? = definedExternally /* null */)
    @nativeInvoke
    operator fun invoke(scope: TScope, instanceElement: JQLite, instanceAttributes: IAttributes, controller: `T$15`? = definedExternally /* null */, transclude: ITranscludeFunction? = definedExternally /* null */)
    @nativeInvoke
    operator fun invoke(scope: TScope, instanceElement: JQLite, instanceAttributes: IAttributes)
}
external interface IDirectivePrePost<TScope : IScope> {
    var pre: IDirectiveLinkFn<TScope>? get() = definedExternally; set(value) = definedExternally
    var post: IDirectiveLinkFn<TScope>? get() = definedExternally; set(value) = definedExternally
}
external interface IDirectiveCompileFn<TScope : IScope> {
    @nativeInvoke
    operator fun invoke(templateElement: JQLite, templateAttributes: IAttributes, transclude: ITranscludeFunction): dynamic /* Unit | IDirectiveLinkFn<TScope> | IDirectivePrePost<TScope> */
}
external interface IDirective<TScope : IScope> {
    var compile: IDirectiveCompileFn<TScope>? get() = definedExternally; set(value) = definedExternally
    var controller: dynamic /* String | Any? | (args: Any) -> dynamic /* Unit | IController */ | Array<dynamic /* String | Any? | (args: Any) -> dynamic /* Unit | IController */ */> */ get() = definedExternally; set(value) = definedExternally
    var controllerAs: String? get() = definedExternally; set(value) = definedExternally
    var bindToController: dynamic /* Boolean | `T$14` */ get() = definedExternally; set(value) = definedExternally
    var link: dynamic /* IDirectiveLinkFn<TScope> | IDirectivePrePost<TScope> */ get() = definedExternally; set(value) = definedExternally
    var multiElement: Boolean? get() = definedExternally; set(value) = definedExternally
    var priority: Number? get() = definedExternally; set(value) = definedExternally
    var replace: Boolean? get() = definedExternally; set(value) = definedExternally
    var require: dynamic /* String | Array<String> | `T$14` */ get() = definedExternally; set(value) = definedExternally
    var restrict: String? get() = definedExternally; set(value) = definedExternally
    var scope: dynamic /* Boolean | `T$14` */ get() = definedExternally; set(value) = definedExternally
    var template: dynamic /* String | (tElement: JQLite, tAttrs: IAttributes) -> String */ get() = definedExternally; set(value) = definedExternally
    var templateNamespace: String? get() = definedExternally; set(value) = definedExternally
    var templateUrl: dynamic /* String | (tElement: JQLite, tAttrs: IAttributes) -> String */ get() = definedExternally; set(value) = definedExternally
    var terminal: Boolean? get() = definedExternally; set(value) = definedExternally
    var transclude: dynamic /* Boolean | String /* "element" */ | `T$14` */ get() = definedExternally; set(value) = definedExternally
}
external interface IAugmentedJQueryStatic : JQueryStatic
external interface IAugmentedJQuery : JQLite
external interface IComponentController : IController
external interface IHttpParamSerializer {
    @nativeInvoke
    operator fun invoke(obj: Any): String
}
