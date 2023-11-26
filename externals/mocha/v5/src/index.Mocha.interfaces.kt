@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("mocha") JsQualifier("interfaces")]
package js.externals.mocha.Mocha.interfaces

import js.externals.mocha.Mocha.Suite

external fun bdd(suite: Suite): Unit = definedExternally
external fun tdd(suite: Suite): Unit = definedExternally
external fun qunit(suite: Suite): Unit = definedExternally
external fun exports(suite: Suite): Unit = definedExternally
