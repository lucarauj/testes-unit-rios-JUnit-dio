package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
//import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

//@TestMethodOrder(MethodOrderer.OrderAnnotation.class) //executa os testes pela ordem da anotação @Order()
//@TestMethodOrder(MethodOrderer.MethodName.class) //executa os testes pelo nome do método
//@TestMethodOrder(MethodOrderer.Random.class) //executa os testes de forma aleatória
@TestMethodOrder(MethodOrderer.DisplayName.class)
public class OrdemTest {
	
//	@Order(4)
	@DisplayName("A")
	@Test
	void validaFluxoA() {
		Assertions.assertTrue(true);
		System.out.println("Rodou Fluxo A");
	}
	
//	@Order(2)
	@DisplayName("B")
	@Test
	void validaFluxoB() {
		Assertions.assertTrue(true);
		System.out.println("Rodou Fluxo B");
	}
	
//	@Order(1)
	@DisplayName("C")
	@Test
	void validaFluxoC() {
		Assertions.assertTrue(true);
		System.out.println("Rodou Fluxo C");
	}
	
//	@Order(3)
	@DisplayName("D")
	@Test
	void validaFluxoD() {
		Assertions.assertTrue(true);
		System.out.println("Rodou Fluxo D");
	}

}
