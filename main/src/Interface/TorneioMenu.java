package Interface;

import Torneio.Torneio;
import Torneio.TorneioEquipe;
import Torneio.TorneioIndividual;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TorneioMenu extends JFrame {
    public TorneioMenu() {
        setTitle("Criar Torneio");
        setSize(400, 300);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(6, 2));
        getContentPane().add(panel);

        JLabel lblTipo = new JLabel("Tipo de Torneio:");
        String[] tipos = {"Individual", "Equipe"};
        JComboBox<String> tipoComboBox = new JComboBox<>(tipos);

        JLabel lblNome = new JLabel("Nome do Torneio:");
        JTextField txtNome = new JTextField();

        JLabel lblPremio = new JLabel("Prêmio:");
        JTextField txtPremio = new JTextField();

        JLabel lblMaxParticipantes = new JLabel("Máximo de Participantes:");
        JTextField txtMaxParticipantes = new JTextField();

        JLabel lblRodadas = new JLabel("Rodadas (para Individual):");
        JTextField txtRodadas = new JTextField();

        JButton btnCriar = new JButton("Criar Torneio");

        btnCriar.addActionListener(e -> {
            String nome = txtNome.getText();
            String premio = txtPremio.getText();
            int maxParticipantes = Integer.parseInt(txtMaxParticipantes.getText());
            Torneio torneio;

            if (tipoComboBox.getSelectedItem().equals("Individual")) {
                int rodadas = Integer.parseInt(txtRodadas.getText());
                torneio = new TorneioIndividual(nome, premio, maxParticipantes, rodadas);
            } else {
                torneio = new TorneioEquipe(nome, premio, maxParticipantes);
            }

            JOptionPane.showMessageDialog(this, "Torneio criado: " + torneio.getName());
            dispose();
        });

        panel.add(lblTipo);
        panel.add(tipoComboBox);
        panel.add(lblNome);
        panel.add(txtNome);
        panel.add(lblPremio);
        panel.add(txtPremio);
        panel.add(lblMaxParticipantes);
        panel.add(txtMaxParticipantes);
        panel.add(lblRodadas);
        panel.add(txtRodadas);
        panel.add(new JLabel()); // Espacemento
        panel.add(btnCriar);

        setVisible(true);
    }
}
