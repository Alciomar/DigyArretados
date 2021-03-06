/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package birdpoint.telas;

import birdpoint.curso.Curso;
import birdpoint.curso.CursoDAO;
import birdpoint.curso.CursoTableModel;
import birdpoint.semestre.Semestre;
import birdpoint.semestre.SemestreDAO;
import birdpoint.usuario.Usuario;
import birdpoint.usuario.UsuarioDAO;
import birdpoint.usuario.UsuarioTableModel;
import birdpoint.util.Util;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author AlexRamon
 */
public class CadastroCurso extends javax.swing.JDialog {

    Usuario usuario = new Usuario();
    UsuarioDAO usuarioDAO = new UsuarioDAO();
    
    Curso curso = new Curso();
    CursoDAO cursoDAO = new CursoDAO();

    Semestre semestre = new Semestre();
    SemestreDAO semestreDAO = new SemestreDAO();

    public CadastroCurso(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        getRootPane().setDefaultButton(btSalvar);
        btLimparActionPerformed(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfNomeCurso = new javax.swing.JTextField();
        jlNome = new javax.swing.JLabel();
        btVoltar = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btPesquisar = new javax.swing.JButton();
        jLObrigatorioCurso = new javax.swing.JLabel();
        jlNome2 = new javax.swing.JLabel();
        tfNomeCoordenador = new javax.swing.JTextField();
        btPesqusar1 = new javax.swing.JButton();
        jLObrigatorioCurso1 = new javax.swing.JLabel();
        jlCadTitulacao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 421));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        tfNomeCurso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfNomeCurso.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 121, 0), 1, true));
        getContentPane().add(tfNomeCurso);
        tfNomeCurso.setBounds(160, 140, 380, 30);

        jlNome.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jlNome.setText("Nome do Curso.:");
        getContentPane().add(jlNome);
        jlNome.setBounds(30, 140, 140, 20);

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

        btSalvar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/Salvar.png"))); // NOI18N
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

        jLObrigatorioCurso.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLObrigatorioCurso.setForeground(new java.awt.Color(204, 0, 0));
        jLObrigatorioCurso.setText("*");
        getContentPane().add(jLObrigatorioCurso);
        jLObrigatorioCurso.setBounds(540, 170, 20, 30);

        jlNome2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jlNome2.setText("Coordenador.:");
        getContentPane().add(jlNome2);
        jlNome2.setBounds(50, 180, 110, 30);

        tfNomeCoordenador.setEditable(false);
        tfNomeCoordenador.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfNomeCoordenador.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 121, 0), 1, true));
        tfNomeCoordenador.setEnabled(false);
        getContentPane().add(tfNomeCoordenador);
        tfNomeCoordenador.setBounds(160, 180, 380, 30);

        btPesqusar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btPesqusar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/pesquisar20.png"))); // NOI18N
        btPesqusar1.setContentAreaFilled(false);
        btPesqusar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btPesqusar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btPesqusar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btPesqusar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesqusar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btPesqusar1);
        btPesqusar1.setBounds(550, 180, 20, 30);

        jLObrigatorioCurso1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLObrigatorioCurso1.setForeground(new java.awt.Color(204, 0, 0));
        jLObrigatorioCurso1.setText("*");
        getContentPane().add(jLObrigatorioCurso1);
        jLObrigatorioCurso1.setBounds(540, 130, 20, 30);

        jlCadTitulacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/CadastroCurso.png"))); // NOI18N
        jlCadTitulacao.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(jlCadTitulacao);
        jlCadTitulacao.setBounds(0, 0, 600, 420);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if (Util.chkVazio(tfNomeCurso.getText())) {
            curso.setNomeCurso(tfNomeCurso.getText().toUpperCase());
            curso.setUsuario(usuario);
            cursoDAO.salvar(curso);
            btLimparActionPerformed(null);
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        Object[] options = {"Sim", "Não"};
        if (semestre.getIdSemestre() == 0) {
            if (curso.getIdCurso() != 0) {
                if (JOptionPane.showOptionDialog(null, "Deseja excluir o Curso " + curso.getNomeCurso()
                        + "?", "BirdPoint", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]) == JOptionPane.YES_OPTION) {
                    if (cursoDAO.remover(curso)) {
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Não foi possível excluir o Curso " + curso.getNomeCurso(),
                                "Erro ao Excluir", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "A exclusão foi cancelada!");
                }

            }
        } else {

            JOptionPane.showMessageDialog(rootPane, "Não foi possível excluir o Curso " + curso.getNomeCurso()+", \npois este já possui semestres cadastrados!",
                    "Erro ao Excluir", JOptionPane.ERROR_MESSAGE);
        }
        btLimparActionPerformed(null);

    }//GEN-LAST:event_btExcluirActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        Util.limparCamposGenerico(this);
        btExcluir.setEnabled(false);
        curso = new Curso();
        semestre = new Semestre();
        usuario = new Usuario();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        List<Curso> lista;
        List<Semestre> listaSemestre;
        lista = (cursoDAO.listar());
        CursoTableModel itm = new CursoTableModel(lista);
        Object objetoRetorno = PesquisaGenerica.exibeTela(itm, "Curso");
        if (objetoRetorno != null) {
            curso = cursoDAO.consultarObjetoId("idCurso", objetoRetorno);
            usuario = curso.getUsuario();
            tfNomeCurso.setText(curso.getNomeCurso());
            tfNomeCoordenador.setText(curso.getUsuario().getNomeUsuario());
            listaSemestre = (semestreDAO.listar());
            List<Semestre> listaFiltrada = new ArrayList<>();
            for (Semestre semestre1 : listaSemestre) {
                if (semestre1.getCurso().getIdCurso() == curso.getIdCurso()) {
                    listaFiltrada.add(semestre1);
                    semestre = semestre1;
                }
            }

            btExcluir.setEnabled(true);
        }
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void btPesqusar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesqusar1ActionPerformed
        List<Usuario> lista;
        lista = (usuarioDAO.checkExists("tipoDeAcessoUsuario", "Coordenador"));
        UsuarioTableModel itm = new UsuarioTableModel(lista);
        Object objetoRetorno = PesquisaGenerica.exibeTela(itm, "Usuário");
        if (objetoRetorno != null) {
            usuario = usuarioDAO.consultarObjetoId("idUsuario", objetoRetorno);
            tfNomeCoordenador.setText(usuario.getNomeUsuario());
        }
    }//GEN-LAST:event_btPesqusar1ActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadastroCurso dialog = new CadastroCurso(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btPesqusar1;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JLabel jLObrigatorioCurso;
    private javax.swing.JLabel jLObrigatorioCurso1;
    private javax.swing.JLabel jlCadTitulacao;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlNome2;
    private javax.swing.JTextField tfNomeCoordenador;
    private javax.swing.JTextField tfNomeCurso;
    // End of variables declaration//GEN-END:variables
}
