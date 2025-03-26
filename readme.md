<img src="https://raw.githubusercontent.com/thauanbo/thauanbo/refs/heads/main/img/banner-project.png" alt="Banner" width="100%">

# Aula LTPO Gestor Financeiro

Este projeto foi realizado de forma educacional, com o princípio fundamental na gestão de transações financeiras pessoais.

## Funcionalidades

- Registro de transações financeiras (receitas e despesas);
  
- Geração de relatório organizado de todas as transações;
  
- Cálculo automático do saldo financeiro;
  
- Sistema modular com separação de responsabilidades;

## Estrutura do Projeto

```
meu-projeto/
├── src/
│ ├── Main.java (Ponto de entrada do sistema)
│ ├── Transacao.java (Modelo de dados)
│ └── GestorFinanceiro.java (Lógica de negócios)
└── README.md
```
## Stack utilizada

**Back-end:**
Java


## Clone o Projeto

```bash
  git clone https://github.com/thauanbo/ltpo-gestorfinanceiro.git
```

## Uso/Exemplos

Antes do Processamento
```Java
gestor.adicionarTransacao("Salario", 5000.0, Transacao.TipoTransacao.RECEITA);
gestor.adicionarTransacao("Aluguel", 1500.0, Transacao.TipoTransacao.DESPESA);
```
Após o Processamento
```
=== Relatório de Transações ===
Descrição          | Tipo      | Valor
-------------------------
Descricao: Salario
Valor: 5000.00
Tipo da Transacao: RECEITA
Descricao: Aluguel
Valor: 1500.00
Tipo da Transacao: DESPESA
```
## Entrada/Saída

Entrada:
```
gestor.adicionarTransacao("Freelance", 1200.0, Transacao.TipoTransacao.RECEITA);
```
Saída:
```
Descricao: Freelance
Valor: 1200.00
Tipo da Transacao: RECEITA
```


## 🔗 Links
[![github](https://img.shields.io/badge/my_portfolio-000?style=for-the-badge&logo=ko-fi&logoColor=white)](https://github.com/thauanbo)
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/thauan-barbosa/)
