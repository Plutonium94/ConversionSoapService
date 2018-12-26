package fr.mbds;

import javax.xml.ws.Endpoint;

/**
 * Hello world!
 *
 */
public class App {

	public static final String ENDPOINT_URL = "http://localhost:9900/ws/conv";

    public static void main( String[] args ) {
    	Endpoint.publish("http://localhost:9900/ws/conv", new ConversionService());
        System.out.println( "Conversion service ready. WSDL at: " + ( ENDPOINT_URL + "?wsdl" ));
    }
}
