package exercicio01;

import java.util.Scanner;

public class Censo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Informe seu salário: ");
            float salario = scan.nextFloat();
            System.out.println("Informe a quantidade de filhos: ");
            int filhos = scan.nextInt();

            float media = salario / salario;
        } while (true);
    }
}
