@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("global.JSX")
package global.JSX

import org.w3c.dom.*
import org.w3c.dom.svg.*

external interface Element : React.ReactElement<Any>
external interface ElementClass : React.Component<Any, Any?> {
    override fun render(): dynamic /* Boolean | Element | Nothing? */
}
external interface ElementAttributesProperty {
    var props: Any
}
external interface ElementChildrenAttribute {
    var children: Any
}
external interface IntrinsicAttributes : React.Attributes
external interface IntrinsicClassAttributes<T> : React.ClassAttributes<T>
external interface IntrinsicElements {
    var a: React.ClassAttributes<HTMLAnchorElement> /* React.ClassAttributes<HTMLAnchorElement> & React.AnchorHTMLAttributes<HTMLAnchorElement> */
    var abbr: React.ClassAttributes<HTMLElement> /* React.ClassAttributes<HTMLElement> & React.HTMLAttributes<HTMLElement> */
    var address: React.ClassAttributes<HTMLElement> /* React.ClassAttributes<HTMLElement> & React.HTMLAttributes<HTMLElement> */
    var area: React.ClassAttributes<HTMLAreaElement> /* React.ClassAttributes<HTMLAreaElement> & React.AreaHTMLAttributes<HTMLAreaElement> */
    var article: React.ClassAttributes<HTMLElement> /* React.ClassAttributes<HTMLElement> & React.HTMLAttributes<HTMLElement> */
    var aside: React.ClassAttributes<HTMLElement> /* React.ClassAttributes<HTMLElement> & React.HTMLAttributes<HTMLElement> */
    var audio: React.ClassAttributes<HTMLAudioElement> /* React.ClassAttributes<HTMLAudioElement> & React.AudioHTMLAttributes<HTMLAudioElement> */
    var b: React.ClassAttributes<HTMLElement> /* React.ClassAttributes<HTMLElement> & React.HTMLAttributes<HTMLElement> */
    var base: React.ClassAttributes<HTMLBaseElement> /* React.ClassAttributes<HTMLBaseElement> & React.BaseHTMLAttributes<HTMLBaseElement> */
    var bdi: React.ClassAttributes<HTMLElement> /* React.ClassAttributes<HTMLElement> & React.HTMLAttributes<HTMLElement> */
    var bdo: React.ClassAttributes<HTMLElement> /* React.ClassAttributes<HTMLElement> & React.HTMLAttributes<HTMLElement> */
    var big: React.ClassAttributes<HTMLElement> /* React.ClassAttributes<HTMLElement> & React.HTMLAttributes<HTMLElement> */
    var blockquote: React.ClassAttributes<HTMLElement> /* React.ClassAttributes<HTMLElement> & React.BlockquoteHTMLAttributes<HTMLElement> */
    var body: React.ClassAttributes<HTMLBodyElement> /* React.ClassAttributes<HTMLBodyElement> & React.HTMLAttributes<HTMLBodyElement> */
    var br: React.ClassAttributes<HTMLBRElement> /* React.ClassAttributes<HTMLBRElement> & React.HTMLAttributes<HTMLBRElement> */
    var button: React.ClassAttributes<HTMLButtonElement> /* React.ClassAttributes<HTMLButtonElement> & React.ButtonHTMLAttributes<HTMLButtonElement> */
    var canvas: React.ClassAttributes<HTMLCanvasElement> /* React.ClassAttributes<HTMLCanvasElement> & React.CanvasHTMLAttributes<HTMLCanvasElement> */
    var caption: React.ClassAttributes<HTMLElement> /* React.ClassAttributes<HTMLElement> & React.HTMLAttributes<HTMLElement> */
    var cite: React.ClassAttributes<HTMLElement> /* React.ClassAttributes<HTMLElement> & React.HTMLAttributes<HTMLElement> */
    var code: React.ClassAttributes<HTMLElement> /* React.ClassAttributes<HTMLElement> & React.HTMLAttributes<HTMLElement> */
    var col: React.ClassAttributes<HTMLTableColElement> /* React.ClassAttributes<HTMLTableColElement> & React.ColHTMLAttributes<HTMLTableColElement> */
    var colgroup: React.ClassAttributes<HTMLTableColElement> /* React.ClassAttributes<HTMLTableColElement> & React.ColgroupHTMLAttributes<HTMLTableColElement> */
    var data: React.ClassAttributes<HTMLElement> /* React.ClassAttributes<HTMLElement> & React.HTMLAttributes<HTMLElement> */
    var datalist: React.ClassAttributes<HTMLDataListElement> /* React.ClassAttributes<HTMLDataListElement> & React.HTMLAttributes<HTMLDataListElement> */
    var dd: React.ClassAttributes<HTMLElement> /* React.ClassAttributes<HTMLElement> & React.HTMLAttributes<HTMLElement> */
    var del: React.ClassAttributes<HTMLElement> /* React.ClassAttributes<HTMLElement> & React.DelHTMLAttributes<HTMLElement> */
    var details: React.ClassAttributes<HTMLElement> /* React.ClassAttributes<HTMLElement> & React.DetailsHTMLAttributes<HTMLElement> */
    var dfn: React.ClassAttributes<HTMLElement> /* React.ClassAttributes<HTMLElement> & React.HTMLAttributes<HTMLElement> */
    var dialog: React.ClassAttributes<HTMLElement> /* React.ClassAttributes<HTMLElement> & React.HTMLAttributes<HTMLElement> */
    var div: React.ClassAttributes<HTMLDivElement> /* React.ClassAttributes<HTMLDivElement> & React.HTMLAttributes<HTMLDivElement> */
    var dl: React.ClassAttributes<HTMLDListElement> /* React.ClassAttributes<HTMLDListElement> & React.HTMLAttributes<HTMLDListElement> */
    var dt: React.ClassAttributes<HTMLElement> /* React.ClassAttributes<HTMLElement> & React.HTMLAttributes<HTMLElement> */
    var em: React.ClassAttributes<HTMLElement> /* React.ClassAttributes<HTMLElement> & React.HTMLAttributes<HTMLElement> */
    var embed: React.ClassAttributes<HTMLEmbedElement> /* React.ClassAttributes<HTMLEmbedElement> & React.EmbedHTMLAttributes<HTMLEmbedElement> */
    var fieldset: React.ClassAttributes<HTMLFieldSetElement> /* React.ClassAttributes<HTMLFieldSetElement> & React.FieldsetHTMLAttributes<HTMLFieldSetElement> */
    var figcaption: React.ClassAttributes<HTMLElement> /* React.ClassAttributes<HTMLElement> & React.HTMLAttributes<HTMLElement> */
    var figure: React.ClassAttributes<HTMLElement> /* React.ClassAttributes<HTMLElement> & React.HTMLAttributes<HTMLElement> */
    var footer: React.ClassAttributes<HTMLElement> /* React.ClassAttributes<HTMLElement> & React.HTMLAttributes<HTMLElement> */
    var form: React.ClassAttributes<HTMLFormElement> /* React.ClassAttributes<HTMLFormElement> & React.FormHTMLAttributes<HTMLFormElement> */
    var h1: React.ClassAttributes<HTMLHeadingElement> /* React.ClassAttributes<HTMLHeadingElement> & React.HTMLAttributes<HTMLHeadingElement> */
    var h2: React.ClassAttributes<HTMLHeadingElement> /* React.ClassAttributes<HTMLHeadingElement> & React.HTMLAttributes<HTMLHeadingElement> */
    var h3: React.ClassAttributes<HTMLHeadingElement> /* React.ClassAttributes<HTMLHeadingElement> & React.HTMLAttributes<HTMLHeadingElement> */
    var h4: React.ClassAttributes<HTMLHeadingElement> /* React.ClassAttributes<HTMLHeadingElement> & React.HTMLAttributes<HTMLHeadingElement> */
    var h5: React.ClassAttributes<HTMLHeadingElement> /* React.ClassAttributes<HTMLHeadingElement> & React.HTMLAttributes<HTMLHeadingElement> */
    var h6: React.ClassAttributes<HTMLHeadingElement> /* React.ClassAttributes<HTMLHeadingElement> & React.HTMLAttributes<HTMLHeadingElement> */
    var head: React.ClassAttributes<HTMLHeadElement> /* React.ClassAttributes<HTMLHeadElement> & React.HTMLAttributes<HTMLHeadElement> */
    var header: React.ClassAttributes<HTMLElement> /* React.ClassAttributes<HTMLElement> & React.HTMLAttributes<HTMLElement> */
    var hgroup: React.ClassAttributes<HTMLElement> /* React.ClassAttributes<HTMLElement> & React.HTMLAttributes<HTMLElement> */
    var hr: React.ClassAttributes<HTMLHRElement> /* React.ClassAttributes<HTMLHRElement> & React.HTMLAttributes<HTMLHRElement> */
    var html: React.ClassAttributes<HTMLHtmlElement> /* React.ClassAttributes<HTMLHtmlElement> & React.HtmlHTMLAttributes<HTMLHtmlElement> */
    var i: React.ClassAttributes<HTMLElement> /* React.ClassAttributes<HTMLElement> & React.HTMLAttributes<HTMLElement> */
    var iframe: React.ClassAttributes<HTMLIFrameElement> /* React.ClassAttributes<HTMLIFrameElement> & React.IframeHTMLAttributes<HTMLIFrameElement> */
    var img: React.ClassAttributes<HTMLImageElement> /* React.ClassAttributes<HTMLImageElement> & React.ImgHTMLAttributes<HTMLImageElement> */
    var input: React.ClassAttributes<HTMLInputElement> /* React.ClassAttributes<HTMLInputElement> & React.InputHTMLAttributes<HTMLInputElement> */
    var ins: React.ClassAttributes<HTMLModElement> /* React.ClassAttributes<HTMLModElement> & React.InsHTMLAttributes<HTMLModElement> */
    var kbd: React.ClassAttributes<HTMLElement> /* React.ClassAttributes<HTMLElement> & React.HTMLAttributes<HTMLElement> */
    var keygen: React.ClassAttributes<HTMLElement> /* React.ClassAttributes<HTMLElement> & React.KeygenHTMLAttributes<HTMLElement> */
    var label: React.ClassAttributes<HTMLLabelElement> /* React.ClassAttributes<HTMLLabelElement> & React.LabelHTMLAttributes<HTMLLabelElement> */
    var legend: React.ClassAttributes<HTMLLegendElement> /* React.ClassAttributes<HTMLLegendElement> & React.HTMLAttributes<HTMLLegendElement> */
    var li: React.ClassAttributes<HTMLLIElement> /* React.ClassAttributes<HTMLLIElement> & React.LiHTMLAttributes<HTMLLIElement> */
    var link: React.ClassAttributes<HTMLLinkElement> /* React.ClassAttributes<HTMLLinkElement> & React.LinkHTMLAttributes<HTMLLinkElement> */
    var main: React.ClassAttributes<HTMLElement> /* React.ClassAttributes<HTMLElement> & React.HTMLAttributes<HTMLElement> */
    var map: React.ClassAttributes<HTMLMapElement> /* React.ClassAttributes<HTMLMapElement> & React.MapHTMLAttributes<HTMLMapElement> */
    var mark: React.ClassAttributes<HTMLElement> /* React.ClassAttributes<HTMLElement> & React.HTMLAttributes<HTMLElement> */
    var menu: React.ClassAttributes<HTMLElement> /* React.ClassAttributes<HTMLElement> & React.MenuHTMLAttributes<HTMLElement> */
    var menuitem: React.ClassAttributes<HTMLElement> /* React.ClassAttributes<HTMLElement> & React.HTMLAttributes<HTMLElement> */
    var meta: React.ClassAttributes<HTMLMetaElement> /* React.ClassAttributes<HTMLMetaElement> & React.MetaHTMLAttributes<HTMLMetaElement> */
    var meter: React.ClassAttributes<HTMLElement> /* React.ClassAttributes<HTMLElement> & React.MeterHTMLAttributes<HTMLElement> */
    var nav: React.ClassAttributes<HTMLElement> /* React.ClassAttributes<HTMLElement> & React.HTMLAttributes<HTMLElement> */
    var noindex: React.ClassAttributes<HTMLElement> /* React.ClassAttributes<HTMLElement> & React.HTMLAttributes<HTMLElement> */
    var noscript: React.ClassAttributes<HTMLElement> /* React.ClassAttributes<HTMLElement> & React.HTMLAttributes<HTMLElement> */
    var `object`: React.ClassAttributes<HTMLObjectElement> /* React.ClassAttributes<HTMLObjectElement> & React.ObjectHTMLAttributes<HTMLObjectElement> */
    var ol: React.ClassAttributes<HTMLOListElement> /* React.ClassAttributes<HTMLOListElement> & React.OlHTMLAttributes<HTMLOListElement> */
    var optgroup: React.ClassAttributes<HTMLOptGroupElement> /* React.ClassAttributes<HTMLOptGroupElement> & React.OptgroupHTMLAttributes<HTMLOptGroupElement> */
    var option: React.ClassAttributes<HTMLOptionElement> /* React.ClassAttributes<HTMLOptionElement> & React.OptionHTMLAttributes<HTMLOptionElement> */
    var output: React.ClassAttributes<HTMLElement> /* React.ClassAttributes<HTMLElement> & React.OutputHTMLAttributes<HTMLElement> */
    var p: React.ClassAttributes<HTMLParagraphElement> /* React.ClassAttributes<HTMLParagraphElement> & React.HTMLAttributes<HTMLParagraphElement> */
    var param: React.ClassAttributes<HTMLParamElement> /* React.ClassAttributes<HTMLParamElement> & React.ParamHTMLAttributes<HTMLParamElement> */
    var picture: React.ClassAttributes<HTMLElement> /* React.ClassAttributes<HTMLElement> & React.HTMLAttributes<HTMLElement> */
    var pre: React.ClassAttributes<HTMLPreElement> /* React.ClassAttributes<HTMLPreElement> & React.HTMLAttributes<HTMLPreElement> */
    var progress: React.ClassAttributes<HTMLProgressElement> /* React.ClassAttributes<HTMLProgressElement> & React.ProgressHTMLAttributes<HTMLProgressElement> */
    var q: React.ClassAttributes<HTMLQuoteElement> /* React.ClassAttributes<HTMLQuoteElement> & React.QuoteHTMLAttributes<HTMLQuoteElement> */
    var rp: React.ClassAttributes<HTMLElement> /* React.ClassAttributes<HTMLElement> & React.HTMLAttributes<HTMLElement> */
    var rt: React.ClassAttributes<HTMLElement> /* React.ClassAttributes<HTMLElement> & React.HTMLAttributes<HTMLElement> */
    var ruby: React.ClassAttributes<HTMLElement> /* React.ClassAttributes<HTMLElement> & React.HTMLAttributes<HTMLElement> */
    var s: React.ClassAttributes<HTMLElement> /* React.ClassAttributes<HTMLElement> & React.HTMLAttributes<HTMLElement> */
    var samp: React.ClassAttributes<HTMLElement> /* React.ClassAttributes<HTMLElement> & React.HTMLAttributes<HTMLElement> */
    var script: React.ClassAttributes<HTMLScriptElement> /* React.ClassAttributes<HTMLScriptElement> & React.ScriptHTMLAttributes<HTMLScriptElement> */
    var section: React.ClassAttributes<HTMLElement> /* React.ClassAttributes<HTMLElement> & React.HTMLAttributes<HTMLElement> */
    var select: React.ClassAttributes<HTMLSelectElement> /* React.ClassAttributes<HTMLSelectElement> & React.SelectHTMLAttributes<HTMLSelectElement> */
    var small: React.ClassAttributes<HTMLElement> /* React.ClassAttributes<HTMLElement> & React.HTMLAttributes<HTMLElement> */
    var source: React.ClassAttributes<HTMLSourceElement> /* React.ClassAttributes<HTMLSourceElement> & React.SourceHTMLAttributes<HTMLSourceElement> */
    var span: React.ClassAttributes<HTMLSpanElement> /* React.ClassAttributes<HTMLSpanElement> & React.HTMLAttributes<HTMLSpanElement> */
    var strong: React.ClassAttributes<HTMLElement> /* React.ClassAttributes<HTMLElement> & React.HTMLAttributes<HTMLElement> */
    var style: React.ClassAttributes<HTMLStyleElement> /* React.ClassAttributes<HTMLStyleElement> & React.StyleHTMLAttributes<HTMLStyleElement> */
    var sub: React.ClassAttributes<HTMLElement> /* React.ClassAttributes<HTMLElement> & React.HTMLAttributes<HTMLElement> */
    var summary: React.ClassAttributes<HTMLElement> /* React.ClassAttributes<HTMLElement> & React.HTMLAttributes<HTMLElement> */
    var sup: React.ClassAttributes<HTMLElement> /* React.ClassAttributes<HTMLElement> & React.HTMLAttributes<HTMLElement> */
    var table: React.ClassAttributes<HTMLTableElement> /* React.ClassAttributes<HTMLTableElement> & React.TableHTMLAttributes<HTMLTableElement> */
    var tbody: React.ClassAttributes<HTMLTableSectionElement> /* React.ClassAttributes<HTMLTableSectionElement> & React.HTMLAttributes<HTMLTableSectionElement> */
//    var td: React.ClassAttributes<HTMLTableDataCellElement> /* React.ClassAttributes<HTMLTableDataCellElement> & React.TdHTMLAttributes<HTMLTableDataCellElement> */
    var textarea: React.ClassAttributes<HTMLTextAreaElement> /* React.ClassAttributes<HTMLTextAreaElement> & React.TextareaHTMLAttributes<HTMLTextAreaElement> */
    var tfoot: React.ClassAttributes<HTMLTableSectionElement> /* React.ClassAttributes<HTMLTableSectionElement> & React.HTMLAttributes<HTMLTableSectionElement> */
//    var th: React.ClassAttributes<HTMLTableHeaderCellElement> /* React.ClassAttributes<HTMLTableHeaderCellElement> & React.ThHTMLAttributes<HTMLTableHeaderCellElement> */
    var thead: React.ClassAttributes<HTMLTableSectionElement> /* React.ClassAttributes<HTMLTableSectionElement> & React.HTMLAttributes<HTMLTableSectionElement> */
    var time: React.ClassAttributes<HTMLElement> /* React.ClassAttributes<HTMLElement> & React.TimeHTMLAttributes<HTMLElement> */
    var title: React.ClassAttributes<HTMLTitleElement> /* React.ClassAttributes<HTMLTitleElement> & React.HTMLAttributes<HTMLTitleElement> */
    var tr: React.ClassAttributes<HTMLTableRowElement> /* React.ClassAttributes<HTMLTableRowElement> & React.HTMLAttributes<HTMLTableRowElement> */
    var track: React.ClassAttributes<HTMLTrackElement> /* React.ClassAttributes<HTMLTrackElement> & React.TrackHTMLAttributes<HTMLTrackElement> */
    var u: React.ClassAttributes<HTMLElement> /* React.ClassAttributes<HTMLElement> & React.HTMLAttributes<HTMLElement> */
    var ul: React.ClassAttributes<HTMLUListElement> /* React.ClassAttributes<HTMLUListElement> & React.HTMLAttributes<HTMLUListElement> */
    var video: React.ClassAttributes<HTMLVideoElement> /* React.ClassAttributes<HTMLVideoElement> & React.VideoHTMLAttributes<HTMLVideoElement> */
    var wbr: React.ClassAttributes<HTMLElement> /* React.ClassAttributes<HTMLElement> & React.HTMLAttributes<HTMLElement> */
    var webview: React.ClassAttributes<HTMLElement> /* React.ClassAttributes<HTMLElement> & React.WebViewHTMLAttributes<HTMLElement> */
    var svg: React.SVGProps<SVGSVGElement>
    var animate: React.SVGProps<SVGElement>
    var animateTransform: React.SVGProps<SVGElement>
    var circle: React.SVGProps<SVGCircleElement>
//    var clipPath: React.SVGProps<SVGClipPathElement>
    var defs: React.SVGProps<SVGDefsElement>
    var desc: React.SVGProps<SVGDescElement>
    var ellipse: React.SVGProps<SVGEllipseElement>
//    var feBlend: React.SVGProps<SVGFEBlendElement>
//    var feColorMatrix: React.SVGProps<SVGFEColorMatrixElement>
//    var feComponentTransfer: React.SVGProps<SVGFEComponentTransferElement>
//    var feComposite: React.SVGProps<SVGFECompositeElement>
//    var feConvolveMatrix: React.SVGProps<SVGFEConvolveMatrixElement>
//    var feDiffuseLighting: React.SVGProps<SVGFEDiffuseLightingElement>
//    var feDisplacementMap: React.SVGProps<SVGFEDisplacementMapElement>
//    var feDistantLight: React.SVGProps<SVGFEDistantLightElement>
//    var feFlood: React.SVGProps<SVGFEFloodElement>
//    var feFuncA: React.SVGProps<SVGFEFuncAElement>
//    var feFuncB: React.SVGProps<SVGFEFuncBElement>
//    var feFuncG: React.SVGProps<SVGFEFuncGElement>
//    var feFuncR: React.SVGProps<SVGFEFuncRElement>
//    var feGaussianBlur: React.SVGProps<SVGFEGaussianBlurElement>
//    var feImage: React.SVGProps<SVGFEImageElement>
//    var feMerge: React.SVGProps<SVGFEMergeElement>
//    var feMergeNode: React.SVGProps<SVGFEMergeNodeElement>
//    var feMorphology: React.SVGProps<SVGFEMorphologyElement>
//    var feOffset: React.SVGProps<SVGFEOffsetElement>
//    var fePointLight: React.SVGProps<SVGFEPointLightElement>
//    var feSpecularLighting: React.SVGProps<SVGFESpecularLightingElement>
//    var feSpotLight: React.SVGProps<SVGFESpotLightElement>
//    var feTile: React.SVGProps<SVGFETileElement>
//    var feTurbulence: React.SVGProps<SVGFETurbulenceElement>
//    var filter: React.SVGProps<SVGFilterElement>
    var foreignObject: React.SVGProps<SVGForeignObjectElement>
    var g: React.SVGProps<SVGGElement>
    var image: React.SVGProps<SVGImageElement>
    var line: React.SVGProps<SVGLineElement>
    var linearGradient: React.SVGProps<SVGLinearGradientElement>
    var marker: React.SVGProps<SVGMarkerElement>
//    var mask: React.SVGProps<SVGMaskElement>
    var metadata: React.SVGProps<SVGMetadataElement>
    var path: React.SVGProps<SVGPathElement>
    var pattern: React.SVGProps<SVGPatternElement>
    var polygon: React.SVGProps<SVGPolygonElement>
    var polyline: React.SVGProps<SVGPolylineElement>
    var radialGradient: React.SVGProps<SVGRadialGradientElement>
    var rect: React.SVGProps<SVGRectElement>
    var stop: React.SVGProps<SVGStopElement>
    var switch: React.SVGProps<SVGSwitchElement>
    var symbol: React.SVGProps<SVGSymbolElement>
    var text: React.SVGProps<SVGTextElement>
    var textPath: React.SVGProps<SVGTextPathElement>
    var tspan: React.SVGProps<SVGTSpanElement>
    var use: React.SVGProps<SVGUseElement>
    var view: React.SVGProps<SVGViewElement>
}
