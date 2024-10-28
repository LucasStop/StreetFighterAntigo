package Torneio;

import Personagem.Personagem;
import java.util.ArrayList;

public class Torneio {
    private String name;
    private ArrayList<Personagem> participants;
    private String prize;
    private int maxParticipants;

    public Torneio(String name, String prize, int maxParticipants) {
        this.name = name;
        this.prize = prize;
        this.maxParticipants = maxParticipants;
        this.participants = new ArrayList<Personagem>();
    }

    public String getName() {
        return this.name;
    }

    public String getPrize() {
        return this.prize;
    }

    public ArrayList<Personagem> getParticipants() {
        return this.participants;
    }

    public void addParticipant(Personagem personagem) {
        if (this.participants.size() < this.maxParticipants) {
            this.participants.add(personagem);
        }
    }

    public void startTournament() {
        // Implementar lógica para iniciar o torneio
        System.out.println("Torneio " + this.name + " iniciado!");
    }

    public void declareWinner() {
        // Implementar lógica para declarar o vencedor
        if (!this.participants.isEmpty()) {
            Personagem winner = this.participants.get(0); // Exemplo: pegar o primeiro participante como vencedor
            System.out.println("O vencedor do torneio " + this.name + " é: " + winner.getName());
        } else {
            System.out.println("Nenhum participante para declarar vencedor.");
        }
    }
}
