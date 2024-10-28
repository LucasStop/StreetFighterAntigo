package Torneio;

import Personagem.Personagem;
import java.util.ArrayList;

public class TorneioEquipe extends Torneio {
    private ArrayList<Personagem> team1;
    private ArrayList<Personagem> team2;

    public TorneioEquipe(String name, String prize, int maxParticipants) {
        super(name, prize, maxParticipants);
        this.team1 = new ArrayList<Personagem>();
        this.team2 = new ArrayList<Personagem>();
    }

    @Override
    public void startTournament() {
        // Implementar lógica para iniciar o torneio de equipes
        System.out.println("Torneio de equipe " + this.getName() + " iniciado!");
    }

    public ArrayList<Personagem> startRound(ArrayList<Personagem> team1, ArrayList<Personagem> team2) {
        // Implementar lógica para iniciar uma rodada entre as duas equipes
        // Aqui poderia ser definido como será feita a comparação para determinar a equipe vencedora da rodada
        // Exemplo simplificado: Retornar a equipe 1 como vencedora
        System.out.println("Rodada entre as equipes iniciada!");
        return team1; // Exemplo: sempre retorna a equipe 1 como vencedora
    }

    public void declareWinner(ArrayList<Personagem> winner) {
        // Implementar lógica para declarar a equipe vencedora
        System.out.println("A equipe vencedora é a equipe " + winner);
    }
}
