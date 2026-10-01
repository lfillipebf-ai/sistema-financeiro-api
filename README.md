# Sistema Financeiro API

API REST para controle de receitas, despesas, categorias e contas financeiras.

## Tecnologias
Java 17, Spring Boot, Spring Data JPA, PostgreSQL, Maven, Docker e REST API.

## Funcionalidades
- Cadastro de categorias
- Cadastro de contas
- Registro de receitas e despesas
- Consulta de lançamentos
- Filtro por período
- Cálculo de saldo
- Validação de dados
- Persistência PostgreSQL

## Execução
```bash
docker compose up --build
```

API: http://localhost:8080

## Endpoints
GET/POST /api/categories
GET/POST /api/accounts
GET/POST /api/transactions
GET /api/transactions/period
GET /api/transactions/balance

Projeto educacional/portfólio para praticar Java, Spring Boot, APIs REST, JPA e banco de dados.

Autor: Luis Fillipe Backer Faria
GitHub: https://github.com/lfillipebf-ai
