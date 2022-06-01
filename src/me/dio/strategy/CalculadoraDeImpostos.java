package me.dio.strategy;

import java.util.Scanner;

public class CalculadoraDeImpostos {

    public static void calcularImposto() {

        Imposto imposto;
        Scanner scan = new Scanner(System.in);

        System.out.println("=== CALCULADORA DE IMPOSTOS ===\nSelecione um tipo de transação:\n" +
                "1 - Venda de mercadoria\n2 - Prestação de serviço\n3 - Sair");
        System.out.print("Opção: ");
        int opcao = scan.nextInt();

        switch (opcao) {
            case 1:
                imposto = new Icms(informarValor());
                mostrarResultado(imposto);
                calcularImposto();
            break;
            case 2:
                imposto = new Iss(informarValor());
                mostrarResultado(imposto);
                calcularImposto();
            break;
            case 3:
                System.out.println("Saindo...");
                System.exit(0);
            default:
                System.out.println("Opção inválida.");
                calcularImposto();
        }
    }

    public static double informarValor() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Valor da nota: ");
        return scan.nextDouble();
    }

    public static void mostrarResultado(Imposto imposto) {
        double resultado = imposto.calcular();
        System.out.printf("Valor do Imposto: R$ %3.2f\n", resultado);
    }
}