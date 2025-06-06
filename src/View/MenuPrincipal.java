/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.MenuPrincipalController;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Usuário
 */
public class MenuPrincipal extends javax.swing.JFrame {
    
    private final MenuPrincipalController controller;

    public MenuPrincipal() {
        initComponents(); // método que o NetBeans cria
        controller = new MenuPrincipalController(this); // importante!
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuIconCadastro = new javax.swing.JMenu();
        jMenuIconCliente = new javax.swing.JMenuItem();
        jMenuIconServiço = new javax.swing.JMenuItem();
        jMenuIconUsuario = new javax.swing.JMenuItem();
        jMenuOperação = new javax.swing.JMenu();
        jMenuAgenda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/menuprincipal.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jMenuIconCadastro.setText("Cadastro");

        jMenuIconCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icons/Cliente.jpeg"))); // NOI18N
        jMenuIconCliente.setText("Cliente");
        jMenuIconCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuIconClienteActionPerformed(evt);
            }
        });
        jMenuIconCadastro.add(jMenuIconCliente);

        jMenuIconServiço.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icons/Tesoura.jpeg"))); // NOI18N
        jMenuIconServiço.setText("Serviço");
        jMenuIconCadastro.add(jMenuIconServiço);

        jMenuIconUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icons/Usuario.jpeg"))); // NOI18N
        jMenuIconUsuario.setText("Usuário");
        jMenuIconCadastro.add(jMenuIconUsuario);

        jMenuBar1.add(jMenuIconCadastro);

        jMenuOperação.setText("Operação");

        jMenuAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icons/Agenda.jpeg"))); // NOI18N
        jMenuAgenda.setText("Agenda");
        jMenuAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAgendaActionPerformed(evt);
            }
        });
        jMenuOperação.add(jMenuAgenda);

        jMenuBar1.add(jMenuOperação);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuIconClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuIconClienteActionPerformed
        
    }//GEN-LAST:event_jMenuIconClienteActionPerformed

    private void jMenuAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAgendaActionPerformed
        controller.navegarParaAgenda();

    }//GEN-LAST:event_jMenuAgendaActionPerformed
    // Método que é executado quando o item de menu "Agenda" é clicado


public static void main(String args[]) {
    try {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }

    java.awt.EventQueue.invokeLater(() -> {
        new MenuPrincipal().setVisible(true);
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuAgenda;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuIconCadastro;
    private javax.swing.JMenuItem jMenuIconCliente;
    private javax.swing.JMenuItem jMenuIconServiço;
    private javax.swing.JMenuItem jMenuIconUsuario;
    private javax.swing.JMenu jMenuOperação;
    // End of variables declaration//GEN-END:variables
}

