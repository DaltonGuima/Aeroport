package Aeroporto;

import java.util.ArrayList;
import java.util.List;

public class Aeroporto {
    private String nome;
    private String cidade;
    private int totalDeAeronaves;
    private List<Aeronave> aeronaves = new ArrayList<Aeronave>();

    public Aeroporto(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
        this.totalDeAeronaves = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getTotalDeAeronaves() {
        return totalDeAeronaves;
    }

    public void setTotalDeAeronaves(int totalDeAeronaves) {
        this.totalDeAeronaves = totalDeAeronaves;
    }

    public List<Aeronave> getAeronaves() {
        return aeronaves;
    }

    public void setAeronaves(List<Aeronave> aeronaves) {
        this.aeronaves = aeronaves;
    }

    public void adicionaAeronave(Aeronave aeronave) {
        aeronaves.add(aeronave);
        totalDeAeronaves += 1;
    }

    public void passagensDisponiveis() {
        System.out.println("\nAeroporto: " + nome + ", Total de Aeronaves: " + totalDeAeronaves);
        for (Aeronave aeronave : aeronaves) {
            aeronave.verificaCapacidade();
        }
    }

}
