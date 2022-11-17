package testing.demo;

import static org.junit.Assert.assertNotNull;

import java.net.URI;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.web.util.UriComponentsBuilder;



@SpringBootTest()
public class ControllerTest {
	
	

	
	@Test
	@DisplayName("controller test")
	void testController(){
   TestRestTemplate restTemplate =new TestRestTemplate();
	URI targetUrl = UriComponentsBuilder.fromUriString("http://localhost:8080/allemployes")
	.build()
	.encode()
	.toUri();

	String message =restTemplate.getForObject(targetUrl, String.class);
	
    //assertNotNull(message);
	}
	
}
