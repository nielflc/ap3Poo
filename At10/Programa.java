package pooap3daniel.At10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) throws ParseException {

        Scanner entrada = new Scanner(System.in);
        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Nome: ");
        String nomePaciente = entrada.nextLine();
        System.out.print("Endereço: ");
        String enderecoPaciente = entrada.nextLine();
        System.out.print("Data Nascimeto: ");
        Date dataNascimento = dataFormatada.parse(entrada.nextLine());
        
        
        entrada.close();

    }

}
