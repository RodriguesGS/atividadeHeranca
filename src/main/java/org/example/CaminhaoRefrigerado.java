package org.example;

public class CaminhaoRefrigerado extends Caminhao {
    public CaminhaoRefrigerado (String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, double capacidadeCarga, double minTemp){
        super(marca, modelo, ano, capacidadePassageiros, combustivel, capacidadeCarga);
        this.minTemp = minTemp;
    }

    double minTemp;

    @Override
    double calcularAutonomia() {
        double respCalc = super.calcularAutonomia();
        return (respCalc - (respCalc * 10) / 100);
    }
}
