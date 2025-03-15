//Classe = geralzao, objeto = individual

 //nome da classe tem que ser o mesmo do arquivo (por padrao todo nome de classe começa com letra maiuscula)

 //há dois tipos de classes em java: caracteristica e comportamento (função)

import java.util.Scanner; //nesse pacote (biblioteca) do java, pede para scanear a memoria dele
import java.util.AbstractCollection; //serve para consultar as classes

public class PrimeiraClasse{ 

    //public = publico, static = mantém o objeto unico na memoria, void = retorna nada, main = nome da nossa função, String e args são parametros
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in); //essa variavel tipo scanner vai criar um novo scanner para escanear la no sistema. Com a nova criação do objeto, devo guardar em uma
        //variavel do mesmo tipo: Scanner

        //corpo do projeto (a partir daqui começamos a codar)
        System.out.println("Hello, World!"); // = printf

        //como declaro variaveis em java? o mesmo que em C++
        String nome = "Breno";

        System.out.println(nome);

        System.out.print("Digite o seu nome:");
        nome = entrada.nextLine();//não sei escrever

        System.out.println("Olá "+nome+", seja bem vindo(a)");

        //existem 2 tipos de variaveis: primitivo e o não primitivo. Os primitivos são as variaveis nativas do java: int, float, char, byte (escreve todas em minusculo)
        // e as não nativas: string, arrays e classes
    }
}