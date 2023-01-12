/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package RockPaperScissors;

import javax.swing.border.Border;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
      

/**
 *
 * @author David Anton
 */
public class mainForm extends javax.swing.JFrame {
    
    // Create borders
    Border gray_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.DARK_GRAY);
    Border orange_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.ORANGE);
    
    // Images path
    String rock = "/images/rockIcon.jpg";
    String paper = "/images/paperIcon.png";
    String scissors = "/images/scissorsIcon.png";
    
    // Create an ArrayList
    ArrayList<String> list = new ArrayList<>();
    Random random = new Random();
    int yourWins = 0;
    int computerWins = 0;
    String randomSelection;
    
    
    /**
     * Creates new form mainForm
     */
    public mainForm() {
        initComponents();
        
        // Set Borders
        jLabelYou.setBorder(gray_border);
        jLabelComputer.setBorder(gray_border);
        jLabelRock.setBorder(gray_border);
        jLabelPaper.setBorder(gray_border);
        jLabelScissor.setBorder(gray_border);
            
        // Display images in Java Labels
        displayImage(rock, jLabelRock, 110,90);
        displayImage(paper, jLabelPaper, 110,90);
        displayImage(scissors, jLabelScissor, 110,90);
        
        // Add items to the list
        list.add(rock);
        list.add(paper);
        list.add(scissors);
               
    }
    
    // Function to display images in Java Labels
    public final void displayImage(String imagePath, JLabel label, int width, int height) {
        
        // Get the image
        ImageIcon imgIco = new ImageIcon(getClass().getResource(imagePath));
        
        // Resize the image
        Image img = imgIco.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        
        // Set image into Java Label
        label.setIcon(new ImageIcon(img));
    }
    
    // Function to get the winner
    public void getWinner(String you, String computer) {
        if (you.equals(computer)) {
            // System.out.println("Draw");
            yourStatus.setText("Draw");
            
        } else if (you.equals(rock)) {
            if (computer.equals(scissors)) {
                yourWins++;
                yourScore.setText(String.valueOf(yourWins));
                yourStatus.setText("You Win!");
            } else {
                computerWins++;
                computerScore.setText(String.valueOf(computerWins));
                yourStatus.setText("AI Won!!");
            }
        } else if (you.equals(paper)) {
            if (computer.equals(rock)) {
                yourWins++;
                yourScore.setText(String.valueOf(yourWins));
                yourStatus.setText("You Win!");
            } else {
                computerWins++;
                computerScore.setText(String.valueOf(computerWins));
                yourStatus.setText("AI Won!!");
            }
        } else if (you.equals(scissors)) {
            if (computer.equals(paper)) {
                yourWins++;
                yourScore.setText(String.valueOf(yourWins));
                yourStatus.setText("You Win!");
            } else {
                computerWins++;
                computerScore.setText(String.valueOf(computerWins));
                yourStatus.setText("AI Won!!");
            }
        }
        
        // Checks if losts
        if (yourWins == 5 || computerWins == 5) {
            int yesNo = JOptionPane.showConfirmDialog(null, 
                                                      "Would you like to play again?", 
                                                      "New Game?", 
                                                      JOptionPane.YES_NO_OPTION);
            
            // Conditional statement for starting the game again
            if (yesNo == 0) {
                computerScore.setIcon(null);
                jLabelYou.setIcon(null);
                
                yourWins = 0;
                computerWins = 0;
                
                yourScore.setText(String.valueOf(yourWins));
                computerScore.setText(String.valueOf(computerWins));
                yourStatus.setText("STATUS");
            
            // Else closes the game when selected
            } else if (yesNo == 1) {
                // System.out.println("User ended the game");
                System.exit(0);
            }
             
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelYou = new javax.swing.JLabel();
        jLabelComputer = new javax.swing.JLabel();
        yourScore = new javax.swing.JLabel();
        computerScore = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelRock = new javax.swing.JLabel();
        jLabelScissor = new javax.swing.JLabel();
        jLabelPaper = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        yourStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rock Paper Scissors");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabelYou.setBackground(new java.awt.Color(102, 102, 102));
        jLabelYou.setOpaque(true);

        jLabelComputer.setBackground(new java.awt.Color(102, 102, 102));
        jLabelComputer.setOpaque(true);

        yourScore.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        yourScore.setForeground(new java.awt.Color(0, 153, 0));
        yourScore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        yourScore.setText("0");

        computerScore.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        computerScore.setForeground(new java.awt.Color(255, 51, 0));
        computerScore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        computerScore.setText("0");

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("-");

        jLabelRock.setBackground(new java.awt.Color(102, 102, 102));
        jLabelRock.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelRock.setOpaque(true);
        jLabelRock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRockMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelRockMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelRockMouseExited(evt);
            }
        });

        jLabelScissor.setBackground(new java.awt.Color(102, 102, 102));
        jLabelScissor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelScissor.setOpaque(true);
        jLabelScissor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelScissorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelScissorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelScissorMouseExited(evt);
            }
        });

        jLabelPaper.setBackground(new java.awt.Color(102, 102, 102));
        jLabelPaper.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelPaper.setOpaque(true);
        jLabelPaper.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPaperMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelPaperMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelPaperMouseExited(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("You");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Well coded AI");

        yourStatus.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        yourStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        yourStatus.setText("STATUS");
        yourStatus.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(jLabelYou, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(yourScore, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(computerScore, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(yourStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(jLabelComputer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelRock, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabelPaper, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabelScissor, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelYou, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelComputer, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(yourScore, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(computerScore, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(yourStatus)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPaper, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRock, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelScissor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelRockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRockMouseClicked
        // Display rock image
        displayImage(rock, jLabelYou, 160, 120);
        
        // Make a rnadom selection
        randomSelection = list.get(random.nextInt(list.size()));
        
        // Display image
        displayImage(randomSelection, jLabelComputer, 160, 120);
        getWinner(rock, randomSelection);
        
    }//GEN-LAST:event_jLabelRockMouseClicked

    private void jLabelPaperMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPaperMouseClicked
        // Display paper image
        displayImage(paper, jLabelYou, 160, 120);
        
        // Make a rnadom selection
        randomSelection = list.get(random.nextInt(list.size()));
        
        // Display image
        displayImage(randomSelection, jLabelComputer, 160, 120);
        getWinner(paper, randomSelection);
    }//GEN-LAST:event_jLabelPaperMouseClicked

    private void jLabelScissorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelScissorMouseClicked
        // Display scissors image
        displayImage(scissors, jLabelYou, 160, 120);
        
        // Make a rnadom selection
        randomSelection = list.get(random.nextInt(list.size()));
        
        // Display image
        displayImage(randomSelection, jLabelComputer, 160, 120);
        getWinner(scissors, randomSelection);
    }//GEN-LAST:event_jLabelScissorMouseClicked

    private void jLabelRockMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRockMouseEntered
        // Change border
        jLabelRock.setBorder(orange_border);
    }//GEN-LAST:event_jLabelRockMouseEntered

    private void jLabelRockMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRockMouseExited
        // Change border
        jLabelRock.setBorder(gray_border);
    }//GEN-LAST:event_jLabelRockMouseExited

    private void jLabelPaperMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPaperMouseEntered
        // Change border
        jLabelPaper.setBorder(orange_border);
    }//GEN-LAST:event_jLabelPaperMouseEntered

    private void jLabelPaperMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPaperMouseExited
        // Change border
        jLabelPaper.setBorder(gray_border);
    }//GEN-LAST:event_jLabelPaperMouseExited

    private void jLabelScissorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelScissorMouseEntered
        // Change border
        jLabelScissor.setBorder(orange_border);
    }//GEN-LAST:event_jLabelScissorMouseEntered

    private void jLabelScissorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelScissorMouseExited
        // Change border
        jLabelScissor.setBorder(gray_border);
    }//GEN-LAST:event_jLabelScissorMouseExited

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
            java.util.logging.Logger.getLogger(mainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel computerScore;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelComputer;
    private javax.swing.JLabel jLabelPaper;
    private javax.swing.JLabel jLabelRock;
    private javax.swing.JLabel jLabelScissor;
    private javax.swing.JLabel jLabelYou;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel yourScore;
    private javax.swing.JLabel yourStatus;
    // End of variables declaration//GEN-END:variables
}
