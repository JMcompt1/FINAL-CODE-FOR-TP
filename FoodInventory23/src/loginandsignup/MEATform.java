package loginandsignup;

import java.sql.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class MEATform extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MEATform.class.getName());
    
    private int selectedId = -1;
   
    public MEATform() {
        initComponents();
        setLocationRelativeTo(null);
        loadTable();
    }
  void loadTable() {

         try {

        Connection con = DBConnection.connect();

        String sql =
                "SELECT id,name,weight,quantity FROM items WHERE category='MEAT'";

        PreparedStatement pst =
                con.prepareStatement(sql);

        ResultSet rs = pst.executeQuery();

        DefaultTableModel model =
                (DefaultTableModel) tblMeat.getModel();

        model.setRowCount(0);

        while (rs.next()) {

            model.addRow(new Object[]{
                rs.getInt("id"),
                rs.getString("name"),
                rs.getDouble("weight"),
                rs.getInt("quantity")
            });

        }

        tblMeat.getColumnModel().getColumn(0).setMinWidth(0);
        tblMeat.getColumnModel().getColumn(0).setMaxWidth(0);
        tblMeat.getColumnModel().getColumn(0).setWidth(0);

    } catch (Exception e) {
        System.out.println(e.getMessage());
    }

}
    
  
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        MEATtxtF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        MEATWF = new javax.swing.JTextField();
        MEATQF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        MEATupdateBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMeat = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setPreferredSize(new java.awt.Dimension(1200, 600));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("MEAT");

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("BACK");
        jButton2.addActionListener(this::jButton2ActionPerformed);

        MEATtxtF.addActionListener(this::MEATtxtFActionPerformed);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("NAME");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("WEIGHT (KG)");

        MEATWF.addActionListener(this::MEATWFActionPerformed);

        MEATQF.addActionListener(this::MEATQFActionPerformed);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("QUANTITY");

        MEATupdateBtn.setBackground(new java.awt.Color(204, 204, 204));
        MEATupdateBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MEATupdateBtn.setForeground(new java.awt.Color(0, 0, 0));
        MEATupdateBtn.setText("Update");
        MEATupdateBtn.addActionListener(this::MEATupdateBtnActionPerformed);

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Delete");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        tblMeat.setBackground(new java.awt.Color(255, 255, 255));
        tblMeat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "NAME", "WEIGHT (KG)", "QUANTITY"
            }
        ));
        tblMeat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMeatMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblMeat);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(336, 336, 336)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(MEATWF, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(MEATQF, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(MEATupdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(165, 165, 165)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)))
                        .addComponent(MEATtxtF, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(26, 26, 26))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MEATtxtF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MEATWF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MEATQF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MEATupdateBtn)
                            .addComponent(jButton1))
                        .addGap(191, 191, 191)
                        .addComponent(jButton2))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Home dash = new Home();
        dash.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void MEATtxtFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MEATtxtFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MEATtxtFActionPerformed

    private void MEATWFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MEATWFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MEATWFActionPerformed

    private void MEATQFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MEATQFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MEATQFActionPerformed

    private void MEATupdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MEATupdateBtnActionPerformed
         if (selectedId == -1) {

        JOptionPane.showMessageDialog(this,
                "Select an item first.");

        return;
    }

    try {

        Connection con = DBConnection.connect();

        String sql =
                "UPDATE items SET name=?,weight=?,quantity=? WHERE id=?";

        PreparedStatement pst =
                con.prepareStatement(sql);

        pst.setString(1, MEATtxtF.getText());
        pst.setDouble(2,
                Double.parseDouble(MEATWF.getText()));
        pst.setInt(3,
                Integer.parseInt(MEATQF.getText()));
        pst.setInt(4, selectedId);

        pst.executeUpdate();

        JOptionPane.showMessageDialog(this,
                "Updated!");

        loadTable();

    } catch (Exception e) {

        JOptionPane.showMessageDialog(this,
                e.getMessage());

    }
    }//GEN-LAST:event_MEATupdateBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       if (selectedId == -1) {

        JOptionPane.showMessageDialog(this,
                "Select an item first.");

        return;
    }

    try {

        int confirm = JOptionPane.showConfirmDialog(
                this,
                "Delete item?",
                "Confirm",
                JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {

            Connection con = DBConnection.connect();

            String sql =
                    "DELETE FROM items WHERE id=?";

            PreparedStatement pst =
                    con.prepareStatement(sql);

            pst.setInt(1, selectedId);

            int result = pst.executeUpdate();

            if (result > 0) {

                JOptionPane.showMessageDialog(this,
                        "Deleted!");

                loadTable();

                selectedId = -1;

                MEATtxtF.setText("");
                MEATWF.setText("");
                MEATQF.setText("");

            }

        }

    } catch (Exception e) {

        JOptionPane.showMessageDialog(this,
                e.getMessage());

    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tblMeatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMeatMouseClicked
        int row = tblMeat.getSelectedRow();

        selectedId = Integer.parseInt(
            tblMeat.getValueAt(row, 0).toString());

        MEATtxtF.setText(
            tblMeat.getValueAt(row, 1).toString());

        MEATWF.setText(
            tblMeat.getValueAt(row, 2).toString());

        MEATQF.setText(
            tblMeat.getValueAt(row, 3).toString());
        
    }//GEN-LAST:event_tblMeatMouseClicked

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new MEATform().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField MEATQF;
    private javax.swing.JTextField MEATWF;
    private javax.swing.JTextField MEATtxtF;
    private javax.swing.JButton MEATupdateBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblMeat;
    // End of variables declaration//GEN-END:variables
}
