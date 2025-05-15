package org.example;

public class Celular {

    private String marca;
    private String modelo;
    private int armazenamento;

    public Celular(String marca, String modelo, int armazenamento) {
        setMarca(marca);
        setModelo(modelo);
        setArmazenamento(armazenamento);
    }

    public void ligar() {
        System.out.println(marca + " " + modelo + " está ligando.");
    }

    public void desligar() {
        System.out.println(marca + " " + modelo + " está desligando.");
    }

    public void exibirInfo() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Armazenamento: " + armazenamento + "GB.");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }
}
