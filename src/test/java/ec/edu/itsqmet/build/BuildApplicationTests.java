package ec.edu.itsqmet.build;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class InitSpringApplicationTests {
	
	@Test
	void testingBuilder() {
		Carro carro = Carro.builder().color("amarillo").build();
		Carro carro1 = Carro.builder().color("rojo").llantas(4).build();
		Carro carro2 = Carro.builder().color("verde").placa("ABC-123").llantas(3).build();
	}
}
