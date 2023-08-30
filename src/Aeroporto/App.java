package Aeroporto;

public class App {
    public static void main(String[] args) throws Exception {

        // Classe Pessoa
        Pessoa p1 = new Pessoa("Rafinha Capa Bravo", 15, "cpf: 0000000000");
        p1.informacoesPessoa();

        Pessoa p2 = new Pessoa("Rafinha Capa Ruim", 18, "cpf: 0000000000");
        p2.informacoesPessoa();

        // Classe Passageiro
        Passageiro passageiro1 = new Passageiro("Costinha de Frente", 22, "cpf: 0000000000",
                "Casa do caralho", "Econômica", "L22");
        passageiro1.informacoes();
        Passageiro passageiro2 = new Passageiro("Costinha de Costa", 27, "cpf: 0000000000",
                "Casa do amigo", "Econômica", "L17");
        passageiro2.informacoes();

        // Classe Piloto
        Piloto piloto1 = new Piloto("Zelena Voa Alto", 30, "cpf: 0000000000", 150,
                true, "Vôos comercias");
        piloto1.informacoes();
        Piloto piloto2 = new Piloto("Martinha Voa Torto", 25, "cpf: 0000000000", 300,
                true, "Vôos Militares");
        piloto2.informacoes();

        // Classe Aeronave
        Aeronave aeronave1 = new Aeronave("Avião vião", 150, 30, piloto1);
        aeronave1.adicionaPassageiro(passageiro2);
        Aeronave aeronave2 = new Aeronave("Avião 11", 15200, 2, piloto1);
        aeronave2.adicionaPassageiro(passageiro1);
        aeronave2.adicionaPassageiro(passageiro1);
        aeronave2.adicionaPassageiro(passageiro2);

        // Classe Aeroporto
        Aeroporto aeroporto1 = new Aeroporto("Aeroporto Longe", "Cidade mais Longe ainda");
        aeroporto1.adicionaAeronave(aeronave1);
        aeroporto1.adicionaAeronave(aeronave2);
        aeroporto1.passagensDisponiveis();

        Aeroporto aeroporto2 = new Aeroporto("Aeroporto Perto", "A Cidade que tu mora");
        aeroporto2.adicionaAeronave(aeronave2);
        aeroporto2.passagensDisponiveis();
    }
}
