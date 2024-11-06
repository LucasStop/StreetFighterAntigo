package StreetFighterFake.src.Interface;

import StreetFighterFake.src.Torneio.Torneio;
import StreetFighterFake.src.Torneio.TorneioEquipe;
import StreetFighterFake.src.Torneio.TorneioIndividual;

import javax.swing.*;
import java.awt.*;

public class TorneioMenu extends JFrame {
    public TorneioMenu() {
        setTitle("Criar Torneio");
        setSize(400, 300);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(6, 2));
        getContentPane().add(panel);

        JLabel lblType = new JLabel("Tipo de Torneio:");
        String[] types = {"Individual", "Equipe"};
        JComboBox<String> typeComboBox = new JComboBox<>(types);

        JLabel lblNome = new JLabel("Nome do Torneio:");
        JTextField txtNome = new JTextField();

        JLabel lblPrize = new JLabel("Prêmio:");
        JTextField txtPrize = new JTextField();

        JLabel lblMaxParticipants = new JLabel("Máximo de Participantes:");
        JTextField txtMaxParticipants = new JTextField();

        JLabel lblRounds = new JLabel("Rodadas (para Individual):");
        JTextField txtRounds = new JTextField();

        JButton btnCreate = new JButton("Criar Torneio");

        btnCreate.addActionListener(e -> {
            String nome = txtNome.getText();
            String prize = txtPrize.getText();
            int maxParticipants = Integer.parseInt(txtMaxParticipants.getText());
            Torneio torneio;

            if (typeComboBox.getSelectedItem().equals("Individual")) {
                int rounds = Integer.parseInt(txtRounds.getText());
                torneio = new TorneioIndividual(nome, prize, maxParticipants, rounds);
            } else {
                torneio = new TorneioEquipe(nome, prize, maxParticipants);
            }

            JOptionPane.showMessageDialog(this, "Torneio criado: " + torneio.getName());
            dispose();
        });

        panel.add(lblType);
        panel.add(typeComboBox);
        panel.add(lblNome);
        panel.add(txtNome);
        panel.add(lblPrize);
        panel.add(txtPrize);
        panel.add(lblMaxParticipants);
        panel.add(txtMaxParticipants);
        panel.add(lblRounds);
        panel.add(txtRounds);
        panel.add(new JLabel());
        panel.add(btnCreate);

        setVisible(true);
    }
}
