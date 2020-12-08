import java.net._
import java.io._

Object Server extends App
    val server = new ServerSocket(8080)

    while (true) {
            var socket = server.accept()
            var input = new Buffered Reader(new InputStreamReader(socket.getInputStream())).lines()
            var line = ""
            var line2 = ""
    }