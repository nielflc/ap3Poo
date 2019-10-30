package pooap3daniel;

import java.util.Scanner;

public class At5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double media, soma = 0;
        double[] notas = new double[4];

        System.out.println("* * * Q U E S T Ã O  5 * * *");
        System.out.println();
        
        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();
        System.out.println();

        for (int i = 0; i < notas.length; i++) {

            System.out.print("Digite a " + (i + 1) + "ª nota do aluno " + nome + ": ");
            notas[i] = entrada.nextDouble();
            soma += notas[i];

        }

        media = soma / 4;
                
        System.out.println("");
        System.out.println("A média do aluno " + nome + " foi: " + String.format("%.1f", media));

        entrada.close();
    }

}
