package loginandsignup;

import java.sql.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class VEGETABLEform extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VEGETABLEform.class.getName());
    
    private int selectedId = -1;
    
    public VEGETABLEform() {
        initComponents();
        setLocationRelativeTo(null);
        loadTable();
    }
  void loadTable() {

         try {

        Connection con = DBConnection.connect();

        String sql =
                "SELECT id,name,weight,quantity FROM items WHERE category='VEGETABLE'";

        PreparedStatement pst =
                con.prepareStatement(sql);

        ResultSet rs = pst.executeQuery();

        DefaultTableModel model =
                (DefaultTableModel) tblVegetable.getModel();

        model.setRowCount(0);

        while (rs.next()) {

            model.addRow(new Object[]{
                rs.getInt("id"),
                rs.getString("name"),
                rs.getDouble("weight"),
                rs.getInt("quantity")
            });

        }

        tblVegetable.getColumnModel().getColumn(0).setMinWidth(0);
        tblVegetable.getColumnModel().getColumn(0).setMaxWidth(0);
        tblVegetable.getColumnModel().getColumn(0).setWidth(0);

    } catch (Exception e) {
        System.out.println(e.getMessage());
        }
    }       
  
  
  
  
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVegetable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        VEGtxtF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        VEGWF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        VEGQF = new javax.swing.JTextField();
        VEGup = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 600));

        tblVegetable.setBackground(new java.awt.Color(255, 255, 255));
        tblVegetable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tblVegetable.setForeground(new java.awt.Color(0, 0, 0));
        tblVegetable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Weight (kg)", "Quantity"
            }
        ));
        tblVegetable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVegetableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblVegetable);

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("BACK");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("VEGETEABLE");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("NAME");

        VEGtxtF.addActionListener(this::VEGtxtFActionPerformed);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("WEIGHT (KG)");

        VEGWF.addActionListener(this::VEGWFActionPerformed);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("QUANTITY");

        VEGQF.addActionListener(this::VEGQFActionPerformed);

        VEGup.setBackground(new java.awt.Color(204, 204, 204));
        VEGup.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        VEGup.setForeground(new java.awt.Color(0, 0, 0));
        VEGup.setText("Update");
        VEGup.addActionListener(this::VEGupActionPerformed);

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Delete");
        jButton2.addActionListener(this::jButton2ActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3)
                                    .addComponent(VEGtxtF)
                                    .addComponent(VEGWF)
                                    .addComponent(jLabel4)
                                    .addComponent(VEGQF, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE))
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(VEGup, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(177, 177, 177)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(162, 162, 162)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18))))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(VEGtxtF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(VEGWF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(VEGQF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(VEGup)
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(16, 16, 16))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Home dash = new Home();
        dash.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tblVegetableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVegetableMouseClicked
       int row = tblVegetable.getSelectedRow();

        selectedId = Integer.parseInt(
            tblVegetable.getValueAt(row, 0).toString());

        VEGtxtF.setText(
            tblVegetable.getValueAt(row, 1).toString());

        VEGWF.setText(
            tblVegetable.getValueAt(row, 2).toString());

        VEGQF.setText(
            tblVegetable.getValueAt(row, 3).toString());
        
    }//GEN-LAST:event_tblVegetableMouseClicked

    private void VEGtxtFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VEGtxtFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VEGtxtFActionPerformed

    private void VEGWFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VEGWFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VEGWFActionPerformed

    private void VEGQFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VEGQFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VEGQFActionPerformed

    private void VEGupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VEGupActionPerformed
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

        pst.setString(1, VEGtxtF.getText());
        pst.setDouble(2,
                Double.parseDouble(VEGWF.getText()));
        pst.setInt(3,
                Integer.parseInt(VEGQF.getText()));
        pst.setInt(4, selectedId);

        pst.executeUpdate();

        JOptionPane.showMessageDialog(this,
                "Updated!");

        loadTable();

    } catch (Exception e) {

        JOptionPane.showMessageDialog(this,
                e.getMessage());

    }
    }//GEN-LAST:event_VEGupActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
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

                VEGtxtF.setText("");
                VEGWF.setText("");
                VEGQF.setText("");

            }

        }

    } catch (Exception e) {

        JOptionPane.showMessageDialog(this,
                e.getMessage());

    }
    }//GEN-LAST:event_jButton2ActionPerformed


    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new VEGETABLEform().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField VEGQF;
    private javax.swing.JTextField VEGWF;
    private javax.swing.JTextField VEGtxtF;
    private javax.swing.JButton VEGup;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblVegetable;
    // End of variables declaration//GEN-END:variables
}
