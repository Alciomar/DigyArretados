/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package birdpoint.telas;

import birdpoint.usuario.Usuario;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.MenuElement;
import javax.swing.plaf.basic.BasicMenuBarUI;

/**
 *
 * @author AlexRamon
 */
public class MenuPrincipal extends javax.swing.JDialog {

    Usuario usuario = new Usuario();
    
    public MenuPrincipal(java.awt.Frame parent, boolean modal, Usuario usuario) {
        super(parent, modal);
        setModal(true);
        initComponents();
        this.usuario=usuario;
        jlUsuario.setText(usuario.getLoginUsuario());
        jlPermissao.setText(usuario.getTipoDeAcessoUsuario());
        permissao();
    }
    
    public void permissao(){
        if(!usuario.getTipoDeAcessoUsuario().equalsIgnoreCase("administrador")){
            subUsuario.setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btLogout = new javax.swing.JButton();
        jlPermissao = new javax.swing.JLabel();
        jlNome2 = new javax.swing.JLabel();
        jlNome3 = new javax.swing.JLabel();
        jlUsuario = new javax.swing.JLabel();
        jlHome = new javax.swing.JLabel();
        jMenu = new javax.swing.JMenuBar();
        jmCadastrar = new javax.swing.JMenu();
        subUsuario1 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        subGrade = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        subUsuario = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(902, 563));
        setModal(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        btLogout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/logout.png"))); // NOI18N
        btLogout.setText("Sair");
        btLogout.setToolTipText("Sair");
        btLogout.setContentAreaFilled(false);
        btLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btLogout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btLogout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btLogout);
        btLogout.setBounds(800, 360, 80, 69);

        jlPermissao.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jlPermissao.setText("???");
        getContentPane().add(jlPermissao);
        jlPermissao.setBounds(720, 30, 160, 30);

        jlNome2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jlNome2.setText("Permissão.:");
        getContentPane().add(jlNome2);
        jlNome2.setBounds(630, 30, 90, 30);

        jlNome3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jlNome3.setText("Usuário.:");
        getContentPane().add(jlNome3);
        jlNome3.setBounds(650, 10, 70, 30);

        jlUsuario.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jlUsuario.setText("???");
        getContentPane().add(jlUsuario);
        jlUsuario.setBounds(720, 10, 160, 30);

        jlHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/home.png"))); // NOI18N
        getContentPane().add(jlHome);
        jlHome.setBounds(0, 0, 900, 450);

        jMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenu.setForeground(new java.awt.Color(51, 204, 0));
        jMenu.setBorderPainted(false);
        jMenu.setMaximumSize(new java.awt.Dimension(900, 200));
        jMenu.setMinimumSize(new java.awt.Dimension(900, 200));

        jmCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/adicionar80.png"))); // NOI18N
        jmCadastrar.setText("Cadastro");
        jmCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmCadastrar.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jmCadastrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jmCadastrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        subUsuario1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/adicionar10.png"))); // NOI18N
        subUsuario1.setText("Biometria");
        subUsuario1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        subUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subUsuario1ActionPerformed(evt);
            }
        });
        jmCadastrar.add(subUsuario1);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/adicionar10.png"))); // NOI18N
        jMenuItem5.setText("Curso");
        jMenuItem5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jmCadastrar.add(jMenuItem5);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/adicionar10.png"))); // NOI18N
        jMenuItem1.setText("Cidade");
        jMenuItem1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jmCadastrar.add(jMenuItem1);

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/adicionar10.png"))); // NOI18N
        jMenuItem7.setText("Disciplina");
        jMenuItem7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jmCadastrar.add(jMenuItem7);

        subGrade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/adicionar10.png"))); // NOI18N
        subGrade.setText("Grade Curricular");
        subGrade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        subGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subGradeActionPerformed(evt);
            }
        });
        jmCadastrar.add(subGrade);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/adicionar10.png"))); // NOI18N
        jMenuItem3.setText("Professor");
        jMenuItem3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jmCadastrar.add(jMenuItem3);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/adicionar10.png"))); // NOI18N
        jMenuItem6.setText("Semestre");
        jMenuItem6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jmCadastrar.add(jMenuItem6);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/adicionar10.png"))); // NOI18N
        jMenuItem2.setText("Titulação");
        jMenuItem2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jmCadastrar.add(jMenuItem2);

        subUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/adicionar10.png"))); // NOI18N
        subUsuario.setText("Usuário");
        subUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        subUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subUsuarioActionPerformed(evt);
            }
        });
        jmCadastrar.add(subUsuario);

        jMenu.add(jmCadastrar);

        setJMenuBar(jMenu);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       CadastroCidade cadastroCidade = new CadastroCidade(null, rootPaneCheckingEnabled);
       cadastroCidade.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLogoutActionPerformed
        TelaAutenticacao telaAutenticar = new TelaAutenticacao(null, rootPaneCheckingEnabled);
        telaAutenticar.setVisible(true);
        dispose();
    }//GEN-LAST:event_btLogoutActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        CadastroTitulacao cadastroTitulacao = new CadastroTitulacao(null, rootPaneCheckingEnabled);
        cadastroTitulacao.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void subUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subUsuarioActionPerformed
        CadastroUsuario cadUsuario = new CadastroUsuario(null, rootPaneCheckingEnabled);
        cadUsuario.setVisible(true);
    }//GEN-LAST:event_subUsuarioActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        CadastroProfessor cadastroProfessor = new CadastroProfessor(null, rootPaneCheckingEnabled);
        cadastroProfessor.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        CadastroCurso cadastroCurso = new CadastroCurso(null, rootPaneCheckingEnabled);
        cadastroCurso.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
       CadastroSemestre cadastroSemestre = new CadastroSemestre(null, rootPaneCheckingEnabled);
       cadastroSemestre.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
      CadastroDisciplina cadastroDisciplina = new CadastroDisciplina(null, rootPaneCheckingEnabled);
      cadastroDisciplina.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void subUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subUsuario1ActionPerformed
        CadastroDigital cadastroDigital = new CadastroDigital(null, rootPaneCheckingEnabled);
        cadastroDigital.setVisible(true);
    }//GEN-LAST:event_subUsuario1ActionPerformed

    private void subGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subGradeActionPerformed
        CadastroGradeCurricular cadastroGradeCurricular = new CadastroGradeCurricular(null, rootPaneCheckingEnabled);
        cadastroGradeCurricular.setVisible(true);
    }//GEN-LAST:event_subGradeActionPerformed

    /**
     * @param args the command line arguments
     */
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MenuPrincipal dialog = new MenuPrincipal(new javax.swing.JFrame(), true, null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLogout;
    private javax.swing.JMenuBar jMenu;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JLabel jlHome;
    private javax.swing.JLabel jlNome2;
    private javax.swing.JLabel jlNome3;
    private javax.swing.JLabel jlPermissao;
    private javax.swing.JLabel jlUsuario;
    private javax.swing.JMenu jmCadastrar;
    private javax.swing.JMenuItem subGrade;
    private javax.swing.JMenuItem subUsuario;
    private javax.swing.JMenuItem subUsuario1;
    // End of variables declaration//GEN-END:variables
}
