package com.example.demo;

import java.time.LocalDateTime;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConsultarDadosDePessoasTest {
	
	@BeforeAll
	static void configuraConexao() {
		BancoDeDados.iniciarConexao();
	}
	
	@BeforeEach //executa antes de cada teste
	void insereDadosParaTeste() {
		BancoDeDados.insereDados(new Pessoa("Jonas", LocalDateTime.now()));
	}
	
	@AfterEach //executa depois de cada teste
	void removeDadosDoTeste() {
		BancoDeDados.removeDados(new Pessoa("Jonas", LocalDateTime.now()));
	}
	
	@Test
	void validarDadosDeRetorno() {
		Assertions.assertTrue(true);
	}
	
	@Test
	void outroTesteDevalidarDadosDeRetorno() {
		Assertions.assertNull(null);
	}
	
	@AfterAll
	static void finalizaConexao() {
		BancoDeDados.finalizarConexao();
	}
	
	

}
