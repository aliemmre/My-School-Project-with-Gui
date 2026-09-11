package GUI;

import AdminProcess.AdminSystem;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AdminFrame extends javax.swing.JFrame {

    AdminSystem admin = new AdminSystem();

    public AdminFrame() {
        initComponents();
        admin = new AdminSystem();
        jComboBoxSelection.setSelectedItem("None");
        AdminProcess.AdminSystem.fillFilesWithLists();
        hideAllControls();
        jTextAreaOutputs.setEditable(false);

    }

    private void hideAllControls() {
        jButtonSearch.setVisible(false);
        jButtonDelete.setVisible(false);
        jButtonAdd.setVisible(false);
        jButtonList.setVisible(false);
        jButtonSearchOrDelete.setVisible(false);
        jLabelIDorName.setVisible(false);
        jTextFieldIDorName.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelIDorName = new javax.swing.JLabel();
        jButtonSearchOrDelete = new javax.swing.JButton();
        jTextFieldIDorName = new javax.swing.JTextField();
        jButtonList = new javax.swing.JButton();
        jButtonAdd = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonSearch = new javax.swing.JButton();
        jButtonMainMenu = new javax.swing.JButton();
        jComboBoxSelection = new javax.swing.JComboBox<>();
        jLabelDeneme = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaOutputs = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(20, 30, 50));

        jPanel1.setBackground(new java.awt.Color(20, 30, 50));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 215, 0), 2));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelIDorName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelIDorName.setForeground(new java.awt.Color(255, 255, 255));
        jLabelIDorName.setText("IdOrName");
        jPanel1.add(jLabelIDorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 118, -1));

        jButtonSearchOrDelete.setBackground(new java.awt.Color(255, 215, 0));
        jButtonSearchOrDelete.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        jButtonSearchOrDelete.setForeground(new java.awt.Color(20, 30, 50));
        jButtonSearchOrDelete.setText("Find/Delete");
        jButtonSearchOrDelete.setMargin(new java.awt.Insets(2, 5, 2, 5));
        jButtonSearchOrDelete.setPreferredSize(new java.awt.Dimension(72, 23));
        jButtonSearchOrDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchOrDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSearchOrDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));

        jTextFieldIDorName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDorNameActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldIDorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 132, -1));

        jButtonList.setBackground(new java.awt.Color(173, 216, 230));
        jButtonList.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonList.setForeground(new java.awt.Color(20, 30, 50));
        jButtonList.setText("List");
        jButtonList.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonList, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 70, 24));

        jButtonAdd.setBackground(new java.awt.Color(255, 215, 0));
        jButtonAdd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonAdd.setForeground(new java.awt.Color(20, 30, 50));
        jButtonAdd.setText("Add");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        jButtonDelete.setBackground(new java.awt.Color(255, 215, 0));
        jButtonDelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonDelete.setForeground(new java.awt.Color(20, 30, 50));
        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));

        jButtonSearch.setBackground(new java.awt.Color(255, 215, 0));
        jButtonSearch.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonSearch.setForeground(new java.awt.Color(20, 30, 50));
        jButtonSearch.setText("Search");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jButtonMainMenu.setBackground(new java.awt.Color(20, 30, 50));
        jButtonMainMenu.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jButtonMainMenu.setForeground(new java.awt.Color(255, 215, 0));
        jButtonMainMenu.setText("🏠");
        jButtonMainMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 215, 0), 2));
        jButtonMainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMainMenuActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonMainMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 510, 48, 50));

        jComboBoxSelection.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBoxSelection.setForeground(new java.awt.Color(20, 30, 50));
        jComboBoxSelection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<None>", "<List All Player Games>", "<List Leaderboard>", "<List All Player Informations>", "<Search Player Games>", "<List Player Questions>", "<Delete Player>", "<Delete Submit Results>" }));
        jComboBoxSelection.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 215, 0), 1, true));
        jComboBoxSelection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSelectionActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxSelection, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 274, -1));
        jPanel1.add(jLabelDeneme, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 76, -1, 24));

        jTextAreaOutputs.setBackground(new java.awt.Color(30, 45, 70));
        jTextAreaOutputs.setColumns(20);
        jTextAreaOutputs.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextAreaOutputs.setForeground(new java.awt.Color(255, 255, 255));
        jTextAreaOutputs.setRows(5);
        jScrollPane1.setViewportView(jTextAreaOutputs);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, -1, 290));

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 215, 0));
        jLabel1.setText("🔒 ADMIN CONTROL PANEL");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 26, 429, 56));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\alise\\OneDrive\\Desktop\\images-5.jpg")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 200, 150));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSearchOrDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchOrDeleteActionPerformed
        String selected = jComboBoxSelection.getSelectedItem().toString();

        if (selected.equals("<Search Player Games>")) {
            String name = jTextFieldIDorName.getText();
            String output1 = "Player Games\n"
                    + "Name  Score  Time\n";

            String output2 = output1 + AdminSystem.searchPlayerGames("", name, 0);

            if (!output1.equals(output2)) {
                jTextAreaOutputs.setText(output2);
            } else {
                jTextAreaOutputs.setText("Player Not Found");
            }
            jButtonSearchOrDelete.setVisible(false);
            jLabelIDorName.setVisible(false);
            jTextFieldIDorName.setVisible(false);

        } else if (selected.equals("<Delete Player>")) {

            try {
                 int Id = Integer.parseInt(jTextFieldIDorName.getText());
            
   
            String output = "";
            boolean check = AdminSystem.deletePlayer(Id);

            if (check) {
                output += "Player who has " + Id + " was deleted";
                jTextAreaOutputs.setText(output);
                jTextFieldIDorName.setText("");
            } else {
                output += "Player who has " + Id + " was not deleted,because he/she does not exist";
                jTextAreaOutputs.setText(output);
                jTextFieldIDorName.setText("");

            }} catch (Exception e) {
                jTextAreaOutputs.setText("Please enter Id as an integer");
                jTextFieldIDorName.setText("");
            }

        } else {
            jButtonSearchOrDelete.setVisible(false);
            jLabelIDorName.setVisible(false);
            jTextFieldIDorName.setVisible(false);
        }

        {
        }    }//GEN-LAST:event_jButtonSearchOrDeleteActionPerformed

    private void jComboBoxSelectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSelectionActionPerformed
        String selected = jComboBoxSelection.getSelectedItem().toString();
        if (selected.equals("<List All Player Games>")) {
            jTextAreaOutputs.setText("");
            jButtonSearch.setVisible(false);
            jButtonDelete.setVisible(false);
            jButtonAdd.setVisible(false);
            jButtonList.setVisible(true);
            jButtonSearchOrDelete.setVisible(false);
            jLabelIDorName.setVisible(false);
            jTextFieldIDorName.setVisible(false);

        } else if (selected.equals("<List All Player Informations>")) {
            jTextAreaOutputs.setText("");
            jButtonSearch.setVisible(false);
            jButtonDelete.setVisible(false);
            jButtonAdd.setVisible(false);
            jButtonList.setVisible(true);
            jButtonSearchOrDelete.setVisible(false);
            jLabelIDorName.setVisible(false);
            jTextFieldIDorName.setVisible(false);

        } else if (selected.equals("<Search Player Games>")) {
            jTextAreaOutputs.setText("");
            jButtonSearch.setVisible(true);
            jButtonDelete.setVisible(false);
            jButtonAdd.setVisible(false);
            jButtonList.setVisible(false);

        } else if (selected.equals("<Delete Player>")) {
            jTextAreaOutputs.setText("");
            jTextFieldIDorName.setText("");
            jButtonSearch.setVisible(false);
            jButtonDelete.setVisible(false);
            jButtonAdd.setVisible(false);
            jButtonList.setVisible(true);
            jLabelIDorName.setText("ID:");
            jLabelIDorName.setVisible(true);
            jButtonSearchOrDelete.setText("Delete");
            jButtonSearchOrDelete.setVisible(true);
            jTextFieldIDorName.setVisible(true);

        } else if (selected.equals("<List Player Questions>")) {
            jTextAreaOutputs.setText("");
            jButtonSearch.setVisible(false);
            jButtonDelete.setVisible(false);
            jButtonAdd.setVisible(true);
            jButtonList.setVisible(true);
            jButtonSearchOrDelete.setVisible(false);
            jLabelIDorName.setVisible(false);
            jTextFieldIDorName.setVisible(false);

        } else if (selected.equals("<Delete Submit Results>")) {
            jTextAreaOutputs.setText("");
            jButtonSearch.setVisible(false);
            jButtonDelete.setVisible(true);
            jButtonAdd.setVisible(false);
            jButtonList.setVisible(true);
            jButtonSearchOrDelete.setVisible(false);
            jLabelIDorName.setVisible(false);
            jTextFieldIDorName.setVisible(false);

        } else if (selected.equals("<List Leaderboard>")) {
            jTextAreaOutputs.setText("");
            jButtonSearch.setVisible(false);
            jButtonDelete.setVisible(false);
            jButtonAdd.setVisible(false);
            jButtonList.setVisible(true);
            jButtonSearchOrDelete.setVisible(false);
            jLabelIDorName.setVisible(false);
            jTextFieldIDorName.setVisible(false);

        } else {
            jTextAreaOutputs.setText("");
            jComboBoxSelection.setSelectedItem("None");
            jButtonSearch.setVisible(false);
            jButtonDelete.setVisible(false);
            jButtonAdd.setVisible(false);
            jButtonList.setVisible(false);
            jButtonSearchOrDelete.setVisible(false);
            jLabelIDorName.setVisible(false);
            jTextFieldIDorName.setVisible(false);
        }
    }//GEN-LAST:event_jComboBoxSelectionActionPerformed

    private void jButtonListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListActionPerformed
        String selected = jComboBoxSelection.getSelectedItem().toString();

        if (selected.equals("<List All Player Informations>")) {
            String output = "All Player Informations\n";
            output += AdminSystem.listofAllPlayersInformation("", 0);
            jTextAreaOutputs.setText(output);
        } else if (selected.equals("<List All Player Games>")) {
            String output = "Player Results\n NAME   SCORE  TIME\n";
            output += AdminSystem.listOfAllPlayerGames("", 0);
            jTextAreaOutputs.setText(output);
        } else if (selected.equals("<List Player Questions>")) {
            String output = "Player Questions\n";
            output += AdminSystem.listOfPlayerQuestions("", 0);
            jTextAreaOutputs.setText(output);
        } else if (selected.equals("<Delete Player>")) {
            String output = "All Player Informations\n";
            output += AdminSystem.listofAllPlayersInformation("", 0);
            jTextAreaOutputs.setText(output);

        } else if (selected.equals("<Delete Submit Results>")) {
            String output = "NAME  SCORE  TIME\n";
            output += AdminSystem.listOfAllPlayerGames("", 0);
            jTextAreaOutputs.setText(output);

        } else if (selected.equals("<List Leaderboard>")) {
            String output = "Leaderboards for this week\nNAME  SCORE  TIME\n";
            output += AdminSystem.listLeaderBoard("", 0);
            jTextAreaOutputs.setText(output);

        }
    }//GEN-LAST:event_jButtonListActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        try {
            AdminSystem.deleteSubmitsResult();
            jTextAreaOutputs.setText("Deleted submit results");
        } catch (IOException ex) {
            Logger.getLogger(AdminFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        String selected = jComboBoxSelection.getSelectedItem().toString();

        if (selected.equals("<List Player Questions>")) {

            int response = JOptionPane.showConfirmDialog(this,
                    "Do you want to add all questions?",
                    "Do you approve?",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);

            if (response == JOptionPane.YES_OPTION) {
                try {
                    boolean result = AdminSystem.addUsersQuestion();

                    if (result) {
                        JOptionPane.showMessageDialog(this, "All question(s) added succesfully!");
                        jTextAreaOutputs.setText("");
                    } else {
                        JOptionPane.showMessageDialog(this, "There is no question to add.");
                    }
                } catch (IOException ex) {
                    Logger.getLogger(AdminFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        jLabelIDorName.setText("Name:");
        jButtonSearchOrDelete.setText("Find");
        jLabelIDorName.setVisible(true);
        jButtonSearchOrDelete.setVisible(true);
        jTextFieldIDorName.setVisible(true);
        jTextFieldIDorName.setText("");
     }//GEN-LAST:event_jButtonSearchActionPerformed

    private void jTextFieldIDorNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDorNameActionPerformed


    }//GEN-LAST:event_jTextFieldIDorNameActionPerformed

    private void jButtonMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMainMenuActionPerformed
        MainMenuFrame frame = new MainMenuFrame();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonMainMenuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonList;
    private javax.swing.JButton jButtonMainMenu;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JButton jButtonSearchOrDelete;
    private javax.swing.JComboBox<String> jComboBoxSelection;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelDeneme;
    private javax.swing.JLabel jLabelIDorName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaOutputs;
    private javax.swing.JTextField jTextFieldIDorName;
    // End of variables declaration//GEN-END:variables
}
