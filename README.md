---

# 🦁 Projeto de Demonstração de POO em Java: Zoológico

Este repositório contém um projeto educacional desenvolvido em **Java**, com o objetivo de demonstrar, de forma prática e didática, os principais pilares da **Programação Orientada a Objetos (POO)**.

## 🎯 Objetivo

Ilustrar, através de uma hierarquia de classes representando animais em um zoológico, os seguintes conceitos fundamentais da POO:

* **Herança**
* **Encapsulamento**
* **Polimorfismo**
* **Abstração**

A estrutura do código foi pensada para ser intuitiva e facilitar o entendimento de como esses conceitos se inter-relacionam.

---

## ✨ Conceitos Abordados

* **Herança**
  A estrutura `Animal → Felino → Leão/Tigre/Gato` demonstra como atributos e métodos são transmitidos de classes genéricas para específicas.

* **Encapsulamento**
  Os atributos das classes (como `nome` e `idade`) são declarados como `private`, com acesso controlado via métodos `get` e `set`.

* **Polimorfismo**
  O método `emitirSom()` é invocado a partir de uma referência do tipo `Animal`, mas o comportamento varia conforme a instância real (`Leão`, `Tigre` ou `Gato`), demonstrando **polimorfismo de sobrescrita**.

* **Classes Abstratas**
  As classes `Animal` e `Felino` são **abstratas**, pois representam conceitos que não podem ser instanciados diretamente. Elas funcionam como um contrato, obrigando as subclasses concretas a implementar métodos como `emitirSom()`.

* **Sobrescrita de Métodos (`@Override`)**
  Métodos das superclasses são sobrescritos nas subclasses para definir comportamentos específicos, como `emitirSom()`, `alimentar()` e `movimentar()`.

---

## 📂 Estrutura do Projeto

```
.
├── ANIMAL.java       # Classe Abstrata Base
├── FELINO.java       # Subclasse Abstrata que herda de ANIMAL
├── Leao.java         # Classe Concreta que herda de FELINO
├── Tigre.java        # Classe Concreta que herda de FELINO
├── Gato.java         # Classe Concreta que herda de FELINO
└── Zoologico.java    # Classe Principal (main) para testar a implementação
```

---

## 🚀 Como Executar

### Pré-requisitos

* JDK (Java Development Kit) instalado

### Passos

1. Clone o repositório:

```bash
git clone https://github.com/SEU-USUARIO/SEU-REPOSITORIO.git
```

2. Acesse o diretório do projeto:

```bash
cd SEU-REPOSITORIO
```

3. Compile todos os arquivos `.java`:

```bash
javac *.java
```

4. Execute a classe principal:

```bash
java Zoologico
```

---

## 💻 Saída Esperada

Após executar o programa, o terminal exibirá a seguinte saída, demonstrando o **polimorfismo** em ação:

```
--- DEMONSTRAÇÃO DE POLIMORFISMO ---

Animal: Simba, Idade: 5
Simba ruge: ROAR!
Simba está comendo carne de grandes presas.
O felino corre de forma ágil e silenciosa.
O leão Simba está caçando em bando.
--------------------
Animal: Rajah, Idade: 7
Rajah rosna: GRRRR!
Rajah está comendo carne de cervo.
O felino corre de forma ágil e silenciosa.
--------------------
Animal: Tom, Idade: 3
Tom mia: Miau! Miau!
Tom está comendo sua ração de salmão.
O felino corre de forma ágil e silenciosa.
Tom está se esfregando na sua perna e ronronando.
--------------------
```

---

## 📝 Considerações Finais

Este projeto é uma excelente base para quem está aprendendo **POO** com **Java**, permitindo visualizar de forma prática os principais conceitos e como aplicá-los na construção de sistemas orientados a objetos.

---
