/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import dao.EstadoDAO;
import dominio.Estado;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chris
 */
public class EstadoInterface extends javax.swing.JDialog {

    Estado estado;
    EstadoDAO estadoDAO;

    /**
     * Creates new form Aluno
     */
    public EstadoInterface(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EHDistritoFederal = new javax.swing.ButtonGroup();
        lblmatricula = new javax.swing.JLabel();
        txtNomeEstado = new javax.swing.JFormattedTextField();
        lblnome = new javax.swing.JLabel();
        txtSigla = new javax.swing.JTextField();
        lblemail = new javax.swing.JLabel();
        lbltelefone = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaDeEstados = new javax.swing.JTable();
        btnnovo = new javax.swing.JButton();
        btninserir = new javax.swing.JButton();
        btnexcluir = new javax.swing.JButton();
        btnsair = new javax.swing.JButton();
        rbSimDistrito = new javax.swing.JRadioButton();
        rbDistritoNao = new javax.swing.JRadioButton();
        txtOrcamento = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela de Cadastro de Estado");
        setModal(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        lblmatricula.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblmatricula.setText("Nome");

        txtNomeEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeEstadoActionPerformed(evt);
            }
        });

        lblnome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblnome.setText("Sigla");

        txtSigla.setText("XX");
        txtSigla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSiglaActionPerformed(evt);
            }
        });

        lblemail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblemail.setText("Distrito federal");

        lbltelefone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbltelefone.setText("Orçamento Total");

        tabelaDeEstados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sigla", "Nome", "DistritoFederal", "OrcamentoTotal", "Gasto Total dos municipios"
            }
        ));
        tabelaDeEstados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaDeEstadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaDeEstados);

        btnnovo.setMnemonic('n');
        btnnovo.setText("NOVO");
        btnnovo.setToolTipText("Novo");
        btnnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnovoActionPerformed(evt);
            }
        });

        btninserir.setMnemonic('i');
        btninserir.setText("INSERIR");
        btninserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninserirActionPerformed(evt);
            }
        });

        btnexcluir.setMnemonic('e');
        btnexcluir.setText("EXCLUIR");
        btnexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexcluirActionPerformed(evt);
            }
        });

        btnsair.setMnemonic('s');
        btnsair.setText("SAIR");
        btnsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsairActionPerformed(evt);
            }
        });

        EHDistritoFederal.add(rbSimDistrito);
        rbSimDistrito.setText("Sim");

        EHDistritoFederal.add(rbDistritoNao);
        rbDistritoNao.setText("Não");

        jLabel1.setText("CADASTRO DE ESTADO NACIONAL");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblnome)
                                    .addComponent(lbltelefone)
                                    .addComponent(lblemail)
                                    .addComponent(lblmatricula))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNomeEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                    .addComponent(txtSigla)
                                    .addComponent(txtOrcamento)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbSimDistrito)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbDistritoNao))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(btnnovo)
                                .addGap(40, 40, 40)
                                .addComponent(btninserir)
                                .addGap(27, 27, 27)
                                .addComponent(btnexcluir)
                                .addGap(46, 46, 46)
                                .addComponent(btnsair)))
                        .addGap(0, 183, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblmatricula)
                    .addComponent(txtNomeEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnome)
                    .addComponent(txtSigla, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblemail)
                    .addComponent(rbSimDistrito)
                    .addComponent(rbDistritoNao))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltelefone)
                    .addComponent(txtOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnnovo)
                    .addComponent(btninserir)
                    .addComponent(btnexcluir)
                    .addComponent(btnsair))
                .addContainerGap(122, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeEstadoActionPerformed

    private void btninserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninserirActionPerformed
        try {
            estado = new Estado();
            estado.setNome(txtNomeEstado.getText());
            String sigla = txtSigla.getText();
            System.out.println(sigla.length());
            if (sigla.length()==2){
                estado.setSigla(sigla);
            }
            System.out.println(sigla); 

            if (rbDistritoNao.isSelected()) {
                estado.setDistritoFederal(0);
            } else if (rbSimDistrito.isSelected()) {
                estado.setDistritoFederal(1);
            }
            String orcamentoTotal = txtOrcamento.getText();
            float orcamento = Float.parseFloat(orcamentoTotal);
            estado.setOrcamentoTotal(orcamento);
            estadoDAO = new EstadoDAO();
            estadoDAO.cadastrarEstado(estado);
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
            limpar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar o Estado!");
            System.err.println(e);
        }
    }//GEN-LAST:event_btninserirActionPerformed

    private void btnnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnovoActionPerformed

        limpar();
    }//GEN-LAST:event_btnnovoActionPerformed

    private void txtSiglaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSiglaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSiglaActionPerformed

    private void tabelaDeEstadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaDeEstadosMouseClicked
        txtSigla.setText(tabelaDeEstados.getValueAt(tabelaDeEstados.getSelectedRow(), 0).toString());
        txtNomeEstado.setText(tabelaDeEstados.getValueAt(tabelaDeEstados.getSelectedRow(), 1).toString());
        int controle = Integer.parseInt(tabelaDeEstados.getValueAt(tabelaDeEstados.getSelectedRow(), 2).toString());
        if (controle == 1) {
            rbSimDistrito.setSelected(true);
        } else {
            rbDistritoNao.setSelected(true);
        }
        txtOrcamento.setText(tabelaDeEstados.getValueAt(tabelaDeEstados.getSelectedRow(), 3).toString());
        txtNomeEstado.setEnabled(false);
        rbDistritoNao.setEnabled(false);
        rbSimDistrito.setEnabled(false);
        txtOrcamento.setEnabled(false);
        txtSigla.setEditable(false);

    }//GEN-LAST:event_tabelaDeEstadosMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Listar();
    }//GEN-LAST:event_formWindowActivated

    private void btnsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnsairActionPerformed

    private void btnexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexcluirActionPerformed
        try {
            String sigla = txtSigla.getText();
            System.out.println("Erro 1");
            System.out.println(sigla);           
            System.out.println("Erro 3");
            estadoDAO = new EstadoDAO();
            estadoDAO.excluirEstado(sigla);
            JOptionPane.showMessageDialog(null, "Estado Excluido Com Sucesso!!!");
            limpar();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao Excluir o Estado");
        }
    }//GEN-LAST:event_btnexcluirActionPerformed

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
            java.util.logging.Logger.getLogger(Estado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EstadoInterface dialog = new EstadoInterface(new javax.swing.JFrame(), true);
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

    private void limpar() {
        txtNomeEstado.setEnabled(true);
        rbDistritoNao.setEnabled(true);
        rbSimDistrito.setEnabled(true);
        txtOrcamento.setEnabled(true);
        txtSigla.setEditable(true);
        txtNomeEstado.setText("");
        txtSigla.setText("");
        txtSigla.requestFocus();
        txtOrcamento.setText("");
    }

    public void Listar() {
        try {
            estadoDAO = new EstadoDAO();
            List<Estado> listarEstados = estadoDAO.listarEstados();
            DefaultTableModel modelo = (DefaultTableModel) tabelaDeEstados.getModel();
            modelo.setNumRows(0);
            for (Estado la : listarEstados) {
                modelo.addRow(new Object[]{
                    la.getSigla(),
                    la.getNome(),
                    la.getDistritoFederal(),
                    la.getOrcamentoTotal(),
                    la.getGastosTotais(),});
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao Listar os estados");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup EHDistritoFederal;
    private javax.swing.JButton btnexcluir;
    private javax.swing.JButton btninserir;
    private javax.swing.JButton btnnovo;
    private javax.swing.JButton btnsair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblmatricula;
    private javax.swing.JLabel lblnome;
    private javax.swing.JLabel lbltelefone;
    private javax.swing.JRadioButton rbDistritoNao;
    private javax.swing.JRadioButton rbSimDistrito;
    private javax.swing.JTable tabelaDeEstados;
    private javax.swing.JFormattedTextField txtNomeEstado;
    private javax.swing.JTextField txtOrcamento;
    private javax.swing.JTextField txtSigla;
    // End of variables declaration//GEN-END:variables
}
