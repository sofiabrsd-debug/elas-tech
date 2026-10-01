package strings.exercicios;

import java.util.Scanner;

public class St4 {
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

        //4 — Peça uma frase e uma palavra. Diga se a palavra aparece dentro da frase.

        //Digite uma frase: Estou aprendendo Java
        //Digite uma palavra: Java
        //A palavra aparece na frase? true

        System.out.println("Digite uma frase:");
        String frase = scanner.nextLine();

        System.out.println("Agora, uma palavra:");
        String palavra = scanner.nextLine();

        System.out.println("A palavra aparece na frase? " + frase.contains(palavra));
    }
}
