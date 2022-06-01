package me.dio.strategy;

public class Iss implements Imposto {

    private final String sigla;
    private double baseDeCalculo;

    public Iss(double valorServico) {
        this.sigla = "ISS";
        this.baseDeCalculo = valorServico;
    }

    @Override
    public double calcular() {
        return baseDeCalculo*0.04;
    }

    @Override
    public String getSigla() {
        return this.sigla;
    }

}
