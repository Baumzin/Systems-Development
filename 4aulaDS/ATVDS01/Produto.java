public class Produto {

    private int codigo;
    private String nome;
    private String cor;
    private float preco;
    private int quantidade;

    // ------------------------------------------ Métodos construtores -------------------------- //
    public Produto() {
    }

    public Produto(int codigo, int quantidade) {
        this.codigo = codigo;
        this.quantidade = quantidade;
    }

    public Produto(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
    }

    public Produto(String nome, String cor, int codigo, int quantidade, float preco) {
        this.nome = nome;
        this.cor = cor;
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    // --------------------------------- Set e Get -------------------------------//
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome.toLowerCase();
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    // -----------------------------------------------------------------------------//

    public String detalhesDoProduto() {
        return "\n1 - Nome : " + nome
                + "\n2 - Código:" + codigo
                + "\n3 - Cor : " + cor
                + "\n4 - Preco : R$" + preco
                + "\n5 - Quantidade : " + quantidade + "\n";
    }

}
