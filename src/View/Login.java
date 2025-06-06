/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.LoginController;
import Model.DAO.Banco;
import Model.DadosInvalidosException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


/**
 *
 * @author Usuário
 */
public class Login extends javax.swing.JFrame {

    private final LoginController controller;

    /**
     * Creates new form Login
     * @throws java.text.ParseException
     * @throws Model.DadosInvalidosException
     */
    public Login() throws ParseException, DadosInvalidosException {
    Banco.inicia();         // primeiro inicializa o banco
    initComponents();        // depois inicializa os componentes da interface
    controller = new LoginController(this); // então cria o controller com a view já pronta
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TextCampoUsuario = new javax.swing.JTextField();
        TextCampoSenha = new javax.swing.JPasswordField();
        jLabelSenha = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jButtonEntrar = new javax.swing.JButton();
        jLabelLogin = new javax.swing.JLabel();
        jLabelFundo = new javax.swing.JLabel();
        jLabelFundoPrincipal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TextCampoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextCampoUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(TextCampoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 530, 400, 50));
        getContentPane().add(TextCampoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 660, 400, 50));

        jLabelSenha.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabelSenha.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSenha.setText("Senha");
        getContentPane().add(jLabelSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 620, -1, 40));

        jLabelUsuario.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUsuario.setText("Usuario");
        getContentPane().add(jLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 490, -1, 40));

        jButtonEntrar.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jButtonEntrar.setText("Entrar");
        jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 760, 400, 50));

        jLabelLogin.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabelLogin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLogin.setText("Login");
        getContentPane().add(jLabelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, -1, -1));

        jLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/login.jpg"))); // NOI18N
        getContentPane().add(jLabelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 490, 600, 240));

        jLabelFundoPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/login.jpg"))); // NOI18N
        getContentPane().add(jLabelFundoPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextCampoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextCampoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextCampoUsuarioActionPerformed

    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed
       try {
        this.controller.entrarNoSistema();
    } catch (Exception ex) {
        exibeMensagem("Erro inesperado: " + ex.getMessage());
}
    }//GEN-LAST:event_jButtonEntrarActionPerformed
     
   public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                try {
                    new Login().setVisible(true);
                } catch (ParseException | DadosInvalidosException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField TextCampoSenha;
    private javax.swing.JTextField TextCampoUsuario;
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JLabel jLabelFundo;
    private javax.swing.JLabel jLabelFundoPrincipal;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelUsuario;
    // End of variables declaration//GEN-END:variables

    //manda uma mensagem para o usuario na tela
    public void exibeMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }

    public JPasswordField getTextCampoSenha() {
        return TextCampoSenha;
    }

    public void setTextCampoSenha(JPasswordField TextCampoSenha) { 
        this.TextCampoSenha = TextCampoSenha;
    }

    public JTextField getTextCampoUsuario() {
        return TextCampoUsuario;
    }

    public void setTextCampoUsuario(JTextField TextCampoUsuario) {
        this.TextCampoUsuario = TextCampoUsuario;
    }

    
}
