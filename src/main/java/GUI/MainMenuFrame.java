
package GUI;

import java.awt.CardLayout;
import javax.swing.JPanel;

public class MainMenuFrame extends javax.swing.JFrame {

    private CardLayout cardLayout;
    private JPanel rootPanel;
    private cardPanel cardPanel;


    public MainMenuFrame() {
        initComponents();

        cardLayout = new CardLayout();
        rootPanel = new JPanel(cardLayout); //Bu kısımlarda ai dan yardım aldım çünkü 
        //menu  frameden panellere geçince menudeki yazılar gözükmeye devam ediyordu çözemedim

        cardPanel = new cardPanel();

        rootPanel.add(jPanelMainMenu, "MENU");
        rootPanel.add(cardPanel, "CARD");

        setContentPane(rootPanel);

        cardLayout.show(rootPanel, "MENU");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMainMenu = new javax.swing.JPanel();
        jButtonExit = new javax.swing.JButton();
        jButtonPlay = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 0, 204));

        jPanelMainMenu.setBackground(new java.awt.Color(20, 30, 50));
        jPanelMainMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 9));
        jPanelMainMenu.setForeground(new java.awt.Color(255, 255, 255));
        jPanelMainMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonExit.setBackground(new java.awt.Color(102, 0, 0));
        jButtonExit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonExit.setForeground(new java.awt.Color(255, 255, 255));
        jButtonExit.setText("Exit");
        jButtonExit.setFocusPainted(false);
        jButtonExit.setFocusable(false);
        jButtonExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });
        jPanelMainMenu.add(jButtonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 103, 36));

        jButtonPlay.setBackground(new java.awt.Color(255, 215, 0));
        jButtonPlay.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButtonPlay.setForeground(new java.awt.Color(20, 30, 50));
        jButtonPlay.setText(" PLAY");
        jButtonPlay.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonPlay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonPlay.setFocusPainted(false);
        jButtonPlay.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPlayActionPerformed(evt);
            }
        });
        jPanelMainMenu.add(jButtonPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 140, 61));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("WELCOME TO THE GOD OF WORDS ");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanelMainMenu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 536, 48));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("----------------------------------------");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanelMainMenu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 392, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("v1.0.2 Beta");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanelMainMenu.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 500, 109, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Master the Art of Language");
        jPanelMainMenu.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 315, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\alise\\OneDrive\\Desktop\\download.jpg")); // NOI18N
        jLabel5.setText("jLabel5");
        jPanelMainMenu.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 184, 246));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelMainMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelMainMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPlayActionPerformed
       
         cardLayout.show(rootPanel, "CARD");

    }//GEN-LAST:event_jButtonPlayActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenuFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonPlay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanelMainMenu;
    // End of variables declaration//GEN-END:variables
}
