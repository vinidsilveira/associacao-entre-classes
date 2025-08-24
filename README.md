# Exercícios — Associação entre Classes (Java / BlueJ)

Este repositório reúne três projetos acadêmicos práticos desenvolvidos em **Java** com a IDE **BlueJ**, aplicando o conceito de **associação entre classes**.

---

## 📂 Estrutura do Repositório

- **livro/** → Projeto Livro (classes `Livro`, `Cliente`, `Principal`)
- **funcionario/** → Projeto Funcionário (classes `Calculadora`, `FuncionarioCaixa`, `Empresa`, `Teste`)
- **mercado/** → Projeto Mercado (classes `Data`, `Produto`, `Prateleira`, `Mercado`, `Principal`)

Cada pasta contém o código-fonte (`.java`) e o enunciado (`.pdf`).

---

## Exercício Livro
- **Livro**: atributos de um livro + `calcularPrecoPorPagina()`.
- **Cliente**: atributos pessoais + um `Livro` associado.
- **Principal**: cria 3 clientes via Teclado e exibe informações.

---

## Exercício Funcionário
- **Calculadora**: operações matemáticas básicas.
- **FuncionarioCaixa**: tem uma `Calculadora` e delega operações a ela.
- **Empresa**: nome + dois funcionários do caixa.
- **Teste**: cria objetos via Teclado, executa operações e imprime dados.

---

## Exercício Mercado
- **Data**: dia, mês, ano.
- **Produto**: nome, preço, validade.
- **Prateleira**: guarda até 3 produtos; retorna o mais caro.
- **Mercado**: possui 2 prateleiras; calcula a média dos preços.
- **Principal**: cria prateleiras, mercado, imprime vencidos, mais caro e média.

---

## Como rodar
1. Abra a pasta de cada projeto no **BlueJ**.
2. Compile todas as classes.
3. Use o botão direito nas classes ou o `main` para executar os testes.

---

## Observação
Os enunciados originais de cada exercício estão disponíveis em `*/enunciado/` para consulta.
