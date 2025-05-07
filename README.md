## Linguagem de Programação 1

### Tarefa 02

📌 Listagem das 10 Classes (com atributos e métodos)

| Classe         | Atributos                        | Métodos                              |
| -------------- | -------------------------------- | ------------------------------------ |
| **Pessoa**     | nome, idade, altura              | falar(), andar(), apresentar()       |
| **Flor**       | especie, cor, altura             | florescer(), murchar(), exibirInfo() |
| **Carro**      | modelo, cor, velocidade          | acelerar(), frear(), exibirDados()   |
| **Animal**     | nome, especie, idade             | emitirSom(), correr(), mostrarInfo() |
| **Celular**    | marca, modelo, armazenamento     | ligar(), desligar(), exibirInfo()    |
| **Livro**      | titulo, autor, paginas           | abrir(), fechar(), mostrarDetalhes() |
| **Computador** | marca, processador, memoriaRAM   | ligar(), desligar(), infoSistema()   |
| **Bicicleta**  | modelo, cor, marchas             | pedalar(), frear(), detalhes()       |
| **Filme**      | titulo, genero, duracao          | reproduzir(), pausar(), exibirInfo() |
| **Produto**    | nome, preco, quantidadeEmEstoque | vender(), repor(), exibirProduto()   |

----

### **Teste de Mesa da classe Fração**

Vamos analisar a execução do código passo a passo com os valores `f1 = 1/2` e `f2 = 3/4`.

---

#### **Criação das Frações**
1. **Instanciação de `f1 = new Fracao(1,2)`**
   - Chama `mdc(1, 2) → 1`
   - Simplificação: `1/2`
   - `ajustarSinal()` não altera valores.

2. **Instanciação de `f2 = new Fracao(3,4)`**
   - Chama `mdc(3, 4) → 1`
   - Simplificação: `3/4`
   - `ajustarSinal()` não altera valores.

---

#### **Operações**
##### **Soma**
\[
\frac{1}{2} + \frac{3}{4} = \frac{(1 \times 4) + (3 \times 2)}{2 \times 4} = \frac{4 + 6}{8} = \frac{10}{8} = \frac{5}{4}
\]
- Criada nova fração `Fracao(10,8)`
- `mdc(10,8) = 2`, simplifica para `5/4`
- Resultado impresso: **"Soma: 5/4"**

---

##### **Subtração**
\[
\frac{1}{2} - \frac{3}{4} = \frac{(1 \times 4) - (3 \times 2)}{2 \times 4} = \frac{4 - 6}{8} = \frac{-2}{8} = \frac{-1}{4}
\]
- Criada nova fração `Fracao(-2,8)`
- `mdc(-2,8) = 2`, simplifica para `-1/4`
- Resultado impresso: **"Subtração: -1/4"**

---

##### **Multiplicação**
\[
\frac{1}{2} \times \frac{3}{4} = \frac{1 \times 3}{2 \times 4} = \frac{3}{8}
\]
- Criada nova fração `Fracao(3,8)`
- `mdc(3,8) = 1`, permanece `3/8`
- Resultado impresso: **"Multiplicação: 3/8"**

---

##### **Divisão**
\[
\frac{1}{2} \div \frac{3}{4} = \frac{1}{2} \times \frac{4}{3} = \frac{1 \times 4}{2 \times 3} = \frac{4}{6} = \frac{2}{3}
\]
- Criada nova fração `Fracao(4,6)`
- `mdc(4,6) = 2`, simplifica para `2/3`
- Resultado impresso: **"Divisão: 2/3"**

---

### **Saída Final no Console**
```
Soma: 5/4
Subtração: -1/4
Multiplicação: 3/8
Divisão: 2/3
```
Teste de mesa confirma que o código funciona corretamente! ✅

