package js.externals.dotenv

import org.khronos.webgl.BufferDataSource

external object Dotenv {

    interface DotenvOptions {
        val path: String?
            get() = definedExternally

        val encoding: String?
            get() = definedExternally
    }

    interface DotenvResult {
        operator fun get(name: String): String?

        fun load()

    }

    fun config(options: DotenvOptions? = definedExternally): DotenvResult

    fun parse(text: String): DotenvResult

    fun parse(buffer: BufferDataSource): DotenvResult
}
