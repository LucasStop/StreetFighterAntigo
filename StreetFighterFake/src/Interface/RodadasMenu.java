package StreetFighterFake.src.Interface;

import StreetFighterFake.src.Torneio.TorneioIndividual;
import Personagem.Personagem;

import javax.swing.*;
import java.awt.*;

public class RodadasMenu extends JFrame {
    private TorneioIndividual torneio;

    public RodadasMenu() {
        setTitle("Iniciar Rodadas");
        setSize(300, 200);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new BorderLayout());
        getContentPane().add(panel);

        JTextArea txtArea = new JTextArea();
        txtArea.setEditable(false);
        panel.add(new JScrollPane(txtArea), BorderLayout.CENTER);

        JButton btnStart = new JButton("Iniciar Rodadas");

        btnStart.addActionListener(e -> {
            txtArea.setText("Iniciando rodadas para o torneio " + torneio.getName() + "\n");
            for (int i = 0; i < torneio.getParticipants().size() - 1; i++) {
                Personagem p1 = torneio.getParticipants().get(i);
                Personagem p2 = torneio.getParticipants().get(i + 1);
                Personagem vencedor = torneio.startRound(p1, p2);
                txtArea.append("Rodada " + (i + 1) + ": " + p1.getName() + " vs " + p2.getName() + "\n");
                txtArea.append("Vencedor: " + vencedor.getName() + "\n");
            }

            txtArea.append("Vencedor do torneio: " + torneio.getParticipants().get(0).getName());
        });

        panel.add(btnStart, BorderLayout.SOUTH);

        setVisible(true);
    }
}
