[![NPM](https://img.shields.io/npm/l/react)](https://github.com/lucarauj/testes-unit-rios-JUnit-dio/blob/main/LICENSE)

<h1 align="center">
  Testes-unitarios-JUnit-dio
</h1>

## Configurando JUnit

### Maven

Adicionar no `pom.xml` do projeto a dependência abaixo:

```xml
<dependency>  
 <groupId>org.junit.jupiter</groupId>  
 <artifactId>junit-jupiter-engine</artifactId>  
 <version>${junit.jupiter.version}</version>  
 <scope>test</scope>  
</dependency>
```
### Gradle

Adicionar ao arquivo `build.gradle`  `testImplementation` no closure `dependencies` e `useJUnitPlatform()` no closure `test`:

```groovy
dependencies {  
	//demais dependências do projeto
  testImplementation group: 'org.junit.jupiter', name: 'junit-jupiter-engine', version: '5.8.2'  
}  
  
test {  
  useJUnitPlatform()  
}
```

Observação: Verificar versão mais nova em [Maven Repository](https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-engine).

## Algumas anotações utlizadas neste código:

- @Test: anotação básica para rodar os testes;
- @BeforeAll: executa o médoto antes de todos os testes
- @AfterAll: executa o médoto depois de todos os testes
- @BeforeEach: executa o médoto antes de CADA teste
- @AfterEach: executa o médoto depois de CADA teste
- @EnableIfEnviromentVariable(): executa o método se os parâmetros informados forem verdadeiros
- @DisableIfEnviromentVariable(): executa o método se os parâmetros informados forem falsos
- @EnableOnOs(): executa o método se os parâmetros informados referente ao sistema operacional forem verdadeiros
- @EnableOnJre(): executa o método se os parâmetros informados referente à JRE forem verdadeiros
- @EnableForJreRange(): executa o método se os parâmetros informados referente às JRE's forem verdadeiros
- @TestMethodOrder(MethodOrderer.OrderAnnotation.class): executa os testes pela ordem da anotação @Order()
- @TestMethodOrder(MethodOrderer.MethodName.class): executa os testes pela ordem do nome do método
- @TestMethodOrder(MethodOrderer.Random.class): executa os testes de forma aleatória
- @TestMethodOrder(MethodOrderer.DisplayName.class): executa os testes baseado na ordem passada pela anotação @DisplayName()
- @DisplayName(): nomeia um teste

## Algumas classes/métodos utilizados nos testes:

- Assertions.assertEquals(): verificada igualdade entre parâmetros
- Assertions.assertTrue(): verfica o resultado booleano de um método é verdadeiro
- Assertions.assertFalse(): verfica o resultado booleano de um método é falso
- Assertions.assertArrayEquals(): verifica igualdade entre arrays
- Assertions.assertNotEquals(): verifica desigualdade entre arrays
- Assertions.assertNull(): verifica se a referência está nula
- Assertions.assertNotNull(): verifica se a referência NÃO está nula
- Assumptions.assumeTrue(): executa os testes se os parâmetros informados no método forem verdadeiros
- Assumptions.assumeFalse(): executa os testes se os parâmetros informados no método forem verdadeiros
- Assertions.assertThrows(): verifica se foi lançada uma exceção
- Assertions.assertNotThrow(): verifica se NÃO foi lançada uma exceção

## Aluno

Lucas Araujo

<a href="https://www.linkedin.com/in/lucarauj"><img alt="lucarauj | LinkdeIN" width="40px" src="https://user-images.githubusercontent.com/43545812/144035037-0f415fc7-9f96-4517-a370-ccc6e78a714b.png" /></a>
