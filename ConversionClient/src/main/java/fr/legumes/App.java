package fr.legumes;

import javax.xml.ws.WebServiceRef;
import javax.xml.ws.Service;
import javax.xml.namespace.QName;
import java.net.URL;
import java.net.MalformedURLException;

import fr.mbds.ConversionServiceService;
import fr.mbds.ConversionService;

/**
 * Hello world!
 *
 */
public class App {



	public static void main( String[] args ) {
		ConversionServiceService css = new ConversionServiceService();
		ConversionService conv = css.getConversionServicePort();
		System.out.println("6 feet = " + conv.feetToMetres(6) + " metres");
		System.out.println("80 kph = " + conv.toMps(80) + " mps");
		System.out.println("2/5 = " + conv.fractionToPercentage(2, 5) + "%");

    }
}
