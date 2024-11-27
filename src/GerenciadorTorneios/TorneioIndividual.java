package GerenciadorTorneios;

public class TorneioIndividual extends Torneio {
	public TorneioIndividual(String nome) {
		super(nome, TipoTorneio.ELIMINATORIO);
	}

	@Override
	public void iniciarFase() {
		System.out.println("Iniciando torneio individual...");
	}

	@Override
	public void simularPartida() {
		if (participantes.size() < 2) {
			System.out.println("Participantes insuficientes para simular partida.");
			return;
		}
		String vencedor = participantes.get((int) (Math.random() * participantes.size()));
		registrarResultado("Vencedor da partida: " + vencedor);
	}

	@Override
	public void definirVencedor() {
		if (!resultados.isEmpty()) {//vai verificar se não for vazio.
			System.out.println("Vencedor final: " + resultados.get(resultados.size() - 1));
		} else {
			System.out.println("Nenhum resultado disponível para determinar vencedor.");
		}
	}
}
