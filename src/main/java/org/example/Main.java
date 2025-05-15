package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando objetos iniciais
        Animal animal= new Animal("Tigre", "Felino", 7);
        Bicicleta bicicleta = new Bicicleta("Caloi 100", "Azul", 21);
        Carro carro = new Carro("Civic", "Prata", 0);
        Celular celular = new Celular("Samsung", "Galaxy S23", 256);
        Computador computador = new Computador("Dell", "Intel i7", 16);
        Filme filme = new Filme("Matrix", "Ficção Científica", 136);
        Livro livro = new Livro("Dom Casmurro", "Machado de Assis", 256);
        Produto produto = new Produto("Mouse gamer", 149.90, 5);
        Pessoa pessoa = new Pessoa("Carlos", 30, "123.456.789-00");
        Flor flor = new Flor("Rosa", "Vermelha", 0.5f);

        int opcao;
        do {
            System.out.println("\n========MENU PRINCIPAL=============");
            System.out.println("Escolha uma das ações abaixo e digite o número correspondente.");
            System.out.println("1. Testar Pessoa");
            System.out.println("2. Testar Flor");
            System.out.println("3. Testar Carro");
            System.out.println("4. Testar Animal");
            System.out.println("5. Testar Celular");
            System.out.println("6. Testar Livro");
            System.out.println("7. Testar Computador");
            System.out.println("8. Testar Bicicleta");
            System.out.println("9. Testar Filme");
            System.out.println("10. Testar Produto");
            System.out.println("11. Testar Frações");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    pessoa.falar();
                    pessoa.andar();
                    break;
                case 2:
                    flor.crescer(1.5f);
                    flor.florescer();
                    break;
                case 3:
                    carro.exibirDados();
                    carro.acelerar();
                    break;
                case 4:
                    animal.mostrarInfo();
                    animal.emitirSom();
                    break;
                case 5:
                    celular.exibirInfo();
                    celular.ligar();
                    break;
                case 6:
                    livro.mostrarDetalhes();
                    livro.abrir();
                    break;
                case 7:
                    computador.infoSistema();
                    computador.ligar();
                    break;
                case 8:
                    bicicleta.detalhes();
                    bicicleta.pedalar();
                    break;
                case 9:
                    filme.exibirInfo();
                    filme.reproduzir();
                    break;
                case 10:
                    produto.exibirProduto();
                    produto.vender();
                    break;
                case 11:
                    System.out.print("Digite o numerador da primeira fração: ");
                    int num1 = scanner.nextInt();
                    System.out.print("Digite o denominador da primeira fração: ");
                    int den1 = scanner.nextInt();

                    System.out.print("Digite o numerador da segunda fração: ");
                    int num2 = scanner.nextInt();
                    System.out.print("Digite o denominador da segunda fração: ");
                    int den2 = scanner.nextInt();

                    Fracao fr1 = new Fracao(num1, den1);
                    Fracao fr2 = new Fracao(num2, den2);

                    Fracao soma = fr1.somar(fr2);
                    System.out.print("Soma das frações: ");
                    soma.exibir();
                    Fracao mult = fr1.multiplicar(fr2);
                    System.out.print("Multiplicação das frações: ");
                    mult.exibir();
                    break;
                case 0:
                    System.out.println("Saindo do programa.");
                    System.out.println("Saindo... Até mais!");
                    scanner.close();
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 0);
        scanner.close();
    }
}