package StreetFighterFake.src.Torneio;

import Personagem.Personagem;

public class TorneioIndividual extends Torneio {
    private int rounds;

    public TorneioIndividual(String name, String prize, int maxParticipants, int rounds) {
        super(name, prize, maxParticipants);
        this.rounds = rounds;
    }

    @Override
    public void startTournament() {
        System.out.println("Torneio individual " + this.getName() + " iniciado com " + this.rounds + " rodadas!");
        for (int i = 1; i <= rounds; i++) {
            if (participants.size() < 2) break;
            System.out.println("Rodada " + i);
            startRound(participants.get(i - 1), participants.get((i % participants.size())));
        }
    }

    public Personagem startRound(Personagem personagem1, Personagem personagem2) {
        Personagem winner = (personagem1.getStrength() > personagem2.getStrength()) ? personagem1 : personagem2;
        System.out.println("Vencedor da rodada: " + winner.getName());
        return winner;
    }

    @Override
    public void declareWinner() {
        if (!participants.isEmpty()) {
            Personagem winner = participants.get(0);
            System.out.println("O vencedor do torneio individual é " + winner.getName() + "!");
        } else {
            System.out.println("Nenhum participante para declarar vencedor.");
        }
    }
}
