package com.masivian.test.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import calculator.wsdl.Add;
import calculator.wsdl.AddResponse;
import calculator.wsdl.Divide;
import calculator.wsdl.DivideResponse;
import calculator.wsdl.Multiply;
import calculator.wsdl.MultiplyResponse;
import calculator.wsdl.Subtract;
import calculator.wsdl.SubtractResponse;

/**
 * 
 * @author Miguel Osorio.
 *
 */
public class CalculatorClient extends WebServiceGatewaySupport {
	
	private static final Logger log = LoggerFactory.getLogger(CalculatorClient.class);
	
	private final String URL_SOAP="http://www.dneonline.com/calculator.asmx";
	
	private final String BASE_SOAP_ACTION_HEADER= "http://tempuri.org";
	
	public AddResponse add(int valueA, int valueB) {
			Add request = new Add();
			request.setIntA(valueA);
			request.setIntB(valueB);
			
			log.info("Requesting AddResponse");
			AddResponse response = (AddResponse) getWebServiceTemplate()
					.marshalSendAndReceive(URL_SOAP, request,
							new SoapActionCallback(
									BASE_SOAP_ACTION_HEADER.concat("/Add")));
			
			return response;
	}
	
	public SubtractResponse subtract(int valueA, int valueB) {
		Subtract request = new Subtract();
		request.setIntA(valueA);
		request.setIntB(valueB);
		
		log.info("Requesting SubtractResponse");
		SubtractResponse response = (SubtractResponse) getWebServiceTemplate()
				.marshalSendAndReceive(URL_SOAP, request,
						new SoapActionCallback(
								BASE_SOAP_ACTION_HEADER.concat("/Subtract")));
		
		return response;
	}
	
	public DivideResponse divide(int valueA, int valueB) {
		Divide request = new Divide();
		request.setIntA(valueA);
		request.setIntB(valueB);
		
		log.info("Requesting DivideResponse");
		DivideResponse response = (DivideResponse) getWebServiceTemplate()
				.marshalSendAndReceive(URL_SOAP, request,
						new SoapActionCallback(
								BASE_SOAP_ACTION_HEADER.concat("/Divide")));
		return response;
	}
	
	public MultiplyResponse multiply(int valueA, int valueB) {
		Multiply request = new Multiply();
		request.setIntA(valueA);
		request.setIntB(valueB);
		
		log.info("Requesting MultiplyResponse");
		MultiplyResponse response = (MultiplyResponse) getWebServiceTemplate()
				.marshalSendAndReceive(URL_SOAP, request,
						new SoapActionCallback(
								BASE_SOAP_ACTION_HEADER.concat("/Multiply")));
		return response;
	}

}
