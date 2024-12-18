
# Copilot Spring Hello API

## Contexto de Negócio

Este projeto é uma API RESTful desenvolvida em Java utilizando o framework Spring Boot. A API gerencia produtos e categorias, permitindo operações de CRUD (Create, Read, Update, Delete) em ambas as entidades. O objetivo é fornecer uma solução simples para gerenciar um catálogo de produtos e suas respectivas categorias.

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3.1.3**
- **Spring Data JPA**
- **H2 Database**
- **Lombok**
- **SpringDoc OpenAPI (Swagger)**

## Como Executar

### Pré-requisitos

- JDK 17 ou superior
- Maven 3.6 ou superior

### Passos para Executar

1. **Clone o repositório:**

   ```bash
   git clone https://github.com/pedrobelmino/github-copilot-spring-hello.git
   cd github-copilot-spring-hello
   ```

2. **Compile o projeto:**

   ```bash
   mvn clean install
   ```

3. **Execute a aplicação:**

   ```bash
   mvn spring-boot:run
   ```

4. **Acesse o H2 Console:**  
   Acesse o console do H2 Database em [http://localhost:8080/h2-console](http://localhost:8080/h2-console) com as seguintes credenciais:
   - **JDBC URL:** `jdbc:h2:mem:testdb`
   - **Username:** `sa`
   - **Password:** `password`

5. **Acesse a documentação da API (Swagger UI):**  
   Acesse a documentação da API em [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html).

## Endpoints Principais

### Produtos

- **GET** `/produtos`: Lista todos os produtos
- **GET** `/produtos/{id}`: Busca um produto pelo ID
- **POST** `/produtos`: Cria um novo produto
- **DELETE** `/produtos/{id}`: Deleta um produto pelo ID

### Categorias

- **GET** `/categorias`: Lista todas as categorias
- **GET** `/categorias/{id}`: Busca uma categoria pelo ID
- **POST** `/categorias`: Cria uma nova categoria
- **DELETE** `/categorias/{id}`: Deleta uma categoria pelo ID

## Contribuição

Sinta-se à vontade para contribuir com o projeto. Para isso, siga os passos abaixo:

1. Faça um fork do repositório.
2. Crie uma branch para sua feature:

   ```bash
   git checkout -b feature/nova-feature
   ```

3. Commit suas mudanças:

   ```bash
   git commit -am 'Adiciona nova feature'
   ```

4. Faça o push para a branch:

   ```bash
   git push origin feature/nova-feature
   ```

5. Crie um novo Pull Request.

## Licença

Este projeto está licenciado sob os termos da licença MIT. Veja o arquivo `LICENSE` para mais detalhes.