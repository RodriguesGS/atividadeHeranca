package org.example;

public class CarroEletrico extends Carro {
    public CarroEletrico(String marca, String modelo, int ano, int capacidadePassageiros, String tipoCarro, double bateriaKWh) {
        super(marca, modelo, ano, capacidadePassageiros, tipoCarro);
        this.bateriaKWh = bateriaKWh;
    }

    double bateriaKWh;

    @Override
    double calcularAutonomia() {
        double consumoEletrico = super.consumo = 5 ;
        return this.bateriaKWh * consumoEletrico;
    }
}
