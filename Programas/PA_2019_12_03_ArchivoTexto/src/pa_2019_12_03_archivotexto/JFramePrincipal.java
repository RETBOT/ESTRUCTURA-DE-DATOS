/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_12_03_archivotexto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class JFramePrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JFramePrincipal
     */
    DefaultTableModel modelo;
    MiRandom azar = new MiRandom();
    public JFramePrincipal() {
        initComponents();
        
        modelo = (DefaultTableModel)jTableAlumnos.getModel();
        
        jTableAlumnos.setShowGrid(true);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAlumnos = new javax.swing.JTable();
        jSpinAlumnos = new javax.swing.JSpinner();
        jButAleatorios = new javax.swing.JButton();
        jTextArchivo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButGrabar = new javax.swing.JButton();
        jButLeer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Número de alumnos");

        jTableAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Alumno", "Grupo", "Edad", "Promedio"
            }
        ));
        jScrollPane1.setViewportView(jTableAlumnos);
        if (jTableAlumnos.getColumnModel().getColumnCount() > 0) {
            jTableAlumnos.getColumnModel().getColumn(0).setPreferredWidth(200);
        }

        jSpinAlumnos.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinAlumnosStateChanged(evt);
            }
        });

        jButAleatorios.setText("Aleatorios");
        jButAleatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButAleatoriosActionPerformed(evt);
            }
        });

        jLabel2.setText("Archivo");

        jButGrabar.setText("Grabar");
        jButGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButGrabarActionPerformed(evt);
            }
        });

        jButLeer.setText("Leer");
        jButLeer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButLeerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButAleatorios))
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButGrabar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButLeer)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jSpinAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButAleatorios))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButGrabar)
                    .addComponent(jButLeer)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSpinAlumnosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinAlumnosStateChanged
        // TODO add your handling code here:
        modelo.setRowCount((int)jSpinAlumnos.getValue());
    }//GEN-LAST:event_jSpinAlumnosStateChanged

    private void jButAleatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButAleatoriosActionPerformed
        // TODO add your handling code here:
        char [] grupo = {'A','B','C','D','E','F','G'};
        
        for(int r=0; r<modelo.getRowCount();r++){
        modelo.setValueAt(azar.nextNombreCompleto(), r, 0);
        
        modelo.setValueAt(grupo[azar.nextInt(grupo.length)], r, 1);
        
        modelo.setValueAt(azar.nextInt(17, 30), r, 2);
        
        modelo.setValueAt(azar.nextInt(40, 100), r, 3);
        
        }
    }//GEN-LAST:event_jButAleatoriosActionPerformed

    private void jButGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButGrabarActionPerformed
        try {
            // TODO add your handling code here:
           //lo que se grabe va a hacer una cadena 
            //clase Escritura
            FileWriter fw = new FileWriter(jTextArchivo.getText());
            PrintWriter pw = new PrintWriter(fw);
            //grabar
            pw.println(modelo.getRowCount());
            
            //recorrer el jTable 
            for(int r = 0; r<modelo.getRowCount();r++){
            pw.println(modelo.getValueAt(r, 0));
            pw.println(modelo.getValueAt(r, 1));
            pw.println(modelo.getValueAt(r, 2));
            pw.println(modelo.getValueAt(r, 3));
            }
            //cerrar los archivos, se pueden dañar y no se graben 
            pw.close();
            fw.close();
            
        
        } catch (IOException ex) {
            Logger.getLogger(JFramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButGrabarActionPerformed

    private void jButLeerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButLeerActionPerformed
        try {
            // TODO add your handling code here:
            FileReader fr = new FileReader(jTextArchivo.getText());
            
            BufferedReader br = new BufferedReader(fr);
            
            int n = Integer.parseInt(br.readLine());
            jSpinAlumnos.setValue(n);           
            
            for(int r=0;r<n;r++){
               jTableAlumnos.setValueAt(br.readLine(),r,0);
               jTableAlumnos.setValueAt(br.readLine(),r,1);
               jTableAlumnos.setValueAt(br.readLine(),r,2);
               jTableAlumnos.setValueAt(br.readLine(),r,3);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JFramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JFramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButLeerActionPerformed

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
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButAleatorios;
    private javax.swing.JButton jButGrabar;
    private javax.swing.JButton jButLeer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinAlumnos;
    private javax.swing.JTable jTableAlumnos;
    private javax.swing.JTextField jTextArchivo;
    // End of variables declaration//GEN-END:variables
}