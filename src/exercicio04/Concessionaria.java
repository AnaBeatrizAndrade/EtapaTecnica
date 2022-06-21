package exercicio04;

import java.util.Scanner;

public class Concessionaria {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor do carro: ");
        double valorCarro = scan.nextFloat();

        double vista = valorCarro * 0.8;
        double parcelas6 = valorCarro * 1.03;
        double parcelas12 = valorCarro * 1.06;
        double parcelas18 = valorCarro * 1.09;

        System.out.println("Valor final à vista : " + vista);
        System.out.println("Com 6 parcelas: " + parcelas6);
        System.out.println("Com 12 parcelas: " + parcelas12);
        System.out.println("Com 18 parcelas: " + parcelas18);
    }
}
