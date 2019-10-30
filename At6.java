package pooap3daniel;

import java.util.Scanner;

public class At6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[] dias = new String[]{"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};

        System.out.println("* * * Q U E S T Ã O  6 * * *");
        System.out.println();
       
        System.out.print("Digite um número: ");
        int numero = entrada.nextInt();
        
        switch(numero) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Opção inválida");
                break;

        }

        entrada.close();
    }
}
