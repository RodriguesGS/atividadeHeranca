package org.example;

public class Main {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Carro("Fiat", "Toro", 2024, 5, "Alcool");
        Veiculo veiculo2 = new Caminhao("Volvo", "Bitrem", 2023, 2, "Diesel", 5);
        Veiculo veiculo3 = new Onibus("Mercedes", "TCCC", 335, 80, "Diesel", 7);
        Veiculo veiculo4 = new CarroEletrico("BYD", "Dolphin", 2024, 1, "Sedan", 43.2);
        Veiculo veiculo5 = new CaminhaoRefrigerado("Strada", "Corinthians", 2020, 2, "Diesel", 5, 4.5);

        System.out.println("===========================");
        veiculo1.exibirDetalhes();
        System.out.println("\n===========================\n");
        veiculo2.exibirDetalhes();
        System.out.println("\n===========================\n");
        veiculo3.exibirDetalhes();
        System.out.println("\n===========================\n");
        veiculo4.exibirDetalhes();
        System.out.println("\n===========================\n");
        veiculo5.exibirDetalhes();
        System.out.println("===========================");
    }
}