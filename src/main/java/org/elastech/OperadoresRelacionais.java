package org.elastech;

public class OperadoresRelacionais {
    static void main() {

        //1- Crie variáveis para as notas de duas alunas.
        // Mostre na tela o resultado de: são iguais, são diferentes, a primeira é maior, a primeira é menor para quando:
        //- a = 10, b = 3
        //- a = 3, b = 10
        //- a = 5, b = 5

        int maria = 10;
        int brenda = 3;

        if (maria==brenda) {
            System.out.println("As notas são iguais!");
        } else  {
                System.out.println("As notas são diferentes :(");
        } if (maria>brenda){
            System.out.println("A primeira nota é maior.");
        } else {
            System.out.println("A primeira nota é menor.");
        }

        //2- Exiba na tela  a == b, sendo a = 10 e b 3.

        int a = 10;
        int b = 3;
        System.out.println(+ a + " e " + b + " são iguais? " + (a==b));

        //3- Exiba na tela a != b, sendo a = 10 e b = 3.

        int a2 = 10;
        int b2 = 3;
        System.out.println( a + " e " + b +" são diferentes? " + (a != b));

        //4- Dado boolean chovendo = true, retorne na tela o resultado de !chovendo

        boolean chovendo = true;
                System.out.println("Está chovendo? " + !chovendo);
    }
    }

