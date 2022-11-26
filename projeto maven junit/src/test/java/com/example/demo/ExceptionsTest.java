package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTest {
	
	@Test
	void validaCenarioDeExcecaoNaTransferencia() {
		Conta contaOrigem = new Conta("12345", 0);
		Conta contaDestino = new Conta("00167", 100);
		
		TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();
		
		// Verifica se vai lançar excessão
//		Assertions.assertThrows(IllegalArgumentException.class, () -> 
//		
//			transferenciaEntreContas.transfere(contaOrigem, contaDestino, -1));
		
		// Verifica se não vai lançar excessão
		Assertions.assertDoesNotThrow(() ->  
		
			transferenciaEntreContas.transfere(contaOrigem, contaDestino, -1));
	}

}
