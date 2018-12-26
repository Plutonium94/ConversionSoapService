package fr.mbds;

import javax.jws.WebService;
import javax.jws.WebMethod;

@WebService
public class ConversionService {


	public ConversionService() {

	}

	@WebMethod
	public double fractionToPercentage(int numerator, int denominator) {
		return (numerator * 100.0)/denominator;
	}

	@WebMethod
	public double toKph(double speedMps) {
		return speedMps * 18/5;
	}

	@WebMethod
	public double toMps(double speedKph) {
		return speedKph * 5/18;
	}

	@WebMethod
	public double feetToMetres(double feet) {
		return feet * 0.3048;
	}




}