@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("global.JSX")
package js.externals.react.global.JSX

import js.externals.react.*
import org.w3c.dom.*
import org.w3c.dom.svg.*

external interface Element : ReactElement<Any>
external interface ElementClass : Component<Any, Any?> {
    override fun render(): dynamic /* String | Number | Boolean | Any? | ReactElement<Any> | Array<dynamic /* String | Number | Boolean | Array<Any> | ReactElement<Any> */> | ReactPortal | Nothing? */
}
external interface ElementAttributesProperty {
    var props: Any
}
external interface ElementChildrenAttribute {
    var children: Any
}
external interface IntrinsicAttributes : Attributes
external interface IntrinsicClassAttributes<T> : ClassAttributes<T>
external interface IntrinsicElements {
    var a: ClassAttributes<HTMLAnchorElement> /* ClassAttributes<HTMLAnchorElement> & AnchorHTMLAttributes<HTMLAnchorElement> */
    var abbr: ClassAttributes<HTMLElement> /* ClassAttributes<HTMLElement> & HTMLAttributes<HTMLElement> */
    var address: ClassAttributes<HTMLElement> /* ClassAttributes<HTMLElement> & HTMLAttributes<HTMLElement> */
    var area: ClassAttributes<HTMLAreaElement> /* ClassAttributes<HTMLAreaElement> & AreaHTMLAttributes<HTMLAreaElement> */
    var article: ClassAttributes<HTMLElement> /* ClassAttributes<HTMLElement> & HTMLAttributes<HTMLElement> */
    var aside: ClassAttributes<HTMLElement> /* ClassAttributes<HTMLElement> & HTMLAttributes<HTMLElement> */
    var audio: ClassAttributes<HTMLAudioElement> /* ClassAttributes<HTMLAudioElement> & AudioHTMLAttributes<HTMLAudioElement> */
    var b: ClassAttributes<HTMLElement> /* ClassAttributes<HTMLElement> & HTMLAttributes<HTMLElement> */
    var base: ClassAttributes<HTMLBaseElement> /* ClassAttributes<HTMLBaseElement> & BaseHTMLAttributes<HTMLBaseElement> */
    var bdi: ClassAttributes<HTMLElement> /* ClassAttributes<HTMLElement> & HTMLAttributes<HTMLElement> */
    var bdo: ClassAttributes<HTMLElement> /* ClassAttributes<HTMLElement> & HTMLAttributes<HTMLElement> */
    var big: ClassAttributes<HTMLElement> /* ClassAttributes<HTMLElement> & HTMLAttributes<HTMLElement> */
    var blockquote: ClassAttributes<HTMLElement> /* ClassAttributes<HTMLElement> & BlockquoteHTMLAttributes<HTMLElement> */
    var body: ClassAttributes<HTMLBodyElement> /* ClassAttributes<HTMLBodyElement> & HTMLAttributes<HTMLBodyElement> */
    var br: ClassAttributes<HTMLBRElement> /* ClassAttributes<HTMLBRElement> & HTMLAttributes<HTMLBRElement> */
    var button: ClassAttributes<HTMLButtonElement> /* ClassAttributes<HTMLButtonElement> & ButtonHTMLAttributes<HTMLButtonElement> */
    var canvas: ClassAttributes<HTMLCanvasElement> /* ClassAttributes<HTMLCanvasElement> & CanvasHTMLAttributes<HTMLCanvasElement> */
    var caption: ClassAttributes<HTMLElement> /* ClassAttributes<HTMLElement> & HTMLAttributes<HTMLElement> */
    var cite: ClassAttributes<HTMLElement> /* ClassAttributes<HTMLElement> & HTMLAttributes<HTMLElement> */
    var code: ClassAttributes<HTMLElement> /* ClassAttributes<HTMLElement> & HTMLAttributes<HTMLElement> */
    var col: ClassAttributes<HTMLTableColElement> /* ClassAttributes<HTMLTableColElement> & ColHTMLAttributes<HTMLTableColElement> */
    var colgroup: ClassAttributes<HTMLTableColElement> /* ClassAttributes<HTMLTableColElement> & ColgroupHTMLAttributes<HTMLTableColElement> */
    var data: ClassAttributes<HTMLElement> /* ClassAttributes<HTMLElement> & HTMLAttributes<HTMLElement> */
    var datalist: ClassAttributes<HTMLDataListElement> /* ClassAttributes<HTMLDataListElement> & HTMLAttributes<HTMLDataListElement> */
    var dd: ClassAttributes<HTMLElement> /* ClassAttributes<HTMLElement> & HTMLAttributes<HTMLElement> */
    var del: ClassAttributes<HTMLElement> /* ClassAttributes<HTMLElement> & DelHTMLAttributes<HTMLElement> */
    var details: ClassAttributes<HTMLElement> /* ClassAttributes<HTMLElement> & DetailsHTMLAttributes<HTMLElement> */
    var dfn: ClassAttributes<HTMLElement> /* ClassAttributes<HTMLElement> & HTMLAttributes<HTMLElement> */
    var dialog: ClassAttributes<HTMLElement> /* ClassAttributes<HTMLElement> & HTMLAttributes<HTMLElement> */
    var div: ClassAttributes<HTMLDivElement> /* ClassAttributes<HTMLDivElement> & HTMLAttributes<HTMLDivElement> */
    var dl: ClassAttributes<HTMLDListElement> /* ClassAttributes<HTMLDListElement> & HTMLAttributes<HTMLDListElement> */
    var dt: ClassAttributes<HTMLElement> /* ClassAttributes<HTMLElement> & HTMLAttributes<HTMLElement> */
    var em: ClassAttributes<HTMLElement> /* ClassAttributes<HTMLElement> & HTMLAttributes<HTMLElement> */
    var embed: ClassAttributes<HTMLEmbedElement> /* ClassAttributes<HTMLEmbedElement> & EmbedHTMLAttributes<HTMLEmbedElement> */
    var fieldset: ClassAttributes<HTMLFieldSetElement> /* ClassAttributes<HTMLFieldSetElement> & FieldsetHTMLAttributes<HTMLFieldSetElement> */
    var figcaption: ClassAttributes<HTMLElement> /* ClassAttributes<HTMLElement> & HTMLAttributes<HTMLElement> */
    var figure: ClassAttributes<HTMLElement> /* ClassAttributes<HTMLElement> & HTMLAttributes<HTMLElement> */
    var footer: ClassAttributes<HTMLElement> /* ClassAttributes<HTMLElement> & HTMLAttributes<HTMLElement> */
    var form: ClassAttributes<HTMLFormElement> /* ClassAttributes<HTMLFormElement> & FormHTMLAttributes<HTMLFormElement> */
    var h1: ClassAttributes<HTMLHeadingElement> /* ClassAttributes<HTMLHeadingElement> & HTMLAttributes<HTMLHeadingElement> */
    var h2: ClassAttributes<HTMLHeadingElement> /* ClassAttributes<HTMLHeadingElement> & HTMLAttributes<HTMLHeadingElement> */
    var h3: ClassAttributes<HTMLHeadingElement> /* ClassAttributes<HTMLHeadingElement> & HTMLAttributes<HTMLHeadingElement> */
    var h4: ClassAttributes<HTMLHeadingElement> /* ClassAttributes<HTMLHeadingElement> & HTMLAttributes<HTMLHeadingElement> */
    var h5: ClassAttributes<HTMLHeadingElement> /* ClassAttributes<HTMLHeadingElement> & HTMLAttributes<HTMLHeadingElement> */
    var h6: ClassAttributes<HTMLHeadingElement> /* ClassAttributes<HTMLHeadingElement> & HTMLAttributes<HTMLHeadingElement> */
    var head: ClassAttributes<HTMLHeadElement> /* ClassAttributes<HTMLHeadElement> & HTMLAttributes<HTMLHeadElement> */
    var header: ClassAttributes<HTMLElement> /* ClassAttributes<HTMLElement> & HTMLAttributes<HTMLElement> */
    var hgroup: ClassAttributes<HTMLElement> /* ClassAttributes<HTMLElement> & HTMLAttributes<HTMLElement> */
    var hr: ClassAttributes<HTMLHRElement> /* ClassAttributes<HTMLHRElement> & HTMLAttributes<HTMLHRElement> */
    var html: ClassAttributes<HTMLHtmlElement> /* ClassAttributes<HTMLHtmlElement> & HtmlHTMLAttributes<HTMLHtmlElement> */
    var i: ClassAttributes<HTMLElement> /* ClassAttributes<HTMLElement> & HTMLAttributes<HTMLElement> */
    var iframe: ClassAttributes<HTMLIFrameElement> /* ClassAttributes<HTMLIFrameElement> & IframeHTMLAttributes<HTMLIFrameElement> */
    var img: ClassAttributes<HTMLImageElement> /* ClassAttributes<HTMLImageElement> & ImgHTMLAttributes<HTMLImageElement> */
    var input: ClassAttributes<HTMLInputElement> /* ClassAttributes<HTMLInputElement> & InputHTMLAttributes<HTMLInputElement> */
    var ins: ClassAttributes<HTMLModElement> /* ClassAttributes<HTMLModElement> & InsHTMLAttributes<HTMLModElement> */
    var kbd: ClassAttributes<HTMLElement> /* ClassAttributes<HTMLElement> & HTMLAttributes<HTMLElement> */
    var keygen: ClassAttributes<HTMLElement> /* ClassAttributes<HTMLElement> & KeygenHTMLAttributes<HTMLElement> */
    var label: ClassAttributes<HTMLLabelElement> /* ClassAttributes<HTMLLabelElement> & LabelHTMLAttributes<HTMLLabelElement> */
    var legend: ClassAttributes<HTMLLegendElement> /* ClassAttributes<HTMLLegendElement> & HTMLAttributes<HTMLLegendElement> */
    var li: ClassAttributes<HTMLLIElement> /* ClassAttributes<HTMLLIElement> & LiHTMLAttributes<HTMLLIElement> */
    var link: ClassAttributes<HTMLLinkElement> /* ClassAttributes<HTMLLinkElement> & LinkHTMLAttributes<HTMLLinkElement> */
    var main: ClassAttributes<HTMLElement> /* ClassAttributes<HTMLElement> & HTMLAttributes<HTMLElement> */
    var map: ClassAttributes<HTMLMapElement> /* ClassAttributes<HTMLMapElement> & MapHTMLAttributes<HTMLMapElement> */
    var mark: ClassAttributes<HTMLElement> /* ClassAttributes<HTMLElement> & HTMLAttributes<HTMLElement> */
    var menu: ClassAttributes<HTMLElement> /* ClassAttributes<HTMLElement> & MenuHTMLAttributes<HTMLElement> */
    var menuitem: ClassAttributes<HTMLElement> /* ClassAttributes<HTMLElement> & HTMLAttributes<HTMLElement> */
    var meta: ClassAttributes<HTMLMetaElement> /* ClassAttributes<HTMLMetaElement> & MetaHTMLAttributes<HTMLMetaElement> */
    var meter: ClassAttributes<HTMLElement> /* ClassAttributes<HTMLElement> & MeterHTMLAttributes<HTMLElement> */
    var nav: ClassAttributes<HTMLElement> /* ClassAttributes<HTMLElement> & HTMLAttributes<HTMLElement> */
    var noindex: ClassAttributes<HTMLElement> /* ClassAttributes<HTMLElement> & HTMLAttributes<HTMLElement> */
    var noscript: ClassAttributes<HTMLElement> /* ClassAttributes<HTMLElement> & HTMLAttributes<HTMLElement> */
    var `object`: ClassAttributes<HTMLObjectElement> /* ClassAttributes<HTMLObjectElement> & ObjectHTMLAttributes<HTMLObjectElement> */
    var ol: ClassAttributes<HTMLOListElement> /* ClassAttributes<HTMLOListElement> & OlHTMLAttributes<HTMLOListElement> */
    var optgroup: ClassAttributes<HTMLOptGroupElement> /* ClassAttributes<HTMLOptGroupElement> & OptgroupHTMLAttributes<HTMLOptGroupElement> */
    var option: ClassAttributes<HTMLOptionElement> /* ClassAttributes<HTMLOptionElement> & OptionHTMLAttributes<HTMLOptionElement> */
    var output: ClassAttributes<HTMLElement> /* ClassAttributes<HTMLElement> & OutputHTMLAttributes<HTMLElement> */
    var p: ClassAttributes<HTMLParagraphElement> /* ClassAttributes<HTMLParagraphElement> & HTMLAttributes<HTMLParagraphElement> */
    var param: ClassAttributes<HTMLParamElement> /* ClassAttributes<HTMLParamElement> & ParamHTMLAttributes<HTMLParamElement> */
    var picture: ClassAttributes<HTMLElement> /* ClassAttributes<HTMLElement> & HTMLAttributes<HTMLElement> */
    var pre: ClassAttributes<HTMLPreElement> /* ClassAttributes<HTMLPreElement> & HTMLAttributes<HTMLPreElement> */
    var progress: ClassAttributes<HTMLProgressElement> /* ClassAttributes<HTMLProgressElement> & ProgressHTMLAttributes<HTMLProgressElement> */
    var q: ClassAttributes<HTMLQuoteElement> /* ClassAttributes<HTMLQuoteElement> & QuoteHTMLAttributes<HTMLQuoteElement> */
    var rp: ClassAttributes<HTMLElement> /* ClassAttributes<HTMLElement> & HTMLAttributes<HTMLElement> */
    var rt: ClassAttributes<HTMLElement> /* ClassAttributes<HTMLElement> & HTMLAttributes<HTMLElement> */
    var ruby: ClassAttributes<HTMLElement> /* ClassAttributes<HTMLElement> & HTMLAttributes<HTMLElement> */
    var s: ClassAttributes<HTMLElement> /* ClassAttributes<HTMLElement> & HTMLAttributes<HTMLElement> */
    var samp: ClassAttributes<HTMLElement> /* ClassAttributes<HTMLElement> & HTMLAttributes<HTMLElement> */
    var script: ClassAttributes<HTMLScriptElement> /* ClassAttributes<HTMLScriptElement> & ScriptHTMLAttributes<HTMLScriptElement> */
    var section: ClassAttributes<HTMLElement> /* ClassAttributes<HTMLElement> & HTMLAttributes<HTMLElement> */
    var select: ClassAttributes<HTMLSelectElement> /* ClassAttributes<HTMLSelectElement> & SelectHTMLAttributes<HTMLSelectElement> */
    var small: ClassAttributes<HTMLElement> /* ClassAttributes<HTMLElement> & HTMLAttributes<HTMLElement> */
    var source: ClassAttributes<HTMLSourceElement> /* ClassAttributes<HTMLSourceElement> & SourceHTMLAttributes<HTMLSourceElement> */
    var span: ClassAttributes<HTMLSpanElement> /* ClassAttributes<HTMLSpanElement> & HTMLAttributes<HTMLSpanElement> */
    var strong: ClassAttributes<HTMLElement> /* ClassAttributes<HTMLElement> & HTMLAttributes<HTMLElement> */
    var style: ClassAttributes<HTMLStyleElement> /* ClassAttributes<HTMLStyleElement> & StyleHTMLAttributes<HTMLStyleElement> */
    var sub: ClassAttributes<HTMLElement> /* ClassAttributes<HTMLElement> & HTMLAttributes<HTMLElement> */
    var summary: ClassAttributes<HTMLElement> /* ClassAttributes<HTMLElement> & HTMLAttributes<HTMLElement> */
    var sup: ClassAttributes<HTMLElement> /* ClassAttributes<HTMLElement> & HTMLAttributes<HTMLElement> */
    var table: ClassAttributes<HTMLTableElement> /* ClassAttributes<HTMLTableElement> & TableHTMLAttributes<HTMLTableElement> */
    var tbody: ClassAttributes<HTMLTableSectionElement> /* ClassAttributes<HTMLTableSectionElement> & HTMLAttributes<HTMLTableSectionElement> */
//    var td: ClassAttributes<HTMLTableDataCellElement> /* ClassAttributes<HTMLTableDataCellElement> & TdHTMLAttributes<HTMLTableDataCellElement> */
    var textarea: ClassAttributes<HTMLTextAreaElement> /* ClassAttributes<HTMLTextAreaElement> & TextareaHTMLAttributes<HTMLTextAreaElement> */
    var tfoot: ClassAttributes<HTMLTableSectionElement> /* ClassAttributes<HTMLTableSectionElement> & HTMLAttributes<HTMLTableSectionElement> */
//    var th: ClassAttributes<HTMLTableHeaderCellElement> /* ClassAttributes<HTMLTableHeaderCellElement> & ThHTMLAttributes<HTMLTableHeaderCellElement> */
    var thead: ClassAttributes<HTMLTableSectionElement> /* ClassAttributes<HTMLTableSectionElement> & HTMLAttributes<HTMLTableSectionElement> */
    var time: ClassAttributes<HTMLElement> /* ClassAttributes<HTMLElement> & TimeHTMLAttributes<HTMLElement> */
    var title: ClassAttributes<HTMLTitleElement> /* ClassAttributes<HTMLTitleElement> & HTMLAttributes<HTMLTitleElement> */
    var tr: ClassAttributes<HTMLTableRowElement> /* ClassAttributes<HTMLTableRowElement> & HTMLAttributes<HTMLTableRowElement> */
    var track: ClassAttributes<HTMLTrackElement> /* ClassAttributes<HTMLTrackElement> & TrackHTMLAttributes<HTMLTrackElement> */
    var u: ClassAttributes<HTMLElement> /* ClassAttributes<HTMLElement> & HTMLAttributes<HTMLElement> */
    var ul: ClassAttributes<HTMLUListElement> /* ClassAttributes<HTMLUListElement> & HTMLAttributes<HTMLUListElement> */
    var video: ClassAttributes<HTMLVideoElement> /* ClassAttributes<HTMLVideoElement> & VideoHTMLAttributes<HTMLVideoElement> */
    var wbr: ClassAttributes<HTMLElement> /* ClassAttributes<HTMLElement> & HTMLAttributes<HTMLElement> */
//    var webview: ClassAttributes<HTMLWebViewElement> /* ClassAttributes<HTMLWebViewElement> & WebViewHTMLAttributes<HTMLWebViewElement> */
    var svg: SVGProps<SVGSVGElement>
    var animate: SVGProps<SVGElement>
    var animateTransform: SVGProps<SVGElement>
    var circle: SVGProps<SVGCircleElement>
//    var clipPath: SVGProps<SVGClipPathElement>
    var defs: SVGProps<SVGDefsElement>
    var desc: SVGProps<SVGDescElement>
    var ellipse: SVGProps<SVGEllipseElement>
//    var feBlend: SVGProps<SVGFEBlendElement>
//    var feColorMatrix: SVGProps<SVGFEColorMatrixElement>
//    var feComponentTransfer: SVGProps<SVGFEComponentTransferElement>
//    var feComposite: SVGProps<SVGFECompositeElement>
//    var feConvolveMatrix: SVGProps<SVGFEConvolveMatrixElement>
//    var feDiffuseLighting: SVGProps<SVGFEDiffuseLightingElement>
//    var feDisplacementMap: SVGProps<SVGFEDisplacementMapElement>
//    var feDistantLight: SVGProps<SVGFEDistantLightElement>
//    var feFlood: SVGProps<SVGFEFloodElement>
//    var feFuncA: SVGProps<SVGFEFuncAElement>
//    var feFuncB: SVGProps<SVGFEFuncBElement>
//    var feFuncG: SVGProps<SVGFEFuncGElement>
//    var feFuncR: SVGProps<SVGFEFuncRElement>
//    var feGaussianBlur: SVGProps<SVGFEGaussianBlurElement>
//    var feImage: SVGProps<SVGFEImageElement>
//    var feMerge: SVGProps<SVGFEMergeElement>
//    var feMergeNode: SVGProps<SVGFEMergeNodeElement>
//    var feMorphology: SVGProps<SVGFEMorphologyElement>
//    var feOffset: SVGProps<SVGFEOffsetElement>
//    var fePointLight: SVGProps<SVGFEPointLightElement>
//    var feSpecularLighting: SVGProps<SVGFESpecularLightingElement>
//    var feSpotLight: SVGProps<SVGFESpotLightElement>
//    var feTile: SVGProps<SVGFETileElement>
//    var feTurbulence: SVGProps<SVGFETurbulenceElement>
//    var filter: SVGProps<SVGFilterElement>
    var foreignObject: SVGProps<SVGForeignObjectElement>
    var g: SVGProps<SVGGElement>
    var image: SVGProps<SVGImageElement>
    var line: SVGProps<SVGLineElement>
    var linearGradient: SVGProps<SVGLinearGradientElement>
    var marker: SVGProps<SVGMarkerElement>
//    var mask: SVGProps<SVGMaskElement>
    var metadata: SVGProps<SVGMetadataElement>
    var path: SVGProps<SVGPathElement>
    var pattern: SVGProps<SVGPatternElement>
    var polygon: SVGProps<SVGPolygonElement>
    var polyline: SVGProps<SVGPolylineElement>
    var radialGradient: SVGProps<SVGRadialGradientElement>
    var rect: SVGProps<SVGRectElement>
    var stop: SVGProps<SVGStopElement>
    var switch: SVGProps<SVGSwitchElement>
    var symbol: SVGProps<SVGSymbolElement>
    var text: SVGProps<SVGTextElement>
    var textPath: SVGProps<SVGTextPathElement>
    var tspan: SVGProps<SVGTSpanElement>
    var use: SVGProps<SVGUseElement>
    var view: SVGProps<SVGViewElement>
}
