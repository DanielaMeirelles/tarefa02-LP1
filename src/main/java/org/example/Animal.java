package org.example;

public class Animal {

    private String nome;
    private String especie;
    private int idade;

    public Animal(String nome, String especie, int idade) {
        setNome(nome);
        setEspecie(especie);
        setIdade(idade);
    }

    public void emitirSom() {
        System.out.println(nome + " está emitindo som.");
    }

    public void correr() {
        System.out.println(nome + " está correndo.");
    }

    public void mostrarInfo() {
        System.out.println("Nome: " + nome + ", Espécie: " + especie + ", Idade: " + idade + " anos.");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
