/*
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

/**
 *
 * @author Erika
 */
public class Roles {

    private Character Cod_Rol;
    private String Descripcion_Rol;
    private Boolean Estado_Rol;

    public Roles() {
    }

    public Roles(String Descripcion_Rol) {
        this.Descripcion_Rol = Descripcion_Rol;
    }

    public Roles(Character Cod_Rol, String Descripcion_Rol, Boolean Estado_Rol) {
        this.Cod_Rol = Cod_Rol;
        this.Descripcion_Rol = Descripcion_Rol;
        this.Estado_Rol = Estado_Rol;
    }

    public static ArrayList getRoles(Conexion con) throws SQLException {
        ArrayList lista = new ArrayList();
        con.setRs("Select * from roles");
        ResultSet rs = con.getRs();

        while (rs.next()) {
            Roles rol = new Roles(
                    rs.getString("Cod_Rol").charAt(0),
                    rs.getString("Descripcion_Rol"),
                    rs.getBoolean("Estado_Rol")
            );

            lista.add(rol);
        }

        return lista;
    }

    public static Roles getRol(Conexion con, char id) throws SQLException {
        Roles resultado = null;

        con.setRs("SELECT * FROM roles WHERE Cod_Rol = '" + id + "'");
        ResultSet rs = con.getRs();

        while (rs.next()) {
            resultado = new Roles(
                    rs.getString("Cod_Rol").charAt(0),
                    rs.getString("Descripcion_Rol"),
                    rs.getBoolean("Estado_Rol")
            );
        }

        return resultado;
    }

    public boolean guardar_rol(Conexion con) {
        boolean resultado = false;
        String sql = "INSERT INTO roles (Cod_Rol, Descripcion_Rol, Estado_Rol) "
                + "VALUES ('"
                + getCod_Rol() + "', '"
                + getDescripcion_Rol() + "', "
                + Util.booleanToInt(isEstado_Rol()) + ")";
        try {
            con.setQuery(sql);
            resultado = true;
        } catch (SQLException ex) {
            System.out.println("ERROR:Fallo en SQL guardar rol: " + ex.getMessage());
        }
        return resultado;
    }

    public boolean actualizar_rol(Conexion con) {
        boolean resultado = false;
        String sql = "UPDATE roles SET Estado_Rol = "
                + Util.booleanToInt(isEstado_Rol())
                + ", Descripcion_Rol = '" + getDescripcion_Rol()
                + "' WHERE Cod_Rol = '" + getCod_Rol() + "'";
        try {
            con.setQuery(sql);
            resultado = true;
        } catch (SQLException ex) {
            System.out.println("ERROR:Fallo en SQL actualizar rol: " + ex.getMessage());
        }
        return resultado;
    }

    public boolean eliminar_rol(Conexion con) {
        boolean resultado = false;
        String sql = "UPDATE roles SET Estado_Rol = "
                + Util.booleanToInt(false)
                + " WHERE Cod_Rol = '" + getCod_Rol() + "'";
        try {
            con.setQuery(sql);
            resultado = true;
        } catch (SQLException ex) {
            System.out.println("ERROR:Fallo en SQL eliminar_rol: " + ex.getMessage());
        }
        return resultado;
    }

    public Character getCod_Rol() {
        return Cod_Rol;
    }

    public void setCod_Rol(Character Cod_Rol) {
        this.Cod_Rol = Cod_Rol;
    }

    public String getDescripcion_Rol() {
        return Descripcion_Rol;
    }

    public void setDescripcion_Rol(String Descripcion_Rol) {
        this.Descripcion_Rol = Descripcion_Rol;
    }

    public Boolean isEstado_Rol() {
        return Estado_Rol;
    }

    public void setEstado_Rol(Boolean Estado_Rol) {
        this.Estado_Rol = Estado_Rol;
    }

//    @Override
//    public String toString() {
//        return nombreCompleto();
//    }
}
