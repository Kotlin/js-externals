@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")

package js.externals.mocha.lib.interfaces.common

import js.externals.mocha.Mocha.MochaGlobals
import js.externals.mocha.Mocha.Suite
import js.externals.mocha._Mocha
import js.externals.mocha.lib.interfaces.common.common.CommonFunctions
import kotlin.js.*

@JsModule("mocha/lib/interfaces/common")
external fun common(suites: Array<Suite>, context: MochaGlobals, mocha: _Mocha): CommonFunctions = definedExternally
