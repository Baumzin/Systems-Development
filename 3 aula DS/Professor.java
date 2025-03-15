/*
rm
nome
email
telefone
endereco
*/
public class Professor{
    private int rm;
    private String nome;
    private String email;
    private String telefone;
    //a variável endereço é muito ampla de informações, então definimos ela como uma classe
    private Endereco endereco;


    //método construtivo:
    // padrão:
    public Professor(){}

    //novo tipo:
    public Professor(String nome, int rm, String email){
        this.email = email;
        this.nome = nome;
        this.rm = rm;
    }
    //métodos funcionais:
    public int getRm() {
        return rm;
    }

    public void setRm(int rm) {
        this.rm = rm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String pegarDados(){
        return  "Professor\nNome:"+nome+
                "\nRm:"+rm+
                "\nEmail:"+email;

    }
}




