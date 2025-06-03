Projeto de Demonstração de POO em Java: O Zoológico
Este repositório contém um projeto educacional desenvolvido em Java para demonstrar, de forma prática e clara, os pilares da Programação Orientada a Objetos (POO).

🎯 Objetivo
O objetivo principal é ilustrar os conceitos de Herança, Encapsulamento, Polimorfismo e Abstração através de uma hierarquia de classes que representam animais em um zoológico. A estrutura foi pensada para ser intuitiva e facilitar o entendimento de como esses conceitos se conectam.

✨ Conceitos Abordados
Este projeto serve como um exemplo prático dos seguintes conceitos fundamentais da POO:

Herança: A estrutura de classes Animal -> Felino -> Leao/Tigre/Gato demonstra como atributos e métodos são herdados da classe mais genérica para as mais específicas.
Encapsulamento: Os atributos das classes, como nome e idade, são declarados como private, e o acesso a eles é controlado por meio de métodos públicos (getters e setters).
Polimorfismo: O método emitirSom() é chamado a partir de uma referência do tipo Animal, mas sua execução (o som que o animal faz) varia de acordo com o objeto real (Leão, Tigre ou Gato). Isso demonstra o polimorfismo de sobrescrita.
Classes Abstratas: As classes Animal e Felino são declaradas como abstract, pois representam conceitos que não podem ser instanciados diretamente. Elas servem como um "contrato", forçando as subclasses concretas a implementarem seus métodos abstratos, como emitirSom().
Sobrescrita de Métodos (@Override): Métodos da superclasse são sobrescritos nas subclasses para fornecer um comportamento mais específico, como visto em emitirSom(), alimentar() e movimentar().
📂 Estrutura do Projeto
O código está organizado na seguinte hierarquia de classes:

.
├── ANIMAL.java       # Classe Abstrata Base
├── FELINO.java       # Subclasse Abstrata que herda de ANIMAL
├── Leao.java         # Classe Concreta que herda de FELINO
├── Tigre.java        # Classe Concreta que herda de FELINO
├── Gato.java         # Classe Concreta que herda de FELINO
└── Zoologico.java    # Classe Principal (main) para testar a implementação
🚀 Como Executar
Para compilar e executar este projeto, você precisará ter o JDK (Java Development Kit) instalado em sua máquina.

Clone o repositório:

Bash

git clone https://github.com/SEU-USUARIO/SEU-REPOSITORIO.git
Navegue até o diretório do projeto:

Bash

cd SEU-REPOSITORIO
Compile todos os arquivos .java:

Bash

javac *.java
Execute a classe principal Zoologico:

Bash

java Zoologico
💻 Saída Esperada
Após a execução, você verá a seguinte saída no terminal, demonstrando o polimorfismo em ação:

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
