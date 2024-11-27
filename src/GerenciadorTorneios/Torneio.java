package GerenciadorTorneios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Torneio implements Competicao {
    protected String nome;
    protected TipoTorneio tipo; // variavel para definir se o Torneio é: ELIMINATORIO,GRUPO ou MISTO.
    protected List<String> participantes;
    protected List<String> resultados;

    public Torneio(String nome, TipoTorneio tipo) {
        this.nome = nome;
        this.tipo = tipo;
        this.participantes = new ArrayList<>();
        this.resultados = new ArrayList<>();
    }

    public void adicionarParticipante(String participante) {
        participantes.add(participante);
    }

    public List<String> getParticipantes() {
        return Collections.unmodifiableList(participantes);
    }

    protected void registrarResultado(String resultado) {
        resultados.add(resultado);
    }

    public List<String> getResultados() {
        return Collections.unmodifiableList(resultados); //Uma lista não modificável é uma visualização de lista que não oferece suporte a nenhuma operação de modificação
    }

    public abstract void iniciarFase();

    public abstract void simularPartida();

    public abstract void definirVencedor();
}
