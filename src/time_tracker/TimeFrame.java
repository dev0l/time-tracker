/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package time_tracker;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static time_tracker.MDS.getMySQLDataSource;

/**
 *
 * @author marcu
 */
public class TimeFrame extends javax.swing.JFrame {

    //MysqlDataSource ds = getMySQLDataSource();
    MysqlDataSource ds;
    Connection con;

    public TimeFrame() {
        initComponents();
        ds = getMySQLDataSource();
        try {
            con = ds.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(TimeFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        getUserDropdown();
        getProjectDropdown();
    }

    private void getUserDropdown() {
        String userQuery = "SELECT * FROM users";
        try ( PreparedStatement pst = con.prepareStatement(userQuery);  ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                userDropdown.addItem(rs.getString(4));
            }
        } catch (SQLException ex) {

            Logger lgr = Logger.getLogger(MDS.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        }
    }

    private void getProjectDropdown() {
        String projectQuery = "SELECT * FROM projects";
        try ( PreparedStatement pst = con.prepareStatement(projectQuery);  ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                projectDropdown.addItem(rs.getString(2));
            }
        } catch (SQLException ex) {

            Logger lgr = Logger.getLogger(MDS.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        }
    }

    /*private void timePicker() {
    String[] times = {"06:00", "07:00", "08:00"};
    pickTime.addItem(times)
}*/

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        searchField = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        userDropdown = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        projectDropdown = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        sTimeField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        eTimeField = new javax.swing.JTextField();
        eTimeBtn = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        searchField.setMaximumSize(new java.awt.Dimension(200, 24));
        searchField.setPreferredSize(new java.awt.Dimension(200, 24));
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        jToolBar1.add(searchField);

        searchBtn.setText("Search");
        searchBtn.setFocusable(false);
        searchBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        searchBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        jToolBar1.add(searchBtn);

        getContentPane().add(jToolBar1, java.awt.BorderLayout.PAGE_START);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setLabelFor(projectDropdown);
        jLabel1.setText("User");
        jLabel1.setToolTipText("User");

        userDropdown.setToolTipText("User");
        userDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userDropdownActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setLabelFor(projectDropdown);
        jLabel2.setText("Project");
        jLabel2.setToolTipText("User");

        projectDropdown.setToolTipText("User");

        jLabel3.setText("Start Time (YYYY-MM-DD HH:MM:SS)");

        sTimeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sTimeFieldActionPerformed(evt);
            }
        });

        jLabel4.setText("End Time (YYYY-MM-DD HH:MM:SS)");

        eTimeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eTimeFieldActionPerformed(evt);
            }
        });

        eTimeBtn.setText("Send");
        eTimeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eTimeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(userDropdown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(projectDropdown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(eTimeField)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sTimeField)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eTimeBtn)))
                .addContainerGap(295, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(projectDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(sTimeField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eTimeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(eTimeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Time Report", jPanel2);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);
        jTabbedPane1.getAccessibleContext().setAccessibleName("Report Time");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        //System.out.println("id:" + getLastId());
    }//GEN-LAST:event_searchBtnActionPerformed

    private void userDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userDropdownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userDropdownActionPerformed

    private void sTimeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sTimeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sTimeFieldActionPerformed

    private void eTimeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eTimeFieldActionPerformed

    }//GEN-LAST:event_eTimeFieldActionPerformed

    private void eTimeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eTimeBtnActionPerformed
        if (sTimeField.getText().isEmpty() || eTimeField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Please Enter Start Time and End Time");
        } else {
            String updateSTime = "INSERT INTO time_frame(start_time, end_time, users_id, projects_id) VALUES (?, ?, ?, ?)";
            try ( PreparedStatement pst = con.prepareStatement(updateSTime);) {

                pst.setString(1, sTimeField.getText());
                pst.setString(2, eTimeField.getText());
                int userId = userDropdown.getSelectedIndex() + 1;
                pst.setInt(3, userId);
                int projectId = projectDropdown.getSelectedIndex() + 1;
                pst.setInt(4, projectId);

                pst.executeUpdate();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, "Please Enter Time As: YYYY-MM-DD HH:MM:SS");
                Logger lgr = Logger.getLogger(MDS.class.getName());
                lgr.log(Level.SEVERE, ex.getMessage(), ex);
            }
        }
    }//GEN-LAST:event_eTimeBtnActionPerformed

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
            java.util.logging.Logger.getLogger(TimeFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TimeFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TimeFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TimeFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TimeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton eTimeBtn;
    private javax.swing.JTextField eTimeField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JComboBox<String> projectDropdown;
    private javax.swing.JTextField sTimeField;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchField;
    private javax.swing.JComboBox<String> userDropdown;
    // End of variables declaration//GEN-END:variables
}
