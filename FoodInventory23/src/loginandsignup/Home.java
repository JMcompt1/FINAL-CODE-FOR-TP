package loginandsignup;

import java.sql.*;
import javax.swing.*;

public class Home extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Home.class.getName());

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        setLocationRelativeTo(null);
        COMBOboxH.removeAllItems();

        COMBOboxH.addItem("MEAT");
        COMBOboxH.addItem("FISH");
        COMBOboxH.addItem("VEGETABLE");
    }
    
     private void saveData() {

        try {
            Connection con = DBConnection.connect();

            String sql = "INSERT INTO items(name, weight, quantity, category) VALUES (?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, NameTxtF.getText());
            pst.setDouble(2, Double.parseDouble(WEIGHTtxtF.getText()));
            pst.setInt(3, Integer.parseInt(QUANTxtF.getText()));
            pst.setString(4, COMBOboxH.getSelectedItem().toString());

            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "Saved!");
            } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            }
     }
            
     
     private void updateData() {

        try {
            Connection con = DBConnection.connect();

            String sql = "UPDATE items SET weight=?, quantity=?, category=? WHERE name=?";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setDouble(1, Double.parseDouble(WEIGHTtxtF.getText()));
            pst.setInt(2, Integer.parseInt(QUANTxtF.getText()));
            pst.setString(3, COMBOboxH.getSelectedItem().toString());
            pst.setString(4, NameTxtF.getText());

            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "Updated!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
     
     private void reset() {
        NameTxtF.setText("");
        WEIGHTtxtF.setText("");
        QUANTxtF.setText("");
        COMBOboxH.setSelectedIndex(0);
    }
            
            
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        NameTxtF = new javax.swing.JTextField();
        WEIGHTtxtF = new javax.swing.JTextField();
        QUANTxtF = new javax.swing.JTextField();
        COMBOboxH = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        SAVEbtnH = new javax.swing.JButton();
        UpBtnH = new javax.swing.JButton();
        RESETbtnF = new javax.swing.JButton();
        FISHbutt = new javax.swing.JButton();
        FISHbutt1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        MEATbutt = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jTree1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 600));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("NAME");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("WEIGTH (KG)");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("QUANTITY");

        NameTxtF.setBackground(new java.awt.Color(255, 255, 255));
        NameTxtF.setForeground(new java.awt.Color(0, 0, 0));
        NameTxtF.addActionListener(this::NameTxtFActionPerformed);

        WEIGHTtxtF.setBackground(new java.awt.Color(255, 255, 255));
        WEIGHTtxtF.setForeground(new java.awt.Color(0, 0, 0));
        WEIGHTtxtF.addActionListener(this::WEIGHTtxtFActionPerformed);

        QUANTxtF.setBackground(new java.awt.Color(255, 255, 255));
        QUANTxtF.setForeground(new java.awt.Color(0, 0, 0));
        QUANTxtF.addActionListener(this::QUANTxtFActionPerformed);

        COMBOboxH.setBackground(new java.awt.Color(255, 255, 255));
        COMBOboxH.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        COMBOboxH.setForeground(new java.awt.Color(0, 0, 0));
        COMBOboxH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MEAT", "FISH", "VEGETABLE" }));
        COMBOboxH.addActionListener(this::COMBOboxHActionPerformed);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("CATEGORY");

        SAVEbtnH.setBackground(new java.awt.Color(204, 204, 204));
        SAVEbtnH.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SAVEbtnH.setForeground(new java.awt.Color(0, 0, 0));
        SAVEbtnH.setText("SAVE");
        SAVEbtnH.addActionListener(this::SAVEbtnHActionPerformed);

        UpBtnH.setBackground(new java.awt.Color(204, 204, 204));
        UpBtnH.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        UpBtnH.setForeground(new java.awt.Color(0, 0, 0));
        UpBtnH.setText("UPDATE");
        UpBtnH.addActionListener(this::UpBtnHActionPerformed);

        RESETbtnF.setBackground(new java.awt.Color(204, 204, 204));
        RESETbtnF.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        RESETbtnF.setForeground(new java.awt.Color(0, 0, 0));
        RESETbtnF.setText("RESET");
        RESETbtnF.addActionListener(this::RESETbtnFActionPerformed);

        FISHbutt.setBackground(new java.awt.Color(204, 204, 204));
        FISHbutt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        FISHbutt.setForeground(new java.awt.Color(0, 0, 0));
        FISHbutt.setText("FISH");
        FISHbutt.addActionListener(this::FISHbuttActionPerformed);

        FISHbutt1.setBackground(new java.awt.Color(204, 204, 204));
        FISHbutt1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        FISHbutt1.setForeground(new java.awt.Color(0, 0, 0));
        FISHbutt1.setText("VEGETABLE");
        FISHbutt1.addActionListener(this::FISHbutt1ActionPerformed);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("ADD STOCK");

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 51, 51));
        jButton1.setText("CLOSE");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        MEATbutt.setBackground(new java.awt.Color(204, 204, 204));
        MEATbutt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MEATbutt.setForeground(new java.awt.Color(0, 0, 0));
        MEATbutt.setText("MEAT");
        MEATbutt.addActionListener(this::MEATbuttActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(NameTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WEIGHTtxtF, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(QUANTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(COMBOboxH, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(SAVEbtnH, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(UpBtnH, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RESETbtnF, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(MEATbutt)
                                    .addGap(47, 47, 47)
                                    .addComponent(FISHbutt1)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(FISHbutt))))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(88, 88, 88))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel5)
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NameTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(WEIGHTtxtF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(QUANTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(COMBOboxH, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SAVEbtnH)
                    .addComponent(RESETbtnF)
                    .addComponent(UpBtnH))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FISHbutt)
                    .addComponent(FISHbutt1)
                    .addComponent(MEATbutt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(23, 23, 23))
        );

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/LOGO (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(302, 302, 302)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 340, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NameTxtFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameTxtFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameTxtFActionPerformed

    private void WEIGHTtxtFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WEIGHTtxtFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WEIGHTtxtFActionPerformed

    private void QUANTxtFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QUANTxtFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QUANTxtFActionPerformed

    private void SAVEbtnHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SAVEbtnHActionPerformed
         saveData();
    }//GEN-LAST:event_SAVEbtnHActionPerformed

    private void UpBtnHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpBtnHActionPerformed
        updateData();
    }//GEN-LAST:event_UpBtnHActionPerformed

    private void RESETbtnFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESETbtnFActionPerformed
         reset();
    }//GEN-LAST:event_RESETbtnFActionPerformed

    private void COMBOboxHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_COMBOboxHActionPerformed

    }//GEN-LAST:event_COMBOboxHActionPerformed

    private void FISHbuttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FISHbuttActionPerformed
         new FISHform().setVisible(true);
         dispose();
    }//GEN-LAST:event_FISHbuttActionPerformed

    private void MEATbuttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MEATbuttActionPerformed
        new MEATform().setVisible(true);
        dispose();
    }//GEN-LAST:event_MEATbuttActionPerformed

    private void FISHbutt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FISHbutt1ActionPerformed
        new VEGETABLEform().setVisible(true);
        dispose();
    }//GEN-LAST:event_FISHbutt1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(() -> new Home().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> COMBOboxH;
    private javax.swing.JButton FISHbutt;
    private javax.swing.JButton FISHbutt1;
    private javax.swing.JButton MEATbutt;
    private javax.swing.JTextField NameTxtF;
    private javax.swing.JTextField QUANTxtF;
    private javax.swing.JButton RESETbtnF;
    private javax.swing.JButton SAVEbtnH;
    private javax.swing.JButton UpBtnH;
    private javax.swing.JTextField WEIGHTtxtF;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables
}
