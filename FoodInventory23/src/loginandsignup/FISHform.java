package loginandsignup;


import java.sql.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class FISHform extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FISHform.class.getName());

    private int selectedId = -1;
    
    public FISHform() {
        initComponents();
        setLocationRelativeTo(null);
        loadTable();
    }
        void loadTable() {

        
         try {

        Connection con = DBConnection.connect();

        String sql =
                "SELECT id,name,weight,quantity FROM items WHERE category='FISH'";

        PreparedStatement pst =
                con.prepareStatement(sql);

        ResultSet rs = pst.executeQuery();

        DefaultTableModel model =
                (DefaultTableModel) tblFish.getModel();

        model.setRowCount(0);

        while (rs.next()) {

            model.addRow(new Object[]{
                rs.getInt("id"),
                rs.getString("name"),
                rs.getDouble("weight"),
                rs.getInt("quantity")
            });

        }

        tblFish.getColumnModel().getColumn(0).setMinWidth(0);
        tblFish.getColumnModel().getColumn(0).setMaxWidth(0);
        tblFish.getColumnModel().getColumn(0).setWidth(0);

    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        FISHtxtF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        FISHWF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        FISHQF = new javax.swing.JTextField();
        FISHDbtn = new javax.swing.JButton();
        FISHbtnUP = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblFish = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 600));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("FISH");

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("BACK");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("NAME");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("WEIGHT (KG)");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("QUANTITY");

        FISHDbtn.setBackground(new java.awt.Color(204, 204, 204));
        FISHDbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        FISHDbtn.setForeground(new java.awt.Color(0, 0, 0));
        FISHDbtn.setText("Delete");
        FISHDbtn.addActionListener(this::FISHDbtnActionPerformed);

        FISHbtnUP.setBackground(new java.awt.Color(204, 204, 204));
        FISHbtnUP.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        FISHbtnUP.setForeground(new java.awt.Color(0, 0, 0));
        FISHbtnUP.setText("Update");
        FISHbtnUP.addActionListener(this::FISHbtnUPActionPerformed);

        tblFish.setBackground(new java.awt.Color(255, 255, 255));
        tblFish.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "ID", "NAME", "WEIGHT (KG)", "QUANTITY"
            }
        ));
        tblFish.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFishMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblFish);
        if (tblFish.getColumnModel().getColumnCount() > 0) {
            tblFish.getColumnModel().getColumn(0).setResizable(false);
            tblFish.getColumnModel().getColumn(1).setResizable(false);
            tblFish.getColumnModel().getColumn(2).setResizable(false);
            tblFish.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FISHWF)
                    .addComponent(FISHtxtF)
                    .addComponent(FISHQF)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(FISHbtnUP, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 182, Short.MAX_VALUE)
                        .addComponent(FISHDbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(348, 348, 348)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(442, 442, 442)
                        .addComponent(jButton1)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FISHtxtF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FISHWF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(FISHQF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(FISHbtnUP)
                                    .addComponent(FISHDbtn))))
                        .addGap(24, 24, 24))))
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

    private void FISHbtnUPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FISHbtnUPActionPerformed
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

        pst.setString(1, FISHtxtF.getText());
        pst.setDouble(2,
                Double.parseDouble(FISHWF.getText()));
        pst.setInt(3,
                Integer.parseInt(FISHQF.getText()));
        pst.setInt(4, selectedId);

        pst.executeUpdate();

        JOptionPane.showMessageDialog(this,
                "Updated!");

        loadTable();

    } catch (Exception e) {

        JOptionPane.showMessageDialog(this,
                e.getMessage());

    }
    }//GEN-LAST:event_FISHbtnUPActionPerformed

    private void FISHDbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FISHDbtnActionPerformed
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

                FISHtxtF.setText("");
                FISHWF.setText("");
                FISHQF.setText("");

            }

        }

    } catch (Exception e) {

        JOptionPane.showMessageDialog(this,
                e.getMessage());

    }
    }//GEN-LAST:event_FISHDbtnActionPerformed

    private void tblFishMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFishMouseClicked
        int row = tblFish.getSelectedRow();

        selectedId = Integer.parseInt(
            tblFish.getValueAt(row, 0).toString());

        FISHtxtF.setText(
            tblFish.getValueAt(row, 1).toString());

        FISHWF.setText(
            tblFish.getValueAt(row, 2).toString());

        FISHQF.setText(
            tblFish.getValueAt(row, 3).toString());
        
    }//GEN-LAST:event_tblFishMouseClicked

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
        java.awt.EventQueue.invokeLater(() -> new FISHform().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FISHDbtn;
    private javax.swing.JTextField FISHQF;
    private javax.swing.JTextField FISHWF;
    private javax.swing.JButton FISHbtnUP;
    private javax.swing.JTextField FISHtxtF;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblFish;
    // End of variables declaration//GEN-END:variables
}
