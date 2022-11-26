package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import static org.junit.jupiter.api.condition.JRE.*;


public class CondicionaisTest {
	
	@Test
//	@EnabledIfEnvironmentVariable(named = "USER", matches = "Lucas")
//	@EnabledOnOs(OS.WINDOWS) //executa se estiver no sistema operacional Windows
//	@EnabledOnOs(OS.LINUX) //executa se estiver no sistema operacional Linux
//	@EnabledOnJre(JAVA_17) //executa se tiver o Java_17		
//	@DisabledIfEnvironmentVariable(named = "USER", matches = "Lucas")
	
	@EnabledForJreRange(min=JAVA_8, max=JAVA_17) //executa se tiver entre o Java_8 e Java_17
	void validarTesteSomenteNoUsuarioLucas() {
		
		Assertions.assertEquals(10, 5 + 5);
		System.out.println("Executou o teste");
	}

}
