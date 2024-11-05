package Interface;

import Torneio.Torneio;
import Personagem.Personagem;

import javax.swing.*;
import java.awt.*;

public class AddParticipantMenu extends JFrame {
    private Torneio tournament; // Reference to the current tournament

    public AddParticipantMenu() {
        setTitle("Add Participant");
        setSize(400, 300);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(7, 2));
        getContentPane().add(panel);

        JLabel lblName = new JLabel("Participant Name:");
        JTextField txtName = new JTextField();

        JLabel lblAge = new JLabel("Age:");
        JTextField txtAge = new JTextField();

        JLabel lblStrength = new JLabel("Strength:");
        JTextField txtStrength = new JTextField();

        JLabel lblSpeed = new JLabel("Speed:");
        JTextField txtSpeed = new JTextField();

        JLabel lblLife = new JLabel("Life:");
        JTextField txtLife = new JTextField();

        JLabel lblLevel = new JLabel("Level:");
        JTextField txtLevel = new JTextField();

        JButton btnAdd = new JButton("Add Participant");

        btnAdd.addActionListener(e -> {
            String name = txtName.getText();
            int age = Integer.parseInt(txtAge.getText());
            int strength = Integer.parseInt(txtStrength.getText());
            int speed = Integer.parseInt(txtSpeed.getText());
            int life = Integer.parseInt(txtLife.getText());
            int level = Integer.parseInt(txtLevel.getText());

            Personagem character = new Personagem(name, age, strength, speed, life, level);

            try {
                tournament.addParticipant(character);
                JOptionPane.showMessageDialog(this, "Participant added successfully!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error adding participant: " + ex.getMessage());
            }

            dispose();
        });

        panel.add(lblName);
        panel.add(txtName);
        panel.add(lblAge);
        panel.add(txtAge);
        panel.add(lblStrength);
        panel.add(txtStrength);
        panel.add(lblSpeed);
        panel.add(txtSpeed);
        panel.add(lblLife);
        panel.add(txtLife);
        panel.add(lblLevel);
        panel.add(txtLevel);
        panel.add(new JLabel()); // Empty space
        panel.add(btnAdd);

        setVisible(true);
    }
}
