package com.masivian.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.masivian.test.client.CalculatorClient;
import com.masivian.test.services.CalculatorService;
import com.masivian.test.services.ClientService;
import com.masivian.test.services.GeolocationService;
import com.masivian.test.services.dto.AddressDTO;
import com.masivian.test.services.dto.CalculatorDTO;
import com.masivian.test.services.dto.ClientDTO;
import com.masivian.test.services.dto.GeoDTO;

import calculator.wsdl.AddResponse;
import calculator.wsdl.DivideResponse;
import calculator.wsdl.MultiplyResponse;
import calculator.wsdl.SubtractResponse;

@SpringBootApplication
public class MasivianTestApplication {

	@Autowired
	private GeolocationService geolocationService;

	@Autowired
	private ClientService clientService;
	
	@Autowired
	private CalculatorClient calculatorClient;
	
	@Autowired
	private CalculatorService calculatorService;

	public static void main(String[] args) {
		SpringApplication.run(MasivianTestApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {

		return args -> {

			ResponseEntity<List<ClientDTO>> response = restTemplate.exchange(
					"https://jsonplaceholder.typicode.com/users", HttpMethod.GET, null,
					new ParameterizedTypeReference<List<ClientDTO>>() {
					});

			List<ClientDTO> clients = response.getBody();

			clients.forEach(clientDTO -> {

				AddressDTO addressDTO = clientDTO.getAddress();
				GeoDTO geoDTO = addressDTO.getGeo();

				geolocationService.save(geoDTO);
				clientService.save(clientDTO);

			});

			AddResponse addResponse = calculatorClient.add(2, 3);
			SubtractResponse subtractResponse = calculatorClient.subtract(2, 3);
			MultiplyResponse multiplyResponse = calculatorClient.multiply(2, 3);
			DivideResponse divideResponse = calculatorClient.divide(2, 2);
			CalculatorDTO calculatorDTO = new CalculatorDTO(addResponse.getAddResult(),
					subtractResponse.getSubtractResult(), divideResponse.getDivideResult(),
					multiplyResponse.getMultiplyResult());

			calculatorService.save(calculatorDTO);

		};
	}
	
}
