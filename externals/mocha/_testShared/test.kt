import js.externals.mocha.Mocha.Mocha
import js.externals.mocha.Mocha.MochaOptions
import js.externals.mocha.Mocha.describe
import js.externals.mocha.Mocha.it

fun assert(b: Boolean, message: String = "") {
    if (!b) throw Error(message)
}

fun add(i: Int, j: Int) = i + j
fun mul(i: Int, j: Int) = i * j

fun testMocha() {
    Mocha()
    Mocha(null)
    val m = Mocha(object : MochaOptions {})
    m.checkLeaks()
    m.invert().invert().invert()

}

fun testGitSample() {
    describe("Calc test") {
        describe("Additional test") {
            it("returns 1 + 1 == 2") {
                assert(add(1, 1) == 2)
            }
            it("returns 1 + 1 == 2") {d ->
                assert(add(1, 1) == 2)
                d()
            }
            it("returns 1 + 1 == 2") {d ->
                assert(add(1, 1) == 2)
                d("msg")
            }
        }

        describe("Multiplication test") {
            it("returns 2 * 2 == 4") {
                assert(mul(2, 2) == 4)
            }
        }
    }
}