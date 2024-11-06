package StreetFighterFake.src.Torneio;

import Personagem.Personagem;
import java.util.ArrayList;

public class TorneioEquipe extends Torneio {
    private ArrayList<Personagem> team1;
    private ArrayList<Personagem> team2;

    public TorneioEquipe(String name, String prize, int maxParticipants) {
        super(name, prize, maxParticipants);
        this.team1 = new ArrayList<>();
        this.team2 = new ArrayList<>();
    }

    public void addToTeam1(Personagem personagem) { team1.add(personagem); }
    public void addToTeam2(Personagem personagem) { team2.add(personagem); }

    @Override
    public void startTournament() {
        System.out.println("Torneio de equipe " + this.getName() + " iniciado!");
        ArrayList<Personagem> winningTeam = startRound(team1, team2);
        declareWinner(winningTeam);
    }

    public ArrayList<Personagem> startRound(ArrayList<Personagem> team1, ArrayList<Personagem> team2) {
        int team1Score = team1.stream().mapToInt(Personagem::getStrength).sum();
        int team2Score = team2.stream().mapToInt(Personagem::getStrength).sum();
        ArrayList<Personagem> winner = (team1Score > team2Score) ? team1 : team2;
        System.out.println("Equipe vencedora da rodada é: " + (winner == team1 ? "Equipe 1" : "Equipe 2"));
        return winner;
    }

    @Override
    public void declareWinner() {
        ArrayList<Personagem> winningTeam = startRound(team1, team2);
        declareWinner(winningTeam);
    }

    public void declareWinner(ArrayList<Personagem> winner) {
        System.out.println("A equipe vencedora do torneio é: " + (winner == team1 ? "Equipe 1" : "Equipe 2"));
    }
}
