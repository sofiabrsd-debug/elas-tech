package org.elastech;

public class Concatenação {
    static void main() {
        //1- Crie variáveis para um nome, uma cidade e uma idade. Mostre em uma única linha: "Meu nome é Ana, moro em Salvador e tenho 28 anos."

        String nome = "Sofia";
        String cidade = "Osasco";
        int idade= 18;

        System.out.println("Olá! Meu nome é " + nome + "." + " Eu tenho " + idade + " anos, e moro em " + cidade + ".");

        //2 — Crie variáveis para o nome de um produto ("Caneca"), o preço (12.50) e a quantidade (4). Mostre: "Comprei 4 unidades de Caneca por R$ 12.5 cada. Total: R$ 50.0"

        String produto = "Caneca";
        double preco = 12.50;
        int quantidade = 10;

        System.out.println("Comprei " + quantidade + " unidades de " + produto + " por R$" + preco + " cada. Total: " + (preco*quantidade) + ".");

        //3- Crie duas variáveis com números inteiros. Mostre a soma em uma frase completa, assim: "A soma de 15 e 4 é igual a 19."

        int numero1 = 5086;
                int numero2 = 786;

                        System.out.println("A soma de " + numero1 + " e " + numero2 + " é igual a " + (numero1+numero2));
    }
}
