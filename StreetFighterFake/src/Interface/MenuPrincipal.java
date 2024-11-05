package Interface;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Interface.AddParticipantMenu;

public class MenuPrincipal extends JFrame {
    public MenuPrincipal() {
        setTitle("Sistema de Torneios");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        getContentPane().add(panel);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JButton btnCriarTorneio = new JButton("Criar Novo Torneio");
        JButton btnAdicionarParticipante = new JButton("Adicionar Participante");
        JButton btnIniciarRodadas = new JButton("Iniciar Rodadas");

        btnCriarTorneio.addActionListener(e -> new TorneioMenu());
        btnAdicionarParticipante.addActionListener(e -> new AddParticipantMenu());
        btnIniciarRodadas.addActionListener(e -> new RodadasMenu());

        panel.add(btnCriarTorneio);
        panel.add(btnAdicionarParticipante);
        panel.add(btnIniciarRodadas);

        setVisible(true);
    }
}
