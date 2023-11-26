@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("NodeJS")
package js.externals.mocha.NodeJS

import js.externals.mocha.Mocha.MochaGlobals

external interface EventEmitter
external interface Global : MochaGlobals
