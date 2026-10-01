package strings.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class St2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

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

        //2 — Peça o nome da pessoa e mostre ele todo em MAIUSCULO e todo em minusculo.

        System.out.println("Por favor, digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Seu nome em letras MAIÚSCULAS e minúsculas, respectivamente:\n" + nome.toUpperCase()  + ", " + nome.toLowerCase());


    }
}
