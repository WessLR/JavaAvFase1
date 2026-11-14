# JavaAvFase1 – Fila Circular de Livros

Aplicação de console em Java que gerencia uma **fila circular de livros**, feita para praticar estruturas de dados e orientação a objetos.

## O que é uma fila circular?

É uma fila (o primeiro a entrar é o primeiro a sair) implementada com um vetor de tamanho fixo. Quando o índice chega ao fim do vetor, ele volta para o início, reaproveitando os espaços dos itens que já saíram:

```java
fim = (fim + 1) % livros.length;
```

## Funcionalidades

| Opção | Função | Descrição |
|-------|--------|-----------|
| 1 | Adicionar Livro | Insere um livro no final da fila (avisa se a fila estiver cheia). |
| 2 | Remover Livro | Remove o livro que está na frente da fila. |
| 3 | Recuperar Livro | Busca um livro pelo título. |
| 4 | Listar Livros | Mostra todos os livros, da frente até o final da fila. |
| 5 | Quantidade de Livros | Mostra quantos livros estão na fila. |
| 6 | Posições | Mostra a posição de um livro, quem está à frente e quem vem depois. |
| 0 | Sair | Encerra o programa. |

## Estrutura do projeto

```
JavaAvFase1/
└── src/
    └── cod/
        ├── Livro.java   # Classe do item (título, autor, páginas)
        ├── Fila.java    # Implementação da fila circular
        └── Menu.java    # Classe principal (main) com o menu
```

- **Livro**: atributos `titulo`, `autor` e `paginas`, com construtor, getters, setters e `toString`.
- **Fila**: vetor de 5 posições, controlado por `inicio`, `fim` e `tamanho`. Métodos: `adicionar`, `remover`, `obterlivro`, `posicaolivro`, `recuperar`, `listar` e `quantidade`.
- **Menu**: lê a opção do usuário, trata entradas que não são números e chama os métodos da fila.

## Como executar

### Pelo IntelliJ IDEA

1. Abra o projeto.
2. Abra o arquivo `Menu.java`.
3. Clique no botão verde de execução ao lado do método `main`.

### Pelo terminal

Na pasta raiz do projeto:

```bash
javac -d out src/cod/*.java
java -cp out cod.Menu
```

Requisito: **JDK 8 ou superior**.

## Exemplo de uso

Opção 6 (Posições), com três livros na fila:

```
Escolha a opção:
6
Título do livro: Harry Potter e a Pedra Filosofal
Posição: 2º
À frente
 Titulo: O Senhor dos Anéis: A Sociedade do Anel
 Autor: J. R. R. Tolkien
 Número de Paginas: 576
Depois
 Titulo: A Guerra dos Tronos : As Crônicas de Gelo e Fogo
 Autor: George R. R. Martin
 Número de Paginas: 592
```

Quando o livro é o primeiro ou o último da fila, o programa mostra `ninguém` no lado que está vazio.

## Conceitos praticados

- Classes, objetos, construtores, getters e setters
- Pacotes (`package`)
- Vetores e fila circular com o operador `%`
- Estruturas de decisão e repetição (`if`, `switch`, `while`)
- Leitura de dados com `Scanner` e tratamento de erro com `try/catch`

## Autor

Feito por [WessLR](https://github.com/WessLR).
