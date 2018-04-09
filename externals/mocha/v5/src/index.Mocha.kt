@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsModule("mocha")
@file:JsNonModule
package js.externals.mocha.Mocha

import js.externals.mocha.NodeJS.EventEmitter
import js.externals.mocha._Mocha
import kotlin.js.Date
import kotlin.js.Promise
import kotlin.js.RegExp

external interface HookFunction

external interface SuiteFunction {
    var only: ExclusiveSuiteFunction
    var skip: (title: String, fn: Suite.() -> Unit) -> dynamic /* Unit | Suite */
}
external interface ExclusiveSuiteFunction

external interface TestFunction {
    var only: ExclusiveTestFunction
    var skip: PendingTestFunction
    fun retries(n: Number)
}

external interface ExclusiveTestFunction

external interface PendingTestFunction

external var afterEach: HookFunction = definedExternally
external var after: HookFunction = definedExternally
external var beforeEach: HookFunction = definedExternally
external var before: HookFunction = definedExternally
external var describe: SuiteFunction = definedExternally
external var it: TestFunction = definedExternally
external var xit: PendingTestFunction = definedExternally
external var setup: HookFunction = definedExternally
external var suiteSetup: HookFunction = definedExternally
external var suiteTeardown: HookFunction = definedExternally
external var suite: SuiteFunction = definedExternally
external var teardown: HookFunction = definedExternally
external var test: TestFunction = definedExternally
external fun run(): Unit = definedExternally
external open class Runnable : EventEmitter {
    constructor(title: String, fn: ((`this`: Context, done: (err: Any? /*= null*/) -> Unit) -> Unit)? = definedExternally /* null */)
    constructor(title: String, fn: ((`this`: Context) -> Promise<Any>)? = definedExternally /* null */)
    open var _slow: Any = definedExternally
    open var _enableTimeouts: Any = definedExternally
    open var _retries: Any = definedExternally
    open var _currentRetry: Any = definedExternally
    open var _timeout: Any = definedExternally
    open var _timeoutError: Any = definedExternally
    open var title: String = definedExternally
    open var fn: dynamic /* (`this`: Context, done: (err: Any? /*= null*/) -> Unit) -> Unit | (`this`: Context) -> Promise<Any> */ = definedExternally
    open var body: String = definedExternally
    open var async: Boolean = definedExternally
    open var sync: Boolean = definedExternally
    open var timedOut: Boolean = definedExternally
    open var pending: Boolean = definedExternally
    open var duration: Number = definedExternally
    open var parent: Suite = definedExternally
    open var state: dynamic /* String /* "failed" */ | String /* "passed" */ */ = definedExternally
    open var timer: Any = definedExternally
    open var ctx: Context = definedExternally
    open var callback: (err: Any? /*= null*/) -> Unit = definedExternally
    open var allowUncaught: Boolean = definedExternally
    open var file: String = definedExternally
    open fun timeout(): Number = definedExternally
    open fun timeout(ms: String): Runnable /* this */ = definedExternally
    open fun timeout(ms: Number): Runnable /* this */ = definedExternally
    open fun slow(): Number = definedExternally
    open fun slow(ms: String): Runnable /* this */ = definedExternally
    open fun slow(ms: Number): Runnable /* this */ = definedExternally
    open fun enableTimeouts(): Boolean = definedExternally
    open fun enableTimeouts(enabled: Boolean): Runnable /* this */ = definedExternally
    open fun skip(): Any? = definedExternally
    open fun isPending(): Boolean = definedExternally
    open fun isFailed(): Boolean = definedExternally
    open fun isPassed(): Boolean = definedExternally
    open fun retries(): Number = definedExternally
    open fun retries(n: Number): Unit = definedExternally
    open fun currentRetry(): Number = definedExternally
    open fun currentRetry(n: Number): Unit = definedExternally
    open fun fullTitle(): String = definedExternally
    open fun titlePath(): Array<String> = definedExternally
    open fun clearTimeout(): Unit = definedExternally
    open fun inspect(): String = definedExternally
    open fun resetTimeout(): Unit = definedExternally
    open fun globals(): Array<String> = definedExternally
    open fun globals(globals: Array<String>): Unit = definedExternally
    open fun run(fn: (err: Any? /*= null*/) -> Unit): Unit = definedExternally
    fun on(event: String /* "error" */, listener: (error: Any) -> Unit): Runnable /* this */
    fun once(event: String /* "error" */, listener: (error: Any) -> Unit): Runnable /* this */
    fun addListener(event: String /* "error" */, listener: (error: Any) -> Unit): Runnable /* this */
    fun removeListener(event: String /* "error" */, listener: (error: Any) -> Unit): Runnable /* this */
    fun prependListener(event: String /* "error" */, listener: (error: Any) -> Unit): Runnable /* this */
    fun prependOnceListener(event: String /* "error" */, listener: (error: Any) -> Unit): Runnable /* this */
    fun emit(name: String /* "error" */, error: Any): Boolean
    fun on(event: String, listener: (args: Any) -> Unit): Runnable /* this */
    fun once(event: String, listener: (args: Any) -> Unit): Runnable /* this */
    fun addListener(event: String, listener: (args: Any) -> Unit): Runnable /* this */
    fun removeListener(event: String, listener: (args: Any) -> Unit): Runnable /* this */
    fun prependListener(event: String, listener: (args: Any) -> Unit): Runnable /* this */
    fun prependOnceListener(event: String, listener: (args: Any) -> Unit): Runnable /* this */
    fun emit(name: String, vararg args: Any): Boolean
}
external open class Context {
    open var _runnable: Any = definedExternally
    open var test: Runnable = definedExternally
    open var currentTest: Test = definedExternally
    open fun runnable(): Runnable = definedExternally
    open fun runnable(runnable: Runnable): Context /* this */ = definedExternally
    open fun runnable(runnable: IRunnable): Context /* this */ = definedExternally
    open fun timeout(): Number = definedExternally
    open fun timeout(ms: String): Context /* this */ = definedExternally
    open fun timeout(ms: Number): Context /* this */ = definedExternally
    open fun enableTimeouts(): Boolean = definedExternally
    open fun enableTimeouts(enabled: Boolean): Context /* this */ = definedExternally
    open fun slow(): Number = definedExternally
    open fun slow(ms: String): Context /* this */ = definedExternally
    open fun slow(ms: Number): Context /* this */ = definedExternally
    open fun skip(): Any? = definedExternally
    open fun retries(): Number = definedExternally
    open fun retries(n: Number): Context /* this */ = definedExternally
    @nativeGetter
    open operator fun get(key: String): Any? = definedExternally
    @nativeSetter
    open operator fun set(key: String, value: Any): Unit = definedExternally
}
external open class Runner : EventEmitter {
    constructor(suite: Suite, delay: Boolean)
    constructor(suite: ISuite, delay: Boolean)
    open var _globals: Any = definedExternally
    open var _abort: Any = definedExternally
    open var _delay: Any = definedExternally
    open var _defaultGrep: Any = definedExternally
    open var next: Any = definedExternally
    open var hookErr: Any = definedExternally
    open var prevGlobalsLength: Any = definedExternally
    open var nextSuite: Any = definedExternally
    open var suite: Suite = definedExternally
    open var started: Boolean = definedExternally
    open var total: Number = definedExternally
    open var failures: Number = definedExternally
    open var asyncOnly: Boolean = definedExternally
    open var allowUncaught: Boolean = definedExternally
    open var fullStackTrace: Boolean = definedExternally
    open var forbidOnly: Boolean = definedExternally
    open var forbidPending: Boolean = definedExternally
    open var ignoreLeaks: Boolean = definedExternally
    open var test: Test = definedExternally
    open var currentRunnable: Runnable = definedExternally
    open var stats: Stats = definedExternally
    open fun grep(re: RegExp, invert: Boolean): Runner /* this */ = definedExternally
    open fun grepTotal(suite: Suite): Number = definedExternally
    open fun grepTotal(suite: ISuite): Number = definedExternally
    open fun globals(): Array<String> = definedExternally
    open fun globals(arr: Array<String>): Runner /* this */ = definedExternally
    open fun run(fn: ((failures: Number) -> Unit)? = definedExternally /* null */): Runner /* this */ = definedExternally
    open fun abort(): Runner /* this */ = definedExternally
    open fun uncaught(err: Any): Unit = definedExternally
    open fun globalProps(): Array<String> = definedExternally
    open fun checkGlobals(test: Test): Unit = definedExternally
    open fun fail(test: Test, err: Any): Unit = definedExternally
    open fun failHook(hook: Hook, err: Any): Unit = definedExternally
    open fun hook(name: String, fn: () -> Unit): Unit = definedExternally
    open fun hooks(name: String, suites: Array<Suite>, fn: (err: Any? /*= null*/, errSuite: Suite? /*= null*/) -> Unit): Unit = definedExternally
    open fun hookUp(name: String, fn: (err: Any? /*= null*/, errSuite: Suite? /*= null*/) -> Unit): Unit = definedExternally
    open fun hookDown(name: String, fn: (err: Any? /*= null*/, errSuite: Suite? /*= null*/) -> Unit): Unit = definedExternally
    open fun parents(): Array<Suite> = definedExternally
    open fun runTest(fn: (err: Any? /*= null*/) -> Unit): Any = definedExternally
    open fun runTests(suite: Suite, fn: (errSuite: Suite? /*= null*/) -> Unit): Unit = definedExternally
    open fun runSuite(suite: Suite, fn: (errSuite: Suite? /*= null*/) -> Unit): Unit = definedExternally
    companion object {
        fun immediately(callback: Function<*>): Unit = definedExternally
    }
    fun on(event: String /* "waiting" */, listener: (rootSuite: Suite) -> Unit): Runner /* this */
    fun once(event: String /* "waiting" */, listener: (rootSuite: Suite) -> Unit): Runner /* this */
    fun addListener(event: String /* "waiting" */, listener: (rootSuite: Suite) -> Unit): Runner /* this */
    fun removeListener(event: String /* "waiting" */, listener: (rootSuite: Suite) -> Unit): Runner /* this */
    fun prependListener(event: String /* "waiting" */, listener: (rootSuite: Suite) -> Unit): Runner /* this */
    fun prependOnceListener(event: String /* "waiting" */, listener: (rootSuite: Suite) -> Unit): Runner /* this */
    fun emit(name: String /* "waiting" */, rootSuite: Suite): Boolean
    fun on(event: String /* "start" */, listener: () -> Unit): Runner /* this */
    fun once(event: String /* "start" */, listener: () -> Unit): Runner /* this */
    fun addListener(event: String /* "start" */, listener: () -> Unit): Runner /* this */
    fun removeListener(event: String /* "start" */, listener: () -> Unit): Runner /* this */
    fun prependListener(event: String /* "start" */, listener: () -> Unit): Runner /* this */
    fun prependOnceListener(event: String /* "start" */, listener: () -> Unit): Runner /* this */
    fun emit(name: String /* "start" */): Boolean
    fun on(event: String /* "end" */, listener: () -> Unit): Runner /* this */
    fun once(event: String /* "end" */, listener: () -> Unit): Runner /* this */
    fun addListener(event: String /* "end" */, listener: () -> Unit): Runner /* this */
    fun removeListener(event: String /* "end" */, listener: () -> Unit): Runner /* this */
    fun prependListener(event: String /* "end" */, listener: () -> Unit): Runner /* this */
    fun prependOnceListener(event: String /* "end" */, listener: () -> Unit): Runner /* this */
    fun emit(name: String /* "end" */): Boolean
    fun on(event: String /* "suite" */, listener: (suite: Suite) -> Unit): Runner /* this */
    fun once(event: String /* "suite" */, listener: (suite: Suite) -> Unit): Runner /* this */
    fun addListener(event: String /* "suite" */, listener: (suite: Suite) -> Unit): Runner /* this */
    fun removeListener(event: String /* "suite" */, listener: (suite: Suite) -> Unit): Runner /* this */
    fun prependListener(event: String /* "suite" */, listener: (suite: Suite) -> Unit): Runner /* this */
    fun prependOnceListener(event: String /* "suite" */, listener: (suite: Suite) -> Unit): Runner /* this */
    fun emit(name: String /* "suite" */, suite: Suite): Boolean
    fun on(event: String /* "suite end" */, listener: (suite: Suite) -> Unit): Runner /* this */
    fun once(event: String /* "suite end" */, listener: (suite: Suite) -> Unit): Runner /* this */
    fun addListener(event: String /* "suite end" */, listener: (suite: Suite) -> Unit): Runner /* this */
    fun removeListener(event: String /* "suite end" */, listener: (suite: Suite) -> Unit): Runner /* this */
    fun prependListener(event: String /* "suite end" */, listener: (suite: Suite) -> Unit): Runner /* this */
    fun prependOnceListener(event: String /* "suite end" */, listener: (suite: Suite) -> Unit): Runner /* this */
    fun emit(name: String /* "suite end" */, suite: Suite): Boolean
    fun on(event: String /* "test" */, listener: (test: Test) -> Unit): Runner /* this */
    fun once(event: String /* "test" */, listener: (test: Test) -> Unit): Runner /* this */
    fun addListener(event: String /* "test" */, listener: (test: Test) -> Unit): Runner /* this */
    fun removeListener(event: String /* "test" */, listener: (test: Test) -> Unit): Runner /* this */
    fun prependListener(event: String /* "test" */, listener: (test: Test) -> Unit): Runner /* this */
    fun prependOnceListener(event: String /* "test" */, listener: (test: Test) -> Unit): Runner /* this */
    fun emit(name: String /* "test" */, test: Test): Boolean
    fun on(event: String /* "test end" */, listener: (test: Test) -> Unit): Runner /* this */
    fun once(event: String /* "test end" */, listener: (test: Test) -> Unit): Runner /* this */
    fun addListener(event: String /* "test end" */, listener: (test: Test) -> Unit): Runner /* this */
    fun removeListener(event: String /* "test end" */, listener: (test: Test) -> Unit): Runner /* this */
    fun prependListener(event: String /* "test end" */, listener: (test: Test) -> Unit): Runner /* this */
    fun prependOnceListener(event: String /* "test end" */, listener: (test: Test) -> Unit): Runner /* this */
    fun emit(name: String /* "test end" */, test: Test): Boolean
    fun on(event: String /* "hook" */, listener: (hook: Hook) -> Unit): Runner /* this */
    fun once(event: String /* "hook" */, listener: (hook: Hook) -> Unit): Runner /* this */
    fun addListener(event: String /* "hook" */, listener: (hook: Hook) -> Unit): Runner /* this */
    fun removeListener(event: String /* "hook" */, listener: (hook: Hook) -> Unit): Runner /* this */
    fun prependListener(event: String /* "hook" */, listener: (hook: Hook) -> Unit): Runner /* this */
    fun prependOnceListener(event: String /* "hook" */, listener: (hook: Hook) -> Unit): Runner /* this */
    fun emit(name: String /* "hook" */, hook: Hook): Boolean
    fun on(event: String /* "hook end" */, listener: (hook: Hook) -> Unit): Runner /* this */
    fun once(event: String /* "hook end" */, listener: (hook: Hook) -> Unit): Runner /* this */
    fun addListener(event: String /* "hook end" */, listener: (hook: Hook) -> Unit): Runner /* this */
    fun removeListener(event: String /* "hook end" */, listener: (hook: Hook) -> Unit): Runner /* this */
    fun prependListener(event: String /* "hook end" */, listener: (hook: Hook) -> Unit): Runner /* this */
    fun prependOnceListener(event: String /* "hook end" */, listener: (hook: Hook) -> Unit): Runner /* this */
    fun emit(name: String /* "hook end" */, hook: Hook): Boolean
    fun on(event: String /* "pass" */, listener: (test: Test) -> Unit): Runner /* this */
    fun once(event: String /* "pass" */, listener: (test: Test) -> Unit): Runner /* this */
    fun addListener(event: String /* "pass" */, listener: (test: Test) -> Unit): Runner /* this */
    fun removeListener(event: String /* "pass" */, listener: (test: Test) -> Unit): Runner /* this */
    fun prependListener(event: String /* "pass" */, listener: (test: Test) -> Unit): Runner /* this */
    fun prependOnceListener(event: String /* "pass" */, listener: (test: Test) -> Unit): Runner /* this */
    fun emit(name: String /* "pass" */, test: Test): Boolean
    fun on(event: String /* "fail" */, listener: (test: Test, err: Any) -> Unit): Runner /* this */
    fun once(event: String /* "fail" */, listener: (test: Test, err: Any) -> Unit): Runner /* this */
    fun addListener(event: String /* "fail" */, listener: (test: Test, err: Any) -> Unit): Runner /* this */
    fun removeListener(event: String /* "fail" */, listener: (test: Test, err: Any) -> Unit): Runner /* this */
    fun prependListener(event: String /* "fail" */, listener: (test: Test, err: Any) -> Unit): Runner /* this */
    fun prependOnceListener(event: String /* "fail" */, listener: (test: Test, err: Any) -> Unit): Runner /* this */
    fun emit(name: String /* "fail" */, test: Test, err: Any): Boolean
    fun on(event: String /* "pending" */, listener: (test: Test) -> Unit): Runner /* this */
    fun once(event: String /* "pending" */, listener: (test: Test) -> Unit): Runner /* this */
    fun addListener(event: String /* "pending" */, listener: (test: Test) -> Unit): Runner /* this */
    fun removeListener(event: String /* "pending" */, listener: (test: Test) -> Unit): Runner /* this */
    fun prependListener(event: String /* "pending" */, listener: (test: Test) -> Unit): Runner /* this */
    fun prependOnceListener(event: String /* "pending" */, listener: (test: Test) -> Unit): Runner /* this */
    fun emit(name: String /* "pending" */, test: Test): Boolean
    fun on(event: String, listener: (args: Any) -> Unit): Runner /* this */
    fun once(event: String, listener: (args: Any) -> Unit): Runner /* this */
    fun addListener(event: String, listener: (args: Any) -> Unit): Runner /* this */
    fun removeListener(event: String, listener: (args: Any) -> Unit): Runner /* this */
    fun prependListener(event: String, listener: (args: Any) -> Unit): Runner /* this */
    fun prependOnceListener(event: String, listener: (args: Any) -> Unit): Runner /* this */
    fun emit(name: String, vararg args: Any): Boolean
}
external open class Suite : EventEmitter {
    constructor(title: String, parentContext: Context? = definedExternally /* null */)
    constructor(title: String, parentContext: IContext? = definedExternally /* null */)
    open var _beforeEach: Any = definedExternally
    open var _beforeAll: Any = definedExternally
    open var _afterEach: Any = definedExternally
    open var _afterAll: Any = definedExternally
    open var _timeout: Any = definedExternally
    open var _enableTimeouts: Any = definedExternally
    open var _slow: Any = definedExternally
    open var _bail: Any = definedExternally
    open var _retries: Any = definedExternally
    open var _onlyTests: Any = definedExternally
    open var _onlySuites: Any = definedExternally
    open var ctx: Context = definedExternally
    open var suites: Array<Suite> = definedExternally
    open var tests: Array<Test> = definedExternally
    open var pending: Boolean = definedExternally
    open var file: String = definedExternally
    open var root: Boolean = definedExternally
    open var delayed: Boolean = definedExternally
    open var parent: Suite? = definedExternally
    open var title: String = definedExternally
    open fun clone(): Suite = definedExternally
    open fun timeout(): Number = definedExternally
    open fun timeout(ms: String): Suite /* this */ = definedExternally
    open fun timeout(ms: Number): Suite /* this */ = definedExternally
    open fun retries(): Number = definedExternally
    open fun retries(n: String): Suite /* this */ = definedExternally
    open fun retries(n: Number): Suite /* this */ = definedExternally
    open fun enableTimeouts(): Boolean = definedExternally
    open fun enableTimeouts(enabled: Boolean): Suite /* this */ = definedExternally
    open fun slow(): Number = definedExternally
    open fun slow(ms: String): Suite /* this */ = definedExternally
    open fun slow(ms: Number): Suite /* this */ = definedExternally
    open fun bail(): Boolean = definedExternally
    open fun bail(bail: Boolean): Suite /* this */ = definedExternally
    open fun isPending(): Boolean = definedExternally
    open fun addSuite(suite: Suite): Suite /* this */ = definedExternally
    open fun addSuite(suite: ISuite): Suite /* this */ = definedExternally
    open fun addTest(test: Test): Suite /* this */ = definedExternally
    open fun addTest(test: ITest): Suite /* this */ = definedExternally
    open fun fullTitle(): String = definedExternally
    open fun titlePath(): Array<String> = definedExternally
    open fun total(): Number = definedExternally
    open fun eachTest(fn: (test: Test) -> Unit): Suite /* this */ = definedExternally
    open fun run(): Unit = definedExternally
    companion object {
        fun create(parent: Suite, title: String): Suite = definedExternally
        fun create(parent: ISuite, title: String): Suite = definedExternally
    }
    fun on(event: String /* "beforeAll" */, listener: (hook: Hook) -> Unit): Suite /* this */
    fun once(event: String /* "beforeAll" */, listener: (hook: Hook) -> Unit): Suite /* this */
    fun addListener(event: String /* "beforeAll" */, listener: (hook: Hook) -> Unit): Suite /* this */
    fun removeListener(event: String /* "beforeAll" */, listener: (hook: Hook) -> Unit): Suite /* this */
    fun prependListener(event: String /* "beforeAll" */, listener: (hook: Hook) -> Unit): Suite /* this */
    fun prependOnceListener(event: String /* "beforeAll" */, listener: (hook: Hook) -> Unit): Suite /* this */
    fun emit(name: String /* "beforeAll" */, hook: Hook): Boolean
    fun on(event: String /* "afterAll" */, listener: (hook: Hook) -> Unit): Suite /* this */
    fun once(event: String /* "afterAll" */, listener: (hook: Hook) -> Unit): Suite /* this */
    fun addListener(event: String /* "afterAll" */, listener: (hook: Hook) -> Unit): Suite /* this */
    fun removeListener(event: String /* "afterAll" */, listener: (hook: Hook) -> Unit): Suite /* this */
    fun prependListener(event: String /* "afterAll" */, listener: (hook: Hook) -> Unit): Suite /* this */
    fun prependOnceListener(event: String /* "afterAll" */, listener: (hook: Hook) -> Unit): Suite /* this */
    fun emit(name: String /* "afterAll" */, hook: Hook): Boolean
    fun on(event: String /* "beforeEach" */, listener: (hook: Hook) -> Unit): Suite /* this */
    fun once(event: String /* "beforeEach" */, listener: (hook: Hook) -> Unit): Suite /* this */
    fun addListener(event: String /* "beforeEach" */, listener: (hook: Hook) -> Unit): Suite /* this */
    fun removeListener(event: String /* "beforeEach" */, listener: (hook: Hook) -> Unit): Suite /* this */
    fun prependListener(event: String /* "beforeEach" */, listener: (hook: Hook) -> Unit): Suite /* this */
    fun prependOnceListener(event: String /* "beforeEach" */, listener: (hook: Hook) -> Unit): Suite /* this */
    fun emit(name: String /* "beforeEach" */, hook: Hook): Boolean
    fun on(event: String /* "afterEach" */, listener: (hook: Hook) -> Unit): Suite /* this */
    fun once(event: String /* "afterEach" */, listener: (hook: Hook) -> Unit): Suite /* this */
    fun addListener(event: String /* "afterEach" */, listener: (hook: Hook) -> Unit): Suite /* this */
    fun removeListener(event: String /* "afterEach" */, listener: (hook: Hook) -> Unit): Suite /* this */
    fun prependListener(event: String /* "afterEach" */, listener: (hook: Hook) -> Unit): Suite /* this */
    fun prependOnceListener(event: String /* "afterEach" */, listener: (hook: Hook) -> Unit): Suite /* this */
    fun emit(name: String /* "afterEach" */, hook: Hook): Boolean
    fun on(event: String /* "suite" */, listener: (suite: Suite) -> Unit): Suite /* this */
    fun once(event: String /* "suite" */, listener: (suite: Suite) -> Unit): Suite /* this */
    fun addListener(event: String /* "suite" */, listener: (suite: Suite) -> Unit): Suite /* this */
    fun removeListener(event: String /* "suite" */, listener: (suite: Suite) -> Unit): Suite /* this */
    fun prependListener(event: String /* "suite" */, listener: (suite: Suite) -> Unit): Suite /* this */
    fun prependOnceListener(event: String /* "suite" */, listener: (suite: Suite) -> Unit): Suite /* this */
    fun emit(name: String /* "suite" */, suite: Suite): Boolean
    fun on(event: String /* "test" */, listener: (test: Test) -> Unit): Suite /* this */
    fun once(event: String /* "test" */, listener: (test: Test) -> Unit): Suite /* this */
    fun addListener(event: String /* "test" */, listener: (test: Test) -> Unit): Suite /* this */
    fun removeListener(event: String /* "test" */, listener: (test: Test) -> Unit): Suite /* this */
    fun prependListener(event: String /* "test" */, listener: (test: Test) -> Unit): Suite /* this */
    fun prependOnceListener(event: String /* "test" */, listener: (test: Test) -> Unit): Suite /* this */
    fun emit(name: String /* "test" */, test: Test): Boolean
    fun on(event: String /* "run" */, listener: () -> Unit): Suite /* this */
    fun once(event: String /* "run" */, listener: () -> Unit): Suite /* this */
    fun addListener(event: String /* "run" */, listener: () -> Unit): Suite /* this */
    fun removeListener(event: String /* "run" */, listener: () -> Unit): Suite /* this */
    fun prependListener(event: String /* "run" */, listener: () -> Unit): Suite /* this */
    fun prependOnceListener(event: String /* "run" */, listener: () -> Unit): Suite /* this */
    fun emit(name: String /* "run" */): Boolean
    fun on(event: String /* "pre-require" */, listener: (context: MochaGlobals, file: String, mocha: _Mocha) -> Unit): Suite /* this */
    fun once(event: String /* "pre-require" */, listener: (context: MochaGlobals, file: String, mocha: _Mocha) -> Unit): Suite /* this */
    fun addListener(event: String /* "pre-require" */, listener: (context: MochaGlobals, file: String, mocha: _Mocha) -> Unit): Suite /* this */
    fun removeListener(event: String /* "pre-require" */, listener: (context: MochaGlobals, file: String, mocha: _Mocha) -> Unit): Suite /* this */
    fun prependListener(event: String /* "pre-require" */, listener: (context: MochaGlobals, file: String, mocha: _Mocha) -> Unit): Suite /* this */
    fun prependOnceListener(event: String /* "pre-require" */, listener: (context: MochaGlobals, file: String, mocha: _Mocha) -> Unit): Suite /* this */
    fun emit(name: String /* "pre-require" */, context: MochaGlobals, file: String, mocha: _Mocha): Boolean
    fun on(event: String /* "require" */, listener: (module: Any, file: String, mocha: _Mocha) -> Unit): Suite /* this */
    fun once(event: String /* "require" */, listener: (module: Any, file: String, mocha: _Mocha) -> Unit): Suite /* this */
    fun addListener(event: String /* "require" */, listener: (module: Any, file: String, mocha: _Mocha) -> Unit): Suite /* this */
    fun removeListener(event: String /* "require" */, listener: (module: Any, file: String, mocha: _Mocha) -> Unit): Suite /* this */
    fun prependListener(event: String /* "require" */, listener: (module: Any, file: String, mocha: _Mocha) -> Unit): Suite /* this */
    fun prependOnceListener(event: String /* "require" */, listener: (module: Any, file: String, mocha: _Mocha) -> Unit): Suite /* this */
    fun emit(name: String /* "require" */, module: Any, file: String, mocha: _Mocha): Boolean
    fun on(event: String /* "post-require" */, listener: (context: MochaGlobals, file: String, mocha: _Mocha) -> Unit): Suite /* this */
    fun once(event: String /* "post-require" */, listener: (context: MochaGlobals, file: String, mocha: _Mocha) -> Unit): Suite /* this */
    fun addListener(event: String /* "post-require" */, listener: (context: MochaGlobals, file: String, mocha: _Mocha) -> Unit): Suite /* this */
    fun removeListener(event: String /* "post-require" */, listener: (context: MochaGlobals, file: String, mocha: _Mocha) -> Unit): Suite /* this */
    fun prependListener(event: String /* "post-require" */, listener: (context: MochaGlobals, file: String, mocha: _Mocha) -> Unit): Suite /* this */
    fun prependOnceListener(event: String /* "post-require" */, listener: (context: MochaGlobals, file: String, mocha: _Mocha) -> Unit): Suite /* this */
    fun emit(name: String /* "post-require" */, context: MochaGlobals, file: String, mocha: _Mocha): Boolean
    fun on(event: String, listener: (args: Any) -> Unit): Suite /* this */
    fun once(event: String, listener: (args: Any) -> Unit): Suite /* this */
    fun addListener(event: String, listener: (args: Any) -> Unit): Suite /* this */
    fun removeListener(event: String, listener: (args: Any) -> Unit): Suite /* this */
    fun prependListener(event: String, listener: (args: Any) -> Unit): Suite /* this */
    fun prependOnceListener(event: String, listener: (args: Any) -> Unit): Suite /* this */
    fun emit(name: String, vararg args: Any): Boolean
    open fun beforeAll(): Suite /* this */ = definedExternally
    open fun beforeAll(title: String): Suite /* this */ = definedExternally
    open fun afterAll(): Suite /* this */ = definedExternally
    open fun afterAll(title: String): Suite /* this */ = definedExternally
    open fun beforeEach(): Suite /* this */ = definedExternally
    open fun beforeEach(title: String): Suite /* this */ = definedExternally
    open fun afterEach(): Suite /* this */ = definedExternally
    open fun afterEach(title: String): Suite /* this */ = definedExternally
    open fun _createHook(title: String): Hook = definedExternally
}
external open class Hook : Runnable {
    open var _error: Any = definedExternally
    open var type: String /* "hook" */ = definedExternally
    open var originalTitle: String = definedExternally
    open fun error(): Any = definedExternally
    open fun error(err: Any): Unit = definedExternally
}
external open class Test : Runnable {
    open var type: String /* "test" */ = definedExternally
    open var speed: String /* String /* "slow" */ | String /* "medium" */ | String /* "fast" */ */ = definedExternally
    open var err: Error = definedExternally
    open fun clone(): Test = definedExternally
}
external interface Stats {
    var suites: Number
    var tests: Number
    var passes: Number
    var pending: Number
    var failures: Number
    var start: Date? get() = definedExternally; set(value) = definedExternally
    var end: Date? get() = definedExternally; set(value) = definedExternally
    var duration: Number? get() = definedExternally; set(value) = definedExternally
}
external interface ReporterConstructor
external interface MochaOptions {
    var ui: dynamic /* String /* "bdd" */ | String /* "tdd" */ | String /* "qunit" */ | String /* "exports" */ */ get() = definedExternally; set(value) = definedExternally
    var reporter: dynamic /* String | ReporterConstructor */ get() = definedExternally; set(value) = definedExternally
    var reporterOptions: Any? get() = definedExternally; set(value) = definedExternally
    var globals: Array<String>? get() = definedExternally; set(value) = definedExternally
    var timeout: Number? get() = definedExternally; set(value) = definedExternally
    var enableTimeouts: Boolean? get() = definedExternally; set(value) = definedExternally
    var retries: Number? get() = definedExternally; set(value) = definedExternally
    var bail: Boolean? get() = definedExternally; set(value) = definedExternally
    var slow: Number? get() = definedExternally; set(value) = definedExternally
    var ignoreLeaks: Boolean? get() = definedExternally; set(value) = definedExternally
    var fullStackTrace: Boolean? get() = definedExternally; set(value) = definedExternally
    var grep: dynamic /* String | RegExp */ get() = definedExternally; set(value) = definedExternally
    var growl: Boolean? get() = definedExternally; set(value) = definedExternally
    var useColors: Boolean? get() = definedExternally; set(value) = definedExternally
    var inlineDiffs: Boolean? get() = definedExternally; set(value) = definedExternally
    var hideDiff: Boolean? get() = definedExternally; set(value) = definedExternally
    var asyncOnly: Boolean? get() = definedExternally; set(value) = definedExternally
    var delay: Boolean? get() = definedExternally; set(value) = definedExternally
    var forbidOnly: Boolean? get() = definedExternally; set(value) = definedExternally
    var forbidPending: Boolean? get() = definedExternally; set(value) = definedExternally
    var noHighlighting: Boolean? get() = definedExternally; set(value) = definedExternally
    var allowUncaught: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface MochaInstanceOptions : MochaOptions {
    var files: Array<String>? get() = definedExternally; set(value) = definedExternally
}
external interface MochaGlobals {
    var before: HookFunction
    var after: HookFunction
    var beforeEach: HookFunction
    var afterEach: HookFunction
    var describe: SuiteFunction
    var context: SuiteFunction
    var xdescribe: (title: String, fn: (`this`: Suite) -> Unit) -> dynamic /* Unit | Suite */
    var xcontext: (title: String, fn: (`this`: Suite) -> Unit) -> dynamic /* Unit | Suite */
    var it: TestFunction
    var specify: TestFunction
    var xit: PendingTestFunction
    var xspecify: PendingTestFunction
    var suiteSetup: HookFunction
    var suiteTeardown: HookFunction
    var setup: HookFunction
    var teardown: HookFunction
    var suite: SuiteFunction
    var test: TestFunction
    var run: Any?
}
external interface ReporterContributions {
    var Base: Any?
    var base: Any?
    var Dot: Any?
    var dot: Any?
    var TAP: Any?
    var tap: Any?
    var JSON: Any?
    var json: Any?
    var HTML: Any?
    var html: Any?
    var List: Any?
    var list: Any?
    var Min: Any?
    var min: Any?
    var Spec: Any?
    var spec: Any?
    var Nyan: Any?
    var nyan: Any?
    var XUnit: Any?
    var xunit: Any?
    var Markdown: Any?
    var markdown: Any?
    var Progress: Any?
    var progress: Any?
    var Landing: Any?
    var landing: Any?
    var JSONStream: Any?
}
external interface InterfaceContributions {
    var bdd: Any?
    var tdd: Any?
    var qunit: Any?
    var exports: Any?
}
external interface IContext {
    var test: IRunnable? get() = definedExternally; set(value) = definedExternally
    fun runnable(): IRunnable?
    fun runnable(runnable: IRunnable): IContext
    fun timeout(): Number
    fun timeout(timeout: Number): IContext
    fun enableTimeouts(enableTimeouts: Boolean): IContext
    fun slow(slow: Number): IContext
    fun skip(): IContext
    fun retries(): Number
    fun retries(retries: Number): IContext
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
external interface IRunnable : EventEmitter {
    var title: String
    var fn: Function<*>?
    var async: Boolean
    var sync: Boolean
    var timedOut: Boolean
    fun timeout(n: String): IRunnable /* this */
    fun timeout(n: Number): IRunnable /* this */
    var duration: Number? get() = definedExternally; set(value) = definedExternally
}
external interface ISuite {
    var ctx: IContext
    var parent: ISuite?
    var root: Boolean
    var title: String
    var suites: Array<ISuite>
    var tests: Array<ITest>
    fun bail(): Boolean
    fun bail(bail: Boolean): ISuite
    fun fullTitle(): String
    fun retries(): Number
    fun retries(retries: Number): ISuite
    fun slow(): Number
    fun slow(slow: Number): ISuite
    fun timeout(): Number
    fun timeout(timeout: Number): ISuite
}
external interface ITest : IRunnable {
    var body: String? get() = definedExternally; set(value) = definedExternally
    var file: String? get() = definedExternally; set(value) = definedExternally
    var parent: ISuite? get() = definedExternally; set(value) = definedExternally
    var pending: Boolean
    var state: dynamic /* String /* "failed" */ | String /* "passed" */ */ get() = definedExternally; set(value) = definedExternally
    var type: String /* "test" */
    fun fullTitle(): String
}
external interface IHook : IRunnable {
    var ctx: IContext? get() = definedExternally; set(value) = definedExternally
    var parent: ISuite? get() = definedExternally; set(value) = definedExternally
    var type: String /* "hook" */
    fun error(err: Error)
}
external interface IBeforeAndAfterContext : IHookCallbackContext {
    var currentTest: ITest? get() = definedExternally; set(value) = definedExternally
}
external interface IRunner : EventEmitter {
    var asyncOnly: Boolean? get() = definedExternally; set(value) = definedExternally
    var stats: Stats? get() = definedExternally; set(value) = definedExternally
    var started: Boolean
    var suite: ISuite
    var total: Number
    var failures: Number
    var forbidOnly: Boolean? get() = definedExternally; set(value) = definedExternally
    var forbidPending: Boolean? get() = definedExternally; set(value) = definedExternally
    var fullStackTrace: Boolean? get() = definedExternally; set(value) = definedExternally
    var ignoreLeaks: Boolean? get() = definedExternally; set(value) = definedExternally
    fun grep(re: RegExp, invert: Boolean): IRunner /* this */
    fun grepTotal(suite: ISuite): Number
    fun globals(arr: Array<String>): dynamic /* Array<String> | IRunner */
    fun abort(): IRunner /* this */
    fun run(fn: ((failures: Number) -> Unit)? = definedExternally /* null */): IRunner /* this */
}

external interface IContextDefinition
external interface ITestDefinition
