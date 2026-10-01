package org.elastech;

public class Arítiméticos {
    static void main() {

        System.out.println("2 + 2 = " + 2 + 2);
        System.out.println("2 + 2 = " + (2 + 2));
        //o primeiro concatena os números e o segundo faz a operação e concatena com o texto

        //1- Crie variáveis para dois números inteiros de valor a = 10 e b = 3 e mostre na tela: soma, subtração, multiplicação, divisão e resto.

        int a = 10;
                int b= 3;

                System.out.println("A soma de " + a + "+" + b + " é igual a " + (a+b) + ".");
                System.out.println("A subtração de " + a + "-" + b + " é igual a " + (a-b) + ".");
                System.out.println("A multiplicação de " + a + "*" + b + " é igual a " + (a*b) + ".");
                System.out.println("A divisão real de " + a + "/" + b + " é igual a " + (a/b) + ".");
                System.out.println("O resto da divisão real de " + a + "%" + b + " é igual a " + (a%b) + ".");

                //3- Crie variáveis para três notas (8, 6 e 10). Mostre a soma e a média.

         int nota1 = 8;
                 int nota2 = 6;
                 int nota3 = 10;

                 System.out.println("Suas notas das provas de matemática foram: " + nota1 + "," + nota2 + " e " + nota3 + ". A soma delas é " + (nota1+nota2+nota3) + ". Sua média na matéria é " + ((nota1+nota2+nota3)/3) + ".");

                 //4- Faça a operação a + b * c, sendo a = 3, b = 4 e c = 5.
        int a2 = 3;
                int b2 = 4;
                int c2 = 5;
                System.out.println(a2 + "+" + b2 + "*" + c2 +"= " + (a2 + b2*c2));

        //5- Faça a operação (a + b) * c, sendo a = 3, b = 4 e c = 5.

                System.out.println("(" +a2 + "+" + b2 + ")" +"*" + c2 + "= " + (a2+b2)* c2);

                //Desafio: Crie uma variável com 3785 segundos. Mostre quantos minutos inteiros isso dá e quantos segundos sobram. Dica: segundos/60 dá os minutos. segundos % 60 mostra os segundos restantes.

        int seg = 3785;
        System.out.println(seg + " segundos em minutos inteiros é " + seg/60 + ". Os segundos que sobram é " + seg%60 + ".");

    }
}
