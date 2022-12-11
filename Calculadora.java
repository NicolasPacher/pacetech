
package ProjetoCalculadora;


public class Calculadora extends javax.swing.JFrame {


    public Calculadora() {
        initComponents();
    }

    String op;
    double n1, n2, res;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tela = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jbtnlimpar = new javax.swing.JButton();
        jbtnmenos = new javax.swing.JButton();
        jbtnmais = new javax.swing.JButton();
        jbtndividir = new javax.swing.JButton();
        jbtnvezes = new javax.swing.JButton();
        jbtnigual = new javax.swing.JButton();
        jbtn1 = new javax.swing.JButton();
        jbtn2 = new javax.swing.JButton();
        jBtn3 = new javax.swing.JButton();
        jbtn4 = new javax.swing.JButton();
        jbtn5 = new javax.swing.JButton();
        jbtn6 = new javax.swing.JButton();
        jbtn7 = new javax.swing.JButton();
        jbtn8 = new javax.swing.JButton();
        jbtn9 = new javax.swing.JButton();
        jbtn0 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 0, 0));
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Calculadora");
        jLabel1.setFocusable(false);

        jbtnlimpar.setText("Limpar");
        jbtnlimpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnlimparMouseClicked(evt);
            }
        });

        jbtnmenos.setText("-");
        jbtnmenos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnmenosMouseClicked(evt);
            }
        });

        jbtnmais.setText("+");
        jbtnmais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnmaisMouseClicked(evt);
            }
        });

        jbtndividir.setText("/");
        jbtndividir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtndividirMouseClicked(evt);
            }
        });
        jbtndividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndividirActionPerformed(evt);
            }
        });

        jbtnvezes.setText("*");
        jbtnvezes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnvezesMouseClicked(evt);
            }
        });

        jbtnigual.setText("=");
        jbtnigual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnigualMouseClicked(evt);
            }
        });

        jbtn1.setText("1");
        jbtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtn1MouseClicked(evt);
            }
        });

        jbtn2.setText("2");
        jbtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtn2MouseClicked(evt);
            }
        });

        jBtn3.setText("3");
        jBtn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtn3MouseClicked(evt);
            }
        });

        jbtn4.setText("4");
        jbtn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtn4MouseClicked(evt);
            }
        });

        jbtn5.setText("5");
        jbtn5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtn5MouseClicked(evt);
            }
        });

        jbtn6.setText("6");
        jbtn6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtn6MouseClicked(evt);
            }
        });

        jbtn7.setText("7");
        jbtn7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtn7MouseClicked(evt);
            }
        });

        jbtn8.setText("8");
        jbtn8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtn8MouseClicked(evt);
            }
        });

        jbtn9.setText("9");
        jbtn9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtn9MouseClicked(evt);
            }
        });

        jbtn0.setText("0");
        jbtn0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtn0MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jbtn9, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                                    .addComponent(jbtn6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbtn8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbtn4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jbtn7, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                    .addComponent(jBtn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbtn0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addComponent(tela, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnmenos, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnlimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnmais, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtndividir, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnvezes, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnigual, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnlimpar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnmenos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnmais))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtn1)
                            .addComponent(jbtn2)
                            .addComponent(jBtn3)
                            .addComponent(jbtn4))))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn5)
                    .addComponent(jbtn6)
                    .addComponent(jbtn7)
                    .addComponent(jbtn8)
                    .addComponent(jbtndividir))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtn0)
                            .addComponent(jbtn9)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnvezes)
                        .addGap(31, 31, 31)
                        .addComponent(jbtnigual, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtndividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtndividirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtndividirActionPerformed

    private void jbtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn1MouseClicked
        tela.setText(tela.getText() + "1");        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn1MouseClicked

    private void jbtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn2MouseClicked
        tela.setText(tela.getText() + "2");        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn2MouseClicked

    private void jBtn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtn3MouseClicked
        tela.setText(tela.getText() + "3");        // TODO add your handling code here:
    }//GEN-LAST:event_jBtn3MouseClicked

    private void jbtn4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn4MouseClicked
        tela.setText(tela.getText() + "4");        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn4MouseClicked

    private void jbtn5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn5MouseClicked
        tela.setText(tela.getText() + "5");        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn5MouseClicked

    private void jbtn6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn6MouseClicked
        tela.setText(tela.getText() + "6");        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn6MouseClicked

    private void jbtn7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn7MouseClicked
        tela.setText(tela.getText() + "7");        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn7MouseClicked

    private void jbtn8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn8MouseClicked
        tela.setText(tela.getText() + "8");        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn8MouseClicked

    private void jbtn9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn9MouseClicked
        tela.setText(tela.getText() + "9");        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn9MouseClicked

    private void jbtn0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn0MouseClicked
        tela.setText(tela.getText() + "0");        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn0MouseClicked

    private void jbtndividirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtndividirMouseClicked
        n1 = Double.parseDouble(tela.getText());
        op = "divisão";
        tela.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_jbtndividirMouseClicked

    private void jbtnvezesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnvezesMouseClicked
        n1 = Double.parseDouble(tela.getText());
        op = "multiplicação";
        tela.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnvezesMouseClicked

    private void jbtnmenosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnmenosMouseClicked
        n1 = Double.parseDouble(tela.getText());
        op = "subtração";
        tela.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnmenosMouseClicked

    private void jbtnmaisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnmaisMouseClicked
        n1 = Double.parseDouble(tela.getText());
        op = "soma";
        tela.setText("");        
    }//GEN-LAST:event_jbtnmaisMouseClicked

    private void jbtnigualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnigualMouseClicked
        n2 = Double.parseDouble(tela.getText());
        if (op.equals("soma")) {
            res = n1 + n2;
            tela.setText(Double.toString(res));
        }
        if (op.equals("subtração")) {
            res = n1 - n2;
            tela.setText(Double.toString(res));
        }
        if (op.equals("multiplicação")) {
            res = n1 * n2;
            tela.setText(Double.toString(res));
        }
        if (op.equals("divisão")) {
            res = n1 / n2;
            tela.setText(Double.toString(res));        
    }//GEN-LAST:event_jbtnigualMouseClicked
    }
    private void jbtnlimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnlimparMouseClicked
    String str = tela.getText();
        StringBuilder w = new StringBuilder(str);
        str = String.valueOf(w.deleteCharAt(str.length() - 1));
        tela.setText(str);
    }//GEN-LAST:event_jbtnlimparMouseClicked


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
    private javax.swing.JButton jBtn3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtn0;
    private javax.swing.JButton jbtn1;
    private javax.swing.JButton jbtn2;
    private javax.swing.JButton jbtn4;
    private javax.swing.JButton jbtn5;
    private javax.swing.JButton jbtn6;
    private javax.swing.JButton jbtn7;
    private javax.swing.JButton jbtn8;
    private javax.swing.JButton jbtn9;
    private javax.swing.JButton jbtndividir;
    private javax.swing.JButton jbtnigual;
    private javax.swing.JButton jbtnlimpar;
    private javax.swing.JButton jbtnmais;
    private javax.swing.JButton jbtnmenos;
    private javax.swing.JButton jbtnvezes;
    private javax.swing.JTextField tela;
    // End of variables declaration//GEN-END:variables
}
