# crud-filmes-java

# Hands-on CRUD de Filmes

Passo a passo criação de Web-service

1. Criar pasta para o projeto
2. Criar projeto spring com as dependências (DevTools, Spring Data MongoDB, Spring Web)
3. Rodar a aplicação pra ver se dá algum erro
4. Criar o pacote Model com a classe modelo e seus atributos
5. Fazer anotação da classe com @Document e a do id com @Id
6. Criar get e set dos atributos
7. Criar o pacote Repository com a interface repository que extends MongoRepository
8. Criar a pacote View e o controller
9. Anotar @RestController e @RequestMapping("/api/filmes")
10. Começar criando o método Get, devolvendo uma lista de EntidadeDto
11. Criar o pacote shared e a classe EntidadeDto
12. Criar o pacote service, incluindo a interface FilmeService.java com o cabeçalho do método obterTodos ou no nosso exemplo listarFilmes
13. Criar a classe FilmeServiceImpl implementando a interface FilmeService. Lembrar de usar a anotação @Service
14. Se for usar um Data Transfer Object, incluir no pom a dependência do modelmapper e utilizá-lo na implementação dos métodos
15. Implementar  na classe controller o método de acordo com o verbo @GetMapping, @PostMapping, etc
16. Ajustar a Service, ServiceImpl, Controller até que o crud esteja completo
17. Melhorar o  Web service com o uso de Optional, ResponseEntity e validações.

