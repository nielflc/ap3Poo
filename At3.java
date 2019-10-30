package pooap3daniel;

import java.util.Scanner;

public class At3 {

    public static void main(String[] args) {
        int numero, expoente, resultadofor = 1, resultadowhile = 1, resultadoDowhile = 1;

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("* * * Q U E S T Ã O  3 * * *");
        System.out.println();

        //USANDO O FOR
        System.out.println("M E T O D O  F O R");
        System.out.println("------------------");

        System.out.printf("Digite um número: ");
        numero = entrada.nextInt();

        System.out.printf("Digite o expoente: ");
        expoente = entrada.nextInt();

        if (numero < 0 || expoente < 0) {
            System.out.println("Número inválido!");
        } else {
            for (int i = 1; i <= expoente; i++) {
                resultadofor = resultadofor * numero;

            }
            System.out.println("O valor de " + numero + " elevado a " + expoente + " é: " + resultadofor);
            System.out.println("");
        }

        System.out.println("M E T O D O  W H I L E");
        System.out.println("----------------------");

        System.out.printf("Digite outro número: ");
        numero = entrada.nextInt();

        System.out.printf("Digite outro expoente: ");
        expoente = entrada.nextInt();

        if (numero < 0 || expoente < 0) {
            System.out.println("Número inválido!");
        } else {
            int i = 1;
            while (i <= expoente) {
                resultadowhile = resultadowhile * numero;
                i++;
            }

            System.out.println("O valor de " + numero + " elevado a " + expoente + " é: " + resultadowhile);
            System.out.println("");
        }

        //USANDO DO-WHILE
        System.out.println("M E T O D O  D O - W H I L E");
        System.out.println("----------------------------");

        System.out.printf("Digite novamente um número: ");
        numero = entrada.nextInt();

        System.out.printf("Digite novamente um expoente: ");
        expoente = entrada.nextInt();

        if (numero < 0 || expoente < 0) {
            System.out.println("Número inválido!");
        } else {
            int i = 1;
            do {
                resultadoDowhile = resultadoDowhile * numero;
                i++;
            } while (i <= expoente);

            System.out.println("O valor de " + numero + " elevado a " + expoente + " é: " + resultadoDowhile);
            System.out.println("");
        }

    }
}
