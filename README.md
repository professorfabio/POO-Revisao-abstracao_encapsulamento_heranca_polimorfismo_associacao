## Descrição do Projeto

Este pequeno projeto em Java tem como objetivo demonstrar, de forma didática, os principais conceitos de Programação Orientada a Objetos (POO) para que os alunos possam:

* Identificar **abstração**, **encapsulamento**, **herança**, **polimorfismo** e **associação** no código.
* Refletir sobre **níveis de visibilidade** (`private`, `protected`, `public`) e suas implicações.
* Compreender o uso de **classes abstratas** e métodos abstratos.
* Discutir boas práticas de design orientado a objetos.

---

## Estrutura de Pacotes

```
src/
 ├
 ├─ Employee.java       ← classe abstrata (abstração)
 ├─ Developer.java      ← subclasse de Employee (herança)
 ├─ Manager.java        ← subclasse de Employee (herança)
 └─ Department.java     ← conceito de associação
 └─ Main.java           ← ponto de entrada + checklist de perguntas

     
```


## O que esperamos dos alunos

No arquivo `Main.java` há um **checklist** com **20 perguntas**. Cada item leva à reflexão sobre um trecho específico do código. Sua tarefa é:

1. **Ler o código** atentamente, identificando onde cada conceito aparece.

2. **Responder, em grupo ou individualmente**, cada pergunta do checklist, justificando:

   * **Por que** aquele modificador de acesso foi escolhido?
   * **Como** a hierarquia de classes (herança) funciona na prática?
   * **De que forma** o polimorfismo é aplicado quando chamamos `calculateBonus()`?
   * **Que tipo de relação** (`associação`, `agregação` ou `composição`) está presente em `Department`?
   * **Quais ajustes** de visibilidade (ou design) você faria para um sistema real?

3. **Executar o projeto**:

   * Compile e rode `Main.java`.
   * Observe as saídas de `toString()` e do cálculo de bônus.
   * Experimente **descomentar** trechos (por exemplo, acesso a `mgr.salary`) para ver e discutir erros de compilação.

4. **Discutir boas práticas**:

   * Defesas contra `null` em `addEmployee(null)`.
   * Quando usar `public` em vez de `protected` ou `private` e vice-versa.
   * Vantagens de usar **classes abstratas** e **métodos abstratos** para modelar comportamentos.

---

## Créditos: Thiago Honorato (Monitor - POO 2025/1 - Turma A)

