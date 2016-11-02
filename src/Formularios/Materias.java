/*lucia
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Formularios;
import Clases.Conexion;
import Clases.Util;
import Clases.tablas.MateriasD;
import Clases.tablas.Facultades;
import Clases.tablas.Secciones;
import java.awt.event.ItemEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
/**
 *
 * @author Nataly
 */
public class Materias extends javax.swing.JInternalFrame {
private Conexion con;

    public Materias() throws SQLException {
        initComponents();
        con = new Conexion();
        this.obtenerMaterias();
        this.obtenerFacultades();
        this.obtenerSecciones();
        
    }
    
     private void obtenerMaterias() {
        ((DefaultComboBoxModel) cbx_materias2.getModel()).removeAllElements();
        ArrayList lista = null;
        try {
         lista=MateriasD.getMaterias(con);
            cbx_materias2.addItem(new MateriasD());
        } catch (SQLException ex) {
            Logger.getLogger(Materias.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (Object o : lista) {
            cbx_materias2.addItem(o);
        }
    }
     
      private void controlesMaterias(boolean estado) {
        this.btn_GuardarMateria2.setEnabled(estado);
        this.btn_Actualizar_Materias2.setEnabled(!estado);
        this.btn_EliminarMaterias2.setEnabled(!estado);
    }
    
      private void obtenerFacultades() {
        //Eliminamos todos los elementos de los combobox
       
        ((DefaultComboBoxModel) cbx_facultades2.getModel()).removeAllElements();
        ((DefaultComboBoxModel) cbx_Cod_Facultad2.getModel()).removeAllElements();

        ArrayList lista = null;
        try {
            lista = Facultades.getFacultades(con);
            cbx_facultades2.addItem(new Facultades());
        } catch (SQLException ex) {
            Logger.getLogger(Materias.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (Object o : lista) {
            Facultades item = (Facultades) o;
            cbx_facultades2.addItem(item);
            if (item.isEstado_Facultad()) {
                cbx_Cod_Facultad2.addItem(o);
            }
        }
        
    }
      
       private void controlesFacultades(boolean estado) {
        this.btn_Guardar_Facultad2.setEnabled(estado);
        this.btn_Actualizar_Facultad2.setEnabled(!estado);
        this.btn_Eliminar_Facultad2.setEnabled(!estado);
    }
    
     private void obtenerSecciones() {
       ((DefaultComboBoxModel) cbx_Secciones.getModel()).removeAllElements();
        ArrayList lista = null;
        try {
            lista = Secciones.getSecciones(con);
            cbx_Secciones.addItem(new Secciones());
           
        } catch (SQLException ex) {
            Logger.getLogger(Materias.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (Object o : lista) {
            cbx_Secciones.addItem(o);
        }
    }
     
     private void controlesSecciones(boolean estado) {
         this.btn_Guardar_Secciones.setEnabled(estado);
        this.btn_Actualizar_Secciones.setEnabled(!estado);
        this.btn_Eliminar_Secciones.setEnabled(!estado);
    }
       
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanel_Materia2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txt_NombreMateria2 = new javax.swing.JTextField();
        txt_Abreviatura_Materia2 = new javax.swing.JTextField();
        txt_UV2 = new javax.swing.JTextField();
        txt_CicloMateria2 = new javax.swing.JTextField();
        btn_GuardarMateria2 = new javax.swing.JButton();
        btn_Actualizar_Materias2 = new javax.swing.JButton();
        btn_EliminarMaterias2 = new javax.swing.JButton();
        cbx_Cod_Facultad2 = new javax.swing.JComboBox();
        chkb_estado_materia2 = new javax.swing.JCheckBox();
        cbx_materias2 = new javax.swing.JComboBox();
        jSeparator5 = new javax.swing.JSeparator();
        btn_Nuevo_Materia2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lbl_Facultad = new javax.swing.JLabel();
        lbl_Nombre_Facultad = new javax.swing.JLabel();
        lbl_Estado_Facultad = new javax.swing.JLabel();
        btn_Guardar_Facultad2 = new javax.swing.JButton();
        btn_Eliminar_Facultad2 = new javax.swing.JButton();
        btn_Actualizar_Facultad2 = new javax.swing.JButton();
        Txt_Nombre_Facultad2 = new javax.swing.JTextField();
        chkb_estado_facultad2 = new javax.swing.JCheckBox();
        btn_Nuevo_Facultad2 = new javax.swing.JButton();
        cbx_facultades2 = new javax.swing.JComboBox();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbx_Secciones = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_Nombre_Seccion = new javax.swing.JTextField();
        chkb_Estado_Seccion = new javax.swing.JCheckBox();
        btn_Nuevo_Secciones = new javax.swing.JButton();
        btn_Guardar_Secciones = new javax.swing.JButton();
        btn_Actualizar_Secciones = new javax.swing.JButton();
        btn_Eliminar_Secciones = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cbx_Cod_Materia = new javax.swing.JComboBox();

        setClosable(true);
        setIconifiable(true);

        jpanel_Materia2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Formulario de Materias");

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Código Facultad");

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Nombre de Materia");

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Abreviatura Materia");

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("U.V.");

        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Ciclo de Materia");

        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Estado de Materia");

        txt_UV2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_UV2ActionPerformed(evt);
            }
        });
        txt_UV2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_UV2KeyTyped(evt);
            }
        });

        txt_CicloMateria2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_CicloMateria2KeyTyped(evt);
            }
        });

        btn_GuardarMateria2.setText("Guardar");
        btn_GuardarMateria2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarMateria2ActionPerformed(evt);
            }
        });

        btn_Actualizar_Materias2.setText("Actualizar");
        btn_Actualizar_Materias2.setEnabled(false);
        btn_Actualizar_Materias2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Actualizar_Materias2ActionPerformed(evt);
            }
        });

        btn_EliminarMaterias2.setText("Eliminar");
        btn_EliminarMaterias2.setEnabled(false);
        btn_EliminarMaterias2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarMaterias2ActionPerformed(evt);
            }
        });

        cbx_materias2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbx_materias2ItemStateChanged(evt);
            }
        });

        btn_Nuevo_Materia2.setText("Nuevo");
        btn_Nuevo_Materia2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Nuevo_Materia2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanel_Materia2Layout = new javax.swing.GroupLayout(jpanel_Materia2);
        jpanel_Materia2.setLayout(jpanel_Materia2Layout);
        jpanel_Materia2Layout.setHorizontalGroup(
            jpanel_Materia2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_Materia2Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jpanel_Materia2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addGroup(jpanel_Materia2Layout.createSequentialGroup()
                        .addGroup(jpanel_Materia2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)
                            .addComponent(jLabel20))
                        .addGap(18, 18, 18)
                        .addGroup(jpanel_Materia2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_NombreMateria2)
                            .addComponent(txt_Abreviatura_Materia2)
                            .addComponent(cbx_Cod_Facultad2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jpanel_Materia2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel25)
                            .addComponent(jLabel24))))
                .addGap(18, 18, 18)
                .addGroup(jpanel_Materia2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_CicloMateria2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_UV2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkb_estado_materia2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanel_Materia2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpanel_Materia2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanel_Materia2Layout.createSequentialGroup()
                        .addGroup(jpanel_Materia2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 763, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpanel_Materia2Layout.createSequentialGroup()
                                .addComponent(btn_Nuevo_Materia2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_GuardarMateria2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_Actualizar_Materias2)))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanel_Materia2Layout.createSequentialGroup()
                        .addComponent(cbx_materias2, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btn_EliminarMaterias2)
                        .addGap(142, 142, 142))))
        );
        jpanel_Materia2Layout.setVerticalGroup(
            jpanel_Materia2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_Materia2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(26, 26, 26)
                .addGroup(jpanel_Materia2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbx_materias2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_EliminarMaterias2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jpanel_Materia2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanel_Materia2Layout.createSequentialGroup()
                        .addGroup(jpanel_Materia2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbx_Cod_Facultad2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))
                        .addGap(23, 23, 23)
                        .addGroup(jpanel_Materia2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_NombreMateria2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addGap(20, 20, 20)
                        .addGroup(jpanel_Materia2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Abreviatura_Materia2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22)))
                    .addGroup(jpanel_Materia2Layout.createSequentialGroup()
                        .addGroup(jpanel_Materia2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(txt_UV2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jpanel_Materia2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(txt_CicloMateria2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jpanel_Materia2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(chkb_estado_materia2))))
                .addGap(29, 29, 29)
                .addGroup(jpanel_Materia2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_GuardarMateria2)
                    .addComponent(btn_Actualizar_Materias2)
                    .addComponent(btn_Nuevo_Materia2))
                .addGap(22, 22, 22))
        );

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        lbl_Facultad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_Facultad.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Facultad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Facultad.setText("Facultad");

        lbl_Nombre_Facultad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_Nombre_Facultad.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Nombre_Facultad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_Nombre_Facultad.setText("Nombre Facultad:");

        lbl_Estado_Facultad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_Estado_Facultad.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Estado_Facultad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_Estado_Facultad.setText("Estado Facultad:");

        btn_Guardar_Facultad2.setText("Guardar");
        btn_Guardar_Facultad2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Guardar_Facultad2ActionPerformed(evt);
            }
        });

        btn_Eliminar_Facultad2.setText("Eliminar");
        btn_Eliminar_Facultad2.setEnabled(false);
        btn_Eliminar_Facultad2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Eliminar_Facultad2ActionPerformed(evt);
            }
        });

        btn_Actualizar_Facultad2.setEnabled(false);
        btn_Actualizar_Facultad2.setLabel("Actualizar");
        btn_Actualizar_Facultad2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Actualizar_Facultad2ActionPerformed(evt);
            }
        });

        btn_Nuevo_Facultad2.setText("Nuevo");
        btn_Nuevo_Facultad2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Nuevo_Facultad2ActionPerformed(evt);
            }
        });

        cbx_facultades2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbx_facultades2ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_Facultad, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(cbx_facultades2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_Eliminar_Facultad2))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbl_Nombre_Facultad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_Estado_Facultad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkb_estado_facultad2)
                            .addComponent(Txt_Nombre_Facultad2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_Nuevo_Facultad2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_Guardar_Facultad2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Actualizar_Facultad2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Facultad)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Eliminar_Facultad2)
                    .addComponent(cbx_facultades2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Nombre_Facultad2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Nombre_Facultad))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chkb_estado_facultad2)
                    .addComponent(lbl_Estado_Facultad))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Guardar_Facultad2)
                    .addComponent(btn_Actualizar_Facultad2)
                    .addComponent(btn_Nuevo_Facultad2))
                .addGap(71, 71, 71))
        );

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Secciones");

        cbx_Secciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_SeccionesActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre Sección:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Estado Sección:");

        btn_Nuevo_Secciones.setText("Nuevo");
        btn_Nuevo_Secciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Nuevo_SeccionesActionPerformed(evt);
            }
        });

        btn_Guardar_Secciones.setText("Guardar");
        btn_Guardar_Secciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Guardar_SeccionesActionPerformed(evt);
            }
        });

        btn_Actualizar_Secciones.setText("Actualizar");
        btn_Actualizar_Secciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Actualizar_SeccionesActionPerformed(evt);
            }
        });

        btn_Eliminar_Secciones.setText("Eliminar");
        btn_Eliminar_Secciones.setEnabled(false);
        btn_Eliminar_Secciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Eliminar_SeccionesActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Código Materia:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(163, 163, 163))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(cbx_Secciones, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btn_Eliminar_Secciones))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(chkb_Estado_Seccion)
                            .addComponent(txt_Nombre_Seccion)
                            .addComponent(cbx_Cod_Materia, 0, 160, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btn_Nuevo_Secciones)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btn_Guardar_Secciones)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btn_Actualizar_Secciones))
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbx_Secciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Eliminar_Secciones))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbx_Cod_Materia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_Nombre_Seccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(chkb_Estado_Seccion))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Nuevo_Secciones)
                    .addComponent(btn_Guardar_Secciones)
                    .addComponent(btn_Actualizar_Secciones))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpanel_Materia2, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpanel_Materia2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void txt_UV2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_UV2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_UV2ActionPerformed

    private void txt_UV2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_UV2KeyTyped
       
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txt_UV2KeyTyped

    private void txt_CicloMateria2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_CicloMateria2KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txt_CicloMateria2KeyTyped

    private void btn_GuardarMateria2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarMateria2ActionPerformed
        MateriasD materia = new MateriasD();
        Facultades facultad = (Facultades) cbx_Cod_Facultad2.getSelectedItem();
        materia.setNombre_Materia(this.txt_NombreMateria2.getText());
        materia.setAbrev_Materia(this.txt_Abreviatura_Materia2.getText());
        materia.setUV(Integer.valueOf(this.txt_UV2.getText()));
        materia.setCiclo_Materia(this.txt_CicloMateria2.getText());
        materia.setEstado_Materia(this.chkb_estado_materia2.isSelected());
   
        materia.setCod_Facultad(facultad.getCod_Facultad());

        Integer id = materia.guardar_materias(con); //GUARDA el REGISTRO y retorna el ID generado

        if (id != null) {
            materia.setCod_Materia(id.intValue());
            cbx_materias2.addItem(materia);
            this.btn_Nuevo_Materia2ActionPerformed(null);
           
            JOptionPane.showMessageDialog(null, "El Registro se Guardo con Exito");
        } else {
            JOptionPane.showMessageDialog(null, "Error , Falló al Guardar el Registro");
        } 
      
    }//GEN-LAST:event_btn_GuardarMateria2ActionPerformed

    private void btn_Actualizar_Materias2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Actualizar_Materias2ActionPerformed
        MateriasD materia = (MateriasD) cbx_materias2.getSelectedItem();
        Facultades facultad = (Facultades) cbx_Cod_Facultad2.getSelectedItem();
        
        if (materia != null && materia.getNombre_Materia() != null) {
            materia.setNombre_Materia(this.txt_NombreMateria2.getText());
            materia.setAbrev_Materia(this.txt_Abreviatura_Materia2.getText());
            materia.setUV(Integer.valueOf(this.txt_UV2.getText()));
            materia.setCiclo_Materia(this.txt_CicloMateria2.getText());
            materia.setEstado_Materia(this.chkb_estado_materia2.isSelected());
            
            materia.setCod_Facultad(facultad.getCod_Facultad());
            if (materia.actualizar_materia(con)) {
                JOptionPane.showMessageDialog(null, "El Registro se actualizó con Exito");
                this.btn_Nuevo_Materia2ActionPerformed(null);
                obtenerMaterias();
            } else {
                JOptionPane.showMessageDialog(null, "Error , Fallo al actualizar el Registro");
            }
        }
        
    }//GEN-LAST:event_btn_Actualizar_Materias2ActionPerformed

    private void btn_EliminarMaterias2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarMaterias2ActionPerformed
        MateriasD materia = (MateriasD) cbx_materias2.getSelectedItem();
        if (materia != null && materia.getNombre_Materia() != null) {
            int result = JOptionPane.showConfirmDialog(this, "Desea Eliminar el Registro", "Salir", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_NO_OPTION) {
                if (materia.eliminar_materia(con)) {
                    JOptionPane.showMessageDialog(null, "El Registro se Eliminó con Exito");
                    this.btn_Nuevo_Materia2ActionPerformed(null);
                    obtenerMaterias();
                } else {
                    JOptionPane.showMessageDialog(null, "Error , Falló al Eliminar el Registro");
                }
            }
        }
        
    }//GEN-LAST:event_btn_EliminarMaterias2ActionPerformed

    private void cbx_materias2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbx_materias2ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            MateriasD item = (MateriasD) evt.getItem();
            if (item.getNombre_Materia() != null) {
                controlesMaterias(false);
                this.cbx_Cod_Facultad2.setSelectedItem(new Facultades(item.getCod_Facultad()));
                this.txt_Abreviatura_Materia2.setText(item.getAbrev_Materia());
                this.txt_CicloMateria2.setText(item.getCiclo_Materia());
                this.chkb_estado_materia2.setSelected(item.isEstado_Materia());
                this.txt_NombreMateria2.setText(item.getNombre_Materia());
                this.txt_UV2.setText(String.valueOf(item.getUV()));
            }
            else
            controlesMaterias(true);
        }
        
    }//GEN-LAST:event_cbx_materias2ItemStateChanged

    private void btn_Nuevo_Materia2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Nuevo_Materia2ActionPerformed
        this.cbx_Cod_Facultad2.setSelectedIndex(0);
        this.txt_NombreMateria2.setText(""); 
        this.txt_Abreviatura_Materia2.setText("");
         this.txt_UV2.setText("");
        this.txt_CicloMateria2.setText("");
        this.chkb_estado_materia2.setSelected(false);
        this.cbx_materias2.setSelectedIndex(0);
    
    }//GEN-LAST:event_btn_Nuevo_Materia2ActionPerformed

    private void btn_Guardar_Facultad2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Guardar_Facultad2ActionPerformed
        Facultades facultad = new Facultades();
        try {
            
            facultad.setNombre_Facultad(this.Txt_Nombre_Facultad2.getText());
            facultad.setEstado_Facultad(this.chkb_estado_facultad2.isSelected());
            
        } catch (Exception ex) {
            Logger.getLogger(Materias.class.getName()).log(Level.SEVERE, null, ex);
        }

        Integer id = facultad.guardar_facultad(con); //guarda el registro y retorna el id generado

        if (id != null) {
            facultad.setCod_Facultad(id.intValue());
            cbx_facultades2.addItem(facultad);
            if (facultad.isEstado_Facultad()) {
                cbx_Cod_Facultad2.addItem(facultad);
            }
           
           //NO SE TOMARÁ EN CUENTA PORQUE NO DEPENDE DE NADIE this.btn_nuevo_unidadActionPerformed(null);
            JOptionPane.showMessageDialog(null, "El Registro de facultad se Guardo con Exito");
        } else {
            JOptionPane.showMessageDialog(null, "Error , Falló al Guardar el Registro de Facultad");
        }
        
    }//GEN-LAST:event_btn_Guardar_Facultad2ActionPerformed

    private void btn_Eliminar_Facultad2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Eliminar_Facultad2ActionPerformed
        Facultades facultad = (Facultades) cbx_facultades2.getSelectedItem();
        if (facultad != null && facultad.getNombre_Facultad() != null) {
            int result = JOptionPane.showConfirmDialog(this, "Desea Eliminar el Registro", "Salir", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_NO_OPTION) {
                if (facultad.eliminar_facultad(con)) {
                    JOptionPane.showMessageDialog(null, "El Registro de facultad se Eliminó con Exito");
                    this.btn_Nuevo_Facultad2ActionPerformed(null);
                } else {
                    JOptionPane.showMessageDialog(null, "Error , Falló al Eliminar el Registro de facultad");
                }
            }
        }
        this.obtenerFacultades();
    }//GEN-LAST:event_btn_Eliminar_Facultad2ActionPerformed

    private void btn_Actualizar_Facultad2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Actualizar_Facultad2ActionPerformed
        Facultades facultad = (Facultades) cbx_facultades2.getSelectedItem();
        
        if (facultad != null && facultad.getNombre_Facultad() != null) {
            facultad.setNombre_Facultad(this.Txt_Nombre_Facultad2.getText());
            facultad.setEstado_Facultad(this.chkb_estado_facultad2.isSelected());
            
            if (facultad.actualizar_facultad(con)) {
                JOptionPane.showMessageDialog(null, "El Registro de facutlad se actualizó con Exito");
                this.btn_Nuevo_Facultad2ActionPerformed(null);
            } else {
                JOptionPane.showMessageDialog(null, "Error , Fallo al actualizar el Registro de facultad");
            }
        }
        this.obtenerFacultades();
    }//GEN-LAST:event_btn_Actualizar_Facultad2ActionPerformed

    private void btn_Nuevo_Facultad2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Nuevo_Facultad2ActionPerformed
        this.Txt_Nombre_Facultad2.setText("");
        this.chkb_estado_facultad2.setSelected(false);
        this.cbx_facultades2.setSelectedIndex(0);
    }//GEN-LAST:event_btn_Nuevo_Facultad2ActionPerformed

    private void cbx_facultades2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbx_facultades2ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            Facultades item = (Facultades) evt.getItem();
            if (item.getNombre_Facultad() != null) {
                controlesFacultades(false);
                this.Txt_Nombre_Facultad2.setText(item.getNombre_Facultad());
                this.chkb_estado_facultad2.setSelected(item.isEstado_Facultad());
          
            } else {
                controlesFacultades(true);
            }
        }
    }//GEN-LAST:event_cbx_facultades2ItemStateChanged

    private void cbx_SeccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_SeccionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_SeccionesActionPerformed

    private void btn_Nuevo_SeccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Nuevo_SeccionesActionPerformed
       //Secciones
         this.txt_Nombre_Seccion.setText("");
        this.chkb_Estado_Seccion.setSelected(false);
        this.cbx_Secciones.setSelectedIndex(0);
        this.cbx_Cod_Materia.setSelectedItem(0);
        
    }//GEN-LAST:event_btn_Nuevo_SeccionesActionPerformed

    private void btn_Guardar_SeccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Guardar_SeccionesActionPerformed
        //Secciones
        Secciones seccion = new Secciones();
        MateriasD Materias = (MateriasD) cbx_Cod_Materia.getSelectedItem();
        seccion.setNombre_Seccion(this.txt_Nombre_Seccion.getText());
        seccion.setEstado_Seccion(this.chkb_Estado_Seccion.isSelected());
        seccion.setCod_Materia(Materias.getCod_Materia());
        Integer id = seccion.guardar_Secciones(con);
        //guarda el registro y retorna el id generado

        if (id != null) {
            seccion.setCod_Seccion(id.intValue());
            cbx_Secciones.addItem(seccion);
          
           this.btn_Nuevo_SeccionesActionPerformed(null);
          
            JOptionPane.showMessageDialog(null, "El Registro de seccion se Guardo con Exito");
        } else {
            JOptionPane.showMessageDialog(null, "Error , Falló al Guardar el Registro de sección");
        }
       
        
    }//GEN-LAST:event_btn_Guardar_SeccionesActionPerformed

    private void btn_Actualizar_SeccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Actualizar_SeccionesActionPerformed
        //
        Secciones seccion = (Secciones) cbx_Secciones.getSelectedItem();
        MateriasD materia = (MateriasD) cbx_Cod_Materia.getSelectedItem();
        
        if(seccion != null && seccion.getNombre_Seccion() != null){
            seccion.setNombre_Seccion(this.txt_Nombre_Seccion.getText());
            seccion.setEstado_Seccion(this.chkb_Estado_Seccion.isSelected());
            
            seccion.setCod_Materia(materia.getCod_Materia());
            if(seccion.actualizar_seccion(con)){
                JOptionPane.showMessageDialog(null, "El Registro Sección se actualizó con Exito");
                this.btn_Nuevo_SeccionesActionPerformed(null);
                obtenerSecciones();
            } else {
                JOptionPane.showMessageDialog(null, "Error , Falló al actualizar el Registro");
            }
        }
        
    }//GEN-LAST:event_btn_Actualizar_SeccionesActionPerformed

    private void btn_Eliminar_SeccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Eliminar_SeccionesActionPerformed
        // TODO add your handling code here:
        Secciones seccion = (Secciones) cbx_Secciones.getSelectedItem();
        if(seccion !=null && seccion.getNombre_Seccion() != null){
            int result = JOptionPane.showConfirmDialog(this, "Desea Eliminar el Registro", "Salir", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_NO_OPTION){
               if(seccion.eliminar_seccion(con)){
                  JOptionPane.showMessageDialog(null, "El Registro Seccion se Eliminó con Exito");  
                  this.btn_Nuevo_SeccionesActionPerformed(null);
                  obtenerSecciones();
               } else {
                  JOptionPane.showMessageDialog(null, "Error , Falló al Eliminar el Registro"); 
               } 
            }
            
        }
        
    }//GEN-LAST:event_btn_Eliminar_SeccionesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Txt_Nombre_Facultad2;
    private javax.swing.JButton btn_Actualizar_Facultad2;
    private javax.swing.JButton btn_Actualizar_Materias2;
    private javax.swing.JButton btn_Actualizar_Secciones;
    private javax.swing.JButton btn_EliminarMaterias2;
    private javax.swing.JButton btn_Eliminar_Facultad2;
    private javax.swing.JButton btn_Eliminar_Secciones;
    private javax.swing.JButton btn_GuardarMateria2;
    private javax.swing.JButton btn_Guardar_Facultad2;
    private javax.swing.JButton btn_Guardar_Secciones;
    private javax.swing.JButton btn_Nuevo_Facultad2;
    private javax.swing.JButton btn_Nuevo_Materia2;
    private javax.swing.JButton btn_Nuevo_Secciones;
    private javax.swing.JComboBox cbx_Cod_Facultad2;
    private javax.swing.JComboBox cbx_Cod_Materia;
    private javax.swing.JComboBox cbx_Secciones;
    private javax.swing.JComboBox cbx_facultades2;
    private javax.swing.JComboBox cbx_materias2;
    private javax.swing.JCheckBox chkb_Estado_Seccion;
    private javax.swing.JCheckBox chkb_estado_facultad2;
    private javax.swing.JCheckBox chkb_estado_materia2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JPanel jpanel_Materia2;
    private javax.swing.JLabel lbl_Estado_Facultad;
    private javax.swing.JLabel lbl_Facultad;
    private javax.swing.JLabel lbl_Nombre_Facultad;
    private javax.swing.JTextField txt_Abreviatura_Materia2;
    private javax.swing.JTextField txt_CicloMateria2;
    private javax.swing.JTextField txt_NombreMateria2;
    private javax.swing.JTextField txt_Nombre_Seccion;
    private javax.swing.JTextField txt_UV2;
    // End of variables declaration//GEN-END:variables
}
