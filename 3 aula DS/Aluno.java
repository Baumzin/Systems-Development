//esta é uma classe de Objeto
//por ser um objeto, não tem o public static

public class Aluno {
//objeto é formado por três partes: 

//características <- ou atributos ou propriedades

private int rm;
private String nome;
private String email;
private Endereco endereco;

//métodos construtores <- ou funções construtores
/*
visibilidade, tipo_de_retorno, nome_funcao([parametros]){ // os colchetes tornam parametros opcionais

} 
public double somar(double a, double b){

}
*/
public Aluno() {} //pronto, construtor definido!

    //metodos construtores não precisam de tipo, só a visibilidade e um nome (talvez parametros)

    //toda vez que eu criar um novo tipo de construtor, eu tenho que defini-lo no construtor padrão
    public Aluno(int rm, String nome, String email){
        //o this.rm reconhece a variavel rm como global da classe, logo, sendo a caracteristica, que recebe o parametro rm
        this.rm = rm;
        this.nome = nome;
        this.email = email;
    }

    //esse novo construtor pega somente nome e rm caso alguém não tenha email
    public Aluno(int rm, String nome){
        this.rm = rm;
        this.nome = nome;
    }

    //por terem o mesmo tipo e estarem na mesma ordem, java não identifica a diferença
    //precisamos inverter a situação!
    public Aluno(String email, int rm){
        this.rm = rm;
        this.email = email;
    }   


    //métodos de funcionalidades (o que aquele objeto faz?)

    //aqui, sua função é mandar para a caracteristica nome todos os caracteres maiusculos
    public void setNome(String nome){
        this.nome = nome.toUpperCase();
    }

    //funções principais ao definir uma variável private - get e set

    //esta função irá pegar o nome e retornar ele (mesmo privado, funciona, logo, deixou nome protegido)
    public String getNome() {
        return nome;
    }

    //set = altera/define
    //get = pega

    public void setRm(int rm){
        this.rm = rm;
    }

    public int getRm(){
        return rm;
    }

    public void setEmail(String email){
        this.email = validarEmail(email);
    }

    public String getEmail(){
        return email;
    }

    //essa funcionalidade poupa aqueles trocentos System.out por apenas 1: esse aqui

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getData(){
        return "\nRm:"+rm+
               "\nNome:"+nome+
               "\nEmail:"+email;
    }

    private String validarEmail(String email){
        return email;
    }

    
}