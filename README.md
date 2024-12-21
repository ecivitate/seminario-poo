# TextEditor Memento Pattern

Este repositório demonstra a implementação do **Padrão de Projeto Memento** em Java. O exemplo utiliza um simples `TextEditor` que permite salvar e restaurar seu estado, implementando uma funcionalidade de "desfazer".

## Visão Geral do Padrão de Projeto

O **Padrão de Projeto Memento** é usado para capturar e restaurar o estado interno de um objeto sem violar seu encapsulamento. Ele envolve três componentes principais:

- **Originator**: O objeto cujo estado é salvo e restaurado.
- **Memento**: Um instantâneo do estado do `Originator`, encapsulado para proteger sua integridade.
- **Caretaker**: Gerencia o ciclo de vida do `Memento`, como salvar e restaurar estados.


## Funcionalidades

- Encapsulamento da classe `Memento` dentro de `TextEditor` para proteger o estado interno.
- Classe `History` separada para gerenciar objetos `Memento`.
- Simples funcionalidade de desfazer utilizando uma pilha.

## Exemplo de Saída

A seguir, a saída esperada ao executar o programa:

```plaintext
Texto atual: Versão 1
Texto atual: Versão 2
Texto atual: Versão 3
Após desfazer: Versão 2
Após desfazer novamente: Versão 1
```


## Como Funciona

1. O `TextEditor` salva seu estado usando o método `save()`, que retorna um objeto `Memento`.
2. A classe `History` armazena os objetos `Memento` em uma pilha.
3. O método `undo()` remove o último `Memento` salvo e restaura o estado do editor.
