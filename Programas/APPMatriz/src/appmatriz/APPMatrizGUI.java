/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appmatriz;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class APPMatrizGUI extends javax.swing.JFrame {

    /**
     * Creates new form APPMatrizGUI
     */
    DefaultTableModel matriz1;
    DefaultTableModel matriz2;
    DefaultTableModel matriz3;
    int [][] mat1;
    int [][] mat2;
    public APPMatrizGUI() {
        initComponents();
        
        jTableMatriz1.setShowGrid(true);
        jTableMatriz2.setShowGrid(true);
        jTableMatriz3.setShowGrid(true);
        
        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSpinRenglones1 = new javax.swing.JSpinner();
        jSpinColumnas1 = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMatriz1 = new javax.swing.JTable();
        jButAleatorios = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableMatriz3 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableMatriz2 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jButPares = new javax.swing.JButton();
        jButNones = new javax.swing.JButton();
        jButPDP = new javax.swing.JButton();
        jButPDI = new javax.swing.JButton();
        jButTranspuesta = new javax.swing.JButton();
        jButMultiplicar = new javax.swing.JButton();
        jButAleatorios2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSpinRenglones2 = new javax.swing.JSpinner();
        jSpinColumnas2 = new javax.swing.JSpinner();
        jButParesB = new javax.swing.JButton();
        jButNonesB = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButPDPB = new javax.swing.JButton();
        jButPDIB = new javax.swing.JButton();
        jButTranspuestaB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Tamaño de la Matriz A");

        jLabel2.setText("Renglones:");

        jLabel3.setText("Columnas:");

        jSpinRenglones1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinRenglones1StateChanged(evt);
            }
        });

        jSpinColumnas1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinColumnas1StateChanged(evt);
            }
        });

        jTableMatriz1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableMatriz1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                jTableMatriz1ComponentResized(evt);
            }
        });
        jScrollPane1.setViewportView(jTableMatriz1);

        jButAleatorios.setText("Aleatorios");
        jButAleatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButAleatoriosActionPerformed(evt);
            }
        });

        jLabel5.setText("Matriz A");

        jLabel6.setText("Matriz C");

        jTableMatriz3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTableMatriz3);

        jTableMatriz2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableMatriz2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                jTableMatriz2ComponentResized(evt);
            }
        });
        jScrollPane3.setViewportView(jTableMatriz2);

        jLabel7.setText("Matriz B");

        jButPares.setText("Pares A");
        jButPares.setEnabled(false);
        jButPares.setMaximumSize(new java.awt.Dimension(70, 30));
        jButPares.setMinimumSize(new java.awt.Dimension(70, 30));
        jButPares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButParesActionPerformed(evt);
            }
        });

        jButNones.setText("Nones A");
        jButNones.setEnabled(false);
        jButNones.setMaximumSize(new java.awt.Dimension(70, 30));
        jButNones.setMinimumSize(new java.awt.Dimension(70, 30));
        jButNones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButNonesActionPerformed(evt);
            }
        });

        jButPDP.setText("Promedio Diagonal Principal A");
        jButPDP.setEnabled(false);
        jButPDP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButPDPActionPerformed(evt);
            }
        });

        jButPDI.setText("Promedio Diagonal Invertida A");
        jButPDI.setEnabled(false);
        jButPDI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButPDIActionPerformed(evt);
            }
        });

        jButTranspuesta.setText("Transpuesta A");
        jButTranspuesta.setEnabled(false);
        jButTranspuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButTranspuestaActionPerformed(evt);
            }
        });

        jButMultiplicar.setText("Multiplicar A*B");
        jButMultiplicar.setEnabled(false);
        jButMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButMultiplicarActionPerformed(evt);
            }
        });

        jButAleatorios2.setText("Aleatorios");
        jButAleatorios2.setEnabled(false);
        jButAleatorios2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButAleatorios2ActionPerformed(evt);
            }
        });

        jLabel9.setText("Renglones:");

        jLabel10.setText("Columnas:");

        jSpinRenglones2.setEnabled(false);
        jSpinRenglones2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinRenglones2StateChanged(evt);
            }
        });

        jSpinColumnas2.setEnabled(false);
        jSpinColumnas2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinColumnas2StateChanged(evt);
            }
        });

        jButParesB.setText("Pares B");
        jButParesB.setEnabled(false);
        jButParesB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButParesBActionPerformed(evt);
            }
        });

        jButNonesB.setText("Nones B");
        jButNonesB.setEnabled(false);
        jButNonesB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButNonesBActionPerformed(evt);
            }
        });

        jLabel4.setText("Tamaño de la Matriz B");

        jButPDPB.setText("Promedio Diagonal Principal B");
        jButPDPB.setEnabled(false);
        jButPDPB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButPDPBActionPerformed(evt);
            }
        });

        jButPDIB.setText("Promedio Diagonal Invertida B");
        jButPDIB.setEnabled(false);
        jButPDIB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButPDIBActionPerformed(evt);
            }
        });

        jButTranspuestaB.setText("Transpuesta B");
        jButTranspuestaB.setEnabled(false);
        jButTranspuestaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButTranspuestaBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jSpinColumnas1, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                                                .addComponent(jSpinRenglones1))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButAleatorios)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jButPares, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jButNones, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(10, 10, 10))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButPDI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSpinColumnas2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinRenglones2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButAleatorios2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButParesB, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButNonesB, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButPDPB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButPDIB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButTranspuestaB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButMultiplicar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButPDP, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButTranspuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jSpinRenglones1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButAleatorios))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jSpinColumnas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jSpinRenglones2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButAleatorios2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jSpinColumnas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButPares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButNones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButParesB)
                    .addComponent(jButNonesB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButPDPB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButPDIB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButTranspuestaB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButPDP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButPDI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButTranspuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButMultiplicar)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSpinRenglones1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinRenglones1StateChanged
        // TODO add your handling code here:
        matriz1 = (DefaultTableModel)jTableMatriz1.getModel();
        matriz1.setRowCount((int)jSpinRenglones1.getValue());
        
    }//GEN-LAST:event_jSpinRenglones1StateChanged

    private void jSpinColumnas1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinColumnas1StateChanged
        // TODO add your handling code here:
         matriz1 = (DefaultTableModel)jTableMatriz1.getModel();
         matriz1.setColumnCount((int)jSpinColumnas1.getValue());
    }//GEN-LAST:event_jSpinColumnas1StateChanged

    private void jButAleatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButAleatoriosActionPerformed
        // TODO add your handling code here:
        Random azar = new Random();
        jSpinColumnas1.setValue(azar.nextInt(3)+3);
        jSpinRenglones1.setValue(azar.nextInt(3)+3);   
        
         for(int c=0;c<matriz1.getColumnCount();c++){
            for(int r=0;r<matriz1.getRowCount();r++){
                matriz1.setValueAt(azar.nextInt(3)+7, r, c);
            }
         }
    }//GEN-LAST:event_jButAleatoriosActionPerformed

    private void jButNonesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButNonesActionPerformed
        // TODO add your handling code here:
        mat1  = new int[matriz1.getRowCount()][matriz1.getColumnCount()];
        
        for(int r=0;r<matriz1.getRowCount();r++){
            for(int c=0;c<matriz1.getColumnCount();c++){
            mat1[r][c] = 0;
            mat1[r][c] = Integer.parseInt(matriz1.getValueAt(r, c)+"");
            }
        }
       
       String resu = "Nones por renglon B: ";
        for(int i=0;i<Matriz.nones(mat1).length;i++){
            resu += "["+Matriz.nones(mat1)[i]+"] ";
        }
         JOptionPane.showMessageDialog(this, resu);
        
    }//GEN-LAST:event_jButNonesActionPerformed

    private void jButAleatorios2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButAleatorios2ActionPerformed
        // TODO add your handling code here:
         Random azar = new Random();
        jSpinColumnas2.setValue(azar.nextInt(3)+3);
        jSpinRenglones2.setValue(azar.nextInt(3)+3);   
        
         for(int c=0;c<matriz2.getColumnCount();c++){
            for(int r=0;r<matriz2.getRowCount();r++){
                matriz2.setValueAt(azar.nextInt(3)+7, r, c);
            }
         }
        
    }//GEN-LAST:event_jButAleatorios2ActionPerformed

    private void jSpinRenglones2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinRenglones2StateChanged
        // TODO add your handling code here:
        matriz2 = (DefaultTableModel)jTableMatriz2.getModel();
        matriz2.setRowCount((int)jSpinRenglones2.getValue());
    }//GEN-LAST:event_jSpinRenglones2StateChanged

    private void jSpinColumnas2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinColumnas2StateChanged
        // TODO add your handling code here:
         matriz2 = (DefaultTableModel)jTableMatriz2.getModel();
         matriz2.setColumnCount((int)jSpinColumnas2.getValue());
    }//GEN-LAST:event_jSpinColumnas2StateChanged

    private void jButParesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButParesActionPerformed
        // TODO add your handling code here:
        mat1  = new int[matriz1.getRowCount()][matriz1.getColumnCount()];
        
        for(int r=0;r<matriz1.getRowCount();r++){
            for(int c=0;c<matriz1.getColumnCount();c++){
            mat1[r][c] = Integer.parseInt(matriz1.getValueAt(r, c)+"");
            }
        }       
        String resu = "Pares por columna A: ";
        for(int i=0;i<Matriz.pares(mat1).length;i++){
            resu += "["+Matriz.pares(mat1)[i]+"] ";
        }
        JOptionPane.showMessageDialog(this, resu);
        
    }//GEN-LAST:event_jButParesActionPerformed

    private void jButPDPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButPDPActionPerformed
        // TODO add your handling code here:
        mat1  = new int[matriz1.getRowCount()][matriz1.getColumnCount()];
        
        for(int r=0;r<matriz1.getRowCount();r++){
            for(int c=0;c<matriz1.getColumnCount();c++){
            mat1[r][c] = Integer.parseInt(matriz1.getValueAt(r, c)+"");
            }
        }
        double prom = Matriz.promDP(mat1);
        if(prom==-1){
        JOptionPane.showMessageDialog(this, "Error, no se puede calcular");
        }else
        JOptionPane.showMessageDialog(this, "Promedio = "+prom);
    }//GEN-LAST:event_jButPDPActionPerformed

    private void jButPDIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButPDIActionPerformed
        // TODO add your handling code here:
        mat1  = new int[matriz1.getRowCount()][matriz1.getColumnCount()];
        
        for(int r=0;r<matriz1.getRowCount();r++){
            for(int c=0;c<matriz1.getColumnCount();c++){
            mat1[r][c] = Integer.parseInt(matriz1.getValueAt(r, c)+"");
            }
        }
        double prom = Matriz.promDI(mat1);
        if(prom==-1){
        JOptionPane.showMessageDialog(this, "Error, no se puede calcular");
        }else
        JOptionPane.showMessageDialog(this, "Promedio = "+prom);
    }//GEN-LAST:event_jButPDIActionPerformed

    private void jButTranspuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButTranspuestaActionPerformed
        // TODO add your handling code here:
        matriz3 = (DefaultTableModel)jTableMatriz3.getModel();
       
        matriz3.setRowCount(matriz1.getColumnCount());
        matriz3.setColumnCount(matriz1.getRowCount());
        
        mat1  = new int[matriz1.getRowCount()][matriz1.getColumnCount()];
   
        for(int r=0;r<matriz1.getRowCount();r++){
            for(int c=0;c<matriz1.getColumnCount();c++){
            mat1[r][c] = Integer.parseInt(matriz1.getValueAt(r, c)+"");
            }
        }
       
        for(int c=0;c<matriz3.getColumnCount();c++)
            for(int r=0;r<matriz3.getColumnCount();r++)
                matriz3.setValueAt(Matriz.transponer(mat1)[r][c], r, c);

    }//GEN-LAST:event_jButTranspuestaActionPerformed

    private void jButMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButMultiplicarActionPerformed
        // TODO add your handling code here:
        matriz3 = (DefaultTableModel)jTableMatriz3.getModel();
        
        if(matriz1.getRowCount()==matriz2.getColumnCount()){
        matriz3.setRowCount(matriz1.getRowCount()); 
        matriz3.setColumnCount(matriz2.getColumnCount());
       
            
        mat1  = new int[matriz1.getRowCount()][matriz1.getColumnCount()];
        
        for(int r=0;r<matriz1.getRowCount();r++){
            for(int c=0;c<matriz1.getColumnCount();c++){
            mat1[r][c] = Integer.parseInt(matriz1.getValueAt(r, c)+"");
            }
        }
                 
        mat2 = new int[matriz2.getRowCount()][matriz2.getColumnCount()];
        for(int r=0;r<matriz2.getRowCount();r++){
            for(int c=0;c<matriz2.getColumnCount();c++){
            mat2[r][c] = Integer.parseInt(matriz2.getValueAt(r, c)+"");
            }
        }

         for(int r=0;r<matriz1.getRowCount();r++){
           for(int c=0;c<matriz2.getColumnCount();c++){
                matriz3.setValueAt(Matriz.multiplicar(mat1, mat2)[r][c], r, c); 
                }
            }
        }else 
            JOptionPane.showMessageDialog(this, "Error, no se puede calcular ");
    }//GEN-LAST:event_jButMultiplicarActionPerformed

    private void jButParesBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButParesBActionPerformed
        // TODO add your handling code here:
         mat2  = new int[matriz2.getRowCount()][matriz2.getColumnCount()];
        
        for(int r=0;r<matriz2.getRowCount();r++){
            for(int c=0;c<matriz2.getColumnCount();c++){
            mat2[r][c] = 0;
            mat2[r][c] = Integer.parseInt(matriz1.getValueAt(r, c)+"");
            }
        }       
        String resu = "Pares por columna B: ";
        for(int i=0;i<Matriz.pares(mat2).length;i++){
            resu += "["+Matriz.pares(mat2)[i]+"] ";
        }
        JOptionPane.showMessageDialog(this, resu);
        
    }//GEN-LAST:event_jButParesBActionPerformed

    private void jButNonesBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButNonesBActionPerformed
        // TODO add your handling code here:
         mat2 = new int[matriz2.getRowCount()][matriz2.getColumnCount()];
        
        for(int r=0;r<matriz2.getRowCount();r++){
            for(int c=0;c<matriz2.getColumnCount();c++){
            mat2[r][c] = 0;
            mat2[r][c] = Integer.parseInt(matriz2.getValueAt(r, c)+"");
            }
        }
       
       String resu = "Nones por renglon B: ";
        for(int i=0;i<Matriz.nones(mat2).length;i++){
            resu += "["+Matriz.nones(mat2)[i]+"] ";
        }
         JOptionPane.showMessageDialog(this, resu);
    }//GEN-LAST:event_jButNonesBActionPerformed

    private void jButPDPBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButPDPBActionPerformed
        // TODO add your handling code here:
         mat2 = new int[matriz2.getRowCount()][matriz2.getColumnCount()];
        
        for(int r=0;r<matriz2.getRowCount();r++){
            for(int c=0;c<matriz2.getColumnCount();c++){
            mat2[r][c] = 0;
            mat2[r][c] = Integer.parseInt(matriz2.getValueAt(r, c)+"");
            }
        }
        double prom = Matriz.promDP(mat2);
        if(prom==-1){
        JOptionPane.showMessageDialog(this, "Error, no se puede calcular");
        }else
        JOptionPane.showMessageDialog(this, "Promedio = "+prom);
    }//GEN-LAST:event_jButPDPBActionPerformed

    private void jButPDIBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButPDIBActionPerformed
        // TODO add your handling code here:
         mat2 = new int[matriz2.getRowCount()][matriz2.getColumnCount()];
        
        for(int r=0;r<matriz2.getRowCount();r++){
            for(int c=0;c<matriz2.getColumnCount();c++){
            mat2[r][c] = 0;
            mat2[r][c] = Integer.parseInt(matriz2.getValueAt(r, c)+"");
            }
        }
        double prom = Matriz.promDI(mat2);
        if(prom==-1){
        JOptionPane.showMessageDialog(this, "Error, no se puede calcular");
        }else
        JOptionPane.showMessageDialog(this, "Promedio = "+prom);
    }//GEN-LAST:event_jButPDIBActionPerformed

    private void jButTranspuestaBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButTranspuestaBActionPerformed
        // TODO add your handling code here:
        matriz3 = (DefaultTableModel)jTableMatriz3.getModel();
       
        matriz3.setRowCount(matriz2.getColumnCount());
        matriz3.setColumnCount(matriz2.getRowCount());
        
        mat2  = new int[matriz2.getRowCount()][matriz2.getColumnCount()];
   
        for(int r=0;r<matriz2.getRowCount();r++){
            for(int c=0;c<matriz2.getColumnCount();c++){
            mat2[r][c] = 0;
            mat2[r][c] = Integer.parseInt(matriz2.getValueAt(r, c)+"");
            }
        }
       
        for(int c=0;c<matriz3.getColumnCount();c++)
            for(int r=0;r<matriz3.getColumnCount();r++)
                matriz3.setValueAt(Matriz.transponer(mat2)[r][c], r, c);
    }//GEN-LAST:event_jButTranspuestaBActionPerformed

    private void jTableMatriz1ComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTableMatriz1ComponentResized
        // TODO add your handling code here:
         if((int)jSpinColumnas1.getValue()>0&&(int)jSpinRenglones1.getValue()>0){
        jButPares.setEnabled(true);
        jButNones.setEnabled(true);
        jButPDI.setEnabled(true);
        jButPDP.setEnabled(true);
        jButTranspuesta.setEnabled(true);
        jSpinColumnas2.setEnabled(true);
        jSpinRenglones2.setEnabled(true);
        jButAleatorios2.setEnabled(true);
        }
    }//GEN-LAST:event_jTableMatriz1ComponentResized

    private void jTableMatriz2ComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTableMatriz2ComponentResized
        // TODO add your handling code here:
        if((int)jSpinColumnas2.getValue()>0&&(int)jSpinRenglones2.getValue()>0){
        jButParesB.setEnabled(true);
        jButNonesB.setEnabled(true);
        jButPDIB.setEnabled(true);
        jButPDPB.setEnabled(true);
        jButTranspuestaB.setEnabled(true);
         jButMultiplicar.setEnabled(true);
        }
    }//GEN-LAST:event_jTableMatriz2ComponentResized

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
            java.util.logging.Logger.getLogger(APPMatrizGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(APPMatrizGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(APPMatrizGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(APPMatrizGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new APPMatrizGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButAleatorios;
    private javax.swing.JButton jButAleatorios2;
    private javax.swing.JButton jButMultiplicar;
    private javax.swing.JButton jButNones;
    private javax.swing.JButton jButNonesB;
    private javax.swing.JButton jButPDI;
    private javax.swing.JButton jButPDIB;
    private javax.swing.JButton jButPDP;
    private javax.swing.JButton jButPDPB;
    private javax.swing.JButton jButPares;
    private javax.swing.JButton jButParesB;
    private javax.swing.JButton jButTranspuesta;
    private javax.swing.JButton jButTranspuestaB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner jSpinColumnas1;
    private javax.swing.JSpinner jSpinColumnas2;
    private javax.swing.JSpinner jSpinRenglones1;
    private javax.swing.JSpinner jSpinRenglones2;
    private javax.swing.JTable jTableMatriz1;
    private javax.swing.JTable jTableMatriz2;
    private javax.swing.JTable jTableMatriz3;
    // End of variables declaration//GEN-END:variables
}
