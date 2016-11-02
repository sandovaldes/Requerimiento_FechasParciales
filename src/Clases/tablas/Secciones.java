/*Lucia
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases.tablas;

import Clases.Util;
import Clases.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Erika
 */
public class Secciones {

    private int Cod_Seccion;
    private int Cod_Materia;
    private String Nombre_Seccion;
    private Boolean Estado_Seccion;

    public Secciones() {
    }

    private Secciones(int Cod_Seccion, int Cod_Materia, String Nombre_Seccion, Boolean Estado_Seccion) {
        this.Cod_Seccion = Cod_Seccion;
        this.Cod_Materia = Cod_Materia;
        this.Nombre_Seccion = Nombre_Seccion;
        this.Estado_Seccion = Estado_Seccion;
    }
    
    public Secciones(int Cod_Seccion){
        this.Cod_Seccion = Cod_Seccion;
    }

    public static ArrayList getSecciones(Conexion con) throws SQLException {
        ArrayList lista = new ArrayList();
        con.setRs("Select * from secciones");
        ResultSet rs = con.getRs();

        while (rs.next()) {
            Secciones seccion = new Secciones(
                    rs.getInt("Cod_Seccion"),
                    rs.getInt("Cod_Materia"),
                    rs.getString("Nombre_Seccion"),
                    rs.getBoolean("Estado_Seccion")
            );

            lista.add(seccion);
        }
        return lista;
    }

   // public boolean guardar_Secciones(Conexion con) {
       public Integer guardar_Secciones(Conexion con) {
        Integer id = null;
        //boolean resultado = false;
        String sql = "INSERT INTO secciones (Cod_Materia, Nombre_Seccion, Estado_Seccion) "
                + "VALUES ('"
                
                + getCod_Materia() + "', '"
                + getNombre_Seccion() + "', "
                + Util.booleanToInt(isEstado_Seccion()) + ")";
        try {
            id = con.insertStatement(sql);
           // con.setQuery(sql);
          //  resultado = true;
        } catch (SQLException ex) {
             Logger.getLogger(Secciones.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("ERROR:Fallo en SQL guardar seccion: " + ex.getMessage());
        }
        //return resultado;
        return id;
       
    }

    public boolean actualizar_seccion(Conexion con) {
        boolean resultado = false;
        String sql = "UPDATE secciones SET Cod_Seccion = "
                + ", Cod_Materia = '" + getCod_Materia()
                + ", Nombre_Seccion = '" + getNombre_Seccion()
                + "' WHERE Cod_Seccion = '" + getCod_Seccion();
        try {
            con.setQuery(sql);
            resultado = true;
        } catch (SQLException ex) {
            System.out.println("ERROR:Fallo en SQL actualizar seccion: " + ex.getMessage());
        }
        return resultado;
    }

    public boolean eliminar_seccion(Conexion con) {
        boolean resultado = false;
        String sql = "UPDATE secciones SET Estado_Seccion = "
                + Util.booleanToInt(false)
                + " WHERE Cod_Seccion = '" + getCod_Seccion() + "'";
        try {
            con.setQuery(sql);
            resultado = true;
        } catch (SQLException ex) {
            System.out.println("ERROR:Fallo en SQL eliminar_Seccion: " + ex.getMessage());
        }
        return resultado;
    }

    public int getCod_Seccion() {
        return Cod_Seccion;
    }

    public void setCod_Seccion(int Cod_Seccion) {
        this.Cod_Seccion = Cod_Seccion;
    }

    public int getCod_Materia() {
        return Cod_Materia;
    }

    public void setCod_Materia(int Cod_Materia) {
        this.Cod_Materia = Cod_Materia;
    }

    public String getNombre_Seccion() {
        return Nombre_Seccion;
    }

    public void setNombre_Seccion(String Nombre_Seccion) {
        this.Nombre_Seccion = Nombre_Seccion;
    }

    public Boolean isEstado_Seccion() {
        return Estado_Seccion;
    }

    public void setEstado_Seccion(Boolean Estado_Seccion) {
        this.Estado_Seccion = Estado_Seccion;
    }
    
    @Override
    public String toString() {
       
        return this.getNombre_Seccion();
    }

    @Override
    public boolean equals(Object obj) {
        try {
            Secciones seccion = (Secciones) obj;
            return this.Cod_Seccion == seccion.getCod_Seccion();
           
        } catch (Exception ex) {
            return false;
        }
    }
    
}