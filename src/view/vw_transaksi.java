/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import fungsi.CRUD_MenuAnakKos;
import fungsi.CRUD_MenuCatering;
import fungsi.CRUD_transaksi;
import javax.swing.JOptionPane;

/**
 *
 * @author BintangDiLangit
 */
public class vw_transaksi extends javax.swing.JFrame {

    /**
     * Creates new form vw_transaksi
     */
//    GUI_KonfirmasiPembayaran pindahPage = new GUI_KonfirmasiPembayaran();
    CRUD_transaksi app = new CRUD_transaksi();
    public vw_transaksi() {
        initComponents();
    }
        public void tampilHarga() {

          CRUD_MenuCatering[] menuCatering = new CRUD_MenuCatering[1];
//        menuCatering[0] = new CRUD_MenuDiet();
//        menuCatering[1] = new CRUD_MenuBulking();
        menuCatering[0] = new CRUD_MenuAnakKos();
        
        //set harga menu diet
        menuCatering[0].setHargaLanggananSeminggu("Rp. 200000");
        menuCatering[0].setHargaLanggananSebulan("Rp. 700000");
        
//         //set harga menu bulking
//        menuCatering[1].setHargaLanggananSeminggu("Rp. 300000");
//        menuCatering[1].setHargaLanggananSebulan("Rp. 800000");
//        
//         //set harga menu anakkos
//        menuCatering[2].setHargaLanggananSeminggu("Rp. 150000");
//        menuCatering[2].setHargaLanggananSebulan("Rp. 500000");

        if (paket.getSelectedItem().equals("Paket Diet") && durasi.getSelectedItem().equals("SeMinggu")) {
            JOptionPane.showMessageDialog(null, "Harga yang Harus anda Bayar: \n" + menuCatering[0].getHargaLanggananSeminggu()+ "\n transfer ke: 085330609273" + "\n===Bayar sesuai harga & Metode Pembayaran yang anda pilih===");
        } else if (paket.getSelectedItem().equals("Paket Diet") && durasi.getSelectedItem().equals("Sebulan")) {
            JOptionPane.showMessageDialog(null, "Harga yang Harus anda Bayar: \n" + menuCatering[0].getHargaLanggananSebulan() + "\n transfer ke: 085330609273" + "\n===Bayar sesuai harga & Metode Pembayaran yang anda pilih===");
        } else if (paket.getSelectedItem().equals("Paket Bulking") && durasi.getSelectedItem().equals("SeMinggu")) {
            JOptionPane.showMessageDialog(null, "Harga yang Harus anda Bayar: \n" + menuCatering[1].getHargaLanggananSeminggu() + "\n transfer ke: 085330609273" + "\n===Bayar sesuai harga & Metode Pembayaran yang anda pilih===");
        } else if (paket.getSelectedItem().equals("Paket Bulking") && durasi.getSelectedItem().equals("Sebulan")) {
            JOptionPane.showMessageDialog(null, "Harga yang Harus anda Bayar: \n" + menuCatering[1].getHargaLanggananSebulan() + "\n transfer ke: 085330609273" + "\n===Bayar sesuai harga & Metode Pembayaran yang anda pilih===");
        } else if (paket.getSelectedItem().equals("Paket Anak Kos") && durasi.getSelectedItem().equals("SeMinggu")) {
            JOptionPane.showMessageDialog(null, "Harga yang Harus anda Bayar: \n" + menuCatering[2].getHargaLanggananSeminggu() + "\n transfer ke: 085330609273" + "\n===Bayar sesuai harga & Metode Pembayaran yang anda pilih===");
        } else if (paket.getSelectedItem().equals("Paket Anak Kos") && durasi.getSelectedItem().equals("Sebulan")) {
            JOptionPane.showMessageDialog(null, "Harga yang Harus anda Bayar: \n" + menuCatering[2].getHargaLanggananSebulan() + "\n transfer ke: 085330609273" + "\n===Bayar sesuai harga & Metode Pembayaran yang anda pilih===");
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

        paket = new javax.swing.JComboBox<>();
        durasi = new javax.swing.JComboBox<>();
        metodePembayaran = new javax.swing.JComboBox<>();
        nama = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        insert = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        paket.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Paket Diet", "Paket Bulking", "Paket Anak Kos" }));

        durasi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SeMinggu", "Sebulan" }));

        metodePembayaran.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "OVO", "DANA", "GOPAY" }));
        metodePembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                metodePembayaranActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nama: ");

        jLabel2.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("pilih paket:");

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("durasi langganan:");

        jLabel5.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("metode pembayaran:");

        insert.setText("Insert");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(270, 270, 270)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(190, 190, 190)
                                        .addComponent(jLabel2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(60, 60, 60)
                                        .addComponent(jLabel1))
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(paket, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(durasi, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(metodePembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(421, 421, 421)
                        .addComponent(insert)))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(165, Short.MAX_VALUE)
                .addComponent(insert)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel1)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(paket, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(durasi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(metodePembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void metodePembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_metodePembayaranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_metodePembayaranActionPerformed

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        try {
                app.setNama(nama.getText());
                app.setPilihPaketCatering((String) paket.getSelectedItem());
                app.setDurasiBerlangganan((String) durasi.getSelectedItem());
                app.setMetodePembayaran((String) metodePembayaran.getSelectedItem());

                app.simpanData(
                        app.getNama(),
                        app.getPilihPaketCatering(),
                        app.getDurasiBerlangganan(),
                        app.getMetodePembayaran()
                );

                tampilHarga();

                
//                pindahPage.setVisible(true);
                this.setVisible(false);
                this.dispose();

            } catch (Exception e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(null, "DATA SUDAH ADA");
            }
    }//GEN-LAST:event_insertActionPerformed

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
            java.util.logging.Logger.getLogger(vw_transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vw_transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vw_transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vw_transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vw_transaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> durasi;
    private javax.swing.JButton insert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JComboBox<String> metodePembayaran;
    private javax.swing.JTextField nama;
    private javax.swing.JComboBox<String> paket;
    // End of variables declaration//GEN-END:variables
}
