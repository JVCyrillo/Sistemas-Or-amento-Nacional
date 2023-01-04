/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import dao.MunicipioDAO;
import dominio.Municipio;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joaod
 */
public class BuscaDeMunicipiosDoEstado extends javax.swing.JDialog {

    Municipio municipio;
    MunicipioDAO municipioDAO;

    /**
     * Creates new form BuscaDeMunicipiosDoEstado
     */
    public BuscaDeMunicipiosDoEstado(java.awt.Frame parent, boolean modal) {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaMunicipiosClima = new javax.swing.JTable();
        jbPesquisar = new javax.swing.JButton();
        jbSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSiglaDoEstado = new javax.swing.JTextField();
        jbNovo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Busca por sigla");
        setPreferredSize(new java.awt.Dimension(793, 717));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        tabelaMunicipiosClima.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nome", "Sigla do Estado", "Populacao", "Clima", "Gastos"
            }
        ));
        tabelaMunicipiosClima.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMunicipiosClimaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaMunicipiosClima);

        jbPesquisar.setText("PESQUISAR");
        jbPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarActionPerformed(evt);
            }
        });

        jbSair.setText("SAIR");
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });

        jLabel1.setText("Buscar municipios do Estado");

        jLabel2.setText("Insira a sigla do Estado que deseja pesquisar: ");

        txtSiglaDoEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSiglaDoEstadoActionPerformed(evt);
            }
        });

        jbNovo.setText("NOVO");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jbNovo)
                        .addGap(36, 36, 36)
                        .addComponent(jbPesquisar)
                        .addGap(36, 36, 36)
                        .addComponent(jbSair))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(txtSiglaDoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(297, 297, 297)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(170, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSiglaDoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbPesquisar)
                    .addComponent(jbSair)
                    .addComponent(jbNovo))
                .addGap(0, 315, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaMunicipiosClimaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMunicipiosClimaMouseClicked

    }//GEN-LAST:event_tabelaMunicipiosClimaMouseClicked

    private void jbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarActionPerformed
        BuscaPorSigla();
    }//GEN-LAST:event_jbPesquisarActionPerformed

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSairActionPerformed

    private void txtSiglaDoEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSiglaDoEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSiglaDoEstadoActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        txtSiglaDoEstado.setText("");
        txtSiglaDoEstado.setFocusable(true);
        
    }//GEN-LAST:event_jbNovoActionPerformed

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
            java.util.logging.Logger.getLogger(BuscaDeMunicipiosDoEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscaDeMunicipiosDoEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscaDeMunicipiosDoEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscaDeMunicipiosDoEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BuscaDeMunicipiosDoEstado dialog = new BuscaDeMunicipiosDoEstado(new javax.swing.JFrame(), true);
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

    public void MunicipiosGGerais() {
        try {

            municipioDAO = new MunicipioDAO();
            List<Municipio> listarMunicipios = municipioDAO.listarMunicipios();
            DefaultTableModel modelo = (DefaultTableModel) tabelaMunicipiosClima.getModel();
            modelo.setNumRows(0);
            for (Municipio mu : listarMunicipios) {
                modelo.addRow(new Object[]{
                    mu.getNome(),
                    mu.getFk_id_estado(),
                    mu.getPopulacao(),
                    mu.getClima(),
                    mu.getGastos(),});
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao Listar os municipios");
        }
    }
    
    public void BuscaPorSigla() {
        try {
            String sigla = txtSiglaDoEstado.getText();            
            municipioDAO = new MunicipioDAO();
            List<Municipio> listarMunicipios = municipioDAO.listarMunicipiosSigla(sigla);
            DefaultTableModel modelo = (DefaultTableModel) tabelaMunicipiosClima.getModel();
            modelo.setNumRows(0);
            for (Municipio mu : listarMunicipios) {
                modelo.addRow(new Object[]{
                    mu.getNome(),
                    mu.getFk_id_estado(),
                    mu.getPopulacao(),
                    mu.getClima(),
                    mu.getGastos(),});
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao Listar os municipios");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JButton jbSair;
    private javax.swing.JTable tabelaMunicipiosClima;
    private javax.swing.JTextField txtSiglaDoEstado;
    // End of variables declaration//GEN-END:variables
}
