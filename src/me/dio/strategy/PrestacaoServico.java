package me.dio.strategy;

import java.util.Scanner;

public class PrestacaoServico extends Transacao {
    public PrestacaoServico() {
        this.impostoIncidente = new Iss(getValorTransacao());
    }

    public void setValorTransacao() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Valor do Serviço: R$ ");
        this.valorTransacao = scan.nextDouble();
    }

}
