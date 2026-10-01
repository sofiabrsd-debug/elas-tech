package lista.revisao1;

import java.util.Scanner;

public class ListaRevisao1 {
    static void main() {

        //1 - Crie um programa que peça ao usuário para digitar o nome de um lanche e o valor dele. Em seguida, verifique: se o valor for maior que R$ 30.00, aplique um desconto de R$ 5.00. No final, exiba uma mensagem usando concatenação e printf para formatar o preço com duas casas decimais.
        //Exemplo de saída: "O lanche Xis-Bacon custa R$ 28.50 \n"

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo! Digite o nome de um lanche:");
        String lanche = scanner.nextLine();

        System.out.println("Ótimo! Agora digite o valor dele:");
        double valor = scanner.nextDouble();
        double valorDesconto = (valor - 5.00);

        if (valor>30) {
            System.out.printf("Você ganhou R$5.00 de desconto! De " + valor + ", " + lanche + " fica %.2f\n", valorDesconto);
        } else {
            System.out.println("Certo, o total fica: " + valor + ", obrigada pela confiança e volte sempre!");
        }


    }
}
