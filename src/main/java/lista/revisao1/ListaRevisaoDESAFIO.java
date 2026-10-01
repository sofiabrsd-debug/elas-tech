package lista.revisao1;

import java.util.Scanner;

public class ListaRevisaoDESAFIO {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            Aluna aluna = new Aluna();

            System.out.println("Bem-vindo! Gostaria de iniciar?\nDigite 1 para continuar e 2 para sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    scanner.nextLine();
                    System.out.println("Nome da aluna:");
                    aluna.nome = scanner.nextLine();


                    System.out.println("Insira a AV1:");
                    aluna.nota = scanner.nextDouble();

                    System.out.println("Insira a AV2:");
                    aluna.nota2 = scanner.nextDouble();

                    aluna.media = (aluna.nota + aluna.nota2)/2;
                    scanner.nextLine();

                    System.out.printf("A aluna " + aluna.nome + ", tirou " + aluna.nota + " como AV1, " + aluna.nota2 + " como AV2. Sua média é %.1f\n", aluna.media);

                    if (aluna.media >= 6) {
                        aluna.passou = true;
                    } else {
                        aluna.passou =false;
                    }
                    System.out.printf("Aluna aprovada: %b\n\n", aluna.passou);

                    break;
                case 2:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 2);

    }
}
