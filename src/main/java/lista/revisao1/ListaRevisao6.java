package lista.revisao1;

import java.util.Scanner;

public class ListaRevisao6 {
    static void main() {

        //6 - Crie um programa para cadastrar um usuário. Siga exatamente esta ordem:

        //Peça para o usuário digitar o seu Ano de Nascimento (leia usando nextInt()).

        //Logo em seguida, peça para ele digitar o seu Nome Completo (leia usando nextLine()).

        //Por fim, imprima uma mensagem concatenada: "O usuário [NOME] nasceu em [ANO]."

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu ano de nascimento:");
        String ano = scanner.nextLine();

        System.out.println("Digite seu nome completo:");
        String nome = scanner.nextLine();

        System.out.println("O usuário " + nome + ", nasceu em " + ano + ".");
    }
}
