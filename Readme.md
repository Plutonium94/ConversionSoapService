# Conversion SOAP Service

A basic SOAP webservice that provides basic conversion operations like feet to metres, fractions to percentage etc.
The service along with a client are created using Java and **JAX-WS**.


## Launching the service
	cd conversion
	mvn package 
	mvn exec:java

## Launching the client
	cd ConversionClient
	wsimport -s target/generated-sources -d target/classes http://localhost:9900/ws/conv?wsdl
	mvn package
	mvn exec:java


#### Sample Results
6 feet = 1.8288 metres  
80 kph = 22.22 mps  
2/5 = 40.0 %  