/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appvectorgui;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class Frame extends javax.swing.JFrame {

    /**
     * Creates new form Frame
     */
    DefaultTableModel modTab;
    int [] vec;
    public Frame() {
        initComponents();
        modTab = (DefaultTableModel)jTableVector.getModel();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextDato = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableVector = new javax.swing.JTable();
        jButInsertar = new javax.swing.JButton();
        jButModificar = new javax.swing.JButton();
        jButEliminar = new javax.swing.JButton();
        jButAleatorios = new javax.swing.JButton();
        jButMayor = new javax.swing.JButton();
        jButMenor = new javax.swing.JButton();
        jTextMenor = new javax.swing.JTextField();
        jTextMayor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Dato");

        jTextDato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDatoActionPerformed(evt);
            }
        });

        jTableVector.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vector"
            }
        ));
        jTableVector.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableVectorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableVector);

        jButInsertar.setText("Insertar");
        jButInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButInsertarActionPerformed(evt);
            }
        });

        jButModificar.setText("Modificar");
        jButModificar.setToolTipText("Selecciona un dato");
        jButModificar.setEnabled(false);
        jButModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButModificarActionPerformed(evt);
            }
        });

        jButEliminar.setText("Eliminar");
        jButEliminar.setEnabled(false);
        jButEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButEliminarActionPerformed(evt);
            }
        });

        jButAleatorios.setText("Aleatorios");
        jButAleatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButAleatoriosActionPerformed(evt);
            }
        });

        jButMayor.setText("Mayor");

        jButMenor.setText("Menor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextDato, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButAleatorios, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(jButEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButMenor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButMayor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextMayor, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                            .addComponent(jTextMenor))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextDato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButInsertar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButAleatorios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButMayor)
                            .addComponent(jTextMayor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButMenor)
                            .addComponent(jTextMenor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextDatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDatoActionPerformed
        // TODO add your handling code here:
        
        // Validar la entrada(try-catch), debe ser un numero entero 
        try{
        modTab.insertRow(modTab.getRowCount(), new Object[]{jTextDato.getText()});
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        jTextDato.setText("");
        jTextDato.requestFocus();
    }//GEN-LAST:event_jTextDatoActionPerformed

    private void jButInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButInsertarActionPerformed
        // TODO add your handling code here:
         
       // Validar la entrada(try-catch), debe ser un numero entero 
        modTab.insertRow(modTab.getRowCount(), new Object[]{jTextDato.getText()});
        
        jTextDato.setText("");
        jTextDato.requestFocus();
    }//GEN-LAST:event_jButInsertarActionPerformed

    private void jButModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButModificarActionPerformed
        // TODO add your handling code here:
       if(jTableVector.getRowCount()>0)
        modTab.setValueAt(jTextDato.getText(), jTableVector.getSelectedRow(), 0);
      else
        JOptionPane.showMessageDialog(this, "No se tienen objetos ");
        
    }//GEN-LAST:event_jButModificarActionPerformed

    private void jButEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButEliminarActionPerformed
        // TODO add your handling code here:
        try{
        modTab.removeRow(jTableVector.getSelectedRow());
        }catch(ArrayIndexOutOfBoundsException ex){
        JOptionPane.showMessageDialog(this, "No se selecciono la fila =  "+ex.getMessage());
        }
        jTextDato.setText(""); // Borra el contenido asignando la cadena vacia 
    }//GEN-LAST:event_jButEliminarActionPerformed

    private void jButAleatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButAleatoriosActionPerformed
        // TODO add your handling code here:
       
        Random azar = new Random();
        modTab.setRowCount(azar.nextInt(16)+5);
        
        for(int i=0;i<modTab.getRowCount();i++){
        modTab.setValueAt(azar.nextInt(90)+10, i, 0);
        }
        
        
    }//GEN-LAST:event_jButAleatoriosActionPerformed

    private void jTableVectorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableVectorMouseClicked
        // TODO add your handling code here:

        jButEliminar.setEnabled(true);
        jButModificar.setEnabled(true);
        
    }//GEN-LAST:event_jTableVectorMouseClicked

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
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButAleatorios;
    private javax.swing.JButton jButEliminar;
    private javax.swing.JButton jButInsertar;
    private javax.swing.JButton jButMayor;
    private javax.swing.JButton jButMenor;
    private javax.swing.JButton jButModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableVector;
    private javax.swing.JTextField jTextDato;
    private javax.swing.JTextField jTextMayor;
    private javax.swing.JTextField jTextMenor;
    // End of variables declaration//GEN-END:variables
}