package Aeroporto;

import java.util.ArrayList;
import java.util.List;

public class Aeronave {
    private String nome;
    private float velocidade;
    private int capacidade;
    private Piloto piloto;
    private List<Passageiro> passageiros = new ArrayList<Passageiro>();

    public Aeronave(String nome, float velocidade, int capacidade, Piloto piloto) {
        this.nome = nome;
        this.velocidade = velocidade;
        this.capacidade = capacidade;
        this.piloto = piloto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public void adicionaPassageiro(Passageiro p) {
        if (capacidade > passageiros.size()) {
            passageiros.add(p);
            System.out.println("\nAdicionado: " + p.getNome() + ", no Avião: " + nome);
        } else {
            System.out.println("Não há vagas, não foi adicionado o (a): " + p.getNome());
        }

    }

    public void verificaCapacidade() {
        System.out.println("\nAeronave: " + nome);
        if (capacidade > passageiros.size()) {
            System.out.println("Ainda sobram: " + (capacidade - passageiros.size()) + " vagas");
        } else {
            System.out.println("Não há vagas");
        }

    }

}
