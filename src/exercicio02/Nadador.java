package exercicio02;

import java.util.Scanner;

public class Nadador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // usuário informa a idade
        System.out.println("Informe sua idade: ");
        int idade = scan.nextInt();

        // condição para selecionar a categoria do nadador
        if (idade >= 5 && idade <= 7) {
            System.out.println("Infantil A");
        } else if (idade >= 8 && idade <= 10) {
            System.out.println("Infantil B");
        } else if (idade >= 11 && idade <= 13) {
            System.out.println("Juvenil A");
        } else if (idade >= 14 && idade <= 17) {
            System.out.println("Juvenil B");
        } else if (idade >= 18) {
            System.out.println("Adulto");
        }

    }
}
