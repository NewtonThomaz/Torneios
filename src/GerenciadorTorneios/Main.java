package GerenciadorTorneios;

public class Main {
    public static void main(String[] args) {
        TorneioIndividual torneioIndividual = new TorneioIndividual("Torneio de Tênis");
        torneioIndividual.adicionarParticipante("Jogador 1");
        torneioIndividual.adicionarParticipante("Jogador 2");

        torneioIndividual.iniciarFase();
        torneioIndividual.simularPartida();
        torneioIndividual.definirVencedor();

        TorneioEquipe torneioEquipe = new TorneioEquipe("Torneio de Futebol");
        torneioEquipe.adicionarParticipante("Equipe A");
        torneioEquipe.adicionarParticipante("Equipe B");

        torneioEquipe.iniciarFase();
        torneioEquipe.simularPartida();
        torneioEquipe.definirVencedor();
    }
}