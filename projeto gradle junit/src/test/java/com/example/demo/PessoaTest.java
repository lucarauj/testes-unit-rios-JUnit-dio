package com.example.demo;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.example.demo.Pessoa;

class PessoaTest {

	@Test
	void validarCalculoIdade() {
		Pessoa pessoa = new Pessoa("Julia", LocalDate.of(2020, 1, 1));
		Assertions.assertEquals(2, pessoa.getIdade());
	}

}
