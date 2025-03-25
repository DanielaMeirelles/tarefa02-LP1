package org.example;

public class Fracao {
    private int numerador;
    private int denominador;

    public Fracao(int numerador, int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("O denominador não pode ser zero.");
        }
        int gcd = mdc(numerador, denominador);
        this.numerador = numerador / gcd;
        this.denominador = denominador / gcd;
        ajustarSinal();
    }

    private void ajustarSinal() {
        if (this.denominador < 0) {
            this.numerador = -this.numerador;
            this.denominador = -this.denominador;
        }
    }

    private int mdc(int a, int b) {
        return b == 0 ? Math.abs(a) : mdc(b, a % b);
    }

    public Fracao soma(Fracao outra) {
        int novoNumerador = this.numerador * outra.denominador + outra.numerador * this.denominador;
        int novoDenominador = this.denominador * outra.denominador;
        return new Fracao(novoNumerador, novoDenominador);
    }

    public Fracao subtracao(Fracao outra) {
        int novoNumerador = this.numerador * outra.denominador - outra.numerador * this.denominador;
        int novoDenominador = this.denominador * outra.denominador;
        return new Fracao(novoNumerador, novoDenominador);
    }

    public Fracao multiplicacao(Fracao outra) {
        int novoNumerador = this.numerador * outra.numerador;
        int novoDenominador = this.denominador * outra.denominador;
        return new Fracao(novoNumerador, novoDenominador);
    }

    public Fracao divisao(Fracao outra) {
        if (outra.numerador == 0) {
            throw new ArithmeticException("Não é possível dividir por zero.");
        }
        int novoNumerador = this.numerador * outra.denominador;
        int novoDenominador = this.denominador * outra.numerador;
        return new Fracao(novoNumerador, novoDenominador);
    }

    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }
}
