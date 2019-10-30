package pooap3daniel;

import java.util.Scanner;

public class At7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[] nomes = new String[3];
        String[] telefones = new String[3];

        System.out.println("* * * Q U E S T Ã O  7 * * *");
        System.out.println();

        for (int i = 0; i < nomes.length; i++) {

            System.out.print("Digite um nome: ");
            nomes[i] = entrada.nextLine();
            System.out.print("Qual o telefone do " + nomes[i] + ": ");
            telefones[i] = entrada.nextLine();

        }
        System.out.println();
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Nome: " + nomes[i]);
            System.out.println("Telefone: " + telefones[i]);
            System.out.println();
        }
        System.out.println("");

        entrada.close();
    }

}
