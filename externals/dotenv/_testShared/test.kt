import js.externals.dotenv.Dotenv
import org.khronos.webgl.ArrayBuffer

fun configHasDefaultOptions() {
    Dotenv.config()
}

fun configAcceptsCustomPath() {
    Dotenv.config(object : Dotenv.DotenvOptions {
        override val path = ".vne"
    })
}

fun configAcceptsCustomEncoding() {
    Dotenv.config(object : Dotenv.DotenvOptions {
        override val encoding = "UTF-8"
    })
}

fun loadCanForceReadingOfEnvFile() {
    val env = Dotenv.config()

    env.load()
}

fun variableCanBeRetrievedUsingGetOperation() {
    val env = Dotenv.config()

    check(env["KOTLIN_VERSION"] == "1.2")
}

fun parseCanExtractVariablesFromString() {
    val env = Dotenv.parse("ONE=1\nTWO=2")

    check(env["ONE"] == "1")
    check(env["TWO"] == "2")
}

fun parseCanExtractVariablesFromBuffer() {
    Dotenv.parse(ArrayBuffer(2))
}
