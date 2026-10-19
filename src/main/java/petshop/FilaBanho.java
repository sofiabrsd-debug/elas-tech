package petshop;

import java.util.ArrayDeque;

public class FilaBanho {
    // O ArrayDeque fica guardado aqui dentro
    public ArrayDeque<String> fila = new ArrayDeque<>();

    // Método para adicionar um pet à fila
    public void entrarNaFila(String nomePet) {
        fila.add(nomePet);
        System.out.println(nomePet + " entrou na fila.");
        System.out.println("Fila agora: " + fila);
    }

    // Método para atender o próximo pet
    public void atenderProximo() {
        if (!fila.isEmpty()) {
            String proximo = fila.peek();
            System.out.println("Próximo da fila: " + proximo);

            String atendido = fila.poll();
            System.out.println("Atendendo " + atendido + "...");

            System.out.println("Fila agora: " + fila);
        } else {
            System.out.println("A fila de banho está vazia!");
        }
    }
}
