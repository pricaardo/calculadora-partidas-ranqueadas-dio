# 🎮 Calculadora de Partidas Rankeadas

[![Java](https://img.shields.io/badge/Java-17%2B-orange.svg)](https://www.oracle.com/java/)
[![License](https://img.shields.io/badge/license-MIT-blue.svg)](LICENSE)
[![DIO](https://img.shields.io/badge/Bootcamp-DIO-purple.svg)](https://www.dio.me/)

Projeto desenvolvido para o desafio **"Calculadora de Partidas Rankeadas"** da plataforma **Digital Innovation One (DIO)**. O objetivo principal é praticar e consolidar os conceitos fundamentais de lógica de programação.

---

## 📌 Sumário
- [Descrição do Projeto](#-descrição-do-projeto)
- [Regras de Negócio e Níveis](#-regras-de-negócio-e-níveis)
- [Tecnologias Utilizadas](#-tecnologias-utilizadas)
- [Estrutura do Código](#-estrutura-do-código)
- [Como Executar](#-como-executar)
- [Exemplo de Uso](#-exemplo-de-uso)

---

## 📝 Descrição do Projeto

A **Calculadora de Partidas Rankeadas** solicita a quantidade de vitórias e derrotas de um jogador via terminal, calcula o **saldo de partidas rankeadas** (`vitórias - derrotas`) e determina em qual **nível/rank** o herói se encontra com base em suas vitórias.

---

## 🏆 Regras de Negócio e Níveis

O nível do herói é determinado conforme a tabela abaixo:

| Saldo / Vitórias | Nível |
| :--- | :--- |
| **Menor ou igual a 10** | 🪨 **Ferro** |
| **11 a 20** | 🥉 **Bronze** |
| **21 a 50** | 🥈 **Prata** |
| **51 a 80** | 🥇 **Ouro** |
| **81 a 90** | 💎 **Diamante** |
| **91 a 100** | 📜 **Lendário** |
| **Maior ou igual a 101** | 🔥 **Imortal** |

---

## 🛠️ Tecnologias e Conceitos Aplicados

* **Linguagem:** Java
* **Entrada/Saída:** `java.util.Scanner` e `System.out.printf`
* **Conceitos de Programação:**
  * **Variáveis e Tipos de Dados:** Armazenamento das vitórias, derrotas e resultado do cálculo.
  * **Operadores Aritméticos e Lógicos:** Subtração para cálculo do saldo e operadores relacionais (`<=`, `>=`, `&&`).
  * **Estruturas Condicionais:** Encadeamento `if / else if` para classificação do nível do jogador.
  * **Funções/Métodos:** Método `soma` (utilizado para calcular o saldo de vitórias).

---

## 💻 Estrutura do Código

```java
package calculadorapartidasrankeadas;
import java.util.Scanner;

public class CalculadoraPartidasRankeadas {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        System.out.println("Quantas vitorias voce tem?");
        int numberVictories = scanner.nextInt();
        System.out.println("Quantas derrotas?");
        int numberDefeats = scanner.nextInt();
        
        int calculoRankeada = soma(numberVictories, numberDefeats);
        
        if (calculoRankeada <= 10) {
            System.out.printf("O Heroi tem o saldo de %d vitorias e esta no nível: Ferro \n", calculoRankeada);
        } else if (calculoRankeada >= 11 && calculoRankeada <= 20) {
            System.out.printf("O Heroi tem o saldo de %d vitorias e esta no nivel: Bronze \n", calculoRankeada);
        } else if (calculoRankeada >= 21 && calculoRankeada <= 50) {
            System.out.printf("O Heroi tem o saldo de %d vitorias e esta no nivel: Prata \n", calculoRankeada);
        } else if (calculoRankeada >= 51 && calculoRankeada <= 80) {
            System.out.printf("O Heroi tem o saldo de %d vitorias e esta no nivel: Ouro \n", calculoRankeada);
        } else if (calculoRankeada >= 81 && calculoRankeada <= 90) {
            System.out.printf("O Heroi tem o saldo de %d vitorias e esta no nivel: Diamante \n", calculoRankeada);
        } else if (calculoRankeada >= 91 && calculoRankeada <= 100) {
            System.out.printf("O Heroi tem o saldo de %d vitorias e esta no nivel: Lendario \n", calculoRankeada);
        } else if (calculoRankeada >= 101) {
            System.out.printf("O Heroi tem o saldo de %d vitorias e esta no nivel: Imortal \n", calculoRankeada);
        }
    }
    
    public static int soma(int numberVictories, int numberDefeats){
        return numberVictories - numberDefeats;
    }
}

```

## 🚀 Como Executar
* Pré-requisitos

    Java JDK 17 ou superior instalado.

    IDE (VS Code, IntelliJ IDEA, Eclipse, NetBeans) ou terminal.

* Passos

    * Clonar o repositório:
    Bash

    git clone [https://github.com/seu-usuario/calculadora-partidas-rankeadas.git](https://github.com/seu-usuario/calculadora-partidas-rankeadas.git)

    * Navegar até a pasta do projeto:
    Bash

    cd calculadora-partidas-rankeadas

    * Compilar o arquivo Java:
    Bash

    javac calculadorapartidasrankeadas/CalculadoraPartidasRankeadas.java

    * Executar a aplicação:
    Bash

    java calculadorapartidasrankeadas.CalculadoraPartidasRankeadas

## 🖥️ Exemplo de Uso
* Plaintext

Quantas vitorias voce tem?
65
Quantas derrotas?
10
O Heroi tem o saldo de 55 vitorias e esta no nivel: Ouro
