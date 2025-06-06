package Controller;

import Controller.Helper.LoginHelper;
import Model.DAO.Banco;
import Model.Usuario;
import View.Login;
import View.MenuPrincipal;

import javax.swing.JOptionPane;

public class LoginController {

    private final Login view;
    private final LoginHelper helper;

    // Construtor que recebe a view e instancia o helper
    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }

    // Valida o login do usuário
    public void entrarNoSistema() {
    Usuario usuarioDigitado = helper.obterModelo();

    System.out.println("Digitado: nome='" + usuarioDigitado.getNome() + "', senha='" + usuarioDigitado.getSenha() + "'");

    for (Usuario u : Banco.usuario) {
        System.out.println("Banco: nome='" + u.getNome() + "', senha='" + u.getSenha() + "'");
        if (u.getNome().trim().equalsIgnoreCase(usuarioDigitado.getNome().trim()) &&
            u.getSenha().trim().equals(usuarioDigitado.getSenha().trim())) {
            
            System.out.println("Usuário encontrado, login OK!");
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
            view.dispose();
            return;
        }
    }
    System.out.println("Nenhum usuário correspondente encontrado.");
    JOptionPane.showMessageDialog(view, "Usuário ou senha incorretos!", "Erro de login", JOptionPane.ERROR_MESSAGE);
    helper.limparTela();
}
}