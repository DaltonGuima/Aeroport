package Aeroporto;

public class Passageiro extends Pessoa {
    private String destino;
    private String classe;
    private String assento;

    public Passageiro(String nome, int idade,
            String documento, String destino,
            String classe, String assento) {

        super(nome, idade, documento);
        this.destino = destino;
        this.classe = classe;
        this.assento = assento;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getAssento() {
        return assento;
    }

    public void setAssento(String assento) {
        this.assento = assento;
    }

    public void informacoes() {
        informacoesPessoa();
        System.out.println(
                "\n---Passageiro---" +
                        "\nDestino: " + destino +
                        "\nClasse: " + classe +
                        "\nAssento: " + assento);
    }
}
