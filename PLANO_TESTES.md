# PLANO DE TESTES – AGENDA NAILS

## Objetivo

O objetivo deste plano de testes é validar as principais funcionalidades implementadas no sistema Agenda Nails refatorado.

---

# Testes Planejados

## 1. Cadastro de Clientes

### Objetivo
Verificar se o sistema permite cadastrar clientes corretamente.

### Entrada
- Nome do cliente
- Telefone

### Resultado Esperado
O cliente deve ser salvo corretamente no banco de dados.

---

## 2. Validação de Nome do Cliente

### Objetivo
Garantir que clientes sem nome não sejam cadastrados.

### Entrada
- Nome vazio
- Telefone válido

### Resultado Esperado
O sistema deve impedir o cadastro e retornar validação inválida.

### Evidência
Teste realizado na classe:

- ClienteServiceTest

Resultado obtido:
- TESTE PASSOU

---

## 3. Cadastro de Profissionais

### Objetivo
Validar o cadastro de profissionais.

### Entrada
- Nome
- Especialidade
- Horário

### Resultado Esperado
O profissional deve ser salvo corretamente no banco de dados.

---

## 4. Cadastro de Serviços

### Objetivo
Validar o cadastro de serviços.

### Entrada
- Nome do serviço
- Descrição
- Valor

### Resultado Esperado
O serviço deve ser salvo corretamente no banco de dados.

---

## 5. Integração com Banco de Dados

### Objetivo
Verificar se a conexão MySQL está funcionando corretamente.

### Resultado Esperado
Os dados devem ser listados e inseridos corretamente nas tabelas do sistema.

---

# Conclusão

Os testes realizados permitiram validar as principais funcionalidades do sistema e verificar o correto funcionamento das regras de negócio implementadas.

