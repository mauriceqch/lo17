package main;

import java.io.IOException;
import java.util.Map;

import fi.iki.elonen.NanoHTTPD;

public class HttpApp extends NanoHTTPD {
	public HttpApp() throws IOException {
        super(8080);
        start(NanoHTTPD.SOCKET_READ_TIMEOUT, false);
        System.out.println("\nRunning! Point your browsers to http://localhost:8080/ \n");
    }

    public static void main(String[] args) {
        try {
            new HttpApp();
        } catch (IOException ioe) {
            System.err.println("Couldn't start server:\n" + ioe);
        }
    }

    @Override
    public Response serve(IHTTPSession session) {
        String msg = "";
        Map<String, String> parms = session.getParms();
        String query = parms.get("query");
		if (query != null) {
            msg += InputHandler.handleInput(query);
        }
        Response resp = newFixedLengthResponse(msg);
        resp.setMimeType("application/json");;
        
        return resp;
    }
}
