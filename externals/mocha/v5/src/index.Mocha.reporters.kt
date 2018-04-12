@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")

package js.externals.mocha.Mocha.reporters

import js.externals.mocha.Mocha.*

open external class Base(runner: IRunner) {
    open var stats: IStats = definedExternally
}

open external class Doc : Base
open external class Dot : Base
open external class HTML : Base
open external class HTMLCov : Base
open external class JSON : Base
open external class JSONCov : Base
open external class JSONStream : Base
open external class Landing : Base
open external class List : Base
open external class Markdown : Base
open external class Min : Base
open external class Nyan : Base
external interface ProgressOptions {
    var open: String? get() = definedExternally; set(value) = definedExternally
    var complete: String? get() = definedExternally; set(value) = definedExternally
    var incomplete: String? get() = definedExternally; set(value) = definedExternally
    var close: String? get() = definedExternally; set(value) = definedExternally
}
open external class Progress(runner: IRunner, options: ProgressOptions? = definedExternally /* null */) : Base
open external class Spec : Base
open external class TAP : Base
open external class XUnit(runner: IRunner, options: Any? = definedExternally /* null */) : Base
