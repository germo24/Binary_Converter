/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Germo
 */
public class Interface extends javax.swing.JFrame {

    boolean bandera = true;
    Conversor messenger = new Conversor();
    Key_In teclado = new Key_In();

    /**
     * Creates new form Interface
     */
    public Interface() {

        initComponents();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setBackground(new Color(130, 220, 220));

        label2.setBackground(new Color(60, 60, 60));
        label3.setBackground(new Color(60, 60, 60));

        tfield2.setBackground(new Color(235, 235, 235));
        tfield1.setBackground(new Color(235, 235, 235));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jRadioButton1 = new javax.swing.JRadioButton();
        button1 = new javax.swing.JButton();
        label1 = new javax.swing.JLabel();
        tfield1 = new javax.swing.JTextField();
        label2 = new javax.swing.JLabel();
        tfield2 = new javax.swing.JTextField();
        label3 = new javax.swing.JLabel();
        button2 = new javax.swing.JButton();
        button3 = new javax.swing.JButton();

        jRadioButton1.setText("jRadioButton1");

        button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clases/b2.jpg"))); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label1.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        label1.setText("Conversor Decimal - Binario");

        tfield1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfield1ActionPerformed(evt);
            }
        });

        label2.setFont(new java.awt.Font("MS PGothic", 1, 14)); // NOI18N
        label2.setText("Ingresa el decimal: ");

        tfield2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfield2ActionPerformed(evt);
            }
        });

        label3.setFont(new java.awt.Font("MS PGothic", 1, 14)); // NOI18N
        label3.setText("El binario es:");

        button2.setText("Convertir");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        button3.setText("Cambiar a Binario");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfield2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(44, 44, 44)
                            .addComponent(tfield1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(button3)
                .addGap(163, 163, 163))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(button2)
                .addGap(53, 53, 53))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfield1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button3))
                .addGap(14, 14, 14)
                .addComponent(tfield2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button2)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfield1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfield1ActionPerformed

    }//GEN-LAST:event_tfield1ActionPerformed

    private void tfield2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfield2ActionPerformed

    }//GEN-LAST:event_tfield2ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed

    }//GEN-LAST:event_button1ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed

        if (bandera) {

            bandera = false;
            label1.setText(" Conversor Binario - Decimal ");
            label2.setText(" Ingresa el binario: ");
            label3.setText(" El decimal es: ");
            button3.setText(" Cambiar a decimal ");

        } else {

            bandera = true;
            label1.setText(" Conversor Decimal - Binario ");
            label2.setText(" Ingresa el decimal: ");
            label3.setText(" El binario es: ");
            button3.setText(" Cambiar a binario ");

        }
    }//GEN-LAST:event_button3ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed

        B_OR_D();

    }//GEN-LAST:event_button2ActionPerformed

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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button1;
    private javax.swing.JButton button2;
    private javax.swing.JButton button3;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JTextField tfield1;
    private javax.swing.JTextField tfield2;
    // End of variables declaration//GEN-END:variables

    public void B_OR_D() {

        if (bandera) {

            try {

                String queue = tfield1.getText().replaceAll("\\s|\n", "").trim();
                int I_decimal = Integer.parseInt(queue);
                tfield2.setText(messenger.Decimal_Binary(I_decimal));

            } catch (NumberFormatException e) {

                JOptionPane.showMessageDialog(null, " La cadena ingresada no puede ser convertida a binario ", " Error ", JOptionPane.WARNING_MESSAGE);
            }

        } else {

            // Corroboramos que sea binario.
            String temp_var = tfield1.getText().trim();
            boolean error = false;

            for (int i = temp_var.length(); i > 0; i--) {

                String var = temp_var.substring(i - 1, i);

                if (!var.equals("0") && !var.equals("1")) {
                    error = true;
                    break;
                }
            }

            if (error) {

                JOptionPane.showMessageDialog(null, " Existen 1 o más elementos distintos de 0 y 1 ", " Error ", JOptionPane.WARNING_MESSAGE);

            } else {

                int I_decimal_result = messenger.Binary_Decimal(temp_var);
                tfield2.setText(Integer.toString(I_decimal_result));

            }
        }

    }
}
