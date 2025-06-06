package View;

import Model.DadosInvalidosException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        // Usando SwingUtilities para garantir que a interface será criada na thread correta
        javax.swing.SwingUtilities.invokeLater(() -> {
            try {
                // Inicializa a tela de login
                Login login = new Login();
                login.setVisible(true);
            } catch (ParseException | DadosInvalidosException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }
}