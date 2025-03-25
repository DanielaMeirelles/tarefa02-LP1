## Linguagem de Programação 1

### Tarefa 02

#### Lista de Imagens 📷

Aqui estão 10 imagens da classe Pessoa:

1. [Imagem 1](pessoas/christina-wocintechchat-com-SJvDxw0azqw-unsplash.jpg "Imagem 1")
2. [Imagem 2](pessoas/danie-franco-o1PKM7-8AH4-unsplash.jpg "Imagem 2")
3. [Imagem 3](pessoas/grupo-de-pessoas.jpg "Imagem 3")
4. [Imagem 4](pessoas/inatimi-nathus-UygW_kIv2A4-unsplash.jpg "Imagem 4")
5. [Imagem 5](pessoas/jonas-kakaroto-KIPqvvTOC1s-unsplash.jpg "Imagem 5")
6. [Imagem 6](pessoas/justin-lim-OiFRMM3o7l0-unsplash.jpg "Imagem 6")
7. [Imagem 7](pessoas/kaushal-mishra-p76UivR30oo-unsplash.jpg "Imagem 7")
8. [Imagem 8](pessoas/menina.jpg "Imagem 8")
9. [Imagem 9](pessoas/menino.jpg "Imagem 9")
10. [Imagem 10](pessoas/yerling-villalobos-r-hssyiKimQ-unsplash.jpg "Imagem 10")
   
----
Aqui estão as 10 imagens da classe Flor:

1. [Imagem 1](flores/amy-humphries-S5wUMrXdq1M-unsplash.jpg "Imagem 1")
2. [Imagem 2](flores/annie-spratt-vs6a4EHj_Ro-unsplash.jpg "Imagem 2")
3. [Imagem 3](flores/dorne-marting-WJJ3xP5Z_vw-unsplash.jpg "Imagem 3")
4. [Imagem 4](flores/kwang-mathurosemontri-fY1ECB1RCd0-unsplash.jpg "Imagem 4")
5. [Imagem 5](flores/olia-gozha-9A_peGrSbZc-unsplash.jpg "Imagem 5")
6. [Imagem 6](flores/paul-green-5lRxNLHfZOY-unsplash.jpg "Imagem 6")
7. [Imagem 7](flores/rikonavt-oEWdQsbRVZk-unsplash.jpg "Imagem 7")
8. [Imagem 8](flores/yan-liu-j3TrGxN_rCM-unsplash.jpg "Imagem 8")
9. [Imagem 9](flores/zoltan-tasi-PN8Un1ywbE8-unsplash.jpg "Imagem 9")
10. [Imagem 10](flores/zoltan-tasi-yanhwFwyoaU-unsplash.jpg "Imagem 10")

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

