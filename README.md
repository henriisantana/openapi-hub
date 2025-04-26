# OpenAPI Hub

O **OpenAPI Hub** é um projeto que fornece uma API centralizada para servir como um hub de integração com outras APIs públicas. Ele tem como objetivo simplificar o acesso e a interação com diversas APIs, oferecendo uma interface unificada e consistente.

## Funcionalidades

- Integração com múltiplas APIs públicas.
- Interface unificada para consumir dados de diferentes fontes.
- Documentação clara e padronizada para facilitar o uso.
- Extensível para adicionar novas APIs conforme necessário.

## Tecnologias Utilizadas

- **Java 21**: Linguagem principal do projeto.
- **Spring Boot**: Framework para construção da API.
- **Spring Cloud**: Para integração com APIs públicas e resiliência.
- **Resilience4j**: Para implementação de circuit breakers.
- **Micrometer**: Para monitoramento e métricas.

## Como Executar o Projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/openapi-hub.git
   cd openapi-hub
   ```

2. Configure as variáveis de ambiente no arquivo `application.properties` ou `application.yml`.

3. Compile e execute o projeto usando Gradle:
   ```bash
   ./gradlew bootRun
   ```

4. Acesse a API em `http://localhost:8080`.

## Contribuição

Contribuições são bem-vindas! Siga os passos abaixo para contribuir:

1. Faça um fork do repositório.
2. Crie uma branch para sua feature ou correção:
   ```bash
   git checkout -b minha-feature
   ```
3. Faça as alterações e commit:
   ```bash
   git commit -m "Descrição da minha feature"
   ```
4. Envie suas alterações:
   ```bash
   git push origin minha-feature
   ```
5. Abra um Pull Request.

## Licença

Este projeto está licenciado sob a [MIT License](LICENSE).

---
**Nota**: Este projeto está em desenvolvimento ativo. Novas funcionalidades e melhorias estão sendo adicionadas regularmente.
