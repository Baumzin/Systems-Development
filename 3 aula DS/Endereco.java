public class Endereco {
    private String cep;
    private String logradouro; //via ou rua
    private String numero;
    private String bairro;
    private String cidade;

    public Endereco(){}
    
    public Endereco(String cep, String numero){
        //aqui eu usaria uma API dos correios para pegar o endereço completo, por exemplo!
        if(!cep.isEmpty()){
            //atribuir os outros valores 
            this.numero = numero;
        }else{
            //estão vazios para a pessoa completar depois
            this.cep = "";
            this.logradouro = "";
            this.numero = "";
            this.bairro = "";
            this.cidade = "";
        }
    }

    public String getCep() {
        return cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }
    
}





