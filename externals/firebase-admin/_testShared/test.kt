import js.externals.firebase.admin.credential.*

fun test() {
    val credential = applicationDefault()
    println(credential)
}