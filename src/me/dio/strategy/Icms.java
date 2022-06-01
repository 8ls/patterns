package me.dio.strategy;

public class Icms implements Imposto {

    private final String sigla;
    private double baseDeCalculo;

    public Icms(double valorMercadoria) {
        this.sigla = "ICMS";
        this.baseDeCalculo = valorMercadoria/(1-0.15);
    }

    @Override
    public double calcular() {
        return baseDeCalculo*0.15;
    }

    @Override
    public String getSigla() {
        return this.sigla;
    }

}
