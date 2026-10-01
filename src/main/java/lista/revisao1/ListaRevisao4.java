package lista.revisao1;

public class ListaRevisao4 {
    static void main() {
        //4 - Crie uma classe chamada Pet.
        //Dê a ela três atributos: nome (String), raca (String) e peso (double).
        //Em outra classe, instancie (crie) dois objetos diferentes dessa classe (por exemplo, um cachorro e um gato).
        //Atribua valores para os atributos de cada um deles.
        //Imprima os dados dos dois pets concatenando textos e variáveis.

        Pet cachorro = new Pet();
        cachorro.nome = "Bento";
        cachorro.peso = 12.5;
        cachorro.raca = "Pug";

        Pet gato = new Pet();
        gato.nome = "Cookie";
        gato.peso = 7.5;
        gato.raca = "Desconhecida";

        System.out.println("Olá! Vejo que você tem dois pets, que fofinhos!\nAntes de continuarmos vou có repetir os dados que você forneceu a nossa recepcionista ok?\nComeçando pelo seu doguinho:\n" + "Nome:" + cachorro.nome + "\n" + "Peso:" + cachorro.peso + "kg" + "\n" + "Raça:" + cachorro.raca);

        System.out.println("Agora seu gatinho, vamos lá?\nNome:" + gato.nome + "\n" + "Peso:" + gato.peso + "kg\n" + "Raça:" + gato.raca);
    }
}
