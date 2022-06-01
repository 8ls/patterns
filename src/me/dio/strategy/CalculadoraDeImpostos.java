package me.dio.strategy;

import java.util.Scanner;

public class CalculadoraDeImpostos {

    public static void selecionarTransacao() {
        Transacao transacao;
        Scanner scan = new Scanner(System.in);

        System.out.println("\n====== CALCULAR IMPOSTO ======\nSelecione um tipo de transação:\n" +
                "1 - Venda de mercadoria\n2 - Prestação de serviço\n3 - Sair");
        System.out.print("Opção: ");
        int opcao = scan.nextInt();

        switch (opcao) {
            case 1:
                transacao = new VendaMercadoria();
                exibirImposto(transacao.impostoIncidente);
                selecionarTransacao();
                break;
            case 2:
                transacao = new PrestacaoServico();
                exibirImposto(transacao.impostoIncidente);
                selecionarTransacao();
                break;
            case 3:
                System.out.println("Encerrando...");
                System.exit(0);
            default:
                System.out.println("Opção inválida.");
                selecionarTransacao();
        }
    }

    public static void exibirImposto(Imposto imposto) {
        System.out.printf("Valor do %s: R$ %3.2f\n", imposto.getSigla(), imposto.calcular());
    }
}