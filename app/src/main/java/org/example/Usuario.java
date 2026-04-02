package java.org.example;

public class Usuario {
    private final String nome;

    private final String senha;

    public Usuario(String senha, String nome) {
        this.senha = senha;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }
}
