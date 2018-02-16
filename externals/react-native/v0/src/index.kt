// Generated using ts2kt(https://github.com/Kotlin/ts2kt)
// from https://github.com/DefinitelyTyped/DefinitelyTyped/tree/56ce1312c8afcb526adfe93a09c9f1005644a02a/types/react-native/index.d.ts
//
// Original copyrights:
//
// Type definitions for react-native 0.52
// Project: https://github.com/facebook/react-native
// Definitions by: Eloy Durán <https://github.com/alloy>
//                 HuHuanming <https://github.com/huhuanming>
//                 Kyle Roach <https://github.com/iRoachie>
//                 Tim Wang <https://github.com/timwangdev>
//                 Kamal Mahyuddin <https://github.com/kamal>
//                 Naoufal El Yousfi <https://github.com/nelyousfi>
// Definitions: https://github.com/DefinitelyTyped/DefinitelyTyped
// TypeScript Version: 2.3

@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")

package js.externals.react_native

import js.externals.react.ClassicComponentClass
import js.externals.react.Component
import js.externals.react.ComponentClass
import js.externals.react.ReactElement
import js.externals.react.global.JSX.Element
import kotlin.js.*

external interface EventSubscription {
    var eventType: String
    var key: Number
    var subscriber: EventSubscriptionVendor
    fun remove()
}
external interface EventSubscriptionVendor {
    fun constructor(): EventSubscriptionVendor
    fun addSubscription(eventType: String, subscription: EventSubscription): EventSubscription
    fun removeAllSubscriptions(eventType: String? = definedExternally /* null */)
    fun removeSubscription(subscription: Any)
    fun getSubscriptionsForType(eventType: String): Array<EventSubscription>
}
external interface EmitterSubscription : EventSubscription {
    var emitter: EventEmitter
    var listener: () -> Any
    var context: Any
    override fun remove()
}
external interface EventEmitterListener {
    fun addListener(eventType: String, listener: (args: Any) -> Any, context: Any? = definedExternally /* null */): EmitterSubscription
}
external interface EventEmitter : EventEmitterListener {
    fun once(eventType: String, listener: (args: Any) -> Any, context: Any): EmitterSubscription
    fun removeAllListeners(eventType: String? = definedExternally /* null */)
    fun removeCurrentListener()
    fun removeSubscription(subscription: EmitterSubscription)
    fun listeners(eventType: String): Array<EmitterSubscription>
    fun emit(eventType: String, vararg params: Any)
    fun removeListener(eventType: String, listener: (args: Any) -> Any)
}
external interface `T$0` {
    @nativeGetter
    operator fun get(key: String): Component<Any, Any>?
    @nativeSetter
    operator fun set(key: String, value: Component<Any, Any>)
}
external interface NativeMethodsMixinStatic {
    fun measure(callback: (x: Number, y: Number, width: Number, height: Number, pageX: Number, pageY: Number) -> Unit)
    fun measureInWindow(callback: (x: Number, y: Number, width: Number, height: Number) -> Unit)
    fun measureLayout(relativeToNativeNode: Number, onSuccess: (left: Number, top: Number, width: Number, height: Number) -> Unit, onFail: () -> Unit)
    fun setNativeProps(nativeProps: Any)
    fun focus()
    fun blur()
    var refs: `T$0`
}
external interface NativeSyntheticEvent<T> {
    var bubbles: Boolean
    var cancelable: Boolean
    var currentTarget: Number
    var defaultPrevented: Boolean
    var eventPhase: Number
    var isTrusted: Boolean
    var nativeEvent: T
    fun preventDefault()
    fun stopPropagation()
    var target: Number
    var timeStamp: Number
    var type: String
}
external interface NativeTouchEvent {
    var changedTouches: Array<NativeTouchEvent>
    var identifier: String
    var locationX: Number
    var locationY: Number
    var pageX: Number
    var pageY: Number
    var target: String
    var timestamp: Number
    var touches: Array<NativeTouchEvent>
}
external interface GestureResponderEvent : NativeSyntheticEvent<NativeTouchEvent>
external interface PointProperties {
    var x: Number
    var y: Number
}
external interface Insets {
    var top: Number? get() = definedExternally; set(value) = definedExternally
    var left: Number? get() = definedExternally; set(value) = definedExternally
    var bottom: Number? get() = definedExternally; set(value) = definedExternally
    var right: Number? get() = definedExternally; set(value) = definedExternally
}
external interface Touchable {
    var onTouchStart: ((event: GestureResponderEvent) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onTouchMove: ((event: GestureResponderEvent) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onTouchEnd: ((event: GestureResponderEvent) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onTouchCancel: ((event: GestureResponderEvent) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onTouchEndCapture: ((event: GestureResponderEvent) -> Unit)? get() = definedExternally; set(value) = definedExternally
}
external interface AppConfig {
    var appKey: String
    var component: (() -> Any /* ComponentClass<Any> | StatelessComponent<Any> */)? get() = definedExternally; set(value) = definedExternally
    var run: ((appParameters: Any) -> Unit)? get() = definedExternally; set(value) = definedExternally
}
external interface LayoutAnimationTypes {
    var spring: String
    var linear: String
    var easeInEaseOut: String
    var easeIn: String
    var easeOut: String
}
external interface LayoutAnimationProperties {
    var opacity: String
    var scaleXY: String
}
external interface LayoutAnimationAnim {
    var duration: Number? get() = definedExternally; set(value) = definedExternally
    var delay: Number? get() = definedExternally; set(value) = definedExternally
    var springDamping: Number? get() = definedExternally; set(value) = definedExternally
    var initialVelocity: Number? get() = definedExternally; set(value) = definedExternally
    var type: String? get() = definedExternally; set(value) = definedExternally
    var property: String? get() = definedExternally; set(value) = definedExternally
}
external interface LayoutAnimationConfig {
    var duration: Number
    var create: LayoutAnimationAnim? get() = definedExternally; set(value) = definedExternally
    var update: LayoutAnimationAnim? get() = definedExternally; set(value) = definedExternally
    var delete: LayoutAnimationAnim? get() = definedExternally; set(value) = definedExternally
}
external interface `T$1` {
    var easeInEaseOut: LayoutAnimationConfig
    var linear: LayoutAnimationConfig
    var spring: LayoutAnimationConfig
}
external interface LayoutAnimationStatic {
    var configureNext: (config: LayoutAnimationConfig, onAnimationDidEnd: (() -> Unit)? /*= null*/) -> Unit
    var create: (duration: Number, type: String? /*= null*/, creationProp: String? /*= null*/) -> LayoutAnimationConfig
    var Types: LayoutAnimationTypes
    var Properties: LayoutAnimationProperties
    var configChecker: (shapeTypes: Json) -> Any
    var Presets: `T$1`
    var easeInEaseOut: (onAnimationDidEnd: (() -> Unit)? /*= null*/) -> Unit
    var linear: (onAnimationDidEnd: (() -> Unit)? /*= null*/) -> Unit
    var spring: (onAnimationDidEnd: (() -> Unit)? /*= null*/) -> Unit
}
external interface FlexStyle {
    var alignContent: dynamic /* String /* "flex-start" */ | String /* "flex-end" */ | String /* "center" */ | String /* "stretch" */ | String /* "space-between" */ | String /* "space-around" */ */ get() = definedExternally; set(value) = definedExternally
    var alignItems: dynamic /* String /* "flex-start" */ | String /* "flex-end" */ | String /* "center" */ | String /* "stretch" */ | String /* "baseline" */ */ get() = definedExternally; set(value) = definedExternally
    var alignSelf: dynamic /* String /* "flex-start" */ | String /* "flex-end" */ | String /* "center" */ | String /* "stretch" */ | String /* "baseline" */ | String /* "auto" */ */ get() = definedExternally; set(value) = definedExternally
    var aspectRatio: Number? get() = definedExternally; set(value) = definedExternally
    var borderBottomWidth: Number? get() = definedExternally; set(value) = definedExternally
    var borderLeftWidth: Number? get() = definedExternally; set(value) = definedExternally
    var borderRightWidth: Number? get() = definedExternally; set(value) = definedExternally
    var borderTopWidth: Number? get() = definedExternally; set(value) = definedExternally
    var borderWidth: Number? get() = definedExternally; set(value) = definedExternally
    var bottom: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var flex: Number? get() = definedExternally; set(value) = definedExternally
    var flexBasis: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var flexDirection: dynamic /* String /* "row" */ | String /* "column" */ | String /* "row-reverse" */ | String /* "column-reverse" */ */ get() = definedExternally; set(value) = definedExternally
    var flexGrow: Number? get() = definedExternally; set(value) = definedExternally
    var flexShrink: Number? get() = definedExternally; set(value) = definedExternally
    var flexWrap: dynamic /* String /* "wrap" */ | String /* "nowrap" */ */ get() = definedExternally; set(value) = definedExternally
    var height: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var justifyContent: dynamic /* String /* "flex-start" */ | String /* "flex-end" */ | String /* "center" */ | String /* "space-between" */ | String /* "space-around" */ | String /* "space-evenly" */ */ get() = definedExternally; set(value) = definedExternally
    var left: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var margin: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var marginBottom: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var marginHorizontal: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var marginLeft: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var marginRight: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var marginTop: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var marginVertical: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var maxHeight: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var maxWidth: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var minHeight: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var minWidth: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var overflow: dynamic /* String /* "visible" */ | String /* "hidden" */ | String /* "scroll" */ */ get() = definedExternally; set(value) = definedExternally
    var padding: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var paddingBottom: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var paddingHorizontal: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var paddingLeft: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var paddingRight: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var paddingTop: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var paddingVertical: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var position: dynamic /* String /* "absolute" */ | String /* "relative" */ */ get() = definedExternally; set(value) = definedExternally
    var right: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var top: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var width: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var zIndex: Number? get() = definedExternally; set(value) = definedExternally
    var direction: dynamic /* String /* "inherit" */ | String /* "ltr" */ | String /* "rtl" */ */ get() = definedExternally; set(value) = definedExternally
}
external interface `T$2` {
    var width: Number
    var height: Number
}
external interface ShadowPropTypesIOSStatic {
    var shadowColor: String
    var shadowOffset: `T$2`
    var shadowOpacity: Number
    var shadowRadius: Number
}
external interface GeoConfiguration {
    var skipPermissionRequests: Boolean
}
external interface GeoOptions {
    var timeout: Number? get() = definedExternally; set(value) = definedExternally
    var maximumAge: Number? get() = definedExternally; set(value) = definedExternally
    var enableHighAccuracy: Boolean? get() = definedExternally; set(value) = definedExternally
    var distanceFilter: Number? get() = definedExternally; set(value) = definedExternally
    var useSignificantChanges: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface `T$3` {
    var latitude: Number
    var longitude: Number
    var altitude: Number?
    var accuracy: Number
    var altitudeAccuracy: Number?
    var heading: Number?
    var speed: Number?
}
external interface GeolocationReturnType {
    var coords: `T$3`
    var timestamp: Number
}
external interface GeolocationError {
    var code: Number
    var message: String
    var PERMISSION_DENIED: Number
    var POSITION_UNAVAILABLE: Number
    var TIMEOUT: Number
}
external interface PerpectiveTransform {
    var perspective: Number
}
external interface RotateTransform {
    var rotate: String
}
external interface RotateXTransform {
    var rotateX: String
}
external interface RotateYTransform {
    var rotateY: String
}
external interface RotateZTransform {
    var rotateZ: String
}
external interface ScaleTransform {
    var scale: Number
}
external interface ScaleXTransform {
    var scaleX: Number
}
external interface ScaleYTransform {
    var scaleY: Number
}
external interface TranslateXTransform {
    var translateX: Number
}
external interface TranslateYTransform {
    var translateY: Number
}
external interface SkewXTransform {
    var skewX: String
}
external interface SkewYTransform {
    var skewY: String
}
external interface TransformsStyle {
    var transform: Array<dynamic /* PerpectiveTransform | RotateTransform | RotateXTransform | RotateYTransform | RotateZTransform | ScaleTransform | ScaleXTransform | ScaleYTransform | TranslateXTransform | TranslateYTransform | SkewXTransform | SkewYTransform */>? get() = definedExternally; set(value) = definedExternally
    var transformMatrix: Array<Number>? get() = definedExternally; set(value) = definedExternally
    var rotation: Number? get() = definedExternally; set(value) = definedExternally
    var scaleX: Number? get() = definedExternally; set(value) = definedExternally
    var scaleY: Number? get() = definedExternally; set(value) = definedExternally
    var translateX: Number? get() = definedExternally; set(value) = definedExternally
    var translateY: Number? get() = definedExternally; set(value) = definedExternally
}
external interface StyleSheetProperties {
    var hairlineWidth: Number
    fun <T : String> flatten(style: T): T
}
external interface LayoutRectangle {
    var x: Number
    var y: Number
    var width: Number
    var height: Number
}
external interface `T$4` {
    var layout: LayoutRectangle
}
external interface LayoutChangeEvent {
    var nativeEvent: `T$4`
}
external interface TextStyleIOS : ViewStyle {
    var letterSpacing: Number? get() = definedExternally; set(value) = definedExternally
    var textDecorationColor: String? get() = definedExternally; set(value) = definedExternally
    var textDecorationStyle: dynamic /* String /* "solid" */ | String /* "double" */ | String /* "dotted" */ | String /* "dashed" */ */ get() = definedExternally; set(value) = definedExternally
    var writingDirection: dynamic /* String /* "auto" */ | String /* "ltr" */ | String /* "rtl" */ */ get() = definedExternally; set(value) = definedExternally
}
external interface TextStyleAndroid : ViewStyle {
    var textAlignVertical: dynamic /* String /* "center" */ | String /* "auto" */ | String /* "top" */ | String /* "bottom" */ */ get() = definedExternally; set(value) = definedExternally
    var includeFontPadding: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface TextStyle : TextStyleIOS, TextStyleAndroid, ViewStyle {
    var color: String? get() = definedExternally; set(value) = definedExternally
    var fontFamily: String? get() = definedExternally; set(value) = definedExternally
    var fontSize: Number? get() = definedExternally; set(value) = definedExternally
    var fontStyle: dynamic /* String /* "normal" */ | String /* "italic" */ */ get() = definedExternally; set(value) = definedExternally
    var fontWeight: dynamic /* String /* "normal" */ | String /* "bold" */ | String /* "100" */ | String /* "200" */ | String /* "300" */ | String /* "400" */ | String /* "500" */ | String /* "600" */ | String /* "700" */ | String /* "800" */ | String /* "900" */ */ get() = definedExternally; set(value) = definedExternally
    override var letterSpacing: Number? get() = definedExternally; set(value) = definedExternally
    var lineHeight: Number? get() = definedExternally; set(value) = definedExternally
    var textAlign: dynamic /* String /* "center" */ | String /* "auto" */ | String /* "left" */ | String /* "right" */ | String /* "justify" */ */ get() = definedExternally; set(value) = definedExternally
    var textDecorationLine: dynamic /* String /* "none" */ | String /* "underline" */ | String /* "line-through" */ | String /* "underline line-through" */ */ get() = definedExternally; set(value) = definedExternally
    override var textDecorationStyle: dynamic /* String /* "solid" */ | String /* "double" */ | String /* "dotted" */ | String /* "dashed" */ */ get() = definedExternally; set(value) = definedExternally
    override var textDecorationColor: String? get() = definedExternally; set(value) = definedExternally
    var textShadowColor: String? get() = definedExternally; set(value) = definedExternally
    var textShadowOffset: `T$2`? get() = definedExternally; set(value) = definedExternally
    var textShadowRadius: Number? get() = definedExternally; set(value) = definedExternally
    override var testID: String? get() = definedExternally; set(value) = definedExternally
}
external interface TextPropertiesIOS {
    var allowFontScaling: Boolean? get() = definedExternally; set(value) = definedExternally
    var adjustsFontSizeToFit: Boolean? get() = definedExternally; set(value) = definedExternally
    var minimumFontScale: Number? get() = definedExternally; set(value) = definedExternally
    var suppressHighlighting: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface TextPropertiesAndroid {
    var selectable: Boolean? get() = definedExternally; set(value) = definedExternally
    var selectionColor: String? get() = definedExternally; set(value) = definedExternally
    var textBreakStrategy: dynamic /* String /* "simple" */ | String /* "highQuality" */ | String /* "balanced" */ */ get() = definedExternally; set(value) = definedExternally
}
external interface `T$5`<T> {
    var __registeredStyleBrand: T
}
external interface TextProperties : TextPropertiesIOS, TextPropertiesAndroid, AccessibilityProperties {
    var ellipsizeMode: dynamic /* String /* "head" */ | String /* "middle" */ | String /* "tail" */ | String /* "clip" */ */ get() = definedExternally; set(value) = definedExternally
    var lineBreakMode: dynamic /* String /* "head" */ | String /* "middle" */ | String /* "tail" */ | String /* "clip" */ */ get() = definedExternally; set(value) = definedExternally
    var numberOfLines: Number? get() = definedExternally; set(value) = definedExternally
    var onLayout: ((event: LayoutChangeEvent) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onPress: ((event: GestureResponderEvent) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onLongPress: ((event: GestureResponderEvent) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var style: dynamic /* Boolean | TextStyle | Number /* Number & `T$5` */ | RecursiveArray<dynamic /* Boolean | TextStyle | Number /* Number & `T$5` */ */> */ get() = definedExternally; set(value) = definedExternally
    var testID: String? get() = definedExternally; set(value) = definedExternally
}
external interface TextStatic : NativeMethodsMixinStatic, ClassicComponentClass<TextProperties>
external interface DocumentSelectionState : EventEmitter {
    fun update(anchor: Number, focus: Number)
    fun constrainLength(maxLength: Number)
    fun focus()
    fun blur()
    fun hasFocus(): Boolean
    fun isCollapsed(): Boolean
    fun isBackward(): Boolean
    fun getAnchorOffset(): Number
    fun getFocusOffset(): Number
    fun getStartOffset(): Number
    fun getEndOffset(): Number
    fun overlaps(start: Number, end: Number): Boolean
}
external interface TextInputIOSProperties {
    var clearButtonMode: dynamic /* String /* "never" */ | String /* "while-editing" */ | String /* "unless-editing" */ | String /* "always" */ */ get() = definedExternally; set(value) = definedExternally
    var clearTextOnFocus: Boolean? get() = definedExternally; set(value) = definedExternally
    var dataDetectorTypes: dynamic /* String /* "none" */ | String /* "phoneNumber" */ | String /* "link" */ | String /* "address" */ | String /* "calendarEvent" */ | String /* "all" */ | Array<dynamic /* String /* "none" */ | String /* "phoneNumber" */ | String /* "link" */ | String /* "address" */ | String /* "calendarEvent" */ | String /* "all" */ */> */ get() = definedExternally; set(value) = definedExternally
    var enablesReturnKeyAutomatically: Boolean? get() = definedExternally; set(value) = definedExternally
    var keyboardAppearance: dynamic /* String /* "default" */ | String /* "light" */ | String /* "dark" */ */ get() = definedExternally; set(value) = definedExternally
    var onKeyPress: ((key: String) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var selectionState: DocumentSelectionState? get() = definedExternally; set(value) = definedExternally
    var spellCheck: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface TextInputAndroidProperties {
    var disableFullscreenUI: Boolean? get() = definedExternally; set(value) = definedExternally
    var inlineImageLeft: String? get() = definedExternally; set(value) = definedExternally
    var inlineImagePadding: Number? get() = definedExternally; set(value) = definedExternally
    var numberOfLines: Number? get() = definedExternally; set(value) = definedExternally
    var returnKeyLabel: String? get() = definedExternally; set(value) = definedExternally
    var textBreakStrategy: dynamic /* String /* "simple" */ | String /* "highQuality" */ | String /* "balanced" */ */ get() = definedExternally; set(value) = definedExternally
    var underlineColorAndroid: String? get() = definedExternally; set(value) = definedExternally
}
external interface `T$6` {
    var text: String
    var contentSize: `T$2`
    var target: Number
    var eventCount: Number
}
external interface `T$7` {
    var nativeEvent: `T$6`
}
external interface `T$8` {
    var contentSize: `T$2`
}
external interface `T$9` {
    var nativeEvent: `T$8`
}
external interface `T$10` {
    var text: String
}
external interface `T$11` {
    var nativeEvent: `T$10`
}
external interface `T$12` {
    var start: Number
    var end: Number
}
external interface `T$13` {
    var selection: `T$12`
    var target: Number
}
external interface `T$14` {
    var nativeEvent: `T$13`
}
external interface `T$15` {
    var start: Number
    var end: Number? get() = definedExternally; set(value) = definedExternally
}
external interface TextInputProperties : ViewProperties, TextInputIOSProperties, TextInputAndroidProperties, AccessibilityProperties {
    var autoCapitalize: dynamic /* String /* "none" */ | String /* "sentences" */ | String /* "words" */ | String /* "characters" */ */ get() = definedExternally; set(value) = definedExternally
    var autoCorrect: Boolean? get() = definedExternally; set(value) = definedExternally
    var autoFocus: Boolean? get() = definedExternally; set(value) = definedExternally
    var blurOnSubmit: Boolean? get() = definedExternally; set(value) = definedExternally
    var defaultValue: String? get() = definedExternally; set(value) = definedExternally
    var editable: Boolean? get() = definedExternally; set(value) = definedExternally
    var keyboardType: dynamic /* String /* "default" */ | String /* "email-address" */ | String /* "numeric" */ | String /* "phone-pad" */ | String /* "ascii-capable" */ | String /* "numbers-and-punctuation" */ | String /* "url" */ | String /* "number-pad" */ | String /* "name-phone-pad" */ | String /* "decimal-pad" */ | String /* "twitter" */ | String /* "web-search" */ | String /* "visible-password" */ */ get() = definedExternally; set(value) = definedExternally
    var maxLength: Number? get() = definedExternally; set(value) = definedExternally
    var multiline: Boolean? get() = definedExternally; set(value) = definedExternally
    var onBlur: (() -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onChange: ((event: `T$7`) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onChangeText: ((text: String) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onContentSizeChange: ((event: `T$9`) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onEndEditing: ((event: `T$11`) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onFocus: (() -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onSelectionChange: ((event: `T$14`) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onSubmitEditing: ((event: `T$11`) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var placeholder: String? get() = definedExternally; set(value) = definedExternally
    var placeholderTextColor: String? get() = definedExternally; set(value) = definedExternally
    var returnKeyType: dynamic /* String /* "none" */ | String /* "default" */ | String /* "done" */ | String /* "go" */ | String /* "next" */ | String /* "search" */ | String /* "send" */ | String /* "previous" */ | String /* "google" */ | String /* "join" */ | String /* "route" */ | String /* "yahoo" */ | String /* "emergency-call" */ */ get() = definedExternally; set(value) = definedExternally
    var secureTextEntry: Boolean? get() = definedExternally; set(value) = definedExternally
    var selectTextOnFocus: Boolean? get() = definedExternally; set(value) = definedExternally
    var selection: `T$15`? get() = definedExternally; set(value) = definedExternally
    var selectionColor: String? get() = definedExternally; set(value) = definedExternally
    override var style: dynamic /* Boolean | TextStyle | Number /* Number & `T$5` */ | RecursiveArray<dynamic /* Boolean | TextStyle | Number /* Number & `T$5` */ */> */ get() = definedExternally; set(value) = definedExternally
    override var testID: String? get() = definedExternally; set(value) = definedExternally
    var value: String? get() = definedExternally; set(value) = definedExternally
}
external interface TextInputState {
    fun currentlyFocusedField(): Number
    fun focusTextInput(textFieldID: Number? = definedExternally /* null */)
    fun blurTextInput(textFieldID: Number? = definedExternally /* null */)
}
external interface TextInputStatic : NativeMethodsMixinStatic, TimerMixin, ComponentClass<TextInputProperties> {
    var State: TextInputState
    var isFocused: () -> Boolean
    var clear: () -> Unit
}
external interface ToolbarAndroidAction {
    var title: String
    var icon: ImageURISource? get() = definedExternally; set(value) = definedExternally
    var show: dynamic /* String /* "never" */ | String /* "always" */ | String /* "ifRoom" */ */ get() = definedExternally; set(value) = definedExternally
    var showWithText: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface ToolbarAndroidProperties : ViewProperties {
    var actions: Array<ToolbarAndroidAction>? get() = definedExternally; set(value) = definedExternally
    var contentInsetEnd: Number? get() = definedExternally; set(value) = definedExternally
    var contentInsetStart: Number? get() = definedExternally; set(value) = definedExternally
    var logo: ImageURISource? get() = definedExternally; set(value) = definedExternally
    var navIcon: ImageURISource? get() = definedExternally; set(value) = definedExternally
    var onActionSelected: ((position: Number) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onIconClicked: (() -> Unit)? get() = definedExternally; set(value) = definedExternally
    var overflowIcon: ImageURISource? get() = definedExternally; set(value) = definedExternally
    var rtl: Boolean? get() = definedExternally; set(value) = definedExternally
    var subtitle: String? get() = definedExternally; set(value) = definedExternally
    var subtitleColor: String? get() = definedExternally; set(value) = definedExternally
    override var testID: String? get() = definedExternally; set(value) = definedExternally
    var title: String? get() = definedExternally; set(value) = definedExternally
    var titleColor: String? get() = definedExternally; set(value) = definedExternally
}
external interface ToolbarAndroidStatic : NativeMethodsMixinStatic, ComponentClass<ToolbarAndroidProperties>
external interface GestureResponderHandlers {
    var onStartShouldSetResponder: ((event: GestureResponderEvent) -> Boolean)? get() = definedExternally; set(value) = definedExternally
    var onMoveShouldSetResponder: ((event: GestureResponderEvent) -> Boolean)? get() = definedExternally; set(value) = definedExternally
    var onResponderEnd: ((event: GestureResponderEvent) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onResponderGrant: ((event: GestureResponderEvent) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onResponderReject: ((event: GestureResponderEvent) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onResponderMove: ((event: GestureResponderEvent) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onResponderRelease: ((event: GestureResponderEvent) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onResponderStart: ((event: GestureResponderEvent) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onResponderTerminationRequest: ((event: GestureResponderEvent) -> Boolean)? get() = definedExternally; set(value) = definedExternally
    var onResponderTerminate: ((event: GestureResponderEvent) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onStartShouldSetResponderCapture: ((event: GestureResponderEvent) -> Boolean)? get() = definedExternally; set(value) = definedExternally
    var onMoveShouldSetResponderCapture: (() -> Unit)? get() = definedExternally; set(value) = definedExternally
}
external interface ViewStyle : FlexStyle, TransformsStyle {
    var backfaceVisibility: dynamic /* String /* "visible" */ | String /* "hidden" */ */ get() = definedExternally; set(value) = definedExternally
    var backgroundColor: String? get() = definedExternally; set(value) = definedExternally
    var borderBottomColor: String? get() = definedExternally; set(value) = definedExternally
    var borderBottomLeftRadius: Number? get() = definedExternally; set(value) = definedExternally
    var borderBottomRightRadius: Number? get() = definedExternally; set(value) = definedExternally
    override var borderBottomWidth: Number? get() = definedExternally; set(value) = definedExternally
    var borderColor: String? get() = definedExternally; set(value) = definedExternally
    var borderLeftColor: String? get() = definedExternally; set(value) = definedExternally
    var borderRadius: Number? get() = definedExternally; set(value) = definedExternally
    var borderRightColor: String? get() = definedExternally; set(value) = definedExternally
    override var borderRightWidth: Number? get() = definedExternally; set(value) = definedExternally
    var borderStyle: dynamic /* String /* "solid" */ | String /* "dotted" */ | String /* "dashed" */ */ get() = definedExternally; set(value) = definedExternally
    var borderTopColor: String? get() = definedExternally; set(value) = definedExternally
    var borderTopLeftRadius: Number? get() = definedExternally; set(value) = definedExternally
    var borderTopRightRadius: Number? get() = definedExternally; set(value) = definedExternally
    override var borderTopWidth: Number? get() = definedExternally; set(value) = definedExternally
    var display: dynamic /* String /* "none" */ | String /* "flex" */ */ get() = definedExternally; set(value) = definedExternally
    var opacity: Number? get() = definedExternally; set(value) = definedExternally
    override var overflow: dynamic /* String /* "visible" */ | String /* "hidden" */ */ get() = definedExternally; set(value) = definedExternally
    var shadowColor: String? get() = definedExternally; set(value) = definedExternally
    var shadowOffset: `T$2`? get() = definedExternally; set(value) = definedExternally
    var shadowOpacity: Number? get() = definedExternally; set(value) = definedExternally
    var shadowRadius: Number? get() = definedExternally; set(value) = definedExternally
    var elevation: Number? get() = definedExternally; set(value) = definedExternally
    var testID: String? get() = definedExternally; set(value) = definedExternally
}
external interface ViewPropertiesIOS {
    var accessibilityViewIsModal: Boolean? get() = definedExternally; set(value) = definedExternally
    var accessibilityActions: Array<String>? get() = definedExternally; set(value) = definedExternally
    var onAccessibilityAction: (() -> Unit)? get() = definedExternally; set(value) = definedExternally
    var shouldRasterizeIOS: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface ViewPropertiesAndroid {
    var collapsable: Boolean? get() = definedExternally; set(value) = definedExternally
    var needsOffscreenAlphaCompositing: Boolean? get() = definedExternally; set(value) = definedExternally
    var renderToHardwareTextureAndroid: Boolean? get() = definedExternally; set(value) = definedExternally
}
//external interface RecursiveArray<T> : Array<dynamic /* RecursiveArray<T> | T */>
external interface AccessibilityProperties : AccessibilityPropertiesAndroid, AccessibilityPropertiesIOS {
    var accessible: Boolean? get() = definedExternally; set(value) = definedExternally
    var accessibilityLabel: String? get() = definedExternally; set(value) = definedExternally
}
external interface AccessibilityPropertiesAndroid {
    var accessibilityComponentType: dynamic /* String /* "none" */ | String /* "button" */ | String /* "radiobutton_checked" */ | String /* "radiobutton_unchecked" */ */ get() = definedExternally; set(value) = definedExternally
    var accessibilityLiveRegion: dynamic /* String /* "none" */ | String /* "polite" */ | String /* "assertive" */ */ get() = definedExternally; set(value) = definedExternally
    var importantForAccessibility: dynamic /* String /* "auto" */ | String /* "yes" */ | String /* "no" */ | String /* "no-hide-descendants" */ */ get() = definedExternally; set(value) = definedExternally
}
external interface AccessibilityPropertiesIOS {
    var accessibilityTraits: dynamic /* String /* "none" */ | String /* "link" */ | String /* "search" */ | String /* "button" */ | String /* "header" */ | String /* "image" */ | String /* "selected" */ | String /* "plays" */ | String /* "key" */ | String /* "text" */ | String /* "summary" */ | String /* "disabled" */ | String /* "frequentUpdates" */ | String /* "startsMedia" */ | String /* "adjustable" */ | String /* "allowsDirectInteraction" */ | String /* "pageTurn" */ | Array<dynamic /* String /* "none" */ | String /* "link" */ | String /* "search" */ | String /* "button" */ | String /* "header" */ | String /* "image" */ | String /* "selected" */ | String /* "plays" */ | String /* "key" */ | String /* "text" */ | String /* "summary" */ | String /* "disabled" */ | String /* "frequentUpdates" */ | String /* "startsMedia" */ | String /* "adjustable" */ | String /* "allowsDirectInteraction" */ | String /* "pageTurn" */ */> */ get() = definedExternally; set(value) = definedExternally
    var onAcccessibilityTap: (() -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onMagicTap: (() -> Unit)? get() = definedExternally; set(value) = definedExternally
}
external interface ViewProperties : ViewPropertiesAndroid, ViewPropertiesIOS, GestureResponderHandlers, Touchable, AccessibilityProperties {
    var hitSlop: Insets? get() = definedExternally; set(value) = definedExternally
    var onLayout: ((event: LayoutChangeEvent) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var pointerEvents: dynamic /* String /* "auto" */ | String /* "none" */ | String /* "box-none" */ | String /* "box-only" */ */ get() = definedExternally; set(value) = definedExternally
    var removeClippedSubviews: Boolean? get() = definedExternally; set(value) = definedExternally
    var style: dynamic /* Boolean | ViewStyle | Number /* Number & `T$5` */ | RecursiveArray<dynamic /* Boolean | ViewStyle | Number /* Number & `T$5` */ */> */ get() = definedExternally; set(value) = definedExternally
    var testID: String? get() = definedExternally; set(value) = definedExternally
}
external interface ViewStatic : NativeMethodsMixinStatic, ClassicComponentClass<ViewProperties> {
    var forceTouchAvailable: Boolean
}
external interface ViewPagerAndroidOnPageScrollEventData {
    var position: Number
    var offset: Number
}
external interface ViewPagerAndroidOnPageSelectedEventData {
    var position: Number
}
external interface ViewPagerAndroidProperties : ViewProperties {
    var initialPage: Number? get() = definedExternally; set(value) = definedExternally
    var scrollEnabled: Boolean? get() = definedExternally; set(value) = definedExternally
    var onPageScroll: ((event: NativeSyntheticEvent<ViewPagerAndroidOnPageScrollEventData>) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onPageSelected: ((event: NativeSyntheticEvent<ViewPagerAndroidOnPageSelectedEventData>) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onPageScrollStateChanged: ((state: dynamic /* String /* "Idle" */ | String /* "Dragging" */ | String /* "Settling" */ */) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var keyboardDismissMode: dynamic /* String /* "none" */ | String /* "on-drag" */ */ get() = definedExternally; set(value) = definedExternally
    var pageMargin: Number? get() = definedExternally; set(value) = definedExternally
}
external interface ViewPagerAndroidStatic : NativeMethodsMixinStatic, ComponentClass<ViewPagerAndroidProperties> {
    fun setPage(selectedPage: Number)
    fun setPageWithoutAnimation(selectedPage: Number)
}
external interface KeyboardAvoidingViewStatic : TimerMixin, ClassicComponentClass<KeyboardAvoidingViewProps>
external interface KeyboardAvoidingViewProps : ViewProperties {
    var behavior: dynamic /* String /* "height" */ | String /* "position" */ | String /* "padding" */ */ get() = definedExternally; set(value) = definedExternally
    var contentContainerStyle: dynamic /* Boolean | ViewStyle | Number /* Number & `T$5` */ | RecursiveArray<dynamic /* Boolean | ViewStyle | Number /* Number & `T$5` */ */> */ get() = definedExternally; set(value) = definedExternally
    var keyboardVerticalOffset: Number? get() = definedExternally; set(value) = definedExternally
}
external interface NavState {
    var url: String? get() = definedExternally; set(value) = definedExternally
    var title: String? get() = definedExternally; set(value) = definedExternally
    var loading: Boolean? get() = definedExternally; set(value) = definedExternally
    var canGoBack: Boolean? get() = definedExternally; set(value) = definedExternally
    var canGoForward: Boolean? get() = definedExternally; set(value) = definedExternally
    @nativeGetter
    operator fun get(key: String): Any?
    @nativeSetter
    operator fun set(key: String, value: Any)
}
external interface WebViewMessageEventData {
    var data: String
}
external interface WebViewPropertiesAndroid {
    var javaScriptEnabled: Boolean? get() = definedExternally; set(value) = definedExternally
    var domStorageEnabled: Boolean? get() = definedExternally; set(value) = definedExternally
    var userAgent: String? get() = definedExternally; set(value) = definedExternally
    var mixedContentMode: dynamic /* String /* "never" */ | String /* "always" */ | String /* "compatibility" */ */ get() = definedExternally; set(value) = definedExternally
}
external interface WebViewIOSLoadRequestEvent {
    var target: Number
    var canGoBack: Boolean
    var lockIdentifier: Number
    var loading: Boolean
    var title: String
    var canGoForward: Boolean
    var navigationType: dynamic /* String /* "other" */ | String /* "click" */ */
    var url: String
}
external interface WebViewPropertiesIOS {
    var allowsInlineMediaPlayback: Boolean? get() = definedExternally; set(value) = definedExternally
    var bounces: Boolean? get() = definedExternally; set(value) = definedExternally
    var dataDetectorTypes: dynamic /* String /* "none" */ | String /* "phoneNumber" */ | String /* "link" */ | String /* "address" */ | String /* "calendarEvent" */ | String /* "all" */ | Array<dynamic /* String /* "none" */ | String /* "phoneNumber" */ | String /* "link" */ | String /* "address" */ | String /* "calendarEvent" */ | String /* "all" */ */> */ get() = definedExternally; set(value) = definedExternally
    var decelerationRate: dynamic /* Number | String /* "normal" */ | String /* "fast" */ */ get() = definedExternally; set(value) = definedExternally
    var onShouldStartLoadWithRequest: ((event: WebViewIOSLoadRequestEvent) -> Boolean)? get() = definedExternally; set(value) = definedExternally
    var scrollEnabled: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface WebViewUriSource {
    var uri: String? get() = definedExternally; set(value) = definedExternally
    var method: String? get() = definedExternally; set(value) = definedExternally
    var headers: Any? get() = definedExternally; set(value) = definedExternally
    var body: String? get() = definedExternally; set(value) = definedExternally
}
external interface WebViewHtmlSource {
    var html: String
    var baseUrl: String? get() = definedExternally; set(value) = definedExternally
}
external interface WebViewProperties : ViewProperties, WebViewPropertiesAndroid, WebViewPropertiesIOS {
    var automaticallyAdjustContentInsets: Boolean? get() = definedExternally; set(value) = definedExternally
    var contentInset: Insets? get() = definedExternally; set(value) = definedExternally
    var html: String? get() = definedExternally; set(value) = definedExternally
    var injectedJavaScript: String? get() = definedExternally; set(value) = definedExternally
    var onError: ((event: NavState) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onLoad: ((event: NavState) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onLoadEnd: ((event: NavState) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onLoadStart: ((event: NavState) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onMessage: ((event: NativeSyntheticEvent<WebViewMessageEventData>) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onNavigationStateChange: ((event: NavState) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var renderError: (() -> ReactElement<ViewProperties>)? get() = definedExternally; set(value) = definedExternally
    var renderLoading: (() -> ReactElement<ViewProperties>)? get() = definedExternally; set(value) = definedExternally
    var startInLoadingState: Boolean? get() = definedExternally; set(value) = definedExternally
    override var style: dynamic /* Boolean | ViewStyle | Number /* Number & `T$5` */ | RecursiveArray<dynamic /* Boolean | ViewStyle | Number /* Number & `T$5` */ */> */ get() = definedExternally; set(value) = definedExternally
    var url: String? get() = definedExternally; set(value) = definedExternally
    var source: dynamic /* Number | WebViewUriSource | WebViewHtmlSource */ get() = definedExternally; set(value) = definedExternally
    var mediaPlaybackRequiresUserAction: Boolean? get() = definedExternally; set(value) = definedExternally
    var scalesPageToFit: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface WebViewStatic : ClassicComponentClass<WebViewProperties> {
    var goBack: () -> Unit
    var goForward: () -> Unit
    var postMessage: (message: String) -> Unit
    var reload: () -> Unit
    fun stopLoading()
    var getWebViewHandle: () -> Any
}
external interface NativeSegmentedControlIOSChangeEvent {
    var value: String
    var selectedSegmentIndex: Number
    var target: Number
}
external interface SegmentedControlIOSProperties : ViewProperties {
    var enabled: Boolean? get() = definedExternally; set(value) = definedExternally
    var momentary: Boolean? get() = definedExternally; set(value) = definedExternally
    var onChange: ((event: NativeSyntheticEvent<NativeSegmentedControlIOSChangeEvent>) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onValueChange: ((value: String) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var selectedIndex: Number? get() = definedExternally; set(value) = definedExternally
    var tintColor: String? get() = definedExternally; set(value) = definedExternally
    var values: Array<String>? get() = definedExternally; set(value) = definedExternally
}
external interface SafeAreaViewStatic : NativeMethodsMixinStatic, ClassicComponentClass<ViewProperties>
external interface SegmentedControlIOSStatic : NativeMethodsMixinStatic, ClassicComponentClass<SegmentedControlIOSProperties>
external interface NavigatorIOSProperties {
    var barTintColor: String? get() = definedExternally; set(value) = definedExternally
    var initialRoute: Route
    var itemWrapperStyle: dynamic /* Boolean | ViewStyle | Number /* Number & `T$5` */ | RecursiveArray<dynamic /* Boolean | ViewStyle | Number /* Number & `T$5` */ */> */ get() = definedExternally; set(value) = definedExternally
    var interactivePopGestureEnabled: Boolean? get() = definedExternally; set(value) = definedExternally
    var navigationBarHidden: Boolean? get() = definedExternally; set(value) = definedExternally
    var shadowHidden: Boolean? get() = definedExternally; set(value) = definedExternally
    var tintColor: String? get() = definedExternally; set(value) = definedExternally
    var titleTextColor: String? get() = definedExternally; set(value) = definedExternally
    var translucent: Boolean? get() = definedExternally; set(value) = definedExternally
    var style: dynamic /* Boolean | ViewStyle | Number /* Number & `T$5` */ | RecursiveArray<dynamic /* Boolean | ViewStyle | Number /* Number & `T$5` */ */> */ get() = definedExternally; set(value) = definedExternally
}
external interface NavigationIOS {
    var push: (route: Route) -> Unit
    var pop: () -> Unit
    var popN: (n: Number) -> Unit
    var replace: (route: Route) -> Unit
    var replacePrevious: (route: Route) -> Unit
    var replacePreviousAndPop: (route: Route) -> Unit
    var resetTo: (route: Route) -> Unit
    fun popToRoute(route: Route)
    fun popToTop()
}
external interface NavigatorIOSStatic : NavigationIOS, ComponentClass<NavigatorIOSProperties>
external interface ActivityIndicatorProperties : ViewProperties {
    var animating: Boolean? get() = definedExternally; set(value) = definedExternally
    var color: String? get() = definedExternally; set(value) = definedExternally
    var hidesWhenStopped: Boolean? get() = definedExternally; set(value) = definedExternally
    var size: dynamic /* Number | String /* "small" */ | String /* "large" */ */ get() = definedExternally; set(value) = definedExternally
    override var style: dynamic /* Boolean | ViewStyle | Number /* Number & `T$5` */ | RecursiveArray<dynamic /* Boolean | ViewStyle | Number /* Number & `T$5` */ */> */ get() = definedExternally; set(value) = definedExternally
}
external interface ActivityIndicatorStatic : NativeMethodsMixinStatic, ClassicComponentClass<ActivityIndicatorProperties>
external interface `T$16` {
    var x: Number
    var y: Number
    var width: Number
    var height: Number
}
external interface `T$17` {
    var layout: `T$16`
}
external interface `T$18` {
    var nativeEvent: `T$17`
}
external interface ActivityIndicatorIOSProperties : ViewProperties {
    var animating: Boolean? get() = definedExternally; set(value) = definedExternally
    var color: String? get() = definedExternally; set(value) = definedExternally
    var hidesWhenStopped: Boolean? get() = definedExternally; set(value) = definedExternally
//    override var onLayout: ((event: `T$18`) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var size: dynamic /* String /* "small" */ | String /* "large" */ */ get() = definedExternally; set(value) = definedExternally
    override var style: dynamic /* Boolean | ViewStyle | Number /* Number & `T$5` */ | RecursiveArray<dynamic /* Boolean | ViewStyle | Number /* Number & `T$5` */ */> */ get() = definedExternally; set(value) = definedExternally
}
external interface ActivityIndicatorIOSStatic : ComponentClass<ActivityIndicatorIOSProperties>
external interface DatePickerIOSProperties : ViewProperties {
    var date: Date
    var locale: String? get() = definedExternally; set(value) = definedExternally
    var maximumDate: Date? get() = definedExternally; set(value) = definedExternally
    var minimumDate: Date? get() = definedExternally; set(value) = definedExternally
    var minuteInterval: dynamic /* Number /* 1 */ | Number /* 2 */ | Number /* 3 */ | Number /* 4 */ | Number /* 5 */ | Number /* 6 */ | Number /* 10 */ | Number /* 12 */ | Number /* 15 */ | Number /* 20 */ | Number /* 30 */ */ get() = definedExternally; set(value) = definedExternally
    var mode: dynamic /* String /* "date" */ | String /* "time" */ | String /* "datetime" */ */ get() = definedExternally; set(value) = definedExternally
    var onDateChange: (newDate: Date) -> Unit
    var timeZoneOffsetInMinutes: Number? get() = definedExternally; set(value) = definedExternally
}
external interface DatePickerIOSStatic : NativeMethodsMixinStatic, ComponentClass<DatePickerIOSProperties>
external interface DrawerSlideEvent : NativeSyntheticEvent<NativeTouchEvent>
external interface DrawerLayoutAndroidProperties : ViewProperties {
    var drawerBackgroundColor: String? get() = definedExternally; set(value) = definedExternally
    var drawerLockMode: dynamic /* String /* "unlocked" */ | String /* "locked-closed" */ | String /* "locked-open" */ */ get() = definedExternally; set(value) = definedExternally
    var drawerPosition: Number? get() = definedExternally; set(value) = definedExternally
    var drawerWidth: Number? get() = definedExternally; set(value) = definedExternally
    var keyboardDismissMode: dynamic /* String /* "none" */ | String /* "on-drag" */ */ get() = definedExternally; set(value) = definedExternally
    var onDrawerClose: (() -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onDrawerOpen: (() -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onDrawerSlide: ((event: DrawerSlideEvent) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onDrawerStateChanged: ((event: dynamic /* String /* "Idle" */ | String /* "Dragging" */ | String /* "Settling" */ */) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var renderNavigationView: () -> Element
    var statusBarBackgroundColor: String? get() = definedExternally; set(value) = definedExternally
}
external interface DrawerPosition {
    var Left: Number
    var Right: Number
}
external interface DrawerLayoutAndroidStatic : NativeMethodsMixinStatic, ClassicComponentClass<DrawerLayoutAndroidProperties> {
    var positions: DrawerPosition
    fun openDrawer()
    fun closeDrawer()
}
external interface PickerIOSItemProperties {
    var value: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var label: String? get() = definedExternally; set(value) = definedExternally
}
external interface PickerIOSItemStatic : ComponentClass<PickerIOSItemProperties>
external interface PickerItemProperties {
    var testID: String? get() = definedExternally; set(value) = definedExternally
    var color: String? get() = definedExternally; set(value) = definedExternally
    var label: String
    var value: Any? get() = definedExternally; set(value) = definedExternally
}
external interface PickerItem : ComponentClass<PickerItemProperties>
external interface PickerPropertiesIOS : ViewProperties {
    var itemStyle: dynamic /* Boolean | ViewStyle | Number /* Number & `T$5` */ | RecursiveArray<dynamic /* Boolean | ViewStyle | Number /* Number & `T$5` */ */> */ get() = definedExternally; set(value) = definedExternally
}
external interface PickerPropertiesAndroid : ViewProperties {
    var enabled: Boolean? get() = definedExternally; set(value) = definedExternally
    var mode: dynamic /* String /* "dialog" */ | String /* "dropdown" */ */ get() = definedExternally; set(value) = definedExternally
    var prompt: String? get() = definedExternally; set(value) = definedExternally
}
external interface PickerProperties : PickerPropertiesIOS, PickerPropertiesAndroid {
    var onValueChange: ((itemValue: Any, itemPosition: Number) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var selectedValue: Any? get() = definedExternally; set(value) = definedExternally
    override var style: dynamic /* Boolean | ViewStyle | Number /* Number & `T$5` */ | RecursiveArray<dynamic /* Boolean | ViewStyle | Number /* Number & `T$5` */ */> */ get() = definedExternally; set(value) = definedExternally
    var testId: String? get() = definedExternally; set(value) = definedExternally
}
external interface PickerStatic : ComponentClass<PickerProperties> {
    var MODE_DIALOG: String
    var MODE_DROPDOWN: String
    var Item: PickerItem
}
external interface PickerIOSProperties : ViewProperties {
    var itemStyle: dynamic /* Boolean | TextStyle | Number /* Number & `T$5` */ | RecursiveArray<dynamic /* Boolean | TextStyle | Number /* Number & `T$5` */ */> */ get() = definedExternally; set(value) = definedExternally
    var onValueChange: ((value: dynamic /* String | Number */) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var selectedValue: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
}
external interface PickerIOSStatic : NativeMethodsMixinStatic, ClassicComponentClass<PickerIOSProperties> {
    var Item: PickerIOSItemStatic
}
external interface ProgressBarAndroidProperties : ViewProperties {
    var styleAttr: dynamic /* String /* "Horizontal" */ | String /* "Normal" */ | String /* "Small" */ | String /* "Large" */ | String /* "Inverse" */ | String /* "SmallInverse" */ | String /* "LargeInverse" */ */ get() = definedExternally; set(value) = definedExternally
    var indeterminate: Boolean? get() = definedExternally; set(value) = definedExternally
    var progress: Number? get() = definedExternally; set(value) = definedExternally
    var color: String? get() = definedExternally; set(value) = definedExternally
    override var testID: String? get() = definedExternally; set(value) = definedExternally
}
external interface ProgressBarAndroidStatic : NativeMethodsMixinStatic, ClassicComponentClass<ProgressBarAndroidProperties>
external interface ProgressViewIOSProperties : ViewProperties {
    var progressViewStyle: dynamic /* String /* "default" */ | String /* "bar" */ */ get() = definedExternally; set(value) = definedExternally
    var progress: Number? get() = definedExternally; set(value) = definedExternally
    var progressTintColor: String? get() = definedExternally; set(value) = definedExternally
    var trackTintColor: String? get() = definedExternally; set(value) = definedExternally
    var progressImage: dynamic /* ImageURISource | Array<ImageURISource> */ get() = definedExternally; set(value) = definedExternally
    var trackImage: dynamic /* ImageURISource | Array<ImageURISource> */ get() = definedExternally; set(value) = definedExternally
}
external interface ProgressViewIOSStatic : NativeMethodsMixinStatic, ClassicComponentClass<ProgressViewIOSProperties>
external interface RefreshControlPropertiesIOS : ViewProperties {
    var tintColor: String? get() = definedExternally; set(value) = definedExternally
    var title: String? get() = definedExternally; set(value) = definedExternally
    var titleColor: String? get() = definedExternally; set(value) = definedExternally
}
external interface RefreshControlPropertiesAndroid : ViewProperties {
    var colors: Array<String>? get() = definedExternally; set(value) = definedExternally
    var enabled: Boolean? get() = definedExternally; set(value) = definedExternally
    var progressBackgroundColor: String? get() = definedExternally; set(value) = definedExternally
    var size: Number? get() = definedExternally; set(value) = definedExternally
    var progressViewOffset: Number? get() = definedExternally; set(value) = definedExternally
}
external interface RefreshControlProperties : RefreshControlPropertiesIOS, RefreshControlPropertiesAndroid {
    var onRefresh: (() -> Unit)? get() = definedExternally; set(value) = definedExternally
    var refreshing: Boolean
}
external interface RefreshControlStatic : NativeMethodsMixinStatic, ClassicComponentClass<RefreshControlProperties> {
    var SIZE: Any
}
external interface RecyclerViewBackedScrollViewProperties : ScrollViewProperties
external interface `T$19` {
    var x: Number? get() = definedExternally; set(value) = definedExternally
    var y: Number? get() = definedExternally; set(value) = definedExternally
    var animated: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface RecyclerViewBackedScrollViewStatic : ScrollResponderMixin, ClassicComponentClass<RecyclerViewBackedScrollViewProperties> {
    fun scrollTo(y: Number? = definedExternally /* null */, x: Number? = definedExternally /* null */, animated: Boolean? = definedExternally /* null */)
    fun scrollTo(y: `T$19`? = definedExternally /* null */, x: Number? = definedExternally /* null */, animated: Boolean? = definedExternally /* null */)
    fun getScrollResponder(): Element
    fun scrollTo()
}
external interface SliderPropertiesAndroid : ViewProperties {
    var thumbTintColor: String? get() = definedExternally; set(value) = definedExternally
}
external interface SliderPropertiesIOS : ViewProperties {
    var maximumTrackImage: ImageURISource? get() = definedExternally; set(value) = definedExternally
    var minimumTrackImage: ImageURISource? get() = definedExternally; set(value) = definedExternally
    var thumbImage: ImageURISource? get() = definedExternally; set(value) = definedExternally
    var trackImage: ImageURISource? get() = definedExternally; set(value) = definedExternally
}
external interface SliderProperties : SliderPropertiesIOS, SliderPropertiesAndroid {
    var disabled: Boolean? get() = definedExternally; set(value) = definedExternally
    var maximumTrackTintColor: String? get() = definedExternally; set(value) = definedExternally
    var maximumValue: Number? get() = definedExternally; set(value) = definedExternally
    var minimumTrackTintColor: String? get() = definedExternally; set(value) = definedExternally
    var minimumValue: Number? get() = definedExternally; set(value) = definedExternally
    var onSlidingComplete: ((value: Number) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onValueChange: ((value: Number) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var step: Number? get() = definedExternally; set(value) = definedExternally
    override var style: dynamic /* Boolean | ViewStyle | Number /* Number & `T$5` */ | RecursiveArray<dynamic /* Boolean | ViewStyle | Number /* Number & `T$5` */ */> */ get() = definedExternally; set(value) = definedExternally
    override var testID: String? get() = definedExternally; set(value) = definedExternally
    var value: Number? get() = definedExternally; set(value) = definedExternally
}
external interface SliderStatic : NativeMethodsMixinStatic, ClassicComponentClass<SliderProperties>
external interface SwitchIOSProperties : ViewProperties {
    var disabled: Boolean? get() = definedExternally; set(value) = definedExternally
    var onTintColor: String? get() = definedExternally; set(value) = definedExternally
    var onValueChange: ((value: Boolean) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var thumbTintColor: String? get() = definedExternally; set(value) = definedExternally
    var tintColor: String? get() = definedExternally; set(value) = definedExternally
    var value: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface SwitchIOSStatic : ComponentClass<SwitchIOSProperties>
external interface ImageResizeModeStatic {
    var contain: dynamic /* String /* "center" */ | String /* "stretch" */ | String /* "contain" */ | String /* "cover" */ | String /* "repeat" */ */
    var cover: dynamic /* String /* "center" */ | String /* "stretch" */ | String /* "contain" */ | String /* "cover" */ | String /* "repeat" */ */
    var stretch: dynamic /* String /* "center" */ | String /* "stretch" */ | String /* "contain" */ | String /* "cover" */ | String /* "repeat" */ */
    var center: dynamic /* String /* "center" */ | String /* "stretch" */ | String /* "contain" */ | String /* "cover" */ | String /* "repeat" */ */
    var repeat: dynamic /* String /* "center" */ | String /* "stretch" */ | String /* "contain" */ | String /* "cover" */ | String /* "repeat" */ */
}
external interface ShadowStyleIOS {
    var shadowColor: String? get() = definedExternally; set(value) = definedExternally
    var shadowOffset: `T$2`? get() = definedExternally; set(value) = definedExternally
    var shadowOpacity: Number? get() = definedExternally; set(value) = definedExternally
    var shadowRadius: Number? get() = definedExternally; set(value) = definedExternally
}
external interface ImageStyle : FlexStyle, TransformsStyle, ShadowStyleIOS {
    var resizeMode: dynamic /* String /* "center" */ | String /* "stretch" */ | String /* "contain" */ | String /* "cover" */ | String /* "repeat" */ */ get() = definedExternally; set(value) = definedExternally
    var backfaceVisibility: dynamic /* String /* "visible" */ | String /* "hidden" */ */ get() = definedExternally; set(value) = definedExternally
    var borderBottomLeftRadius: Number? get() = definedExternally; set(value) = definedExternally
    var borderBottomRightRadius: Number? get() = definedExternally; set(value) = definedExternally
    var backgroundColor: String? get() = definedExternally; set(value) = definedExternally
    var borderColor: String? get() = definedExternally; set(value) = definedExternally
    override var borderWidth: Number? get() = definedExternally; set(value) = definedExternally
    var borderRadius: Number? get() = definedExternally; set(value) = definedExternally
    var borderTopLeftRadius: Number? get() = definedExternally; set(value) = definedExternally
    var borderTopRightRadius: Number? get() = definedExternally; set(value) = definedExternally
    override var overflow: dynamic /* String /* "visible" */ | String /* "hidden" */ */ get() = definedExternally; set(value) = definedExternally
    var overlayColor: String? get() = definedExternally; set(value) = definedExternally
    var tintColor: String? get() = definedExternally; set(value) = definedExternally
    var opacity: Number? get() = definedExternally; set(value) = definedExternally
}
external interface `T$20` {
    @nativeGetter
    operator fun get(key: String): String?
    @nativeSetter
    operator fun set(key: String, value: String)
}
external interface ImageURISource {
    var uri: String? get() = definedExternally; set(value) = definedExternally
    var bundle: String? get() = definedExternally; set(value) = definedExternally
    var method: String? get() = definedExternally; set(value) = definedExternally
    var headers: `T$20`? get() = definedExternally; set(value) = definedExternally
    var cache: dynamic /* String /* "default" */ | String /* "reload" */ | String /* "force-cache" */ | String /* "only-if-cached" */ */ get() = definedExternally; set(value) = definedExternally
    var body: String? get() = definedExternally; set(value) = definedExternally
    var width: Number? get() = definedExternally; set(value) = definedExternally
    var height: Number? get() = definedExternally; set(value) = definedExternally
    var scale: Number? get() = definedExternally; set(value) = definedExternally
}
external interface `T$21` {
    var loaded: Number
    var total: Number
}
external interface `T$22` {
    var nativeEvent: `T$21`
}
external interface ImagePropertiesIOS {
    var blurRadius: Number? get() = definedExternally; set(value) = definedExternally
    var capInsets: Insets? get() = definedExternally; set(value) = definedExternally
    var defaultSource: dynamic /* Number | ImageURISource */ get() = definedExternally; set(value) = definedExternally
    var onProgress: ((event: `T$22`) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onPartialLoad: (() -> Unit)? get() = definedExternally; set(value) = definedExternally
}
external interface ImagePropertiesAndroid {
    var resizeMethod: dynamic /* String /* "auto" */ | String /* "resize" */ | String /* "scale" */ */ get() = definedExternally; set(value) = definedExternally
    var fadeDuration: Number? get() = definedExternally; set(value) = definedExternally
}
external interface `T$23` {
    var nativeEvent: Any
}
external interface ImageProperties : ImagePropertiesIOS, ImagePropertiesAndroid, AccessibilityProperties {
    var onLayout: ((event: LayoutChangeEvent) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onError: ((error: `T$23`) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onLoad: (() -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onLoadEnd: (() -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onLoadStart: (() -> Unit)? get() = definedExternally; set(value) = definedExternally
    var progressiveRenderingEnabled: Boolean? get() = definedExternally; set(value) = definedExternally
    var borderRadius: Number? get() = definedExternally; set(value) = definedExternally
    var borderTopLeftRadius: Number? get() = definedExternally; set(value) = definedExternally
    var borderTopRightRadius: Number? get() = definedExternally; set(value) = definedExternally
    var borderBottomLeftRadius: Number? get() = definedExternally; set(value) = definedExternally
    var borderBottomRightRadius: Number? get() = definedExternally; set(value) = definedExternally
    var resizeMode: dynamic /* String /* "center" */ | String /* "stretch" */ | String /* "contain" */ | String /* "cover" */ | String /* "repeat" */ */ get() = definedExternally; set(value) = definedExternally
    override var resizeMethod: dynamic /* String /* "auto" */ | String /* "resize" */ | String /* "scale" */ */ get() = definedExternally; set(value) = definedExternally
    var source: dynamic /* Number | ImageURISource | Array<ImageURISource> */
    var loadingIndicatorSource: ImageURISource? get() = definedExternally; set(value) = definedExternally
    var style: dynamic /* Boolean | ImageStyle | Number /* Number & `T$5` */ | RecursiveArray<dynamic /* Boolean | ImageStyle | Number /* Number & `T$5` */ */> */ get() = definedExternally; set(value) = definedExternally
    var testID: String? get() = definedExternally; set(value) = definedExternally
}
external interface ImageStatic : NativeMethodsMixinStatic, ComponentClass<ImageProperties> {
    var resizeMode: dynamic /* String /* "center" */ | String /* "stretch" */ | String /* "contain" */ | String /* "cover" */ | String /* "repeat" */ */
    fun getSize(uri: String, success: (width: Number, height: Number) -> Unit, failure: (error: Any) -> Unit): Any
    fun prefetch(url: String): Any
    val abortPrefetch: ((requestId: Number) -> Unit)? get() = definedExternally
    val queryCache: ((urls: Array<String>) -> Promise<Map<String, dynamic /* String /* "memory" */ | String /* "disk" */ */>>)? get() = definedExternally
}
external interface ImageBackgroundProperties : ImageProperties {
    override var style: dynamic /* Boolean | ViewStyle | Number /* Number & `T$5` */ | RecursiveArray<dynamic /* Boolean | ViewStyle | Number /* Number & `T$5` */ */> */ get() = definedExternally; set(value) = definedExternally
    var imageStyle: dynamic /* Boolean | ImageStyle | Number /* Number & `T$5` */ | RecursiveArray<dynamic /* Boolean | ImageStyle | Number /* Number & `T$5` */ */> */ get() = definedExternally; set(value) = definedExternally
}
external interface ImageBackgroundStatic : NativeMethodsMixinStatic, ComponentClass<ImageBackgroundProperties> {
    var resizeMode: dynamic /* String /* "center" */ | String /* "stretch" */ | String /* "contain" */ | String /* "cover" */ | String /* "repeat" */ */
    fun getSize(uri: String, success: (width: Number, height: Number) -> Unit, failure: (error: Any) -> Unit): Any
    fun prefetch(url: String): Any
    val abortPrefetch: ((requestId: Number) -> Unit)? get() = definedExternally
    val queryCache: ((urls: Array<String>) -> Promise<Map<String, dynamic /* String /* "memory" */ | String /* "disk" */ */>>)? get() = definedExternally
}
external interface ViewToken {
    var item: Any
    var key: String
    var index: Number?
    var isViewable: Boolean
    var section: Any? get() = definedExternally; set(value) = definedExternally
}
external interface ViewabilityConfig {
    var minimumViewTime: Number? get() = definedExternally; set(value) = definedExternally
    var viewAreaCoveragePercentThreshold: Number? get() = definedExternally; set(value) = definedExternally
    var itemVisiblePercentThreshold: Number? get() = definedExternally; set(value) = definedExternally
    var waitForInteraction: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface `T$24` {
    var highlight: () -> Unit
    var unhighlight: () -> Unit
    var updateProps: (select: dynamic /* String /* "leading" */ | String /* "trailing" */ */, newProps: Any) -> Unit
}
external interface ListRenderItemInfo<ItemT> {
    var item: ItemT
    var index: Number
    var separators: `T$24`
}
external interface `T$25` {
    var length: Number
    var offset: Number
    var index: Number
}
external interface `T$26` {
    var distanceFromEnd: Number
}
external interface `T$27` {
    var viewableItems: Array<ViewToken>
    var changed: Array<ViewToken>
}
external interface FlatListProperties<ItemT> : VirtualizedListProperties<ItemT> {
    var ItemSeparatorComponent: dynamic /* ComponentType<Any> | () -> ReactElement<Any> | Nothing? */ get() = definedExternally; set(value) = definedExternally
    override var ListEmptyComponent: dynamic /* ComponentClass<Any> | ReactElement<Any> | () -> ReactElement<Any> | Nothing? */ get() = definedExternally; set(value) = definedExternally
    override var ListFooterComponent: dynamic /* ComponentClass<Any> | ReactElement<Any> | () -> ReactElement<Any> | Nothing? */ get() = definedExternally; set(value) = definedExternally
    override var ListHeaderComponent: dynamic /* ComponentClass<Any> | ReactElement<Any> | () -> ReactElement<Any> | Nothing? */ get() = definedExternally; set(value) = definedExternally
    var columnWrapperStyle: dynamic /* Boolean | ViewStyle | Number /* Number & `T$5` */ | RecursiveArray<dynamic /* Boolean | ViewStyle | Number /* Number & `T$5` */ */> */ get() = definedExternally; set(value) = definedExternally
    override var keyboardShouldPersistTaps: dynamic /* Boolean | String /* "never" */ | String /* "always" */ | String /* "handled" */ */ get() = definedExternally; set(value) = definedExternally
//    override var data: Array<ItemT>?
    override var extraData: Any? get() = definedExternally; set(value) = definedExternally
//    override var getItemLayout: ((data: Array<ItemT>?, index: Number) -> `T$25`)? get() = definedExternally; set(value) = definedExternally
    override var horizontal: Boolean? get() = definedExternally; set(value) = definedExternally
    override var initialNumToRender: Number? get() = definedExternally; set(value) = definedExternally
    override var initialScrollIndex: Number? get() = definedExternally; set(value) = definedExternally
    override var keyExtractor: ((item: ItemT, index: Number) -> String)? get() = definedExternally; set(value) = definedExternally
    var legacyImplementation: Boolean? get() = definedExternally; set(value) = definedExternally
    var numColumns: Number? get() = definedExternally; set(value) = definedExternally
    override var onEndReached: ((info: `T$26`) -> Unit)? get() = definedExternally; set(value) = definedExternally
    override var onEndReachedThreshold: Number? get() = definedExternally; set(value) = definedExternally
    override var onRefresh: (() -> Unit)? get() = definedExternally; set(value) = definedExternally
    override var onViewableItemsChanged: ((info: `T$27`) -> Unit)? get() = definedExternally; set(value) = definedExternally
    override var refreshing: Boolean? get() = definedExternally; set(value) = definedExternally
    override var renderItem: (info: ListRenderItemInfo<ItemT>) -> ReactElement<Any>?
//    override var viewabilityConfig: Any? get() = definedExternally; set(value) = definedExternally
    override var removeClippedSubviews: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface `T$28` {
    var contentLength: Number
    var totalRows: Number
    var renderedRows: Number
    var visibleRows: Number
}
external interface `T$29` {
    var animated: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface `T$30` {
    var animated: Boolean? get() = definedExternally; set(value) = definedExternally
    var index: Number
    var viewPosition: Number? get() = definedExternally; set(value) = definedExternally
}
external interface `T$31`<ItemT> {
    var animated: Boolean? get() = definedExternally; set(value) = definedExternally
    var item: ItemT
    var viewPosition: Number? get() = definedExternally; set(value) = definedExternally
}
external interface `T$32` {
    var animated: Boolean? get() = definedExternally; set(value) = definedExternally
    var offset: Number
}
external interface FlatListStatic<ItemT> : ComponentClass<FlatListProperties<ItemT>> {
    var getMetrics: () -> `T$28`
    var scrollToEnd: (params: `T$29`? /*= null*/) -> Unit
    var scrollToIndex: (params: `T$30`) -> Unit
    var scrollToItem: (params: `T$31`<ItemT>) -> Unit
    var scrollToOffset: (params: `T$32`) -> Unit
    var recordInteraction: () -> Unit
}
external interface SectionBase<ItemT> {
    var data: Array<ItemT>
    var key: String? get() = definedExternally; set(value) = definedExternally
    var renderItem: ((info: ListRenderItemInfo<ItemT>) -> ReactElement<Any>?)? get() = definedExternally; set(value) = definedExternally
    var ItemSeparatorComponent: dynamic /* ComponentClass<Any> | () -> ReactElement<Any> | Nothing? */ get() = definedExternally; set(value) = definedExternally
    var keyExtractor: ((item: ItemT, index: Number) -> String)? get() = definedExternally; set(value) = definedExternally
}
external interface SectionListData<ItemT> : SectionBase<ItemT> {
    @nativeGetter
    operator fun get(key: String): Any?
    @nativeSetter
    operator fun set(key: String, value: Any)
}
external interface `T$33`<ItemT> {
    var section: SectionListData<ItemT>
}
external interface SectionListProperties<ItemT> : VirtualizedListProperties<ItemT> {
    var ItemSeparatorComponent: Any? /* ComponentClass<Any> | StatelessComponent<Any> */ get() = definedExternally; set(value) = definedExternally
    override var ListEmptyComponent: dynamic /* ComponentClass<Any> | ReactElement<Any> | () -> ReactElement<Any> | Nothing? */ get() = definedExternally; set(value) = definedExternally
    override var ListFooterComponent: dynamic /* ComponentClass<Any> | () -> ReactElement<Any> | Nothing? */ get() = definedExternally; set(value) = definedExternally
    override var ListHeaderComponent: dynamic /* ComponentClass<Any> | () -> ReactElement<Any> | Nothing? */ get() = definedExternally; set(value) = definedExternally
    var SectionSeparatorComponent: dynamic /* ComponentClass<Any> | () -> ReactElement<Any> | Nothing? */ get() = definedExternally; set(value) = definedExternally
    override var extraData: Any? get() = definedExternally; set(value) = definedExternally
//    override var getItemLayout: ((data: Array<SectionListData<ItemT>>?, index: Number) -> `T$25`)? get() = definedExternally; set(value) = definedExternally
    override var initialNumToRender: Number? get() = definedExternally; set(value) = definedExternally
    override var keyExtractor: ((item: ItemT, index: Number) -> String)? get() = definedExternally; set(value) = definedExternally
    override var onRefresh: (() -> Unit)? get() = definedExternally; set(value) = definedExternally
    override var refreshing: Boolean? get() = definedExternally; set(value) = definedExternally
    override var renderItem: (info: ListRenderItemInfo<ItemT>) -> ReactElement<Any>?
    var renderSectionHeader: ((info: `T$33`<ItemT>) -> ReactElement<Any>?)? get() = definedExternally; set(value) = definedExternally
    var renderSectionFooter: ((info: `T$33`<ItemT>) -> ReactElement<Any>?)? get() = definedExternally; set(value) = definedExternally
    var sections: Array<SectionListData<ItemT>>
    override var renderScrollComponent: ((props: ScrollViewProperties) -> ReactElement<ScrollViewProperties>)? get() = definedExternally; set(value) = definedExternally
    override var removeClippedSubviews: Boolean? get() = definedExternally; set(value) = definedExternally
    var stickySectionHeadersEnabled: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface SectionListStatic<SectionT> : ComponentClass<SectionListProperties<SectionT>>
external interface VirtualizedListProperties<ItemT> : ScrollViewProperties {
    var ListEmptyComponent: dynamic /* ComponentClass<Any> | ReactElement<Any> | () -> ReactElement<Any> | Nothing? */ get() = definedExternally; set(value) = definedExternally
    var ListFooterComponent: dynamic /* ComponentClass<Any> | ReactElement<Any> | () -> ReactElement<Any> | Nothing? */ get() = definedExternally; set(value) = definedExternally
    var ListHeaderComponent: dynamic /* ComponentClass<Any> | ReactElement<Any> | () -> ReactElement<Any> | Nothing? */ get() = definedExternally; set(value) = definedExternally
    var data: Any? get() = definedExternally; set(value) = definedExternally
    var debug: Boolean? get() = definedExternally; set(value) = definedExternally
    var disableVirtualization: Boolean? get() = definedExternally; set(value) = definedExternally
    var extraData: Any? get() = definedExternally; set(value) = definedExternally
    var getItem: ((data: Any, index: Number) -> ItemT)? get() = definedExternally; set(value) = definedExternally
    var getItemCount: ((data: Any) -> Number)? get() = definedExternally; set(value) = definedExternally
    var getItemLayout: ((data: Any, index: Number) -> `T$25`)? get() = definedExternally; set(value) = definedExternally
    override var horizontal: Boolean? get() = definedExternally; set(value) = definedExternally
    var initialNumToRender: Number? get() = definedExternally; set(value) = definedExternally
    var initialScrollIndex: Number? get() = definedExternally; set(value) = definedExternally
    var inverted: Boolean? get() = definedExternally; set(value) = definedExternally
    var keyExtractor: ((item: ItemT, index: Number) -> String)? get() = definedExternally; set(value) = definedExternally
    var maxToRenderPerBatch: Number? get() = definedExternally; set(value) = definedExternally
    var onEndReached: ((info: `T$26`) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onEndReachedThreshold: Number? get() = definedExternally; set(value) = definedExternally
    override var onLayout: ((event: LayoutChangeEvent) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onRefresh: (() -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onViewableItemsChanged: ((info: `T$27`) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var progressViewOffset: Number? get() = definedExternally; set(value) = definedExternally
    var refreshing: Boolean? get() = definedExternally; set(value) = definedExternally
    override var removeClippedSubviews: Boolean? get() = definedExternally; set(value) = definedExternally
    var renderItem: (info: ListRenderItemInfo<ItemT>) -> ReactElement<Any>?
    var renderScrollComponent: ((props: ScrollViewProperties) -> ReactElement<ScrollViewProperties>)? get() = definedExternally; set(value) = definedExternally
    var updateCellsBatchingPeriod: Number? get() = definedExternally; set(value) = definedExternally
    var viewabilityConfig: ViewabilityConfig? get() = definedExternally; set(value) = definedExternally
    var windowSize: Number? get() = definedExternally; set(value) = definedExternally
}
external interface `T$34` {
    @nativeGetter
    operator fun get(rowID: String): Boolean?
    @nativeSetter
    operator fun set(rowID: String, value: Boolean)
}
external interface `T$35` {
    @nativeGetter
    operator fun get(sectionId: String): `T$34`?
    @nativeSetter
    operator fun set(sectionId: String, value: `T$34`)
}
external interface ListViewProperties : ScrollViewProperties {
    var dataSource: ListViewDataSource
    var enableEmptySections: Boolean? get() = definedExternally; set(value) = definedExternally
    var initialListSize: Number? get() = definedExternally; set(value) = definedExternally
    var onChangeVisibleRows: ((visibleRows: Array<`T$35`>, changedRows: Array<`T$35`>) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onEndReached: (() -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onEndReachedThreshold: Number? get() = definedExternally; set(value) = definedExternally
    var pageSize: Number? get() = definedExternally; set(value) = definedExternally
    override var removeClippedSubviews: Boolean? get() = definedExternally; set(value) = definedExternally
    var renderFooter: (() -> ReactElement<Any>)? get() = definedExternally; set(value) = definedExternally
    var renderHeader: (() -> ReactElement<Any>)? get() = definedExternally; set(value) = definedExternally
    var renderRow: (rowData: Any, sectionID: dynamic /* String | Number */, rowID: dynamic /* String | Number */, highlightRow: Boolean? /*= null*/) -> ReactElement<Any>
    var renderScrollComponent: ((props: ScrollViewProperties) -> ReactElement<ScrollViewProperties>)? get() = definedExternally; set(value) = definedExternally
    var renderSectionHeader: ((sectionData: Any, sectionId: dynamic /* String | Number */) -> ReactElement<Any>)? get() = definedExternally; set(value) = definedExternally
    var renderSeparator: ((sectionID: dynamic /* String | Number */, rowID: dynamic /* String | Number */, adjacentRowHighlighted: Boolean? /*= null*/) -> ReactElement<Any>)? get() = definedExternally; set(value) = definedExternally
    var scrollRenderAheadDistance: Number? get() = definedExternally; set(value) = definedExternally
    override var stickyHeaderIndices: Array<Number>? get() = definedExternally; set(value) = definedExternally
    var stickySectionHeadersEnabled: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface TimerMixin {
    var setTimeout: Any?
    var clearTimeout: Any?
    var setInterval: Any?
    var clearInterval: Any?
    var setImmediate: Any?
    var clearImmediate: Any?
    var requestAnimationFrame: Any?
    var cancelAnimationFrame: Any?
}
external interface ListViewStatic : ScrollResponderMixin, TimerMixin, ComponentClass<ListViewProperties> {
    var DataSource: ListViewDataSource
    var getMetrics: () -> `T$28`
    var getScrollResponder: () -> Any
    var scrollTo: (y: dynamic /* Number | `T$19` */ /*= null*/, x: Number? /*= null*/, animated: Boolean? /*= null*/) -> Unit
}
external interface MapViewAnnotation {
    var latitude: Number
    var longitude: Number
    var animateDrop: Boolean? get() = definedExternally; set(value) = definedExternally
    var draggable: Boolean? get() = definedExternally; set(value) = definedExternally
    var onDragStateChange: (() -> Any)? get() = definedExternally; set(value) = definedExternally
    var onFocus: (() -> Any)? get() = definedExternally; set(value) = definedExternally
    var onBlur: (() -> Any)? get() = definedExternally; set(value) = definedExternally
    var title: String? get() = definedExternally; set(value) = definedExternally
    var subtitle: String? get() = definedExternally; set(value) = definedExternally
    var leftCalloutView: ReactElement<Any>? get() = definedExternally; set(value) = definedExternally
    var rightCalloutView: ReactElement<Any>? get() = definedExternally; set(value) = definedExternally
    var detailCalloutView: ReactElement<Any>? get() = definedExternally; set(value) = definedExternally
    var tintColor: String? get() = definedExternally; set(value) = definedExternally
    var image: ImageURISource? get() = definedExternally; set(value) = definedExternally
    var view: ReactElement<Any>? get() = definedExternally; set(value) = definedExternally
    var hasLeftCallout: Boolean? get() = definedExternally; set(value) = definedExternally
    var hasRightCallout: Boolean? get() = definedExternally; set(value) = definedExternally
    var onLeftCalloutPress: (() -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onRightCalloutPress: (() -> Unit)? get() = definedExternally; set(value) = definedExternally
    var id: String? get() = definedExternally; set(value) = definedExternally
}
external interface MapViewRegion {
    var latitude: Number
    var longitude: Number
    var latitudeDelta: Number? get() = definedExternally; set(value) = definedExternally
    var longitudeDelta: Number? get() = definedExternally; set(value) = definedExternally
}
external interface `T$36` {
    var latitude: Number
    var longitude: Number
}
external interface MapViewOverlay {
    var coordinates: Array<`T$36`>
    var lineWidth: Number? get() = definedExternally; set(value) = definedExternally
    var strokeColor: String? get() = definedExternally; set(value) = definedExternally
    var fillColor: String? get() = definedExternally; set(value) = definedExternally
    var id: String? get() = definedExternally; set(value) = definedExternally
}
external interface MapViewProperties : ViewProperties {
    var showsPointsOfInterest: Boolean? get() = definedExternally; set(value) = definedExternally
    var annotations: Array<MapViewAnnotation>? get() = definedExternally; set(value) = definedExternally
    var followUserLocation: Boolean? get() = definedExternally; set(value) = definedExternally
    var legalLabelInsets: Insets? get() = definedExternally; set(value) = definedExternally
    var mapType: dynamic /* String /* "standard" */ | String /* "satellite" */ | String /* "hybrid" */ */ get() = definedExternally; set(value) = definedExternally
    var maxDelta: Number? get() = definedExternally; set(value) = definedExternally
    var minDelta: Number? get() = definedExternally; set(value) = definedExternally
    var overlays: Array<MapViewOverlay>? get() = definedExternally; set(value) = definedExternally
    var showsCompass: Boolean? get() = definedExternally; set(value) = definedExternally
    var onAnnotationPress: (() -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onRegionChange: ((region: MapViewRegion) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onRegionChangeComplete: ((region: MapViewRegion) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var pitchEnabled: Boolean? get() = definedExternally; set(value) = definedExternally
    var region: MapViewRegion? get() = definedExternally; set(value) = definedExternally
    var rotateEnabled: Boolean? get() = definedExternally; set(value) = definedExternally
    var scrollEnabled: Boolean? get() = definedExternally; set(value) = definedExternally
    var showsUserLocation: Boolean? get() = definedExternally; set(value) = definedExternally
    override var style: dynamic /* Boolean | ViewStyle | Number /* Number & `T$5` */ | RecursiveArray<dynamic /* Boolean | ViewStyle | Number /* Number & `T$5` */ */> */ get() = definedExternally; set(value) = definedExternally
    var zoomEnabled: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface `T$37` {
    var RED: String
    var GREEN: String
    var PURPLE: String
}
external interface MapViewStatic : NativeMethodsMixinStatic, ComponentClass<MapViewProperties> {
    var PinColors: `T$37`
}
external interface MaskedViewProperties : ViewProperties {
    var maskElement: ReactElement<Any>
}
external interface MaskedViewStatic : NativeMethodsMixinStatic, ComponentClass<MaskedViewProperties>
external interface ModalProperties {
    var animated: Boolean? get() = definedExternally; set(value) = definedExternally
    var animationType: dynamic /* String /* "none" */ | String /* "slide" */ | String /* "fade" */ */ get() = definedExternally; set(value) = definedExternally
    var transparent: Boolean? get() = definedExternally; set(value) = definedExternally
    var visible: Boolean? get() = definedExternally; set(value) = definedExternally
    var onRequestClose: (() -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onShow: ((event: NativeSyntheticEvent<Any>) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var supportedOrientations: Array<dynamic /* String /* "portrait" */ | String /* "portrait-upside-down" */ | String /* "landscape" */ | String /* "landscape-left" */ | String /* "landscape-right" */ */>? get() = definedExternally; set(value) = definedExternally
    var onOrientationChange: ((event: NativeSyntheticEvent<Any>? /*= null*/) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onDismiss: (() -> Unit)? get() = definedExternally; set(value) = definedExternally
}
external interface ModalStatic : ComponentClass<ModalProperties>
external interface TouchableMixin {
    fun touchableHandleActivePressIn(e: GestureResponderEvent)
    fun touchableHandleActivePressOut(e: GestureResponderEvent)
    fun touchableHandlePress(e: GestureResponderEvent)
    fun touchableHandleLongPress(e: GestureResponderEvent)
    fun touchableGetPressRectOffset(): Insets
    fun touchableGetHighlightDelayMS(): Number
    fun touchableGetLongPressDelayMS(): Number
    fun touchableGetPressOutDelayMS(): Number
    fun touchableGetHitSlop(): Insets
}
external interface TouchableWithoutFeedbackProperties : AccessibilityProperties {
    var delayLongPress: Number? get() = definedExternally; set(value) = definedExternally
    var delayPressIn: Number? get() = definedExternally; set(value) = definedExternally
    var delayPressOut: Number? get() = definedExternally; set(value) = definedExternally
    var disabled: Boolean? get() = definedExternally; set(value) = definedExternally
    var hitSlop: Insets? get() = definedExternally; set(value) = definedExternally
    var onLayout: ((event: LayoutChangeEvent) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onLongPress: ((event: GestureResponderEvent) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onPress: ((event: GestureResponderEvent) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onPressIn: ((event: GestureResponderEvent) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onPressOut: ((event: GestureResponderEvent) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var style: dynamic /* Boolean | ViewStyle | Number /* Number & `T$5` */ | RecursiveArray<dynamic /* Boolean | ViewStyle | Number /* Number & `T$5` */ */> */ get() = definedExternally; set(value) = definedExternally
    var pressRetentionOffset: Insets? get() = definedExternally; set(value) = definedExternally
    var testID: String? get() = definedExternally; set(value) = definedExternally
}
external interface TouchableWithoutFeedbackProps : TouchableWithoutFeedbackProperties
external interface TouchableWithoutFeedbackStatic : TimerMixin, TouchableMixin, ClassicComponentClass<TouchableWithoutFeedbackProps>
external interface TouchableHighlightProperties : TouchableWithoutFeedbackProperties {
    var activeOpacity: Number? get() = definedExternally; set(value) = definedExternally
    var onHideUnderlay: (() -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onShowUnderlay: (() -> Unit)? get() = definedExternally; set(value) = definedExternally
    override var style: dynamic /* Boolean | ViewStyle | Number /* Number & `T$5` */ | RecursiveArray<dynamic /* Boolean | ViewStyle | Number /* Number & `T$5` */ */> */ get() = definedExternally; set(value) = definedExternally
    var underlayColor: String? get() = definedExternally; set(value) = definedExternally
}
external interface TouchableHighlightStatic : NativeMethodsMixinStatic, TimerMixin, TouchableMixin, ClassicComponentClass<TouchableHighlightProperties>
external interface TouchableOpacityProperties : TouchableWithoutFeedbackProperties {
    var activeOpacity: Number? get() = definedExternally; set(value) = definedExternally
}
external interface TouchableOpacityStatic : TimerMixin, TouchableMixin, NativeMethodsMixinStatic, ClassicComponentClass<TouchableOpacityProperties> {
    var setOpacityTo: (value: Number) -> Unit
}
external interface BaseBackgroundPropType {
    var type: String
}
external interface RippleBackgroundPropType : BaseBackgroundPropType {
    override var type: String /* "RippleAndroid" */
    var color: Number? get() = definedExternally; set(value) = definedExternally
    var borderless: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface ThemeAttributeBackgroundPropType : BaseBackgroundPropType {
    override var type: String /* "ThemeAttrAndroid" */
    var attribute: String
}
external interface TouchableNativeFeedbackProperties : TouchableWithoutFeedbackProperties {
    var background: dynamic /* RippleBackgroundPropType | ThemeAttributeBackgroundPropType */ get() = definedExternally; set(value) = definedExternally
    var useForeground: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface TouchableNativeFeedbackStatic : TouchableMixin, ClassicComponentClass<TouchableNativeFeedbackProperties> {
    fun SelectableBackground(): ThemeAttributeBackgroundPropType
    fun SelectableBackgroundBorderless(): ThemeAttributeBackgroundPropType
    fun Ripple(color: String, borderless: Boolean? = definedExternally /* null */): RippleBackgroundPropType
}
external interface Route {
    var component: Any? /* ComponentClass<Any> | StatelessComponent<Any> */ get() = definedExternally; set(value) = definedExternally
    var id: String? get() = definedExternally; set(value) = definedExternally
    var title: String? get() = definedExternally; set(value) = definedExternally
    var passProps: Any? get() = definedExternally; set(value) = definedExternally
    @nativeGetter
    operator fun get(key: String): Any?
    @nativeSetter
    operator fun set(key: String, value: Any)
    var backButtonTitle: String? get() = definedExternally; set(value) = definedExternally
    var content: String? get() = definedExternally; set(value) = definedExternally
    var message: String? get() = definedExternally; set(value) = definedExternally
    var index: Number? get() = definedExternally; set(value) = definedExternally
    var onRightButtonPress: (() -> Unit)? get() = definedExternally; set(value) = definedExternally
    var rightButtonTitle: String? get() = definedExternally; set(value) = definedExternally
    var wrapperStyle: Any? get() = definedExternally; set(value) = definedExternally
}
external interface InteractionMixin {
    fun createInteractionHandle(): Number
    fun clearInteractionHandle(clearHandle: Number)
    fun runAfterInteractions(callback: () -> Any)
}
external interface SubscribableMixin {
    fun addListenerOn(eventEmitter: Any, eventType: String, listener: () -> Any, context: Any)
}
external interface RelayProfiler {
    fun attachProfileHandler(name: String, handler: (name: String, state: Any? /*= null*/) -> () -> Unit)
    fun attachAggregateHandler(name: String, handler: (name: String, callback: () -> Unit) -> Unit)
}
external interface SystraceStatic {
    fun setEnabled(enabled: Boolean)
    fun beginEvent(profileName: Any? = definedExternally /* null */, args: Any? = definedExternally /* null */)
    fun endEvent()
    fun beginAsyncEvent(profileName: Any? = definedExternally /* null */): Any
    fun endAsyncEvent(profileName: Any? = definedExternally /* null */, cookie: Any? = definedExternally /* null */)
    fun counterEvent(profileName: Any? = definedExternally /* null */, value: Any? = definedExternally /* null */)
    fun attachToRelayProfiler(relayProfiler: RelayProfiler)
    fun swizzleJSON()
    fun measureMethods(`object`: Any, objectName: String, methodNames: Array<String>)
    fun <T : Function<*>> measure(objName: String, fnName: String, func: T): T
}
external interface DataSourceAssetCallback {
    var rowHasChanged: ((r1: Any, r2: Any) -> Boolean)? get() = definedExternally; set(value) = definedExternally
    var sectionHeaderHasChanged: ((h1: Any, h2: Any) -> Boolean)? get() = definedExternally; set(value) = definedExternally
    var getRowData: ((dataBlob: Any, sectionID: dynamic /* String | Number */, rowID: dynamic /* String | Number */) -> Any)? get() = definedExternally; set(value) = definedExternally
    var getSectionHeaderData: ((dataBlob: Any, sectionID: dynamic /* String | Number */) -> Any)? get() = definedExternally; set(value) = definedExternally
}
external interface ListViewDataSource {
    fun cloneWithRows(dataBlob: Array<Any>, rowIdentities: Array<dynamic /* String | Number */>? = definedExternally /* null */): ListViewDataSource
    fun cloneWithRows(dataBlob: Json, rowIdentities: Array<dynamic /* String | Number */>? = definedExternally /* null */): ListViewDataSource
    fun cloneWithRowsAndSections(dataBlob: Array<Any>, sectionIdentities: Array<dynamic /* String | Number */>? = definedExternally /* null */, rowIdentities: Array<Array<dynamic /* String | Number */>>? = definedExternally /* null */): ListViewDataSource
    fun cloneWithRowsAndSections(dataBlob: Json, sectionIdentities: Array<dynamic /* String | Number */>? = definedExternally /* null */, rowIdentities: Array<Array<dynamic /* String | Number */>>? = definedExternally /* null */): ListViewDataSource
    fun getRowCount(): Number
    fun getRowAndSectionCount(): Number
    fun rowShouldUpdate(sectionIndex: Number, rowIndex: Number): Boolean
    fun getRowData(sectionIndex: Number, rowIndex: Number): Any
    fun getRowIDForFlatIndex(index: Number): String
    fun getSectionIDForFlatIndex(index: Number): String
    fun getSectionLengths(): Array<Number>
    fun sectionHeaderShouldUpdate(sectionIndex: Number): Boolean
    fun getSectionHeaderData(sectionIndex: Number): Any
}
external interface TabBarItemProperties : ViewProperties {
    var badge: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var badgeColor: String? get() = definedExternally; set(value) = definedExternally
    var icon: ImageURISource? get() = definedExternally; set(value) = definedExternally
    var onPress: (() -> Unit)? get() = definedExternally; set(value) = definedExternally
    var renderAsOriginal: Boolean? get() = definedExternally; set(value) = definedExternally
    var selected: Boolean? get() = definedExternally; set(value) = definedExternally
    var selectedIcon: ImageURISource? get() = definedExternally; set(value) = definedExternally
    override var style: dynamic /* Boolean | ViewStyle | Number /* Number & `T$5` */ | RecursiveArray<dynamic /* Boolean | ViewStyle | Number /* Number & `T$5` */ */> */ get() = definedExternally; set(value) = definedExternally
    var systemIcon: dynamic /* String /* "search" */ | String /* "bookmarks" */ | String /* "contacts" */ | String /* "downloads" */ | String /* "favorites" */ | String /* "featured" */ | String /* "history" */ | String /* "more" */ | String /* "most-recent" */ | String /* "most-viewed" */ | String /* "recents" */ | String /* "top-rated" */ */ get() = definedExternally; set(value) = definedExternally
    var title: String? get() = definedExternally; set(value) = definedExternally
}
external interface TabBarItemStatic : ComponentClass<TabBarItemProperties>
external interface TabBarIOSProperties : ViewProperties {
    var barTintColor: String? get() = definedExternally; set(value) = definedExternally
    var itemPositioning: dynamic /* String /* "center" */ | String /* "auto" */ | String /* "fill" */ */ get() = definedExternally; set(value) = definedExternally
    var tintColor: String? get() = definedExternally; set(value) = definedExternally
    var translucent: Boolean? get() = definedExternally; set(value) = definedExternally
    var unselectedTintColor: String? get() = definedExternally; set(value) = definedExternally
    var unselectedItemTintColor: String? get() = definedExternally; set(value) = definedExternally
}
external interface TabBarIOSStatic : ComponentClass<TabBarIOSProperties> {
    var Item: TabBarItemStatic
}
external interface PixelRatioStatic {
    fun get(): Number
    fun getFontScale(): Number
    fun getPixelSizeForLayoutSize(layoutSize: Number): Number
    fun roundToNearestPixel(layoutSize: Number): Number
    fun startDetecting()
}
external interface PlatformStatic {
    var OS: dynamic /* String /* "ios" */ | String /* "android" */ | String /* "macos" */ | String /* "windows" */ | String /* "web" */ */
    var Version: Number
    fun <T> select(specifics: Any?): T
}
external interface PlatformIOSStatic : PlatformStatic {
    var isPad: Boolean
    var isTVOS: Boolean
}
external interface DeviceEventEmitterStatic : EventEmitter {
    var sharedSubscriber: EventSubscriptionVendor
    fun addListener(type: String, listener: (data: Any) -> Unit, context: Any? = definedExternally /* null */): EmitterSubscription
}
external interface ScaledSize {
    var width: Number
    var height: Number
    var scale: Number
    var fontScale: Number
}
external interface `T$39` {
    var window: ScaledSize
    var screen: ScaledSize
}
external interface SimpleTask {
    var name: String
    var gen: () -> Unit
}
external interface PromiseTask {
    var name: String
    var gen: () -> Promise<Any>
}
external interface `T$40` {
    var interactionStart: String
    var interactionComplete: String
}
external interface `T$41` {
    var then: (onfulfilled: (() -> Any)? /*= null*/, onrejected: (() -> Any)? /*= null*/) -> Promise<Any>
    var done: (args: Any) -> Any
    var cancel: () -> Unit
}
external interface InteractionManagerStatic : EventEmitterListener {
    var Events: `T$40`
    fun runAfterInteractions(task: (() -> Any)? = definedExternally /* null */): `T$41`
    fun runAfterInteractions(task: SimpleTask? = definedExternally /* null */): `T$41`
    fun runAfterInteractions(task: PromiseTask? = definedExternally /* null */): `T$41`
    fun createInteractionHandle(): Number
    fun clearInteractionHandle(handle: Number)
    fun setDeadline(deadline: Number)
    fun runAfterInteractions(): `T$41`
}
external interface ScrollViewStyle : FlexStyle, TransformsStyle {
    var backfaceVisibility: dynamic /* String /* "visible" */ | String /* "hidden" */ */ get() = definedExternally; set(value) = definedExternally
    var backgroundColor: String? get() = definedExternally; set(value) = definedExternally
    var borderColor: String? get() = definedExternally; set(value) = definedExternally
    var borderTopColor: String? get() = definedExternally; set(value) = definedExternally
    var borderRightColor: String? get() = definedExternally; set(value) = definedExternally
    var borderBottomColor: String? get() = definedExternally; set(value) = definedExternally
    var borderLeftColor: String? get() = definedExternally; set(value) = definedExternally
    var borderRadius: Number? get() = definedExternally; set(value) = definedExternally
    var borderTopLeftRadius: Number? get() = definedExternally; set(value) = definedExternally
    var borderTopRightRadius: Number? get() = definedExternally; set(value) = definedExternally
    var borderBottomLeftRadius: Number? get() = definedExternally; set(value) = definedExternally
    var borderBottomRightRadius: Number? get() = definedExternally; set(value) = definedExternally
    var borderStyle: dynamic /* String /* "solid" */ | String /* "dotted" */ | String /* "dashed" */ */ get() = definedExternally; set(value) = definedExternally
    override var borderWidth: Number? get() = definedExternally; set(value) = definedExternally
    override var borderTopWidth: Number? get() = definedExternally; set(value) = definedExternally
    override var borderRightWidth: Number? get() = definedExternally; set(value) = definedExternally
    override var borderBottomWidth: Number? get() = definedExternally; set(value) = definedExternally
    override var borderLeftWidth: Number? get() = definedExternally; set(value) = definedExternally
    var opacity: Number? get() = definedExternally; set(value) = definedExternally
    override var overflow: dynamic /* String /* "visible" */ | String /* "hidden" */ */ get() = definedExternally; set(value) = definedExternally
    var shadowColor: String? get() = definedExternally; set(value) = definedExternally
    var shadowOffset: `T$2`? get() = definedExternally; set(value) = definedExternally
    var shadowOpacity: Number? get() = definedExternally; set(value) = definedExternally
    var shadowRadius: Number? get() = definedExternally; set(value) = definedExternally
    var elevation: Number? get() = definedExternally; set(value) = definedExternally
}
external interface ScrollResponderEvent : NativeSyntheticEvent<NativeTouchEvent>
external interface `T$42` {
    var x: Number
    var y: Number
    var width: Number
    var height: Number
    var animated: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface ScrollResponderMixin : SubscribableMixin {
    fun scrollResponderHandleScrollShouldSetResponder(): Boolean
    fun scrollResponderHandleStartShouldSetResponder(): Boolean
    fun scrollResponderHandleStartShouldSetResponderCapture(e: ScrollResponderEvent): Boolean
    fun scrollResponderHandleResponderReject(): Any
    fun scrollResponderHandleTerminationRequest(): Boolean
    fun scrollResponderHandleTouchEnd(e: ScrollResponderEvent)
    fun scrollResponderHandleResponderRelease(e: ScrollResponderEvent)
    fun scrollResponderHandleScroll(e: ScrollResponderEvent)
    fun scrollResponderHandleResponderGrant(e: ScrollResponderEvent)
    fun scrollResponderHandleScrollBeginDrag(e: ScrollResponderEvent)
    fun scrollResponderHandleScrollEndDrag(e: ScrollResponderEvent)
    fun scrollResponderHandleMomentumScrollBegin(e: ScrollResponderEvent)
    fun scrollResponderHandleMomentumScrollEnd(e: ScrollResponderEvent)
    fun scrollResponderHandleTouchStart(e: ScrollResponderEvent)
    fun scrollResponderHandleTouchMove(e: ScrollResponderEvent)
    fun scrollResponderIsAnimating(): Boolean
    fun scrollResponderGetScrollableNode(): Any
    fun scrollResponderScrollTo(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, animated: Boolean? = definedExternally /* null */)
    fun scrollResponderScrollTo(x: `T$19`? = definedExternally /* null */, y: Number? = definedExternally /* null */, animated: Boolean? = definedExternally /* null */)
    fun scrollResponderZoomTo(rect: `T$42`, animated: Boolean? = definedExternally /* null */)
    fun scrollResponderScrollNativeHandleToKeyboard(nodeHandle: Any, additionalOffset: Number? = definedExternally /* null */, preventNegativeScrollOffset: Boolean? = definedExternally /* null */)
    fun scrollResponderInputMeasureAndScrollToKeyboard(left: Number, top: Number, width: Number, height: Number)
    fun scrollResponderTextInputFocusError(e: ScrollResponderEvent)
    fun componentWillMount()
    fun scrollResponderKeyboardWillShow(e: ScrollResponderEvent)
    fun scrollResponderKeyboardWillHide(e: ScrollResponderEvent)
    fun scrollResponderKeyboardDidShow(e: ScrollResponderEvent)
    fun scrollResponderKeyboardDidHide(e: ScrollResponderEvent)
    fun scrollResponderScrollTo()
}
external interface ScrollViewPropertiesIOS {
    var alwaysBounceHorizontal: Boolean? get() = definedExternally; set(value) = definedExternally
    var alwaysBounceVertical: Boolean? get() = definedExternally; set(value) = definedExternally
    var automaticallyAdjustContentInsets: Boolean? get() = definedExternally; set(value) = definedExternally
    var bounces: Boolean? get() = definedExternally; set(value) = definedExternally
    var bouncesZoom: Boolean? get() = definedExternally; set(value) = definedExternally
    var canCancelContentTouches: Boolean? get() = definedExternally; set(value) = definedExternally
    var centerContent: Boolean? get() = definedExternally; set(value) = definedExternally
    var contentInset: Insets? get() = definedExternally; set(value) = definedExternally
    var contentOffset: PointProperties? get() = definedExternally; set(value) = definedExternally
    var contentInsetAdjustmentBehavior: dynamic /* String /* "never" */ | String /* "always" */ | String /* "automatic" */ | String /* "scrollableAxes" */ */ get() = definedExternally; set(value) = definedExternally
    var decelerationRate: dynamic /* Number | String /* "normal" */ | String /* "fast" */ */ get() = definedExternally; set(value) = definedExternally
    var directionalLockEnabled: Boolean? get() = definedExternally; set(value) = definedExternally
    var indicatorStyle: dynamic /* String /* "default" */ | String /* "black" */ | String /* "white" */ */ get() = definedExternally; set(value) = definedExternally
    var maximumZoomScale: Number? get() = definedExternally; set(value) = definedExternally
    var minimumZoomScale: Number? get() = definedExternally; set(value) = definedExternally
    var onScrollAnimationEnd: (() -> Unit)? get() = definedExternally; set(value) = definedExternally
    var pinchGestureEnabled: Boolean? get() = definedExternally; set(value) = definedExternally
    var scrollEventThrottle: Number? get() = definedExternally; set(value) = definedExternally
    var scrollIndicatorInsets: Insets? get() = definedExternally; set(value) = definedExternally
    var scrollsToTop: Boolean? get() = definedExternally; set(value) = definedExternally
    var snapToAlignment: dynamic /* String /* "center" */ | String /* "start" */ | String /* "end" */ */ get() = definedExternally; set(value) = definedExternally
    var snapToInterval: Number? get() = definedExternally; set(value) = definedExternally
    var stickyHeaderIndices: Array<Number>? get() = definedExternally; set(value) = definedExternally
    var zoomScale: Number? get() = definedExternally; set(value) = definedExternally
}
external interface ScrollViewPropertiesAndroid {
    var endFillColor: String? get() = definedExternally; set(value) = definedExternally
    var scrollPerfTag: String? get() = definedExternally; set(value) = definedExternally
    var overScrollMode: dynamic /* String /* "auto" */ | String /* "never" */ | String /* "always" */ */ get() = definedExternally; set(value) = definedExternally
}
external interface ScrollViewProperties : ViewProperties, ScrollViewPropertiesIOS, ScrollViewPropertiesAndroid, Touchable {
    var contentContainerStyle: dynamic /* Boolean | ViewStyle | Number /* Number & `T$5` */ | RecursiveArray<dynamic /* Boolean | ViewStyle | Number /* Number & `T$5` */ */> */ get() = definedExternally; set(value) = definedExternally
    var horizontal: Boolean? get() = definedExternally; set(value) = definedExternally
    var keyboardDismissMode: dynamic /* String /* "none" */ | String /* "on-drag" */ | String /* "interactive" */ */ get() = definedExternally; set(value) = definedExternally
    var keyboardShouldPersistTaps: dynamic /* Boolean | String /* "never" */ | String /* "always" */ | String /* "handled" */ */ get() = definedExternally; set(value) = definedExternally
    var onContentSizeChange: ((w: Number, h: Number) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onScroll: ((event: NativeSyntheticEvent<NativeScrollEvent>? /*= null*/) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onScrollBeginDrag: ((event: NativeSyntheticEvent<NativeScrollEvent>? /*= null*/) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onScrollEndDrag: ((event: NativeSyntheticEvent<NativeScrollEvent>? /*= null*/) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onMomentumScrollEnd: ((event: NativeSyntheticEvent<NativeScrollEvent>? /*= null*/) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onMomentumScrollBegin: ((event: NativeSyntheticEvent<NativeScrollEvent>? /*= null*/) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var pagingEnabled: Boolean? get() = definedExternally; set(value) = definedExternally
    var scrollEnabled: Boolean? get() = definedExternally; set(value) = definedExternally
    override var removeClippedSubviews: Boolean? get() = definedExternally; set(value) = definedExternally
    var showsHorizontalScrollIndicator: Boolean? get() = definedExternally; set(value) = definedExternally
    var showsVerticalScrollIndicator: Boolean? get() = definedExternally; set(value) = definedExternally
    override var style: dynamic /* Boolean | ScrollViewStyle | Number /* Number & `T$5` */ | RecursiveArray<dynamic /* Boolean | ScrollViewStyle | Number /* Number & `T$5` */ */> */ get() = definedExternally; set(value) = definedExternally
    var refreshControl: ReactElement<RefreshControlProperties>? get() = definedExternally; set(value) = definedExternally
}
external interface ScrollViewProps : ScrollViewProperties
external interface `T$43` {
    var animated: Boolean
}
external interface ScrollViewStatic : ScrollResponderMixin, ComponentClass<ScrollViewProps> {
    fun scrollTo(y: Number? = definedExternally /* null */, x: Number? = definedExternally /* null */, animated: Boolean? = definedExternally /* null */)
    fun scrollTo(y: `T$19`? = definedExternally /* null */, x: Number? = definedExternally /* null */, animated: Boolean? = definedExternally /* null */)
    fun scrollToEnd(options: `T$43`? = definedExternally /* null */)
    fun getScrollResponder(): Element
    fun getScrollableNode(): Any
    fun getInnerViewNode(): Any
    var scrollWithoutAnimationTo: ((y: Number, x: Number) -> Unit)? get() = definedExternally; set(value) = definedExternally
    fun scrollTo()
}
external interface NativeScrollRectangle {
    var left: Number
    var top: Number
    var bottom: Number
    var right: Number
}
external interface NativeScrollPoint {
    var x: Number
    var y: Number
}
external interface NativeScrollVelocity {
    var x: Number
    var y: Number
}
external interface NativeScrollSize {
    var height: Number
    var width: Number
}
external interface NativeScrollEvent {
    var contentInset: NativeScrollRectangle
    var contentOffset: NativeScrollPoint
    var contentSize: NativeScrollSize
    var layoutMeasurement: NativeScrollSize
    var velocity: NativeScrollVelocity? get() = definedExternally; set(value) = definedExternally
    var zoomScale: Number
}
external interface SnapshotViewIOSProperties : ViewProperties {
    fun onSnapshotReady(): Any
    var testIdentifier: String
}
external interface SnapshotViewIOSStatic : NativeMethodsMixinStatic, ComponentClass<SnapshotViewIOSProperties>
external interface SwipeableListViewDataSource {
    fun cloneWithRowsAndSections(dataBlob: Any, sectionIdentities: Array<String>? = definedExternally /* null */, rowIdentities: Array<Array<String>>? = definedExternally /* null */): SwipeableListViewDataSource
    fun getDataSource(): ListViewDataSource
    fun getOpenRowID(): String
    fun getFirstRowID(): String
    fun setOpenRowID(rowID: String): SwipeableListViewDataSource
}
external interface SwipeableListViewProps {
    var bounceFirstRowOnMount: Boolean
    var dataSource: SwipeableListViewDataSource
    var maxSwipeDistance: Number
    var renderRow: (rowData: Any, sectionID: dynamic /* String | Number */, rowID: dynamic /* String | Number */, highlightRow: Boolean? /*= null*/) -> ReactElement<Any>
    fun renderQuickActions(rowData: Any, sectionID: String, rowID: String): ReactElement<Any>
    fun renderQuickActions(rowData: Any, sectionID: String, rowID: Number): ReactElement<Any>
    fun renderQuickActions(rowData: Any, sectionID: Number, rowID: String): ReactElement<Any>
    fun renderQuickActions(rowData: Any, sectionID: Number, rowID: Number): ReactElement<Any>
}
external interface SwipeableListViewStatic : ComponentClass<SwipeableListViewProps> {
    fun getNewDataSource(): SwipeableListViewDataSource
}
external interface ActionSheetIOSOptions {
    var title: String? get() = definedExternally; set(value) = definedExternally
    var options: Array<String>
    var cancelButtonIndex: Number? get() = definedExternally; set(value) = definedExternally
    var destructiveButtonIndex: Number? get() = definedExternally; set(value) = definedExternally
    var message: String? get() = definedExternally; set(value) = definedExternally
}
external interface ShareActionSheetIOSOptions {
    var message: String? get() = definedExternally; set(value) = definedExternally
    var url: String? get() = definedExternally; set(value) = definedExternally
    var subject: String? get() = definedExternally; set(value) = definedExternally
    var excludedActivityTypes: Array<String>? get() = definedExternally; set(value) = definedExternally
}
external interface ActionSheetIOSStatic {
    var showActionSheetWithOptions: (options: ActionSheetIOSOptions, callback: (buttonIndex: Number) -> Unit) -> Unit
    var showShareActionSheetWithOptions: (options: ShareActionSheetIOSOptions, failureCallback: (error: Error) -> Unit, successCallback: (success: Boolean, method: String) -> Unit) -> Unit
}
external interface ShareOptions {
    var dialogTitle: String? get() = definedExternally; set(value) = definedExternally
    var excludedActivityTypes: Array<String>? get() = definedExternally; set(value) = definedExternally
    var tintColor: String? get() = definedExternally; set(value) = definedExternally
}
external interface `T$44` {
    var title: String? get() = definedExternally; set(value) = definedExternally
    var message: String
}
external interface `T$45` {
    var title: String? get() = definedExternally; set(value) = definedExternally
    var url: String
}
external interface ShareStatic {
    fun share(content: `T$44`, options: ShareOptions? = definedExternally /* null */): Promise<Any>
    fun share(content: `T$45`, options: ShareOptions? = definedExternally /* null */): Promise<Any>
    var sharedAction: String
    var dismissedAction: String
}
external interface AccessibilityInfoStatic {
    var fetch: () -> Promise<Boolean>
    var addEventListener: (eventName: dynamic /* String /* "change" */ | String /* "announcementFinished" */ */, handler: () -> Unit) -> Unit
    var removeEventListener: (eventName: dynamic /* String /* "change" */ | String /* "announcementFinished" */ */, handler: () -> Unit) -> Unit
    var setAccessibilityFocus: (reactTag: Number) -> Unit
    var announceForAccessibility: (announcement: String) -> Unit
}
external interface AlertButton {
    var text: String? get() = definedExternally; set(value) = definedExternally
    var onPress: (() -> Unit)? get() = definedExternally; set(value) = definedExternally
    var style: dynamic /* String /* "default" */ | String /* "cancel" */ | String /* "destructive" */ */ get() = definedExternally; set(value) = definedExternally
}
external interface AlertOptions {
    var cancelable: Boolean? get() = definedExternally; set(value) = definedExternally
    var onDismiss: (() -> Unit)? get() = definedExternally; set(value) = definedExternally
}
external interface AlertStatic {
    var alert: (title: String, message: String? /*= null*/, buttons: Array<AlertButton>? /*= null*/, options: AlertOptions? /*= null*/, type: String? /*= null*/) -> Unit
}
external interface AlertAndroidStatic {
    var alert: (title: String, message: String? /*= null*/, buttons: Array<AlertButton>? /*= null*/, options: AlertOptions? /*= null*/) -> Unit
}
external interface AdSupportIOSStatic {
    var getAdvertisingId: (onSuccess: (deviceId: String) -> Unit, onFailure: (err: Error) -> Unit) -> Unit
    var getAdvertisingTrackingEnabled: (onSuccess: (hasTracking: Boolean) -> Unit, onFailure: (err: Error) -> Unit) -> Unit
}
external interface AlertIOSButton {
    var text: String
    var onPress: ((message: String? /*= null*/) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var style: dynamic /* String /* "default" */ | String /* "cancel" */ | String /* "destructive" */ */ get() = definedExternally; set(value) = definedExternally
}
external interface AlertIOSStatic {
    var alert: (title: String, message: String? /*= null*/, callbackOrButtons: dynamic /* () -> Unit | Array<AlertIOSButton> */ /*= null*/, type: dynamic /* String /* "default" */ | String /* "plain-text" */ | String /* "secure-text" */ | String /* "login-password" */ */ /*= null*/) -> Unit
    var prompt: (title: String, message: String? /*= null*/, callbackOrButtons: dynamic /* Array<AlertIOSButton> | (value: String) -> Unit */ /*= null*/, type: dynamic /* String /* "default" */ | String /* "plain-text" */ | String /* "secure-text" */ | String /* "login-password" */ */ /*= null*/, defaultValue: String? /*= null*/) -> Unit
}
external interface AppStateStatic {
    var currentState: dynamic /* String /* "active" */ | String /* "background" */ | String /* "inactive" */ */
    fun addEventListener(type: String /* "change" */, listener: (state: dynamic /* String /* "active" */ | String /* "background" */ | String /* "inactive" */ */) -> Unit)
    fun addEventListener(type: String /* "memoryWarning" */, listener: (state: dynamic /* String /* "active" */ | String /* "background" */ | String /* "inactive" */ */) -> Unit)
    fun removeEventListener(type: String /* "change" */, listener: (state: dynamic /* String /* "active" */ | String /* "background" */ | String /* "inactive" */ */) -> Unit)
    fun removeEventListener(type: String /* "memoryWarning" */, listener: (state: dynamic /* String /* "active" */ | String /* "background" */ | String /* "inactive" */ */) -> Unit)
}
external interface AsyncStorageStatic {
    fun getItem(key: String, callback: ((error: Error? /*= null*/, result: String? /*= null*/) -> Unit)? = definedExternally /* null */): Promise<String>
    fun setItem(key: String, value: String, callback: ((error: Error? /*= null*/) -> Unit)? = definedExternally /* null */): Promise<Unit>
    fun removeItem(key: String, callback: ((error: Error? /*= null*/) -> Unit)? = definedExternally /* null */): Promise<Unit>
    fun mergeItem(key: String, value: String, callback: ((error: Error? /*= null*/) -> Unit)? = definedExternally /* null */): Promise<Unit>
    fun clear(callback: ((error: Error? /*= null*/) -> Unit)? = definedExternally /* null */): Promise<Unit>
    fun getAllKeys(callback: ((error: Error? /*= null*/, keys: Array<String>? /*= null*/) -> Unit)? = definedExternally /* null */): Promise<Array<String>>
    fun multiGet(keys: Array<String>, callback: ((errors: Array<Error>? /*= null*/, result: Array<dynamic /* JsTuple<String, String> */>? /*= null*/) -> Unit)? = definedExternally /* null */): Promise<Array<dynamic /* JsTuple<String, String> */>>
    fun multiSet(keyValuePairs: Array<Array<String>>, callback: ((errors: Array<Error>? /*= null*/) -> Unit)? = definedExternally /* null */): Promise<Unit>
    fun multiRemove(keys: Array<String>, callback: ((errors: Array<Error>? /*= null*/) -> Unit)? = definedExternally /* null */): Promise<Unit>
    fun multiMerge(keyValuePairs: Array<Array<String>>, callback: ((errors: Array<Error>? /*= null*/) -> Unit)? = definedExternally /* null */): Promise<Unit>
}
external interface BackAndroidStatic {
    fun exitApp()
    fun addEventListener(eventName: String /* "hardwareBackPress" */, handler: () -> Unit)
    fun removeEventListener(eventName: String /* "hardwareBackPress" */, handler: () -> Unit)
}
external interface BackHandlerStatic {
    fun exitApp()
    fun addEventListener(eventName: String /* "hardwareBackPress" */, handler: () -> Unit)
    fun removeEventListener(eventName: String /* "hardwareBackPress" */, handler: () -> Unit)
}
external interface ButtonProperties {
    var title: String
    var onPress: () -> Any
    var color: String? get() = definedExternally; set(value) = definedExternally
    var accessibilityLabel: String? get() = definedExternally; set(value) = definedExternally
    var disabled: Boolean? get() = definedExternally; set(value) = definedExternally
    var testID: String? get() = definedExternally; set(value) = definedExternally
}
external interface ButtonStatic : ComponentClass<ButtonProperties>
external interface CameraRollFetchParams {
    var first: Number
    var after: String? get() = definedExternally; set(value) = definedExternally
    var groupTypes: dynamic /* String /* "Album" */ | String /* "All" */ | String /* "Event" */ | String /* "Faces" */ | String /* "Library" */ | String /* "PhotoStream" */ | String /* "SavedPhotos" */ */ get() = definedExternally; set(value) = definedExternally
    var groupName: String? get() = definedExternally; set(value) = definedExternally
    var assetType: dynamic /* String /* "All" */ | String /* "Videos" */ | String /* "Photos" */ */ get() = definedExternally; set(value) = definedExternally
}
external interface CameraRollNodeInfo {
    var image: ImageStatic
    var group_name: String
    var timestamp: Number
    var location: Any
}
external interface CameraRollEdgeInfo {
    var node: CameraRollNodeInfo
}
external interface `T$46` {
    var has_next_page: Boolean
    var end_cursor: String
}
external interface CameraRollAssetInfo {
    var edges: Array<CameraRollEdgeInfo>
    var page_info: `T$46`
}
external interface GetPhotosParamType {
    var first: Number
    var after: String? get() = definedExternally; set(value) = definedExternally
    var groupTypes: dynamic /* String /* "Album" */ | String /* "All" */ | String /* "Event" */ | String /* "Faces" */ | String /* "Library" */ | String /* "PhotoStream" */ | String /* "SavedPhotos" */ */ get() = definedExternally; set(value) = definedExternally
    var groupName: String? get() = definedExternally; set(value) = definedExternally
    var assetType: dynamic /* String /* "All" */ | String /* "Videos" */ | String /* "Photos" */ */ get() = definedExternally; set(value) = definedExternally
    var mimeTypes: Array<String>? get() = definedExternally; set(value) = definedExternally
}
external interface `T$47` {
    var uri: String
    var height: Number
    var width: Number
    var isStored: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface `T$48` {
    var latitude: Number
    var longitude: Number
    var altitude: Number
    var heading: Number
    var speed: Number
}
external interface `T$49` {
    var type: String
    var group_name: String
    var image: `T$47`
    var timestamp: Number
    var location: `T$48`
}
external interface `T$50` {
    var node: `T$49`
}
external interface `T$51` {
    var has_next_page: Boolean
    var start_cursor: String? get() = definedExternally; set(value) = definedExternally
    var end_cursor: String? get() = definedExternally; set(value) = definedExternally
}
external interface GetPhotosReturnType {
    var edges: Array<`T$50`>
    var page_info: `T$51`
}
external interface CameraRollStatic {
    var GroupTypesOptions: Array<dynamic /* String /* "Album" */ | String /* "All" */ | String /* "Event" */ | String /* "Faces" */ | String /* "Library" */ | String /* "PhotoStream" */ | String /* "SavedPhotos" */ */>
    var AssetTypeOptions: Array<dynamic /* String /* "All" */ | String /* "Videos" */ | String /* "Photos" */ */>
    fun saveImageWithTag(tag: String): Promise<String>
    fun saveToCameraRoll(tag: String, type: String? /* "photo" */ = definedExternally /* null */): Promise<String>
    fun saveToCameraRoll(tag: String, type: String? /* "video" */ = definedExternally /* null */): Promise<String>
    fun saveToCameraRoll(tag: String, type: String? /* "photo" */ = definedExternally /* null */): Promise<String>
    fun saveToCameraRoll(tag: String, type: String? /* "video" */ = definedExternally /* null */): Promise<String>
    fun getPhotos(params: GetPhotosParamType): Promise<GetPhotosReturnType>
    fun saveToCameraRoll(tag: String): Promise<String>
}
external interface ClipboardStatic {
    fun getString(): Promise<String>
    fun setString(content: String)
}
external interface DatePickerAndroidOpenOption {
    var date: dynamic /* Number | Date */ get() = definedExternally; set(value) = definedExternally
    var minDate: dynamic /* Number | Date */ get() = definedExternally; set(value) = definedExternally
    var maxDate: dynamic /* Number | Date */ get() = definedExternally; set(value) = definedExternally
    var mode: dynamic /* String /* "default" */ | String /* "calendar" */ | String /* "spinner" */ */ get() = definedExternally; set(value) = definedExternally
}
external interface DatePickerAndroidOpenReturn {
    var action: String
    var year: Number? get() = definedExternally; set(value) = definedExternally
    var month: Number? get() = definedExternally; set(value) = definedExternally
    var day: Number? get() = definedExternally; set(value) = definedExternally
}
external interface DatePickerAndroidStatic {
    fun open(options: DatePickerAndroidOpenOption? = definedExternally /* null */): Promise<DatePickerAndroidOpenReturn>
    var dateSetAction: String
    var dismissedAction: String
}
external interface IntentAndroidStatic {
    fun openURL(url: String)
    fun canOpenURL(url: String, callback: (supported: Boolean) -> Unit)
    fun getInitialURL(callback: (url: String) -> Unit)
}
external interface `T$52` {
    var url: String
}
external interface LinkingStatic : NativeEventEmitter {
    fun addEventListener(type: String, handler: (event: `T$52`) -> Unit)
    fun removeEventListener(type: String, handler: (event: `T$52`) -> Unit)
    fun openURL(url: String): Promise<Any>
    fun canOpenURL(url: String): Promise<Boolean>
    fun getInitialURL(): Promise<String>
}
external interface LinkingIOSStatic {
    fun addEventListener(type: String, handler: (event: `T$52`) -> Unit)
    fun removeEventListener(type: String, handler: (event: `T$52`) -> Unit)
    fun openURL(url: String)
    fun canOpenURL(url: String, callback: (supported: Boolean) -> Unit)
    fun popInitialURL(): String
}
external interface ConnectionInfo {
    var type: dynamic /* String /* "none" */ | String /* "wifi" */ | String /* "cell" */ | String /* "unknown" */ | String /* "NONE" */ | String /* "MOBILE" */ | String /* "WIFI" */ | String /* "MOBILE_MMS" */ | String /* "MOBILE_SUPL" */ | String /* "MOBILE_DUN" */ | String /* "MOBILE_HIPRI" */ | String /* "WIMAX" */ | String /* "BLUETOOTH" */ | String /* "DUMMY" */ | String /* "ETHERNET" */ | String /* "MOBILE_FOTA" */ | String /* "MOBILE_IMS" */ | String /* "MOBILE_CBS" */ | String /* "WIFI_P2P" */ | String /* "MOBILE_IA" */ | String /* "MOBILE_EMERGENCY" */ | String /* "PROXY" */ | String /* "VPN" */ | String /* "UNKNOWN" */ */
    var effectiveType: dynamic /* String /* "unknown" */ | String /* "2g" */ | String /* "3g" */ | String /* "4g" */ */
}
external interface `T$53` {
    var fetch: () -> Promise<Boolean>
    var addEventListener: (eventName: String, listener: (result: Boolean) -> Unit) -> Unit
    var removeEventListener: (eventName: String, listener: (result: Boolean) -> Unit) -> Unit
}
external interface NetInfoStatic {
    var fetch: () -> Promise<dynamic /* String /* "none" */ | String /* "wifi" */ | String /* "cell" */ | String /* "unknown" */ | String /* "NONE" */ | String /* "MOBILE" */ | String /* "WIFI" */ | String /* "MOBILE_MMS" */ | String /* "MOBILE_SUPL" */ | String /* "MOBILE_DUN" */ | String /* "MOBILE_HIPRI" */ | String /* "WIMAX" */ | String /* "BLUETOOTH" */ | String /* "DUMMY" */ | String /* "ETHERNET" */ | String /* "MOBILE_FOTA" */ | String /* "MOBILE_IMS" */ | String /* "MOBILE_CBS" */ | String /* "WIFI_P2P" */ | String /* "MOBILE_IA" */ | String /* "MOBILE_EMERGENCY" */ | String /* "PROXY" */ | String /* "VPN" */ | String /* "UNKNOWN" */ */>
    var addEventListener: (eventName: String, listener: (result: dynamic /* String /* "none" */ | String /* "wifi" */ | String /* "cell" */ | String /* "unknown" */ | String /* "NONE" */ | String /* "MOBILE" */ | String /* "WIFI" */ | String /* "MOBILE_MMS" */ | String /* "MOBILE_SUPL" */ | String /* "MOBILE_DUN" */ | String /* "MOBILE_HIPRI" */ | String /* "WIMAX" */ | String /* "BLUETOOTH" */ | String /* "DUMMY" */ | String /* "ETHERNET" */ | String /* "MOBILE_FOTA" */ | String /* "MOBILE_IMS" */ | String /* "MOBILE_CBS" */ | String /* "WIFI_P2P" */ | String /* "MOBILE_IA" */ | String /* "MOBILE_EMERGENCY" */ | String /* "PROXY" */ | String /* "VPN" */ | String /* "UNKNOWN" */ | ConnectionInfo */) -> Unit) -> Unit
    var removeEventListener: (eventName: String, listener: (result: dynamic /* String /* "none" */ | String /* "wifi" */ | String /* "cell" */ | String /* "unknown" */ | String /* "NONE" */ | String /* "MOBILE" */ | String /* "WIFI" */ | String /* "MOBILE_MMS" */ | String /* "MOBILE_SUPL" */ | String /* "MOBILE_DUN" */ | String /* "MOBILE_HIPRI" */ | String /* "WIMAX" */ | String /* "BLUETOOTH" */ | String /* "DUMMY" */ | String /* "ETHERNET" */ | String /* "MOBILE_FOTA" */ | String /* "MOBILE_IMS" */ | String /* "MOBILE_CBS" */ | String /* "WIFI_P2P" */ | String /* "MOBILE_IA" */ | String /* "MOBILE_EMERGENCY" */ | String /* "PROXY" */ | String /* "VPN" */ | String /* "UNKNOWN" */ | ConnectionInfo */) -> Unit) -> Unit
    var getConnectionInfo: () -> Promise<ConnectionInfo>
    var isConnected: `T$53`
    var isConnectionExpensive: Promise<Boolean>
}
external interface PanResponderGestureState {
    var stateID: Number
    var moveX: Number
    var moveY: Number
    var x0: Number
    var y0: Number
    var dx: Number
    var dy: Number
    var vx: Number
    var vy: Number
    var numberActiveTouches: Number
    var _accountsForMovesUpTo: Number
}
external interface PanResponderCallbacks {
    var onMoveShouldSetPanResponder: ((e: GestureResponderEvent, gestureState: PanResponderGestureState) -> Boolean)? get() = definedExternally; set(value) = definedExternally
    var onStartShouldSetPanResponder: ((e: GestureResponderEvent, gestureState: PanResponderGestureState) -> Boolean)? get() = definedExternally; set(value) = definedExternally
    var onPanResponderGrant: ((e: GestureResponderEvent, gestureState: PanResponderGestureState) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onPanResponderMove: ((e: GestureResponderEvent, gestureState: PanResponderGestureState) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onPanResponderRelease: ((e: GestureResponderEvent, gestureState: PanResponderGestureState) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onPanResponderTerminate: ((e: GestureResponderEvent, gestureState: PanResponderGestureState) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onMoveShouldSetPanResponderCapture: ((e: GestureResponderEvent, gestureState: PanResponderGestureState) -> Boolean)? get() = definedExternally; set(value) = definedExternally
    var onStartShouldSetPanResponderCapture: ((e: GestureResponderEvent, gestureState: PanResponderGestureState) -> Boolean)? get() = definedExternally; set(value) = definedExternally
    var onPanResponderReject: ((e: GestureResponderEvent, gestureState: PanResponderGestureState) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onPanResponderStart: ((e: GestureResponderEvent, gestureState: PanResponderGestureState) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onPanResponderEnd: ((e: GestureResponderEvent, gestureState: PanResponderGestureState) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onPanResponderTerminationRequest: ((e: GestureResponderEvent, gestureState: PanResponderGestureState) -> Boolean)? get() = definedExternally; set(value) = definedExternally
    var onShouldBlockNativeResponder: ((e: GestureResponderEvent, gestureState: PanResponderGestureState) -> Boolean)? get() = definedExternally; set(value) = definedExternally
}
external interface PanResponderInstance {
    var panHandlers: GestureResponderHandlers
}
external interface PanResponderStatic {
    fun create(config: PanResponderCallbacks): PanResponderInstance
}
external interface Rationale {
    var title: String
    var message: String
}
external interface `T$54` {
    @nativeGetter
    operator fun get(key: String): dynamic /* String /* "granted" */ | String /* "denied" */ | String /* "never_ask_again" */ */
    @nativeSetter
    operator fun set(key: String, value: String /* "granted" */)
    @nativeSetter
    operator fun set(key: String, value: String /* "denied" */)
    @nativeSetter
    operator fun set(key: String, value: String /* "never_ask_again" */)
}
external interface `T$55` {
    @nativeGetter
    operator fun get(key: String): dynamic /* String /* "android.permission.READ_CALENDAR" */ | String /* "android.permission.WRITE_CALENDAR" */ | String /* "android.permission.CAMERA" */ | String /* "android.permission.READ_CONTACTS" */ | String /* "android.permission.WRITE_CONTACTS" */ | String /* "android.permission.GET_ACCOUNTS" */ | String /* "android.permission.ACCESS_FINE_LOCATION" */ | String /* "android.permission.ACCESS_COARSE_LOCATION" */ | String /* "android.permission.RECORD_AUDIO" */ | String /* "android.permission.READ_PHONE_STATE" */ | String /* "android.permission.CALL_PHONE" */ | String /* "android.permission.READ_CALL_LOG" */ | String /* "android.permission.WRITE_CALL_LOG" */ | String /* "com.android.voicemail.permission.ADD_VOICEMAIL" */ | String /* "android.permission.USE_SIP" */ | String /* "android.permission.PROCESS_OUTGOING_CALLS" */ | String /* "android.permission.BODY_SENSORS" */ | String /* "android.permission.SEND_SMS" */ | String /* "android.permission.RECEIVE_SMS" */ | String /* "android.permission.READ_SMS" */ | String /* "android.permission.RECEIVE_WAP_PUSH" */ | String /* "android.permission.RECEIVE_MMS" */ | String /* "android.permission.READ_EXTERNAL_STORAGE" */ | String /* "android.permission.WRITE_EXTERNAL_STORAGE" */ */
    @nativeSetter
    operator fun set(key: String, value: String /* "android.permission.READ_CALENDAR" */)
    @nativeSetter
    operator fun set(key: String, value: String /* "android.permission.WRITE_CALENDAR" */)
    @nativeSetter
    operator fun set(key: String, value: String /* "android.permission.CAMERA" */)
    @nativeSetter
    operator fun set(key: String, value: String /* "android.permission.READ_CONTACTS" */)
    @nativeSetter
    operator fun set(key: String, value: String /* "android.permission.WRITE_CONTACTS" */)
    @nativeSetter
    operator fun set(key: String, value: String /* "android.permission.GET_ACCOUNTS" */)
    @nativeSetter
    operator fun set(key: String, value: String /* "android.permission.ACCESS_FINE_LOCATION" */)
    @nativeSetter
    operator fun set(key: String, value: String /* "android.permission.ACCESS_COARSE_LOCATION" */)
    @nativeSetter
    operator fun set(key: String, value: String /* "android.permission.RECORD_AUDIO" */)
    @nativeSetter
    operator fun set(key: String, value: String /* "android.permission.READ_PHONE_STATE" */)
    @nativeSetter
    operator fun set(key: String, value: String /* "android.permission.CALL_PHONE" */)
    @nativeSetter
    operator fun set(key: String, value: String /* "android.permission.READ_CALL_LOG" */)
    @nativeSetter
    operator fun set(key: String, value: String /* "android.permission.WRITE_CALL_LOG" */)
    @nativeSetter
    operator fun set(key: String, value: String /* "com.android.voicemail.permission.ADD_VOICEMAIL" */)
    @nativeSetter
    operator fun set(key: String, value: String /* "android.permission.USE_SIP" */)
    @nativeSetter
    operator fun set(key: String, value: String /* "android.permission.PROCESS_OUTGOING_CALLS" */)
    @nativeSetter
    operator fun set(key: String, value: String /* "android.permission.BODY_SENSORS" */)
    @nativeSetter
    operator fun set(key: String, value: String /* "android.permission.SEND_SMS" */)
    @nativeSetter
    operator fun set(key: String, value: String /* "android.permission.RECEIVE_SMS" */)
    @nativeSetter
    operator fun set(key: String, value: String /* "android.permission.READ_SMS" */)
    @nativeSetter
    operator fun set(key: String, value: String /* "android.permission.RECEIVE_WAP_PUSH" */)
    @nativeSetter
    operator fun set(key: String, value: String /* "android.permission.RECEIVE_MMS" */)
    @nativeSetter
    operator fun set(key: String, value: String /* "android.permission.READ_EXTERNAL_STORAGE" */)
    @nativeSetter
    operator fun set(key: String, value: String /* "android.permission.WRITE_EXTERNAL_STORAGE" */)
}
external interface PermissionsAndroidStatic {
    var RESULTS: `T$54`
    var PERMISSIONS: `T$55`
    fun checkPermission(permission: dynamic /* String /* "android.permission.READ_CALENDAR" */ | String /* "android.permission.WRITE_CALENDAR" */ | String /* "android.permission.CAMERA" */ | String /* "android.permission.READ_CONTACTS" */ | String /* "android.permission.WRITE_CONTACTS" */ | String /* "android.permission.GET_ACCOUNTS" */ | String /* "android.permission.ACCESS_FINE_LOCATION" */ | String /* "android.permission.ACCESS_COARSE_LOCATION" */ | String /* "android.permission.RECORD_AUDIO" */ | String /* "android.permission.READ_PHONE_STATE" */ | String /* "android.permission.CALL_PHONE" */ | String /* "android.permission.READ_CALL_LOG" */ | String /* "android.permission.WRITE_CALL_LOG" */ | String /* "com.android.voicemail.permission.ADD_VOICEMAIL" */ | String /* "android.permission.USE_SIP" */ | String /* "android.permission.PROCESS_OUTGOING_CALLS" */ | String /* "android.permission.BODY_SENSORS" */ | String /* "android.permission.SEND_SMS" */ | String /* "android.permission.RECEIVE_SMS" */ | String /* "android.permission.READ_SMS" */ | String /* "android.permission.RECEIVE_WAP_PUSH" */ | String /* "android.permission.RECEIVE_MMS" */ | String /* "android.permission.READ_EXTERNAL_STORAGE" */ | String /* "android.permission.WRITE_EXTERNAL_STORAGE" */ */): Promise<Boolean>
    fun check(permission: dynamic /* String /* "android.permission.READ_CALENDAR" */ | String /* "android.permission.WRITE_CALENDAR" */ | String /* "android.permission.CAMERA" */ | String /* "android.permission.READ_CONTACTS" */ | String /* "android.permission.WRITE_CONTACTS" */ | String /* "android.permission.GET_ACCOUNTS" */ | String /* "android.permission.ACCESS_FINE_LOCATION" */ | String /* "android.permission.ACCESS_COARSE_LOCATION" */ | String /* "android.permission.RECORD_AUDIO" */ | String /* "android.permission.READ_PHONE_STATE" */ | String /* "android.permission.CALL_PHONE" */ | String /* "android.permission.READ_CALL_LOG" */ | String /* "android.permission.WRITE_CALL_LOG" */ | String /* "com.android.voicemail.permission.ADD_VOICEMAIL" */ | String /* "android.permission.USE_SIP" */ | String /* "android.permission.PROCESS_OUTGOING_CALLS" */ | String /* "android.permission.BODY_SENSORS" */ | String /* "android.permission.SEND_SMS" */ | String /* "android.permission.RECEIVE_SMS" */ | String /* "android.permission.READ_SMS" */ | String /* "android.permission.RECEIVE_WAP_PUSH" */ | String /* "android.permission.RECEIVE_MMS" */ | String /* "android.permission.READ_EXTERNAL_STORAGE" */ | String /* "android.permission.WRITE_EXTERNAL_STORAGE" */ */): Promise<Boolean>
    fun requestPermission(permission: dynamic /* String /* "android.permission.READ_CALENDAR" */ | String /* "android.permission.WRITE_CALENDAR" */ | String /* "android.permission.CAMERA" */ | String /* "android.permission.READ_CONTACTS" */ | String /* "android.permission.WRITE_CONTACTS" */ | String /* "android.permission.GET_ACCOUNTS" */ | String /* "android.permission.ACCESS_FINE_LOCATION" */ | String /* "android.permission.ACCESS_COARSE_LOCATION" */ | String /* "android.permission.RECORD_AUDIO" */ | String /* "android.permission.READ_PHONE_STATE" */ | String /* "android.permission.CALL_PHONE" */ | String /* "android.permission.READ_CALL_LOG" */ | String /* "android.permission.WRITE_CALL_LOG" */ | String /* "com.android.voicemail.permission.ADD_VOICEMAIL" */ | String /* "android.permission.USE_SIP" */ | String /* "android.permission.PROCESS_OUTGOING_CALLS" */ | String /* "android.permission.BODY_SENSORS" */ | String /* "android.permission.SEND_SMS" */ | String /* "android.permission.RECEIVE_SMS" */ | String /* "android.permission.READ_SMS" */ | String /* "android.permission.RECEIVE_WAP_PUSH" */ | String /* "android.permission.RECEIVE_MMS" */ | String /* "android.permission.READ_EXTERNAL_STORAGE" */ | String /* "android.permission.WRITE_EXTERNAL_STORAGE" */ */, rationale: Rationale? = definedExternally /* null */): Promise<Boolean>
    fun request(permission: dynamic /* String /* "android.permission.READ_CALENDAR" */ | String /* "android.permission.WRITE_CALENDAR" */ | String /* "android.permission.CAMERA" */ | String /* "android.permission.READ_CONTACTS" */ | String /* "android.permission.WRITE_CONTACTS" */ | String /* "android.permission.GET_ACCOUNTS" */ | String /* "android.permission.ACCESS_FINE_LOCATION" */ | String /* "android.permission.ACCESS_COARSE_LOCATION" */ | String /* "android.permission.RECORD_AUDIO" */ | String /* "android.permission.READ_PHONE_STATE" */ | String /* "android.permission.CALL_PHONE" */ | String /* "android.permission.READ_CALL_LOG" */ | String /* "android.permission.WRITE_CALL_LOG" */ | String /* "com.android.voicemail.permission.ADD_VOICEMAIL" */ | String /* "android.permission.USE_SIP" */ | String /* "android.permission.PROCESS_OUTGOING_CALLS" */ | String /* "android.permission.BODY_SENSORS" */ | String /* "android.permission.SEND_SMS" */ | String /* "android.permission.RECEIVE_SMS" */ | String /* "android.permission.READ_SMS" */ | String /* "android.permission.RECEIVE_WAP_PUSH" */ | String /* "android.permission.RECEIVE_MMS" */ | String /* "android.permission.READ_EXTERNAL_STORAGE" */ | String /* "android.permission.WRITE_EXTERNAL_STORAGE" */ */, rationale: Rationale? = definedExternally /* null */): Promise<String>
    fun requestMultiple(permissions: Array<String>): Promise<`T$54`>
}
external interface PushNotificationPermissions {
    var alert: Boolean? get() = definedExternally; set(value) = definedExternally
    var badge: Boolean? get() = definedExternally; set(value) = definedExternally
    var sound: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface PushNotification {
    fun getMessage(): dynamic /* String | Any */
    fun getSound(): String
    fun getAlert(): dynamic /* String | Any */
    fun getBadgeCount(): Number
    fun getData(): Any
    fun finish(result: String)
}
external interface PresentLocalNotificationDetails {
    var alertBody: String
    var alertAction: String
    var soundName: String? get() = definedExternally; set(value) = definedExternally
    var category: String? get() = definedExternally; set(value) = definedExternally
    var userInfo: Any? get() = definedExternally; set(value) = definedExternally
    var applicationIconBadgeNumber: Number? get() = definedExternally; set(value) = definedExternally
}
external interface ScheduleLocalNotificationDetails {
    var fireDate: Date
    var alertBody: String
    var alertAction: String
    var soundName: String? get() = definedExternally; set(value) = definedExternally
    var category: String? get() = definedExternally; set(value) = definedExternally
    var userInfo: Any? get() = definedExternally; set(value) = definedExternally
    var applicationIconBadgeNumber: Number? get() = definedExternally; set(value) = definedExternally
}
external interface FetchResult {
    var NewData: String /* "UIBackgroundFetchResultNewData" */
    var NoData: String /* "UIBackgroundFetchResultNoData" */
    var ResultFailed: String /* "UIBackgroundFetchResultFailed" */
}
external interface PushNotificationIOSStatic {
    fun presentLocalNotification(details: PresentLocalNotificationDetails)
    fun scheduleLocalNotification(details: ScheduleLocalNotificationDetails)
    fun cancelAllLocalNotifications()
    fun cancelLocalNotifications(userInfo: Any)
    fun setApplicationIconBadgeNumber(number: Number)
    fun getApplicationIconBadgeNumber(callback: (badge: Number) -> Unit)
    fun getScheduledLocalNotifications(callback: (notifications: Array<ScheduleLocalNotificationDetails>) -> Unit)
    fun addEventListener(type: String /* "notification" */, handler: (notification: PushNotification) -> Unit)
    fun addEventListener(type: String /* "localNotification" */, handler: (notification: PushNotification) -> Unit)
    fun addEventListener(type: String /* "register" */, handler: (notification: PushNotification) -> Unit)
    fun addEventListener(type: String /* "registrationError" */, handler: (notification: PushNotification) -> Unit)
    fun removeEventListener(type: String /* "notification" */, handler: (notification: PushNotification) -> Unit)
    fun removeEventListener(type: String /* "localNotification" */, handler: (notification: PushNotification) -> Unit)
    fun removeEventListener(type: String /* "register" */, handler: (notification: PushNotification) -> Unit)
    fun removeEventListener(type: String /* "registrationError" */, handler: (notification: PushNotification) -> Unit)
    fun requestPermissions(permissions: Array<PushNotificationPermissions>? = definedExternally /* null */)
    fun requestPermissions(permissions: PushNotificationPermissions? = definedExternally /* null */): Promise<PushNotificationPermissions>
    fun abandonPermissions()
    fun checkPermissions(callback: (permissions: PushNotificationPermissions) -> Unit)
    fun getInitialNotification(): Promise<PushNotification>
    var FetchResult: FetchResult
}
external interface SettingsStatic {
    fun get(key: String): Any
    fun set(settings: Any)
    fun watchKeys(keys: String, callback: () -> Unit): Number
    fun watchKeys(keys: Array<String>, callback: () -> Unit): Number
    fun clearWatch(watchId: Number)
}
external interface StatusBarPropertiesIOS {
    var barStyle: dynamic /* String /* "default" */ | String /* "light-content" */ | String /* "dark-content" */ */ get() = definedExternally; set(value) = definedExternally
    var networkActivityIndicatorVisible: Boolean? get() = definedExternally; set(value) = definedExternally
    var showHideTransition: dynamic /* String /* "slide" */ | String /* "fade" */ */ get() = definedExternally; set(value) = definedExternally
}
external interface StatusBarPropertiesAndroid {
    var backgroundColor: String? get() = definedExternally; set(value) = definedExternally
    var translucent: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface StatusBarProperties : StatusBarPropertiesIOS, StatusBarPropertiesAndroid {
    var animated: Boolean? get() = definedExternally; set(value) = definedExternally
    var hidden: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface StatusBarStatic : ComponentClass<StatusBarProperties> {
    var currentHeight: Number? get() = definedExternally; set(value) = definedExternally
    var setHidden: (hidden: Boolean, animation: dynamic /* String /* "none" */ | String /* "slide" */ | String /* "fade" */ */ /*= null*/) -> Unit
    var setBarStyle: (style: dynamic /* String /* "default" */ | String /* "light-content" */ | String /* "dark-content" */ */, animated: Boolean? /*= null*/) -> Unit
    var setNetworkActivityIndicatorVisible: (visible: Boolean) -> Unit
    var setBackgroundColor: (color: String, animated: Boolean? /*= null*/) -> Unit
    var setTranslucent: (translucent: Boolean) -> Unit
}
external interface StatusBarIOSStatic : NativeEventEmitter
external interface TimePickerAndroidOpenOptions {
    var hour: Number? get() = definedExternally; set(value) = definedExternally
    var minute: Number? get() = definedExternally; set(value) = definedExternally
    var is24Hour: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface `T$56` {
    var action: String
    var hour: Number
    var minute: Number
}
external interface TimePickerAndroidStatic {
    fun open(options: TimePickerAndroidOpenOptions): Promise<`T$56`>
    var timeSetAction: String
    var dismissedAction: String
}
external interface ToastAndroidStatic {
    fun show(message: String, duration: Number)
    fun showWithGravity(message: String, duration: Number, gravity: Number)
    var SHORT: Number
    var LONG: Number
    var TOP: Number
    var BOTTOM: Number
    var CENTER: Number
}
external interface `T$57` {
    var width: Number? get() = definedExternally; set(value) = definedExternally
    var height: Number? get() = definedExternally; set(value) = definedExternally
    var format: dynamic /* String /* "png" */ | String /* "jpeg" */ */ get() = definedExternally; set(value) = definedExternally
    var quality: Number? get() = definedExternally; set(value) = definedExternally
}
external interface UIManagerStatic {
    var takeSnapshot: (view: dynamic /* String /* "window" */ | ReactElement<Any> | Number */ /*= null*/, options: `T$57`? /*= null*/) -> Promise<String>
    fun measure(node: Number, callback: (x: Number, y: Number, width: Number, height: Number, pageX: Number, pageY: Number) -> Unit)
    fun measureInWindow(node: Number, callback: (x: Number, y: Number, width: Number, height: Number) -> Unit)
    fun measureLayout(node: Number, relativeToNativeNode: Number, onFail: () -> Unit, onSuccess: (left: Number, top: Number, width: Number, height: Number) -> Unit)
    fun setLayoutAnimationEnabledExperimental(value: Boolean)
}
external interface SwitchPropertiesIOS : ViewProperties {
    var onTintColor: String? get() = definedExternally; set(value) = definedExternally
    var thumbTintColor: String? get() = definedExternally; set(value) = definedExternally
    var tintColor: String? get() = definedExternally; set(value) = definedExternally
}
external interface SwitchProperties : SwitchPropertiesIOS {
    var disabled: Boolean? get() = definedExternally; set(value) = definedExternally
    var onValueChange: ((value: Boolean) -> Unit)? get() = definedExternally; set(value) = definedExternally
    override var testID: String? get() = definedExternally; set(value) = definedExternally
    var value: Boolean? get() = definedExternally; set(value) = definedExternally
    override var style: dynamic /* Boolean | ViewStyle | Number /* Number & `T$5` */ | RecursiveArray<dynamic /* Boolean | ViewStyle | Number /* Number & `T$5` */ */> */ get() = definedExternally; set(value) = definedExternally
}
external interface SwitchStatic : NativeMethodsMixinStatic, ClassicComponentClass<SwitchProperties>
external interface VibrationIOSStatic {
    fun vibrate()
}
external interface VibrationStatic {
    fun vibrate(pattern: Number, repeat: Boolean)
    fun vibrate(pattern: Array<Number>, repeat: Boolean)
    fun cancel()
}
external interface EasingStatic {
    var step0: (value: Number) -> Number
    var step1: (value: Number) -> Number
    var linear: (value: Number) -> Number
    var ease: (value: Number) -> Number
    var quad: (value: Number) -> Number
    var cubic: (value: Number) -> Number
    var poly: (value: Number) -> Number
    var sin: (value: Number) -> Number
    var circle: (value: Number) -> Number
    var exp: (value: Number) -> Number
    fun elastic(bounciness: Number): (value: Number) -> Number
    fun back(s: Number): (value: Number) -> Number
    var bounce: (value: Number) -> Number
    fun bezier(x1: Number, y1: Number, x2: Number, y2: Number): (value: Number) -> Number
    fun `in`(easing: (value: Number) -> Number): (value: Number) -> Number
    fun out(easing: (value: Number) -> Number): (value: Number) -> Number
    fun inOut(easing: (value: Number) -> Number): (value: Number) -> Number
}
external interface I18nManagerStatic {
    var isRTL: Boolean
    var allowRTL: (allowRTL: Boolean) -> Any
    var forceRTL: (forceRTL: Boolean) -> Any
}
external interface GeolocationStatic {
    fun getCurrentPosition(geo_success: (position: GeolocationReturnType) -> Unit, geo_error: ((error: GeolocationError) -> Unit)? = definedExternally /* null */, geo_options: GeoOptions? = definedExternally /* null */)
    fun watchPosition(success: (position: GeolocationReturnType) -> Unit, error: ((error: GeolocationError) -> Unit)? = definedExternally /* null */, options: GeoOptions? = definedExternally /* null */): Number
    fun clearWatch(watchID: Number)
    fun stopObserving()
    fun requestAuthorization()
    fun setRNConfiguration(config: GeoConfiguration)
}
external interface OpenCameraDialogOptions {
    var videoMode: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface OpenSelectDialogOptions {
    var showImages: Boolean? get() = definedExternally; set(value) = definedExternally
    var showVideos: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface ImagePickerIOSStatic {
    fun canRecordVideos(callback: (value: Boolean) -> Unit)
    fun canUseCamera(callback: (value: Boolean) -> Unit)
    fun openCameraDialog(config: OpenCameraDialogOptions, successCallback: (args: dynamic /* JsTuple<String, Number, Number> */) -> Unit, cancelCallback: (args: Array<Any>) -> Unit)
    fun openSelectDialog(config: OpenSelectDialogOptions, successCallback: (args: dynamic /* JsTuple<String, Number, Number> */) -> Unit, cancelCallback: (args: Array<Any>) -> Unit)
}
external interface ImageStoreStatic {
    fun hasImageForTag(uri: String, callback: (hasImage: Boolean) -> Unit)
    fun removeImageForTag(uri: String)
    fun addImageFromBase64(base64ImageData: String, success: (uri: String) -> Unit, failure: (error: Any) -> Unit)
    fun getBase64ForTag(uri: String, success: (base64ImageData: String) -> Unit, failure: (error: Any) -> Unit)
}
external interface NativeEventSubscription {
    fun remove()
}
external interface `T$63` {
    var x: Number
    var y: Number
}
external interface ImageCropData {
    var offset: `T$63`
    var size: `T$2`
    var displaySize: `T$2`? get() = definedExternally; set(value) = definedExternally
    var resizeMode: dynamic /* String /* "stretch" */ | String /* "contain" */ | String /* "cover" */ */ get() = definedExternally; set(value) = definedExternally
}
external interface ImageEditorStatic {
    fun cropImage(uri: String, cropData: ImageCropData, success: (uri: String) -> Unit, failure: (error: Any) -> Unit)
}
external interface ARTShapeProps {
    var d: String
    var strokeWidth: Number
    var strokeDash: Array<Number>? get() = definedExternally; set(value) = definedExternally
    var stroke: String
}
external interface ARTSurfaceProps {
    var style: dynamic /* Boolean | ViewStyle | Number /* Number & `T$5` */ | RecursiveArray<dynamic /* Boolean | ViewStyle | Number /* Number & `T$5` */ */> */
    var width: Number
    var height: Number
}
external interface ShapeStatic : ComponentClass<ARTShapeProps>
external interface SurfaceStatic : ComponentClass<ARTSurfaceProps>
external interface ARTStatic {
    var Shape: ShapeStatic
    var Surface: SurfaceStatic
}
external interface KeyboardStatic : NativeEventEmitter {
    var dismiss: () -> Unit
}
external interface NativeModulesStatic {
    @nativeGetter
    operator fun get(name: String): Any?
    @nativeSetter
    operator fun set(name: String, value: Any)
}
external interface ComponentInterface<P> {
    var name: String? get() = definedExternally; set(value) = definedExternally
    var displayName: String? get() = definedExternally; set(value) = definedExternally
    var propTypes: P
}
external interface `T$64` {
    var nativeOnly: Any? get() = definedExternally; set(value) = definedExternally
}
external interface ErrorUtils {
    var setGlobalHandler: (callback: (error: Any, isFatal: Boolean? /*= null*/) -> Unit) -> Unit
    var getGlobalHandler: () -> (error: Any, isFatal: Boolean? /*= null*/) -> Unit
}

external interface INativeEventEmitter : EventEmitter

open external class NativeEventEmitter : INativeEventEmitter {
    override fun addListener(eventType: String, listener: (args: Any) -> Any, context: Any?): EmitterSubscription
    override fun once(eventType: String, listener: (args: Any) -> Any, context: Any): EmitterSubscription
    override fun removeAllListeners(eventType: String?)
    override fun removeCurrentListener()
    override fun removeSubscription(subscription: EmitterSubscription)
    override fun listeners(eventType: String): Array<EmitterSubscription>
    override fun emit(eventType: String, vararg params: Any)
    override fun removeListener(eventType: String, listener: (args: Any) -> Any)
}