import js.externals.firebase.functions.providers.analytics.AnalyticsEvent
import js.externals.firebase.functions.providers.firestore.*

fun test() {
    val analyticsEvent = AnalyticsEvent()
    val firestoreDocument = document("/some/path")
}