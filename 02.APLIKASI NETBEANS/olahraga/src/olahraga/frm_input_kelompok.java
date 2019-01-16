package olahraga;

import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Statement;

/**
 *
 * @author 0CIL650
 */
public class frm_input_kelompok extends javax.swing.JFrame {
    DefaultTableModel model;
    koneksi koneksi1 = new koneksi();
    
    public frm_input_kelompok() {
        initComponents();
        String[] field={"nama_posisi","kd_posisi"};
        model = new DefaultTableModel(field, 0);
        tabel_kelompok.setModel(model);
        tampil();
    }
     public void clear(){
        text_namaposisi.setText("");
        text_kdposisi.setText("");
    }
     public void refres() {
        String sql="SELECT * FROM kelompok";
        
    }

      public void hapus(){
        int pilih = JOptionPane.showConfirmDialog(null, "Yaqin di HAPUS bos?");
        if(pilih == JOptionPane.OK_OPTION)
            JOptionPane.showConfirmDialog(null, "data PUN INLANG Bosku");
        else if(pilih == JOptionPane.NO_OPTION)
            JOptionPane.showConfirmDialog(null, "kok PHP?");           
    }
      
      public void tampil(){
        DefaultTableModel table1=new DefaultTableModel();
        table1.addColumn("kd_posisi");
        table1.addColumn("nama_posisi");
        


        tabel_kelompok.setModel(table1);
        try{
            ResultSet res = koneksi1.statement.executeQuery("Select * from kelompok");
            while(res.next()){
            table1.addRow(new Object[]{
                res.getString("kd_posisi"),
                res.getString("nama_posisi"),
                

            });
            tabel_kelompok.setModel(table1);}
        }catch (Exception e){

       }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_simpan = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        text_kdposisi = new javax.swing.JTextField();
        text_namaposisi = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_kelompok = new javax.swing.JTable();
        btn_kembali = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btn_edit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("NAMA POSISI");

        jLabel2.setText("KD POSISI");

        btn_simpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        btn_simpan.setText("Simpan");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });

        btn_hapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hapus.png"))); // NOI18N
        btn_hapus.setText("Hapus");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        tabel_kelompok.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "KD POSISI", "NAMA POSISI"
            }
        ));
        tabel_kelompok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_kelompokMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_kelompok);

        btn_kembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back.png"))); // NOI18N
        btn_kembali.setText("KEMBALI");
        btn_kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kembaliActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jLabel3.setText("BAGAN KELOMPOK");

        btn_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit.png"))); // NOI18N
        btn_edit.setText("EDIT");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(text_kdposisi, javax.swing.GroupLayout.PREFERRED_SIZE, 917, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(text_namaposisi, javax.swing.GroupLayout.PREFERRED_SIZE, 911, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(btn_kembali))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(60, 60, 60)
                                        .addComponent(btn_hapus)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_edit))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(123, 123, 123)
                                        .addComponent(btn_simpan)))))
                        .addGap(0, 218, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_kembali)
                    .addComponent(jLabel3))
                .addGap(4, 4, 4)
                .addComponent(btn_simpan)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(text_kdposisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(text_namaposisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_hapus)
                    .addComponent(btn_edit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kembaliActionPerformed
        // TODO add your handling code here:
        frm_utama n = new frm_utama();
        n.setVisible(true);
        this.setVisible(false); // agar form yang tampil 1=fals
    }//GEN-LAST:event_btn_kembaliActionPerformed

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        // TODO add your handling code here:
        String kd_posisi = text_kdposisi.getText();
        String nama_posisi = text_namaposisi.getText();
        
        String SQL ="insert into kelompok(kd_posisi, nama_posisi) values ('"+kd_posisi+"','"+nama_posisi+"')";
        System.out.println(SQL);
        tampil();
        clear();
        
        try {
            koneksi1.statement.executeUpdate(SQL);
            JOptionPane.showMessageDialog(rootPane, "BERHASIL");
            tampil();
         
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "GAGAL");
        }
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        // TODO add your handling code here:
         int p = JOptionPane.showConfirmDialog(null,"Apakah Anda Ingin Menghapus Data?","Delete",JOptionPane.YES_NO_OPTION );
        if (p==0){
        String kd_posisi = text_kdposisi.getText();
        String nama_posisi = text_namaposisi.getText();
     
        String SQL = "delete from kelompok where kd_posisi='"+kd_posisi+"'";
                
        System.out.println(SQL);
        tampil();
        clear();
             
        try {
            koneksi1.statement.executeUpdate(SQL);
            tampil();
            JOptionPane.showMessageDialog(rootPane, "DATA AKUN BERHASIL DIHAPUS");
        } catch (Exception e) {
             JOptionPane.showMessageDialog(rootPane, "DATA AKUN GAGAL DIHAPUS");
        }
        }
    }//GEN-LAST:event_btn_hapusActionPerformed

    
    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        // TODO add your handling code here:
        String nama_posisi = text_namaposisi.getText();
        String kd_posisi = text_kdposisi.getText();
        
        String SQL = "UPDATE kelompok SET "
                +"nama_posisi='"+text_namaposisi.getText()+"'"
                +"WHERE kd_posisi='"+text_kdposisi.getText()+"'";
                
        System.out.println(SQL);
        tampil();
        clear();
        try {
            koneksi1.statement.executeUpdate(SQL);
            tampil();
            JOptionPane.showMessageDialog(rootPane, "DATA AKUN BERHASIL GANTI");
        } catch (Exception e) {
             JOptionPane.showMessageDialog(rootPane, "DATA AKUN GAGAL DIGANTI");
        }
    }//GEN-LAST:event_btn_editActionPerformed

    private void tabel_kelompokMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_kelompokMouseClicked
        // TODO add your handling code here:
     int table=tabel_kelompok.getSelectedRow();
     String a=tabel_kelompok.getValueAt(table, 0).toString();
     String b=tabel_kelompok.getValueAt(table, 1).toString();

     text_kdposisi.setText(a);
     text_namaposisi.setText(b);
    }//GEN-LAST:event_tabel_kelompokMouseClicked

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
            java.util.logging.Logger.getLogger(frm_input_kelompok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_input_kelompok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_input_kelompok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_input_kelompok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_input_kelompok().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_kembali;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabel_kelompok;
    private javax.swing.JTextField text_kdposisi;
    private javax.swing.JTextField text_namaposisi;
    // End of variables declaration//GEN-END:variables
}
