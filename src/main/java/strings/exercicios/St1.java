package strings.exercicios;

import java.util.Scanner;

public class St1 {
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

        //1 — Peça o nome completo da pessoa e mostre quantas letras ele tem (contando os espaços).

        System.out.println("Bem vindo! Por favor, digite seu nome completo:");
        String nomeCompleto = scanner.nextLine();

        System.out.println("Seu nome tem " + nomeCompleto.length() + " caracteres.");

    }
}
