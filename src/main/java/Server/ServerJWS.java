package Server;

import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

public class ServerJWS {
    public static void main(String[] args) {
        String url = "http://0.0.0.0:5566/";
        Endpoint.publish("http://0.0.0.0:5566/", new BanqueService());
        System.out.println("Web service is ready on "+url);
    }
}