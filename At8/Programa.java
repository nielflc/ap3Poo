package pooap3daniel.At8;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.println("* * * NAVIO MERCANTE * * *");
        System.out.println();
        System.out.print("Nome: ");
        String nomeNavioMercante = entrada.nextLine();
        System.out.print("Número tripulantes: ");
        int numTripulantesMercante = entrada.nextInt();
        System.out.print("Carga(kg): ");
        double carga = entrada.nextDouble();
        System.out.print("Capacidade de Carga do navio(kg): ");
        double capacidadeCarga = entrada.nextDouble();

        System.out.print("Digite quantos carregamentos será feito: ");
        int quantidadeCarregamento = entrada.nextInt();

        System.out.println();

        System.out.println("* * * NAVIO CRUZADOR * * *");
        System.out.println();
        System.out.print("Nome: ");
        entrada.nextLine();
        String nomeNavioCruzador = entrada.nextLine();
        System.out.print("Número tripulantes: ");
        int numTripulantesCruzador = entrada.nextInt();
        System.out.print("Número de canhões: ");
        int numCanhoes = entrada.nextInt();
        System.out.print("Blindagem: ");
        double blindagemCruzador = entrada.nextDouble();
        System.out.print("Ataque: ");
        double ataqueCruzador = entrada.nextDouble();

        System.out.println();

        System.out.println("* * * NAVIO PORTA AVIÕES * * *");
        System.out.println();
        System.out.print("Nome: ");
        entrada.nextLine();
        String nomePortaAvioes = entrada.nextLine();
        System.out.print("Número tripulantes: ");
        int numTripulantesPortaAvioes = entrada.nextInt();
        System.out.print("Número de Aviões: ");
        int numAvioes = entrada.nextInt();
        System.out.print("Blindagem: ");
        double blindagemPortaAvioes = entrada.nextDouble();
        System.out.print("Ataque: ");
        double ataquePortaAvioes = entrada.nextDouble();

        NavioMercante navioMercante = new NavioMercante(capacidadeCarga, carga, numTripulantesMercante, nomeNavioMercante);

        Cruzador cruzador = new Cruzador(numCanhoes, blindagemCruzador, ataqueCruzador, numTripulantesCruzador, nomeNavioCruzador);

        PortaAvioes portaAvioes = new PortaAvioes(numAvioes, blindagemPortaAvioes, ataquePortaAvioes, numTripulantesPortaAvioes, nomePortaAvioes);
        
        System.out.println();
        
        System.out.println("* * * LISTAGEM DOS NAVIOS * * *");
        
        System.out.println();

        System.out.print(navioMercante.toString());
        navioMercante.carregamento(quantidadeCarregamento);
        System.out.println();
        System.out.println(cruzador.toString());
        System.out.println();
        System.out.println(portaAvioes.toString());
        
        
        entrada.close();
    }

}
