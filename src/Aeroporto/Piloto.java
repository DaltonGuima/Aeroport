package Aeroporto;

public class Piloto extends Pessoa {
    private int horasDeVoo;
    private boolean disponibilidade;
    private String especialidade;

    public int getHorasDeVoo() {
        return horasDeVoo;
    }

    public void setHorasDeVoo(int horasDeVoo) {
        this.horasDeVoo = horasDeVoo;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Piloto(String nome, int idade,
            String documento, int horasDeVoo,
            boolean disponibilidade, String especialidade) {

        super(nome, idade, documento);
        this.horasDeVoo = horasDeVoo;
        this.disponibilidade = disponibilidade;
        this.especialidade = especialidade;
    }

    public void informacoes() {
        String simOuNao;
        if (disponibilidade)
            simOuNao = "disponível";
        else
            simOuNao = "Não disponível";

        informacoesPessoa();
        System.out.println(
                "\n---Piloto---" +
                        "\nHoras de Vôo: " + horasDeVoo + "h" +
                        "\nDisponibilidade: " + simOuNao +
                        "\nEspecialidade: " + especialidade);
    }

}
