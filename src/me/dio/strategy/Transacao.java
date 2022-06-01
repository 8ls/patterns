package me.dio.strategy;

public abstract class Transacao {

    protected Imposto impostoIncidente;
    protected double valorTransacao;

    public Transacao() {
        this.setValorTransacao();
    }

    public void setValorTransacao() {
    }

    public double getValorTransacao() {
        return this.valorTransacao;
    }

}