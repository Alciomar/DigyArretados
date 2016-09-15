/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package birdpoint.telas;

import birdpoint.usuario.Usuario;
import birdpoint.usuario.UsuarioDAO;
import birdpoint.usuario.UsuarioTableModel;
import birdpoint.util.Util;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Adriano Lima
 */
public class CadastroUsuario extends javax.swing.JDialog {

    Usuario usuario = new Usuario();
    UsuarioDAO usuarioDAO = new UsuarioDAO();

    /**
     * Creates new form TelaCadastroUsuario
     */
    public CadastroUsuario(java.awt.Frame parent, boolean modal) {
        initComponents();
        getRootPane().setDefaultButton(btSalvar);
        btLimparActionPerformed(null);
        setModal(true);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlLogin = new javax.swing.JLabel();
        jlSenha = new javax.swing.JLabel();
        jlTipoAcesso = new javax.swing.JLabel();
        tfLogin = new javax.swing.JTextField();
        tfSenha = new javax.swing.JPasswordField();
        tfTipoDeUsuario = new javax.swing.JComboBox();
        jlNomeUsuario = new javax.swing.JLabel();
        tfNomeUsuario = new javax.swing.JTextField();
        btVoltar = new javax.swing.JButton();
        btPesquisar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(602, 421));
        setMinimumSize(new java.awt.Dimension(602, 421));
        setModal(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jlLogin.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jlLogin.setText("Login.:");
        getContentPane().add(jlLogin);
        jlLogin.setBounds(100, 190, 60, 19);

        jlSenha.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jlSenha.setText("Senha.:");
        getContentPane().add(jlSenha);
        jlSenha.setBounds(100, 230, 60, 19);

        jlTipoAcesso.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jlTipoAcesso.setText("Tipo de Acesso.:");
        getContentPane().add(jlTipoAcesso);
        jlTipoAcesso.setBounds(40, 270, 120, 20);

        tfLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 1, true));
        getContentPane().add(tfLogin);
        tfLogin.setBounds(170, 180, 340, 30);

        tfSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfSenha.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 1, true));
        getContentPane().add(tfSenha);
        tfSenha.setBounds(170, 220, 340, 30);

        tfTipoDeUsuario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tfTipoDeUsuario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-----", "Administrador", "Coordenador", "Copex", "RH" }));
        tfTipoDeUsuario.setAutoscrolls(true);
        tfTipoDeUsuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 1, true));
        getContentPane().add(tfTipoDeUsuario);
        tfTipoDeUsuario.setBounds(170, 260, 140, 30);

        jlNomeUsuario.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jlNomeUsuario.setText("Nome do Usuário.:");
        getContentPane().add(jlNomeUsuario);
        jlNomeUsuario.setBounds(20, 150, 150, 20);

        tfNomeUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfNomeUsuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 1, true));
        tfNomeUsuario.setMaximumSize(new java.awt.Dimension(8, 200));
        tfNomeUsuario.setMinimumSize(new java.awt.Dimension(8, 200));
        tfNomeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(tfNomeUsuario);
        tfNomeUsuario.setBounds(170, 143, 340, 30);

        btVoltar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/voltar.png"))); // NOI18N
        btVoltar.setText("Voltar");
        btVoltar.setContentAreaFilled(false);
        btVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btVoltar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btVoltar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btVoltar);
        btVoltar.setBounds(20, 340, 90, 70);

        btPesquisar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/pesquisar.png"))); // NOI18N
        btPesquisar.setText("Pesquisar");
        btPesquisar.setContentAreaFilled(false);
        btPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btPesquisar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btPesquisar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btPesquisar);
        btPesquisar.setBounds(280, 340, 100, 69);

        btExcluir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/excluir.png"))); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.setContentAreaFilled(false);
        btExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btExcluir);
        btExcluir.setBounds(390, 340, 80, 70);

        btLimpar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/limpar.png"))); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.setContentAreaFilled(false);
        btLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btLimpar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btLimpar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btLimpar);
        btLimpar.setBounds(180, 340, 80, 70);

        btSalvar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/salvar.png"))); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.setContentAreaFilled(false);
        btSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btSalvar);
        btSalvar.setBounds(480, 340, 80, 70);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/cadUsuario.png"))); // NOI18N
        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 602, 420);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        List<Usuario> lista;
        lista = (usuarioDAO.listar());
        UsuarioTableModel itm = new UsuarioTableModel(lista);
        Object objetoRetorno = PesquisaGenerica.exibeTela(itm, "Usuario");
        if (objetoRetorno != null) {
            usuario = usuarioDAO.consultarObjetoId("idUsuario", objetoRetorno);
            tfLogin.setText(usuario.getLoginUsuario());
            tfNomeUsuario.setText(usuario.getNomeUsuario());
            tfTipoDeUsuario.setSelectedItem(usuario.getTipoDeAcessoUsuario());
            btExcluir.setEnabled(true);
        }

    }//GEN-LAST:event_btPesquisarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
       if (usuario.getIdUsuario() != 0) {
                if (JOptionPane.showConfirmDialog(rootPane, "Deseja excluir o Usuário " + usuario.getLoginUsuario()
                        + "?", "BirdPoint", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE) == JOptionPane.YES_OPTION) {
                    if (usuarioDAO.remover(usuario)) {
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Não foi possível excluir o Usuário " + usuario.getLoginUsuario(),
                                "Erro ao Excluir", JOptionPane.ERROR_MESSAGE);
                    }
                }else{
                    JOptionPane.showMessageDialog(rootPane, "A exclusão foi cancelada!");
                }

            }
        btLimparActionPerformed(null);
        
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
       Util.limparCamposGenerico(this);
       btExcluir.setEnabled(false);
       usuario = new Usuario();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if(Util.chkVazio(tfLogin.getText(),tfNomeUsuario.getText(),tfSenha.getText(),String.valueOf(tfTipoDeUsuario.getSelectedItem()))){
            usuario.setLoginUsuario(tfLogin.getText());
            usuario.setNomeUsuario(tfNomeUsuario.getText());
            usuario.setSenhaUsuario(tfSenha.getText());
            usuario.setTipoDeAcessoUsuario(String.valueOf(tfTipoDeUsuario.getSelectedItem()));
            usuarioDAO.salvar(usuario);
            btLimparActionPerformed(null);
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void tfNomeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeUsuarioActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
       dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadastroUsuario dialog = new CadastroUsuario(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jlLogin;
    private javax.swing.JLabel jlNomeUsuario;
    private javax.swing.JLabel jlSenha;
    private javax.swing.JLabel jlTipoAcesso;
    private javax.swing.JTextField tfLogin;
    private javax.swing.JTextField tfNomeUsuario;
    private javax.swing.JPasswordField tfSenha;
    private javax.swing.JComboBox tfTipoDeUsuario;
    // End of variables declaration//GEN-END:variables
}
