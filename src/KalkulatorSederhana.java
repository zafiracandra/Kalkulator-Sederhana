/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zafira
 */
public class KalkulatorSederhana extends javax.swing.JFrame {

    /**
     * Creates new form KalkulatorSederhana
     */
    public KalkulatorSederhana() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Hasil = new javax.swing.JTextField();
        Bilangan1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        kurang = new javax.swing.JButton();
        kali = new javax.swing.JButton();
        bagi = new javax.swing.JButton();
        tambah = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Bilangan2 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setText("Kalkulator Sederhana");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(110, 20, 170, 14);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Hasil");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(160, 240, 60, 15);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Bilangan 1");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(110, 70, 60, 20);

        Hasil.setEditable(false);
        Hasil.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Hasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HasilActionPerformed(evt);
            }
        });
        jPanel1.add(Hasil);
        Hasil.setBounds(150, 260, 60, 40);

        Bilangan1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Bilangan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bilangan1ActionPerformed(evt);
            }
        });
        jPanel1.add(Bilangan1);
        Bilangan1.setBounds(200, 60, 60, 40);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Bilangan 2");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(110, 130, 60, 15);

        kurang.setText("-");
        kurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kurangActionPerformed(evt);
            }
        });
        jPanel1.add(kurang);
        kurang.setBounds(250, 200, 37, 23);

        kali.setText("x");
        kali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaliActionPerformed(evt);
            }
        });
        jPanel1.add(kali);
        kali.setBounds(70, 200, 39, 23);

        bagi.setText(":");
        bagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bagiActionPerformed(evt);
            }
        });
        jPanel1.add(bagi);
        bagi.setBounds(130, 200, 37, 23);

        tambah.setText("+");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });
        jPanel1.add(tambah);
        tambah.setBounds(190, 200, 41, 23);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Operator");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(160, 170, 60, 15);

        Bilangan2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jPanel1.add(Bilangan2);
        Bilangan2.setBounds(200, 120, 60, 40);

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 400, 320);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bilangan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bilangan1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Bilangan1ActionPerformed

    private void kaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kaliActionPerformed
         int bil1 = Integer.parseInt(Bilangan1.getText());
         int bil2 = Integer.parseInt(Bilangan2.getText());
         int hasilkali = bil1*bil2;
   
         Hasil.setText(String.valueOf(hasilkali));
        // TODO add your handling code here:
    }//GEN-LAST:event_kaliActionPerformed

    private void bagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bagiActionPerformed
        // TODO add your handling code here:
        double bil1 = Integer.parseInt(Bilangan1.getText());
        double bil2 = Integer.parseInt(Bilangan2.getText());
        double hasilbagi = bil1/bil2;
   
        Hasil.setText(String.valueOf(hasilbagi));
    }//GEN-LAST:event_bagiActionPerformed

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        // TODO add your handling code here:
        int bil1 = Integer.parseInt(Bilangan1.getText());
        int bil2 = Integer.parseInt(Bilangan2.getText());
        int hasiltambah = bil1+bil2;
   
        Hasil.setText(String.valueOf(hasiltambah));
    }//GEN-LAST:event_tambahActionPerformed

    private void kurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kurangActionPerformed
        // TODO add your handling code here:
        int bil1 = Integer.parseInt(Bilangan1.getText());
        int bil2 = Integer.parseInt(Bilangan2.getText());
        int hasilkurang = bil1-bil2;
   
        Hasil.setText(String.valueOf(hasilkurang));
    }//GEN-LAST:event_kurangActionPerformed

    private void HasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HasilActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_HasilActionPerformed

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
            java.util.logging.Logger.getLogger(KalkulatorSederhana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KalkulatorSederhana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KalkulatorSederhana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KalkulatorSederhana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KalkulatorSederhana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Bilangan1;
    private javax.swing.JTextField Bilangan2;
    private javax.swing.JTextField Hasil;
    private javax.swing.JButton bagi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton kali;
    private javax.swing.JButton kurang;
    private javax.swing.JButton tambah;
    // End of variables declaration//GEN-END:variables
}
