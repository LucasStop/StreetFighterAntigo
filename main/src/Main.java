import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Torneio de Personagens");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new GridBagLayout());

        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        c.gridx = 0;
        c.gridy = 0;
        frame.add(panel, c);

        JLabel label = new JLabel("Torneio de Personagens");
        c.gridx = 0;
        c.gridy = 0;
        panel.add(label, c);

        JTextArea textArea = new JTextArea();
        c.gridx = 0;
        c.gridy = 1;
        c.weightx = 1;
        c.weighty = 1;
        c.fill = GridBagConstraints.BOTH;
        panel.add(textArea, c);

        frame.setVisible(true);
    }
}
