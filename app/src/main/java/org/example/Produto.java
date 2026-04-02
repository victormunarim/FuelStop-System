package java.org.example;

public class Produto {
    private String nome;

    private double preco;

    private double estoque;

    public Produto(String nome, double preco, double estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public double calculaVenda(double quantidade) {
        return preco * quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getEstoque() {
        return estoque;
    }

    public double getPreco() {
        return preco;
    }

    public void subEstoque(double quantidade) {
        this.estoque -= quantidade;
    }
}
