package me.dio.strategy;

public class Iss implements Imposto {

    private double valorServico;
    private double aliquota = 0.04;

    public Iss(double valorServico) {
        this.valorServico = valorServico;
    }

    @Override
    public double calcular() {
        return valorServico*aliquota;
    }
}
