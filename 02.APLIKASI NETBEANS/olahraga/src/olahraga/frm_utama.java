package olahraga;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 0cil650
 */

public class frm_utama extends javax.swing.JFrame {

    koneksi koneksi1 = new koneksi();
    
    public frm_utama() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_daftarakun = new javax.swing.JButton();
        btn_jurnalumum = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_tampil = new javax.swing.JTable();
        btn_exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jToolBar3 = new javax.swing.JToolBar();
        btn_inp_jurnalumum = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jToolBar1 = new javax.swing.JToolBar();
        btn_akun = new javax.swing.JButton();
        btn_gol = new javax.swing.JButton();
        btn_kel = new javax.swing.JButton();
        jToolBar4 = new javax.swing.JToolBar();
        jButton29 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_daftarakun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/AKUN.png"))); // NOI18N
        btn_daftarakun.setText("Daftar Akun");
        btn_daftarakun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_daftarakunActionPerformed(evt);
            }
        });

        btn_jurnalumum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/jurnal.png"))); // NOI18N
        btn_jurnalumum.setText("Jurnal Umum");
        btn_jurnalumum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_jurnalumumActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buku.png"))); // NOI18N
        jButton3.setText("Buku Besar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/neraca.png"))); // NOI18N
        jButton4.setText("Neraca Saldo");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/print.png"))); // NOI18N
        jButton6.setText("Laporan Keuangan");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        tabel_tampil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabel_tampil);

        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit.png"))); // NOI18N
        btn_exit.setText("EXIT");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Felix Titling", 1, 36)); // NOI18N
        jLabel1.setText("AKUNTANSI TOKO OLAHRAGA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1353, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_daftarakun)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_jurnalumum)
                        .addGap(4, 4, 4)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_exit)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(btn_exit))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_jurnalumum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_daftarakun, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.setBackground(new java.awt.Color(204, 204, 204));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTabbedPane1.setForeground(new java.awt.Color(102, 102, 102));
        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setToolTipText("");
        jTabbedPane1.setAutoscrolls(true);

        jToolBar3.setFloatable(false);
        jToolBar3.setRollover(true);

        btn_inp_jurnalumum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/jurnal.png"))); // NOI18N
        btn_inp_jurnalumum.setText("JURNAL UMUM");
        btn_inp_jurnalumum.setFocusable(false);
        btn_inp_jurnalumum.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_inp_jurnalumum.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_inp_jurnalumum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inp_jurnalumumActionPerformed(evt);
            }
        });
        jToolBar3.add(btn_inp_jurnalumum);
        jToolBar3.add(jSeparator2);

        jTabbedPane1.addTab("OLAH KEUANGAN", jToolBar3);

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);
        jToolBar1.setMargin(new java.awt.Insets(5, 0, 0, 0));

        btn_akun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/AKUN.png"))); // NOI18N
        btn_akun.setText("AKUN");
        btn_akun.setFocusable(false);
        btn_akun.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_akun.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_akun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_akunActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_akun);

        btn_gol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/GOLONGAN.png"))); // NOI18N
        btn_gol.setText("GOLONGAN");
        btn_gol.setFocusable(false);
        btn_gol.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_gol.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_gol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_golActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_gol);

        btn_kel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/KELOMPOK.png"))); // NOI18N
        btn_kel.setText("KELOMPOK");
        btn_kel.setFocusable(false);
        btn_kel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_kel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_kel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kelActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_kel);

        jTabbedPane1.addTab("3 TABEL INTI", jToolBar1);

        jToolBar4.setRollover(true);

        jButton29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/info.png"))); // NOI18N
        jButton29.setText("INFO");
        jButton29.setFocusable(false);
        jButton29.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton29.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        jToolBar4.add(jButton29);

        jTabbedPane1.addTab("INFO", jToolBar4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1353, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(209, 209, 209))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        // TODO add your handling code here:
         int i = JOptionPane.showOptionDialog(this, "YAKIN KELUAR ? ","Keluar", 
                JOptionPane.YES_NO_OPTION, 
                JOptionPane.QUESTION_MESSAGE,null,null,null);
        if(i == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(this, "TERIMA KASIH SUDAH MENGGUNAKAN SISTEM KAMI");
            System.exit(0);
        }  
    }//GEN-LAST:event_btn_exitActionPerformed

    private void btn_daftarakunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_daftarakunActionPerformed

        DefaultTableModel tabel1Model = new DefaultTableModel();
        tabel1Model.addColumn("NO AKUN 1");
        tabel1Model.addColumn("NAMA AKUN 1");
        tabel1Model.addColumn("KODE POSISI");
        tabel1Model.addColumn("NAMA POSISI (NORMAL)");
        tabel_tampil.setModel(tabel1Model);
        try {
                ResultSet res = koneksi1.statement.executeQuery("SELECT a. no_akun1, a. nama_akun1, b. kd_posisi, b. nama_posisi FROM golongan a JOIN kelompok b ON b. kd_posisi =a. kd_posisi WHERE a. kd_posisi");
                
                while (res.next()) {
                    tabel1Model.addRow(new Object[]{
                    res.getString("no_akun1"),
                    res.getString("nama_akun1"),
                    res.getString("kd_posisi"),
                    res.getString("nama_posisi"),
                    });
                    tabel_tampil.setModel(tabel1Model);
                    
                }
            } catch (Exception e) {
            }
        
    }//GEN-LAST:event_btn_daftarakunActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "TUGAS AKUTANSI SIA");
    }//GEN-LAST:event_jButton29ActionPerformed

    private void btn_akunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_akunActionPerformed
        // TODO add your handling code here:
        //JIKA DI KLIK PINDAH KE FRM_INPUT DATA DEMGAN MELALUI KONESKI1.
        frm_input_akun n = new frm_input_akun();
        n.setVisible(true);
        this.setVisible(false); // agar form yang tampil 1=fals
    }//GEN-LAST:event_btn_akunActionPerformed

    private void btn_golActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_golActionPerformed
        // TODO add your handling code here:
         frm_input_golongan n = new frm_input_golongan();
        n.setVisible(true);
        this.setVisible(false); // agar form yang tampil 1=fals
    }//GEN-LAST:event_btn_golActionPerformed

    private void btn_kelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kelActionPerformed
        // TODO add your handling code here:
         frm_input_kelompok n = new frm_input_kelompok();
        n.setVisible(true);
        this.setVisible(false); // agar form yang tampil 1=fals
    }//GEN-LAST:event_btn_kelActionPerformed

    private void btn_jurnalumumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_jurnalumumActionPerformed
        // TODO add your handling code here:
       DefaultTableModel tabel1Model = new DefaultTableModel();
        tabel1Model.addColumn("TANGGAL");
        tabel1Model.addColumn("REF");
        tabel1Model.addColumn("NO AKUN 2");
        tabel1Model.addColumn("NAMA AKUN 2");
        tabel1Model.addColumn("DEBIT");
        tabel1Model.addColumn("KREDIT");
        tabel_tampil.setModel(tabel1Model);
        try {
                ResultSet res = koneksi1.statement.executeQuery("SELECT * FROM jurnal_umum");
                
                while (res.next()) {
                    tabel1Model.addRow(new Object[]{
                    res.getString("tgl"),
                    res.getString("ref"),
                    res.getString("no_akun2"),
                    res.getString("nama_akun2"),
                    res.getString("debit"),
                    res.getString("kredit"),
                    });
                    tabel_tampil.setModel(tabel1Model);
                    
                }
            } catch (Exception e) {
            }
    }//GEN-LAST:event_btn_jurnalumumActionPerformed

    private void btn_inp_jurnalumumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inp_jurnalumumActionPerformed
        // TODO add your handling code here:
        frm_input_jurnal_umum n = new frm_input_jurnal_umum();
        n.setVisible(true);
        this.setVisible(false); // agar form yang tampil 1=fals
    }//GEN-LAST:event_btn_inp_jurnalumumActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
               DefaultTableModel tabel1Model = new DefaultTableModel();
        tabel1Model.addColumn("no_akun");
        tabel1Model.addColumn("nama_akun");
        tabel1Model.addColumn("debit");
        tabel1Model.addColumn("kredit");
        tabel_tampil.setModel(tabel1Model);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
            DefaultTableModel tabel1Model = new DefaultTableModel();
        tabel1Model.addColumn("no_akun");
        tabel1Model.addColumn("nama_akun");
        tabel1Model.addColumn("debit");
        tabel1Model.addColumn("kredit");
        tabel1Model.addColumn("total");
        tabel_tampil.setModel(tabel1Model);   
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
          frm_laporan n = new frm_laporan();
        n.setVisible(true);
        this.setVisible(false); // agar form yang tampil 1=fals
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(frm_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_utama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_akun;
    private javax.swing.JButton btn_daftarakun;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_gol;
    private javax.swing.JButton btn_inp_jurnalumum;
    private javax.swing.JButton btn_jurnalumum;
    private javax.swing.JButton btn_kel;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JToolBar jToolBar4;
    private javax.swing.JTable tabel_tampil;
    // End of variables declaration//GEN-END:variables
}
