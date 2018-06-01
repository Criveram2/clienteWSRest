package clienteWS;

import org.springframework.web.client.RestTemplate;

public class ClienteWSGet {

	public static void main(String[] args) {
String url ="http://localhost:8080/webServicePrueba/Person";  
		RestTemplate restTemplate = new RestTemplate();
		String string = (String) restTemplate.getForObject(url + "/1030642757", String.class);
          System.out.println(string);

	}

}
