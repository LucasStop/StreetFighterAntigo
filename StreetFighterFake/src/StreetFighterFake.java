import Interface.MenuPrincipal;

public class StreetFighterFake {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
        });
    }
}
