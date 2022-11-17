package testing.demo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import testing.demo.Entity.Employes;
import testing.demo.Service.myService;

@SpringBootTest
public class ServiceTest {

	@Mock
	private myService service;
	
	@Test
	public void serviceTest()
	{
		when(service.getAllEmployes()).thenReturn(Stream.of(new Employes(1236,"Praveen","Male"),new Employes(12367,"seetha","Female")).collect(Collectors.toList()));
		  assertEquals(2,service.getAllEmployes().size());
	}
	

	
}
