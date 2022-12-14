package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class PessoaTest {

    @Test
    void deveCalcularIdadeCorretamente() {
    	Pessoa jessica = new Pessoa("Jéssica", LocalDateTime.of(2000, 1, 1, 15, 0, 0));
    	Assertions.assertEquals(22, jessica.getIdade());
    }
    
    @Test
    void deveRetornarSeEhMaiorDeIdade() {
    	Pessoa jessica = new Pessoa("Jéssica", LocalDateTime.of(2000, 1, 1, 15, 0, 0));
    	Assertions.assertTrue(jessica.ehMaiorDeIdade());
    	
	    Pessoa joao = new Pessoa("João", LocalDateTime.now());
	    Assertions.assertFalse(joao.ehMaiorDeIdade());
	    
	    Assertions.assertSame(jessica, joao);
    }
    
    
    @Test
    void validaIgualdadeDoObjeto() {
        Pessoa pessoa1 = new Pessoa("Lucas", LocalDateTime.now());
        Pessoa pessoa2 = new Pessoa("Lucas", LocalDateTime.now());
        Assertions.assertSame(pessoa1, pessoa2);
    }
    
}