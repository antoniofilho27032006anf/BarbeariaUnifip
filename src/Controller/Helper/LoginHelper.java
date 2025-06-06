package Controller.Helper;

import Model.Usuario;
import View.Login;

public class LoginHelper {
    
    private final Login view; 

    public LoginHelper(Login view) {
        this.view = view;
    }
    
    // Obtém os dados digitados pelo usuário nos campos de login
    public Usuario obterModelo() {
        String nome = view.getTextCampoUsuario().getText().trim();  // tira espaços em branco extras
        String senha = new String(view.getTextCampoSenha().getPassword()).trim();
        // Retorna um usuário com só nome e senha, para validação
        return new Usuario(nome, senha);
    }

    // Preenche os campos da tela com os dados do usuário passado
    public void setarModelo(Usuario modelo) {
        view.getTextCampoUsuario().setText(modelo.getNome()); 
        view.getTextCampoSenha().setText(modelo.getSenha());
    }

    // Limpa os campos de texto da tela de login.
    public void limparTela() {
        view.getTextCampoUsuario().setText("");
        view.getTextCampoSenha().setText("");
    }
}