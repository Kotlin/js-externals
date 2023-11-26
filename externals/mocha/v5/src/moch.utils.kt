package js.externals.mocha.kotlinUtils

import js.externals.mocha.Mocha.*
import js.externals.mocha._xcontext
import js.externals.mocha._xdescribe
import js.externals.mocha.lib.interfaces.common.common.CommonFunctions
import kotlin.js.Promise

external interface DoneType {
    @nativeInvoke
    operator fun invoke(err: Any? = definedExternally)
}

inline operator fun SuiteFunction.invoke(description: String, crossinline fn: Suite.() -> dynamic): Suite = asDynamic()(description) { fn(js("this")) }

inline operator fun ExclusiveSuiteFunction.invoke(description: String, crossinline fn: Suite.() -> dynamic): Suite = asDynamic()(description) { fn(js("this")) }

inline fun TestFunction.async(crossinline fn: Context.(DoneType) -> dynamic) = asDynamic()() { d -> fn(js("this"), d) }
inline fun TestFunction.async(title: String, crossinline fn: Context.(DoneType) -> dynamic) = asDynamic()(title) { d -> fn(js("this"), d) }

inline operator fun TestFunction.invoke(crossinline fn: Context.() -> dynamic): Test = asDynamic()() { fn(js("this")) }
inline operator fun TestFunction.invoke(title: String, crossinline fn: Context.() -> dynamic): Test = asDynamic()(title) { fn(js("this")) }

inline fun PendingTestFunction.async(crossinline fn: Context.(DoneType) -> dynamic): Test = asDynamic()() { d -> fn(js("this"), d) }
inline fun PendingTestFunction.async(title: String, crossinline fn: Context.(DoneType) -> dynamic): Test = asDynamic()(title) { d -> fn(js("this"), d) }

inline operator fun PendingTestFunction.invoke(crossinline fn: Context.() -> dynamic): Test = asDynamic()() { fn(js("this")) }
inline operator fun PendingTestFunction.invoke(title: String, crossinline fn: Context.() -> dynamic): Test = asDynamic()(title) { fn(js("this")) }

inline fun ExclusiveTestFunction.async(crossinline fn: Context.(DoneType) -> dynamic): Test = asDynamic()() { d -> fn(js("this"), d) }
inline fun ExclusiveTestFunction.async(title: String, crossinline fn: Context.(DoneType) -> dynamic): Test = asDynamic()(title) { d -> fn(js("this"), d) }

inline operator fun ExclusiveTestFunction.invoke(crossinline fn: Context.() -> dynamic): Test = asDynamic()() { fn(js("this")) }
inline operator fun ExclusiveTestFunction.invoke(title: String, crossinline fn: Context.() -> dynamic): Test = asDynamic()(title) { fn(js("this")) }

inline operator fun HookFunction.invoke(crossinline fn: Context.() -> dynamic): Test = asDynamic()() { fn(js("this")) }
inline operator fun HookFunction.invoke(name: String, crossinline fn: Context.() -> dynamic): Test = asDynamic()(name) { fn(js("this")) }

inline fun HookFunction.async(crossinline fn: Context.(DoneType) -> dynamic): Test = asDynamic()() { d -> fn(js("this"), d) }
inline fun HookFunction.async(name: String, crossinline fn: Context.(DoneType) -> dynamic): Test = asDynamic()(name) { d -> fn(js("this"), d) }

inline fun Suite.beforeAll(crossinline fn: Context.() -> dynamic): Suite = asDynamic().beforeAll { fn(js("this")) }
inline fun Suite.beforeAll(title: String, crossinline fn: Context.() -> dynamic): Suite = asDynamic().beforeAll(title) { fn(js("this")) }
inline fun Suite.beforeAllAsync(crossinline fn: Context.(DoneType) -> dynamic): Suite = asDynamic().beforeAll { d -> fn(js("this"), d) }
inline fun Suite.beforeAllAsync(title: String, crossinline fn: Context.(DoneType) -> dynamic): Suite = asDynamic().beforeAll(title) { d -> fn(js("this"), d) }

inline fun Suite.afterAll(crossinline fn: Context.() -> dynamic): Suite = asDynamic().afterAll { fn(js("this")) }
inline fun Suite.afterAll(title: String, crossinline fn: Context.() -> dynamic): Suite = asDynamic().afterAll(title) { fn(js("this")) }
inline fun Suite.afterAllAsync(crossinline fn: Context.(DoneType) -> dynamic): Suite = asDynamic().afterAll { d -> fn(js("this"), d) }
inline fun Suite.afterAllAsync(title: String, crossinline fn: Context.(DoneType) -> dynamic): Suite = asDynamic().afterAll(title) { d -> fn(js("this"), d) }

inline fun Suite.beforeEach(crossinline fn: Context.() -> dynamic): Suite = asDynamic().beforeEach { fn(js("this")) }
inline fun Suite.beforeEach(title: String, crossinline fn: Context.() -> dynamic): Suite = asDynamic().beforeEach(title) { fn(js("this")) }
inline fun Suite.beforeEachAsync(crossinline fn: Context.(DoneType) -> dynamic): Suite = asDynamic().beforeEach { d -> fn(js("this"), d) }
inline fun Suite.beforeEachAsync(title: String, crossinline fn: Context.(DoneType) -> dynamic): Suite = asDynamic().beforeEach(title) { d -> fn(js("this"), d) }

inline fun Suite.afterEach(crossinline fn: Context.() -> dynamic): Suite = asDynamic().afterEach { fn(js("this")) }
inline fun Suite.afterEach(title: String, crossinline fn: Context.() -> dynamic): Suite = asDynamic().afterEach(title) { fn(js("this")) }
inline fun Suite.afterEachAsync(crossinline fn: Context.(DoneType) -> dynamic): Suite = asDynamic().afterEach { d -> fn(js("this"), d) }
inline fun Suite.afterEachAsync(title: String, crossinline fn: Context.(DoneType) -> dynamic): Suite = asDynamic().afterEach(title) { d -> fn(js("this"), d) }

inline fun Suite._createHook(title: String, crossinline fn: Context.() -> dynamic): Suite = asDynamic()._createHook(title) { fn(js("this")) }
inline fun Suite._createHook(title: String, crossinline fn: Context.(DoneType) -> dynamic): Suite = asDynamic()._createHook(title) { d -> fn(js("this"), d) }


inline operator fun IContextDefinition.invoke(description: String, crossinline callback: ISuiteCallbackContext.() -> Unit): ISuite = asDynamic()(description) { callback(js("this")) }
inline fun IContextDefinition.only(description: String, crossinline callback: ISuiteCallbackContext.() -> Unit): ISuite = asDynamic().only(description) { callback(js("this")) }
inline fun IContextDefinition.skip(description: String, crossinline callback: ISuiteCallbackContext.() -> Unit) = asDynamic().skip(description) { callback(js("this")) }

inline operator fun ITestDefinition.invoke(description: String, crossinline callback: ITestCallbackContext.(DoneType) -> Unit): dynamic = asDynamic()(description) { d -> callback(js("this"), d) }
inline fun ITestDefinition.only(description: String, crossinline callback: ITestCallbackContext.(DoneType) -> Unit): dynamic = asDynamic().only(description) { d -> callback(js("this"), d) }
inline fun ITestDefinition.skip(description: String, crossinline callback: ITestCallbackContext.(DoneType) -> Unit): dynamic = asDynamic().skip(description) { d -> callback(js("this"), d) }


fun xdescribe(title: String, fn: Suite.() -> Unit): dynamic = _xdescribe(title) { fn(js("this")) }
fun xcontext(title: String, fn: Suite.() -> Unit): dynamic = _xcontext(title) { fn(js("this")) }

inline fun CommonFunctions.beforeAll(crossinline fn: Context.() -> dynamic) = asDynamic().beforeAll { fn(js("this")) }
inline fun CommonFunctions.beforeAll(title: String, crossinline fn: Context.() -> dynamic) = asDynamic().beforeAll(title) { fn(js("this")) }
inline fun CommonFunctions.beforeAllAsync(crossinline fn: Context.(DoneType) -> dynamic) = asDynamic().beforeAll { d -> fn(js("this"), d) }
inline fun CommonFunctions.beforeAllAsync(title: String, crossinline fn: Context.(DoneType) -> dynamic) = asDynamic().beforeAll(title) { d -> fn(js("this"), d) }

inline fun CommonFunctions.afterAll(crossinline fn: Context.() -> dynamic) = asDynamic().afterAll { fn(js("this")) }
inline fun CommonFunctions.afterAll(title: String, crossinline fn: Context.() -> dynamic) = asDynamic().afterAll(title) { fn(js("this")) }
inline fun CommonFunctions.afterAllAsync(crossinline fn: Context.(DoneType) -> dynamic) = asDynamic().afterAll { d -> fn(js("this"), d) }
inline fun CommonFunctions.afterAllAsync(title: String, crossinline fn: Context.(DoneType) -> dynamic) = asDynamic().afterAll(title) { d -> fn(js("this"), d) }

inline fun CommonFunctions.beforeEach(crossinline fn: Context.() -> dynamic) = asDynamic().beforeEach { fn(js("this")) }
inline fun CommonFunctions.beforeEach(title: String, crossinline fn: Context.() -> dynamic) = asDynamic().beforeEach(title) { fn(js("this")) }
inline fun CommonFunctions.beforeEachAsync(crossinline fn: Context.(DoneType) -> dynamic) = asDynamic().beforeEach { d -> fn(js("this"), d) }
inline fun CommonFunctions.beforeEachAsync(title: String, crossinline fn: Context.(DoneType) -> dynamic) = asDynamic().beforeEach(title) { d -> fn(js("this"), d) }

inline fun CommonFunctions.afterEach(crossinline fn: Context.() -> dynamic) = asDynamic().afterEach { fn(js("this")) }
inline fun CommonFunctions.afterEach(title: String, crossinline fn: Context.() -> dynamic) = asDynamic().afterEach(title) { fn(js("this")) }
inline fun CommonFunctions.afterEachAsync(crossinline fn: Context.(DoneType) -> dynamic) = asDynamic().afterEach { d -> fn(js("this"), d) }
inline fun CommonFunctions.afterEachAsync(title: String, crossinline fn: Context.(DoneType) -> dynamic) = asDynamic().afterEach(title) { d -> fn(js("this"), d) }