package Torneio;

import Personagem.Personagem;
import java.util.ArrayList;

public abstract class Torneio implements TorneioInterface {
    protected String name;
    protected ArrayList<Personagem> participants;
    protected String prize;
    protected int maxParticipants;

    public Torneio(String name, String prize, int maxParticipants) {
        this.name = name;
        this.prize = prize;
        this.maxParticipants = maxParticipants;
        this.participants = new ArrayList<>();
    }

    public String getName() { return this.name; }
    public String getPrize() { return this.prize; }
    public ArrayList<Personagem> getParticipants() { return this.participants; }

    public void addParticipant(Personagem personagem) throws Exception {
        if (this.participants.size() < this.maxParticipants) {
            this.participants.add(personagem);
        } else {
            throw new Exception("Número máximo de participantes atingido.");
        }
    }

    @Override
    public abstract void startTournament();
    @Override
    public abstract void declareWinner();
}
