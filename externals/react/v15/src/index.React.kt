@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("React")
package React

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

external interface ComponentState
external interface Attributes {
    var key: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
}
external interface ClassAttributes<T> : Attributes {
    var ref: dynamic /* String | Any? */ get() = definedExternally; set(value) = definedExternally
}
external interface ReactElement<P> {
    var type: dynamic /* String | ComponentClass<P> | StatelessComponent<P> */
    var props: P
    var key: dynamic /* String | Number */
}
external interface SFCElement<P> : ReactElement<P> {
    override var type: StatelessComponent<P>
}
external interface ComponentElement<P, T : Component<P, React.ComponentState>> : ReactElement<P> {
    override var type: ComponentClass<P>
    var ref: dynamic /* String | Any? */ get() = definedExternally; set(value) = definedExternally
}
external interface DOMElement<P : dynamic /* HTMLAttributes<T> | SVGAttributes<T> */, T : Element> : ReactElement<P> {
    override var type: String
    var ref: dynamic /* String | Any? */
}
external interface ReactHTMLElement<T : HTMLElement> : DetailedReactHTMLElement<AllHTMLAttributes<T>, T>
external interface DetailedReactHTMLElement<P : HTMLAttributes<T>, T : HTMLElement> : DOMElement<P, T> {
    override var type: dynamic /* String /* "object" */ | String /* "a" */ | String /* "abbr" */ | String /* "address" */ | String /* "area" */ | String /* "article" */ | String /* "aside" */ | String /* "audio" */ | String /* "b" */ | String /* "base" */ | String /* "bdi" */ | String /* "bdo" */ | String /* "big" */ | String /* "blockquote" */ | String /* "body" */ | String /* "br" */ | String /* "button" */ | String /* "canvas" */ | String /* "caption" */ | String /* "cite" */ | String /* "code" */ | String /* "col" */ | String /* "colgroup" */ | String /* "data" */ | String /* "datalist" */ | String /* "dd" */ | String /* "del" */ | String /* "details" */ | String /* "dfn" */ | String /* "dialog" */ | String /* "div" */ | String /* "dl" */ | String /* "dt" */ | String /* "em" */ | String /* "embed" */ | String /* "fieldset" */ | String /* "figcaption" */ | String /* "figure" */ | String /* "footer" */ | String /* "form" */ | String /* "h1" */ | String /* "h2" */ | String /* "h3" */ | String /* "h4" */ | String /* "h5" */ | String /* "h6" */ | String /* "head" */ | String /* "header" */ | String /* "hgroup" */ | String /* "hr" */ | String /* "html" */ | String /* "i" */ | String /* "iframe" */ | String /* "img" */ | String /* "input" */ | String /* "ins" */ | String /* "kbd" */ | String /* "keygen" */ | String /* "label" */ | String /* "legend" */ | String /* "li" */ | String /* "link" */ | String /* "main" */ | String /* "map" */ | String /* "mark" */ | String /* "menu" */ | String /* "menuitem" */ | String /* "meta" */ | String /* "meter" */ | String /* "nav" */ | String /* "noscript" */ | String /* "ol" */ | String /* "optgroup" */ | String /* "option" */ | String /* "output" */ | String /* "p" */ | String /* "param" */ | String /* "picture" */ | String /* "pre" */ | String /* "progress" */ | String /* "q" */ | String /* "rp" */ | String /* "rt" */ | String /* "ruby" */ | String /* "s" */ | String /* "samp" */ | String /* "script" */ | String /* "section" */ | String /* "select" */ | String /* "small" */ | String /* "source" */ | String /* "span" */ | String /* "strong" */ | String /* "style" */ | String /* "sub" */ | String /* "summary" */ | String /* "sup" */ | String /* "table" */ | String /* "tbody" */ | String /* "td" */ | String /* "textarea" */ | String /* "tfoot" */ | String /* "th" */ | String /* "thead" */ | String /* "time" */ | String /* "title" */ | String /* "tr" */ | String /* "track" */ | String /* "u" */ | String /* "ul" */ | String /* "var" */ | String /* "video" */ | String /* "wbr" */ | String /* "webview" */ */
}
external interface ReactSVGElement : DOMElement<SVGAttributes<SVGElement>, SVGElement> {
    override var type: dynamic /* String /* "symbol" */ | String /* "svg" */ | String /* "animate" */ | String /* "circle" */ | String /* "defs" */ | String /* "ellipse" */ | String /* "g" */ | String /* "image" */ | String /* "line" */ | String /* "linearGradient" */ | String /* "mask" */ | String /* "path" */ | String /* "pattern" */ | String /* "polygon" */ | String /* "polyline" */ | String /* "radialGradient" */ | String /* "rect" */ | String /* "stop" */ | String /* "text" */ | String /* "tspan" */ | String /* "use" */ */
}
external interface WebViewHTMLAttributes<T> : HTMLAttributes<T> {
    var allowFullScreen: Boolean? get() = definedExternally; set(value) = definedExternally
    var allowpopups: Boolean? get() = definedExternally; set(value) = definedExternally
    var autoFocus: Boolean? get() = definedExternally; set(value) = definedExternally
    var autosize: Boolean? get() = definedExternally; set(value) = definedExternally
    var blinkfeatures: String? get() = definedExternally; set(value) = definedExternally
    var disableblinkfeatures: String? get() = definedExternally; set(value) = definedExternally
    var disableguestresize: Boolean? get() = definedExternally; set(value) = definedExternally
    var disablewebsecurity: Boolean? get() = definedExternally; set(value) = definedExternally
    var guestinstance: String? get() = definedExternally; set(value) = definedExternally
    var httpreferrer: String? get() = definedExternally; set(value) = definedExternally
    var nodeintegration: Boolean? get() = definedExternally; set(value) = definedExternally
    var partition: String? get() = definedExternally; set(value) = definedExternally
    var plugins: Boolean? get() = definedExternally; set(value) = definedExternally
    var preload: String? get() = definedExternally; set(value) = definedExternally
    var src: String? get() = definedExternally; set(value) = definedExternally
    var useragent: String? get() = definedExternally; set(value) = definedExternally
    var webpreferences: String? get() = definedExternally; set(value) = definedExternally
}
external interface HTMLFactory<T : HTMLElement> : DetailedHTMLFactory<AllHTMLAttributes<T>, T>
external interface DetailedHTMLFactory<P : HTMLAttributes<T>, T : HTMLElement> : (props: ClassAttributes<T>? /* ClassAttributes<T> & P */ /*= null*/, children: dynamic /* String | Number | Boolean | Any? | ReactElement<Any> | Array<dynamic /* String | Number | Boolean | Array<Any> | ReactElement<Any> */> | Nothing? */) -> DOMElement<P, T> {
    @nativeInvoke
    operator fun invoke(props: ClassAttributes<T>? /* ClassAttributes<T> & P */ = definedExternally /* null */, vararg children: String): DetailedReactHTMLElement<P, T>
    @nativeInvoke
    operator fun invoke(props: ClassAttributes<T>? /* ClassAttributes<T> & P */ = definedExternally /* null */, vararg children: Number): DetailedReactHTMLElement<P, T>
    @nativeInvoke
    operator fun invoke(props: ClassAttributes<T>? /* ClassAttributes<T> & P */ = definedExternally /* null */, vararg children: Boolean): DetailedReactHTMLElement<P, T>
    @nativeInvoke
    operator fun invoke(props: ClassAttributes<T>? /* ClassAttributes<T> & P */ = definedExternally /* null */, vararg children: Any?): DetailedReactHTMLElement<P, T>
    @nativeInvoke
    operator fun invoke(props: ClassAttributes<T>? /* ClassAttributes<T> & P */ = definedExternally /* null */, vararg children: ReactElement<Any>): DetailedReactHTMLElement<P, T>
    @nativeInvoke
    operator fun invoke(props: ClassAttributes<T>? /* ClassAttributes<T> & P */ = definedExternally /* null */, vararg children: Array<dynamic /* String | Number | Boolean | Array<Any> | ReactElement<Any> */>): DetailedReactHTMLElement<P, T>
    @nativeInvoke
    operator fun invoke(props: ClassAttributes<T>? /* ClassAttributes<T> & P */ = definedExternally /* null */, vararg children: Nothing?): DetailedReactHTMLElement<P, T>
}
external interface SVGFactory : (props: ClassAttributes<SVGElement>? /* ClassAttributes<T> & P */ /*= null*/, children: dynamic /* String | Number | Boolean | Any? | ReactElement<Any> | Array<dynamic /* String | Number | Boolean | Array<Any> | ReactElement<Any> */> | Nothing? */) -> DOMElement<SVGAttributes<SVGElement>, SVGElement> {
    @nativeInvoke
    operator fun invoke(props: ClassAttributes<SVGElement>? /* ClassAttributes<SVGElement> & SVGAttributes<SVGElement> */ = definedExternally /* null */, vararg children: String): ReactSVGElement
    @nativeInvoke
    operator fun invoke(props: ClassAttributes<SVGElement>? /* ClassAttributes<SVGElement> & SVGAttributes<SVGElement> */ = definedExternally /* null */, vararg children: Number): ReactSVGElement
    @nativeInvoke
    operator fun invoke(props: ClassAttributes<SVGElement>? /* ClassAttributes<SVGElement> & SVGAttributes<SVGElement> */ = definedExternally /* null */, vararg children: Boolean): ReactSVGElement
    @nativeInvoke
    operator fun invoke(props: ClassAttributes<SVGElement>? /* ClassAttributes<SVGElement> & SVGAttributes<SVGElement> */ = definedExternally /* null */, vararg children: Any?): ReactSVGElement
    @nativeInvoke
    operator fun invoke(props: ClassAttributes<SVGElement>? /* ClassAttributes<SVGElement> & SVGAttributes<SVGElement> */ = definedExternally /* null */, vararg children: ReactElement<Any>): ReactSVGElement
    @nativeInvoke
    operator fun invoke(props: ClassAttributes<SVGElement>? /* ClassAttributes<SVGElement> & SVGAttributes<SVGElement> */ = definedExternally /* null */, vararg children: Array<dynamic /* String | Number | Boolean | Array<Any> | ReactElement<Any> */>): ReactSVGElement
    @nativeInvoke
    operator fun invoke(props: ClassAttributes<SVGElement>? /* ClassAttributes<SVGElement> & SVGAttributes<SVGElement> */ = definedExternally /* null */, vararg children: Nothing?): ReactSVGElement
}
external fun <P, S> createClass(spec: ComponentSpec<P, S>): ClassicComponentClass<P> = definedExternally
external fun <T : HTMLElement> createFactory(type: dynamic /* String /* "object" */ | String /* "a" */ | String /* "abbr" */ | String /* "address" */ | String /* "area" */ | String /* "article" */ | String /* "aside" */ | String /* "audio" */ | String /* "b" */ | String /* "base" */ | String /* "bdi" */ | String /* "bdo" */ | String /* "big" */ | String /* "blockquote" */ | String /* "body" */ | String /* "br" */ | String /* "button" */ | String /* "canvas" */ | String /* "caption" */ | String /* "cite" */ | String /* "code" */ | String /* "col" */ | String /* "colgroup" */ | String /* "data" */ | String /* "datalist" */ | String /* "dd" */ | String /* "del" */ | String /* "details" */ | String /* "dfn" */ | String /* "dialog" */ | String /* "div" */ | String /* "dl" */ | String /* "dt" */ | String /* "em" */ | String /* "embed" */ | String /* "fieldset" */ | String /* "figcaption" */ | String /* "figure" */ | String /* "footer" */ | String /* "form" */ | String /* "h1" */ | String /* "h2" */ | String /* "h3" */ | String /* "h4" */ | String /* "h5" */ | String /* "h6" */ | String /* "head" */ | String /* "header" */ | String /* "hgroup" */ | String /* "hr" */ | String /* "html" */ | String /* "i" */ | String /* "iframe" */ | String /* "img" */ | String /* "input" */ | String /* "ins" */ | String /* "kbd" */ | String /* "keygen" */ | String /* "label" */ | String /* "legend" */ | String /* "li" */ | String /* "link" */ | String /* "main" */ | String /* "map" */ | String /* "mark" */ | String /* "menu" */ | String /* "menuitem" */ | String /* "meta" */ | String /* "meter" */ | String /* "nav" */ | String /* "noscript" */ | String /* "ol" */ | String /* "optgroup" */ | String /* "option" */ | String /* "output" */ | String /* "p" */ | String /* "param" */ | String /* "picture" */ | String /* "pre" */ | String /* "progress" */ | String /* "q" */ | String /* "rp" */ | String /* "rt" */ | String /* "ruby" */ | String /* "s" */ | String /* "samp" */ | String /* "script" */ | String /* "section" */ | String /* "select" */ | String /* "small" */ | String /* "source" */ | String /* "span" */ | String /* "strong" */ | String /* "style" */ | String /* "sub" */ | String /* "summary" */ | String /* "sup" */ | String /* "table" */ | String /* "tbody" */ | String /* "td" */ | String /* "textarea" */ | String /* "tfoot" */ | String /* "th" */ | String /* "thead" */ | String /* "time" */ | String /* "title" */ | String /* "tr" */ | String /* "track" */ | String /* "u" */ | String /* "ul" */ | String /* "var" */ | String /* "video" */ | String /* "wbr" */ | String /* "webview" */ */): HTMLFactory<T> = definedExternally
external fun createFactory(type: dynamic /* String /* "symbol" */ | String /* "svg" */ | String /* "animate" */ | String /* "circle" */ | String /* "defs" */ | String /* "ellipse" */ | String /* "g" */ | String /* "image" */ | String /* "line" */ | String /* "linearGradient" */ | String /* "mask" */ | String /* "path" */ | String /* "pattern" */ | String /* "polygon" */ | String /* "polyline" */ | String /* "radialGradient" */ | String /* "rect" */ | String /* "stop" */ | String /* "text" */ | String /* "tspan" */ | String /* "use" */ */): SVGFactory = definedExternally
external fun <P : DOMAttributes<T>, T : Element> createFactory(type: String): (props: ClassAttributes<T>? /* ClassAttributes<T> & P */ /*= null*/, children: dynamic /* String | Number | Boolean | Any? | ReactElement<Any> | Array<dynamic /* String | Number | Boolean | Array<Any> | ReactElement<Any> */> | Nothing? */) -> DOMElement<P, T> = definedExternally
external fun <P> createFactory(type: StatelessComponent<P>): (props: Attributes? /* Attributes & P */ /*= null*/, children: dynamic /* String | Number | Boolean | Any? | ReactElement<Any> | Array<dynamic /* String | Number | Boolean | Array<Any> | ReactElement<Any> */> | Nothing? */) -> SFCElement<P> = definedExternally
external fun <P> createFactory(type: ClassicComponentClass<P> /* ClassicComponentClass<P> & Any? & Any? */): (props: ClassAttributes<ClassicComponent<P, React.ComponentState>>? /* ClassAttributes<T> & P */ /*= null*/, children: dynamic /* String | Number | Boolean | Any? | ReactElement<Any> | Array<dynamic /* String | Number | Boolean | Array<Any> | ReactElement<Any> */> | Nothing? */) -> ComponentElement<P, ClassicComponent<P, React.ComponentState>> = definedExternally
external fun <P, T : Component<P, React.ComponentState>, C : ComponentClass<P>> createFactory(type: C /* C & Any? & Any? */): (props: ClassAttributes<T>? /* ClassAttributes<T> & P */ /*= null*/, children: dynamic /* String | Number | Boolean | Any? | ReactElement<Any> | Array<dynamic /* String | Number | Boolean | Array<Any> | ReactElement<Any> */> | Nothing? */) -> ComponentElement<P, T> = definedExternally
external fun <P> createFactory(type: ComponentClass<P>): (props: Attributes? /* Attributes & P */ /*= null*/, children: dynamic /* String | Number | Boolean | Any? | ReactElement<Any> | Array<dynamic /* String | Number | Boolean | Array<Any> | ReactElement<Any> */> | Nothing? */) -> ReactElement<P> = definedExternally
external fun createElement(type: String /* "input" */, props: InputHTMLAttributes<HTMLInputElement>? /* InputHTMLAttributes<HTMLInputElement> & ClassAttributes<HTMLInputElement> */ = definedExternally /* null */, vararg children: String): DetailedReactHTMLElement<InputHTMLAttributes<HTMLInputElement>, HTMLInputElement> = definedExternally
external fun createElement(type: String /* "input" */, props: InputHTMLAttributes<HTMLInputElement>? /* InputHTMLAttributes<HTMLInputElement> & ClassAttributes<HTMLInputElement> */ = definedExternally /* null */, vararg children: Number): DetailedReactHTMLElement<InputHTMLAttributes<HTMLInputElement>, HTMLInputElement> = definedExternally
external fun createElement(type: String /* "input" */, props: InputHTMLAttributes<HTMLInputElement>? /* InputHTMLAttributes<HTMLInputElement> & ClassAttributes<HTMLInputElement> */ = definedExternally /* null */, vararg children: Boolean): DetailedReactHTMLElement<InputHTMLAttributes<HTMLInputElement>, HTMLInputElement> = definedExternally
external fun createElement(type: String /* "input" */, props: InputHTMLAttributes<HTMLInputElement>? /* InputHTMLAttributes<HTMLInputElement> & ClassAttributes<HTMLInputElement> */ = definedExternally /* null */, vararg children: Any?): DetailedReactHTMLElement<InputHTMLAttributes<HTMLInputElement>, HTMLInputElement> = definedExternally
external fun createElement(type: String /* "input" */, props: InputHTMLAttributes<HTMLInputElement>? /* InputHTMLAttributes<HTMLInputElement> & ClassAttributes<HTMLInputElement> */ = definedExternally /* null */, vararg children: ReactElement<Any>): DetailedReactHTMLElement<InputHTMLAttributes<HTMLInputElement>, HTMLInputElement> = definedExternally
external fun createElement(type: String /* "input" */, props: InputHTMLAttributes<HTMLInputElement>? /* InputHTMLAttributes<HTMLInputElement> & ClassAttributes<HTMLInputElement> */ = definedExternally /* null */, vararg children: Array<dynamic /* String | Number | Boolean | Array<Any> | ReactElement<Any> */>): DetailedReactHTMLElement<InputHTMLAttributes<HTMLInputElement>, HTMLInputElement> = definedExternally
external fun createElement(type: String /* "input" */, props: InputHTMLAttributes<HTMLInputElement>? /* InputHTMLAttributes<HTMLInputElement> & ClassAttributes<HTMLInputElement> */ = definedExternally /* null */, vararg children: Nothing?): DetailedReactHTMLElement<InputHTMLAttributes<HTMLInputElement>, HTMLInputElement> = definedExternally
external fun <P : HTMLAttributes<T>, T : HTMLElement> createElement(type: dynamic /* String /* "object" */ | String /* "a" */ | String /* "abbr" */ | String /* "address" */ | String /* "area" */ | String /* "article" */ | String /* "aside" */ | String /* "audio" */ | String /* "b" */ | String /* "base" */ | String /* "bdi" */ | String /* "bdo" */ | String /* "big" */ | String /* "blockquote" */ | String /* "body" */ | String /* "br" */ | String /* "button" */ | String /* "canvas" */ | String /* "caption" */ | String /* "cite" */ | String /* "code" */ | String /* "col" */ | String /* "colgroup" */ | String /* "data" */ | String /* "datalist" */ | String /* "dd" */ | String /* "del" */ | String /* "details" */ | String /* "dfn" */ | String /* "dialog" */ | String /* "div" */ | String /* "dl" */ | String /* "dt" */ | String /* "em" */ | String /* "embed" */ | String /* "fieldset" */ | String /* "figcaption" */ | String /* "figure" */ | String /* "footer" */ | String /* "form" */ | String /* "h1" */ | String /* "h2" */ | String /* "h3" */ | String /* "h4" */ | String /* "h5" */ | String /* "h6" */ | String /* "head" */ | String /* "header" */ | String /* "hgroup" */ | String /* "hr" */ | String /* "html" */ | String /* "i" */ | String /* "iframe" */ | String /* "img" */ | String /* "input" */ | String /* "ins" */ | String /* "kbd" */ | String /* "keygen" */ | String /* "label" */ | String /* "legend" */ | String /* "li" */ | String /* "link" */ | String /* "main" */ | String /* "map" */ | String /* "mark" */ | String /* "menu" */ | String /* "menuitem" */ | String /* "meta" */ | String /* "meter" */ | String /* "nav" */ | String /* "noscript" */ | String /* "ol" */ | String /* "optgroup" */ | String /* "option" */ | String /* "output" */ | String /* "p" */ | String /* "param" */ | String /* "picture" */ | String /* "pre" */ | String /* "progress" */ | String /* "q" */ | String /* "rp" */ | String /* "rt" */ | String /* "ruby" */ | String /* "s" */ | String /* "samp" */ | String /* "script" */ | String /* "section" */ | String /* "select" */ | String /* "small" */ | String /* "source" */ | String /* "span" */ | String /* "strong" */ | String /* "style" */ | String /* "sub" */ | String /* "summary" */ | String /* "sup" */ | String /* "table" */ | String /* "tbody" */ | String /* "td" */ | String /* "textarea" */ | String /* "tfoot" */ | String /* "th" */ | String /* "thead" */ | String /* "time" */ | String /* "title" */ | String /* "tr" */ | String /* "track" */ | String /* "u" */ | String /* "ul" */ | String /* "var" */ | String /* "video" */ | String /* "wbr" */ | String /* "webview" */ */, props: ClassAttributes<T>? /* ClassAttributes<T> & P */ = definedExternally /* null */, vararg children: String): DetailedReactHTMLElement<P, T> = definedExternally
external fun <P : HTMLAttributes<T>, T : HTMLElement> createElement(type: dynamic /* String /* "object" */ | String /* "a" */ | String /* "abbr" */ | String /* "address" */ | String /* "area" */ | String /* "article" */ | String /* "aside" */ | String /* "audio" */ | String /* "b" */ | String /* "base" */ | String /* "bdi" */ | String /* "bdo" */ | String /* "big" */ | String /* "blockquote" */ | String /* "body" */ | String /* "br" */ | String /* "button" */ | String /* "canvas" */ | String /* "caption" */ | String /* "cite" */ | String /* "code" */ | String /* "col" */ | String /* "colgroup" */ | String /* "data" */ | String /* "datalist" */ | String /* "dd" */ | String /* "del" */ | String /* "details" */ | String /* "dfn" */ | String /* "dialog" */ | String /* "div" */ | String /* "dl" */ | String /* "dt" */ | String /* "em" */ | String /* "embed" */ | String /* "fieldset" */ | String /* "figcaption" */ | String /* "figure" */ | String /* "footer" */ | String /* "form" */ | String /* "h1" */ | String /* "h2" */ | String /* "h3" */ | String /* "h4" */ | String /* "h5" */ | String /* "h6" */ | String /* "head" */ | String /* "header" */ | String /* "hgroup" */ | String /* "hr" */ | String /* "html" */ | String /* "i" */ | String /* "iframe" */ | String /* "img" */ | String /* "input" */ | String /* "ins" */ | String /* "kbd" */ | String /* "keygen" */ | String /* "label" */ | String /* "legend" */ | String /* "li" */ | String /* "link" */ | String /* "main" */ | String /* "map" */ | String /* "mark" */ | String /* "menu" */ | String /* "menuitem" */ | String /* "meta" */ | String /* "meter" */ | String /* "nav" */ | String /* "noscript" */ | String /* "ol" */ | String /* "optgroup" */ | String /* "option" */ | String /* "output" */ | String /* "p" */ | String /* "param" */ | String /* "picture" */ | String /* "pre" */ | String /* "progress" */ | String /* "q" */ | String /* "rp" */ | String /* "rt" */ | String /* "ruby" */ | String /* "s" */ | String /* "samp" */ | String /* "script" */ | String /* "section" */ | String /* "select" */ | String /* "small" */ | String /* "source" */ | String /* "span" */ | String /* "strong" */ | String /* "style" */ | String /* "sub" */ | String /* "summary" */ | String /* "sup" */ | String /* "table" */ | String /* "tbody" */ | String /* "td" */ | String /* "textarea" */ | String /* "tfoot" */ | String /* "th" */ | String /* "thead" */ | String /* "time" */ | String /* "title" */ | String /* "tr" */ | String /* "track" */ | String /* "u" */ | String /* "ul" */ | String /* "var" */ | String /* "video" */ | String /* "wbr" */ | String /* "webview" */ */, props: ClassAttributes<T>? /* ClassAttributes<T> & P */ = definedExternally /* null */, vararg children: Number): DetailedReactHTMLElement<P, T> = definedExternally
external fun <P : HTMLAttributes<T>, T : HTMLElement> createElement(type: dynamic /* String /* "object" */ | String /* "a" */ | String /* "abbr" */ | String /* "address" */ | String /* "area" */ | String /* "article" */ | String /* "aside" */ | String /* "audio" */ | String /* "b" */ | String /* "base" */ | String /* "bdi" */ | String /* "bdo" */ | String /* "big" */ | String /* "blockquote" */ | String /* "body" */ | String /* "br" */ | String /* "button" */ | String /* "canvas" */ | String /* "caption" */ | String /* "cite" */ | String /* "code" */ | String /* "col" */ | String /* "colgroup" */ | String /* "data" */ | String /* "datalist" */ | String /* "dd" */ | String /* "del" */ | String /* "details" */ | String /* "dfn" */ | String /* "dialog" */ | String /* "div" */ | String /* "dl" */ | String /* "dt" */ | String /* "em" */ | String /* "embed" */ | String /* "fieldset" */ | String /* "figcaption" */ | String /* "figure" */ | String /* "footer" */ | String /* "form" */ | String /* "h1" */ | String /* "h2" */ | String /* "h3" */ | String /* "h4" */ | String /* "h5" */ | String /* "h6" */ | String /* "head" */ | String /* "header" */ | String /* "hgroup" */ | String /* "hr" */ | String /* "html" */ | String /* "i" */ | String /* "iframe" */ | String /* "img" */ | String /* "input" */ | String /* "ins" */ | String /* "kbd" */ | String /* "keygen" */ | String /* "label" */ | String /* "legend" */ | String /* "li" */ | String /* "link" */ | String /* "main" */ | String /* "map" */ | String /* "mark" */ | String /* "menu" */ | String /* "menuitem" */ | String /* "meta" */ | String /* "meter" */ | String /* "nav" */ | String /* "noscript" */ | String /* "ol" */ | String /* "optgroup" */ | String /* "option" */ | String /* "output" */ | String /* "p" */ | String /* "param" */ | String /* "picture" */ | String /* "pre" */ | String /* "progress" */ | String /* "q" */ | String /* "rp" */ | String /* "rt" */ | String /* "ruby" */ | String /* "s" */ | String /* "samp" */ | String /* "script" */ | String /* "section" */ | String /* "select" */ | String /* "small" */ | String /* "source" */ | String /* "span" */ | String /* "strong" */ | String /* "style" */ | String /* "sub" */ | String /* "summary" */ | String /* "sup" */ | String /* "table" */ | String /* "tbody" */ | String /* "td" */ | String /* "textarea" */ | String /* "tfoot" */ | String /* "th" */ | String /* "thead" */ | String /* "time" */ | String /* "title" */ | String /* "tr" */ | String /* "track" */ | String /* "u" */ | String /* "ul" */ | String /* "var" */ | String /* "video" */ | String /* "wbr" */ | String /* "webview" */ */, props: ClassAttributes<T>? /* ClassAttributes<T> & P */ = definedExternally /* null */, vararg children: Boolean): DetailedReactHTMLElement<P, T> = definedExternally
external fun <P : HTMLAttributes<T>, T : HTMLElement> createElement(type: dynamic /* String /* "object" */ | String /* "a" */ | String /* "abbr" */ | String /* "address" */ | String /* "area" */ | String /* "article" */ | String /* "aside" */ | String /* "audio" */ | String /* "b" */ | String /* "base" */ | String /* "bdi" */ | String /* "bdo" */ | String /* "big" */ | String /* "blockquote" */ | String /* "body" */ | String /* "br" */ | String /* "button" */ | String /* "canvas" */ | String /* "caption" */ | String /* "cite" */ | String /* "code" */ | String /* "col" */ | String /* "colgroup" */ | String /* "data" */ | String /* "datalist" */ | String /* "dd" */ | String /* "del" */ | String /* "details" */ | String /* "dfn" */ | String /* "dialog" */ | String /* "div" */ | String /* "dl" */ | String /* "dt" */ | String /* "em" */ | String /* "embed" */ | String /* "fieldset" */ | String /* "figcaption" */ | String /* "figure" */ | String /* "footer" */ | String /* "form" */ | String /* "h1" */ | String /* "h2" */ | String /* "h3" */ | String /* "h4" */ | String /* "h5" */ | String /* "h6" */ | String /* "head" */ | String /* "header" */ | String /* "hgroup" */ | String /* "hr" */ | String /* "html" */ | String /* "i" */ | String /* "iframe" */ | String /* "img" */ | String /* "input" */ | String /* "ins" */ | String /* "kbd" */ | String /* "keygen" */ | String /* "label" */ | String /* "legend" */ | String /* "li" */ | String /* "link" */ | String /* "main" */ | String /* "map" */ | String /* "mark" */ | String /* "menu" */ | String /* "menuitem" */ | String /* "meta" */ | String /* "meter" */ | String /* "nav" */ | String /* "noscript" */ | String /* "ol" */ | String /* "optgroup" */ | String /* "option" */ | String /* "output" */ | String /* "p" */ | String /* "param" */ | String /* "picture" */ | String /* "pre" */ | String /* "progress" */ | String /* "q" */ | String /* "rp" */ | String /* "rt" */ | String /* "ruby" */ | String /* "s" */ | String /* "samp" */ | String /* "script" */ | String /* "section" */ | String /* "select" */ | String /* "small" */ | String /* "source" */ | String /* "span" */ | String /* "strong" */ | String /* "style" */ | String /* "sub" */ | String /* "summary" */ | String /* "sup" */ | String /* "table" */ | String /* "tbody" */ | String /* "td" */ | String /* "textarea" */ | String /* "tfoot" */ | String /* "th" */ | String /* "thead" */ | String /* "time" */ | String /* "title" */ | String /* "tr" */ | String /* "track" */ | String /* "u" */ | String /* "ul" */ | String /* "var" */ | String /* "video" */ | String /* "wbr" */ | String /* "webview" */ */, props: ClassAttributes<T>? /* ClassAttributes<T> & P */ = definedExternally /* null */, vararg children: Any?): DetailedReactHTMLElement<P, T> = definedExternally
external fun <P : HTMLAttributes<T>, T : HTMLElement> createElement(type: dynamic /* String /* "object" */ | String /* "a" */ | String /* "abbr" */ | String /* "address" */ | String /* "area" */ | String /* "article" */ | String /* "aside" */ | String /* "audio" */ | String /* "b" */ | String /* "base" */ | String /* "bdi" */ | String /* "bdo" */ | String /* "big" */ | String /* "blockquote" */ | String /* "body" */ | String /* "br" */ | String /* "button" */ | String /* "canvas" */ | String /* "caption" */ | String /* "cite" */ | String /* "code" */ | String /* "col" */ | String /* "colgroup" */ | String /* "data" */ | String /* "datalist" */ | String /* "dd" */ | String /* "del" */ | String /* "details" */ | String /* "dfn" */ | String /* "dialog" */ | String /* "div" */ | String /* "dl" */ | String /* "dt" */ | String /* "em" */ | String /* "embed" */ | String /* "fieldset" */ | String /* "figcaption" */ | String /* "figure" */ | String /* "footer" */ | String /* "form" */ | String /* "h1" */ | String /* "h2" */ | String /* "h3" */ | String /* "h4" */ | String /* "h5" */ | String /* "h6" */ | String /* "head" */ | String /* "header" */ | String /* "hgroup" */ | String /* "hr" */ | String /* "html" */ | String /* "i" */ | String /* "iframe" */ | String /* "img" */ | String /* "input" */ | String /* "ins" */ | String /* "kbd" */ | String /* "keygen" */ | String /* "label" */ | String /* "legend" */ | String /* "li" */ | String /* "link" */ | String /* "main" */ | String /* "map" */ | String /* "mark" */ | String /* "menu" */ | String /* "menuitem" */ | String /* "meta" */ | String /* "meter" */ | String /* "nav" */ | String /* "noscript" */ | String /* "ol" */ | String /* "optgroup" */ | String /* "option" */ | String /* "output" */ | String /* "p" */ | String /* "param" */ | String /* "picture" */ | String /* "pre" */ | String /* "progress" */ | String /* "q" */ | String /* "rp" */ | String /* "rt" */ | String /* "ruby" */ | String /* "s" */ | String /* "samp" */ | String /* "script" */ | String /* "section" */ | String /* "select" */ | String /* "small" */ | String /* "source" */ | String /* "span" */ | String /* "strong" */ | String /* "style" */ | String /* "sub" */ | String /* "summary" */ | String /* "sup" */ | String /* "table" */ | String /* "tbody" */ | String /* "td" */ | String /* "textarea" */ | String /* "tfoot" */ | String /* "th" */ | String /* "thead" */ | String /* "time" */ | String /* "title" */ | String /* "tr" */ | String /* "track" */ | String /* "u" */ | String /* "ul" */ | String /* "var" */ | String /* "video" */ | String /* "wbr" */ | String /* "webview" */ */, props: ClassAttributes<T>? /* ClassAttributes<T> & P */ = definedExternally /* null */, vararg children: ReactElement<Any>): DetailedReactHTMLElement<P, T> = definedExternally
external fun <P : HTMLAttributes<T>, T : HTMLElement> createElement(type: dynamic /* String /* "object" */ | String /* "a" */ | String /* "abbr" */ | String /* "address" */ | String /* "area" */ | String /* "article" */ | String /* "aside" */ | String /* "audio" */ | String /* "b" */ | String /* "base" */ | String /* "bdi" */ | String /* "bdo" */ | String /* "big" */ | String /* "blockquote" */ | String /* "body" */ | String /* "br" */ | String /* "button" */ | String /* "canvas" */ | String /* "caption" */ | String /* "cite" */ | String /* "code" */ | String /* "col" */ | String /* "colgroup" */ | String /* "data" */ | String /* "datalist" */ | String /* "dd" */ | String /* "del" */ | String /* "details" */ | String /* "dfn" */ | String /* "dialog" */ | String /* "div" */ | String /* "dl" */ | String /* "dt" */ | String /* "em" */ | String /* "embed" */ | String /* "fieldset" */ | String /* "figcaption" */ | String /* "figure" */ | String /* "footer" */ | String /* "form" */ | String /* "h1" */ | String /* "h2" */ | String /* "h3" */ | String /* "h4" */ | String /* "h5" */ | String /* "h6" */ | String /* "head" */ | String /* "header" */ | String /* "hgroup" */ | String /* "hr" */ | String /* "html" */ | String /* "i" */ | String /* "iframe" */ | String /* "img" */ | String /* "input" */ | String /* "ins" */ | String /* "kbd" */ | String /* "keygen" */ | String /* "label" */ | String /* "legend" */ | String /* "li" */ | String /* "link" */ | String /* "main" */ | String /* "map" */ | String /* "mark" */ | String /* "menu" */ | String /* "menuitem" */ | String /* "meta" */ | String /* "meter" */ | String /* "nav" */ | String /* "noscript" */ | String /* "ol" */ | String /* "optgroup" */ | String /* "option" */ | String /* "output" */ | String /* "p" */ | String /* "param" */ | String /* "picture" */ | String /* "pre" */ | String /* "progress" */ | String /* "q" */ | String /* "rp" */ | String /* "rt" */ | String /* "ruby" */ | String /* "s" */ | String /* "samp" */ | String /* "script" */ | String /* "section" */ | String /* "select" */ | String /* "small" */ | String /* "source" */ | String /* "span" */ | String /* "strong" */ | String /* "style" */ | String /* "sub" */ | String /* "summary" */ | String /* "sup" */ | String /* "table" */ | String /* "tbody" */ | String /* "td" */ | String /* "textarea" */ | String /* "tfoot" */ | String /* "th" */ | String /* "thead" */ | String /* "time" */ | String /* "title" */ | String /* "tr" */ | String /* "track" */ | String /* "u" */ | String /* "ul" */ | String /* "var" */ | String /* "video" */ | String /* "wbr" */ | String /* "webview" */ */, props: ClassAttributes<T>? /* ClassAttributes<T> & P */ = definedExternally /* null */, vararg children: Array<dynamic /* String | Number | Boolean | Array<Any> | ReactElement<Any> */>): DetailedReactHTMLElement<P, T> = definedExternally
external fun <P : HTMLAttributes<T>, T : HTMLElement> createElement(type: dynamic /* String /* "object" */ | String /* "a" */ | String /* "abbr" */ | String /* "address" */ | String /* "area" */ | String /* "article" */ | String /* "aside" */ | String /* "audio" */ | String /* "b" */ | String /* "base" */ | String /* "bdi" */ | String /* "bdo" */ | String /* "big" */ | String /* "blockquote" */ | String /* "body" */ | String /* "br" */ | String /* "button" */ | String /* "canvas" */ | String /* "caption" */ | String /* "cite" */ | String /* "code" */ | String /* "col" */ | String /* "colgroup" */ | String /* "data" */ | String /* "datalist" */ | String /* "dd" */ | String /* "del" */ | String /* "details" */ | String /* "dfn" */ | String /* "dialog" */ | String /* "div" */ | String /* "dl" */ | String /* "dt" */ | String /* "em" */ | String /* "embed" */ | String /* "fieldset" */ | String /* "figcaption" */ | String /* "figure" */ | String /* "footer" */ | String /* "form" */ | String /* "h1" */ | String /* "h2" */ | String /* "h3" */ | String /* "h4" */ | String /* "h5" */ | String /* "h6" */ | String /* "head" */ | String /* "header" */ | String /* "hgroup" */ | String /* "hr" */ | String /* "html" */ | String /* "i" */ | String /* "iframe" */ | String /* "img" */ | String /* "input" */ | String /* "ins" */ | String /* "kbd" */ | String /* "keygen" */ | String /* "label" */ | String /* "legend" */ | String /* "li" */ | String /* "link" */ | String /* "main" */ | String /* "map" */ | String /* "mark" */ | String /* "menu" */ | String /* "menuitem" */ | String /* "meta" */ | String /* "meter" */ | String /* "nav" */ | String /* "noscript" */ | String /* "ol" */ | String /* "optgroup" */ | String /* "option" */ | String /* "output" */ | String /* "p" */ | String /* "param" */ | String /* "picture" */ | String /* "pre" */ | String /* "progress" */ | String /* "q" */ | String /* "rp" */ | String /* "rt" */ | String /* "ruby" */ | String /* "s" */ | String /* "samp" */ | String /* "script" */ | String /* "section" */ | String /* "select" */ | String /* "small" */ | String /* "source" */ | String /* "span" */ | String /* "strong" */ | String /* "style" */ | String /* "sub" */ | String /* "summary" */ | String /* "sup" */ | String /* "table" */ | String /* "tbody" */ | String /* "td" */ | String /* "textarea" */ | String /* "tfoot" */ | String /* "th" */ | String /* "thead" */ | String /* "time" */ | String /* "title" */ | String /* "tr" */ | String /* "track" */ | String /* "u" */ | String /* "ul" */ | String /* "var" */ | String /* "video" */ | String /* "wbr" */ | String /* "webview" */ */, props: ClassAttributes<T>? /* ClassAttributes<T> & P */ = definedExternally /* null */, vararg children: Nothing?): DetailedReactHTMLElement<P, T> = definedExternally
external fun <P : SVGAttributes<T>, T : SVGElement> createElement(type: dynamic /* String /* "symbol" */ | String /* "svg" */ | String /* "animate" */ | String /* "circle" */ | String /* "defs" */ | String /* "ellipse" */ | String /* "g" */ | String /* "image" */ | String /* "line" */ | String /* "linearGradient" */ | String /* "mask" */ | String /* "path" */ | String /* "pattern" */ | String /* "polygon" */ | String /* "polyline" */ | String /* "radialGradient" */ | String /* "rect" */ | String /* "stop" */ | String /* "text" */ | String /* "tspan" */ | String /* "use" */ */, props: ClassAttributes<T>? /* ClassAttributes<T> & P */ = definedExternally /* null */, vararg children: String): ReactSVGElement = definedExternally
external fun <P : SVGAttributes<T>, T : SVGElement> createElement(type: dynamic /* String /* "symbol" */ | String /* "svg" */ | String /* "animate" */ | String /* "circle" */ | String /* "defs" */ | String /* "ellipse" */ | String /* "g" */ | String /* "image" */ | String /* "line" */ | String /* "linearGradient" */ | String /* "mask" */ | String /* "path" */ | String /* "pattern" */ | String /* "polygon" */ | String /* "polyline" */ | String /* "radialGradient" */ | String /* "rect" */ | String /* "stop" */ | String /* "text" */ | String /* "tspan" */ | String /* "use" */ */, props: ClassAttributes<T>? /* ClassAttributes<T> & P */ = definedExternally /* null */, vararg children: Number): ReactSVGElement = definedExternally
external fun <P : SVGAttributes<T>, T : SVGElement> createElement(type: dynamic /* String /* "symbol" */ | String /* "svg" */ | String /* "animate" */ | String /* "circle" */ | String /* "defs" */ | String /* "ellipse" */ | String /* "g" */ | String /* "image" */ | String /* "line" */ | String /* "linearGradient" */ | String /* "mask" */ | String /* "path" */ | String /* "pattern" */ | String /* "polygon" */ | String /* "polyline" */ | String /* "radialGradient" */ | String /* "rect" */ | String /* "stop" */ | String /* "text" */ | String /* "tspan" */ | String /* "use" */ */, props: ClassAttributes<T>? /* ClassAttributes<T> & P */ = definedExternally /* null */, vararg children: Boolean): ReactSVGElement = definedExternally
external fun <P : SVGAttributes<T>, T : SVGElement> createElement(type: dynamic /* String /* "symbol" */ | String /* "svg" */ | String /* "animate" */ | String /* "circle" */ | String /* "defs" */ | String /* "ellipse" */ | String /* "g" */ | String /* "image" */ | String /* "line" */ | String /* "linearGradient" */ | String /* "mask" */ | String /* "path" */ | String /* "pattern" */ | String /* "polygon" */ | String /* "polyline" */ | String /* "radialGradient" */ | String /* "rect" */ | String /* "stop" */ | String /* "text" */ | String /* "tspan" */ | String /* "use" */ */, props: ClassAttributes<T>? /* ClassAttributes<T> & P */ = definedExternally /* null */, vararg children: Any?): ReactSVGElement = definedExternally
external fun <P : SVGAttributes<T>, T : SVGElement> createElement(type: dynamic /* String /* "symbol" */ | String /* "svg" */ | String /* "animate" */ | String /* "circle" */ | String /* "defs" */ | String /* "ellipse" */ | String /* "g" */ | String /* "image" */ | String /* "line" */ | String /* "linearGradient" */ | String /* "mask" */ | String /* "path" */ | String /* "pattern" */ | String /* "polygon" */ | String /* "polyline" */ | String /* "radialGradient" */ | String /* "rect" */ | String /* "stop" */ | String /* "text" */ | String /* "tspan" */ | String /* "use" */ */, props: ClassAttributes<T>? /* ClassAttributes<T> & P */ = definedExternally /* null */, vararg children: ReactElement<Any>): ReactSVGElement = definedExternally
external fun <P : SVGAttributes<T>, T : SVGElement> createElement(type: dynamic /* String /* "symbol" */ | String /* "svg" */ | String /* "animate" */ | String /* "circle" */ | String /* "defs" */ | String /* "ellipse" */ | String /* "g" */ | String /* "image" */ | String /* "line" */ | String /* "linearGradient" */ | String /* "mask" */ | String /* "path" */ | String /* "pattern" */ | String /* "polygon" */ | String /* "polyline" */ | String /* "radialGradient" */ | String /* "rect" */ | String /* "stop" */ | String /* "text" */ | String /* "tspan" */ | String /* "use" */ */, props: ClassAttributes<T>? /* ClassAttributes<T> & P */ = definedExternally /* null */, vararg children: Array<dynamic /* String | Number | Boolean | Array<Any> | ReactElement<Any> */>): ReactSVGElement = definedExternally
external fun <P : SVGAttributes<T>, T : SVGElement> createElement(type: dynamic /* String /* "symbol" */ | String /* "svg" */ | String /* "animate" */ | String /* "circle" */ | String /* "defs" */ | String /* "ellipse" */ | String /* "g" */ | String /* "image" */ | String /* "line" */ | String /* "linearGradient" */ | String /* "mask" */ | String /* "path" */ | String /* "pattern" */ | String /* "polygon" */ | String /* "polyline" */ | String /* "radialGradient" */ | String /* "rect" */ | String /* "stop" */ | String /* "text" */ | String /* "tspan" */ | String /* "use" */ */, props: ClassAttributes<T>? /* ClassAttributes<T> & P */ = definedExternally /* null */, vararg children: Nothing?): ReactSVGElement = definedExternally
external fun <P : DOMAttributes<T>, T : Element> createElement(type: String, props: ClassAttributes<T>? /* ClassAttributes<T> & P */ = definedExternally /* null */, vararg children: String): DOMElement<P, T> = definedExternally
external fun <P : DOMAttributes<T>, T : Element> createElement(type: String, props: ClassAttributes<T>? /* ClassAttributes<T> & P */ = definedExternally /* null */, vararg children: Number): DOMElement<P, T> = definedExternally
external fun <P : DOMAttributes<T>, T : Element> createElement(type: String, props: ClassAttributes<T>? /* ClassAttributes<T> & P */ = definedExternally /* null */, vararg children: Boolean): DOMElement<P, T> = definedExternally
external fun <P : DOMAttributes<T>, T : Element> createElement(type: String, props: ClassAttributes<T>? /* ClassAttributes<T> & P */ = definedExternally /* null */, vararg children: Any?): DOMElement<P, T> = definedExternally
external fun <P : DOMAttributes<T>, T : Element> createElement(type: String, props: ClassAttributes<T>? /* ClassAttributes<T> & P */ = definedExternally /* null */, vararg children: ReactElement<Any>): DOMElement<P, T> = definedExternally
external fun <P : DOMAttributes<T>, T : Element> createElement(type: String, props: ClassAttributes<T>? /* ClassAttributes<T> & P */ = definedExternally /* null */, vararg children: Array<dynamic /* String | Number | Boolean | Array<Any> | ReactElement<Any> */>): DOMElement<P, T> = definedExternally
external fun <P : DOMAttributes<T>, T : Element> createElement(type: String, props: ClassAttributes<T>? /* ClassAttributes<T> & P */ = definedExternally /* null */, vararg children: Nothing?): DOMElement<P, T> = definedExternally
external fun <P> createElement(type: StatelessComponent<P>, props: Attributes? /* Attributes & P */ = definedExternally /* null */, vararg children: String): SFCElement<P> = definedExternally
external fun <P> createElement(type: StatelessComponent<P>, props: Attributes? /* Attributes & P */ = definedExternally /* null */, vararg children: Number): SFCElement<P> = definedExternally
external fun <P> createElement(type: StatelessComponent<P>, props: Attributes? /* Attributes & P */ = definedExternally /* null */, vararg children: Boolean): SFCElement<P> = definedExternally
external fun <P> createElement(type: StatelessComponent<P>, props: Attributes? /* Attributes & P */ = definedExternally /* null */, vararg children: Any?): SFCElement<P> = definedExternally
external fun <P> createElement(type: StatelessComponent<P>, props: Attributes? /* Attributes & P */ = definedExternally /* null */, vararg children: ReactElement<Any>): SFCElement<P> = definedExternally
external fun <P> createElement(type: StatelessComponent<P>, props: Attributes? /* Attributes & P */ = definedExternally /* null */, vararg children: Array<dynamic /* String | Number | Boolean | Array<Any> | ReactElement<Any> */>): SFCElement<P> = definedExternally
external fun <P> createElement(type: StatelessComponent<P>, props: Attributes? /* Attributes & P */ = definedExternally /* null */, vararg children: Nothing?): SFCElement<P> = definedExternally
external fun <P> createElement(type: ClassicComponentClass<P> /* ClassicComponentClass<P> & Any? & Any? */, props: ClassAttributes<ClassicComponent<P, React.ComponentState>>? /* ClassAttributes<ClassicComponent<P, React.ComponentState>> & P */ = definedExternally /* null */, vararg children: String): ComponentElement<P, ClassicComponent<P, React.ComponentState>> = definedExternally
external fun <P> createElement(type: ClassicComponentClass<P> /* ClassicComponentClass<P> & Any? & Any? */, props: ClassAttributes<ClassicComponent<P, React.ComponentState>>? /* ClassAttributes<ClassicComponent<P, React.ComponentState>> & P */ = definedExternally /* null */, vararg children: Number): ComponentElement<P, ClassicComponent<P, React.ComponentState>> = definedExternally
external fun <P> createElement(type: ClassicComponentClass<P> /* ClassicComponentClass<P> & Any? & Any? */, props: ClassAttributes<ClassicComponent<P, React.ComponentState>>? /* ClassAttributes<ClassicComponent<P, React.ComponentState>> & P */ = definedExternally /* null */, vararg children: Boolean): ComponentElement<P, ClassicComponent<P, React.ComponentState>> = definedExternally
external fun <P> createElement(type: ClassicComponentClass<P> /* ClassicComponentClass<P> & Any? & Any? */, props: ClassAttributes<ClassicComponent<P, React.ComponentState>>? /* ClassAttributes<ClassicComponent<P, React.ComponentState>> & P */ = definedExternally /* null */, vararg children: Any?): ComponentElement<P, ClassicComponent<P, React.ComponentState>> = definedExternally
external fun <P> createElement(type: ClassicComponentClass<P> /* ClassicComponentClass<P> & Any? & Any? */, props: ClassAttributes<ClassicComponent<P, React.ComponentState>>? /* ClassAttributes<ClassicComponent<P, React.ComponentState>> & P */ = definedExternally /* null */, vararg children: ReactElement<Any>): ComponentElement<P, ClassicComponent<P, React.ComponentState>> = definedExternally
external fun <P> createElement(type: ClassicComponentClass<P> /* ClassicComponentClass<P> & Any? & Any? */, props: ClassAttributes<ClassicComponent<P, React.ComponentState>>? /* ClassAttributes<ClassicComponent<P, React.ComponentState>> & P */ = definedExternally /* null */, vararg children: Array<dynamic /* String | Number | Boolean | Array<Any> | ReactElement<Any> */>): ComponentElement<P, ClassicComponent<P, React.ComponentState>> = definedExternally
external fun <P> createElement(type: ClassicComponentClass<P> /* ClassicComponentClass<P> & Any? & Any? */, props: ClassAttributes<ClassicComponent<P, React.ComponentState>>? /* ClassAttributes<ClassicComponent<P, React.ComponentState>> & P */ = definedExternally /* null */, vararg children: Nothing?): ComponentElement<P, ClassicComponent<P, React.ComponentState>> = definedExternally
external fun <P, T : Component<P, React.ComponentState>, C : ComponentClass<P>> createElement(type: C /* C & Any? & Any? */, props: ClassAttributes<T>? /* ClassAttributes<T> & P */ = definedExternally /* null */, vararg children: String): ComponentElement<P, T> = definedExternally
external fun <P, T : Component<P, React.ComponentState>, C : ComponentClass<P>> createElement(type: C /* C & Any? & Any? */, props: ClassAttributes<T>? /* ClassAttributes<T> & P */ = definedExternally /* null */, vararg children: Number): ComponentElement<P, T> = definedExternally
external fun <P, T : Component<P, React.ComponentState>, C : ComponentClass<P>> createElement(type: C /* C & Any? & Any? */, props: ClassAttributes<T>? /* ClassAttributes<T> & P */ = definedExternally /* null */, vararg children: Boolean): ComponentElement<P, T> = definedExternally
external fun <P, T : Component<P, React.ComponentState>, C : ComponentClass<P>> createElement(type: C /* C & Any? & Any? */, props: ClassAttributes<T>? /* ClassAttributes<T> & P */ = definedExternally /* null */, vararg children: Any?): ComponentElement<P, T> = definedExternally
external fun <P, T : Component<P, React.ComponentState>, C : ComponentClass<P>> createElement(type: C /* C & Any? & Any? */, props: ClassAttributes<T>? /* ClassAttributes<T> & P */ = definedExternally /* null */, vararg children: ReactElement<Any>): ComponentElement<P, T> = definedExternally
external fun <P, T : Component<P, React.ComponentState>, C : ComponentClass<P>> createElement(type: C /* C & Any? & Any? */, props: ClassAttributes<T>? /* ClassAttributes<T> & P */ = definedExternally /* null */, vararg children: Array<dynamic /* String | Number | Boolean | Array<Any> | ReactElement<Any> */>): ComponentElement<P, T> = definedExternally
external fun <P, T : Component<P, React.ComponentState>, C : ComponentClass<P>> createElement(type: C /* C & Any? & Any? */, props: ClassAttributes<T>? /* ClassAttributes<T> & P */ = definedExternally /* null */, vararg children: Nothing?): ComponentElement<P, T> = definedExternally
external fun <P> createElement(type: String, props: Attributes? /* Attributes & P */ = definedExternally /* null */, vararg children: dynamic /* String | Number | Boolean | Any? | ReactElement<Any> | Array<dynamic /* String | Number | Boolean | Array<Any> | ReactElement<Any> */> | Nothing? */): ReactElement<P> = definedExternally
external fun <P> createElement(type: StatelessComponent<P>, props: Attributes? /* Attributes & P */ = definedExternally /* null */, vararg children: dynamic /* String | Number | Boolean | Any? | ReactElement<Any> | Array<dynamic /* String | Number | Boolean | Array<Any> | ReactElement<Any> */> | Nothing? */): ReactElement<P> = definedExternally
external fun <P> createElement(type: ComponentClass<P>, props: Attributes? /* Attributes & P */ = definedExternally /* null */, vararg children: dynamic /* String | Number | Boolean | Any? | ReactElement<Any> | Array<dynamic /* String | Number | Boolean | Array<Any> | ReactElement<Any> */> | Nothing? */): ReactElement<P> = definedExternally
external fun <P : HTMLAttributes<T>, T : HTMLElement> cloneElement(element: DetailedReactHTMLElement<P, T>, props: P? = definedExternally /* null */, vararg children: String): DetailedReactHTMLElement<P, T> = definedExternally
external fun <P : HTMLAttributes<T>, T : HTMLElement> cloneElement(element: DetailedReactHTMLElement<P, T>, props: P? = definedExternally /* null */, vararg children: Number): DetailedReactHTMLElement<P, T> = definedExternally
external fun <P : HTMLAttributes<T>, T : HTMLElement> cloneElement(element: DetailedReactHTMLElement<P, T>, props: P? = definedExternally /* null */, vararg children: Boolean): DetailedReactHTMLElement<P, T> = definedExternally
external fun <P : HTMLAttributes<T>, T : HTMLElement> cloneElement(element: DetailedReactHTMLElement<P, T>, props: P? = definedExternally /* null */, vararg children: Any?): DetailedReactHTMLElement<P, T> = definedExternally
external fun <P : HTMLAttributes<T>, T : HTMLElement> cloneElement(element: DetailedReactHTMLElement<P, T>, props: P? = definedExternally /* null */, vararg children: ReactElement<Any>): DetailedReactHTMLElement<P, T> = definedExternally
external fun <P : HTMLAttributes<T>, T : HTMLElement> cloneElement(element: DetailedReactHTMLElement<P, T>, props: P? = definedExternally /* null */, vararg children: Array<dynamic /* String | Number | Boolean | Array<Any> | ReactElement<Any> */>): DetailedReactHTMLElement<P, T> = definedExternally
external fun <P : HTMLAttributes<T>, T : HTMLElement> cloneElement(element: DetailedReactHTMLElement<P, T>, props: P? = definedExternally /* null */, vararg children: Nothing?): DetailedReactHTMLElement<P, T> = definedExternally
external fun <P : HTMLAttributes<T>, T : HTMLElement> cloneElement(element: ReactHTMLElement<T>, props: P? = definedExternally /* null */, vararg children: String): ReactHTMLElement<T> = definedExternally
external fun <P : HTMLAttributes<T>, T : HTMLElement> cloneElement(element: ReactHTMLElement<T>, props: P? = definedExternally /* null */, vararg children: Number): ReactHTMLElement<T> = definedExternally
external fun <P : HTMLAttributes<T>, T : HTMLElement> cloneElement(element: ReactHTMLElement<T>, props: P? = definedExternally /* null */, vararg children: Boolean): ReactHTMLElement<T> = definedExternally
external fun <P : HTMLAttributes<T>, T : HTMLElement> cloneElement(element: ReactHTMLElement<T>, props: P? = definedExternally /* null */, vararg children: Any?): ReactHTMLElement<T> = definedExternally
external fun <P : HTMLAttributes<T>, T : HTMLElement> cloneElement(element: ReactHTMLElement<T>, props: P? = definedExternally /* null */, vararg children: ReactElement<Any>): ReactHTMLElement<T> = definedExternally
external fun <P : HTMLAttributes<T>, T : HTMLElement> cloneElement(element: ReactHTMLElement<T>, props: P? = definedExternally /* null */, vararg children: Array<dynamic /* String | Number | Boolean | Array<Any> | ReactElement<Any> */>): ReactHTMLElement<T> = definedExternally
external fun <P : HTMLAttributes<T>, T : HTMLElement> cloneElement(element: ReactHTMLElement<T>, props: P? = definedExternally /* null */, vararg children: Nothing?): ReactHTMLElement<T> = definedExternally
external fun <P : SVGAttributes<T>, T : SVGElement> cloneElement(element: ReactSVGElement, props: P? = definedExternally /* null */, vararg children: String): ReactSVGElement = definedExternally
external fun <P : SVGAttributes<T>, T : SVGElement> cloneElement(element: ReactSVGElement, props: P? = definedExternally /* null */, vararg children: Number): ReactSVGElement = definedExternally
external fun <P : SVGAttributes<T>, T : SVGElement> cloneElement(element: ReactSVGElement, props: P? = definedExternally /* null */, vararg children: Boolean): ReactSVGElement = definedExternally
external fun <P : SVGAttributes<T>, T : SVGElement> cloneElement(element: ReactSVGElement, props: P? = definedExternally /* null */, vararg children: Any?): ReactSVGElement = definedExternally
external fun <P : SVGAttributes<T>, T : SVGElement> cloneElement(element: ReactSVGElement, props: P? = definedExternally /* null */, vararg children: ReactElement<Any>): ReactSVGElement = definedExternally
external fun <P : SVGAttributes<T>, T : SVGElement> cloneElement(element: ReactSVGElement, props: P? = definedExternally /* null */, vararg children: Array<dynamic /* String | Number | Boolean | Array<Any> | ReactElement<Any> */>): ReactSVGElement = definedExternally
external fun <P : SVGAttributes<T>, T : SVGElement> cloneElement(element: ReactSVGElement, props: P? = definedExternally /* null */, vararg children: Nothing?): ReactSVGElement = definedExternally
external fun <P : DOMAttributes<T>, T : Element> cloneElement(element: DOMElement<P, T>, props: DOMAttributes<T>? /* DOMAttributes<T> & P */ = definedExternally /* null */, vararg children: String): DOMElement<P, T> = definedExternally
external fun <P : DOMAttributes<T>, T : Element> cloneElement(element: DOMElement<P, T>, props: DOMAttributes<T>? /* DOMAttributes<T> & P */ = definedExternally /* null */, vararg children: Number): DOMElement<P, T> = definedExternally
external fun <P : DOMAttributes<T>, T : Element> cloneElement(element: DOMElement<P, T>, props: DOMAttributes<T>? /* DOMAttributes<T> & P */ = definedExternally /* null */, vararg children: Boolean): DOMElement<P, T> = definedExternally
external fun <P : DOMAttributes<T>, T : Element> cloneElement(element: DOMElement<P, T>, props: DOMAttributes<T>? /* DOMAttributes<T> & P */ = definedExternally /* null */, vararg children: Any?): DOMElement<P, T> = definedExternally
external fun <P : DOMAttributes<T>, T : Element> cloneElement(element: DOMElement<P, T>, props: DOMAttributes<T>? /* DOMAttributes<T> & P */ = definedExternally /* null */, vararg children: ReactElement<Any>): DOMElement<P, T> = definedExternally
external fun <P : DOMAttributes<T>, T : Element> cloneElement(element: DOMElement<P, T>, props: DOMAttributes<T>? /* DOMAttributes<T> & P */ = definedExternally /* null */, vararg children: Array<dynamic /* String | Number | Boolean | Array<Any> | ReactElement<Any> */>): DOMElement<P, T> = definedExternally
external fun <P : DOMAttributes<T>, T : Element> cloneElement(element: DOMElement<P, T>, props: DOMAttributes<T>? /* DOMAttributes<T> & P */ = definedExternally /* null */, vararg children: Nothing?): DOMElement<P, T> = definedExternally
external fun <P : Q, Q> cloneElement(element: SFCElement<P>, props: Q? = definedExternally /* null */, vararg children: String): SFCElement<P> = definedExternally
external fun <P : Q, Q> cloneElement(element: SFCElement<P>, props: Q? = definedExternally /* null */, vararg children: Number): SFCElement<P> = definedExternally
external fun <P : Q, Q> cloneElement(element: SFCElement<P>, props: Q? = definedExternally /* null */, vararg children: Boolean): SFCElement<P> = definedExternally
external fun <P : Q, Q> cloneElement(element: SFCElement<P>, props: Q? = definedExternally /* null */, vararg children: Any?): SFCElement<P> = definedExternally
external fun <P : Q, Q> cloneElement(element: SFCElement<P>, props: Q? = definedExternally /* null */, vararg children: ReactElement<Any>): SFCElement<P> = definedExternally
external fun <P : Q, Q> cloneElement(element: SFCElement<P>, props: Q? = definedExternally /* null */, vararg children: Array<dynamic /* String | Number | Boolean | Array<Any> | ReactElement<Any> */>): SFCElement<P> = definedExternally
external fun <P : Q, Q> cloneElement(element: SFCElement<P>, props: Q? = definedExternally /* null */, vararg children: Nothing?): SFCElement<P> = definedExternally
external fun <P : Q, Q, T : Component<P, React.ComponentState>> cloneElement(element: ComponentElement<P, T>, props: Q? = definedExternally /* null */, vararg children: String): ComponentElement<P, T> = definedExternally
external fun <P : Q, Q, T : Component<P, React.ComponentState>> cloneElement(element: ComponentElement<P, T>, props: Q? = definedExternally /* null */, vararg children: Number): ComponentElement<P, T> = definedExternally
external fun <P : Q, Q, T : Component<P, React.ComponentState>> cloneElement(element: ComponentElement<P, T>, props: Q? = definedExternally /* null */, vararg children: Boolean): ComponentElement<P, T> = definedExternally
external fun <P : Q, Q, T : Component<P, React.ComponentState>> cloneElement(element: ComponentElement<P, T>, props: Q? = definedExternally /* null */, vararg children: Any?): ComponentElement<P, T> = definedExternally
external fun <P : Q, Q, T : Component<P, React.ComponentState>> cloneElement(element: ComponentElement<P, T>, props: Q? = definedExternally /* null */, vararg children: ReactElement<Any>): ComponentElement<P, T> = definedExternally
external fun <P : Q, Q, T : Component<P, React.ComponentState>> cloneElement(element: ComponentElement<P, T>, props: Q? = definedExternally /* null */, vararg children: Array<dynamic /* String | Number | Boolean | Array<Any> | ReactElement<Any> */>): ComponentElement<P, T> = definedExternally
external fun <P : Q, Q, T : Component<P, React.ComponentState>> cloneElement(element: ComponentElement<P, T>, props: Q? = definedExternally /* null */, vararg children: Nothing?): ComponentElement<P, T> = definedExternally
external fun <P : Q, Q> cloneElement(element: ReactElement<P>, props: Q? = definedExternally /* null */, vararg children: String): ReactElement<P> = definedExternally
external fun <P : Q, Q> cloneElement(element: ReactElement<P>, props: Q? = definedExternally /* null */, vararg children: Number): ReactElement<P> = definedExternally
external fun <P : Q, Q> cloneElement(element: ReactElement<P>, props: Q? = definedExternally /* null */, vararg children: Boolean): ReactElement<P> = definedExternally
external fun <P : Q, Q> cloneElement(element: ReactElement<P>, props: Q? = definedExternally /* null */, vararg children: Any?): ReactElement<P> = definedExternally
external fun <P : Q, Q> cloneElement(element: ReactElement<P>, props: Q? = definedExternally /* null */, vararg children: ReactElement<Any>): ReactElement<P> = definedExternally
external fun <P : Q, Q> cloneElement(element: ReactElement<P>, props: Q? = definedExternally /* null */, vararg children: Array<dynamic /* String | Number | Boolean | Array<Any> | ReactElement<Any> */>): ReactElement<P> = definedExternally
external fun <P : Q, Q> cloneElement(element: ReactElement<P>, props: Q? = definedExternally /* null */, vararg children: Nothing?): ReactElement<P> = definedExternally
external fun <P> isValidElement(`object`: Any): Boolean = definedExternally
external var DOM: ReactDOM = definedExternally
external var PropTypes: ReactPropTypes = definedExternally
external var Children: ReactChildren = definedExternally
external var version: String = definedExternally
external open class Component<P, S>(props: P? = definedExternally /* null */, context: Any? = definedExternally /* null */) : ComponentLifecycle<P, S> {
    open fun <K : Any?> setState(state: S, callback: (() -> Any)? = definedExternally /* null */): Unit = definedExternally
    open fun <K : Any?> setState(state: (prevState: Any?, props: P) -> dynamic /* S | Any? */, callback: (() -> Any)? = definedExternally /* null */): Unit = definedExternally
    open fun <K : Any?> setState(state: Any?, callback: (() -> Any)? = definedExternally /* null */): Unit = definedExternally
    open fun forceUpdate(callBack: (() -> Any)? = definedExternally /* null */): Unit = definedExternally
    open fun render(): dynamic /* Boolean | global.JSX.Element | Nothing? */ = definedExternally
    open var props: Any? /* Any? & Any? */ = definedExternally
    open var state: Any? = definedExternally
    open var context: Any = definedExternally
    open var refs: `T$0` = definedExternally
}
external interface `T$0` {
    @nativeGetter
    operator fun get(key: String): dynamic /* Element | Component<Any, Any?> */
    @nativeSetter
    operator fun set(key: String, value: Element)
    @nativeSetter
    operator fun set(key: String, value: Component<Any, Any?>)
}
external open class PureComponent<P, S> : Component<P, S>
external interface ClassicComponent<P, S> : Component<P, S> {
    fun replaceState(nextState: S, callback: (() -> Any)? = definedExternally /* null */)
    fun isMounted(): Boolean
    val getInitialState: (() -> S)? get() = definedExternally
}
external interface ChildContextProvider<CC> {
    fun getChildContext(): CC
}
external interface `T$1` {
    var children: dynamic /* String | Number | Boolean | Any? | ReactElement<Any> | Array<dynamic /* String | Number | Boolean | Array<Any> | ReactElement<Any> */> | Nothing? */ get() = definedExternally; set(value) = definedExternally
}
external interface StatelessComponent<P> {
    @nativeInvoke
    operator fun invoke(props: P /* P & `T$1` */, context: Any? = definedExternally /* null */): ReactElement<Any>?
    var propTypes: Any? get() = definedExternally; set(value) = definedExternally
    var contextTypes: Any? get() = definedExternally; set(value) = definedExternally
    var defaultProps: Any? get() = definedExternally; set(value) = definedExternally
    var displayName: String? get() = definedExternally; set(value) = definedExternally
}
external interface ComponentClass<P> {
    var propTypes: Any? get() = definedExternally; set(value) = definedExternally
    var contextTypes: Any? get() = definedExternally; set(value) = definedExternally
    var childContextTypes: Any? get() = definedExternally; set(value) = definedExternally
    var defaultProps: Any? get() = definedExternally; set(value) = definedExternally
    var displayName: String? get() = definedExternally; set(value) = definedExternally
}
external interface ClassicComponentClass<P> : ComponentClass<P> {
    val getDefaultProps: (() -> P)? get() = definedExternally
}
external interface ComponentLifecycle<P, S> {
    val componentWillMount: (() -> Unit)? get() = definedExternally
    val componentDidMount: (() -> Unit)? get() = definedExternally
    val componentWillReceiveProps: ((nextProps: Any?, nextContext: Any) -> Unit)? get() = definedExternally
    val shouldComponentUpdate: ((nextProps: Any?, nextState: Any?, nextContext: Any) -> Boolean)? get() = definedExternally
    val componentWillUpdate: ((nextProps: Any?, nextState: Any?, nextContext: Any) -> Unit)? get() = definedExternally
    val componentDidUpdate: ((prevProps: Any?, prevState: Any?, prevContext: Any) -> Unit)? get() = definedExternally
    val componentWillUnmount: (() -> Unit)? get() = definedExternally
}
external interface Mixin<P, S> : ComponentLifecycle<P, S> {
    var mixins: Array<Mixin<P, S>>? get() = definedExternally; set(value) = definedExternally
    var statics: Json? get() = definedExternally; set(value) = definedExternally
    var displayName: String? get() = definedExternally; set(value) = definedExternally
    var propTypes: Any? get() = definedExternally; set(value) = definedExternally
    var contextTypes: Any? get() = definedExternally; set(value) = definedExternally
    var childContextTypes: Any? get() = definedExternally; set(value) = definedExternally
    val getDefaultProps: (() -> P)? get() = definedExternally
    val getInitialState: (() -> S)? get() = definedExternally
}
external interface ComponentSpec<P, S> : Mixin<P, S> {
    fun render(): ReactElement<Any>?
    @nativeGetter
    operator fun get(propertyName: String): Any?
    @nativeSetter
    operator fun set(propertyName: String, value: Any)
}
external interface SyntheticEvent<T> {
    var bubbles: Boolean
    var currentTarget: EventTarget /* EventTarget & T */
    var cancelable: Boolean
    var defaultPrevented: Boolean
    var eventPhase: Number
    var isTrusted: Boolean
    var nativeEvent: Event
    fun preventDefault()
    fun isDefaultPrevented(): Boolean
    fun stopPropagation()
    fun isPropagationStopped(): Boolean
    fun persist()
    var target: EventTarget
    var timeStamp: Number
    var type: String
}
external interface ClipboardEvent<T> : SyntheticEvent<T> {
    var clipboardData: DataTransfer
    override var nativeEvent: ClipboardEvent
}
external interface CompositionEvent<T> : SyntheticEvent<T> {
    var data: String
    override var nativeEvent: CompositionEvent
}
external interface DragEvent<T> : MouseEvent<T> {
    var dataTransfer: DataTransfer
    override var nativeEvent: DragEvent
}
external interface FocusEvent<T> : SyntheticEvent<T> {
    override var nativeEvent: FocusEvent
    var relatedTarget: EventTarget
}
external interface FormEvent<T> : SyntheticEvent<T>
external interface InvalidEvent<T> : SyntheticEvent<T> {
    override var target: EventTarget /* EventTarget & T */
}
external interface ChangeEvent<T> : SyntheticEvent<T> {
    override var target: EventTarget /* EventTarget & T */
}
external interface KeyboardEvent<T> : SyntheticEvent<T> {
    var altKey: Boolean
    var charCode: Number
    var ctrlKey: Boolean
    fun getModifierState(key: String): Boolean
    var key: String
    var keyCode: Number
    var locale: String
    var location: Number
    var metaKey: Boolean
    override var nativeEvent: KeyboardEvent
    var repeat: Boolean
    var shiftKey: Boolean
    var which: Number
}
external interface MouseEvent<T> : SyntheticEvent<T> {
    var altKey: Boolean
    var button: Number
    var buttons: Number
    var clientX: Number
    var clientY: Number
    var ctrlKey: Boolean
    fun getModifierState(key: String): Boolean
    var metaKey: Boolean
    override var nativeEvent: MouseEvent
    var pageX: Number
    var pageY: Number
    var relatedTarget: EventTarget
    var screenX: Number
    var screenY: Number
    var shiftKey: Boolean
}
external interface TouchEvent<T> : SyntheticEvent<T> {
    var altKey: Boolean
    var changedTouches: TouchList
    var ctrlKey: Boolean
    fun getModifierState(key: String): Boolean
    var metaKey: Boolean
    override var nativeEvent: TouchEvent
    var shiftKey: Boolean
    var targetTouches: TouchList
    var touches: TouchList
}
external interface UIEvent<T> : SyntheticEvent<T> {
    var detail: Number
    override var nativeEvent: UIEvent
    var view: AbstractView
}
external interface WheelEvent<T> : MouseEvent<T> {
    var deltaMode: Number
    var deltaX: Number
    var deltaY: Number
    var deltaZ: Number
    override var nativeEvent: WheelEvent
}
external interface AnimationEvent<T> : SyntheticEvent<T> {
    var animationName: String
    var elapsedTime: Number
    override var nativeEvent: AnimationEvent
    var pseudoElement: String
}
external interface TransitionEvent<T> : SyntheticEvent<T> {
    var elapsedTime: Number
    override var nativeEvent: TransitionEvent
    var propertyName: String
    var pseudoElement: String
}
external interface Props<T> {
    var children: dynamic /* String | Number | Boolean | Any? | ReactElement<Any> | Array<dynamic /* String | Number | Boolean | Array<Any> | ReactElement<Any> */> | Nothing? */ get() = definedExternally; set(value) = definedExternally
    var key: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var ref: dynamic /* String | Any? */ get() = definedExternally; set(value) = definedExternally
}
external interface HTMLProps<T> : AllHTMLAttributes<T>, ClassAttributes<T>
external interface SVGProps<T> : SVGAttributes<T>, ClassAttributes<T>
external interface `T$2` {
    var __html: String
}
external interface DOMAttributes<T> {
    var children: dynamic /* String | Number | Boolean | Any? | ReactElement<Any> | Array<dynamic /* String | Number | Boolean | Array<Any> | ReactElement<Any> */> | Nothing? */ get() = definedExternally; set(value) = definedExternally
    var dangerouslySetInnerHTML: `T$2`? get() = definedExternally; set(value) = definedExternally
    var onCopy: Any? get() = definedExternally; set(value) = definedExternally
    var onCopyCapture: Any? get() = definedExternally; set(value) = definedExternally
    var onCut: Any? get() = definedExternally; set(value) = definedExternally
    var onCutCapture: Any? get() = definedExternally; set(value) = definedExternally
    var onPaste: Any? get() = definedExternally; set(value) = definedExternally
    var onPasteCapture: Any? get() = definedExternally; set(value) = definedExternally
    var onCompositionEnd: Any? get() = definedExternally; set(value) = definedExternally
    var onCompositionEndCapture: Any? get() = definedExternally; set(value) = definedExternally
    var onCompositionStart: Any? get() = definedExternally; set(value) = definedExternally
    var onCompositionStartCapture: Any? get() = definedExternally; set(value) = definedExternally
    var onCompositionUpdate: Any? get() = definedExternally; set(value) = definedExternally
    var onCompositionUpdateCapture: Any? get() = definedExternally; set(value) = definedExternally
    var onFocus: Any? get() = definedExternally; set(value) = definedExternally
    var onFocusCapture: Any? get() = definedExternally; set(value) = definedExternally
    var onBlur: Any? get() = definedExternally; set(value) = definedExternally
    var onBlurCapture: Any? get() = definedExternally; set(value) = definedExternally
    var onChange: Any? get() = definedExternally; set(value) = definedExternally
    var onChangeCapture: Any? get() = definedExternally; set(value) = definedExternally
    var onInput: Any? get() = definedExternally; set(value) = definedExternally
    var onInputCapture: Any? get() = definedExternally; set(value) = definedExternally
    var onReset: Any? get() = definedExternally; set(value) = definedExternally
    var onResetCapture: Any? get() = definedExternally; set(value) = definedExternally
    var onSubmit: Any? get() = definedExternally; set(value) = definedExternally
    var onSubmitCapture: Any? get() = definedExternally; set(value) = definedExternally
    var onInvalid: Any? get() = definedExternally; set(value) = definedExternally
    var onInvalidCapture: Any? get() = definedExternally; set(value) = definedExternally
    var onLoad: Any? get() = definedExternally; set(value) = definedExternally
    var onLoadCapture: Any? get() = definedExternally; set(value) = definedExternally
    var onError: Any? get() = definedExternally; set(value) = definedExternally
    var onErrorCapture: Any? get() = definedExternally; set(value) = definedExternally
    var onKeyDown: Any? get() = definedExternally; set(value) = definedExternally
    var onKeyDownCapture: Any? get() = definedExternally; set(value) = definedExternally
    var onKeyPress: Any? get() = definedExternally; set(value) = definedExternally
    var onKeyPressCapture: Any? get() = definedExternally; set(value) = definedExternally
    var onKeyUp: Any? get() = definedExternally; set(value) = definedExternally
    var onKeyUpCapture: Any? get() = definedExternally; set(value) = definedExternally
    var onAbort: Any? get() = definedExternally; set(value) = definedExternally
    var onAbortCapture: Any? get() = definedExternally; set(value) = definedExternally
    var onCanPlay: Any? get() = definedExternally; set(value) = definedExternally
    var onCanPlayCapture: Any? get() = definedExternally; set(value) = definedExternally
    var onCanPlayThrough: Any? get() = definedExternally; set(value) = definedExternally
    var onCanPlayThroughCapture: Any? get() = definedExternally; set(value) = definedExternally
    var onDurationChange: Any? get() = definedExternally; set(value) = definedExternally
    var onDurationChangeCapture: Any? get() = definedExternally; set(value) = definedExternally
    var onEmptied: Any? get() = definedExternally; set(value) = definedExternally
    var onEmptiedCapture: Any? get() = definedExternally; set(value) = definedExternally
    var onEncrypted: Any? get() = definedExternally; set(value) = definedExternally
    var onEncryptedCapture: Any? get() = definedExternally; set(value) = definedExternally
    var onEnded: Any? get() = definedExternally; set(value) = definedExternally
    var onEndedCapture: Any? get() = definedExternally; set(value) = definedExternally
    var onLoadedData: Any? get() = definedExternally; set(value) = definedExternally
    var onLoadedDataCapture: Any? get() = definedExternally; set(value) = definedExternally
    var onLoadedMetadata: Any? get() = definedExternally; set(value) = definedExternally
    var onLoadedMetadataCapture: Any? get() = definedExternally; set(value) = definedExternally
    var onLoadStart: Any? get() = definedExternally; set(value) = definedExternally
    var onLoadStartCapture: Any? get() = definedExternally; set(value) = definedExternally
    var onPause: Any? get() = definedExternally; set(value) = definedExternally
    var onPauseCapture: Any? get() = definedExternally; set(value) = definedExternally
    var onPlay: Any? get() = definedExternally; set(value) = definedExternally
    var onPlayCapture: Any? get() = definedExternally; set(value) = definedExternally
    var onPlaying: Any? get() = definedExternally; set(value) = definedExternally
    var onPlayingCapture: Any? get() = definedExternally; set(value) = definedExternally
    var onProgress: Any? get() = definedExternally; set(value) = definedExternally
    var onProgressCapture: Any? get() = definedExternally; set(value) = definedExternally
    var onRateChange: Any? get() = definedExternally; set(value) = definedExternally
    var onRateChangeCapture: Any? get() = definedExternally; set(value) = definedExternally
    var onSeeked: Any? get() = definedExternally; set(value) = definedExternally
    var onSeekedCapture: Any? get() = definedExternally; set(value) = definedExternally
    var onSeeking: Any? get() = definedExternally; set(value) = definedExternally
    var onSeekingCapture: Any? get() = definedExternally; set(value) = definedExternally
    var onStalled: Any? get() = definedExternally; set(value) = definedExternally
    var onStalledCapture: Any? get() = definedExternally; set(value) = definedExternally
    var onSuspend: Any? get() = definedExternally; set(value) = definedExternally
    var onSuspendCapture: Any? get() = definedExternally; set(value) = definedExternally
    var onTimeUpdate: Any? get() = definedExternally; set(value) = definedExternally
    var onTimeUpdateCapture: Any? get() = definedExternally; set(value) = definedExternally
    var onVolumeChange: Any? get() = definedExternally; set(value) = definedExternally
    var onVolumeChangeCapture: Any? get() = definedExternally; set(value) = definedExternally
    var onWaiting: Any? get() = definedExternally; set(value) = definedExternally
    var onWaitingCapture: Any? get() = definedExternally; set(value) = definedExternally
    var onClick: Any? get() = definedExternally; set(value) = definedExternally
    var onClickCapture: Any? get() = definedExternally; set(value) = definedExternally
    var onContextMenu: Any? get() = definedExternally; set(value) = definedExternally
    var onContextMenuCapture: Any? get() = definedExternally; set(value) = definedExternally
    var onDoubleClick: Any? get() = definedExternally; set(value) = definedExternally
    var onDoubleClickCapture: Any? get() = definedExternally; set(value) = definedExternally
    var onDrag: Any? get() = definedExternally; set(value) = definedExternally
    var onDragCapture: Any? get() = definedExternally; set(value) = definedExternally
    var onDragEnd: Any? get() = definedExternally; set(value) = definedExternally
    var onDragEndCapture: Any? get() = definedExternally; set(value) = definedExternally
    var onDragEnter: Any? get() = definedExternally; set(value) = definedExternally
    var onDragEnterCapture: Any? get() = definedExternally; set(value) = definedExternally
    var onDragExit: Any? get() = definedExternally; set(value) = definedExternally
    var onDragExitCapture: Any? get() = definedExternally; set(value) = definedExternally
    var onDragLeave: Any? get() = definedExternally; set(value) = definedExternally
    var onDragLeaveCapture: Any? get() = definedExternally; set(value) = definedExternally
    var onDragOver: Any? get() = definedExternally; set(value) = definedExternally
    var onDragOverCapture: Any? get() = definedExternally; set(value) = definedExternally
    var onDragStart: Any? get() = definedExternally; set(value) = definedExternally
    var onDragStartCapture: Any? get() = definedExternally; set(value) = definedExternally
    var onDrop: Any? get() = definedExternally; set(value) = definedExternally
    var onDropCapture: Any? get() = definedExternally; set(value) = definedExternally
    var onMouseDown: Any? get() = definedExternally; set(value) = definedExternally
    var onMouseDownCapture: Any? get() = definedExternally; set(value) = definedExternally
    var onMouseEnter: Any? get() = definedExternally; set(value) = definedExternally
    var onMouseLeave: Any? get() = definedExternally; set(value) = definedExternally
    var onMouseMove: Any? get() = definedExternally; set(value) = definedExternally
    var onMouseMoveCapture: Any? get() = definedExternally; set(value) = definedExternally
    var onMouseOut: Any? get() = definedExternally; set(value) = definedExternally
    var onMouseOutCapture: Any? get() = definedExternally; set(value) = definedExternally
    var onMouseOver: Any? get() = definedExternally; set(value) = definedExternally
    var onMouseOverCapture: Any? get() = definedExternally; set(value) = definedExternally
    var onMouseUp: Any? get() = definedExternally; set(value) = definedExternally
    var onMouseUpCapture: Any? get() = definedExternally; set(value) = definedExternally
    var onSelect: Any? get() = definedExternally; set(value) = definedExternally
    var onSelectCapture: Any? get() = definedExternally; set(value) = definedExternally
    var onTouchCancel: Any? get() = definedExternally; set(value) = definedExternally
    var onTouchCancelCapture: Any? get() = definedExternally; set(value) = definedExternally
    var onTouchEnd: Any? get() = definedExternally; set(value) = definedExternally
    var onTouchEndCapture: Any? get() = definedExternally; set(value) = definedExternally
    var onTouchMove: Any? get() = definedExternally; set(value) = definedExternally
    var onTouchMoveCapture: Any? get() = definedExternally; set(value) = definedExternally
    var onTouchStart: Any? get() = definedExternally; set(value) = definedExternally
    var onTouchStartCapture: Any? get() = definedExternally; set(value) = definedExternally
    var onScroll: Any? get() = definedExternally; set(value) = definedExternally
    var onScrollCapture: Any? get() = definedExternally; set(value) = definedExternally
    var onWheel: Any? get() = definedExternally; set(value) = definedExternally
    var onWheelCapture: Any? get() = definedExternally; set(value) = definedExternally
    var onAnimationStart: Any? get() = definedExternally; set(value) = definedExternally
    var onAnimationStartCapture: Any? get() = definedExternally; set(value) = definedExternally
    var onAnimationEnd: Any? get() = definedExternally; set(value) = definedExternally
    var onAnimationEndCapture: Any? get() = definedExternally; set(value) = definedExternally
    var onAnimationIteration: Any? get() = definedExternally; set(value) = definedExternally
    var onAnimationIterationCapture: Any? get() = definedExternally; set(value) = definedExternally
    var onTransitionEnd: Any? get() = definedExternally; set(value) = definedExternally
    var onTransitionEndCapture: Any? get() = definedExternally; set(value) = definedExternally
}
external interface CSSProperties {
    var alignContent: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | String /* "flex-start" */ | String /* "flex-end" */ | String /* "center" */ | String /* "space-between" */ | String /* "space-around" */ | String /* "stretch" */ */ get() = definedExternally; set(value) = definedExternally
    var alignItems: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | String /* "flex-start" */ | String /* "flex-end" */ | String /* "center" */ | String /* "stretch" */ | String /* "baseline" */ */ get() = definedExternally; set(value) = definedExternally
    var alignSelf: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | String /* "flex-start" */ | String /* "flex-end" */ | String /* "center" */ | String /* "stretch" */ | String /* "baseline" */ | String /* "auto" */ */ get() = definedExternally; set(value) = definedExternally
    var alignmentAdjust: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var alignmentBaseline: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var animationDelay: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var animationDirection: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var animationIterationCount: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var animationName: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var animationPlayState: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var appearance: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var backfaceVisibility: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var background: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var backgroundAttachment: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | String /* "scroll" */ | String /* "fixed" */ | String /* "local" */ */ get() = definedExternally; set(value) = definedExternally
    var backgroundBlendMode: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var backgroundColor: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var backgroundComposite: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var backgroundImage: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var backgroundOrigin: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var backgroundPosition: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var backgroundRepeat: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var baselineShift: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var behavior: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var border: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var borderBottom: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var borderBottomColor: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var borderBottomLeftRadius: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var borderBottomRightRadius: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var borderBottomStyle: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var borderBottomWidth: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var borderCollapse: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var borderColor: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var borderCornerShape: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var borderImageSource: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var borderImageWidth: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var borderLeft: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var borderLeftColor: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var borderLeftStyle: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var borderLeftWidth: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var borderRight: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var borderRightColor: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var borderRightStyle: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var borderRightWidth: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var borderSpacing: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var borderStyle: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var borderTop: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var borderTopColor: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var borderTopLeftRadius: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var borderTopRightRadius: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var borderTopStyle: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var borderTopWidth: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var borderWidth: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var bottom: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var boxAlign: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var boxDecorationBreak: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var boxDirection: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var boxLineProgression: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var boxLines: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var boxOrdinalGroup: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var boxFlex: dynamic /* Number | String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ */ get() = definedExternally; set(value) = definedExternally
    var boxFlexGroup: dynamic /* Number | String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ */ get() = definedExternally; set(value) = definedExternally
    var boxShadow: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var breakAfter: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var breakBefore: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var breakInside: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var clear: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var clip: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var clipRule: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var color: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var columnCount: dynamic /* Number | String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | String /* "auto" */ */ get() = definedExternally; set(value) = definedExternally
    var columnFill: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var columnGap: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var columnRule: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var columnRuleColor: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var columnRuleWidth: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var columnSpan: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var columnWidth: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var columns: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var counterIncrement: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var counterReset: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var cue: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var cueAfter: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var cursor: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var direction: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var display: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var fill: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var fillOpacity: dynamic /* Number | String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ */ get() = definedExternally; set(value) = definedExternally
    var fillRule: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var filter: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var flex: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var flexAlign: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var flexBasis: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var flexDirection: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | String /* "row" */ | String /* "row-reverse" */ | String /* "column" */ | String /* "column-reverse" */ */ get() = definedExternally; set(value) = definedExternally
    var flexFlow: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | String */ get() = definedExternally; set(value) = definedExternally
    var flexGrow: dynamic /* Number | String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ */ get() = definedExternally; set(value) = definedExternally
    var flexItemAlign: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var flexLinePack: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var flexOrder: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var flexShrink: dynamic /* Number | String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ */ get() = definedExternally; set(value) = definedExternally
    var flexWrap: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | String /* "nowrap" */ | String /* "wrap" */ | String /* "wrap-reverse" */ */ get() = definedExternally; set(value) = definedExternally
    var float: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var flowFrom: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var font: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var fontFamily: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var fontKerning: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var fontSize: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var fontSizeAdjust: dynamic /* Number | String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | String /* "none" */ */ get() = definedExternally; set(value) = definedExternally
    var fontStretch: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | String /* "normal" */ | String /* "ultra-condensed" */ | String /* "extra-condensed" */ | String /* "condensed" */ | String /* "semi-condensed" */ | String /* "semi-expanded" */ | String /* "expanded" */ | String /* "extra-expanded" */ | String /* "ultra-expanded" */ */ get() = definedExternally; set(value) = definedExternally
    var fontStyle: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | String /* "normal" */ | String /* "italic" */ | String /* "oblique" */ */ get() = definedExternally; set(value) = definedExternally
    var fontSynthesis: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var fontVariant: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var fontVariantAlternates: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var fontWeight: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | String /* "normal" */ | String /* "bold" */ | String /* "bolder" */ | String /* "lighter" */ | Number /* 100 */ | Number /* 200 */ | Number /* 300 */ | Number /* 400 */ | Number /* 500 */ | Number /* 600 */ | Number /* 700 */ | Number /* 800 */ | Number /* 900 */ */ get() = definedExternally; set(value) = definedExternally
    var gridArea: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var gridColumn: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var gridColumnEnd: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var gridColumnStart: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var gridRow: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var gridRowEnd: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var gridRowPosition: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var gridRowSpan: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var gridTemplateAreas: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var gridTemplateColumns: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var gridTemplateRows: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var height: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var hyphenateLimitChars: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var hyphenateLimitLines: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var hyphenateLimitZone: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var hyphens: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var imeMode: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var justifyContent: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | String /* "flex-start" */ | String /* "flex-end" */ | String /* "center" */ | String /* "space-between" */ | String /* "space-around" */ | String /* "space-evenly" */ */ get() = definedExternally; set(value) = definedExternally
    var layoutGrid: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var layoutGridChar: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var layoutGridLine: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var layoutGridMode: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var layoutGridType: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var left: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var letterSpacing: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var lineBreak: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var lineClamp: dynamic /* Number | String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ */ get() = definedExternally; set(value) = definedExternally
    var lineHeight: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var listStyle: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var listStyleImage: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var listStylePosition: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var listStyleType: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var margin: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var marginBottom: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var marginLeft: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var marginRight: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var marginTop: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var marqueeDirection: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var marqueeStyle: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var mask: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var maskBorder: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var maskBorderRepeat: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var maskBorderSlice: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var maskBorderSource: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var maskBorderWidth: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var maskClip: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var maskOrigin: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var maxFontSize: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var maxHeight: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var maxWidth: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var minHeight: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var minWidth: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var opacity: dynamic /* Number | String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ */ get() = definedExternally; set(value) = definedExternally
    var order: dynamic /* Number | String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ */ get() = definedExternally; set(value) = definedExternally
    var orphans: dynamic /* Number | String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ */ get() = definedExternally; set(value) = definedExternally
    var outline: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var outlineColor: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var outlineOffset: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var overflow: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | String /* "auto" */ | String /* "scroll" */ | String /* "hidden" */ | String /* "visible" */ */ get() = definedExternally; set(value) = definedExternally
    var overflowStyle: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var overflowX: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | String /* "auto" */ | String /* "scroll" */ | String /* "hidden" */ | String /* "visible" */ */ get() = definedExternally; set(value) = definedExternally
    var overflowY: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | String /* "auto" */ | String /* "scroll" */ | String /* "hidden" */ | String /* "visible" */ */ get() = definedExternally; set(value) = definedExternally
    var padding: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var paddingBottom: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var paddingLeft: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var paddingRight: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var paddingTop: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var pageBreakAfter: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var pageBreakBefore: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var pageBreakInside: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var pause: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var pauseAfter: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var pauseBefore: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var perspective: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var perspectiveOrigin: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var pointerEvents: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var position: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | String /* "fixed" */ | String /* "static" */ | String /* "relative" */ | String /* "absolute" */ | String /* "sticky" */ */ get() = definedExternally; set(value) = definedExternally
    var punctuationTrim: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var quotes: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var regionFragment: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var restAfter: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var restBefore: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var right: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var rubyAlign: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var rubyPosition: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var shapeImageThreshold: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var shapeInside: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var shapeMargin: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var shapeOutside: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var speak: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var speakAs: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var strokeOpacity: dynamic /* Number | String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ */ get() = definedExternally; set(value) = definedExternally
    var strokeWidth: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var tabSize: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var tableLayout: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var textAlign: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var textAlignLast: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var textDecoration: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var textDecorationColor: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var textDecorationLine: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var textDecorationLineThrough: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var textDecorationNone: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var textDecorationOverline: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var textDecorationSkip: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var textDecorationStyle: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var textDecorationUnderline: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var textEmphasis: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var textEmphasisColor: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var textEmphasisStyle: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var textHeight: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var textIndent: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var textJustifyTrim: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var textKashidaSpace: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var textLineThrough: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var textLineThroughColor: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var textLineThroughMode: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var textLineThroughStyle: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var textLineThroughWidth: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var textOverflow: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var textOverline: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var textOverlineColor: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var textOverlineMode: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var textOverlineStyle: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var textOverlineWidth: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var textRendering: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var textScript: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var textShadow: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var textTransform: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var textUnderlinePosition: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var textUnderlineStyle: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var top: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var touchAction: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var transform: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var transformOrigin: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var transformOriginZ: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var transformStyle: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var transition: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var transitionDelay: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var transitionDuration: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var transitionProperty: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var transitionTimingFunction: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var unicodeBidi: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var unicodeRange: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var userFocus: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var userInput: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var verticalAlign: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var visibility: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var voiceBalance: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var voiceDuration: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var voiceFamily: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var voicePitch: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var voiceRange: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var voiceRate: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var voiceStress: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var voiceVolume: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var whiteSpace: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var whiteSpaceTreatment: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var widows: dynamic /* Number | String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ */ get() = definedExternally; set(value) = definedExternally
    var width: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var wordBreak: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var wordSpacing: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var wordWrap: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var wrapFlow: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var wrapMargin: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var wrapOption: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var writingMode: dynamic /* String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | Any */ get() = definedExternally; set(value) = definedExternally
    var zIndex: dynamic /* Number | String /* "initial" */ | String /* "inherit" */ | String /* "unset" */ | String /* "auto" */ */ get() = definedExternally; set(value) = definedExternally
    var zoom: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    @nativeGetter
    operator fun get(propertyName: String): Any?
    @nativeSetter
    operator fun set(propertyName: String, value: Any)
}
external interface HTMLAttributes<T> : DOMAttributes<T> {
    var defaultChecked: Boolean? get() = definedExternally; set(value) = definedExternally
    var defaultValue: dynamic /* String | Array<String> */ get() = definedExternally; set(value) = definedExternally
    var suppressContentEditableWarning: Boolean? get() = definedExternally; set(value) = definedExternally
    var accessKey: String? get() = definedExternally; set(value) = definedExternally
    var className: String? get() = definedExternally; set(value) = definedExternally
    var contentEditable: Boolean? get() = definedExternally; set(value) = definedExternally
    var contextMenu: String? get() = definedExternally; set(value) = definedExternally
    var dir: String? get() = definedExternally; set(value) = definedExternally
    var draggable: Boolean? get() = definedExternally; set(value) = definedExternally
    var hidden: Boolean? get() = definedExternally; set(value) = definedExternally
    var id: String? get() = definedExternally; set(value) = definedExternally
    var lang: String? get() = definedExternally; set(value) = definedExternally
    var slot: String? get() = definedExternally; set(value) = definedExternally
    var spellCheck: Boolean? get() = definedExternally; set(value) = definedExternally
    var style: CSSProperties? get() = definedExternally; set(value) = definedExternally
    var tabIndex: Number? get() = definedExternally; set(value) = definedExternally
    var title: String? get() = definedExternally; set(value) = definedExternally
    var inputMode: String? get() = definedExternally; set(value) = definedExternally
    var `is`: String? get() = definedExternally; set(value) = definedExternally
    var radioGroup: String? get() = definedExternally; set(value) = definedExternally
    var role: String? get() = definedExternally; set(value) = definedExternally
    var about: String? get() = definedExternally; set(value) = definedExternally
    var datatype: String? get() = definedExternally; set(value) = definedExternally
    var inlist: Any? get() = definedExternally; set(value) = definedExternally
    var prefix: String? get() = definedExternally; set(value) = definedExternally
    var property: String? get() = definedExternally; set(value) = definedExternally
    var resource: String? get() = definedExternally; set(value) = definedExternally
    var `typeof`: String? get() = definedExternally; set(value) = definedExternally
    var vocab: String? get() = definedExternally; set(value) = definedExternally
    var autoCapitalize: String? get() = definedExternally; set(value) = definedExternally
    var autoCorrect: String? get() = definedExternally; set(value) = definedExternally
    var autoSave: String? get() = definedExternally; set(value) = definedExternally
    var color: String? get() = definedExternally; set(value) = definedExternally
    var itemProp: String? get() = definedExternally; set(value) = definedExternally
    var itemScope: Boolean? get() = definedExternally; set(value) = definedExternally
    var itemType: String? get() = definedExternally; set(value) = definedExternally
    var itemID: String? get() = definedExternally; set(value) = definedExternally
    var itemRef: String? get() = definedExternally; set(value) = definedExternally
    var results: Number? get() = definedExternally; set(value) = definedExternally
    var security: String? get() = definedExternally; set(value) = definedExternally
    var unselectable: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface AllHTMLAttributes<T> : HTMLAttributes<T> {
    var accept: String? get() = definedExternally; set(value) = definedExternally
    var acceptCharset: String? get() = definedExternally; set(value) = definedExternally
    var action: String? get() = definedExternally; set(value) = definedExternally
    var allowFullScreen: Boolean? get() = definedExternally; set(value) = definedExternally
    var allowTransparency: Boolean? get() = definedExternally; set(value) = definedExternally
    var alt: String? get() = definedExternally; set(value) = definedExternally
    var `as`: String? get() = definedExternally; set(value) = definedExternally
    var async: Boolean? get() = definedExternally; set(value) = definedExternally
    var autoComplete: String? get() = definedExternally; set(value) = definedExternally
    var autoFocus: Boolean? get() = definedExternally; set(value) = definedExternally
    var autoPlay: Boolean? get() = definedExternally; set(value) = definedExternally
    var capture: Boolean? get() = definedExternally; set(value) = definedExternally
    var cellPadding: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var cellSpacing: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var charSet: String? get() = definedExternally; set(value) = definedExternally
    var challenge: String? get() = definedExternally; set(value) = definedExternally
    var checked: Boolean? get() = definedExternally; set(value) = definedExternally
    var cite: String? get() = definedExternally; set(value) = definedExternally
    var classID: String? get() = definedExternally; set(value) = definedExternally
    var cols: Number? get() = definedExternally; set(value) = definedExternally
    var colSpan: Number? get() = definedExternally; set(value) = definedExternally
    var content: String? get() = definedExternally; set(value) = definedExternally
    var controls: Boolean? get() = definedExternally; set(value) = definedExternally
    var coords: String? get() = definedExternally; set(value) = definedExternally
    var crossOrigin: String? get() = definedExternally; set(value) = definedExternally
    var data: String? get() = definedExternally; set(value) = definedExternally
    var dateTime: String? get() = definedExternally; set(value) = definedExternally
    var default: Boolean? get() = definedExternally; set(value) = definedExternally
    var defer: Boolean? get() = definedExternally; set(value) = definedExternally
    var disabled: Boolean? get() = definedExternally; set(value) = definedExternally
    var download: Any? get() = definedExternally; set(value) = definedExternally
    var encType: String? get() = definedExternally; set(value) = definedExternally
    var form: String? get() = definedExternally; set(value) = definedExternally
    var formAction: String? get() = definedExternally; set(value) = definedExternally
    var formEncType: String? get() = definedExternally; set(value) = definedExternally
    var formMethod: String? get() = definedExternally; set(value) = definedExternally
    var formNoValidate: Boolean? get() = definedExternally; set(value) = definedExternally
    var formTarget: String? get() = definedExternally; set(value) = definedExternally
    var frameBorder: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var headers: String? get() = definedExternally; set(value) = definedExternally
    var height: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var high: Number? get() = definedExternally; set(value) = definedExternally
    var href: String? get() = definedExternally; set(value) = definedExternally
    var hrefLang: String? get() = definedExternally; set(value) = definedExternally
    var htmlFor: String? get() = definedExternally; set(value) = definedExternally
    var httpEquiv: String? get() = definedExternally; set(value) = definedExternally
    var integrity: String? get() = definedExternally; set(value) = definedExternally
    var keyParams: String? get() = definedExternally; set(value) = definedExternally
    var keyType: String? get() = definedExternally; set(value) = definedExternally
    var kind: String? get() = definedExternally; set(value) = definedExternally
    var label: String? get() = definedExternally; set(value) = definedExternally
    var list: String? get() = definedExternally; set(value) = definedExternally
    var loop: Boolean? get() = definedExternally; set(value) = definedExternally
    var low: Number? get() = definedExternally; set(value) = definedExternally
    var manifest: String? get() = definedExternally; set(value) = definedExternally
    var marginHeight: Number? get() = definedExternally; set(value) = definedExternally
    var marginWidth: Number? get() = definedExternally; set(value) = definedExternally
    var max: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var maxLength: Number? get() = definedExternally; set(value) = definedExternally
    var media: String? get() = definedExternally; set(value) = definedExternally
    var mediaGroup: String? get() = definedExternally; set(value) = definedExternally
    var method: String? get() = definedExternally; set(value) = definedExternally
    var min: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var minLength: Number? get() = definedExternally; set(value) = definedExternally
    var multiple: Boolean? get() = definedExternally; set(value) = definedExternally
    var muted: Boolean? get() = definedExternally; set(value) = definedExternally
    var name: String? get() = definedExternally; set(value) = definedExternally
    var nonce: String? get() = definedExternally; set(value) = definedExternally
    var noValidate: Boolean? get() = definedExternally; set(value) = definedExternally
    var open: Boolean? get() = definedExternally; set(value) = definedExternally
    var optimum: Number? get() = definedExternally; set(value) = definedExternally
    var pattern: String? get() = definedExternally; set(value) = definedExternally
    var placeholder: String? get() = definedExternally; set(value) = definedExternally
    var playsInline: Boolean? get() = definedExternally; set(value) = definedExternally
    var poster: String? get() = definedExternally; set(value) = definedExternally
    var preload: String? get() = definedExternally; set(value) = definedExternally
    var readOnly: Boolean? get() = definedExternally; set(value) = definedExternally
    var rel: String? get() = definedExternally; set(value) = definedExternally
    var required: Boolean? get() = definedExternally; set(value) = definedExternally
    var reversed: Boolean? get() = definedExternally; set(value) = definedExternally
    var rows: Number? get() = definedExternally; set(value) = definedExternally
    var rowSpan: Number? get() = definedExternally; set(value) = definedExternally
    var sandbox: String? get() = definedExternally; set(value) = definedExternally
    var scope: String? get() = definedExternally; set(value) = definedExternally
    var scoped: Boolean? get() = definedExternally; set(value) = definedExternally
    var scrolling: String? get() = definedExternally; set(value) = definedExternally
    var seamless: Boolean? get() = definedExternally; set(value) = definedExternally
    var selected: Boolean? get() = definedExternally; set(value) = definedExternally
    var shape: String? get() = definedExternally; set(value) = definedExternally
    var size: Number? get() = definedExternally; set(value) = definedExternally
    var sizes: String? get() = definedExternally; set(value) = definedExternally
    var span: Number? get() = definedExternally; set(value) = definedExternally
    var src: String? get() = definedExternally; set(value) = definedExternally
    var srcDoc: String? get() = definedExternally; set(value) = definedExternally
    var srcLang: String? get() = definedExternally; set(value) = definedExternally
    var srcSet: String? get() = definedExternally; set(value) = definedExternally
    var start: Number? get() = definedExternally; set(value) = definedExternally
    var step: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var summary: String? get() = definedExternally; set(value) = definedExternally
    var target: String? get() = definedExternally; set(value) = definedExternally
    var type: String? get() = definedExternally; set(value) = definedExternally
    var useMap: String? get() = definedExternally; set(value) = definedExternally
    var value: dynamic /* String | Number | Array<String> */ get() = definedExternally; set(value) = definedExternally
    var width: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var wmode: String? get() = definedExternally; set(value) = definedExternally
    var wrap: String? get() = definedExternally; set(value) = definedExternally
}
external interface AnchorHTMLAttributes<T> : HTMLAttributes<T> {
    var download: Any? get() = definedExternally; set(value) = definedExternally
    var href: String? get() = definedExternally; set(value) = definedExternally
    var hrefLang: String? get() = definedExternally; set(value) = definedExternally
    var media: String? get() = definedExternally; set(value) = definedExternally
    var rel: String? get() = definedExternally; set(value) = definedExternally
    var target: String? get() = definedExternally; set(value) = definedExternally
}
external interface AudioHTMLAttributes<T> : MediaHTMLAttributes<T>
external interface AreaHTMLAttributes<T> : HTMLAttributes<T> {
    var alt: String? get() = definedExternally; set(value) = definedExternally
    var coords: String? get() = definedExternally; set(value) = definedExternally
    var download: Any? get() = definedExternally; set(value) = definedExternally
    var href: String? get() = definedExternally; set(value) = definedExternally
    var hrefLang: String? get() = definedExternally; set(value) = definedExternally
    var media: String? get() = definedExternally; set(value) = definedExternally
    var rel: String? get() = definedExternally; set(value) = definedExternally
    var shape: String? get() = definedExternally; set(value) = definedExternally
    var target: String? get() = definedExternally; set(value) = definedExternally
}
external interface BaseHTMLAttributes<T> : HTMLAttributes<T> {
    var href: String? get() = definedExternally; set(value) = definedExternally
    var target: String? get() = definedExternally; set(value) = definedExternally
}
external interface BlockquoteHTMLAttributes<T> : HTMLAttributes<T> {
    var cite: String? get() = definedExternally; set(value) = definedExternally
}
external interface ButtonHTMLAttributes<T> : HTMLAttributes<T> {
    var autoFocus: Boolean? get() = definedExternally; set(value) = definedExternally
    var disabled: Boolean? get() = definedExternally; set(value) = definedExternally
    var form: String? get() = definedExternally; set(value) = definedExternally
    var formAction: String? get() = definedExternally; set(value) = definedExternally
    var formEncType: String? get() = definedExternally; set(value) = definedExternally
    var formMethod: String? get() = definedExternally; set(value) = definedExternally
    var formNoValidate: Boolean? get() = definedExternally; set(value) = definedExternally
    var formTarget: String? get() = definedExternally; set(value) = definedExternally
    var name: String? get() = definedExternally; set(value) = definedExternally
    var type: String? get() = definedExternally; set(value) = definedExternally
    var value: dynamic /* String | Number | Array<String> */ get() = definedExternally; set(value) = definedExternally
}
external interface CanvasHTMLAttributes<T> : HTMLAttributes<T> {
    var height: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var width: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
}
external interface ColHTMLAttributes<T> : HTMLAttributes<T> {
    var span: Number? get() = definedExternally; set(value) = definedExternally
}
external interface ColgroupHTMLAttributes<T> : HTMLAttributes<T> {
    var span: Number? get() = definedExternally; set(value) = definedExternally
}
external interface DetailsHTMLAttributes<T> : HTMLAttributes<T> {
    var open: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface DelHTMLAttributes<T> : HTMLAttributes<T> {
    var cite: String? get() = definedExternally; set(value) = definedExternally
    var dateTime: String? get() = definedExternally; set(value) = definedExternally
}
external interface EmbedHTMLAttributes<T> : HTMLAttributes<T> {
    var height: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var src: String? get() = definedExternally; set(value) = definedExternally
    var type: String? get() = definedExternally; set(value) = definedExternally
    var width: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
}
external interface FieldsetHTMLAttributes<T> : HTMLAttributes<T> {
    var disabled: Boolean? get() = definedExternally; set(value) = definedExternally
    var form: String? get() = definedExternally; set(value) = definedExternally
    var name: String? get() = definedExternally; set(value) = definedExternally
}
external interface FormHTMLAttributes<T> : HTMLAttributes<T> {
    var acceptCharset: String? get() = definedExternally; set(value) = definedExternally
    var action: String? get() = definedExternally; set(value) = definedExternally
    var autoComplete: String? get() = definedExternally; set(value) = definedExternally
    var encType: String? get() = definedExternally; set(value) = definedExternally
    var method: String? get() = definedExternally; set(value) = definedExternally
    var name: String? get() = definedExternally; set(value) = definedExternally
    var noValidate: Boolean? get() = definedExternally; set(value) = definedExternally
    var target: String? get() = definedExternally; set(value) = definedExternally
}
external interface HtmlHTMLAttributes<T> : HTMLAttributes<T> {
    var manifest: String? get() = definedExternally; set(value) = definedExternally
}
external interface IframeHTMLAttributes<T> : HTMLAttributes<T> {
    var allowFullScreen: Boolean? get() = definedExternally; set(value) = definedExternally
    var allowTransparency: Boolean? get() = definedExternally; set(value) = definedExternally
    var frameBorder: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var height: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var marginHeight: Number? get() = definedExternally; set(value) = definedExternally
    var marginWidth: Number? get() = definedExternally; set(value) = definedExternally
    var name: String? get() = definedExternally; set(value) = definedExternally
    var sandbox: String? get() = definedExternally; set(value) = definedExternally
    var scrolling: String? get() = definedExternally; set(value) = definedExternally
    var seamless: Boolean? get() = definedExternally; set(value) = definedExternally
    var src: String? get() = definedExternally; set(value) = definedExternally
    var srcDoc: String? get() = definedExternally; set(value) = definedExternally
    var width: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
}
external interface ImgHTMLAttributes<T> : HTMLAttributes<T> {
    var alt: String? get() = definedExternally; set(value) = definedExternally
    var height: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var sizes: String? get() = definedExternally; set(value) = definedExternally
    var src: String? get() = definedExternally; set(value) = definedExternally
    var srcSet: String? get() = definedExternally; set(value) = definedExternally
    var useMap: String? get() = definedExternally; set(value) = definedExternally
    var width: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
}
external interface InsHTMLAttributes<T> : HTMLAttributes<T> {
    var cite: String? get() = definedExternally; set(value) = definedExternally
    var dateTime: String? get() = definedExternally; set(value) = definedExternally
}
external interface InputHTMLAttributes<T> : HTMLAttributes<T> {
    var accept: String? get() = definedExternally; set(value) = definedExternally
    var alt: String? get() = definedExternally; set(value) = definedExternally
    var autoComplete: String? get() = definedExternally; set(value) = definedExternally
    var autoFocus: Boolean? get() = definedExternally; set(value) = definedExternally
    var capture: Boolean? get() = definedExternally; set(value) = definedExternally
    var checked: Boolean? get() = definedExternally; set(value) = definedExternally
    var crossOrigin: String? get() = definedExternally; set(value) = definedExternally
    var disabled: Boolean? get() = definedExternally; set(value) = definedExternally
    var form: String? get() = definedExternally; set(value) = definedExternally
    var formAction: String? get() = definedExternally; set(value) = definedExternally
    var formEncType: String? get() = definedExternally; set(value) = definedExternally
    var formMethod: String? get() = definedExternally; set(value) = definedExternally
    var formNoValidate: Boolean? get() = definedExternally; set(value) = definedExternally
    var formTarget: String? get() = definedExternally; set(value) = definedExternally
    var height: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var list: String? get() = definedExternally; set(value) = definedExternally
    var max: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var maxLength: Number? get() = definedExternally; set(value) = definedExternally
    var min: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var minLength: Number? get() = definedExternally; set(value) = definedExternally
    var multiple: Boolean? get() = definedExternally; set(value) = definedExternally
    var name: String? get() = definedExternally; set(value) = definedExternally
    var pattern: String? get() = definedExternally; set(value) = definedExternally
    var placeholder: String? get() = definedExternally; set(value) = definedExternally
    var readOnly: Boolean? get() = definedExternally; set(value) = definedExternally
    var required: Boolean? get() = definedExternally; set(value) = definedExternally
    var size: Number? get() = definedExternally; set(value) = definedExternally
    var src: String? get() = definedExternally; set(value) = definedExternally
    var step: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var type: String? get() = definedExternally; set(value) = definedExternally
    var value: dynamic /* String | Number | Array<String> */ get() = definedExternally; set(value) = definedExternally
    var width: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    override var onChange: Any? get() = definedExternally; set(value) = definedExternally
}
external interface KeygenHTMLAttributes<T> : HTMLAttributes<T> {
    var autoFocus: Boolean? get() = definedExternally; set(value) = definedExternally
    var challenge: String? get() = definedExternally; set(value) = definedExternally
    var disabled: Boolean? get() = definedExternally; set(value) = definedExternally
    var form: String? get() = definedExternally; set(value) = definedExternally
    var keyType: String? get() = definedExternally; set(value) = definedExternally
    var keyParams: String? get() = definedExternally; set(value) = definedExternally
    var name: String? get() = definedExternally; set(value) = definedExternally
}
external interface LabelHTMLAttributes<T> : HTMLAttributes<T> {
    var form: String? get() = definedExternally; set(value) = definedExternally
    var htmlFor: String? get() = definedExternally; set(value) = definedExternally
}
external interface LiHTMLAttributes<T> : HTMLAttributes<T> {
    var value: dynamic /* String | Number | Array<String> */ get() = definedExternally; set(value) = definedExternally
}
external interface LinkHTMLAttributes<T> : HTMLAttributes<T> {
    var `as`: String? get() = definedExternally; set(value) = definedExternally
    var crossOrigin: String? get() = definedExternally; set(value) = definedExternally
    var href: String? get() = definedExternally; set(value) = definedExternally
    var hrefLang: String? get() = definedExternally; set(value) = definedExternally
    var integrity: String? get() = definedExternally; set(value) = definedExternally
    var media: String? get() = definedExternally; set(value) = definedExternally
    var rel: String? get() = definedExternally; set(value) = definedExternally
    var sizes: String? get() = definedExternally; set(value) = definedExternally
    var type: String? get() = definedExternally; set(value) = definedExternally
}
external interface MapHTMLAttributes<T> : HTMLAttributes<T> {
    var name: String? get() = definedExternally; set(value) = definedExternally
}
external interface MenuHTMLAttributes<T> : HTMLAttributes<T> {
    var type: String? get() = definedExternally; set(value) = definedExternally
}
external interface MediaHTMLAttributes<T> : HTMLAttributes<T> {
    var autoPlay: Boolean? get() = definedExternally; set(value) = definedExternally
    var controls: Boolean? get() = definedExternally; set(value) = definedExternally
    var crossOrigin: String? get() = definedExternally; set(value) = definedExternally
    var loop: Boolean? get() = definedExternally; set(value) = definedExternally
    var mediaGroup: String? get() = definedExternally; set(value) = definedExternally
    var muted: Boolean? get() = definedExternally; set(value) = definedExternally
    var playsinline: Boolean? get() = definedExternally; set(value) = definedExternally
    var preload: String? get() = definedExternally; set(value) = definedExternally
    var src: String? get() = definedExternally; set(value) = definedExternally
}
external interface MetaHTMLAttributes<T> : HTMLAttributes<T> {
    var charSet: String? get() = definedExternally; set(value) = definedExternally
    var content: String? get() = definedExternally; set(value) = definedExternally
    var httpEquiv: String? get() = definedExternally; set(value) = definedExternally
    var name: String? get() = definedExternally; set(value) = definedExternally
}
external interface MeterHTMLAttributes<T> : HTMLAttributes<T> {
    var form: String? get() = definedExternally; set(value) = definedExternally
    var high: Number? get() = definedExternally; set(value) = definedExternally
    var low: Number? get() = definedExternally; set(value) = definedExternally
    var max: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var min: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var optimum: Number? get() = definedExternally; set(value) = definedExternally
    var value: dynamic /* String | Number | Array<String> */ get() = definedExternally; set(value) = definedExternally
}
external interface QuoteHTMLAttributes<T> : HTMLAttributes<T> {
    var cite: String? get() = definedExternally; set(value) = definedExternally
}
external interface ObjectHTMLAttributes<T> : HTMLAttributes<T> {
    var classID: String? get() = definedExternally; set(value) = definedExternally
    var data: String? get() = definedExternally; set(value) = definedExternally
    var form: String? get() = definedExternally; set(value) = definedExternally
    var height: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var name: String? get() = definedExternally; set(value) = definedExternally
    var type: String? get() = definedExternally; set(value) = definedExternally
    var useMap: String? get() = definedExternally; set(value) = definedExternally
    var width: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var wmode: String? get() = definedExternally; set(value) = definedExternally
}
external interface OlHTMLAttributes<T> : HTMLAttributes<T> {
    var reversed: Boolean? get() = definedExternally; set(value) = definedExternally
    var start: Number? get() = definedExternally; set(value) = definedExternally
}
external interface OptgroupHTMLAttributes<T> : HTMLAttributes<T> {
    var disabled: Boolean? get() = definedExternally; set(value) = definedExternally
    var label: String? get() = definedExternally; set(value) = definedExternally
}
external interface OptionHTMLAttributes<T> : HTMLAttributes<T> {
    var disabled: Boolean? get() = definedExternally; set(value) = definedExternally
    var label: String? get() = definedExternally; set(value) = definedExternally
    var selected: Boolean? get() = definedExternally; set(value) = definedExternally
    var value: dynamic /* String | Number | Array<String> */ get() = definedExternally; set(value) = definedExternally
}
external interface OutputHTMLAttributes<T> : HTMLAttributes<T> {
    var form: String? get() = definedExternally; set(value) = definedExternally
    var htmlFor: String? get() = definedExternally; set(value) = definedExternally
    var name: String? get() = definedExternally; set(value) = definedExternally
}
external interface ParamHTMLAttributes<T> : HTMLAttributes<T> {
    var name: String? get() = definedExternally; set(value) = definedExternally
    var value: dynamic /* String | Number | Array<String> */ get() = definedExternally; set(value) = definedExternally
}
external interface ProgressHTMLAttributes<T> : HTMLAttributes<T> {
    var max: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var value: dynamic /* String | Number | Array<String> */ get() = definedExternally; set(value) = definedExternally
}
external interface ScriptHTMLAttributes<T> : HTMLAttributes<T> {
    var async: Boolean? get() = definedExternally; set(value) = definedExternally
    var charSet: String? get() = definedExternally; set(value) = definedExternally
    var crossOrigin: String? get() = definedExternally; set(value) = definedExternally
    var defer: Boolean? get() = definedExternally; set(value) = definedExternally
    var integrity: String? get() = definedExternally; set(value) = definedExternally
    var nonce: String? get() = definedExternally; set(value) = definedExternally
    var src: String? get() = definedExternally; set(value) = definedExternally
    var type: String? get() = definedExternally; set(value) = definedExternally
}
external interface SelectHTMLAttributes<T> : HTMLAttributes<T> {
    var autoFocus: Boolean? get() = definedExternally; set(value) = definedExternally
    var disabled: Boolean? get() = definedExternally; set(value) = definedExternally
    var form: String? get() = definedExternally; set(value) = definedExternally
    var multiple: Boolean? get() = definedExternally; set(value) = definedExternally
    var name: String? get() = definedExternally; set(value) = definedExternally
    var required: Boolean? get() = definedExternally; set(value) = definedExternally
    var size: Number? get() = definedExternally; set(value) = definedExternally
    var value: dynamic /* String | Number | Array<String> */ get() = definedExternally; set(value) = definedExternally
    override var onChange: Any? get() = definedExternally; set(value) = definedExternally
}
external interface SourceHTMLAttributes<T> : HTMLAttributes<T> {
    var media: String? get() = definedExternally; set(value) = definedExternally
    var sizes: String? get() = definedExternally; set(value) = definedExternally
    var src: String? get() = definedExternally; set(value) = definedExternally
    var srcSet: String? get() = definedExternally; set(value) = definedExternally
    var type: String? get() = definedExternally; set(value) = definedExternally
}
external interface StyleHTMLAttributes<T> : HTMLAttributes<T> {
    var media: String? get() = definedExternally; set(value) = definedExternally
    var nonce: String? get() = definedExternally; set(value) = definedExternally
    var scoped: Boolean? get() = definedExternally; set(value) = definedExternally
    var type: String? get() = definedExternally; set(value) = definedExternally
}
external interface TableHTMLAttributes<T> : HTMLAttributes<T> {
    var cellPadding: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var cellSpacing: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var summary: String? get() = definedExternally; set(value) = definedExternally
}
external interface TextareaHTMLAttributes<T> : HTMLAttributes<T> {
    var autoComplete: String? get() = definedExternally; set(value) = definedExternally
    var autoFocus: Boolean? get() = definedExternally; set(value) = definedExternally
    var cols: Number? get() = definedExternally; set(value) = definedExternally
    var dirName: String? get() = definedExternally; set(value) = definedExternally
    var disabled: Boolean? get() = definedExternally; set(value) = definedExternally
    var form: String? get() = definedExternally; set(value) = definedExternally
    var maxLength: Number? get() = definedExternally; set(value) = definedExternally
    var minLength: Number? get() = definedExternally; set(value) = definedExternally
    var name: String? get() = definedExternally; set(value) = definedExternally
    var placeholder: String? get() = definedExternally; set(value) = definedExternally
    var readOnly: Boolean? get() = definedExternally; set(value) = definedExternally
    var required: Boolean? get() = definedExternally; set(value) = definedExternally
    var rows: Number? get() = definedExternally; set(value) = definedExternally
    var value: dynamic /* String | Number | Array<String> */ get() = definedExternally; set(value) = definedExternally
    var wrap: String? get() = definedExternally; set(value) = definedExternally
    override var onChange: Any? get() = definedExternally; set(value) = definedExternally
}
external interface TdHTMLAttributes<T> : HTMLAttributes<T> {
    var colSpan: Number? get() = definedExternally; set(value) = definedExternally
    var headers: String? get() = definedExternally; set(value) = definedExternally
    var rowSpan: Number? get() = definedExternally; set(value) = definedExternally
}
external interface ThHTMLAttributes<T> : HTMLAttributes<T> {
    var colSpan: Number? get() = definedExternally; set(value) = definedExternally
    var headers: String? get() = definedExternally; set(value) = definedExternally
    var rowSpan: Number? get() = definedExternally; set(value) = definedExternally
    var scope: String? get() = definedExternally; set(value) = definedExternally
}
external interface TimeHTMLAttributes<T> : HTMLAttributes<T> {
    var dateTime: String? get() = definedExternally; set(value) = definedExternally
}
external interface TrackHTMLAttributes<T> : HTMLAttributes<T> {
    var default: Boolean? get() = definedExternally; set(value) = definedExternally
    var kind: String? get() = definedExternally; set(value) = definedExternally
    var label: String? get() = definedExternally; set(value) = definedExternally
    var src: String? get() = definedExternally; set(value) = definedExternally
    var srcLang: String? get() = definedExternally; set(value) = definedExternally
}
external interface VideoHTMLAttributes<T> : MediaHTMLAttributes<T> {
    var height: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var playsInline: Boolean? get() = definedExternally; set(value) = definedExternally
    var poster: String? get() = definedExternally; set(value) = definedExternally
    var width: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
}
external interface SVGAttributes<T> : DOMAttributes<T> {
    var className: String? get() = definedExternally; set(value) = definedExternally
    var color: String? get() = definedExternally; set(value) = definedExternally
    var height: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var id: String? get() = definedExternally; set(value) = definedExternally
    var lang: String? get() = definedExternally; set(value) = definedExternally
    var max: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var media: String? get() = definedExternally; set(value) = definedExternally
    var method: String? get() = definedExternally; set(value) = definedExternally
    var min: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var name: String? get() = definedExternally; set(value) = definedExternally
    var style: CSSProperties? get() = definedExternally; set(value) = definedExternally
    var target: String? get() = definedExternally; set(value) = definedExternally
    var type: String? get() = definedExternally; set(value) = definedExternally
    var width: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var role: String? get() = definedExternally; set(value) = definedExternally
    var tabIndex: Number? get() = definedExternally; set(value) = definedExternally
    var accentHeight: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var accumulate: dynamic /* String /* "none" */ | String /* "sum" */ */ get() = definedExternally; set(value) = definedExternally
    var additive: dynamic /* String /* "sum" */ | String /* "replace" */ */ get() = definedExternally; set(value) = definedExternally
    var alignmentBaseline: dynamic /* String /* "inherit" */ | String /* "baseline" */ | String /* "auto" */ | String /* "before-edge" */ | String /* "text-before-edge" */ | String /* "middle" */ | String /* "central" */ | String /* "after-edge" */ | String /* "text-after-edge" */ | String /* "ideographic" */ | String /* "alphabetic" */ | String /* "hanging" */ | String /* "mathematical" */ */ get() = definedExternally; set(value) = definedExternally
    var allowReorder: dynamic /* String /* "no" */ | String /* "yes" */ */ get() = definedExternally; set(value) = definedExternally
    var alphabetic: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var amplitude: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var arabicForm: dynamic /* String /* "initial" */ | String /* "medial" */ | String /* "terminal" */ | String /* "isolated" */ */ get() = definedExternally; set(value) = definedExternally
    var ascent: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var attributeName: String? get() = definedExternally; set(value) = definedExternally
    var attributeType: String? get() = definedExternally; set(value) = definedExternally
    var autoReverse: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var azimuth: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var baseFrequency: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var baselineShift: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var baseProfile: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var bbox: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var begin: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var bias: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var by: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var calcMode: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var capHeight: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var clip: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var clipPath: String? get() = definedExternally; set(value) = definedExternally
    var clipPathUnits: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var clipRule: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var colorInterpolation: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var colorInterpolationFilters: dynamic /* String /* "inherit" */ | String /* "auto" */ | String /* "sRGB" */ | String /* "linearRGB" */ */ get() = definedExternally; set(value) = definedExternally
    var colorProfile: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var colorRendering: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var contentScriptType: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var contentStyleType: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var cursor: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var cx: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var cy: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var d: String? get() = definedExternally; set(value) = definedExternally
    var decelerate: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var descent: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var diffuseConstant: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var direction: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var display: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var divisor: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var dominantBaseline: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var dur: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var dx: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var dy: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var edgeMode: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var elevation: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var enableBackground: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var end: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var exponent: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var externalResourcesRequired: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var fill: String? get() = definedExternally; set(value) = definedExternally
    var fillOpacity: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var fillRule: dynamic /* String /* "inherit" */ | String /* "nonzero" */ | String /* "evenodd" */ */ get() = definedExternally; set(value) = definedExternally
    var filter: String? get() = definedExternally; set(value) = definedExternally
    var filterRes: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var filterUnits: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var floodColor: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var floodOpacity: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var focusable: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var fontFamily: String? get() = definedExternally; set(value) = definedExternally
    var fontSize: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var fontSizeAdjust: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var fontStretch: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var fontStyle: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var fontVariant: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var fontWeight: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var format: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var from: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var fx: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var fy: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var g1: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var g2: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var glyphName: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var glyphOrientationHorizontal: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var glyphOrientationVertical: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var glyphRef: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var gradientTransform: String? get() = definedExternally; set(value) = definedExternally
    var gradientUnits: String? get() = definedExternally; set(value) = definedExternally
    var hanging: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var horizAdvX: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var horizOriginX: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var ideographic: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var imageRendering: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var in2: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var `in`: String? get() = definedExternally; set(value) = definedExternally
    var intercept: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var k1: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var k2: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var k3: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var k4: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var k: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var kernelMatrix: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var kernelUnitLength: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var kerning: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var keyPoints: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var keySplines: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var keyTimes: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var lengthAdjust: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var letterSpacing: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var lightingColor: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var limitingConeAngle: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var local: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var markerEnd: String? get() = definedExternally; set(value) = definedExternally
    var markerHeight: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var markerMid: String? get() = definedExternally; set(value) = definedExternally
    var markerStart: String? get() = definedExternally; set(value) = definedExternally
    var markerUnits: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var markerWidth: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var mask: String? get() = definedExternally; set(value) = definedExternally
    var maskContentUnits: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var maskUnits: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var mathematical: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var mode: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var numOctaves: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var offset: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var opacity: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var operator: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var order: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var orient: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var orientation: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var origin: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var overflow: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var overlinePosition: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var overlineThickness: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var paintOrder: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var panose1: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var pathLength: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var patternContentUnits: String? get() = definedExternally; set(value) = definedExternally
    var patternTransform: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var patternUnits: String? get() = definedExternally; set(value) = definedExternally
    var pointerEvents: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var points: String? get() = definedExternally; set(value) = definedExternally
    var pointsAtX: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var pointsAtY: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var pointsAtZ: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var preserveAlpha: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var preserveAspectRatio: String? get() = definedExternally; set(value) = definedExternally
    var primitiveUnits: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var r: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var radius: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var refX: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var refY: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var renderingIntent: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var repeatCount: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var repeatDur: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var requiredExtensions: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var requiredFeatures: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var restart: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var result: String? get() = definedExternally; set(value) = definedExternally
    var rotate: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var rx: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var ry: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var scale: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var seed: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var shapeRendering: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var slope: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var spacing: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var specularConstant: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var specularExponent: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var speed: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var spreadMethod: String? get() = definedExternally; set(value) = definedExternally
    var startOffset: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var stdDeviation: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var stemh: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var stemv: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var stitchTiles: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var stopColor: String? get() = definedExternally; set(value) = definedExternally
    var stopOpacity: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var strikethroughPosition: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var strikethroughThickness: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var string: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var stroke: String? get() = definedExternally; set(value) = definedExternally
    var strokeDasharray: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var strokeDashoffset: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var strokeLinecap: dynamic /* String /* "inherit" */ | String /* "butt" */ | String /* "round" */ | String /* "square" */ */ get() = definedExternally; set(value) = definedExternally
    var strokeLinejoin: dynamic /* String /* "inherit" */ | String /* "round" */ | String /* "miter" */ | String /* "bevel" */ */ get() = definedExternally; set(value) = definedExternally
    var strokeMiterlimit: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var strokeOpacity: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var strokeWidth: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var surfaceScale: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var systemLanguage: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var tableValues: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var targetX: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var targetY: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var textAnchor: String? get() = definedExternally; set(value) = definedExternally
    var textDecoration: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var textLength: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var textRendering: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var to: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var transform: String? get() = definedExternally; set(value) = definedExternally
    var u1: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var u2: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var underlinePosition: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var underlineThickness: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var unicode: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var unicodeBidi: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var unicodeRange: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var unitsPerEm: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var vAlphabetic: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var values: String? get() = definedExternally; set(value) = definedExternally
    var vectorEffect: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var version: String? get() = definedExternally; set(value) = definedExternally
    var vertAdvY: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var vertOriginX: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var vertOriginY: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var vHanging: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var vIdeographic: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var viewBox: String? get() = definedExternally; set(value) = definedExternally
    var viewTarget: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var visibility: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var vMathematical: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var widths: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var wordSpacing: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var writingMode: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var x1: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var x2: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var x: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var xChannelSelector: String? get() = definedExternally; set(value) = definedExternally
    var xHeight: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var xlinkActuate: String? get() = definedExternally; set(value) = definedExternally
    var xlinkArcrole: String? get() = definedExternally; set(value) = definedExternally
    var xlinkHref: String? get() = definedExternally; set(value) = definedExternally
    var xlinkRole: String? get() = definedExternally; set(value) = definedExternally
    var xlinkShow: String? get() = definedExternally; set(value) = definedExternally
    var xlinkTitle: String? get() = definedExternally; set(value) = definedExternally
    var xlinkType: String? get() = definedExternally; set(value) = definedExternally
    var xmlBase: String? get() = definedExternally; set(value) = definedExternally
    var xmlLang: String? get() = definedExternally; set(value) = definedExternally
    var xmlns: String? get() = definedExternally; set(value) = definedExternally
    var xmlnsXlink: String? get() = definedExternally; set(value) = definedExternally
    var xmlSpace: String? get() = definedExternally; set(value) = definedExternally
    var y1: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var y2: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var y: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var yChannelSelector: String? get() = definedExternally; set(value) = definedExternally
    var z: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var zoomAndPan: String? get() = definedExternally; set(value) = definedExternally
}
external interface ReactHTML {
    var a: DetailedHTMLFactory<AnchorHTMLAttributes<HTMLAnchorElement>, HTMLAnchorElement>
    var abbr: DetailedHTMLFactory<HTMLAttributes<HTMLElement>, HTMLElement>
    var address: DetailedHTMLFactory<HTMLAttributes<HTMLElement>, HTMLElement>
    var area: DetailedHTMLFactory<AreaHTMLAttributes<HTMLAreaElement>, HTMLAreaElement>
    var article: DetailedHTMLFactory<HTMLAttributes<HTMLElement>, HTMLElement>
    var aside: DetailedHTMLFactory<HTMLAttributes<HTMLElement>, HTMLElement>
    var audio: DetailedHTMLFactory<AudioHTMLAttributes<HTMLAudioElement>, HTMLAudioElement>
    var b: DetailedHTMLFactory<HTMLAttributes<HTMLElement>, HTMLElement>
    var base: DetailedHTMLFactory<BaseHTMLAttributes<HTMLBaseElement>, HTMLBaseElement>
    var bdi: DetailedHTMLFactory<HTMLAttributes<HTMLElement>, HTMLElement>
    var bdo: DetailedHTMLFactory<HTMLAttributes<HTMLElement>, HTMLElement>
    var big: DetailedHTMLFactory<HTMLAttributes<HTMLElement>, HTMLElement>
    var blockquote: DetailedHTMLFactory<BlockquoteHTMLAttributes<HTMLElement>, HTMLElement>
    var body: DetailedHTMLFactory<HTMLAttributes<HTMLBodyElement>, HTMLBodyElement>
    var br: DetailedHTMLFactory<HTMLAttributes<HTMLBRElement>, HTMLBRElement>
    var button: DetailedHTMLFactory<ButtonHTMLAttributes<HTMLButtonElement>, HTMLButtonElement>
    var canvas: DetailedHTMLFactory<CanvasHTMLAttributes<HTMLCanvasElement>, HTMLCanvasElement>
    var caption: DetailedHTMLFactory<HTMLAttributes<HTMLElement>, HTMLElement>
    var cite: DetailedHTMLFactory<HTMLAttributes<HTMLElement>, HTMLElement>
    var code: DetailedHTMLFactory<HTMLAttributes<HTMLElement>, HTMLElement>
    var col: DetailedHTMLFactory<ColHTMLAttributes<HTMLTableColElement>, HTMLTableColElement>
    var colgroup: DetailedHTMLFactory<ColgroupHTMLAttributes<HTMLTableColElement>, HTMLTableColElement>
    var data: DetailedHTMLFactory<HTMLAttributes<HTMLElement>, HTMLElement>
    var datalist: DetailedHTMLFactory<HTMLAttributes<HTMLDataListElement>, HTMLDataListElement>
    var dd: DetailedHTMLFactory<HTMLAttributes<HTMLElement>, HTMLElement>
    var del: DetailedHTMLFactory<DelHTMLAttributes<HTMLElement>, HTMLElement>
    var details: DetailedHTMLFactory<DetailsHTMLAttributes<HTMLElement>, HTMLElement>
    var dfn: DetailedHTMLFactory<HTMLAttributes<HTMLElement>, HTMLElement>
    var dialog: DetailedHTMLFactory<HTMLAttributes<HTMLElement>, HTMLElement>
    var div: DetailedHTMLFactory<HTMLAttributes<HTMLDivElement>, HTMLDivElement>
    var dl: DetailedHTMLFactory<HTMLAttributes<HTMLDListElement>, HTMLDListElement>
    var dt: DetailedHTMLFactory<HTMLAttributes<HTMLElement>, HTMLElement>
    var em: DetailedHTMLFactory<HTMLAttributes<HTMLElement>, HTMLElement>
    var embed: DetailedHTMLFactory<EmbedHTMLAttributes<HTMLEmbedElement>, HTMLEmbedElement>
    var fieldset: DetailedHTMLFactory<FieldsetHTMLAttributes<HTMLFieldSetElement>, HTMLFieldSetElement>
    var figcaption: DetailedHTMLFactory<HTMLAttributes<HTMLElement>, HTMLElement>
    var figure: DetailedHTMLFactory<HTMLAttributes<HTMLElement>, HTMLElement>
    var footer: DetailedHTMLFactory<HTMLAttributes<HTMLElement>, HTMLElement>
    var form: DetailedHTMLFactory<FormHTMLAttributes<HTMLFormElement>, HTMLFormElement>
    var h1: DetailedHTMLFactory<HTMLAttributes<HTMLHeadingElement>, HTMLHeadingElement>
    var h2: DetailedHTMLFactory<HTMLAttributes<HTMLHeadingElement>, HTMLHeadingElement>
    var h3: DetailedHTMLFactory<HTMLAttributes<HTMLHeadingElement>, HTMLHeadingElement>
    var h4: DetailedHTMLFactory<HTMLAttributes<HTMLHeadingElement>, HTMLHeadingElement>
    var h5: DetailedHTMLFactory<HTMLAttributes<HTMLHeadingElement>, HTMLHeadingElement>
    var h6: DetailedHTMLFactory<HTMLAttributes<HTMLHeadingElement>, HTMLHeadingElement>
    var head: DetailedHTMLFactory<HTMLAttributes<HTMLElement>, HTMLHeadElement>
    var header: DetailedHTMLFactory<HTMLAttributes<HTMLElement>, HTMLElement>
    var hgroup: DetailedHTMLFactory<HTMLAttributes<HTMLElement>, HTMLElement>
    var hr: DetailedHTMLFactory<HTMLAttributes<HTMLHRElement>, HTMLHRElement>
    var html: DetailedHTMLFactory<HtmlHTMLAttributes<HTMLHtmlElement>, HTMLHtmlElement>
    var i: DetailedHTMLFactory<HTMLAttributes<HTMLElement>, HTMLElement>
    var iframe: DetailedHTMLFactory<IframeHTMLAttributes<HTMLIFrameElement>, HTMLIFrameElement>
    var img: DetailedHTMLFactory<ImgHTMLAttributes<HTMLImageElement>, HTMLImageElement>
    var input: DetailedHTMLFactory<InputHTMLAttributes<HTMLInputElement>, HTMLInputElement>
    var ins: DetailedHTMLFactory<InsHTMLAttributes<HTMLModElement>, HTMLModElement>
    var kbd: DetailedHTMLFactory<HTMLAttributes<HTMLElement>, HTMLElement>
    var keygen: DetailedHTMLFactory<KeygenHTMLAttributes<HTMLElement>, HTMLElement>
    var label: DetailedHTMLFactory<LabelHTMLAttributes<HTMLLabelElement>, HTMLLabelElement>
    var legend: DetailedHTMLFactory<HTMLAttributes<HTMLLegendElement>, HTMLLegendElement>
    var li: DetailedHTMLFactory<LiHTMLAttributes<HTMLLIElement>, HTMLLIElement>
    var link: DetailedHTMLFactory<LinkHTMLAttributes<HTMLLinkElement>, HTMLLinkElement>
    var main: DetailedHTMLFactory<HTMLAttributes<HTMLElement>, HTMLElement>
    var map: DetailedHTMLFactory<MapHTMLAttributes<HTMLMapElement>, HTMLMapElement>
    var mark: DetailedHTMLFactory<HTMLAttributes<HTMLElement>, HTMLElement>
    var menu: DetailedHTMLFactory<MenuHTMLAttributes<HTMLElement>, HTMLElement>
    var menuitem: DetailedHTMLFactory<HTMLAttributes<HTMLElement>, HTMLElement>
    var meta: DetailedHTMLFactory<MetaHTMLAttributes<HTMLMetaElement>, HTMLMetaElement>
    var meter: DetailedHTMLFactory<MeterHTMLAttributes<HTMLElement>, HTMLElement>
    var nav: DetailedHTMLFactory<HTMLAttributes<HTMLElement>, HTMLElement>
    var noscript: DetailedHTMLFactory<HTMLAttributes<HTMLElement>, HTMLElement>
    var `object`: DetailedHTMLFactory<ObjectHTMLAttributes<HTMLObjectElement>, HTMLObjectElement>
    var ol: DetailedHTMLFactory<OlHTMLAttributes<HTMLOListElement>, HTMLOListElement>
    var optgroup: DetailedHTMLFactory<OptgroupHTMLAttributes<HTMLOptGroupElement>, HTMLOptGroupElement>
    var option: DetailedHTMLFactory<OptionHTMLAttributes<HTMLOptionElement>, HTMLOptionElement>
    var output: DetailedHTMLFactory<OutputHTMLAttributes<HTMLElement>, HTMLElement>
    var p: DetailedHTMLFactory<HTMLAttributes<HTMLParagraphElement>, HTMLParagraphElement>
    var param: DetailedHTMLFactory<ParamHTMLAttributes<HTMLParamElement>, HTMLParamElement>
    var picture: DetailedHTMLFactory<HTMLAttributes<HTMLElement>, HTMLElement>
    var pre: DetailedHTMLFactory<HTMLAttributes<HTMLPreElement>, HTMLPreElement>
    var progress: DetailedHTMLFactory<ProgressHTMLAttributes<HTMLProgressElement>, HTMLProgressElement>
    var q: DetailedHTMLFactory<QuoteHTMLAttributes<HTMLQuoteElement>, HTMLQuoteElement>
    var rp: DetailedHTMLFactory<HTMLAttributes<HTMLElement>, HTMLElement>
    var rt: DetailedHTMLFactory<HTMLAttributes<HTMLElement>, HTMLElement>
    var ruby: DetailedHTMLFactory<HTMLAttributes<HTMLElement>, HTMLElement>
    var s: DetailedHTMLFactory<HTMLAttributes<HTMLElement>, HTMLElement>
    var samp: DetailedHTMLFactory<HTMLAttributes<HTMLElement>, HTMLElement>
    var script: DetailedHTMLFactory<ScriptHTMLAttributes<HTMLScriptElement>, HTMLScriptElement>
    var section: DetailedHTMLFactory<HTMLAttributes<HTMLElement>, HTMLElement>
    var select: DetailedHTMLFactory<SelectHTMLAttributes<HTMLSelectElement>, HTMLSelectElement>
    var small: DetailedHTMLFactory<HTMLAttributes<HTMLElement>, HTMLElement>
    var source: DetailedHTMLFactory<SourceHTMLAttributes<HTMLSourceElement>, HTMLSourceElement>
    var span: DetailedHTMLFactory<HTMLAttributes<HTMLSpanElement>, HTMLSpanElement>
    var strong: DetailedHTMLFactory<HTMLAttributes<HTMLElement>, HTMLElement>
    var style: DetailedHTMLFactory<StyleHTMLAttributes<HTMLStyleElement>, HTMLStyleElement>
    var sub: DetailedHTMLFactory<HTMLAttributes<HTMLElement>, HTMLElement>
    var summary: DetailedHTMLFactory<HTMLAttributes<HTMLElement>, HTMLElement>
    var sup: DetailedHTMLFactory<HTMLAttributes<HTMLElement>, HTMLElement>
    var table: DetailedHTMLFactory<TableHTMLAttributes<HTMLTableElement>, HTMLTableElement>
    var tbody: DetailedHTMLFactory<HTMLAttributes<HTMLTableSectionElement>, HTMLTableSectionElement>
    var td: DetailedHTMLFactory<TdHTMLAttributes<HTMLTableDataCellElement>, HTMLTableDataCellElement>
    var textarea: DetailedHTMLFactory<TextareaHTMLAttributes<HTMLTextAreaElement>, HTMLTextAreaElement>
    var tfoot: DetailedHTMLFactory<HTMLAttributes<HTMLTableSectionElement>, HTMLTableSectionElement>
    var th: DetailedHTMLFactory<ThHTMLAttributes<HTMLTableHeaderCellElement>, HTMLTableHeaderCellElement>
    var thead: DetailedHTMLFactory<HTMLAttributes<HTMLTableSectionElement>, HTMLTableSectionElement>
    var time: DetailedHTMLFactory<TimeHTMLAttributes<HTMLElement>, HTMLElement>
    var title: DetailedHTMLFactory<HTMLAttributes<HTMLTitleElement>, HTMLTitleElement>
    var tr: DetailedHTMLFactory<HTMLAttributes<HTMLTableRowElement>, HTMLTableRowElement>
    var track: DetailedHTMLFactory<TrackHTMLAttributes<HTMLTrackElement>, HTMLTrackElement>
    var u: DetailedHTMLFactory<HTMLAttributes<HTMLElement>, HTMLElement>
    var ul: DetailedHTMLFactory<HTMLAttributes<HTMLUListElement>, HTMLUListElement>
    var video: DetailedHTMLFactory<VideoHTMLAttributes<HTMLVideoElement>, HTMLVideoElement>
    var wbr: DetailedHTMLFactory<HTMLAttributes<HTMLElement>, HTMLElement>
    var webview: DetailedHTMLFactory<WebViewHTMLAttributes<HTMLElement>, HTMLElement>
}
external interface ReactSVG {
    var svg: SVGFactory
    var animate: SVGFactory
    var circle: SVGFactory
    var defs: SVGFactory
    var ellipse: SVGFactory
    var g: SVGFactory
    var image: SVGFactory
    var line: SVGFactory
    var linearGradient: SVGFactory
    var mask: SVGFactory
    var path: SVGFactory
    var pattern: SVGFactory
    var polygon: SVGFactory
    var polyline: SVGFactory
    var radialGradient: SVGFactory
    var rect: SVGFactory
    var stop: SVGFactory
    var symbol: SVGFactory
    var text: SVGFactory
    var tspan: SVGFactory
    var use: SVGFactory
}
external interface ReactDOM : ReactHTML, ReactSVG
external interface Requireable<T> : Any? {
    var isRequired: Any?
}
external interface ReactPropTypes {
    var any: Requireable<Any>
    var array: Requireable<Any>
    var bool: Requireable<Any>
    var func: Requireable<Any>
    var number: Requireable<Any>
    var `object`: Requireable<Any>
    var string: Requireable<Any>
    var node: Requireable<Any>
    var element: Requireable<Any>
    fun instanceOf(expectedClass: Any): Requireable<Any>
    fun oneOf(types: Array<Any>): Requireable<Any>
    fun oneOfType(types: Array<Any?>): Requireable<Any>
    fun arrayOf(type: Any?): Requireable<Any>
    fun objectOf(type: Any?): Requireable<Any>
    fun shape(type: Any?): Requireable<Any>
}
external interface ReactChildren {
    fun <T> map(children: String, fn: (child: dynamic /* String | Number | ReactElement<Any> */, index: Number) -> T): Array<T>
    fun <T> map(children: Number, fn: (child: dynamic /* String | Number | ReactElement<Any> */, index: Number) -> T): Array<T>
    fun <T> map(children: Boolean, fn: (child: dynamic /* String | Number | ReactElement<Any> */, index: Number) -> T): Array<T>
    fun <T> map(children: Any?, fn: (child: dynamic /* String | Number | ReactElement<Any> */, index: Number) -> T): Array<T>
    fun <T> map(children: ReactElement<Any>, fn: (child: dynamic /* String | Number | ReactElement<Any> */, index: Number) -> T): Array<T>
    fun <T> map(children: Array<dynamic /* String | Number | Boolean | Array<Any> | ReactElement<Any> */>, fn: (child: dynamic /* String | Number | ReactElement<Any> */, index: Number) -> T): Array<T>
    fun <T> map(children: Nothing?, fn: (child: dynamic /* String | Number | ReactElement<Any> */, index: Number) -> T): Array<T>
    fun forEach(children: String, fn: (child: dynamic /* String | Number | ReactElement<Any> */, index: Number) -> Any)
    fun forEach(children: Number, fn: (child: dynamic /* String | Number | ReactElement<Any> */, index: Number) -> Any)
    fun forEach(children: Boolean, fn: (child: dynamic /* String | Number | ReactElement<Any> */, index: Number) -> Any)
    fun forEach(children: Any?, fn: (child: dynamic /* String | Number | ReactElement<Any> */, index: Number) -> Any)
    fun forEach(children: ReactElement<Any>, fn: (child: dynamic /* String | Number | ReactElement<Any> */, index: Number) -> Any)
    fun forEach(children: Array<dynamic /* String | Number | Boolean | Array<Any> | ReactElement<Any> */>, fn: (child: dynamic /* String | Number | ReactElement<Any> */, index: Number) -> Any)
    fun forEach(children: Nothing?, fn: (child: dynamic /* String | Number | ReactElement<Any> */, index: Number) -> Any)
    fun count(children: String): Number
    fun count(children: Number): Number
    fun count(children: Boolean): Number
    fun count(children: Any?): Number
    fun count(children: ReactElement<Any>): Number
    fun count(children: Array<dynamic /* String | Number | Boolean | Array<Any> | ReactElement<Any> */>): Number
    fun count(children: Nothing?): Number
    fun only(children: String): ReactElement<Any>
    fun only(children: Number): ReactElement<Any>
    fun only(children: Boolean): ReactElement<Any>
    fun only(children: Any?): ReactElement<Any>
    fun only(children: ReactElement<Any>): ReactElement<Any>
    fun only(children: Array<dynamic /* String | Number | Boolean | Array<Any> | ReactElement<Any> */>): ReactElement<Any>
    fun only(children: Nothing?): ReactElement<Any>
    fun toArray(children: String): Array<dynamic /* String | Number | ReactElement<Any> */>
    fun toArray(children: Number): Array<dynamic /* String | Number | ReactElement<Any> */>
    fun toArray(children: Boolean): Array<dynamic /* String | Number | ReactElement<Any> */>
    fun toArray(children: Any?): Array<dynamic /* String | Number | ReactElement<Any> */>
    fun toArray(children: ReactElement<Any>): Array<dynamic /* String | Number | ReactElement<Any> */>
    fun toArray(children: Array<dynamic /* String | Number | Boolean | Array<Any> | ReactElement<Any> */>): Array<dynamic /* String | Number | ReactElement<Any> */>
    fun toArray(children: Nothing?): Array<dynamic /* String | Number | ReactElement<Any> */>
}
external interface AbstractView {
    var styleMedia: StyleMedia
    var document: Document
}
external interface Touch {
    var identifier: Number
    var target: EventTarget
    var screenX: Number
    var screenY: Number
    var clientX: Number
    var clientY: Number
    var pageX: Number
    var pageY: Number
}
external interface TouchList {
    @nativeGetter
    operator fun get(index: Number): Touch?
    @nativeSetter
    operator fun set(index: Number, value: Touch)
    var length: Number
    fun item(index: Number): Touch
    fun identifiedTouch(identifier: Number): Touch
}
