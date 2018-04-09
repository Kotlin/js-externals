@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")

package js.externals.mocha

import js.externals.mocha.Mocha.*
import kotlin.js.*

@JsModule("mocha")
@JsNonModule
@JsName("Mocha")
external open class _Mocha(options: MochaOptions? = definedExternally /* null */) {
    open var _growl: Any = definedExternally
    open var _reporter: Any = definedExternally
    open var _ui: Any = definedExternally
    open var suite: Suite = definedExternally
    open var files: Array<String> = definedExternally
    open var options: MochaInstanceOptions = definedExternally
    open fun bail(bail: Boolean? = definedExternally /* null */): _Mocha /* this */ = definedExternally
    open fun addFile(file: String): _Mocha /* this */ = definedExternally
    open fun reporter(reporter: dynamic /* String /* "Base" */ | String /* "base" */ | String /* "Dot" */ | String /* "dot" */ | String /* "TAP" */ | String /* "tap" */ | String /* "JSON" */ | String /* "json" */ | String /* "HTML" */ | String /* "html" */ | String /* "List" */ | String /* "list" */ | String /* "Min" */ | String /* "min" */ | String /* "Spec" */ | String /* "spec" */ | String /* "Nyan" */ | String /* "nyan" */ | String /* "XUnit" */ | String /* "xunit" */ | String /* "Markdown" */ | String /* "markdown" */ | String /* "Progress" */ | String /* "progress" */ | String /* "Landing" */ | String /* "landing" */ | String /* "JSONStream" */ | String /* "json-stream" */ */, reporterOptions: Any? = definedExternally /* null */): _Mocha /* this */ = definedExternally
    open fun reporter(reporter: String? = definedExternally /* null */, reporterOptions: Any? = definedExternally /* null */): _Mocha /* this */ = definedExternally
    open fun reporter(reporter: ReporterConstructor? = definedExternally /* null */, reporterOptions: Any? = definedExternally /* null */): _Mocha /* this */ = definedExternally
    open fun ui(name: String /* "bdd" */): _Mocha /* this */ = definedExternally
    open fun ui(name: String /* "tdd" */): _Mocha /* this */ = definedExternally
    open fun ui(name: String /* "qunit" */): _Mocha /* this */ = definedExternally
    open fun ui(name: String /* "exports" */): _Mocha /* this */ = definedExternally
    open fun ui(name: String? = definedExternally /* null */): _Mocha /* this */ = definedExternally
    open fun fgrep(str: String): _Mocha /* this */ = definedExternally
    open fun grep(re: String): _Mocha /* this */ = definedExternally
    open fun grep(re: RegExp): _Mocha /* this */ = definedExternally
    open fun invert(): _Mocha /* this */ = definedExternally
    open fun ignoreLeaks(ignore: Boolean): _Mocha /* this */ = definedExternally
    open fun checkLeaks(): _Mocha /* this */ = definedExternally
    open fun fullTrace(): _Mocha /* this */ = definedExternally
    open fun growl(): _Mocha /* this */ = definedExternally
    open fun globals(globals: String): _Mocha /* this */ = definedExternally
    open fun globals(globals: Array<String>): _Mocha /* this */ = definedExternally
    open fun useColors(colors: Boolean): _Mocha /* this */ = definedExternally
    open fun useInlineDiffs(inlineDiffs: Boolean): _Mocha /* this */ = definedExternally
    open fun hideDiff(hideDiff: Boolean): _Mocha /* this */ = definedExternally
    open fun timeout(timeout: String): _Mocha /* this */ = definedExternally
    open fun timeout(timeout: Number): _Mocha /* this */ = definedExternally
    open fun retries(n: Number): _Mocha /* this */ = definedExternally
    open fun slow(slow: String): _Mocha /* this */ = definedExternally
    open fun slow(slow: Number): _Mocha /* this */ = definedExternally
    open fun enableTimeouts(enabled: Boolean? = definedExternally /* null */): _Mocha /* this */ = definedExternally
    open fun asyncOnly(): _Mocha /* this */ = definedExternally
    open fun noHighlighting(): _Mocha /* this */ = definedExternally
    open fun allowUncaught(): Boolean = definedExternally
    open fun delay(): Boolean = definedExternally
    open fun forbidOnly(): Boolean = definedExternally
    open fun forbidPending(): Boolean = definedExternally
    open fun run(fn: ((failures: Number) -> Unit)? = definedExternally /* null */): Runner = definedExternally
    open fun loadFiles(fn: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
    open fun reporter(): _Mocha /* this */ = definedExternally
}

external fun run(): Unit = definedExternally
external var before: HookFunction = definedExternally
external var suiteSetup: HookFunction = definedExternally
external var after: HookFunction = definedExternally
external var suiteTeardown: HookFunction = definedExternally
external var beforeEach: HookFunction = definedExternally
external var setup: HookFunction = definedExternally
external var afterEach: HookFunction = definedExternally
external var teardown: HookFunction = definedExternally
external var describe: SuiteFunction = definedExternally
external var context: SuiteFunction = definedExternally
external var suite: SuiteFunction = definedExternally

@JsName("xdescribe")
external var _xdescribe: (title: String, fn: () -> Unit) -> dynamic /* Unit | Suite */ = definedExternally
@JsName("xcontext")
external var _xcontext: (title: String, fn: () -> Unit) -> dynamic /* Unit | Suite */ = definedExternally

external var it: TestFunction = definedExternally
external var specify: TestFunction = definedExternally
external var test: TestFunction = definedExternally
external var xit: PendingTestFunction = definedExternally
external var xspecify: PendingTestFunction = definedExternally
external var mocha: BrowserMocha = definedExternally
external interface BrowserMocha : _Mocha {
    fun throwError(err: Any): Any?
    fun setup(opts: String? /* "bdd" */ = definedExternally /* null */): BrowserMocha /* this */
    fun setup(opts: String? /* "tdd" */ = definedExternally /* null */): BrowserMocha /* this */
    fun setup(opts: String? /* "qunit" */ = definedExternally /* null */): BrowserMocha /* this */
    fun setup(opts: String? /* "exports" */ = definedExternally /* null */): BrowserMocha /* this */
    fun setup(opts: MochaSetupOptions? = definedExternally /* null */): BrowserMocha /* this */
    fun setup(): BrowserMocha /* this */
}
external interface MochaSetupOptions : MochaOptions {
    var require: Array<String>? get() = definedExternally; set(value) = definedExternally
    var fullTrace: Boolean? get() = definedExternally; set(value) = definedExternally
}
