package strings.exercicios;

import java.util.Scanner;

public class St5 {
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

        //5 — Peça o nome da pessoa duas vezes e diga se os dois são iguais, ignorando maiúsculas e minúsculas.
        //Digite seu nome: Ana
        //Digite de novo: ANA
        //Os nomes são iguais? true

        System.out.println("Nome bb:");
        String nome = scanner.nextLine();

        System.out.println("Digite novamente, please:");
        String nome2 = scanner.nextLine();

        System.out.println("Os nomes são iguais? " + nome.equalsIgnoreCase(nome2));

    }
}
