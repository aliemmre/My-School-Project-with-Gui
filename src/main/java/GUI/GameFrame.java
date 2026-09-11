package GUI;

import Game.Player;
import LengthOfWords.AllWords;
import LengthOfWords.EightLettersWords;
import LengthOfWords.FiveLettersWords;
import LengthOfWords.FourLettersWords;
import LengthOfWords.NineLettersWords;
import LengthOfWords.SevenLettersWords;
import LengthOfWords.SixLettersWords;
import LengthOfWords.TenLettersWords;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author alise
 */
public class GameFrame extends javax.swing.JFrame {

    private Timer gameTimer;
    private Timer estimateTimer;

    private int questionIndex = 0;
    private List<AllWords> lengthOfWords = new ArrayList<>();
    private static Player player;
    int howManyGotLetter = 0;

    public GameFrame(Player player) throws IOException {

        initComponents();
        jTextFieldUserAnswer.setVisible(false);
        jButtonCheckAnswer.setVisible(false);
        jLabelEstimateTime.setVisible(false);
        this.player = player;
        loadCategories();
        loadQuestionAndAnswer();
        updateScreen();
        startGameTimer();
    }

    private void startGameTimer() {
        if (gameTimer != null) {
            gameTimer.stop();
        }
        jLabelTime.setText("Time: " + player.getEngine().getTimeManager().getTotalTime());
        gameTimer = new Timer(1000, e -> {
            player.getEngine().getTimeManager().tickTotal();

            jLabelTime.setText(
                    "Time: " + player.getEngine().getTimeManager().getTotalTime()
            );

            if (player.getEngine().getTimeManager().isTimeOver()) {
                gameTimer.stop();
                try {
                    endGame();
                } catch (IOException ex) {
                    Logger.getLogger(GameFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        gameTimer.start();
    }

    private void startEstimateTimer() {
        gameTimer.stop(); // Ana süreyi dondur

        player.getEngine().getTimeManager().startEstimate();
        jLabelEstimateTime.setText("" + player.getEngine().getTimeManager().getEstimateTime());
        jLabelEstimateTime.setVisible(true);

        if (estimateTimer != null) {
            estimateTimer.stop();
        }

        estimateTimer = new Timer(1000, e -> {
            player.getEngine().getTimeManager().tickEstimate();

            jLabelEstimateTime.setText("" + player.getEngine().getTimeManager().getEstimateTime());

            if (player.getEngine().getTimeManager().isEstimateOver()) {
                estimateTimer.stop();
                handleEstimateFail(); // Süre biterse ceza ve geçiş
                jButtonPass.setEnabled(true);
                jButtonTakeLetter.setEnabled(true);
            }
        });
        estimateTimer.start();
    }

    private void handleEstimateFail() {

        player.getEngine().removeScore(howManyGotLetter);

        JOptionPane.showMessageDialog(this, "Time is up! Points deducted.");
        char[] arr = player.getEngine().getCurrent();
        String ans = player.getEngine().getAnswer();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ans.charAt(i);
        }
            jLabelHiddenAnswer.setText(player.getEngine().getPrintVisibleState());

        jLabelEstimateTime.setText("");
        jLabelEstimateTime.setVisible(false);
        jTextFieldUserAnswer.setVisible(false);
        jButtonCheckAnswer.setVisible(false);

        Timer timer = new Timer(1500, e -> {
            questionIndex++;
            try {
                loadQuestionAndAnswer();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            updateScreen();
            gameTimer.start();
        });
        timer.setRepeats(false);
        timer.start();
    }

    public void loadCategories() throws IOException {
        lengthOfWords.add(new FourLettersWords());
        lengthOfWords.add(new FiveLettersWords());
        lengthOfWords.add(new SixLettersWords());
        lengthOfWords.add(new SevenLettersWords());
        lengthOfWords.add(new EightLettersWords());
        lengthOfWords.add(new NineLettersWords());
        lengthOfWords.add(new TenLettersWords());
    }

    public void loadQuestionAndAnswer() throws IOException {
        if (questionIndex < lengthOfWords.size()) {
            howManyGotLetter = 0;

            String randomWord = lengthOfWords.get(questionIndex).getRandomWord().toLowerCase();
            String question = lengthOfWords.get(questionIndex).getQuestion();
            jLabelQuestion.setText(question);

            player.getEngine().setNewWord(randomWord);
            String output = player.getEngine().getPrintNoVisibleState();
            jLabelHiddenAnswer.setText(output);
            updateScreen();
        } else {
            endGame();

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelGame = new javax.swing.JPanel();
        jButtonPass = new javax.swing.JButton();
        jButtonTakeLetter = new javax.swing.JButton();
        jButtonEstimate = new javax.swing.JButton();
        jLabelScore = new javax.swing.JLabel();
        jLabelReachablePoint = new javax.swing.JLabel();
        jLabelTime = new javax.swing.JLabel();
        jButtonExit = new javax.swing.JButton();
        jLabelHiddenAnswer = new javax.swing.JLabel();
        jLabelQuestion = new javax.swing.JLabel();
        jTextFieldUserAnswer = new javax.swing.JTextField();
        jButtonCheckAnswer = new javax.swing.JButton();
        jLabelEstimateTime = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelGame.setBackground(new java.awt.Color(20, 30, 50));
        jPanelGame.setForeground(new java.awt.Color(255, 215, 0));
        jPanelGame.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonPass.setBackground(new java.awt.Color(225, 215, 0));
        jButtonPass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonPass.setForeground(new java.awt.Color(20, 30, 50));
        jButtonPass.setText("Pass");
        jButtonPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButtonPass.setFocusPainted(false);
        jButtonPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPassActionPerformed(evt);
            }
        });
        jPanelGame.add(jButtonPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 108, 40));

        jButtonTakeLetter.setBackground(new java.awt.Color(225, 215, 0));
        jButtonTakeLetter.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonTakeLetter.setForeground(new java.awt.Color(20, 30, 50));
        jButtonTakeLetter.setText("Take Letter");
        jButtonTakeLetter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButtonTakeLetter.setFocusPainted(false);
        jButtonTakeLetter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTakeLetterActionPerformed(evt);
            }
        });
        jPanelGame.add(jButtonTakeLetter, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 108, 40));

        jButtonEstimate.setBackground(new java.awt.Color(225, 215, 0));
        jButtonEstimate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonEstimate.setForeground(new java.awt.Color(20, 30, 50));
        jButtonEstimate.setText("Estimate");
        jButtonEstimate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButtonEstimate.setFocusPainted(false);
        jButtonEstimate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEstimateActionPerformed(evt);
            }
        });
        jPanelGame.add(jButtonEstimate, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 108, 40));

        jLabelScore.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelScore.setForeground(new java.awt.Color(255, 215, 0));
        jLabelScore.setText("Score :");
        jPanelGame.add(jLabelScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 180, -1));

        jLabelReachablePoint.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelReachablePoint.setForeground(new java.awt.Color(255, 215, 0));
        jLabelReachablePoint.setText("Reachable point:");
        jPanelGame.add(jLabelReachablePoint, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabelTime.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelTime.setForeground(new java.awt.Color(255, 215, 0));
        jLabelTime.setText("Time :");
        jPanelGame.add(jLabelTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 160, -1));

        jButtonExit.setBackground(new java.awt.Color(20, 30, 50));
        jButtonExit.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jButtonExit.setForeground(new java.awt.Color(255, 215, 0));
        jButtonExit.setText("🏠");
        jButtonExit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 215, 0), 2));
        jButtonExit.setPreferredSize(new java.awt.Dimension(50, 50));
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });
        jPanelGame.add(jButtonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 340, 40, 40));

        jLabelHiddenAnswer.setFont(new java.awt.Font("Monospaced", 1, 48)); // NOI18N
        jLabelHiddenAnswer.setForeground(new java.awt.Color(255, 255, 255));
        jLabelHiddenAnswer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHiddenAnswer.setText("---------------");
        jPanelGame.add(jLabelHiddenAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 610, 90));

        jLabelQuestion.setFont(new java.awt.Font("Segoe UI", 2, 20)); // NOI18N
        jLabelQuestion.setForeground(new java.awt.Color(200, 200, 200));
        jLabelQuestion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelGame.add(jLabelQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 700, 90));

        jTextFieldUserAnswer.setColumns(2);
        jTextFieldUserAnswer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextFieldUserAnswer.setForeground(new java.awt.Color(20, 30, 50));
        jTextFieldUserAnswer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldUserAnswer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 215, 0), 2));
        jTextFieldUserAnswer.setCaretColor(new java.awt.Color(20, 30, 50));
        jTextFieldUserAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUserAnswerActionPerformed(evt);
            }
        });
        jPanelGame.add(jTextFieldUserAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 110, -1));

        jButtonCheckAnswer.setBackground(new java.awt.Color(34, 139, 34));
        jButtonCheckAnswer.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jButtonCheckAnswer.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCheckAnswer.setText("CHECK ✅");
        jButtonCheckAnswer.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonCheckAnswer.setFocusPainted(false);
        jButtonCheckAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCheckAnswerActionPerformed(evt);
            }
        });
        jPanelGame.add(jButtonCheckAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 90, 30));

        jLabelEstimateTime.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelEstimateTime.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEstimateTime.setText("Estimate Time");
        jPanelGame.add(jLabelEstimateTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 110, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelGame, javax.swing.GroupLayout.DEFAULT_SIZE, 834, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelGame, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
  private void endGame() throws IOException {

        if (gameTimer != null) {
            gameTimer.stop();
        }
        if (estimateTimer != null) {
            estimateTimer.stop();
        }
        JOptionPane.showMessageDialog(
                this,
                player.toString()
        );

        ScoreFrame sf = new ScoreFrame(player);
        sf.setVisible(true);
        this.dispose();
    }
    private void jButtonPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPassActionPerformed
        if (estimateTimer != null && estimateTimer.isRunning()) {
            return;
        }
        questionIndex++;
        howManyGotLetter = 0;

        try {
            loadQuestionAndAnswer();
        } catch (IOException ex) {
            Logger.getLogger(GameFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        updateScreen();
    }//GEN-LAST:event_jButtonPassActionPerformed

    private void jButtonEstimateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEstimateActionPerformed
        jTextFieldUserAnswer.setVisible(true);
        jButtonCheckAnswer.setVisible(true);
        jButtonPass.setEnabled(false);
        jButtonTakeLetter.setEnabled(false);
        startEstimateTimer();
    }//GEN-LAST:event_jButtonEstimateActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        jPanelGame.setVisible(false);
        MainMenuFrame frame = new MainMenuFrame();
        frame.setVisible(true);
        jTextFieldUserAnswer.setText("");

    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonCheckAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCheckAnswerActionPerformed
        String guess = jTextFieldUserAnswer.getText();
        boolean correct = player.getEngine().performEstimate(guess);

        if (correct) {

            player.getEngine().addScore(howManyGotLetter);
            questionIndex++;

            String output = player.getEngine().getPrintVisibleState();
            jTextFieldUserAnswer.setText(output);
            estimateTimer.stop();
            JOptionPane.showMessageDialog(this, "Congrulation, Correct Answer!");
            Timer timer = new Timer(1500, e -> {
                try {
                    loadQuestionAndAnswer();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            });
            timer.setRepeats(false);
            timer.start();
            gameTimer.start();

            jTextFieldUserAnswer.setText("");
            jTextFieldUserAnswer.setVisible(false);
            jButtonCheckAnswer.setVisible(false);
            jLabelEstimateTime.setVisible(false);
            updateScreen();
            jButtonPass.setEnabled(true);
            jButtonTakeLetter.setEnabled(true);
        } else {
            // YANLIŞ CEVAP DURUMU: Ana süreyi burada da başlatmalısın 
            // ki oyuncu harf alarak devam edebilsin.
            // gameTimer.start();
            JOptionPane.showMessageDialog(this, "Wrong Answer!");
        }
        jTextFieldUserAnswer.setText("");

        updateScreen();
    }//GEN-LAST:event_jButtonCheckAnswerActionPerformed

    private void jButtonTakeLetterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTakeLetterActionPerformed
        howManyGotLetter++;
        player.getEngine().performTakingLetter();
        jLabelReachablePoint.setText("Reachable Point: " + player.getEngine().getReachableScore(howManyGotLetter));
        if (player.getEngine().isCompleted()) {

            String output = player.getEngine().getPrintVisibleState();
            jTextFieldUserAnswer.setText(output);

            Timer timer = new Timer(1500, e -> {
                try {
                    questionIndex++;
                    loadQuestionAndAnswer();
                } catch (IOException ex) {
                    Logger.getLogger(GameFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
            timer.setRepeats(false);
            timer.start();

        }
        updateScreen();

    }//GEN-LAST:event_jButtonTakeLetterActionPerformed

    private void jTextFieldUserAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUserAnswerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUserAnswerActionPerformed
    private void updateScreen() {
        jLabelTime.setText("Time: " + player.getEngine().getTimeManager().getTotalTime());
        jLabelScore.setText("Score: " + player.getEngine().getScore());
        jLabelReachablePoint.setText("Reachable Point: " + player.getEngine().getReachableScore(howManyGotLetter));
        jLabelHiddenAnswer.setText(
                new String(player.getEngine().getCurrent())
        );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCheckAnswer;
    private javax.swing.JButton jButtonEstimate;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonPass;
    private javax.swing.JButton jButtonTakeLetter;
    private javax.swing.JLabel jLabelEstimateTime;
    private javax.swing.JLabel jLabelHiddenAnswer;
    private javax.swing.JLabel jLabelQuestion;
    private javax.swing.JLabel jLabelReachablePoint;
    private javax.swing.JLabel jLabelScore;
    private javax.swing.JLabel jLabelTime;
    private javax.swing.JPanel jPanelGame;
    private javax.swing.JTextField jTextFieldUserAnswer;
    // End of variables declaration//GEN-END:variables

}
