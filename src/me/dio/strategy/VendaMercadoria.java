package me.dio.strategy;

import java.util.Scanner;

public class VendaMercadoria extends Transacao {
    public VendaMercadoria() {
        this.impostoIncidente = new Icms(getValorTransacao());
    }

    public void setValorTransacao() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Valor da Mercadoria: R$ ");
        this.valorTransacao = scan.nextDouble();
    }

}
