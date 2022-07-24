package Questao05;
/*
Prova Técnica Java - Base.
Aluna: Ludmila Custódio Timóteo.
Data: 22/07/2022

05 - Crie uma um programa para trabalhar com estoque de uma loja,
o programa deverá trabalhar com Collection do tipo ArrayList do Java para manipular os dados desse estoque,
o programa deverá atender as seguintes funcionalidades:
 */

import java.util.ArrayList;
import java.util.Scanner;

public class TesteProduto {

    public static void main(String[] args) {

        ArrayList<Produto> produtos = new ArrayList<Produto>();
        Scanner entrada = new Scanner(System.in);
        int escolha = 0;

        while (escolha != -1) {

            System.out.println(
                    "1 - Adicionar produtos\n"
                    + "2 - Remover produtos\n"
                    + "3 - Atualizar um produto\n"
                    + "4 - Mostrar todos os dados\n"
                    + "5 - Para encerrar"
            );

            System.out.println("Digite sua escolha:");
            escolha = entrada.nextInt();
            entrada.nextLine();

            switch (escolha) {
                case 1:
                    System.out.println("\nDigite o nome do produto que você gostaria de adicionar: ");
                    String nome = entrada.nextLine();

                    System.out.println("\nDigite o preço do produto que você gostaria de adicionar: ");
                    double preco = entrada.nextDouble();

                    produtos.add(new Produto(nome, preco));

                    System.out.println("\nProduto " + nome + " adicionado com sucesso!");
                    break;
                case 2:
                    System.out.println("\nDigite o nome do produto que você gostaria de remover: ");
                    nome = entrada.nextLine();
                    for (int i = 0; i < produtos.size(); i++) {
                        if (produtos.get(i).getNomeProduto().equals(nome)) {
                            produtos.remove(i);
                            System.out.println("\nO produto " + nome + " foi removido com sucesso!");
                        }
                    }
                    break;
                case 3:
                    System.out.println("\nDigite o nome do produto que você gostaria de alterar:");
                    nome = entrada.nextLine();
                    for (int i = 0; i < produtos.size(); i++) {
                        if (produtos.get(i).getNomeProduto().equals(nome)) {
                            System.out.println("O produto " + nome + " foi encontrado!, digite o novo nome:");
                            String novoNome = entrada.nextLine();

                            System.out.println("Digite o novo preço:");
                            preco = entrada.nextDouble();

                            produtos.get(i).setPreco(preco);
                            produtos.get(i).setNomeProduto(novoNome);

                            System.out.println("\nO produto " + nome + " foi alterado com sucesso!");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Produtos");
                    for (int i = 0; i < produtos.size(); i++) {
                        System.out.println("Produto - " + produtos.get(i).getNomeProduto() + " - preco: R$"
                                + produtos.get(i).getPreco());
                    }
                    break;
                case 5:
                    escolha = -1;
                    System.out.println("\nEncerrando programa");
                    break;

                default:
                    System.out.println("Escolha inexistente");
            }
        }

        entrada.close();
    }
}
