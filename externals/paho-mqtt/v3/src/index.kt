// headers for Paho JavaScript Client
// The Paho JavaScript Client is an MQTT browser-based client library written in Javascript that uses WebSockets to connect to an MQTT Broker.
// https://github.com/eclipse/paho.mqtt.javascript
// Contributed by: Jako <simone.giacomelli@gmail.com>

package js.externals.paho_mqtt

external object Paho {
    object MQTT {
        class Client(host: String, port: Int, clientId: String) {
            val host: String
            val port: Int
            val clientId: String
            fun connect(connectOptions: ConnectOptions)
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

        interface Response {
            val errorCode: Int
            val errorMessage: String
        }

        interface ConnectOptions {
            var userName: String
            var password: String
            var reconnect: Boolean
            var useSSL: Boolean
            var onSuccess: (response: dynamic) -> Unit
            var onFailure: (response: Response) -> Unit
        }
    }
}
