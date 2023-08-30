package Aeroporto;

public class Pessoa {
    private String nome;
    private int idade;
    private String documento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Pessoa(String nome, int idade, String documento) {
        this.nome = nome;
        this.idade = idade;
        this.documento = documento;
    }

    public void informacoesPessoa() {
        System.out.println("\nNome: " + nome +
                "\nIdade: " + idade +
                "\nDocumento: " + documento);
    }

}
