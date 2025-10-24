# Análise Comparativa de Algoritmos de Ordenação

## Informações Acadêmicas
Aluno: [Gustavo Tasca Lazzari](https://github.com/GLazzari1428)
Turma: U
Período: 4º
Disciplina:
Professor:

## 1. Descrição do Projeto

Implementação e comparação de 6 algoritmos de ordenação em Java:
- **Comb Sort**
- **Gnome Sort**
- **Bucket Sort**
- **Bubble Sort** (com flag de parada)
- **Selection Sort**
- **Cocktail Sort**

---

## 2. Vetores de Teste

### 2.1 Ordem aleatória
```java
int[] vetor1 = {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
```

### 2.2 Ordem crescente
```java
int[] vetor2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
```

### 2.3 Ordem decrescente
```java
int[] vetor3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};
```

## 3.Resultados

### 3.1 Vetor 1 (aleatório)
```zsh
Bubble Sort:
-> Comparações: 180
-> Trocas: 234
-> Iterações: 180
-> Tempo: 432913 ns

Selection Sort:
-> Comparações: 190
-> Trocas: 54
-> Iterações: 190
-> Tempo: 491235 ns

Cocktail Sort:
-> Comparações: 154
-> Trocas: 234
-> Iterações: 154
-> Tempo: 374763 ns

Gnome Sort:
-> Comparações: 174
-> Trocas: 234
-> Iterações: 176
-> Tempo: 367178 ns

Comb Sort:
-> Comparações: 129
-> Trocas: 66
-> Iterações: 129
-> Tempo: 406183 ns

Bucket Sort:
-> Comparações: 13
-> Trocas: 57
-> Iterações: 30
-> Tempo: 394691 ns

========== RESUMO =========
Menor Tempo: Gnome Sort (367178 ns)
Menor Trocas: Selection Sort (54 trocas)
Menor Iterações: Bucket Sort (30 iterações)
```

De acordo com os resultados das comparações realizadas no código, no caso do **Vetor 1**, o algoritimo mais eficiente de ordenação foi o **Gnome Sort**, levando o menor tempo entre todos.

### 3.2 Vetor 2 (crescente)

```zsh
Bubble Sort:
-> Comparações: 19
-> Trocas: 0
-> Iterações: 19
-> Tempo: 1613 ns

Selection Sort:
-> Comparações: 190
-> Trocas: 0
-> Iterações: 190
-> Tempo: 4559 ns

Cocktail Sort:
-> Comparações: 19
-> Trocas: 0
-> Iterações: 19
-> Tempo: 1393 ns

Gnome Sort:
-> Comparações: 19
-> Trocas: 0
-> Iterações: 20
-> Tempo: 1713 ns

Comb Sort:
-> Comparações: 110
-> Trocas: 0
-> Iterações: 110
-> Tempo: 11672 ns

Bucket Sort:
-> Comparações: 10
-> Trocas: 50
-> Iterações: 30
-> Tempo: 7745 ns

========== RESUMO =========
Menor Tempo: Cocktail Sort (1393 ns)
Menor Trocas: Bubble Sort (0 trocas)
Menor Iterações: Bubble Sort (19 iterações)
```
De acordo com os resultados das comparações realizadas no código, no caso do **Vetor 2**, o algoritmo mais eficiente de ordenação foi o **Cocktail Sort**, levando o menor tempo entre todos.

### 3.3 Vetor 3 (decrescente)

```zsh
Bubble Sort:
-> Comparações: 190
-> Trocas: 570
-> Iterações: 190
-> Tempo: 10540 ns

Selection Sort:
-> Comparações: 190
-> Trocas: 30
-> Iterações: 190
-> Tempo: 5030 ns

Cocktail Sort:
-> Comparações: 190
-> Trocas: 570
-> Iterações: 190
-> Tempo: 11582 ns

Gnome Sort:
-> Comparações: 380
-> Trocas: 570
-> Iterações: 400
-> Tempo: 15640 ns

Comb Sort:
-> Comparações: 129
-> Trocas: 54
-> Iterações: 129
-> Tempo: 11292 ns

Bucket Sort:
-> Comparações: 39
-> Trocas: 90
-> Iterações: 31
-> Tempo: 9268 ns

========== RESUMO =========
Menor Tempo: Selection Sort (5030 ns)
Menor Trocas: Selection Sort (30 trocas)
Menor Iterações: Bucket Sort (31 iterações)
```

De acordo com os resultados das comparações realizadas no código, no caso do **Vetor 3**, o algoritmo mais eficiente de ordenação foi o **Selection Sort**, levando o menor tempo entre todos.


## 4. Tabelas Comparativas

### 4.1 Menor numero de trocas
| ↓ Posição | Vetor 1 (Aleatório) | Vetor 2 (Crescente) | Vetor 3 (Decrescente) |
|---------|---------------------|---------------------------|------------------------------|
| 1 | Selection Sort (54) | Bubble Sort (0) | Selection Sort (30) |
| 2 | Bucket Sort (57) | Selection Sort (0) | Comb Sort (54) |
| 3 | Comb Sort (66) | Cocktail Sort (0) | Bucket Sort (90) |
| 4 | Selection Sort (54) | Gnome Sort (0) | Bubble Sort (570) |
| 5 | Bubble Sort (234) | Comb Sort (0) | Cocktail Sort (570) |
| 6 | Cocktail Sort (234) | Bucket Sort (50) | Gnome Sort (570) |

### 4.2 Menor numero de iterações

| ↓ Posição | Vetor 1 (Aleatório) | Vetor 2 (Crescente) | Vetor 3 (Decrescente) |
|---------|---------------------|---------------------------|------------------------------|
| 1 | Bucket Sort (30) | Bubble Sort (19) | Bucket Sort (31) |
| 2 | Comb Sort (129) | Cocktail Sort (19) | Comb Sort (129) |
| 3 | Cocktail Sort (154) | Gnome Sort (20) | Bubble Sort (190) |
| 4 | Gnome Sort (176) | Bucket Sort (30) | Cocktail Sort (190) |
| 5 | Bubble Sort (180) | Comb Sort (110) | Selection Sort (190) |
| 6 | Selection Sort (190) | Selection Sort (190) | Gnome Sort (400) |

### 4.3 Menor tempo

| ↓ Posição | Vetor 1 (Aleatório) | Vetor 2 (Crescente) | Vetor 3 (Decrescente) |
|---------|---------------------|---------------------------|------------------------------|
| 1 | Gnome Sort (367178 ns) | Cocktail Sort (1393 ns) | Selection Sort (5030 ns) |
| 2 | Cocktail Sort (374763 ns) | Bubble Sort (1613 ns) | Bucket Sort (9268 ns) |
| 3 | Bucket Sort (394691 ns) | Gnome Sort (1713 ns) | Bubble Sort (10540 ns) |
| 4 | Comb Sort (406183 ns) | Selection Sort (4559 ns) | Comb Sort (11292 ns) |
| 5 | Bubble Sort (432913 ns) | Bucket Sort (7745 ns) | Cocktail Sort (11582 ns) |
| 6 | Selection Sort (491235 ns) | Comb Sort (11672 ns) | Gnome Sort (15640 ns) |

## 5. Conclusão

Em resumo, se o vetor for **aleatório** o melhor algoritmo para se utilizar é **Gnome Sort**, já se o vetor é **crescente** o melhor seria **Cocktail Sort**. E finalmente, se o vetor for em **ordem decrescente** o melhor algoritmo é **Selection Sort**.
