import java.awt.*;
import java.math.*;
import java.text.*;
import javax.swing.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Exksn
 */
public class COMWR extends javax.swing.JFrame {

    /**
     * Creates new form COMWR
     */
    public COMWR() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        N = new javax.swing.JTextField();
        R = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Calculate = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Enter your n:");

        jLabel2.setText("Enter your r:");

        Calculate.setText("Calculate");
        Calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateActionPerformed(evt);
            }
        });

        jLabel3.setText("Combination with Repetition");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(N, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(Calculate))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel3)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(N, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(Calculate)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(316, 239));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculateActionPerformed
        
        try {
            
            int n = Integer.parseInt(N.getText());
            int r = Integer.parseInt(R.getText());
            
            if (n > 500){
            JOptionPane.showMessageDialog(null, "n must be lower than 500!", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (r > 500){
                JOptionPane.showMessageDialog(null, "r must be lower than 500!", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (n < 1){
                JOptionPane.showMessageDialog(null, "n must be higher than 0!", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (r < 1){
                JOptionPane.showMessageDialog(null, "r must be higher than 0!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                COMWRFactorial myobj2 = new COMWRFactorial();
                myobj2.Conditions(n,r);
            }
        } catch (NumberFormatException E) {
            JOptionPane.showMessageDialog(null, "Invalid input!, Input Must be numberical only.");
        }
        
    }//GEN-LAST:event_CalculateActionPerformed

    
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
            java.util.logging.Logger.getLogger(COMWR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(COMWR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(COMWR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(COMWR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new COMWR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calculate;
    private javax.swing.JTextField N;
    private javax.swing.JTextField R;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}

class COMWRFactorial {

    void Conditions(int n, int r) {
            
        BigInteger R = BigInteger.ONE;
        BigInteger UP = BigInteger.ONE;
        BigInteger LOW = BigInteger.ONE;
            
        int up = (n+r)-1;
        int low = n-1;
            
        for (int i = 1; i <= r; i++) {
            R = R.multiply(BigInteger.valueOf(i));
        }
            
        for (int i = 1; i <= low; i++) {
            LOW = LOW.multiply(BigInteger.valueOf(i));
        }
            
        for (int i = 1; i <= up; i++) {
            UP = UP.multiply(BigInteger.valueOf(i));
        }
            
        COMWRComputation myobj = new COMWRComputation();
        myobj.Conditions(R, UP, LOW);
    
    }

}
    
class COMWRComputation {

    void Conditions(BigInteger R, BigInteger UP, BigInteger LOW) {
        
        DecimalFormat Format  = new DecimalFormat();

        BigInteger Result = BigInteger.TEN;
        Result = UP.divide(R.multiply(LOW));
        
        JTextArea JTA = new JTextArea(Format.format(Result));
        JScrollPane JSP = new JScrollPane(JTA); 
        
        JSP.setPreferredSize(new Dimension(1000, 50));
        JOptionPane.showMessageDialog(null,JSP,"Answer",JOptionPane.PLAIN_MESSAGE);
        
    }

}