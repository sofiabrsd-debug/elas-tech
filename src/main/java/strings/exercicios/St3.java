package strings.exercicios;

import java.util.Scanner;

public class St3 {
    static void main() {
        Scanner scanner = new Scanner (System.in);

        //String nome = "Maria Silva";
        //nome.length();                 // 11
        //nome.toUpperCase();            // MARIA SILVA
        //nome.toLowerCase();            // maria silva
        //nome.contains("Silva");        // true
        //nome.charAt(0);                // M
        //nome.substring(0, 5);          // Maria
        //nome.replace("Silva","Souza"); // Maria Souza
        //"  oi ".trim();               // "oi"
        //nome.equals("maria silva");           // false
        //nome.equalsIgnoreCase("maria silva"); // true

        //3 — Peça o nome da pessoa e mostre a primeira letra dele.

        System.out.println("Por favor, digite seu nome bb:");
        String nome = scanner.nextLine();

        System.out.println("Perfeitoooo, quer saber a primeira letra do seu nome?\nPois aqui está==> " + nome.charAt(0));
    }
}
