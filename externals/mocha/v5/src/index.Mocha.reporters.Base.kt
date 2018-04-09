@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("mocha") JsQualifier("reporters.Base")]
package js.externals.mocha.Mocha.reporters.Base

import js.externals.mocha.Mocha.Test
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

external var useColors: Boolean = definedExternally
external var inlineDiffs: Boolean = definedExternally
external var colors: ColorMap = definedExternally
external interface ColorMap {
    var pass: Number
    var fail: Number
    var pending: Number
    var suite: Number
    var checkmark: Number
    var fast: Number
    var medium: Number
    var slow: Number
    var green: Number
    var light: Number
    var progress: Number
    var plane: Number
    var runway: Number
    @nativeGetter
    operator fun get(key: String): Number?
    @nativeSetter
    operator fun set(key: String, value: Number)
}
external var symbols: SymbolMap = definedExternally
external interface SymbolMap {
    var ok: String
    var err: String
    var dot: String
    var comma: String
    var bang: String
    @nativeGetter
    operator fun get(key: String): String?
    @nativeSetter
    operator fun set(key: String, value: String)
}
external fun color(type: String, str: String): String = definedExternally
external object window {
    var width: Number = definedExternally
}
external fun generateDiff(actual: String, expected: String): String = definedExternally
external fun list(failures: Array<Test>): Unit = definedExternally
