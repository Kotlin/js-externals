package js.externals.paho_mqtt

external object Paho {
    object MQTT {
        class Client(hostname: String, port: Int, clientId: String) {
            val hostname: String
            val port: Int
            val clientId: String
            fun connect(options: Options)
            fun send(message: Message)
            fun subscribe(destination: String)
            fun disconnect()
            var onMessageArrived: (msg: Message) -> Unit
            var onConnectionLost: (response: Response) -> Unit
        }

        class Message(payloadString: String) {
            val payloadString: String
            var destinationName: String
        }

        class Response {
            val errorCode: Int
            val errorMessage: String
        }

        interface Options {
            var userName: String
            var password: String
            var reconnect: Boolean
            var useSSL: Boolean
            var onSuccess: (response: dynamic) -> Unit
            var onFailure: (response: Response) -> Unit
        }
    }
}

object PahoTest {
    fun tryit(conf:dynamic) {
        val client = Paho.MQTT.Client(conf.hostname, conf.port, conf.params["clientId"]!!)
        val opt: Paho.MQTT.Options = js("({})")
        opt.userName = conf.username
        opt.password = conf.password
        opt.onSuccess = {
            println("SUCCESS")
            client.subscribe("destination1")
            client.send(Paho.MQTT.Message("debug: hello world").also { it.destinationName = "destination2" })
        }
        opt.onFailure = { println("FAILURE ${it.errorCode} ${it.errorMessage}") }
        opt.reconnect = true
        opt.useSSL = true



        client.onMessageArrived = { println("payload=${it.payloadString}") }

        client.connect(opt)
    }
}