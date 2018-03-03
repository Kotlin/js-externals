import js.externals.paho_mqtt.Paho

fun test() {
    val hostname = "example.com"
    val port = 8888
    val clientId = "client1"
    val username = "foo"
    val password = "secret1"

    val client = Paho.MQTT.Client(hostname, port, clientId)
    val opt: Paho.MQTT.ConnectOptions = js("({})")
    opt.userName = username
    opt.password = password
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

