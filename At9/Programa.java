package pooap3daniel.At9;

import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Piloto daniel = new Piloto("Daniel", new Historico());
        Piloto iury = new Piloto("Iury", new Historico());
        Piloto marco = new Piloto("Marco", new Historico());

        Pneu pneuMacio = new PneuMacio(5.0, 50.0, "Pirelli", 0);
        Pneu pneuDuro = new PneuDuro(10.0, 25, "Goodyeer", 0);

        Carro carroDaniel = new Carro(50, 60, new Equipe("Ferrari", "Itália"), daniel, pneuMacio);
        Carro carroIury = new Carro(50, 60, new Equipe("Mercedes", "Alemanha"), iury, pneuMacio);
        Carro carroMarco = new Carro(50, 60, new Equipe("Renault", "França"), marco, pneuDuro);

        System.out.println("==================================================");
        System.out.println("=          AS REGRAS DO CAMPEONATO SÃO:          =");
        System.out.println("= VITÓRIA GANHA 10 PONTOS NA CLASSIFICAÇÃO GERAL =");
        System.out.println("=   POLE GANHA 2 PONTOS NA CLASSIFICAÇÃO GERAL   =");
        System.out.println("==================================================");

        System.out.print("DIGITE O NÚMERO DE CORRIDAS NO CAMPEONATO:");
        int n = entrada.nextInt();

        System.out.println();

        System.out.println("*****************************");
        System.out.println("BOA TARDE AMIGOS DA FORMULA 1");
        System.out.println("*****************************");

        System.out.println();

        System.out.println("Mais uma corrida que promete ser super disputada");
        System.out.println("Vejam tudo sobre os 3 principais Pilotos que correrão hoje em busca do titulo da temporada");

        System.out.println();

        System.out.println("==================================================");

        System.out.println("DANIEL");
        System.out.println("*******");
        System.out.println("Piloto da equipe " + carroDaniel.getEquipe().getNome() + " da " + carroDaniel.getEquipe().getPais());

        System.out.println();

        System.out.println("IURY");
        System.out.println("*******");
        System.out.println("Piloto da equipe " + carroIury.getEquipe().getNome() + " da " + carroIury.getEquipe().getPais());

        System.out.println();

        System.out.println("MARCO");
        System.out.println("*******");
        System.out.println("Piloto da equipe " + carroMarco.getEquipe().getNome() + " da " + carroMarco.getEquipe().getPais());

        System.out.println("==================================================");

        System.out.println();

        if (n <= 3) {
            System.out.println("O campeonato sera curto. Apenas " + n + " corridas. Haja coração!");
        } else if (n <= 10) {
            System.out.println("Teremos um campeonato com " + n + " corridas" + " Haja coração!");
        } else {
            System.out.println("Teremos um campeonato longo com " + n + " corridas. Tudo pode acontecer. Haja coração!");
        }

        for (int i = 1; i <= n; i++) {

            System.out.println("Estamos aqui para o treino de classificação para a " + i + "ª corrida da temporada");

            System.out.println();

            System.out.println("QUEM CONSEGUIU A POLE?:");
            System.out.println("=============================");
            System.out.println("(1) Daniel");
            System.out.println("(2) Iury");
            System.out.println("(3) Marcos");
            System.out.println("=============================");
            System.out.print("ESCOLHA UM DOS 3 PILOTOS > ");
            int opcaoPole = entrada.nextInt();

            System.out.println();

            switch (opcaoPole) {
                case 1:
                    daniel.historico.ganharPole();

                    break;
                case 2:
                    iury.historico.ganharPole();
                    break;
                case 3:
                    marco.historico.ganharPole();
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;

            }

            System.out.println("Bem amigos já vai começar a " + i + "ª corrida da temporada.");
            System.out.println("Foi dada a Largada");
            System.out.println("Bandeirada Final");

            System.out.println("QUEM VENCEU A CORRIDA?:");
            System.out.println("=============================");
            System.out.println("(1) Daniel");
            System.out.println("(2) Iury");
            System.out.println("(3) Marcos");
            System.out.println("=============================");
            System.out.print("ESCOLHA UM DOS 3 PILOTOS > ");

            int opcaoVitoria = entrada.nextInt();

            System.out.println();

            switch (opcaoVitoria) {
                case 1:
                    daniel.historico.ganharCorrida();

                    break;
                case 2:
                    iury.historico.ganharCorrida();

                    break;
                case 3:
                    marco.historico.ganharCorrida();

                    break;
                default:
                    System.out.println("Opção invalida");
                    break;

            }

        }

        System.out.println();

        if (daniel.historico.getPontos() > iury.historico.getPontos()
                && daniel.historico.getPontos() > marco.historico.getPontos()) {
            if (iury.historico.getPontos() > marco.historico.getPontos()) {
                iury.historico.setClassificacao(2);
                marco.historico.setClassificacao(3);

            } else if (iury.historico.getPontos() < marco.historico.getPontos()) {
                iury.historico.setClassificacao(3);
                marco.historico.setClassificacao(2);

            } else {

                iury.historico.setClassificacao(2);
                marco.historico.setClassificacao(2);

            }

            daniel.historico.setClassificacao(1);
            System.out.println("Clasificação do Daniel: " + daniel.historico.getClassificacao());
            System.out.println("**************P A R A B É N S********************");
            System.out.println("TODOS EM FESTA PELO CAMPEONATO VENCIDO POR DANIEL");
        } else if (iury.historico.getPontos() > daniel.historico.getPontos()
                && iury.historico.getPontos() > marco.historico.getPontos()) {

            if (daniel.historico.getPontos() > marco.historico.getPontos()) {
                daniel.historico.setClassificacao(2);
                marco.historico.setClassificacao(3);

            } else if (daniel.historico.getPontos() < marco.historico.getPontos()) {
                daniel.historico.setClassificacao(3);
                marco.historico.setClassificacao(2);

            } else {
                daniel.historico.setClassificacao(2);
                marco.historico.setClassificacao(2);
            }

            iury.historico.setClassificacao(1);
            System.out.println("**************P A R A B É N S********************");
            System.out.println("TODOS EM FESTA PELO CAMPEONATO VENCIDO POR IURY");

        } else if (marco.historico.getPontos() > iury.historico.getPontos()
                && marco.historico.getPontos() > daniel.historico.getPontos()) {

            if (daniel.historico.getPontos() > iury.historico.getPontos()) {
                daniel.historico.setClassificacao(2);
                iury.historico.setClassificacao(3);

            } else if (daniel.historico.getPontos() < iury.historico.getPontos()) {
                daniel.historico.setClassificacao(3);
                iury.historico.setClassificacao(2);

            } else {
                daniel.historico.setClassificacao(2);
                iury.historico.setClassificacao(2);
            }

            marco.historico.setClassificacao(1);
            System.out.println("**************P A R A B É N S********************");
            System.out.println("TODOS EM FESTA PELO CAMPEONATO VENCIDO POR MARCO");

        } else {

            System.out.println("*****************EMPATOU*****************");
            System.out.println("COM ISSO O VENCEDOR É QUEM FEZ O PROGRAMA ");
            System.out.println("**************P A R A B É N S*************");
            System.out.println("******************DANIEL******************");
            System.out.println("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
            daniel.historico.setClassificacao(1);
            if (marco.historico.getPontos() > iury.historico.getPontos()) {
                marco.historico.setClassificacao(2);
                iury.historico.setClassificacao(3);
            } else if (marco.historico.getPontos() < iury.historico.getPontos()) {
                marco.historico.setClassificacao(3);
                iury.historico.setClassificacao(2);
            } else {
                marco.historico.setClassificacao(2);
                iury.historico.setClassificacao(2);
            }
        }

        System.out.println(" ");
        System.out.println(daniel.Status());
        System.out.println("---------------------------");
        System.out.println(iury.Status());
        System.out.println("---------------------------");
        System.out.println(marco.Status());

        entrada.close();
    }
}
