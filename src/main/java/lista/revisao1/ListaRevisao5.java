package lista.revisao1;

import java.util.Scanner;

public class ListaRevisao5 {
    static void main() {
        //5 - Crie uma classe chamada Produto com os atributos nome (String) e preco (double).

        //Na classe principal, faça um laço for que repita 3 vezes.

        //A cada repetição, o programa deve usar o Scanner para perguntar o nome e o preço de um produto.

        //Instancie um novo Produto e guarde nele os valores digitados.

        //Logo em seguida, faça um if: se o preço do produto for maior que 100, imprima "Produto caro!". Se for menor ou igual, imprima "Produto com preço acessível!". Use printf para mostrar o valor.

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3 ; i++) {
            System.out.println("Digite o nome do produto:");
            String nomeProduto = scanner.nextLine();
            System.out.println("Digite o preço do produto:");
            double precoProduto = scanner.nextDouble();
            scanner.nextLine();

            Produto produto = new Produto();
             produto.nome = nomeProduto;
             produto.preco = precoProduto;

            if (precoProduto>100) {
                System.out.printf("Produto caro! Valor: R$ %.2f\n", produto.nome);
            } else {
                System.out.printf("Produto com preço acessível! Valor: R$ %.2f\n\n", produto.preco);
            }

        }
    }
}
