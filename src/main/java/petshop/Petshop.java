package petshop;

import java.util.HashSet;

import java.util.ArrayList;

import java.util.InputMismatchException;

import java.util.Scanner;

public class Petshop {
     String nomePet;
    String nome;
     String especie;
    double peso;
     String porte;

    static void exibirFicha(Pet2 pet) {
        System.out.println("Nome: " + pet.nome);
    }

    static void main() {

        //1º EXERCÍCIO
        //String nome = "Bento";
        //String especie = "Pug";
        //double peso = 12.5;

        //System.out.println("=== FICHA DO PET ===\nNome: " + nome + "\nEspécie: " + especie + "\nPeso: " + peso);

        Scanner scanner = new Scanner(System.in);

        //2º EXERCÍCIO & 3º EXERCÍCIO
        //System.out.println("Bem vinda! Por favor digite o nome do seu pet: ");
        //String nome = scanner.nextLine();
        //System.out.println("Qual é a espécie?");
        //String especie = scanner.nextLine();
        //System.out.println("Qual é o peso?");
        //double peso = scanner.nextDouble();


        //System.out.println("Perfeito, confirma pra mim:\n===FICHA DO PET===\nNome: " + nome + "\nEspécie: " + especie + "\nPeso: " + peso + "\nPorte: " + porte  );

        //4º e 5º EXERCÍCIO

        //Pet2 pet2 = new Pet2();
        //pet2.nome = "Bento";
        //pet2.especie = "Pug";
        //pet2.peso = 12.5;
        //pet2.porte = pet2.definirPorte();
        //System.out.println("===FICHA PET=== \nNome: " + pet2.nome + "\nEspécie: " + pet2.especie + "\nPeso: " + pet2.peso + "\nPorte: " + pet2.porte);


        //6º EXERCÍCIO

        Pet2[] lista = new Pet2[5]; //array do tipo Petshop

        //Petshop bento = new Petshop(); //criei um objeto a a partir da classe Petshop

        //bento.nomePet = "Bento (Cachorro) - 12.5kg - Porte Médio";
        //lista[0] = bento;

        //System.out.println("==PETS CADASTRADOS===\n" + lista[0].nomePet);


        //7º EXERCÍCIO

        //int opcao = -1; //Se ela começasse com 0, a condição do while acharia que o usuário já escolheu sair logo de cara e o menu nem apareceria.

        //int total = 0; //Ele começa em 0 porque inicialmente nenhum pet foi cadastrado.
        //vai ocupar a posição 0 do array (lista[0]). Conforme novos pets entram, essa variável garante que o próximo pet vá para a posição correta (lista[1], lista[2], etc.).


        //while (opcao != 0) { //enquanto a opção for diferente de 0 rodar tal coisa:


        //System.out.println("===PETSHOP===\n1- Cadastrar pet\n0- Sair");
        //opcao = scanner.nextInt();
        //scanner.nextLine(); //para "pular a linha" certinho

        //switch (opcao) {

        //case 1:
        //Petshop novoPet = new Petshop(); //puxei o array lá de cima linha:45
        //lista[total] = novoPet;
        //total++;
        //System.out.println("Pet cadastrado! Agora são " + total + " pet(s)");
        //break; //lista[total] = objeto; -> Salva o pet novo na posição atual do array (representada pela variável total).

        // total++; -> Incrementa total em 1. Se acabou de cadastrar o 1º pet (total era 0), agora o total vira 1. No próximo cadastro, ele vai salvar na posição 1 e virar 2, e assim por diante.

        //case 0:
        //System.out.println("Até logo!");
        //break;

        //default:
        //System.out.println("Opção inválida.");

        //8º e 9º EXERCÍCIO


        int opcao = -1; //Se ela começasse com 0, a condição do while acharia que o usuário já escolheu sair logo de cara e o menu nem apareceria.

        int total = 0; //Ele começa em 0 porque inicialmente nenhum pet foi cadastrado.
        //vai ocupar a posição 0 do array (lista[0]). Conforme novos pets entram, essa variável garante que o próximo pet vá para a posição correta (lista[1], lista[2], etc.).


        while (opcao != 0) { //enquanto a opção for diferente de 0 rodar tal coisa:


            System.out.println("===PETSHOP===\n1- Cadastrar pet\n2- Listas pets\n3- Buscar pet\n4- Espécies cadastradas\n5- Fila de Banho\n6- Serviços\n0- Sair");

            try {
                opcao = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Apenas números!");
                scanner.nextLine();
            }

            FilaBanho filaDeBanho = new FilaBanho();

                switch (opcao) {
                    case 1:
                        // Cria um novo objeto Pet2 para cada cadastro
                        Pet2 novoPet = new Pet2();

                        System.out.print("Nome do pet: ");
                        novoPet.nome = scanner.nextLine();

                        System.out.print("Espécie: ");
                        novoPet.especie = scanner.nextLine();

                        System.out.print("Peso (kg): ");
                        novoPet.peso = scanner.nextDouble();
                        scanner.nextLine(); // Limpa o buffer do nextDouble

                        // Calcula o porte automaticamente usando o método do próprio objeto novoPet
                        novoPet.porte = novoPet.definirPorte();

                        // Guarda o objeto na posição atual do array e incrementa o total
                        lista[total] = novoPet;
                        total++;

                        System.out.println("Pet cadastrado! Agora são " + total + " pet(s).");
                        break;

                    case 2:
                        // Lista os pets cadastrados (Questão 8)
                        if (total == 0) {
                            System.out.println("Nenhum pet cadastrado.");
                        } else {
                            System.out.println("--- PETS CADASTRADOS ---");
                            for (int i = 0; i < total; i++) {
                                // Imprime no formato exato pedido pela saída esperada
                                System.out.println(lista[i].nome + " (" + lista[i].especie + ") - " + lista[i].peso + " kg - Porte " + lista[i].porte);
                            }
                        }
                        break;

                    case 3:
                        System.out.println("Digite o nome do Pet");
                        String busca = scanner.nextLine();

                        boolean achou = false;  //'achou' funciona como uma bandeirinha: começa como false (não encontrado)

//O 'for' passa de porta em porta (gaveta por gaveta) do array
                        for (int i = 0; i < total; i++) {
                            if (lista[i].nome.equalsIgnoreCase(busca)) {
                                // ignora maiuscula e minuscula
                                achou = true; //Se achou, mudamos a bandeirinha para true
                                System.out.println("Pet já cadastrado!");
                            }
                        }

                        //"se continuar não achando" após olhar o array todo

                        if (!achou) {
                            System.out.println("Não encontrado.");
                        }
                        break;

                    case 4 : System.out.println("--- ESPÉCIES CADASTRADAS ---");

                        HashSet<String> especiesUnicas = new HashSet<>(); // criei um HashSet

                        for (int i = 0; i < total; i++) {
                            especiesUnicas.add(lista[i].especie); // adicionei no HashSet só o atributo nome dos objetos do array
                        }
                        for (String especie : especiesUnicas) {
                            System.out.println("-" + especie);
                        }

                        System.out.println("Total de espécies diferentes: " + especiesUnicas.size());
                        break;


                    case 5:
                        System.out.print("Nome do pet pra entrar na fila: ");
                        String nome = scanner.nextLine();
                        filaDeBanho.entrarNaFila(nome); // Chama o método que adiciona o pet
                        filaDeBanho.atenderProximo(); // Chama o método que criámos na classe FilaBanho
                        break;

                    case 6: // Substitui pelo número da opção que quiseres dar no menu
                        System.out.print("Nome do pet: ");
                        String nomePet = scanner.nextLine(); // Lê o nome do pet introduzido

                        // Cria o ArrayList do tipo da interface Servico
                        ArrayList<Servico> listaServicos = new ArrayList<>();
                        listaServicos.add(new Banho());
                        listaServicos.add(new Tosa());
                        listaServicos.add(new Consulta());

                        // Percorre a lista com um for-each executando o método de cada serviço
                        for (Servico servico : listaServicos) {
                            servico.executar(nomePet);
                        }
                        break;


                    case 0:
                        System.out.println("Até logo!");
                        break;

                    default:
                        System.out.println("Opção inválida.");
                }
            }
        }
    }

