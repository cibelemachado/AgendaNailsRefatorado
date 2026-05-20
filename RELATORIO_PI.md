# RELATÓRIO – PROJETO INTEGRADOR

## Sistema Agenda Nails Refatorado

Aluna: Cibele Alonso Machado

---

## Objetivo do Projeto

O objetivo deste projeto foi realizar a refatoração do sistema desktop Agenda Nails, desenvolvido anteriormente em Java Swing, aplicando princípios SOLID, separação de responsabilidades e organização em camadas para preparação futura de um sistema web.

Também foi realizado o versionamento do projeto utilizando GitHub.

---

## Princípios SOLID Aplicados

### SRP – Single Responsibility Principle

Foi aplicado o princípio da responsabilidade única (SRP), separando as responsabilidades do sistema em diferentes camadas.

### Classes Model

As classes da camada Model ficaram responsáveis apenas pela representação dos dados da aplicação.

Exemplos:
- Cliente
- Profissional
- Servico

### Classes DAO

As classes DAO ficaram responsáveis apenas pelo acesso ao banco de dados.

Exemplos:
- ClienteDAO
- ProfissionalDAO
- ServicoDAO

Responsabilidades:
- listar dados
- inserir registros
- executar comandos SQL

### Classes Service

As classes Service ficaram responsáveis pelas regras de negócio e validações do sistema.

Exemplos:
- ClienteService
- ProfissionalService
- ServicoService

Responsabilidades:
- validação de campos obrigatórios
- regras antes de salvar dados
- separação entre lógica e persistência

Essa separação facilitou a manutenção, reutilização e organização do projeto.

---

## Refatorações Aplicadas

Durante a refatoração do sistema foram realizadas diversas melhorias estruturais no código.

### Separação em camadas

O projeto foi reorganizado em camadas:

- model
- dao
- service
- util
- main

Essa separação melhorou a organização e manutenção do sistema.

### Extração da conexão com banco

A conexão com o banco de dados foi centralizada na classe:

- Conexao

Antes disso, a conexão estava espalhada pelo sistema desktop.

### Remoção de responsabilidades das telas

No projeto desktop anterior, as telas Java Swing realizavam:
- acesso ao banco
- validações
- regras de negócio

Após a refatoração:
- as telas ficaram responsáveis apenas pela interface
- regras foram movidas para Service
- acesso ao banco foi movido para DAO

### Code Smells Eliminados

Foram eliminados problemas como:

- duplicação de código
- excesso de responsabilidade em uma única classe
- acoplamento entre interface e banco de dados
- repetição de lógica SQL

### Benefícios Obtidos

- maior organização
- código mais limpo
- facilidade de manutenção
- melhor reutilização de código
- preparação para futura aplicação web

---

## Utilização do GitHub

Foi criado um novo repositório no GitHub para armazenar o projeto refatorado.

O versionamento permitiu:
- controle das alterações realizadas
- armazenamento seguro do projeto
- organização do desenvolvimento
- compartilhamento do código

### Repositório

https://github.com/cibelemachado/AgendaNailsRefatorado

### Evidências

O projeto contém:
- estrutura em camadas
- classes DAO
- classes Service
- integração com banco MySQL
- commits realizados durante o desenvolvimento

---

## Conclusão

A refatoração do sistema Agenda Nails permitiu aplicar conceitos importantes de engenharia de software e boas práticas de desenvolvimento Java.

Com a separação adequada das responsabilidades, o projeto tornou-se mais organizado, reutilizável e preparado para futuras expansões, incluindo o desenvolvimento de uma aplicação web.

O uso de DAO, Service e Model contribuiu para aplicar os princípios SOLID e reduzir problemas estruturais existentes no projeto desktop original.