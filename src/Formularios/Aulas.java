/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Formularios;
import Clases.tablas.*;
import Clases.*;
/**
 *
 * @author Nataly
 */
public class Aulas extends javax.swing.JInternalFrame {

    private Conexion con;
    /**
     * Creates new form Aulas
     */
    public Aulas() {
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

        jPanel1 = new javax.swing.JPanel();
        lbl_unidad_academica = new javax.swing.JLabel();
        lbl_Nombre_Unid_Academica = new javax.swing.JLabel();
        lbl_Estado_Unid_Academica = new javax.swing.JLabel();
        Txt_descripcion = new javax.swing.JTextField();
        btn_Guardar_Unid_aula = new javax.swing.JButton();
        btn_Eliminar_Unid_aula = new javax.swing.JButton();
        btn_Actualizar_Unid_aula = new javax.swing.JButton();
        chkb_estado_aulas = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        btn_nuevo_aula = new javax.swing.JButton();
        cbx_ubicacion = new javax.swing.JComboBox();

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        lbl_unidad_academica.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_unidad_academica.setForeground(new java.awt.Color(255, 255, 255));
        lbl_unidad_academica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_unidad_academica.setText("Aulas");

        lbl_Nombre_Unid_Academica.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_Nombre_Unid_Academica.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Nombre_Unid_Academica.setText("Descripcion");

        lbl_Estado_Unid_Academica.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_Estado_Unid_Academica.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Estado_Unid_Academica.setText("Estado Aulas");

        btn_Guardar_Unid_aula.setText("Guardar");
        btn_Guardar_Unid_aula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Guardar_Unid_aulaActionPerformed(evt);
            }
        });

        btn_Eliminar_Unid_aula.setText("Eliminar");
        btn_Eliminar_Unid_aula.setEnabled(false);
        btn_Eliminar_Unid_aula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Eliminar_Unid_aulaActionPerformed(evt);
            }
        });

        btn_Actualizar_Unid_aula.setText("Actualizar");
        btn_Actualizar_Unid_aula.setEnabled(false);
        btn_Actualizar_Unid_aula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Actualizar_Unid_aulaActionPerformed(evt);
            }
        });

        btn_nuevo_aula.setText("Nuevo");
        btn_nuevo_aula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevo_aulaActionPerformed(evt);
            }
        });

        cbx_ubicacion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbx_ubicacionItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_nuevo_aula, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Guardar_Unid_aula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Actualizar_Unid_aula))
                    .addComponent(lbl_unidad_academica, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(cbx_ubicacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btn_Eliminar_Unid_aula))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lbl_Nombre_Unid_Academica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbl_Estado_Unid_Academica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(chkb_estado_aulas))))
                            .addGap(2, 2, 2))))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lbl_unidad_academica)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Eliminar_Unid_aula)
                    .addComponent(cbx_ubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Nombre_Unid_Academica)
                            .addComponent(Txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lbl_Estado_Unid_Academica))
                    .addComponent(chkb_estado_aulas, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Guardar_Unid_aula)
                    .addComponent(btn_Actualizar_Unid_aula)
                    .addComponent(btn_nuevo_aula))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 434, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(1, 1, 1)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_Guardar_Unid_aulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Guardar_Unid_aulaActionPerformed
        Aulas aulas = new Aulas();
        aulas.setDescripcion_Ubicacion(this.Txt_descripcion.getText());
        aulas.setEstado_Ubicacion(this.chkb_estado_aulas.isSelected());
        Integer id = aulas.guardar(con); //guarda el registro y retorna el id generado

        if (id != null) {
            aulas.setCod_Aulas(id.intValue());
            cbx_ubicacion.addItem(aulas);
            if (aulas.isEstado_Aulas()) {
                cbx_Cod_Aulas.addItem(aulas);
            }

            this.btn_nuevo_aulasActionPerformed(null);
            JOptionPane.showMessageDialog(null, "El Registro se Guardo con Exito");
        } else {
            JOptionPane.showMessageDialog(null, "Error , Fallo al Guardar el Registro");
        }
    }//GEN-LAST:event_btn_Guardar_Unid_aulaActionPerformed

    private void btn_Eliminar_Unid_aulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Eliminar_Unid_aulaActionPerformed
        Aulas aulas = (Aulas) cbx_ubicacion.getSelectedItem();
        if (aulas != null && aulas.getDescripcion_Ubicacion() != null) {
            int result = JOptionPane.showConfirmDialog(this, "Desea Eliminar el Registro", "Salir", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_NO_OPTION) {
                if (aulas.eliminar(con)) {
                    JOptionPane.showMessageDialog(null, "El Registro se Elimino con Exito");
                    this.btn_nuevo_aulasPerformed(null);
                } else {
                    JOptionPane.showMessageDialog(null, "Error , Fallo al Eliminar el Registro");
                }
            }
        }
        this.obtenerAulas();
    }//GEN-LAST:event_btn_Eliminar_Unid_aulaActionPerformed

    private void btn_Actualizar_Unid_aulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Actualizar_Unid_aulaActionPerformed
        Aulas aulas = (Aulas) cbx_ubicacion.getSelectedItem();
        if (aulas != null && aulas.getCod_Aulas() =! null) {
            aulas.setDescripcion_Ubicacion(this.Txt_descripcion.getText());
            aulas.setEstado_Ubicacion(this.chkb_estado_aulas.isSelected());
            if (aulas.actualizar_aulas(con)) {
                JOptionPane.showMessageDialog(null, "El Registro se actualizo con Exito");
                this.btn_nuevo_aulasActionPerformed(null);
            } else {
                JOptionPane.showMessageDialog(null, "Error , Fallo al actualizar el Registro");
            }
        }
        this.obtenerAulas();
    }//GEN-LAST:event_btn_Actualizar_Unid_aulaActionPerformed

    private void btn_nuevo_aulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevo_aulaActionPerformed
        this.Txt_descripcion.setText("");
        this.chkb_estado_aulas.setSelected(false);
        this.cbx_ubicacion.setSelectedIndex(0);
    }//GEN-LAST:event_btn_nuevo_aulaActionPerformed

    private void cbx_ubicacionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbx_ubicacionItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            Aulas item = (Aulas) evt.getItem();
            if (item.getNombre_Unid_Academica() != null) {
                controlesAulas(false);
                this.Txt_descripcion.setText(item.getDescripcion_Ubicacion());
                this.chkb_estado_aulas.setSelected(item.isEstado_Aulas());
            } else {
                controlesAulas(true);
            }
        }
    }//GEN-LAST:event_cbx_ubicacionItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Txt_descripcion;
    private javax.swing.JButton btn_Actualizar_Unid_aula;
    private javax.swing.JButton btn_Eliminar_Unid_aula;
    private javax.swing.JButton btn_Guardar_Unid_aula;
    private javax.swing.JButton btn_nuevo_aula;
    private javax.swing.JComboBox cbx_ubicacion;
    private javax.swing.JCheckBox chkb_estado_aulas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_Estado_Unid_Academica;
    private javax.swing.JLabel lbl_Nombre_Unid_Academica;
    private javax.swing.JLabel lbl_unidad_academica;
    // End of variables declaration//GEN-END:variables
}
