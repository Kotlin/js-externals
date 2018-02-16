@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("global")
package js.externals.react_native.global

import js.externals.react_native.ErrorUtils
import org.w3c.dom.Navigator

external fun require(name: String): Any = definedExternally
//external fun Console.error(message: Any? = definedExternally /* null */, vararg optionalParams: Any): Unit = definedExternally
//external fun Console.info(message: Any? = definedExternally /* null */, vararg optionalParams: Any): Unit = definedExternally
//external fun Console.log(message: Any? = definedExternally /* null */, vararg optionalParams: Any): Unit = definedExternally
//external fun Console.warn(message: Any? = definedExternally /* null */, vararg optionalParams: Any): Unit = definedExternally
//external fun Console.trace(message: Any? = definedExternally /* null */, vararg optionalParams: Any): Unit = definedExternally
//external fun Console.debug(message: Any? = definedExternally /* null */, vararg optionalParams: Any): Unit = definedExternally
//external fun Console.table(vararg data: Any): Unit = definedExternally
//external var Console.disableYellowBox: Boolean get() = definedExternally; set(value) = definedExternally
//external var Console.ignoredYellowBox: Array<String> get() = definedExternally; set(value) = definedExternally
//external var console: Console = definedExternally
//external var Navigator.product: String get() = definedExternally; set(value) = definedExternally
//external var Navigator.geolocation: GeolocationStatic get() = definedExternally; set(value) = definedExternally
external var navigator: Navigator = definedExternally
external var originalXMLHttpRequest: Any = definedExternally
external var __BUNDLE_START_TIME__: Number = definedExternally
external var ErrorUtils: ErrorUtils = definedExternally
external var __DEV__: Boolean = definedExternally
