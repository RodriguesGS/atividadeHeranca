package org.example;

public class Carro extends Veiculo{
    public Carro (String marca, String modelo, int ano, int capacidadePassageiros, String combustivel) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel);
    }

    String tipoCarro;
    double tanque = 50.0;
    double consumo = 12.0;

    @Override
    double calcularAutonomia() {
        return tanque * consumo;
    }
}
