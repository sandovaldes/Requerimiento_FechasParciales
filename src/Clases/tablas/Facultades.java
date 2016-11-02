/*lucia
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
public class Facultades {

    public Facultades() {
    }

    private int Cod_Facultad;
    private String Nombre_Facultad;
    private Boolean Estado_Facultad;
    
    public Facultades(int Cod_Facultad){
        this.Cod_Facultad = Cod_Facultad;
    }

    public Facultades(int Cod_Facultad, String Nombre_Facultad, Boolean Estado_Facultad) {
        this.Cod_Facultad = Cod_Facultad;
        this.Nombre_Facultad = Nombre_Facultad;
        this.Estado_Facultad = Estado_Facultad;
    }
   
     public static ArrayList getFacultades(Conexion con) throws SQLException {
   
        ArrayList lista = new ArrayList();
        con.setRs("Select * from facultades");
        ResultSet rs = con.getRs();

        while (rs.next()) {
            Facultades facultad = new Facultades(
                    rs.getInt("Cod_Facultad"),
                    rs.getString("Nombre_Facultad"),
                    rs.getBoolean("Estado_Facultad")
            );

            lista.add(facultad);
        }

        return lista;
    }

    public Integer guardar_facultad(Conexion con) {
        Integer id = null;
        String sql = "INSERT INTO facultades (Nombre_Facultad, Estado_Facultad)"
                + "VALUES ("
                + getNombre_Facultad() + "', "
                + Util.booleanToInt(isEstado_Facultad()) + ")";
        try {
            id = con.insertStatement(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Facultades.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("ERROR:Fallo en SQL: " + ex.getMessage());
        }
        return id;
    }

    public boolean actualizar_facultad(Conexion con) {
        boolean resultado = false;
        String sql = "UPDATE facultades SET Estado_Facultad = "
                + Util.booleanToInt(isEstado_Facultad())
                + ", Nombre_Facultad = '" + getNombre_Facultad()
                + " WHERE Cod_Facultad = " + getCod_Facultad();
        try {
            con.setQuery(sql);
            resultado = true;
        } catch (SQLException ex) {
            System.out.println("ERROR:Fallo en SQLen actualizar facultad: " + ex.getMessage());
        }
        return resultado;
    }

    public boolean eliminar_facultad(Conexion con) {
        boolean resultado = false;
        String sql = "UPDATE facultades SET Estado_Facultad = "
                + Util.booleanToInt(false)
                + " WHERE Cod_Facultad = " + getCod_Facultad();
        try {
            con.setQuery(sql);
            resultado = true;
        } catch (SQLException ex) {
            System.out.println("ERROR:Fallo en SQL en eliminar facultad: " + ex.getMessage());
        }
        return resultado;
    }

    public int getCod_Facultad() {
        return Cod_Facultad;
    }

    public void setCod_Facultad(int Cod_Facultad) {
        this.Cod_Facultad = Cod_Facultad;
    }

    public String getNombre_Facultad() {
        return Nombre_Facultad;
    }

    public void setNombre_Facultad(String Nombre_Facultad) {
        this.Nombre_Facultad = Nombre_Facultad;
    }

    public Boolean isEstado_Facultad() {
        return Estado_Facultad;
    }

    public void setEstado_Facultad(Boolean Estado_Facultad) {
        this.Estado_Facultad = Estado_Facultad;
    }

    @Override
    public String toString() {
        return this.getNombre_Facultad();
    }

    @Override
    public boolean equals(Object obj) {
        try {
            Facultades facultad = (Facultades) obj;
            return this.Cod_Facultad == facultad.getCod_Facultad();
        } catch (Exception ex) {
            return false;
        }
    }
}
