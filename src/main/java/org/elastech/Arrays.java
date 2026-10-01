package org.elastech;

public class Arrays {
    static void main() {

        //1 — Crie um array com os nomes de 5 pessoas. Mostre o primeiro, o terceiro e o último.

        String[] alunas = {"Sofia", "Bia", "Júlia", "Yasmim", "Ceci"};
        System.out.println(alunas[0]);
        System.out.println(alunas[2]);
        System.out.println(alunas[4]);

        //2 — Crie um array com as notas {8, 6, 10, 7, 9}. Usando um laço, mostre todas, uma por linha, assim: "Nota 1: 8".

        int[] notas = {8, 6, 10, 7, 9};
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i+1) + ": " + notas[i]);
        }

        //3 — Com o mesmo array de notas, calcule e mostre a soma e a média.

        System.out.println("Soma das notas:" + (notas.length));
    }
}
