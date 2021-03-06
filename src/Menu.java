/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author alinuxrc
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
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

        jLabel1 = new javax.swing.JLabel();
        cSoto = new javax.swing.JCheckBox();
        cBakso = new javax.swing.JCheckBox();
        cMie = new javax.swing.JCheckBox();
        cSate = new javax.swing.JCheckBox();
        tSoto = new javax.swing.JTextField();
        tBakso = new javax.swing.JTextField();
        tSate = new javax.swing.JTextField();
        tMie = new javax.swing.JTextField();
        btnHitung = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tBayar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Menu Makanan Cafetaria");

        cSoto.setText("Soto Rp.17000");
        cSoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cSotoActionPerformed(evt);
            }
        });

        cBakso.setText("Bakso Rp.20000");
        cBakso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBaksoActionPerformed(evt);
            }
        });

        cMie.setText("Mie Kocok Rp.20000");
        cMie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cMieActionPerformed(evt);
            }
        });

        cSate.setText("Sate Rp.19000");
        cSate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cSateActionPerformed(evt);
            }
        });

        tSoto.setEditable(false);

        tBakso.setEditable(false);

        tSate.setEditable(false);

        tMie.setEditable(false);

        btnHitung.setText("Hitung");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        jLabel2.setText("Total bayar");

        tBayar.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(146, 146, 146))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tBayar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cMie)
                                    .addComponent(cBakso)
                                    .addComponent(cSate)
                                    .addComponent(cSoto))
                                .addGap(6, 6, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tSoto, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tBakso, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tSate, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tMie, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(btnHitung)
                        .addGap(29, 29, 29)
                        .addComponent(btnHapus)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(75, 75, 75))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cSoto)
                    .addComponent(tSoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cBakso)
                    .addComponent(tBakso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cSate)
                    .addComponent(tSate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cMie)
                    .addComponent(tMie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHitung)
                    .addComponent(btnHapus))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cSotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cSotoActionPerformed
        // TODO add your handling code here:
        if (cSoto.isSelected() == true){
            tSoto.setEditable(true);
        } else {
            tSoto.setEditable(false);
            tSoto.setText("");
        }
    }//GEN-LAST:event_cSotoActionPerformed

    private void cBaksoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBaksoActionPerformed
        // TODO add your handling code here:
        if (cBakso.isSelected() == true){
            tBakso.setEditable(true);
        } else {
            tBakso.setEditable(false);
            tBakso.setText("");
        }
    }//GEN-LAST:event_cBaksoActionPerformed

    private void cSateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cSateActionPerformed
        // TODO add your handling code here:
        if (cSate.isSelected() == true){
            tSate.setEditable(true);
        } else {
            tSate.setEditable(false);
            tSate.setText("");
        }
    }//GEN-LAST:event_cSateActionPerformed

    private void cMieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cMieActionPerformed
        // TODO add your handling code here:
        if (cMie.isSelected() == true){
            tMie.setEditable(true);
        } else {
            tMie.setEditable(false);
            tMie.setText("");
        }
    }//GEN-LAST:event_cMieActionPerformed

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
        // TODO add your handling code here:
        int total = 0;
        if (cSoto.isSelected()){
            String soto = tSoto.getText();
            int jumlahSoto = Integer.parseInt(soto);
            int hargaSoto = jumlahSoto * 17000;
            total = total + hargaSoto;
        }
        if (cBakso.isSelected()){
            String bakso = tBakso.getText();
            int jumlahBakso = Integer.parseInt(bakso);
            int hargaBakso = jumlahBakso * 20000;
            total = total + hargaBakso;
        }
        if (cSate.isSelected()){
            String sate = tSate.getText();
            int jumlahSate = Integer.parseInt(sate);
            int hargaSate = jumlahSate * 19000;
            total = total + hargaSate;
        }
        if (cMie.isSelected()){
            String mie = tMie.getText();
            int jumlahMie = Integer.parseInt(mie);
            int hargaMie = jumlahMie * 20000;
            total = total + hargaMie;
        }
    tBayar.setText(""+total);
    }//GEN-LAST:event_btnHitungActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        tSoto.setEditable(false);
        cSoto.setSelected(false);
        tSoto.setText("");
        tBakso.setEditable(false);
        cBakso.setSelected(false);
        tBakso.setText("");
        tSate.setEditable(false);
        cSate.setSelected(false);
        tSate.setText("");
        tMie.setEditable(false);
        cMie.setSelected(false);
        tMie.setText("");
        tBayar.setText("");
    }//GEN-LAST:event_btnHapusActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnHitung;
    private javax.swing.JCheckBox cBakso;
    private javax.swing.JCheckBox cMie;
    private javax.swing.JCheckBox cSate;
    private javax.swing.JCheckBox cSoto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField tBakso;
    private javax.swing.JTextField tBayar;
    private javax.swing.JTextField tMie;
    private javax.swing.JTextField tSate;
    private javax.swing.JTextField tSoto;
    // End of variables declaration//GEN-END:variables
}
