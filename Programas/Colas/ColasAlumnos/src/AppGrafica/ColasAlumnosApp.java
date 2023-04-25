/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppGrafica;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author friosa
 */
public class ColasAlumnosApp extends javax.swing.JFrame {
    Cola grupo1 = new Cola();
    Cola grupo2 = new Cola(5);
    /**
     * Creates new form ColasAlumnosApp
     */
    public ColasAlumnosApp() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnLeerAlu = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblLeerAlu = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        rb1 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNoAlusGpo = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblVisuaGrupo = new javax.swing.JTable();
        btnVisuaGrupo = new javax.swing.JButton();
        btnInterRef = new javax.swing.JButton();
        btnInterColaAux = new javax.swing.JButton();
        btnEli2Prim2Ult = new javax.swing.JButton();
        btnEliMenosPrimUlt = new javax.swing.JButton();
        btnInterUlt = new javax.swing.JButton();
        btnReacomodo = new javax.swing.JButton();
        btnInvertir = new javax.swing.JButton();
        btnTiene2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "ALUMNO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        btnLeerAlu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLeerAlu.setText("LEER ALUMNO");
        btnLeerAlu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeerAluActionPerformed(evt);
            }
        });

        tblLeerAlu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblLeerAlu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "NO. CTRL", "NOMBRE", "CALIFICACION"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblLeerAlu);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnLeerAlu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLeerAlu)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "SELECCIONA:"));

        buttonGroup1.add(rb1);
        rb1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rb1.setSelected(true);
        rb1.setText("GRUPO 1");

        buttonGroup1.add(rb2);
        rb2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rb2.setText("GRUPO 2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rb1)
                    .addComponent(rb2))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(rb1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rb2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblNoAlusGpo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblNoAlusGpo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "GRUPO 1", "GRUPO 2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblNoAlusGpo);

        tblVisuaGrupo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tblVisuaGrupo);

        btnVisuaGrupo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnVisuaGrupo.setText("VISUA GRUPO");
        btnVisuaGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisuaGrupoActionPerformed(evt);
            }
        });

        btnInterRef.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnInterRef.setText("INTER -REF-");
        btnInterRef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInterRefActionPerformed(evt);
            }
        });

        btnInterColaAux.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnInterColaAux.setText("INTER -COLAS-");
        btnInterColaAux.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInterColaAuxActionPerformed(evt);
            }
        });

        btnEli2Prim2Ult.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEli2Prim2Ult.setText("ELI2PRIM2ULT");
        btnEli2Prim2Ult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEli2Prim2UltActionPerformed(evt);
            }
        });

        btnEliMenosPrimUlt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEliMenosPrimUlt.setText("ELI MENOS P Y U");
        btnEliMenosPrimUlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliMenosPrimUltActionPerformed(evt);
            }
        });

        btnInterUlt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnInterUlt.setText("INTER ULTIMOS");
        btnInterUlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInterUltActionPerformed(evt);
            }
        });

        btnReacomodo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnReacomodo.setText("REACOMODO");
        btnReacomodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReacomodoActionPerformed(evt);
            }
        });

        btnInvertir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnInvertir.setText("INVERTIR");
        btnInvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInvertirActionPerformed(evt);
            }
        });

        btnTiene2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnTiene2.setText("TIENE 2?");
        btnTiene2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTiene2ActionPerformed(evt);
            }
        });

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
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
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnVisuaGrupo)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnTiene2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnInterColaAux, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnInterRef, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEli2Prim2Ult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliMenosPrimUlt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnInterUlt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnReacomodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnInvertir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnInterRef, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVisuaGrupo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnInterColaAux)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEli2Prim2Ult)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliMenosPrimUlt)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnInterUlt)
                            .addComponent(jButton2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnReacomodo))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3)
                                .addGap(10, 10, 10)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnInvertir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTiene2)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        tblNoAlusGpo.setValueAt(grupo1.Length(),0,0);
        tblNoAlusGpo.setValueAt(grupo2.Length(),0,1);
    }//GEN-LAST:event_formWindowOpened

    private void btnLeerAluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeerAluActionPerformed
        Cola grupoSel = rb1.isSelected()? grupo1 : grupo2;
        if (! grupoSel.Full()) {
            TipoElem elem = new TipoElem(tblLeerAlu.getValueAt(0,0).toString(),
                                    tblLeerAlu.getValueAt(0,1).toString(),
                           Integer.parseInt(tblLeerAlu.getValueAt(0,2).toString()));
            grupoSel.Insert(elem);
            tblNoAlusGpo.setValueAt(grupoSel.Length(), 0, rb1.isSelected()? 0 : 1);
        }
        else
            JOptionPane.showMessageDialog(this,"EL GRUPO YA ESTA LLENO ...",
                    "INSERCION",JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_btnLeerAluActionPerformed

    private void btnVisuaGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisuaGrupoActionPerformed
        Cola grupoSel = rb1.isSelected()? grupo1 : grupo2;
        Cola aux = new Cola(grupoSel.Length());
        DefaultTableModel modelo = (DefaultTableModel) tblVisuaGrupo.getModel();
        modelo.setColumnCount(0);
        for(int i=grupoSel.Length();i > 0;i--)
            modelo.addColumn(i);
        int col = grupoSel.Length() - 1; // columna con valor de 2 
        while (!grupoSel.Empty()) { //mientras que no este vacia 
            TipoElem elem = grupoSel.Remove(); //hacemos un remove 
            tblVisuaGrupo.setValueAt(elem.NoCon(),0,col); // visualizamos al grupo 
            tblVisuaGrupo.setValueAt(elem.Nombre(),1,col);
            tblVisuaGrupo.setValueAt(elem.Calif(),2,col--);
            aux.Insert(elem); // se inserta en el auxiliar 
        }
        while (!aux.Empty()) 
            grupoSel.Insert(aux.Remove());
    }//GEN-LAST:event_btnVisuaGrupoActionPerformed

    private void btnInterRefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInterRefActionPerformed
        Cola aux = grupo1;
        grupo1 = grupo2;
        grupo2 = aux;
        JOptionPane.showMessageDialog(this,"SE EFECTUÓ EL INTERCAMBIO DE GRUPOS ...",
                    "INTERCAMBIO",JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_btnInterRefActionPerformed

    private void btnInterColaAuxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInterColaAuxActionPerformed
        Cola aux1 = new Cola(grupo1.Length());
        Cola aux2 = new Cola(grupo2.Length());
        
        while(!grupo1.Empty())
            aux1.Insert(grupo1.Remove());
        
        while(!grupo2.Empty())
            aux2.Insert(grupo2.Remove());
        
        while(!aux1.Empty())
            grupo2.Insert(aux1.Remove());
        
        while(!aux2.Empty())
            grupo1.Insert(aux2.Remove());
        
        
    }//GEN-LAST:event_btnInterColaAuxActionPerformed

    private void btnEli2Prim2UltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEli2Prim2UltActionPerformed
        Cola grupoSel = rb1.isSelected()? grupo1 : grupo2;
        if (grupoSel.Length() > 3) {
            grupoSel.Remove();
            grupoSel.Remove();
            Cola aux = new Cola();
            while (grupoSel.Length() > 2)
                aux.Insert(grupoSel.Remove());
            grupoSel.Remove();
            grupoSel.Remove();
            while(!aux.Empty())
                grupoSel.Insert(aux.Remove());
            tblNoAlusGpo.setValueAt(grupoSel.Length(), 0 ,rb1.isSelected()? 0 : 1);
            JOptionPane.showMessageDialog(this,"SE ELIMINARON LOS 2 P Y 2 U ...",
                    "ELIMINACIÓN 2 PRIM 2 ULT",JOptionPane.PLAIN_MESSAGE);
        }
        else
            JOptionPane.showMessageDialog(this,"NO ES POSIBLE ELIMINAR MENOS DE 4 ...",
                    "ELIMINACIÓN 2 PRIM 2 ULT",JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_btnEli2Prim2UltActionPerformed

    private void btnEliMenosPrimUltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliMenosPrimUltActionPerformed
        Cola grupoSel = rb1.isSelected()? grupo1 : grupo2;
        
        if (grupoSel.Length() > 2) {
            Cola aux=new Cola();
            grupoSel.Remove();
            aux.Insert(grupoSel.Remove());
            while(grupoSel.Length()>2){
                grupoSel.Remove();
            }
            aux.Insert(grupoSel.Remove());
            grupoSel.Remove();
            grupoSel.Insert(aux.Remove());
            grupoSel.Insert(aux.Remove());
            tblNoAlusGpo.setValueAt(grupoSel.Length(), 0 ,rb1.isSelected()? 0 : 1);
            JOptionPane.showMessageDialog(this,"SE ELIMINARON TODOS MENOS LOS P Y U ...",
                    "ELIMINACIÓN TODOS MENOS PRIM Y ULT",JOptionPane.PLAIN_MESSAGE);
        }
        else
            JOptionPane.showMessageDialog(this,"NO ES POSIBLE ELIMINAR  ...",
                    "ELIMINACIÓN TODOS MENOS PRIM Y ULT",JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_btnEliMenosPrimUltActionPerformed

    private void btnInterUltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInterUltActionPerformed
        if (! grupo1.Empty() && ! grupo2.Empty()) {
            Cola aux1 = new Cola();
            Cola aux2 = new Cola();
            while (grupo1.Length() > 1)
                aux1.Insert(grupo1.Remove());
            while (grupo2.Length() > 1)
                aux2.Insert(grupo2.Remove());
            TipoElem ult1 = grupo1.Remove();
            TipoElem ult2 = grupo2.Remove();
            while (!aux1.Empty())
                grupo1.Insert(aux1.Remove());
            while (!aux2.Empty())
                grupo2.Insert(aux2.Remove());
            if (ult1.Calif() >= 70 && ult2.Calif() >= 70) {
                grupo1.Insert(ult2);
                grupo2.Insert(ult1);
            }
            else {
                grupo1.Insert(ult1);
                grupo2.Insert(ult2);
            }
        }
    }//GEN-LAST:event_btnInterUltActionPerformed

    private void btnReacomodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReacomodoActionPerformed
        Cola grupoSel = rb1.isSelected()? grupo1 : grupo2;
        if (grupoSel.Length() < 2)
            JOptionPane.showMessageDialog(this,"NO ES POSIBLE REACOMODAR  ...",
                    "REACOMODO",JOptionPane.PLAIN_MESSAGE);
        else {
            ArrayList<TipoElem> aprob = new ArrayList<>();
            ArrayList<TipoElem> reprob = new ArrayList<>();
            while(! grupoSel.Empty()) {
                TipoElem elem = grupoSel.Remove();
                if (elem.Calif() >= 70)
                    aprob.add(elem);
                else
                    reprob.add(elem);
            }
            for(TipoElem alu : reprob) 
                grupoSel.Insert(alu);
            for(TipoElem alu : aprob) 
                grupoSel.Insert(alu);
            JOptionPane.showMessageDialog(this,"EL REACOMODO FUE EXITOSO  ...",
                    "REACOMODO",JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_btnReacomodoActionPerformed

    private void btnInvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvertirActionPerformed
        Cola grupoSel = rb1.isSelected()? grupo1 : grupo2;
        if (grupoSel.Length() < 2)
            JOptionPane.showMessageDialog(this,"NO ES POSIBLE INVERTIR  ...",
                    "INVERTIR",JOptionPane.PLAIN_MESSAGE);
        else {
            ArrayList<TipoElem> aux = new ArrayList<>();
            while (! grupoSel.Empty())
                aux.add(grupoSel.Remove());
            for(int i=aux.size()-1;i >= 0;i--)
                grupoSel.Insert(aux.get(i));
            JOptionPane.showMessageDialog(this,"LA COLA SE INVIRTIÓ CON ÉXITO  ...",
                    "INVERTIR",JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_btnInvertirActionPerformed

    private void btnTiene2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTiene2ActionPerformed
        Cola grupoSel = rb1.isSelected()? grupo1 : grupo2;
        int noElems = 0;
        Cola aux = new Cola();
        while(!grupoSel.Empty()) {
            noElems++;
            aux.Insert(grupoSel.Remove());
        }
        while(!aux.Empty()) 
            grupoSel.Insert(aux.Remove());
        JOptionPane.showMessageDialog(this,
          (noElems == 2? "EL GRUPO TIENE 2 ALUMNOS" : "EL GRUPO NO TIENE 2 ALUMNOS"),
                    "TIENE 2?",JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_btnTiene2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         Cola grupoSel = rb1.isSelected()? grupo1 : grupo2;
        
        if (grupoSel.Length() > 2) {
            Cola aux=new Cola();
            aux.Insert(grupoSel.Remove());
            while(grupoSel.Length()>1)
                grupoSel.Remove();
            aux.Insert(grupoSel.Remove());
            grupoSel.Insert(aux.Remove());
            grupoSel.Insert(aux.Remove());
            tblNoAlusGpo.setValueAt(grupoSel.Length(), 0 ,rb1.isSelected()? 0 : 1);
            JOptionPane.showMessageDialog(this,"SE ELIMINARON TODOS MENOS LOS P Y U ...",
                    "ELIMINACIÓN TODOS MENOS PRIM Y ULT",JOptionPane.PLAIN_MESSAGE);
        }
        else
            JOptionPane.showMessageDialog(this,"NO ES POSIBLE ELIMINAR  ...",
                    "ELIMINACIÓN TODOS MENOS PRIM Y ULT",JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Cola grupoSel = rb1.isSelected()? grupo1 : grupo2;
        grupoSel.Examen();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Cola grupoSel = rb1.isSelected()? grupo1 : grupo2;
        grupoSel.ElimiPSPUU();
        
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(ColasAlumnosApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ColasAlumnosApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ColasAlumnosApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ColasAlumnosApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ColasAlumnosApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEli2Prim2Ult;
    private javax.swing.JButton btnEliMenosPrimUlt;
    private javax.swing.JButton btnInterColaAux;
    private javax.swing.JButton btnInterRef;
    private javax.swing.JButton btnInterUlt;
    private javax.swing.JButton btnInvertir;
    private javax.swing.JButton btnLeerAlu;
    private javax.swing.JButton btnReacomodo;
    private javax.swing.JButton btnTiene2;
    private javax.swing.JButton btnVisuaGrupo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JTable tblLeerAlu;
    private javax.swing.JTable tblNoAlusGpo;
    private javax.swing.JTable tblVisuaGrupo;
    // End of variables declaration//GEN-END:variables
}
