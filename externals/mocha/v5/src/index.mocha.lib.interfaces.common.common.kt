@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsModule("mocha/lib/interfaces/common")
package js.externals.mocha.lib.interfaces.common.common

import js.externals.mocha.Mocha.Context
import js.externals.mocha.Mocha.Suite
import js.externals.mocha.Mocha.Test
import js.externals.mocha._Mocha
import kotlin.js.Promise
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

external interface CommonFunctions {
    fun runWithSuite(suite: Suite): () -> Unit
    // defined as external functions
//    fun before(fn: ((`this`: Context, done: (err: Any? /*= null*/) -> Unit) -> Unit)? = definedExternally /* null */)
//    fun before(fn: ((`this`: Context) -> Promise<Any>)? = definedExternally /* null */)
//    fun before(name: String, fn: ((`this`: Context, done: (err: Any? /*= null*/) -> Unit) -> Unit)? = definedExternally /* null */)
//    fun before(name: String, fn: ((`this`: Context) -> Promise<Any>)? = definedExternally /* null */)
//    fun after(fn: ((`this`: Context, done: (err: Any? /*= null*/) -> Unit) -> Unit)? = definedExternally /* null */)
//    fun after(fn: ((`this`: Context) -> Promise<Any>)? = definedExternally /* null */)
//    fun after(name: String, fn: ((`this`: Context, done: (err: Any? /*= null*/) -> Unit) -> Unit)? = definedExternally /* null */)
//    fun after(name: String, fn: ((`this`: Context) -> Promise<Any>)? = definedExternally /* null */)
//    fun beforeEach(fn: ((`this`: Context, done: (err: Any? /*= null*/) -> Unit) -> Unit)? = definedExternally /* null */)
//    fun beforeEach(fn: ((`this`: Context) -> Promise<Any>)? = definedExternally /* null */)
//    fun beforeEach(name: String, fn: ((`this`: Context, done: (err: Any? /*= null*/) -> Unit) -> Unit)? = definedExternally /* null */)
//    fun beforeEach(name: String, fn: ((`this`: Context) -> Promise<Any>)? = definedExternally /* null */)
//    fun afterEach(fn: ((`this`: Context, done: (err: Any? /*= null*/) -> Unit) -> Unit)? = definedExternally /* null */)
//    fun afterEach(fn: ((`this`: Context) -> Promise<Any>)? = definedExternally /* null */)
//    fun afterEach(name: String, fn: ((`this`: Context, done: (err: Any? /*= null*/) -> Unit) -> Unit)? = definedExternally /* null */)
//    fun afterEach(name: String, fn: ((`this`: Context) -> Promise<Any>)? = definedExternally /* null */)
    var suite: SuiteFunctions
    var test: TestFunctions
    fun before()
    fun before(name: String)
    fun after()
    fun after(name: String)
    fun beforeEach()
    fun beforeEach(name: String)
    fun afterEach()
    fun afterEach(name: String)
}
external interface CreateOptions {
    var title: String
    var fn: ((`this`: Suite) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var pending: Boolean? get() = definedExternally; set(value) = definedExternally
    var file: String? get() = definedExternally; set(value) = definedExternally
    var isOnly: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface SuiteFunctions {
    fun only(opts: CreateOptions): Suite
    fun skip(opts: CreateOptions): Suite
    fun create(opts: CreateOptions): Suite
}
external interface TestFunctions {
    fun only(mocha: _Mocha, test: Test): Test
    fun skip(title: String)
    fun retries(n: Number)
}
