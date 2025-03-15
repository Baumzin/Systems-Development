//esta é uma classe driver (se torna executavel)

//esse import é necessário para funcionar a lista de alunos
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        //para fazer o uso de um objeto aqui (outro arquivo):
        //basta por o nome do objeto aqui que servirá como uma variável (sem ele, não é possivel)

        Aluno aluno1 = new Aluno(); //o Aluno aqui é a função que cria um objeto (que objeto? aluno!)
        //e o armazena em aluno1
        aluno1.setRm(20240207);
        aluno1.setNome("bReNo"); // coisa de usuário BIOS (Burro Ignorante Operador de Sistema)
        aluno1.setEmail("breno@etec.com");

        //esse construtor padrão não pega parametros!

        Aluno aluno2 = new Aluno(20240194, "Fabricio", "fabricio@etec.com");

        //esse system.out realiza os 3 acima em um único
        System.out.println(aluno2.getData());

        //instanciar um objeto = criar um objeto
        //instancia do objeto = aluno3
        //classe, instancia de objeto, instanciar um objeto
        // Aluno        aluno3       =    new Aluno(){};

        //--------------------------------------------------------------------------------------------//
        
        Aluno aluno3 = new Aluno();

        //posso criar um endereco primeiro antes de setar o endereco
        Endereco endereco = new Endereco("13065810", "665");
        aluno3.setEndereco(endereco);

        //ou apenas criar direto o endereco dentro do set
        aluno3.setEndereco(new Endereco("1312345", "132"));

        //aqui, para pegar apenas uma informação, você vai adentrando até chegar onde quer
        //aluno - endereco - logradouro
        //aluno3.getEndereco().getLogradouro();
        System.out.println(aluno3.getEndereco().getLogradouro());

        //------------------------------------------------------------------------//

        int[] numeros = new int[5]; //assim se cria um vetor de números
        numeros[0] = 7;
        numeros[1] = 12;
        //. . .//

        Aluno[] alunos = new Aluno[5]; //criado um vetor de alunos (cria 5 alunos na lista)

        //dessa forma é errada pois não sei qual aluno é (qual a posição que está)//
        //alunos.rm = 123;

        //Isso ainda assim daria erro ao executar, pois não foi criado objetos aluno, apenas um array
        //alunos[0].setRm(123);

        //para cada aluno do array, será necessário fazer isso:
        alunos[0] = new Aluno();
        alunos[0].setRm(123);

        //--------------------------------------------------------------------------//

        //2ª maneira://

        //dessa maneira, estou criando uma lista do tipo aluno que receberá um ArrayList do tipo aluno
        //ou seja, deixa o tamanho flexível do nosso array de alunos
        List<Aluno> listaAlunos = new ArrayList<Aluno>();

        listaAlunos.add(new Aluno(/*aqui dentro vai os atributos definidos no método construtor */));

        //ouuuuu//

        Aluno aluno6 = new Aluno();
        listaAlunos.add(aluno6);
    }
}