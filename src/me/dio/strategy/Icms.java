package me.dio.strategy;

public class Icms implements Imposto {

    private double valorMercadoria;
    private double baseDeCalculo;
    private double aliquota = 0.15;

    public Icms(double valorMercadoria) {
        this.valorMercadoria = valorMercadoria;
        this.baseDeCalculo = this.valorMercadoria/(1-this.aliquota);
    }

    @Override
    public double calcular() {
        return baseDeCalculo*aliquota;
    }
}
