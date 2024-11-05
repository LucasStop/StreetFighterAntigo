import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class StreetFighterFake {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Torneio.Torneio de Equipe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new GridBagLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();

        // Adiciona o JLabel
        JLabel label = new JLabel("Torneio.Torneio de Equipe");
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(label, gbc);

        // Adiciona o JTextArea
        JTextArea textArea = new JTextArea(5, 20); // Definido com altura e largura
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(textArea, gbc);

        frame.add(panel);
        frame.setVisible(true);
    }
}
