/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.ui;

/**
 *
 * @author wando
 */
public class Calculadora extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
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

        jPanel3 = new javax.swing.JPanel();
        jVisor = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jBotao7 = new javax.swing.JButton();
        jBotao4 = new javax.swing.JButton();
        jBotao1 = new javax.swing.JButton();
        jBotao8 = new javax.swing.JButton();
        jBotao5 = new javax.swing.JButton();
        jBotao2 = new javax.swing.JButton();
        jBotao9 = new javax.swing.JButton();
        jBotao6 = new javax.swing.JButton();
        jBotao3 = new javax.swing.JButton();
        jBotaoDividir = new javax.swing.JButton();
        jBotaoMultiplicar = new javax.swing.JButton();
        jBotaoSubtrair = new javax.swing.JButton();
        jBotaoSomar = new javax.swing.JButton();
        jBotao0 = new javax.swing.JButton();
        jBotaoIgual = new javax.swing.JButton();
        jBotaoC = new javax.swing.JButton();
        jBotaoPonto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setResizable(false);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jVisor.setEditable(false);
        jVisor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jVisor.setText("0");
        jVisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVisorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jVisor)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jVisor, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jBotao7.setText("7");
        jBotao7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotao7ActionPerformed(evt);
            }
        });

        jBotao4.setText("4");
        jBotao4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotao4ActionPerformed(evt);
            }
        });

        jBotao1.setText("1");

        jBotao8.setText("8");
        jBotao8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotao8ActionPerformed(evt);
            }
        });

        jBotao5.setText("5");

        jBotao2.setText("2");
        jBotao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotao2ActionPerformed(evt);
            }
        });

        jBotao9.setText("9");

        jBotao6.setText("6");
        jBotao6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotao6ActionPerformed(evt);
            }
        });

        jBotao3.setText("3");

        jBotaoDividir.setText("/");

        jBotaoMultiplicar.setText("*");

        jBotaoSubtrair.setText("-");

        jBotaoSomar.setText("+");

        jBotao0.setText("0");
        jBotao0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotao0ActionPerformed(evt);
            }
        });

        jBotaoIgual.setText("=");

        jBotaoC.setText("C");

        jBotaoPonto.setText(",");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBotaoIgual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBotaoC, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBotao7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBotao4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBotao1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBotao5)
                                    .addComponent(jBotao2)
                                    .addComponent(jBotao8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jBotao6, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBotao3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBotao9)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jBotao0, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBotaoPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBotaoSomar, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                            .addComponent(jBotaoSubtrair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBotaoDividir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBotaoMultiplicar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBotao7)
                        .addComponent(jBotao8)
                        .addComponent(jBotao9))
                    .addComponent(jBotaoDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBotao4)
                        .addComponent(jBotao5)
                        .addComponent(jBotao6))
                    .addComponent(jBotaoMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBotao1)
                        .addComponent(jBotao2)
                        .addComponent(jBotao3))
                    .addComponent(jBotaoSubtrair, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBotaoSomar)
                    .addComponent(jBotao0)
                    .addComponent(jBotaoC)
                    .addComponent(jBotaoPonto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBotaoIgual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(240, 330));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jVisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVisorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jVisorActionPerformed

    private void jBotao6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotao6ActionPerformed
        // TODO add your handling code here:
          if(jVisor.getText().equals("0")){
           jVisor.setText("");
       }
        jVisor.setText(jVisor.getText()+"6");
    }//GEN-LAST:event_jBotao6ActionPerformed

    private void jBotao7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotao7ActionPerformed
        // TODO add your handling code here:
       if(jVisor.getText().equals("0")){
           jVisor.setText("");
       }
        jVisor.setText(jVisor.getText()+"7");
    }//GEN-LAST:event_jBotao7ActionPerformed

    private void jBotao4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotao4ActionPerformed
        // TODO add your handling code here:
          if(jVisor.getText().equals("0")){
           jVisor.setText("");
       }
        jVisor.setText(jVisor.getText()+"4");
    }//GEN-LAST:event_jBotao4ActionPerformed

    private void jBotao0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotao0ActionPerformed
        // TODO add your handling code here:
          
        jVisor.setText(jVisor.getText()+"0");
    }//GEN-LAST:event_jBotao0ActionPerformed

    private void jBotao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotao2ActionPerformed
        // TODO add your handling code here:
          if(jVisor.getText().equals("0")){
           jVisor.setText("");
       }
        jVisor.setText(jVisor.getText()+"2");
    }//GEN-LAST:event_jBotao2ActionPerformed

    private void jBotao8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotao8ActionPerformed
        // TODO add your handling code here:
          if(jVisor.getText().equals("0")){
           jVisor.setText("");
       }
        jVisor.setText(jVisor.getText()+"8");
    }//GEN-LAST:event_jBotao8ActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBotao0;
    private javax.swing.JButton jBotao1;
    private javax.swing.JButton jBotao2;
    private javax.swing.JButton jBotao3;
    private javax.swing.JButton jBotao4;
    private javax.swing.JButton jBotao5;
    private javax.swing.JButton jBotao6;
    private javax.swing.JButton jBotao7;
    private javax.swing.JButton jBotao8;
    private javax.swing.JButton jBotao9;
    private javax.swing.JButton jBotaoC;
    private javax.swing.JButton jBotaoDividir;
    private javax.swing.JButton jBotaoIgual;
    private javax.swing.JButton jBotaoMultiplicar;
    private javax.swing.JButton jBotaoPonto;
    private javax.swing.JButton jBotaoSomar;
    private javax.swing.JButton jBotaoSubtrair;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jVisor;
    // End of variables declaration//GEN-END:variables
}
