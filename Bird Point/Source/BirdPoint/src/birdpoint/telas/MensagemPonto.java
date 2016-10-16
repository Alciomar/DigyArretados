/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package birdpoint.telas;

import birdpoint.professor.Professor;
import birdpoint.professor.ProfessorDAO;
import birdpoint.registro.ponto.Ponto;
import birdpoint.registro.ponto.PontoDAO;
import birdpoint.registro.ponto.PontoTableModel;
import birdpoint.util.LeitorBiometrico;
import birdpoint.util.Relogio;
import birdpoint.util.Util;
import com.digitalpersona.onetouch.DPFPGlobal;
import com.digitalpersona.onetouch.DPFPTemplate;
import static java.lang.Thread.sleep;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;

/**
 * @author Adriano Lima
 */
public class MensagemPonto extends javax.swing.JDialog {

    SimpleDateFormat formatarData = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    Date dataHoraSistema;

    Professor professor = new Professor();
    boolean entradaOuSaida;

    public MensagemPonto(java.awt.Frame parent, boolean modal, Professor professor, boolean entradaOuSaida) {
        super(parent, modal);
        initComponents();
        tfNomeProfessor.setText(professor.getNomeProfessor());
        this.professor = professor;
        this.entradaOuSaida = entradaOuSaida;
        preencherTextoTela();
        carregarFoto();
        mostrarHora();
        encerrarTela();
    }

    public void encerrarTela() {
        new Thread() {
            public void run() {
                for (int i = 3; i >= 0; i--) {
                    try {
                        tfTempo.setText(String.valueOf(i));
                        sleep(1000);
                    } catch (Exception e) {
                    }
                }
                dispose();
            }

        }.start();
    }

    public void preencherTextoTela() {
        if (entradaOuSaida) {
            tfMensagem1.setText("Seja Bem vindo(a) Professor(a).:");
            tfMensagem2.setText("A Faculdade Vale do Salgado lhe deseja uma ótima aula.");
            tfMensagem3.setText("Entrada");
        } else {
            tfMensagem1.setText("Até logo Professor(a).:");
            tfMensagem2.setText("A Faculdade Vale do Salgado agradece sua presença.");
            tfMensagem3.setText("Saída");
        }
    }

    public void mostrarHora() {
        Relogio ah = new Relogio(tfHora);
        ah.mostrarData(true);
        Thread thHora = ah;
        thHora.start();
    }

    private void carregarFoto() {
        try {
            ImageIcon foto = new ImageIcon();
            foto.setImage(Util.byteToImage(professor.getFotoProf()));
            btFoto.setIcon(foto);
        } catch (Exception e) {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        selecionarFoto = new javax.swing.JFileChooser();
        btFoto = new javax.swing.JButton();
        tfHora = new javax.swing.JLabel();
        tfNomeProfessor = new javax.swing.JLabel();
        tfMensagem2 = new javax.swing.JLabel();
        tfMensagem1 = new javax.swing.JLabel();
        tfHora1 = new javax.swing.JLabel();
        tfTempo = new javax.swing.JLabel();
        tfMensagem3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        selecionarFoto.setMaximumSize(new java.awt.Dimension(580, 245));
        selecionarFoto.setMinimumSize(new java.awt.Dimension(550, 245));
        selecionarFoto.setPreferredSize(new java.awt.Dimension(520, 320));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(560, 270));
        setMinimumSize(new java.awt.Dimension(560, 270));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(560, 270));
        setResizable(false);
        getContentPane().setLayout(null);

        btFoto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/default.jpg"))); // NOI18N
        btFoto.setContentAreaFilled(false);
        btFoto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btFoto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btFoto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFotoActionPerformed(evt);
            }
        });
        getContentPane().add(btFoto);
        btFoto.setBounds(10, 10, 120, 140);

        tfHora.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        tfHora.setText("Hora.:");
        getContentPane().add(tfHora);
        tfHora.setBounds(370, 0, 180, 30);

        tfNomeProfessor.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        tfNomeProfessor.setText("nomeProfessor");
        getContentPane().add(tfNomeProfessor);
        tfNomeProfessor.setBounds(140, 80, 390, 30);

        tfMensagem2.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        tfMensagem2.setText("Mensagem2");
        getContentPane().add(tfMensagem2);
        tfMensagem2.setBounds(30, 170, 480, 30);

        tfMensagem1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tfMensagem1.setText("Mensagem1");
        getContentPane().add(tfMensagem1);
        tfMensagem1.setBounds(140, 50, 300, 30);

        tfHora1.setFont(new java.awt.Font("Tahoma", 2, 15)); // NOI18N
        tfHora1.setText("Aguarde enquanto estamos registrando o horário de sua");
        getContentPane().add(tfHora1);
        tfHora1.setBounds(70, 230, 380, 30);

        tfTempo.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        getContentPane().add(tfTempo);
        tfTempo.setBounds(520, 230, 30, 30);

        tfMensagem3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tfMensagem3.setText("Entrada");
        getContentPane().add(tfMensagem3);
        tfMensagem3.setBounds(450, 230, 60, 30);

        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 560, 270);

        jPanel1.setBackground(new java.awt.Color(153, 255, 102));
        jPanel1.setForeground(new java.awt.Color(204, 255, 51));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 560, 270);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFotoActionPerformed

    }//GEN-LAST:event_btFotoActionPerformed

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
            java.util.logging.Logger.getLogger(MensagemPonto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MensagemPonto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MensagemPonto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MensagemPonto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MensagemPonto dialog = new MensagemPonto(new javax.swing.JFrame(), true, null, false);
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
    private javax.swing.JButton btFoto;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFileChooser selecionarFoto;
    private javax.swing.JLabel tfHora;
    private javax.swing.JLabel tfHora1;
    private javax.swing.JLabel tfMensagem1;
    private javax.swing.JLabel tfMensagem2;
    private javax.swing.JLabel tfMensagem3;
    private javax.swing.JLabel tfNomeProfessor;
    private javax.swing.JLabel tfTempo;
    // End of variables declaration//GEN-END:variables
}
