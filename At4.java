package pooap3daniel;

import java.util.Scanner;

public class At4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("* * * Q U E S T Ã O  4 * * *");
        System.out.println();

        System.out.println("U T I L I Z A N D O  F O R");
        System.out.println("---------------------------");

        System.out.print("Digite seu nome: ");
        String nomeFor = entrada.nextLine();

        for (int i = 1; i <= 10; i++) {
            System.out.println(nomeFor);
        }
        System.out.println();
        System.out.println("U T I L I Z A N D O  W H I L E");
        System.out.println("------------------------------");
        
        System.out.print("Digite seu nome: ");
        String nomeWhile = entrada.nextLine();

        int contador = 1;
        while (contador <= 10) {
            System.out.println(nomeWhile);
            contador++;
        }
        
        System.out.println();
        System.out.println("U T I L I Z A N D O  DO - W H I L E");
        System.out.println("-----------------------------------");
        
        System.out.print("Digite seu nome: ");
        String nomeDoWhile = entrada.nextLine();
        
        int contador1 = 1;
        do {            
            System.out.println(nomeDoWhile); 
            contador1++;
        } while (contador1 <= 10);

        entrada.close();
    }

}
