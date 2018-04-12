@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")

package js.externals.mocha

import js.externals.mocha.Mocha.*


external interface MochaSetupOptions {
    var slow: Number? get() = definedExternally; set(value) = definedExternally
    var timeout: Number? get() = definedExternally; set(value) = definedExternally
    var ui: dynamic /* String /* "bdd" */ | String /* "tdd" */ | String /* "qunit" */ | String /* "exports" */ */ get() = definedExternally; set(value) = definedExternally
    var globals: Array<Any>? get() = definedExternally; set(value) = definedExternally
    var reporter: dynamic /* String | ReporterConstructor */ get() = definedExternally; set(value) = definedExternally
    var bail: Boolean? get() = definedExternally; set(value) = definedExternally
    var ignoreLeaks: Boolean? get() = definedExternally; set(value) = definedExternally
    var grep: Any? get() = definedExternally; set(value) = definedExternally
    var require: Array<String>? get() = definedExternally; set(value) = definedExternally
}
external var mocha: Mocha = definedExternally
external var describe: IContextDefinition = definedExternally
external var xdescribe: IContextDefinition = definedExternally
external var context: IContextDefinition = definedExternally
external var suite: IContextDefinition = definedExternally
external var it: ITestDefinition = definedExternally
external var xit: ITestDefinition = definedExternally
external var test: ITestDefinition = definedExternally
external var specify: ITestDefinition = definedExternally
external fun run(): Unit = definedExternally
external fun setup(callback: ICallback? = definedExternally): Unit = definedExternally
external fun teardown(callback: ICallback? = definedExternally): Unit = definedExternally
external fun suiteSetup(callback: ICallback? = definedExternally): Unit = definedExternally
external fun suiteTeardown(callback: ICallback? = definedExternally): Unit = definedExternally
external fun before(callback: ICallback? = definedExternally): Unit = definedExternally
external fun before(description: String, callback: ICallback? = definedExternally): Unit = definedExternally
external fun after(callback: ICallback? = definedExternally): Unit = definedExternally
external fun after(description: String, callback: ICallback? = definedExternally): Unit = definedExternally
external fun beforeEach(callback: ICallback? = definedExternally): Unit = definedExternally
external fun beforeEach(description: String, callback: ICallback? = definedExternally): Unit = definedExternally
external fun afterEach(callback: ICallback? = definedExternally): Unit = definedExternally
external fun afterEach(description: String, callback: ICallback? = definedExternally): Unit = definedExternally
external interface ReporterConstructor