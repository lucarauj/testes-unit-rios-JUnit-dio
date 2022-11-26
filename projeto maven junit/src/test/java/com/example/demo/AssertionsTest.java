package com.example.demo;

import java.time.LocalDateTime;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*; //importação estática -> todos

public class AssertionsTest {
	
	@Test
	void validarLancamentos() {
		
		int[] primeiroLancamento = {10, 20, 30, 40, 50};
		int[] segundoLancamento = {10, 5, 2, 3, 10};
		
//		Assertions.assertArrayEquals(primeiroLancamento, segundoLancamento); //verifica se os Arrays são iguais
		assertNotEquals(primeiroLancamento, segundoLancamento); //verifica se os Arrays são diferentes
	}
	
	@Test
	void validarSeObjetoEstaNulo() {
		
		Pessoa pessoa = null;
		assertNull(pessoa); //verifica se o Objeto está nulo
		
		pessoa = new Pessoa("Lucas", LocalDateTime.now());
		assertNotNull(pessoa); //verifica se o Objeto não está nulo
	}
	
	@Test
	void validarNumerosDeTiposDiferentes() {
		
		double valor = 5.0;
		double outroValor = 5.0;
		assertEquals(valor, outroValor);
	}

}
