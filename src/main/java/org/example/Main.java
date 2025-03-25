package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Fracao f1 = new Fracao(1, 2);
        Fracao f2 = new Fracao(3, 4);

        System.out.println("-----------Fração Simples----------");
        System.out.println("Soma: " + f1.soma(f2));
        System.out.println("Subtração: " + f1.subtracao(f2));
        System.out.println("Multiplicação: " + f1.multiplicacao(f2));
        System.out.println("Divisão: " + f1.divisao(f2));

        // Entrada de dados para Pessoa
        System.out.println("===== CADASTRO DE PESSOA =====");
        System.out.print("Digite o nome da pessoa: ");
        String nomePessoa = scanner.nextLine();
        
        System.out.print("Digite a idade da pessoa: ");
        int idadePessoa = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer

        System.out.print("Digite o CPF da pessoa (XXX.XXX.XXX-XX): ");
        String cpfPessoa = scanner.nextLine();

        Pessoa pessoa = new Pessoa(nomePessoa, idadePessoa, cpfPessoa);

        // Entrada de dados para Flor
        System.out.println("\n===== CADASTRO DE FLOR =====");
        System.out.print("Digite a espécie da flor: ");
        String especieFlor = scanner.nextLine();

        System.out.print("Digite a cor da flor: ");
        String corFlor = scanner.nextLine();

        System.out.print("Digite a altura inicial da flor (em centímetros): ");
        double alturaFlor = scanner.nextDouble();

        Flor flor = new Flor(especieFlor, corFlor, alturaFlor);

        int opcao;
        do {
            System.out.println("\n===============MENU=============");
            System.out.println("Escolha uma das ações abaixo e digite o número correspondente.");
            System.out.println("1- Fazer a pessoa falar");
            System.out.println("2- Fazer a pessoa andar");
            System.out.println("3- Fazer a pessoa dormir");
            System.out.println("4- Fazer a flor florescer");
            System.out.println("5- Fazer a flor crescer");
            System.out.println("6- Fazer a flor murchar");
            System.out.println("7- Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    pessoa.falar();
                    break;
                case 2:
                    pessoa.andar();
                    break;
                case 3:
                    pessoa.dormir();
                    break;
                case 4:
                    flor.florescer();
                    break;
                case 5:
                    System.out.println("Digite quanto a flor deve crescer (em centímetros): ");
                    double crescimento = scanner.nextDouble();
                    flor.crescer(crescimento);
                    break;
                case 6:
                    flor.murchar();
                    break;
                case 7:
                    System.out.println("Saindo... Até mais!");
                    scanner.close();
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 9);
    }
}