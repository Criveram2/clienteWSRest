package clienteWS;

import org.springframework.web.client.RestTemplate;

public class ClienteWSGetDatosReferenciados {

	public static void main(String[] args) {
		String endpoint = "http://localhost:8080/webServicePrueba/PersonId";
		
		RestTemplate restTemplate = new RestTemplate();
		Integer id = 1030642757;
		StringBuilder url= new StringBuilder();
		url.append(endpoint).append("?personId=").append(id);
				
		String string =  restTemplate.getForObject(url.toString(), String.class);
		System.out.println(string);
	}
}
