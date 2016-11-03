/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 Acuerdo: Lucia
 */
package Formularios;

import Clases.Conexion;
import Clases.tablas.Personas;
import Clases.tablas.Facultades;
import Clases.tablas.Roles;
import Clases.tablas.Usuarios;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;

//VER
public class RolesUsuariosForm extends javax.swing.JInternalFrame {

    private Conexion con;

    public RolesUsuariosForm() throws SQLException {
        initComponents();
        con = new Conexion();
        this.obtenerRoles();
        this.obtenerUsuarios();
        this.obtenerDcoentes();

    }

    private void obtenerRoles() {
        //Eliminamos todos los elementos de los combobox
        ((DefaultComboBoxModel) cbx_Roles.getModel()).removeAllElements();
        ((DefaultComboBoxModel) cbx_Roles_U.getModel()).removeAllElements();

        ArrayList lista = null;
        try {
            lista = Roles.getRoles(con);
            cbx_Roles.addItem(new Roles("Seleccione"));

        } catch (SQLException ex) {
            Logger.getLogger(RolesUsuariosForm.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (Object o : lista) {
            Roles item = (Roles) o;
            cbx_Roles.addItem(item);
            if (item.isEstado_Rol()) {
                cbx_Roles_U.addItem(o);
            }
        }
    }

    private void controlesRoles(boolean estado) {
        this.btn_Guardar_rol.setEnabled(estado);
        this.btn_Actualizar_rol.setEnabled(!estado);
        this.btn_Eliminar_rol.setEnabled(!estado);

    }

    private void obtenerUsuarios() {
        //Eliminamos todos los elementos de los combobox
        ((DefaultComboBoxModel) cbx_Roles_Usuario.getModel()).removeAllElements();

        ArrayList lista = null;
        try {
            lista = Usuarios.getUsuarios(con);
            cbx_Roles_Usuario.addItem(new Usuarios("Seleccione"));

        } catch (SQLException ex) {
            Logger.getLogger(RolesUsuariosForm.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (Object o : lista) {
            Usuarios item = (Usuarios) o;
            cbx_Roles_Usuario.addItem(item);

        }
    }

    private void obtenerDcoentes() {
        //Eliminamos todos los elementos de los combobox
        ((DefaultComboBoxModel) cbx_Personas_U.getModel()).removeAllElements();

        ArrayList lista = null;
        try {
            lista = Personas.getPersonas(con);
            cbx_Personas_U.addItem(new Personas("Seleccione", "", "", ""));

        } catch (SQLException ex) {
            Logger.getLogger(RolesUsuariosForm.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (Object o : lista) {
            Personas item = (Personas) o;
            cbx_Personas_U.addItem(item);
        }
    }

    private void controlesUsuarios(boolean estado) {
        //  this.btn_Actualizar_Usuarios.setEnabled(!estado);
        //   this.btn_Eliminar_Usuarios.setEnabled(!estado);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_Titulo_ResParcial = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        cbx_Roles = new javax.swing.JComboBox();
        txt_Nombre_rol = new javax.swing.JTextField();
        btn_Nuevo_rol = new javax.swing.JButton();
        btn_Guardar_rol = new javax.swing.JButton();
        btn_Actualizar_rol = new javax.swing.JButton();
        btn_Eliminar_rol = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        chkb_Estado_rol = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        lbl_Titulo_ResParcial1 = new javax.swing.JLabel();
        cbx_Roles_Usuario = new javax.swing.JComboBox();
        btn_Guardar_Usuarios = new javax.swing.JButton();
        btn_Actualizar_Usuarios = new javax.swing.JButton();
        txt_Nombre_Usuario = new javax.swing.JTextField();
        btn_Nuevo_Usuarios = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        btn_Eliminar_Usuarios = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        Psw_Contrasenia_Usuario = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        chkb_Estado_Usuarios = new javax.swing.JCheckBox();
        cbx_Roles_U = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbx_Personas_U = new javax.swing.JComboBox();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        lbl_Titulo_ResParcial.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lbl_Titulo_ResParcial.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Titulo_ResParcial.setText("Administración de Roles");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Nombre del Rol:");

        cbx_Roles.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbx_RolesItemStateChanged(evt);
            }
        });

        btn_Nuevo_rol.setText("Nuevo");
        btn_Nuevo_rol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Nuevo_rolActionPerformed(evt);
            }
        });

        btn_Guardar_rol.setText("Guardar");
        btn_Guardar_rol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Guardar_rolActionPerformed(evt);
            }
        });

        btn_Actualizar_rol.setText("Actualizar");
        btn_Actualizar_rol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Actualizar_rolActionPerformed(evt);
            }
        });

        btn_Eliminar_rol.setText("Eliminar");
        btn_Eliminar_rol.setEnabled(false);
        btn_Eliminar_rol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Eliminar_rolActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Estado  rol:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(lbl_Titulo_ResParcial, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(cbx_Roles, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btn_Eliminar_rol))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(btn_Nuevo_rol)
                        .addGap(26, 26, 26)
                        .addComponent(btn_Guardar_rol)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Actualizar_rol)))
                .addGap(48, 48, 48))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Nombre_rol, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(chkb_Estado_rol)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Titulo_ResParcial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbx_Roles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Eliminar_rol))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txt_Nombre_rol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(chkb_Estado_rol))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Nuevo_rol)
                    .addComponent(btn_Guardar_rol)
                    .addComponent(btn_Actualizar_rol))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        lbl_Titulo_ResParcial1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lbl_Titulo_ResParcial1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Titulo_ResParcial1.setText("Administración de Usuarios");

        cbx_Roles_Usuario.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbx_Roles_UsuarioItemStateChanged(evt);
            }
        });
        cbx_Roles_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_Roles_UsuarioActionPerformed(evt);
            }
        });

        btn_Guardar_Usuarios.setText("Guardar");
        btn_Guardar_Usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Guardar_UsuariosActionPerformed(evt);
            }
        });

        btn_Actualizar_Usuarios.setText("Actualizar");
        btn_Actualizar_Usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Actualizar_UsuariosActionPerformed(evt);
            }
        });

        btn_Nuevo_Usuarios.setText("Nuevo");
        btn_Nuevo_Usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Nuevo_UsuariosActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Nombre del Usuario:");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Contraseña del Usuario:");

        btn_Eliminar_Usuarios.setText("Eliminar");
        btn_Eliminar_Usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Eliminar_UsuariosActionPerformed(evt);
            }
        });

        Psw_Contrasenia_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Psw_Contrasenia_UsuarioActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Estado  rol:");

        cbx_Roles_U.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbx_Roles_UItemStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Rol:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Docente:");

        cbx_Personas_U.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbx_Personas_UItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lbl_Titulo_ResParcial1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(cbx_Roles_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addComponent(btn_Eliminar_Usuarios)
                                .addGap(0, 25, Short.MAX_VALUE)))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btn_Nuevo_Usuarios)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_Guardar_Usuarios)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_Actualizar_Usuarios)))
                        .addGap(33, 33, 33))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_Nombre_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbx_Roles_U, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbx_Personas_U, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkb_Estado_Usuarios)
                                    .addComponent(Psw_Contrasenia_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Titulo_ResParcial1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Eliminar_Usuarios)
                    .addComponent(cbx_Roles_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbx_Personas_U, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbx_Roles_U, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txt_Nombre_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(Psw_Contrasenia_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chkb_Estado_Usuarios, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Actualizar_Usuarios)
                    .addComponent(btn_Guardar_Usuarios)
                    .addComponent(btn_Nuevo_Usuarios))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbx_Roles_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_Roles_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_Roles_UsuarioActionPerformed
    //BOTON NUEVO ROL
    private void btn_Nuevo_rolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Nuevo_rolActionPerformed

        this.txt_Nombre_rol.setText("");
        this.chkb_Estado_rol.setSelected(false);
        this.cbx_Roles.setSelectedIndex(0);

    }//GEN-LAST:event_btn_Nuevo_rolActionPerformed
    //BOTON GUARDAR ROL
    private void btn_Guardar_rolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Guardar_rolActionPerformed

        Roles rol = new Roles();
        rol.setCod_Rol(this.txt_Nombre_rol.getText().charAt(0));
        rol.setDescripcion_Rol(this.txt_Nombre_rol.getText());
        rol.setEstado_Rol(this.chkb_Estado_rol.isSelected());
        if (rol.guardar_rol(con)) {

            cbx_Roles.addItem(rol);
            if (rol.isEstado_Rol()) {
                cbx_Roles_Usuario.addItem(rol);
            }
            this.btn_Nuevo_rolActionPerformed(null);
            JOptionPane.showMessageDialog(null, "El Registro de Rol se Guardo con Exito");
        } else {
            JOptionPane.showMessageDialog(null, "Error , Fallo al Guardar el Registro de Rol");
        }

    }//GEN-LAST:event_btn_Guardar_rolActionPerformed
    //BOTON ACTUALIZAR ROL
    private void btn_Actualizar_rolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Actualizar_rolActionPerformed

        Roles rol = (Roles) cbx_Roles.getSelectedItem();
        if (rol != null && rol.getDescripcion_Rol() != null) {
            rol.setDescripcion_Rol(this.txt_Nombre_rol.getText());
            rol.setEstado_Rol(this.chkb_Estado_rol.isSelected());
            if (rol.actualizar_rol(con)) {
                JOptionPane.showMessageDialog(null, "El Registro se actualizo con Exito");
                this.btn_Nuevo_rolActionPerformed(null);
            } else {
                JOptionPane.showMessageDialog(null, "Error , Fallo al actualizar el Registro");
            }

        }
        this.obtenerRoles();


    }//GEN-LAST:event_btn_Actualizar_rolActionPerformed
    //ELIMINAR ROL
    private void btn_Eliminar_rolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Eliminar_rolActionPerformed

        Roles rol = (Roles) cbx_Roles.getSelectedItem();

        if (rol != null && rol.getDescripcion_Rol() != null) {
            int result = JOptionPane.showConfirmDialog(this, "Desea Eliminar el Registro de Rol", "Salir", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_NO_OPTION) {
                if (rol.eliminar_rol(con)) {
                    JOptionPane.showMessageDialog(null, "El Registro Rol se Elimino con Exito");
                    this.btn_Nuevo_rolActionPerformed(null);
                } else {
                    JOptionPane.showMessageDialog(null, "Error , Fallo al Eliminar el Registro Rol");
                }
            }
        }
        this.obtenerRoles();


    }//GEN-LAST:event_btn_Eliminar_rolActionPerformed
    // CBX ROL
    private void cbx_RolesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbx_RolesItemStateChanged

        if (evt.getStateChange() == ItemEvent.SELECTED) {
            Roles item = (Roles) evt.getItem();
            if (!item.getDescripcion_Rol().equals("Seleccione")) {
                controlesRoles(false);
                this.txt_Nombre_rol.setText(item.getDescripcion_Rol());
                this.chkb_Estado_rol.setSelected(item.isEstado_Rol());

            } else {
                controlesRoles(true);
            }
        }

    }//GEN-LAST:event_cbx_RolesItemStateChanged

    private void Psw_Contrasenia_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Psw_Contrasenia_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Psw_Contrasenia_UsuarioActionPerformed
    //NUEVO USUARIO
    private void btn_Nuevo_UsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Nuevo_UsuariosActionPerformed
        this.obtenerUsuarios();
        this.txt_Nombre_Usuario.setText("");
        this.Psw_Contrasenia_Usuario.setText("");
        this.chkb_Estado_Usuarios.setSelected(false);
        this.cbx_Roles_U.setSelectedIndex(0);
        this.cbx_Personas_U.setSelectedIndex(0);
        this.cbx_Roles_Usuario.setSelectedIndex(0);

    }//GEN-LAST:event_btn_Nuevo_UsuariosActionPerformed

    private void btn_Guardar_UsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Guardar_UsuariosActionPerformed
        Personas persona = (Personas) cbx_Personas_U.getSelectedItem();
        Roles rol = (Roles) cbx_Roles_U.getSelectedItem();
        Usuarios usuario = new Usuarios();
        usuario.setCod_Rol(rol.getCod_Rol());
        usuario.setContraenia_Usuario(String.copyValueOf(this.Psw_Contrasenia_Usuario.getPassword()));
        usuario.setNombre_Usuario(this.txt_Nombre_Usuario.getText());
        usuario.setCod_Personas(persona.getCod_Personas());
        usuario.setEstado_Usuario(this.chkb_Estado_Usuarios.isSelected());
        try {
            if (usuario.insertar(con)) {
                btn_Nuevo_UsuariosActionPerformed(null);
                JOptionPane.showMessageDialog(null, "El Registro Usuario se guardo con Exito");
            } else {
                JOptionPane.showMessageDialog(null, "Error , Fallo al guardar el Registro");
            }
        } catch (SQLException ex) {
            Logger.getLogger(RolesUsuariosForm.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btn_Guardar_UsuariosActionPerformed

    private void btn_Actualizar_UsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Actualizar_UsuariosActionPerformed
        // TODO add your handling code here:
        // Usuarios usuario = (Usuarios) cbx_Roles_Usuario.getSelectedItem();
        Usuarios usuario = (Usuarios) cbx_Roles_Usuario.getSelectedItem();

        if (usuario != null && usuario.getNombre_Usuario() != null) {
            usuario.setNombre_Usuario(this.txt_Nombre_Usuario.getText());
            usuario.setEstado_Usuario(this.chkb_Estado_Usuarios.isSelected());
            //password
            usuario.setCod_Usuario(usuario.getCod_Usuario());

            if (usuario.actualizar_usuario(con)) {
                JOptionPane.showMessageDialog(null, "El Registro Usuario se actualizo con Exito");
                btn_Nuevo_UsuariosActionPerformed(null);

            } else {
                JOptionPane.showMessageDialog(null, "Error , Fallo al  Usuario el Registro");
            }

        }

        this.obtenerUsuarios();
    }//GEN-LAST:event_btn_Actualizar_UsuariosActionPerformed

    private void btn_Eliminar_UsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Eliminar_UsuariosActionPerformed
        // TODO add your handling code here:
        //Usuarios usuario = (Usuarios) cbx_Roles_Usuario.getSelectedItem();
        Usuarios usuario = (Usuarios) cbx_Roles_Usuario.getSelectedItem();
        if (usuario != null && usuario.getNombre_Usuario() != null) {
            int result = JOptionPane.showConfirmDialog(this, "Desea Eliminar el Registro Usuario", "Salir", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_NO_OPTION) {
                if (usuario.eliminar_usuario(con)) {
                    JOptionPane.showMessageDialog(null, "El Registro se Elimino Usuario con Exito");
                    btn_Nuevo_UsuariosActionPerformed(null);
                } else {
                    JOptionPane.showMessageDialog(null, "Error , Fallo al Eliminar Usuario el Registro");
                }
            }
        }

        this.obtenerUsuarios();

    }//GEN-LAST:event_btn_Eliminar_UsuariosActionPerformed

    private void cbx_Roles_UsuarioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbx_Roles_UsuarioItemStateChanged

        if (evt.getStateChange() == ItemEvent.SELECTED) {
            Usuarios item = (Usuarios) evt.getItem();
            if (!item.getNombre_Usuario().equals("Seleccione")) {
                controlesUsuarios(false);
                this.txt_Nombre_Usuario.setText(item.getNombre_Usuario());
                this.chkb_Estado_Usuarios.setSelected(item.isEstado_Usuario());
                this.cbx_Roles_U.setSelectedItem(item.getRol());
                this.cbx_Personas_U.setSelectedItem(item.getPersona());
            } else {
                controlesUsuarios(true);
            }
        }

    }//GEN-LAST:event_cbx_Roles_UsuarioItemStateChanged

    private void cbx_Roles_UItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbx_Roles_UItemStateChanged


    }//GEN-LAST:event_cbx_Roles_UItemStateChanged

    private void cbx_Personas_UItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbx_Personas_UItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_Personas_UItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Psw_Contrasenia_Usuario;
    private javax.swing.JButton btn_Actualizar_Usuarios;
    private javax.swing.JButton btn_Actualizar_rol;
    private javax.swing.JButton btn_Eliminar_Usuarios;
    private javax.swing.JButton btn_Eliminar_rol;
    private javax.swing.JButton btn_Guardar_Usuarios;
    private javax.swing.JButton btn_Guardar_rol;
    private javax.swing.JButton btn_Nuevo_Usuarios;
    private javax.swing.JButton btn_Nuevo_rol;
    private javax.swing.JComboBox cbx_Personas_U;
    private javax.swing.JComboBox cbx_Roles;
    private javax.swing.JComboBox cbx_Roles_U;
    private javax.swing.JComboBox cbx_Roles_Usuario;
    private javax.swing.JCheckBox chkb_Estado_Usuarios;
    private javax.swing.JCheckBox chkb_Estado_rol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbl_Titulo_ResParcial;
    private javax.swing.JLabel lbl_Titulo_ResParcial1;
    private javax.swing.JTextField txt_Nombre_Usuario;
    private javax.swing.JTextField txt_Nombre_rol;
    // End of variables declaration//GEN-END:variables
}
