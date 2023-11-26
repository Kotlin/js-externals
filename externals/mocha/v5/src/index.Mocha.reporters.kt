@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("mocha") JsNonModule JsQualifier("reporters")]
package Mocha.reporters

import js.externals.mocha.Mocha.*
import kotlin.js.*
import org.w3c.dom.*

@JsName("Base")
external open class _Base {
    constructor(runner: Runner, options: MochaOptions? = definedExternally /* null */)
    constructor(runner: IRunner, options: MochaOptions? = definedExternally /* null */)
    open var stats: Stats = definedExternally
    open var failures: Array<Test> = definedExternally
    open var runner: Runner = definedExternally
    open fun epilogue(): Unit = definedExternally
    open fun done(failures: Number, fn: ((failures: Number) -> Unit)? = definedExternally /* null */): Unit = definedExternally
}
external open class Dot : _Base
external open class Doc : _Base
external open class TAP : _Base
external open class JSON : _Base
external open class HTML : _Base {
    open fun suiteURL(suite: Suite): String = definedExternally
    open fun testURL(test: Test): String = definedExternally
    open fun addCodeToggle(el: HTMLLIElement, contents: String): Unit = definedExternally
}
external open class List : _Base
external open class Min : _Base
external open class Spec : _Base
external open class Nyan : _Base {
    open var colorIndex: Any = definedExternally
    open var numberOfLines: Any = definedExternally
    open var rainbowColors: Any = definedExternally
    open var scoreboardWidth: Any = definedExternally
    open var tick: Any = definedExternally
    open var trajectories: Any = definedExternally
    open var trajectoryWidthMax: Any = definedExternally
    open var draw: Any = definedExternally
    open var drawScoreboard: Any = definedExternally
    open var appendRainbow: Any = definedExternally
    open var drawRainbow: Any = definedExternally
    open var drawNyanCat: Any = definedExternally
    open var face: Any = definedExternally
    open var cursorUp: Any = definedExternally
    open var cursorDown: Any = definedExternally
    open var generateColors: Any = definedExternally
    open var rainbowify: Any = definedExternally
}
external open class XUnit : _Base {
    constructor(runner: Runner, options: MochaOptions? = definedExternally /* null */)
    constructor(runner: IRunner, options: MochaOptions? = definedExternally /* null */)
    open fun done(failures: Number, fn: (failures: Number) -> Unit): Unit = definedExternally
    open fun write(line: String): Unit = definedExternally
    open fun test(test: Test): Unit = definedExternally
    @JsName("MochaOptions")
    interface _MochaOptions : MochaOptions {
        override var reporterOptions: Any? get() = definedExternally; set(value) = definedExternally
    }
    interface ReporterOptions {
        var output: String? get() = definedExternally; set(value) = definedExternally
        var suiteName: String? get() = definedExternally; set(value) = definedExternally
    }
}
external open class Markdown : _Base
external open class Progress : _Base {
    constructor(runner: Runner, options: _MochaOptions? = definedExternally /* null */)
    constructor(runner: IRunner, options: _MochaOptions? = definedExternally /* null */)
    @JsName("MochaOptions")
    interface _MochaOptions : MochaOptions {
        override var reporterOptions: Any? get() = definedExternally; set(value) = definedExternally
    }
    interface ReporterOptions {
        var open: String? get() = definedExternally; set(value) = definedExternally
        var complete: String? get() = definedExternally; set(value) = definedExternally
        var incomplete: String? get() = definedExternally; set(value) = definedExternally
        var close: String? get() = definedExternally; set(value) = definedExternally
        var verbose: Boolean? get() = definedExternally; set(value) = definedExternally
    }
}
external open class Landing : _Base
external open class JSONStream : _Base
external var base: Any? = definedExternally
external var dot: Any? = definedExternally
external var doc: Any? = definedExternally
external var tap: Any? = definedExternally
external var json: Any? = definedExternally
external var html: Any? = definedExternally
external var list: Any? = definedExternally
external var spec: Any? = definedExternally
external var nyan: Any? = definedExternally
external var xunit: Any? = definedExternally
external var markdown: Any? = definedExternally
external var progress: Any? = definedExternally
external var landing: Any? = definedExternally
