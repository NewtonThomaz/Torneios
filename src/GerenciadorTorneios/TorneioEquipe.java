package GerenciadorTorneios;

public class TorneioEquipe extends Torneio {
    public TorneioEquipe(String nome) {
        super(nome, TipoTorneio.GRUPOS);
    }

    @Override
    public void iniciarFase() {
        System.out.println("Iniciando torneio por equipes...");
    }

    @Override
    public void simularPartida() {
        if (participantes.size() < 2) {
            System.out.println("Equipes insuficientes para simular partida.");
            return;
        }
        String equipeVencedora = participantes.get((int) (Math.random() * participantes.size()));
        registrarResultado("Equipe vencedora da partida: " + equipeVencedora);
    }

    @Override
    public void definirVencedor() {
        if (!resultados.isEmpty()) {
            System.out.println("Equipe vencedora final: " + resultados.get(resultados.size() - 1));
        } else {
            System.out.println("Nenhum resultado disponível para determinar vencedor.");
        }
    }
}
