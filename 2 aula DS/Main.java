//esta é uma classe driver (se torna executavel)

public class Main {
    public static void main(String[] args){
        //para fazer o uso de um objeto aqui (outro arquivo):
        //basta por o nome do objeto aqui que servirá como uma variável (sem ele, não é possivel)

        Aluno aluno1 = new Aluno(); //o Aluno aqui é a função que cria um objeto (que objeto? aluno!)
        //e o armazena em aluno1
        aluno1.rm = 20240207;
        aluno1.setNome("bReNo"); // coisa de usuário BIOS (Burro Ignorante Operador de Sistema)
        aluno1.email = "breno@etec.com";

        //esse construtor padrão não pega parametros!

        Aluno aluno2 = new Aluno(20240194, "Fabricio", "fabricio@etec.com");
        System.out.println(aluno2.rm);
        System.out.println(aluno2.getNome());
        System.out.println(aluno2.email);

        //instanciar um objeto = criar um objeto
        //instancia do objeto = aluno3
        //classe, instancia de objeto, instanciar um objeto
        // Aluno        aluno3       =    new Aluno(){};
    }
}