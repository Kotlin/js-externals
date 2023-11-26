@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("mocha") JsQualifier("utils")]
package js.externals.mocha.Mocha.utils

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

external fun slug(str: String): String = definedExternally
external fun clean(str: String): String = definedExternally
external fun highlight(js: String): String = definedExternally
external fun type(value: Any): String = definedExternally
external fun stringify(value: Any): String = definedExternally
external fun canonicalize(value: Any, stack: Array<Any>, typeHint: String): Any = definedExternally
external fun lookupFiles(filepath: String, extensions: Array<String>? = definedExternally /* null */, recursive: Boolean? = definedExternally /* null */): Array<String> = definedExternally
external fun undefinedError(): Error = definedExternally
external fun getError(err: Error?): Error = definedExternally
external fun stackTraceFilter(): (stack: String) -> String = definedExternally
