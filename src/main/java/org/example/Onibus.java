package org.example;

public class Onibus extends Veiculo{
    public Onibus (String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, int qtdEixos){
        super(marca, modelo, ano, capacidadePassageiros, combustivel);
        this.qtdEixos = qtdEixos;
    }

    int qtdEixos;
    static final double tanque = 200.0;
    static final double consumo = 5.0;

    @Override
    double calcularAutonomia() {
        if (this.qtdEixos >= 6 && this.qtdEixos <= 8) {
            return tanque * consumo;
        } else {
            return 0;
        }
    }
}
