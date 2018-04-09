import js.externals.mocha.Mocha.Mocha
import js.externals.mocha.Mocha.`T$0`
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
    val m = Mocha(object : `T$0` {})
    m.checkLeaks()
    m.invert().invert().invert()

}

fun testGitSample() {
    describe("Calc test") { _ ->
        describe("Additional test") { _ ->
            it("returns 1 + 1 == 2") { _, done ->
                assert(add(1, 1) == 2)
                done(null)
            }
        }

        describe("Multiplication test") { _ ->
            it("returns 2 * 2 == 4") { _, done ->
                assert(mul(2, 2) == 4)
                done("")
            }
        }
    }
}