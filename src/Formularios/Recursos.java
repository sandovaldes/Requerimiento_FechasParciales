/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Formularios;

/**
 *
 * @author Nataly
 */
public class Recursos extends javax.swing.JInternalFrame {

    /**
     * Creates new form Recursos
     */
    public Recursos() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_descripcion = new javax.swing.JTextField();
        txt_estado_recurso = new javax.swing.JTextField();
        btn_Agregar_recurso = new javax.swing.JButton();
        btn_limpiar_recurso = new javax.swing.JButton();
        cbx_Cod_Facultad = new javax.swing.JComboBox();
        btn_Actualizar_Facultad1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_tipo_recurso = new javax.swing.JTextField();
        txt_estado_tipo_recurso = new javax.swing.JTextField();
        btn_agregar_tipo = new javax.swing.JButton();
        btn_limpiar_tipo = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btn_Actualizar_Facultad = new javax.swing.JButton();
        cbx_Cod_Facultad1 = new javax.swing.JComboBox();
        cbx_materias = new javax.swing.JComboBox();
        btn_EliminarMaterias = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Recursos");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Codigo Tipo Recurso");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Descripcion");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Estado de Recurso");

        btn_Agregar_recurso.setText("AGREGAR");
        btn_Agregar_recurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Agregar_recursoActionPerformed(evt);
            }
        });

        btn_limpiar_recurso.setText("LIMPIAR");
        btn_limpiar_recurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiar_recursoActionPerformed(evt);
            }
        });

        btn_Actualizar_Facultad1.setEnabled(false);
        btn_Actualizar_Facultad1.setLabel("Actualizar");
        btn_Actualizar_Facultad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Actualizar_Facultad1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btn_Agregar_recurso)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_limpiar_recurso)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_estado_recurso, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btn_Actualizar_Facultad1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(28, 28, 28)
                        .addComponent(cbx_Cod_Facultad, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(56, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbx_Cod_Facultad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_estado_recurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_limpiar_recurso)
                    .addComponent(btn_Agregar_recurso)
                    .addComponent(btn_Actualizar_Facultad1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INSERCION DE RECURSOS");

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tipo de recursos");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tipo de Recurso");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Estado de Tipo de Recurso");

        btn_agregar_tipo.setText("AGREGAR");
        btn_agregar_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregar_tipoActionPerformed(evt);
            }
        });

        btn_limpiar_tipo.setText("LIMPIAR");
        btn_limpiar_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiar_tipoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Codigo Tipo de Recurso");

        btn_Actualizar_Facultad.setEnabled(false);
        btn_Actualizar_Facultad.setLabel("Actualizar");
        btn_Actualizar_Facultad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Actualizar_FacultadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_tipo_recurso, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbx_Cod_Facultad1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_estado_tipo_recurso, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btn_agregar_tipo)
                                .addGap(18, 18, 18)
                                .addComponent(btn_limpiar_tipo)
                                .addGap(18, 18, 18)
                                .addComponent(btn_Actualizar_Facultad)))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cbx_Cod_Facultad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_tipo_recurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(45, 45, 45))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(txt_estado_tipo_recurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_agregar_tipo)
                    .addComponent(btn_limpiar_tipo)
                    .addComponent(btn_Actualizar_Facultad))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        cbx_materias.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbx_materiasItemStateChanged(evt);
            }
        });

        btn_EliminarMaterias.setText("Eliminar");
        btn_EliminarMaterias.setEnabled(false);
        btn_EliminarMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarMateriasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(254, 254, 254))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(cbx_materias, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btn_EliminarMaterias)
                        .addGap(207, 207, 207))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 763, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbx_materias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_EliminarMaterias))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_Agregar_recursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Agregar_recursoActionPerformed

        recursos.setCod_tipo_recurso(Integer.parseInt(this.txt_cod_tipo_recurso.getText()));
        recursos.setDescripcion_recurso(this.txt_descripcion.getText());
        recursos.setEstado_recurso(this.txt_estado_tipo_recurso.getText());

        if (recursos.guardar_recursos(recursos) == 0) {
            JOptionPane.showMessageDialog(null, "El Registro se Guardo con Exito");
        } else {
            JOptionPane.showMessageDialog(null, "Error , Fallo al Guardar el Registro");
        }

    }//GEN-LAST:event_btn_Agregar_recursoActionPerformed

    private void btn_limpiar_recursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiar_recursoActionPerformed
        this.txt_descripcion.setText("");
        this.txt_estado_recurso.setText("");

    }//GEN-LAST:event_btn_limpiar_recursoActionPerformed

    private void btn_agregar_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregar_tipoActionPerformed

        tipo_recursos.setCod_tipo_recurso(Integer.parseInt(this.txt_Cod_tipo_recurso.getText()));
        tipo_recursos.setTipo_recurso(this.txt_tipo_recurso.getText());
        tipo_recursos.setEstado_tipo_recurso(this.txt_estado_tipo_recurso.getText());

        if (tipo_recursos.guardar_tipo_recursos(tipo_recursos) == 0) {
            JOptionPane.showMessageDialog(null, "El Registro se Guardo con Exito");
        } else {
            JOptionPane.showMessageDialog(null, "Error , Fallo al Guardar el Registro");
        }

    }//GEN-LAST:event_btn_agregar_tipoActionPerformed

    private void btn_limpiar_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiar_tipoActionPerformed
        this.txt_Cod_tipo_recurso.setText("");
        this.txt_tipo_recurso.setText("");
        this.txt_estado_tipo_recurso.setText("");

    }//GEN-LAST:event_btn_limpiar_tipoActionPerformed

    private void cbx_materiasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbx_materiasItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            Materias item = (Materias) evt.getItem();
            if (item.getNombre_Materia() != null) {
                controlesMaterias(false);
                this.cbx_Cod_Facultad.setSelectedItem(new Facultades(item.getCod_Facultad()));
                this.txt_Abreviatura_Materia.setText(item.getAbreviatura_Materia());
                this.txt_CicloMateria.setText(item.getCiclo_Materia());
                this.chkb_estado_materia.setSelected(item.isEstado_Materia());
                this.txt_NombreMateria.setText(item.getNombre_Materia());
                this.txt_UV.setText(String.valueOf(item.getUV_Materia()));
            }
            else
            controlesMaterias(true);
        }
    }//GEN-LAST:event_cbx_materiasItemStateChanged

    private void btn_EliminarMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarMateriasActionPerformed
        Materias materia = (Materias) cbx_materias.getSelectedItem();
        if (materia != null && materia.getNombre_Materia() != null) {
            int result = JOptionPane.showConfirmDialog(this, "Desea Eliminar el Registro", "Salir", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_NO_OPTION) {
                if (materia.eliminar(con)) {
                    JOptionPane.showMessageDialog(null, "El Registro se Elimino con Exito");
                    this.btn_Nuevo_MateriaActionPerformed(null);
                    obtenerMaterias();
                } else {
                    JOptionPane.showMessageDialog(null, "Error , Fallo al Eliminar el Registro");
                }
            }
        }
    }//GEN-LAST:event_btn_EliminarMateriasActionPerformed

    private void btn_Actualizar_FacultadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Actualizar_FacultadActionPerformed
        Facultades facultad = (Facultades) cbx_facultades.getSelectedItem();
        UnidadAcademica unidad = (UnidadAcademica) cbx_Cod_Unid_Academica.getSelectedItem();
        if (facultad != null && facultad.getNombre_Facultad() != null) {
            facultad.setNombre_Facultad(this.Txt_Nombre_Facultad.getText());
            facultad.setEstado_Facultad(this.chkb_estado_facultad.isSelected());
            facultad.setCod_Unid_Academica(unidad.getCod_Unid_Academica());
            if (facultad.actualizar(con)) {
                JOptionPane.showMessageDialog(null, "El Registro se actualizo con Exito");
                this.btn_Nuevo_FacultadActionPerformed(null);
            } else {
                JOptionPane.showMessageDialog(null, "Error , Fallo al actualizar el Registro");
            }
        }
        this.obtenerFacultades();
    }//GEN-LAST:event_btn_Actualizar_FacultadActionPerformed

    private void btn_Actualizar_Facultad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Actualizar_Facultad1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Actualizar_Facultad1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Actualizar_Facultad;
    private javax.swing.JButton btn_Actualizar_Facultad1;
    private javax.swing.JButton btn_Agregar_recurso;
    private javax.swing.JButton btn_EliminarMaterias;
    private javax.swing.JButton btn_agregar_tipo;
    private javax.swing.JButton btn_limpiar_recurso;
    private javax.swing.JButton btn_limpiar_tipo;
    private javax.swing.JComboBox cbx_Cod_Facultad;
    private javax.swing.JComboBox cbx_Cod_Facultad1;
    private javax.swing.JComboBox cbx_materias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField txt_descripcion;
    private javax.swing.JTextField txt_estado_recurso;
    private javax.swing.JTextField txt_estado_tipo_recurso;
    private javax.swing.JTextField txt_tipo_recurso;
    // End of variables declaration//GEN-END:variables
}