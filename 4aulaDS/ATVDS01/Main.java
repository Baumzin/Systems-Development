//objetivo da atividade:
//na classe produto:
//  - defina 5 atributos para representar um Produto
//  - Defina no mínimo 3 métodos construtores
//  - Faça o encapsulamento de todos os atributos da classe
//  - Desenvolva métodos de funcionalidades que você achar necessário
//na classe Main apresente um menu com opções:
//  - Criar um produto:
//  - Alterar dados de um produto:
//  - Excluir um produto:
//  - Listar todos os produtos
//  - Sair
//O programa somente se encerrará quando o usuário solicitar "Sair"

//enviar pelo github com read.me explicando como resolvi a atividade

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static Scanner entrada = new Scanner(System.in);

    static Produto produto = new Produto();
    static int opcao;

    // crio as lista que armazenarão os produtos e seus atributos
    static List<Produto> atributoProdutos = new ArrayList<Produto>();
    static List<Produto> listaProdutos = new ArrayList<Produto>();

    public static void main(String[] args) {

        boolean sair = false;

        do {
            
            System.out.println("\nBem vindo! Selecione uma das opções para prosseguir:\n");
            System.out.println("1 - Criar um produto");
            System.out.println("2 - Alterar dados de um produto");
            System.out.println("3 - Excluir um produto");
            System.out.println("4 - Listar todos os produtos");
            System.out.println("5 - Sair");

            opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {
                case 1: {
                    cadastrar();
                }
                    break;
                case 2: {
                    alterarProduto();
                }
                break;
                case 3: {
                    RemoverProduto();
                }
                    break;
                case 4: {
                    listaDeProdutos();
                }
                    break;
                case 5: {
                    System.out.println("Obrigado por usar meu programa!!");
                    sair = true;
                }
                    break;
                default: {
                    System.out.println("Opção inválida, digite novamente\n");
                }

            }
        } while (sair == false);

    }

    //------------------------------------------------------------------------------//
    private static void cadastrar() {

        System.out.println("Insira o nome do seu produto: ");
        String nome = entrada.nextLine();

        System.out.println("Insira a cor do seu produto: ");
        String cor = entrada.nextLine();

        atributoProdutos.add(new Produto(nome, cor));

        System.out.println("Insira o código do seu produto: ");
        int codigo = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Insira a quantidade de produtos disponíveis: ");
        int quantidade = entrada.nextInt();

        atributoProdutos.add(new Produto(codigo, quantidade));

        System.out.println("Insira o preço do seu produto: ");
        float preco = entrada.nextFloat();
        produto.setPreco(preco);
        entrada.nextLine();

        Produto produto = new Produto(nome, cor, codigo, quantidade, preco);

        // em seguida, adiciono esse produto na lista de produtos
        listaProdutos.add(produto);
        System.out.println("Produtos na lista:" + listaProdutos.size());

        System.out.println("Produto cadastrado!\n");
    }
    //----------------------------------------------------------------------------------//

    private static void alterarProduto (){
        if (listaProdutos.isEmpty() == true) {
            System.out.println("Não há produtos para alterar!\n");
            return;
        
        }

        System.out.println("Qual produto você gostaria de alterar? (digite seu indice)");
        // Eu crio um laço for para mostrar todos os produtos criados dentro da lista
        for (int i = 0; i < listaProdutos.size(); i++) { // para i = 0 e i < tamanho dos produtos da lista,
                                                         // vai mostrando todos os produtos
            System.out.println((i + 1) + " - " + listaProdutos.get(i).getNome()); // Aqui eu mostro o indice
                                                                                  // e o nome do produto
        }

        int alterar = entrada.nextInt();
        entrada.nextLine();

        // crio um if para verificar se o indice inserido realmente existe

        if (alterar > listaProdutos.size() || alterar <= 0) {
            System.out.println("Indice inválido!\n ");
            return;
        }

        int indice = alterar - 1; // aqui eu subtrai 1 do indice para acertar com o indice correto da lista

        Produto produtoAlterado = listaProdutos.get(indice); // aqui eu pego o produto que eu quero alterar
                                                             // e caço na listaProdutos pelo indice
                                                             // escolhido pelo usuário

        System.out.println("Qual atributo você gostaria de alterar?");
        System.out.println(produtoAlterado.detalhesDoProduto());

        alterar = entrada.nextInt();
        entrada.nextLine();

        switch (alterar) {
            case 1:
                System.out.println("Insira o novo nome do produto: ");
                String novoNome = entrada.nextLine();
                produtoAlterado.setNome(novoNome);
                System.out.println("Nome alterado!\n");
                break;
            case 2:
                System.out.println("Insira o novo código do produto: ");
                int novoCodigo = entrada.nextInt();
                entrada.nextLine();
                produtoAlterado.setCodigo(novoCodigo);
                System.out.println("Código alterado!\n");
                break;
            case 3:
                System.out.println("Insira a nova cor do produto: ");
                String novaCor = entrada.nextLine();
                produtoAlterado.setCor(novaCor);
                System.out.println("Cor alterado!\n");
                break;
            case 4:
                System.out.println("insira o novo preço do produto: ");
                float novoPreco = entrada.nextFloat();
                entrada.nextLine();
                produtoAlterado.setPreco(novoPreco);
                System.out.println("Preço alterado!\n");
                break;
            case 5:
                System.out.println("Digite a nova quantidade do produto:");
                int novaQuantidade = entrada.nextInt();
                entrada.nextLine();
                produtoAlterado.setQuantidade(novaQuantidade);
                System.out.println("Quantidade alterada!\n");
                break;
            default:
                System.out.println("Atributo inválido!\n");
            break;
        }
    }

    static void RemoverProduto(){

         // codigo para conferir se existe um produto na lista de vetor
         if (listaProdutos.isEmpty() == true) {
            System.out.println("Não há produtos para excluir!\n");
            return;
        }

        System.out.println("Qual produto você gostaria de remover?");
        // para i = 0 e i < tamanho dos produtos da lista, vai mostrando todos os
        // produtos
        for (int i = 0; i < listaProdutos.size(); i++) {
            // Aqui eu mostro o indice e o nome do produto
            System.out.println((i + 1) + " - " + listaProdutos.get(i).getNome());
        }

        int excluir = entrada.nextInt();
        entrada.nextLine();

        if (excluir > listaProdutos.size() || excluir <= 0) {
            System.out.println("Indice inválido!\n ");
        }
        // caso o usuario escolha um indice valido, ele vai remover o produto da lista
        else {
            // coloca o indice exato digitado pelo usuário (indice 1 digitado == 0 na lista)
            int indice = excluir - 1;

            // a função .remove é nativa do java, que exclui o elemento da lista
            listaProdutos.remove(indice);

            System.out.println("Produto removido!\n");
        }

    }

    //------------------------------------------------------------------------------------------------//
    static void listaDeProdutos(){
        if (listaProdutos.isEmpty() == true) {
            System.out.println("Não há produtos existentes para listar!\n");
            return;
        }

        for (int i = 0; i < listaProdutos.size(); i++) {
            System.out.println((i + 1) + " - " + listaProdutos.get(i).getNome());
        }
    }
    //------------------------------------------------------------------------------------------------//

    

}
