package org.example;

abstract public class Veiculo {
    String marca;
    String modelo;
    int ano;
    int capacidadePassageiros;
    String combustivel;

    public Veiculo(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.capacidadePassageiros = capacidadePassageiros;
        this.combustivel = combustivel;
    }

    abstract double calcularAutonomia();

    public void exibirDetalhes() {
        System.out.println("O veículo é da marca: " + marca);
        System.out.println("O veículo é do modelo: " + modelo);
        System.out.println("O veículo é do ano: " + ano);
        System.out.println("O veículo tem a capacidade levar " + capacidadePassageiros + " pessoas");
        System.out.println("O veículo comporta " + combustivel + " de combústivel");
        System.out.println("Sua autonomia é de: " + calcularAutonomia() + "Km/h");
    }
}
