import js.externals.mocha.*
import js.externals.mocha.context

import js.externals.mocha.kotlinUtils.*
import js.externals.mocha.specify
import kotlin.js.Promise

fun <T> assertEquals(a: T, b: T, message: String = "") {
    if (!a!!.equals(b)) throw Error(message)
}

class Calc {
    fun add(i: Int, j: Int) = i + j
    fun mul(i: Int, j: Int) = i * j
}

fun main(a: Array<String>) {
    SimpleTest().run {
        test_simple()
        test_describe()
        test_context()
        test_suite()
        test_specify()
        test_it()
        test_test()
        test_before()
        test_beforeEach()
        test_after()
        test_afterEach()
        test_setup()
        test_suiteSetup()
        test_teardown()
        test_suiteTeardown()
    }
}

class SimpleTest {
    fun test_simple() {

        val calcInstance = Calc()

        describe("Calc test") {
            describe("Additional test") {
                it("returns 1 + 1 == 2") {
                    assertEquals(calcInstance.add(1, 1), 2)
                }
                xit("returns 1 + 2 == 3") {
                    assertEquals(calcInstance.add(1, 2), 3)
                }
                xit("returns 1 + 4 == 5") {
                    assertEquals(calcInstance.add(1, 4), 5)
                }
            }

            describe("Multiplication test") {
                it("returns 2 * 2 == 4") {
                    assertEquals(calcInstance.mul(2, 2), 4)
                }
            }
        }
    }

    //
    fun test_describe() {
        describe("TEST_DESCRIBE") {
            describe("does something") { }

//        describe.only("does something ONLY") { }
//
            describe.skip("does something SKIP") { promise(10) }

            describe("does something CONTEXT") { retries(3).slow(1000).timeout(2000).retries(3) }
        }
    }

    //
    fun test_context() {
        describe("TEST_CONTEXT") {
            context("some context") { }

//            context.only("some context") { }

            context.skip("some context SKIP") { }

            context("some context CONTEXT") { retries(3).slow(1000).timeout(2000).retries(3) }
        }
    }

    fun test_suite() {
        describe("TEST_SUITE") {
            suite("some context") { }

//        suite.only("some context") { }

            suite.skip("some context SKIP") { }

            suite("some context CONTEXT") { retries(3).slow(1000).timeout(2000).retries(3) }
        }
    }


    fun test_it() {

        describe("TEST_IT") {
            xit.async("x async does something timeout") { d -> d() }.timeout("2s")

            it("does something TLS") { set("sharedState", true) }

            xit.async("x async does something") { done -> done() }

            it("promise does something OK") { Promise.resolve<Nothing?>(null) }
            it("promise does something ERROR") { Promise.reject(Throwable("some error")) }

//            it.only("does something ONLY") { promise(1) }

            // TODO: see issue KT-25474
            it.skip.invoke("does something SKIP") { promise(2) }

            it("does something Context") { retries(3).slow(1000).timeout(2000).skip() }
        }
    }


    fun promise(v: Int) = Promise<Int> { resolve, reject ->
        js("setTimeout")({ resolve(v) }, 100)
    }

    fun test_test() {

        describe("TEST_TEST") {
            test("does something") { }

            test("does something Context") { set("sharedState", true) }

            test.async("async does something OK") { done -> done() }
            test.async("async does something ERROR") { done -> done() }

            test("promise does something OK") { Promise.resolve<Nothing?>(null) }
            test("promise does something ERROR") { Promise.reject(Throwable("some error")) }
//
//        test.only("does something ONLY") { }
//        test.only.async("async does something OK ONLY") { d -> d() }
//        test.only.async("async does something ERROR ONLY") { d -> d("ERROR") }
//
            // TODO: see issue KT-25474
            test.skip.invoke("SKIP does something") {}

            test("does something") { retries(3).slow(1000).timeout(2000).skip() }
        }
    }

    fun test_specify() {
        describe("TEST_SPECIFY") {
            specify("does something") {}
            specify.async("async does something") { d -> d() }

            specify("does something") { set("sharedState", true) }

            specify("does something PROMISE PASSED") { Promise.resolve<Nothing?>(null) }
            specify("does something PROMISE ERRROR") { Promise.reject(Throwable("some error")) }

//            specify.only("does something ONLY", { })
//            specify.only.async("async does something ONLY", { d-> d() })

            // TODO: see issue KT-25474
            specify.skip.invoke("does something SKIP") { }

            specify("does something") { retries(3).slow(1000).timeout(2000).skip() }
        }
    }

    fun test_before() {
        describe("TEST_BEFORE") {
            before { }

            before { set("sharedState", true) }

            before.async { done -> done() }

            before { Promise.resolve<Nothing?>(null) }
//        before { Promise.reject(Throwable("some error")) }

            before("my description") { }

            before.async("my description") { done -> done() }

            before("my description") { Promise.resolve<Nothing?>(null) }
//        before("my description") { Promise.reject(Throwable("some error")) }

            before("my description") { timeout(2000).skip() }
        }
    }

    fun test_setup() {
        describe("TEST_SETUP") {
            setup { }

            setup {}

            setup.async { done -> done() }

            setup { Promise.resolve<Nothing?>(null) }
        }
    }

    fun test_after() {
        describe("TEST_AFTER") {
            after { }

            after { set("sharedState", true) }

            after.async { done -> done() }

            after { Promise.resolve<Nothing?>(null) }

            after("my description") { }

            after.async("async my description") { done -> done() }

            after("my description CONTEXT") { Promise.resolve<Nothing?>(null) }
        }
    }

    fun test_teardown() {
        describe("TEST_TEARDOWN") {
            teardown { }

            teardown { set("sharedState", true) }

            teardown.async { done -> done() }

            teardown { Promise.resolve<Nothing?>(null) }
        }
    }

    fun test_beforeEach() {
        describe("TEST_BEFORE") {
            beforeEach { }

            beforeEach { set("sharedState", true) }

            beforeEach.async { done -> done() }

            beforeEach { Promise.resolve<Nothing?>(null) }

            beforeEach("my description") { }

            beforeEach.async("my description") { done -> done() }

            beforeEach("my description") { Promise.resolve<Nothing?>(null) }
        }
    }

    fun test_suiteSetup() {
        suiteSetup { }

        suiteSetup { set("sharedState", true) }

        suiteSetup.async { done -> done() }

        suiteSetup { Promise.resolve<Nothing?>(null) }
    }

    fun test_suiteTeardown() {
        suiteTeardown { }

        suiteTeardown { set("sharedState", true) }

        suiteTeardown.async { done -> done() }

        suiteTeardown { Promise.resolve<Nothing?>(null) }
    }

    fun test_afterEach() {
        afterEach { }

        afterEach { set("sharedState", true) }

        afterEach.async { done -> done() }

        afterEach { Promise.resolve<Nothing?>(null) }

        afterEach("my description") { }

        afterEach.async("my description") { done -> done() }

        afterEach("my description") { Promise.resolve<Nothing?>(null) }
    }
}