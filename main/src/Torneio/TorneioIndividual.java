package Torneio;

import Personagem.Personagem;

public class TorneioIndividual extends Torneio {
    private int rounds;

    public TorneioIndividual(String name, String prize, int maxParticipants, int rounds) {
        super(name, prize, maxParticipants);
        this.rounds = rounds;
    }

    @Override
    public void startTournament() {
        // Implementar lógica para iniciar o torneio individual
        System.out.println("Torneio individual " + this.getName() + " iniciado com " + this.rounds + " rodadas!");
    }

    public Personagem startRound(Personagem personagem1, Personagem personagem2) {
        // Implementar lógica para iniciar uma rodada entre dois participantes
        // Exemplo de lógica: escolher um vencedor aleatório (ou baseado em algum critério)
        System.out.println("Rodada entre " + personagem1.getName() + " e " + personagem2.getNome() + " iniciada!");
        // Exemplo: o personagem1 vence sempre
        return personagem1;
    }

    public void declareWinner(Personagem winner) {
        // Implementar lógica para declarar o vencedor individual
        System.out.println("O vencedor do torneio individual é " + winner.getNome() + "!");
    }
}
