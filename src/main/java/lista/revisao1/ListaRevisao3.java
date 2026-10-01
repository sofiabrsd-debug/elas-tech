package lista.revisao1;

import java.util.Scanner;

public class ListaRevisao3 {
    static void main() {
       //3 - Usando um do-while e um switch, crie um menu interativo. O menu deve oferecer três opções:
        //1 - Ver camisas
        //2 - Ver calças
        //3 - Sair
        //Se a pessoa digitar 1 ou 2, exiba uma mensagem confirmando a escolha. Se digitar uma opção inválida, avise. O laço só deve ser quebrado (encerrado) quando a pessoa digitar 3.

        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("Escolha uma das opções:\n 1)Ver camisas\n 2)Ver calças\n 3)Sair");
             opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Você escolheu a opção:\n1)Ver camisas");
                break;
            case 2:
                System.out.println("Você escolheu a opção:\n2)Ver calças");
                break;
            case 3:
                System.out.println("Sair");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
        } while (opcao != 3);
    }
}
