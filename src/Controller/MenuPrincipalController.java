package Controller;

import View.Agenda;
import View.MenuPrincipal;
import javax.swing.JOptionPane;

public class MenuPrincipalController {
    
    private final MenuPrincipal view;

    public MenuPrincipalController(MenuPrincipal view) {
        this.view = view;
    }
    
    
    public void navegarParaAgenda() {
        try {
        Agenda agenda = new Agenda();
        agenda.setVisible(true);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(view, "Erro ao abrir Agenda: " + e.getMessage());
    } 
    }
}