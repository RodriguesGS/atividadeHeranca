package org.example;

public class Caminhao extends Veiculo{
    public Caminhao (String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, double capacidadeCarga){
        super(marca, modelo, ano, capacidadePassageiros, combustivel);
        this.capacidadeCarga = capacidadeCarga;
    }

    double capacidadeCarga;
    static final double tanque = 300.0;
    static final double consumo = 6.0;

    @Override
    double calcularAutonomia() {
        if (this.capacidadeCarga <= 25) {
            return (consumo - (capacidadeCarga * consumo) / 100 ) * tanque;
        } else {
            return (consumo - (25 * consumo) / 100 ) * 300;
        }
    }
}
