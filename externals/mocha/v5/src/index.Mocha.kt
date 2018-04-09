@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsModule("mocha")
@file:JsNonModule

package js.externals.mocha.Mocha

import kotlin.js.*
import js.externals.mocha.*

external interface `T$0` {
    var grep: RegExp? get() = definedExternally; set(value) = definedExternally
    var ui: String? get() = definedExternally; set(value) = definedExternally
    var reporter: dynamic /* String | ReporterConstructor */ get() = definedExternally; set(value) = definedExternally
    var timeout: Number? get() = definedExternally; set(value) = definedExternally
    var reporterOptions: Any? get() = definedExternally; set(value) = definedExternally
    var slow: Number? get() = definedExternally; set(value) = definedExternally
    var bail: Boolean? get() = definedExternally; set(value) = definedExternally
}

external open class Mocha(options: `T$0`? = definedExternally /* null */) {
    open var currentTest: ITestDefinition = definedExternally
    open fun setup(`interface`: String /* "bdd" */): Mocha = definedExternally
    open fun setup(`interface`: String /* "tdd" */): Mocha = definedExternally
    open fun setup(`interface`: String /* "qunit" */): Mocha = definedExternally
    open fun setup(`interface`: String /* "exports" */): Mocha = definedExternally
    open fun setup(options: MochaSetupOptions): Mocha = definedExternally
    open fun bail(value: Boolean? = definedExternally /* null */): Mocha = definedExternally
    open fun addFile(file: String): Mocha = definedExternally
    open fun reporter(name: String, reporterOptions: Any? = definedExternally /* null */): Mocha = definedExternally
    open fun reporter(reporter: ReporterConstructor, reporterOptions: Any? = definedExternally /* null */): Mocha = definedExternally
    open fun ui(value: String): Mocha = definedExternally
    open fun grep(value: String): Mocha = definedExternally
    open fun grep(value: RegExp): Mocha = definedExternally
    open fun invert(): Mocha = definedExternally
    open fun ignoreLeaks(value: Boolean): Mocha = definedExternally
    open fun checkLeaks(): Mocha = definedExternally
    open fun throwError(error: Error): Unit = definedExternally
    open fun growl(): Mocha = definedExternally
    open fun globals(value: String): Mocha = definedExternally
    open fun globals(values: Array<String>): Mocha = definedExternally
    open fun useColors(value: Boolean): Mocha = definedExternally
    open fun useInlineDiffs(value: Boolean): Mocha = definedExternally
    open fun timeout(value: Number): Mocha = definedExternally
    open fun slow(value: Number): Mocha = definedExternally
    open fun enableTimeouts(value: Boolean): Mocha = definedExternally
    open fun asyncOnly(value: Boolean): Mocha = definedExternally
    open fun noHighlighting(value: Boolean): Mocha = definedExternally
    open fun run(onComplete: ((failures: Number) -> Unit)? = definedExternally /* null */): IRunner = definedExternally
}
external interface InterfaceContributions {
    var bdd: Any
    var tdd: Any
    var qunit: Any
    var exports: Any
}
external interface ISuiteCallbackContext {
    fun timeout(ms: String): ISuiteCallbackContext /* this */
    fun timeout(ms: Number): ISuiteCallbackContext /* this */
    fun retries(n: Number): ISuiteCallbackContext /* this */
    fun slow(ms: Number): ISuiteCallbackContext /* this */
}
external interface IHookCallbackContext {
    fun skip(): IHookCallbackContext /* this */
    fun timeout(ms: String): IHookCallbackContext /* this */
    fun timeout(ms: Number): IHookCallbackContext /* this */
    @nativeGetter
    operator fun get(index: String): Any?
    @nativeSetter
    operator fun set(index: String, value: Any)
}
external interface ITestCallbackContext {
    fun skip(): ITestCallbackContext /* this */
    fun timeout(ms: String): ITestCallbackContext /* this */
    fun timeout(ms: Number): ITestCallbackContext /* this */
    fun retries(n: Number): ITestCallbackContext /* this */
    fun slow(ms: Number): ITestCallbackContext /* this */
    @nativeGetter
    operator fun get(index: String): Any?
    @nativeSetter
    operator fun set(index: String, value: Any)
}
external interface IRunnable {
    var title: String
    var fn: Function<*>
    var async: Boolean
    var sync: Boolean
    var timedOut: Boolean
    fun timeout(n: String): IRunnable /* this */
    fun timeout(n: Number): IRunnable /* this */
    var duration: Number? get() = definedExternally; set(value) = definedExternally
}
external interface ISuite {
    var parent: ISuite
    var title: String
    fun fullTitle(): String
}
external interface ITest : IRunnable {
    var parent: ISuite
    var pending: Boolean
    var state: dynamic /* String /* "failed" */ | String /* "passed" */ | Nothing? */
    fun fullTitle(): String
}
external interface IBeforeAndAfterContext : IHookCallbackContext {
    var currentTest: ITest
}
external interface IStats {
    var suites: Number
    var tests: Number
    var passes: Number
    var pending: Number
    var failures: Number
    var start: Date? get() = definedExternally; set(value) = definedExternally
    var end: Date? get() = definedExternally; set(value) = definedExternally
    var duration: Date? get() = definedExternally; set(value) = definedExternally
}
external interface IRunner {
    var stats: IStats? get() = definedExternally; set(value) = definedExternally
    var started: Boolean
    var suite: ISuite
    var total: Number
    var failures: Number
    var grep: (re: String, invert: Boolean) -> IRunner /* this */
    var grepTotal: (suite: ISuite) -> Number
    var globals: (arr: Array<String>) -> dynamic /* Array<String> | IRunner */
    var abort: () -> IRunner /* this */
    var run: (fn: ((failures: Number) -> Unit)? /*= null*/) -> IRunner /* this */
}
external interface IContextDefinition {
    @nativeInvoke
    operator fun invoke(description: String, callback: (`this`: ISuiteCallbackContext) -> Unit): ISuite
    fun only(description: String, callback: (`this`: ISuiteCallbackContext) -> Unit): ISuite
    fun skip(description: String, callback: (`this`: ISuiteCallbackContext) -> Unit)
    fun timeout(ms: String)
    fun timeout(ms: Number)
}
external interface ITestDefinition {
    @nativeInvoke
    operator fun invoke(expectation: String, callback: ((`this`: ITestCallbackContext, done: (error: Any? /*= null*/) -> Unit) -> dynamic /* Unit | PromiseLike<Any> */)? = definedExternally /* null */): ITest
    fun only(expectation: String, callback: ((`this`: ITestCallbackContext, done: (error: Any? /*= null*/) -> Unit) -> dynamic /* Unit | PromiseLike<Any> */)? = definedExternally /* null */): ITest
    fun skip(expectation: String, callback: ((`this`: ITestCallbackContext, done: (error: Any? /*= null*/) -> Unit) -> dynamic /* Unit | PromiseLike<Any> */)? = definedExternally /* null */)
    fun timeout(ms: String)
    fun timeout(ms: Number)
    var state: dynamic /* String /* "failed" */ | String /* "passed" */ | Nothing? */
}
external var describe: IContextDefinition = definedExternally
external var xdescribe: IContextDefinition = definedExternally
external var context: IContextDefinition = definedExternally
external var suite: IContextDefinition = definedExternally
external var it: ITestDefinition = definedExternally
external var xit: ITestDefinition = definedExternally
external var test: ITestDefinition = definedExternally
external var specify: ITestDefinition = definedExternally
external fun setup(callback: (`this`: IBeforeAndAfterContext, done: (error: Any? /*= null*/) -> Unit) -> dynamic /* Unit | PromiseLike<Any> */): Unit = definedExternally
external fun teardown(callback: (`this`: IBeforeAndAfterContext, done: (error: Any? /*= null*/) -> Unit) -> dynamic /* Unit | PromiseLike<Any> */): Unit = definedExternally
external fun suiteSetup(callback: (`this`: IHookCallbackContext, done: (error: Any? /*= null*/) -> Unit) -> dynamic /* Unit | PromiseLike<Any> */): Unit = definedExternally
external fun suiteTeardown(callback: (`this`: IHookCallbackContext, done: (error: Any? /*= null*/) -> Unit) -> dynamic /* Unit | PromiseLike<Any> */): Unit = definedExternally
external fun before(callback: (`this`: IHookCallbackContext, done: (error: Any? /*= null*/) -> Unit) -> dynamic /* Unit | PromiseLike<Any> */): Unit = definedExternally
external fun before(description: String, callback: (`this`: IHookCallbackContext, done: (error: Any? /*= null*/) -> Unit) -> dynamic /* Unit | PromiseLike<Any> */): Unit = definedExternally
external fun after(callback: (`this`: IHookCallbackContext, done: (error: Any? /*= null*/) -> Unit) -> dynamic /* Unit | PromiseLike<Any> */): Unit = definedExternally
external fun after(description: String, callback: (`this`: IHookCallbackContext, done: (error: Any? /*= null*/) -> Unit) -> dynamic /* Unit | PromiseLike<Any> */): Unit = definedExternally
external fun beforeEach(callback: (`this`: IBeforeAndAfterContext, done: (error: Any? /*= null*/) -> Unit) -> dynamic /* Unit | PromiseLike<Any> */): Unit = definedExternally
external fun beforeEach(description: String, callback: (`this`: IBeforeAndAfterContext, done: (error: Any? /*= null*/) -> Unit) -> dynamic /* Unit | PromiseLike<Any> */): Unit = definedExternally
external fun afterEach(callback: (`this`: IBeforeAndAfterContext, done: (error: Any? /*= null*/) -> Unit) -> dynamic /* Unit | PromiseLike<Any> */): Unit = definedExternally
external fun afterEach(description: String, callback: (`this`: IBeforeAndAfterContext, done: (error: Any? /*= null*/) -> Unit) -> dynamic /* Unit | PromiseLike<Any> */): Unit = definedExternally
