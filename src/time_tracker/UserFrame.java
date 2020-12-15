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
import net.proteanit.sql.DbUtils;
import static time_tracker.MDS.getMySQLDataSource;

/**
 *
 * @author marcu
 */
public class UserFrame extends javax.swing.JFrame {

    //MysqlDataSource ds = getMySQLDataSource();
    MysqlDataSource ds;
    Connection con;

    public UserFrame() {
        initComponents();

        ds = getMySQLDataSource();
        try {
            con = ds.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(UserFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        getUserDropdown();
        getProjectDropdown();
        //updateUserTable();
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

    private void updateUserTable() {
        String usersQuery = "SELECT * FROM users";
        try ( PreparedStatement pst = con.prepareStatement(usersQuery);  ResultSet rs = pst.executeQuery()) {

            userTable.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException ex) {

            Logger lgr = Logger.getLogger(MDS.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        searchField = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        Save = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        userDropdown = new javax.swing.JComboBox<>();
        projectDropdown = new javax.swing.JComboBox<>();
        JTabbedPane1 = new javax.swing.JTabbedPane();
        timeReport = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        uName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        uEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        uStatus = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        sTimeField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        eTimeField = new javax.swing.JTextField();
        insTimeBtn = new javax.swing.JButton();
        projectReport = new javax.swing.JPanel();
        overview = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        projectTable = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 420));

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

        Edit.setText("Edit");
        Edit.setFocusable(false);
        Edit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Edit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(Edit);

        Save.setText("Save");
        Save.setFocusable(false);
        Save.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Save.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(Save);

        Clear.setText("Clear");
        Clear.setFocusable(false);
        Clear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Clear.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(Clear);

        userDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select User" }));
        userDropdown.setToolTipText("User");
        userDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userDropdownActionPerformed(evt);
            }
        });
        jToolBar1.add(userDropdown);

        projectDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Project" }));
        projectDropdown.setToolTipText("User");
        projectDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projectDropdownActionPerformed(evt);
            }
        });
        jToolBar1.add(projectDropdown);

        getContentPane().add(jToolBar1, java.awt.BorderLayout.PAGE_START);

        jLabel1.setText("User:");

        uName.setEditable(false);
        uName.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Email:");

        uEmail.setEditable(false);
        uEmail.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("Status:");

        uStatus.setEditable(false);
        uStatus.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setText("Start Time (YYYY-MM-DD HH:MM:SS)");

        sTimeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sTimeFieldActionPerformed(evt);
            }
        });

        jLabel5.setText("End Time (YYYY-MM-DD HH:MM:SS)");

        eTimeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eTimeFieldActionPerformed(evt);
            }
        });

        insTimeBtn.setText("Send");
        insTimeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insTimeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout timeReportLayout = new javax.swing.GroupLayout(timeReport);
        timeReport.setLayout(timeReportLayout);
        timeReportLayout.setHorizontalGroup(
            timeReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(timeReportLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(timeReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(timeReportLayout.createSequentialGroup()
                        .addGroup(timeReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(timeReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sTimeField)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(eTimeField, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(insTimeBtn))
                    .addComponent(uName, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(495, Short.MAX_VALUE))
        );
        timeReportLayout.setVerticalGroup(
            timeReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, timeReportLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(uName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(uEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(uStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(timeReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(timeReportLayout.createSequentialGroup()
                        .addComponent(sTimeField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eTimeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(insTimeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        JTabbedPane1.addTab("Time Report", timeReport);

        javax.swing.GroupLayout projectReportLayout = new javax.swing.GroupLayout(projectReport);
        projectReport.setLayout(projectReportLayout);
        projectReportLayout.setHorizontalGroup(
            projectReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        projectReportLayout.setVerticalGroup(
            projectReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 335, Short.MAX_VALUE)
        );

        JTabbedPane1.addTab("Project Report", projectReport);

        jLabel6.setText("User");

        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        userTable.setPreferredSize(new java.awt.Dimension(550, 80));
        jScrollPane3.setViewportView(userTable);

        jLabel8.setText("Project");

        projectTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        projectTable.setPreferredSize(new java.awt.Dimension(550, 80));
        jScrollPane4.setViewportView(projectTable);

        javax.swing.GroupLayout overviewLayout = new javax.swing.GroupLayout(overview);
        overview.setLayout(overviewLayout);
        overviewLayout.setHorizontalGroup(
            overviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(overviewLayout.createSequentialGroup()
                .addGroup(overviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(overviewLayout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addGroup(overviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(overviewLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(0, 513, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, overviewLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(overviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(overviewLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(527, 527, 527))
                            .addComponent(jScrollPane3))))
                .addContainerGap())
        );
        overviewLayout.setVerticalGroup(
            overviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, overviewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        JTabbedPane1.addTab("Overview", overview);

        getContentPane().add(JTabbedPane1, java.awt.BorderLayout.CENTER);
        JTabbedPane1.getAccessibleContext().setAccessibleName("Report Time");

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
        if (searchField.getText().isEmpty()) {
            updateUserTable();
        } else {
            JOptionPane.showMessageDialog(rootPane, "You searched for " + searchField.getText());
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void userDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userDropdownActionPerformed
        String userEmail = userDropdown.getSelectedItem().toString();
        String userQuery = "SELECT * FROM users WHERE email = ?";
        try ( PreparedStatement pst = con.prepareStatement(userQuery);) {

            pst.setString(1, userEmail);
            ResultSet rs = pst.executeQuery();

            /*while (rs.next()) {

            }*/
            userTable.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException ex) {

            Logger lgr = Logger.getLogger(MDS.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        }
    }//GEN-LAST:event_userDropdownActionPerformed

    private void projectDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projectDropdownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_projectDropdownActionPerformed

    private void sTimeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sTimeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sTimeFieldActionPerformed

    private void eTimeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eTimeFieldActionPerformed

    }//GEN-LAST:event_eTimeFieldActionPerformed

    private void insTimeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insTimeBtnActionPerformed
        if (sTimeField.getText().isEmpty() || eTimeField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Please Enter Start Time and End Time");
        } else if (sTimeField.getText().equals(eTimeField.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Start -and End Time can not have the same value");
        } else {
            String updateTimes = "INSERT INTO time_frame(start_time, end_time, users_id, projects_id) VALUES (?, ?, ?, ?)";
            try ( PreparedStatement pst = con.prepareStatement(updateTimes);) {

                pst.setString(1, sTimeField.getText());
                pst.setString(2, eTimeField.getText());
                int userId = userDropdown.getSelectedIndex() + 1;
                pst.setInt(3, userId);
                int projectId = projectDropdown.getSelectedIndex() + 1;
                pst.setInt(4, projectId);

                pst.executeUpdate();

                JOptionPane.showMessageDialog(rootPane, "Time Reported");

                sTimeField.setText("");
                eTimeField.setText("");

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, "Please Enter Time As: YYYY-MM-DD HH:MM:SS");
                Logger lgr = Logger.getLogger(MDS.class.getName());
                lgr.log(Level.SEVERE, ex.getMessage(), ex);
            }
        }
    }//GEN-LAST:event_insTimeBtnActionPerformed

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
            java.util.logging.Logger.getLogger(UserFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JButton Edit;
    private javax.swing.JTabbedPane JTabbedPane1;
    private javax.swing.JButton Save;
    private javax.swing.JTextField eTimeField;
    private javax.swing.JButton insTimeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JPanel overview;
    private javax.swing.JComboBox<String> projectDropdown;
    private javax.swing.JPanel projectReport;
    private javax.swing.JTable projectTable;
    private javax.swing.JTextField sTimeField;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchField;
    private javax.swing.JPanel timeReport;
    private javax.swing.JTextField uEmail;
    private javax.swing.JTextField uName;
    private javax.swing.JTextField uStatus;
    private javax.swing.JComboBox<String> userDropdown;
    private javax.swing.JTable userTable;
    // End of variables declaration//GEN-END:variables
}
