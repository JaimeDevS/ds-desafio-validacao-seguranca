## Critérios de correção:
Mínimo para aprovação: 10 de 12
- POST /events deve retornar 401 Unauthorized para usuário não logado

- POST /events deve retornar 201 Created para CLIENT logado e dados corretos

- POST /events deve retornar 201 Created para ADMIN logado e dados corretos

- POST /events deve retornar 422 Unproccessable Entity para ADMIN logado e nome em branco

- POST /events deve retornar 422 Unproccessable Entity para ADMIN logado e data no passado

- POST /events deve retornar 422 Unproccessable Entity para ADMIN logado e cidade nula

- GET /events deve retornar 200 Ok com página de recursos

- POST /cities deve retornar 401 Unauthorized para usuário não logado

- POST /cities deve retornar 403 Forbidden para CLIENT logado

- POST /cities deve retornar 201 Created para ADMIN logado e dados corretos

- POST /cities deve retornar 422 Unprocessable Entity para ADMIN logado e nome em branco

- GET /cities deve retornar 200 Ok com todos recursos ordenados por nome

## Competências avaliadas:
- Desenvolvimento TDD de API Rest com Java e Spring Boot

- Implementação de segurança com Spring Security e OAuth2

- Controle de acesso por rotas e perfis de usuário

- Validação de dados com Bean Validation
