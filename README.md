- Sistema de Cálculo de Renda de Funcionários

Este projeto é uma aplicação em Java desenvolvida para praticar Programação Orientada a Objetos (POO), modelagem UML e manipulação de datas, simulando o cálculo da renda mensal de um funcionário com base em contratos por hora.

Ele demonstra conceitos essenciais como:

Composição de classes

Uso de enums

Encapsulamento

Coleções (List)

Leitura de dados via Scanner

Cálculo de valores com base em regras de negócio

- Funcionalidades

Cadastro de:

Departamento

Funcionário

Contratos por hora

Cálculo automático da renda mensal com base:

No salário base

Nos contratos realizados no mês informado

Relatório final exibindo:

Nome do funcionário

Departamento

Renda total do período

- Estrutura do Projeto

Main → Classe principal responsável pela interação com o usuário.

Trabalhador → Representa o funcionário e contém a lógica de cálculo da renda.

Contratos → Representa contratos pagos por hora.

Departamento → Representa o departamento do funcionário.

WorkerLevel → Enum que define o nível do funcionário (JUNIOR, MID_LEVEL, SENIOR).

- Diagrama UML (Resumo)

Um Trabalhador pertence a um Departamento.

Um Trabalhador pode possuir vários Contratos.

Cada Contrato possui:

Data

Valor por hora

Quantidade de horas

A renda mensal é calculada somando:

Salário base

Total dos contratos no mês informado.

- Objetivo do Projeto

Este projeto foi desenvolvido com foco em aprendizado prático e demonstração de domínio dos fundamentos de Java e POO.

- Autor

Guilherme Caetano
