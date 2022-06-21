package exrecicio03;

import java.util.Scanner;

public class TotalVendas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //receber os 5 valores
        float valor1[] = new float[5];

        float prazo = 0, vista = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o código [V para à vista ou P para à prazo]: ");
            String transacao = scan.nextLine();

            System.out.println("Informe o valor das transações: ");
            float valor = scan.nextFloat();
            float primeiroPrazo = valor1[0];

            if (transacao.equals("P")) {
                prazo += valor;
                System.out.println("Primeira prestação à prazo: " + primeiroPrazo);

            } else if (transacao.equals("V")) {
                    vista += valor;
            }
            float soma = prazo + vista;
            System.out.println("À Vista: " + vista);
            System.out.println("À prazo: " + prazo);
            System.out.println("Valor total: " + soma);
        }
    }
}
