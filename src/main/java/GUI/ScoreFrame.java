package GUI;

import Game.*;
import PlayerInformation.*;
import java.io.IOException;
import javax.swing.JOptionPane;

public class ScoreFrame extends javax.swing.JFrame {

    private Player player;

    public ScoreFrame(Player player) throws IOException {
        initComponents();

        this.player = player;

        jLabelAnswer.setVisible(false);
        jLabelQuestion.setVisible(false);
        jTextFieldAnswer.setVisible(false);
        jTextFieldQuestion.setVisible(false);
        jButtonAdd.setVisible(false);

        jLabelScore.setText(player.toString());

        Submit sb = new Submit(player);
        sb.writeOnScoreboard();
        String output = sb.writeOnLeaderboard();
        jTextAreaScores.setText(output);
        jTextAreaScores.setEditable(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaScores = new javax.swing.JTextArea();
        jLabelScore = new javax.swing.JLabel();
        jButtonAddQuestion = new javax.swing.JButton();
        jTextFieldQuestion = new javax.swing.JTextField();
        jTextFieldAnswer = new javax.swing.JTextField();
        jLabelAnswer = new javax.swing.JLabel();
        jLabelQuestion = new javax.swing.JLabel();
        jButtonAdd = new javax.swing.JButton();
        jButtonReturnToMenu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(20, 30, 50));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 215, 0), 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextAreaScores.setBackground(new java.awt.Color(30, 45, 70));
        jTextAreaScores.setColumns(20);
        jTextAreaScores.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextAreaScores.setForeground(new java.awt.Color(255, 255, 255));
        jTextAreaScores.setRows(5);
        jScrollPane1.setViewportView(jTextAreaScores);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 308, 272));

        jLabelScore.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelScore.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabelScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(677, 92, 295, 59));

        jButtonAddQuestion.setBackground(new java.awt.Color(255, 215, 0));
        jButtonAddQuestion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonAddQuestion.setForeground(new java.awt.Color(20, 30, 50));
        jButtonAddQuestion.setText("Add Question");
        jButtonAddQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddQuestionActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAddQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 98, -1, -1));

        jTextFieldQuestion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 215, 0)));
        jTextFieldQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuestionActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 334, -1));

        jTextFieldAnswer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 215, 0)));
        jPanel1.add(jTextFieldAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, 334, -1));

        jLabelAnswer.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabelAnswer.setForeground(new java.awt.Color(255, 215, 0));
        jLabelAnswer.setText("Answer");
        jPanel1.add(jLabelAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 76, -1));

        jLabelQuestion.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabelQuestion.setForeground(new java.awt.Color(255, 215, 0));
        jLabelQuestion.setText("Question");
        jPanel1.add(jLabelQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 76, -1));

        jButtonAdd.setBackground(new java.awt.Color(255, 215, 0));
        jButtonAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonAdd.setForeground(new java.awt.Color(20, 30, 50));
        jButtonAdd.setText("Add");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        jButtonReturnToMenu.setBackground(new java.awt.Color(20, 30, 50));
        jButtonReturnToMenu.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jButtonReturnToMenu.setForeground(new java.awt.Color(255, 215, 0));
        jButtonReturnToMenu.setText("🏠");
        jButtonReturnToMenu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 215, 0), 2, true));
        jButtonReturnToMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReturnToMenuActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonReturnToMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, 47, 52));

        jLabel1.setBackground(new java.awt.Color(20, 30, 50));
        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 215, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("🏆 LEADERBOARD");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 36, 329, 44));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddQuestionActionPerformed
        jTextFieldAnswer.setVisible(true);
        jTextFieldQuestion.setVisible(true);
        jLabelAnswer.setVisible(true);
        jLabelQuestion.setVisible(true);
        jButtonAdd.setVisible(true);


    }//GEN-LAST:event_jButtonAddQuestionActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        String question = jTextFieldQuestion.getText().trim();
        String answer = jTextFieldAnswer.getText().trim();
        if (question.isEmpty() || answer.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all fields!");
            return;
        }
        AddQuestionFromUser.addQuestion(question, answer, player.getId());
        JOptionPane.showMessageDialog(this, "Your question sended to the Admin");
        jTextFieldQuestion.setText("");
        jTextFieldAnswer.setText("");
        jTextFieldAnswer.setVisible(false);
        jTextFieldQuestion.setVisible(false);
        jLabelAnswer.setVisible(false);
        jLabelQuestion.setVisible(false);
        jButtonAdd.setVisible(false);


    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonReturnToMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReturnToMenuActionPerformed
        MainMenuFrame frame = new MainMenuFrame();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonReturnToMenuActionPerformed

    private void jTextFieldQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuestionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldQuestionActionPerformed



   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonAddQuestion;
    private javax.swing.JButton jButtonReturnToMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAnswer;
    private javax.swing.JLabel jLabelQuestion;
    private javax.swing.JLabel jLabelScore;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaScores;
    private javax.swing.JTextField jTextFieldAnswer;
    private javax.swing.JTextField jTextFieldQuestion;
    // End of variables declaration//GEN-END:variables
}
