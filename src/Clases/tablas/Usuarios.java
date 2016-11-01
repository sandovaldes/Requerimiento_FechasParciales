/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases.tablas;

import Clases.Conexion;
import Clases.Util;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Erika
 */
public class Usuarios {

    public Usuarios() {
    }

    public Usuarios(String Nombre_Usuario) {
        this.Nombre_Usuario = Nombre_Usuario;
    }

   
    private int Cod_Usuario;
    private Personas persona;
    private Character Cod_Rol;
    private Integer Cod_Docente;
    private String Nombre_Usuario;
    private String Contraenia_Usuario;
    private Boolean Estado_Usuario;
    private Roles rol;

    public Usuarios(int Cod_Usuario, Personas persona, Character Cod_Rol, Integer Cod_Docente, String Nombre_Usuario, String Contraenia_Usuario, Boolean Estado_Usuario, Roles rol) {
        this.Cod_Usuario = Cod_Usuario;
        this.persona = persona;
        this.Cod_Rol = Cod_Rol;
        this.Cod_Docente = Cod_Docente;
        this.Nombre_Usuario = Nombre_Usuario;
        this.Contraenia_Usuario = Contraenia_Usuario;
        this.Estado_Usuario = Estado_Usuario;
        this.rol = rol;
    }

    public static ArrayList getUsuarios(Conexion con) throws SQLException {
        Conexion subQuery = new Conexion();
        Conexion subQuery2 = new Conexion();
        ArrayList lista = new ArrayList();
        con.setRs("Select * FROM usuarios WHERE Estado_Usuario = 1");
        ResultSet rs = con.getRs();

        while (rs.next()) {
            Usuarios usuario = new Usuarios(
                    rs.getInt("Cod_Usuario"),
                    Roles.getRol(subQuery2, rs.getString("Cod_Rol").charAt(0)),
                    Personas.getPersona(subQuery, rs.getInt("Cod_Persona")),
                    rs.getString("Cod_Rol").charAt(0),
                    rs.getString("Nombre_Usuario"),
                    rs.getBoolean("Estado_Usuario")
            );

            lista.add(usuario);
        }
        subQuery.cerrarConeccion();
        subQuery2.cerrarConeccion();
        return lista;
    }

    public static Usuarios getUsuario(Conexion con, String nombreDeUsuario) throws SQLException {
        Conexion subQuery = new Conexion();
        Conexion subQuery2 = new Conexion();
        Usuarios usuario = null;
        con.setRs("Select * FROM usuarios WHERE Nombre_Usuario = ?", new Object[]{nombreDeUsuario});
        ResultSet rs = con.getRs();

        while (rs.next()) {
            usuario = new Usuarios(
                    rs.getInt("Cod_Usuario"),
                    Roles.getRol(subQuery2, rs.getString("Cod_Rol").charAt(0)),
                    Personas.getPersona(subQuery, rs.getInt("Cod_Persona")),
                    rs.getString("Cod_Rol").charAt(0),
                    rs.getString("Nombre_Usuario"),
                    rs.getBoolean("Estado_Usuario")
            );
        }
        subQuery.cerrarConeccion();
        subQuery2.cerrarConeccion();
        return usuario;
    }

    public static boolean login(String usuario, String contrasenia, Coneccion con) throws SQLException {
        boolean resultado = true;
        CallableStatement stmt = null;
        try {
            stmt = con.getConexion().prepareCall("{call Login_usuario_disp(?,?,?)}");
            stmt.setString(1, usuario);
            stmt.setString(2, contrasenia);
            stmt.registerOutParameter(3, Types.TINYINT);

            stmt.executeUpdate();

            if (stmt.getInt(3) > 0) {
                resultado = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            stmt.close();
        }

        return resultado;
    }

    public boolean insertar(Conexion con) throws SQLException {
        boolean resultado = false;
        CallableStatement stmt = null;
        try {
            stmt = con.getConeccion().prepareCall("{call Nuevo_usuario_disp(?,?,?,?,?)}");
            stmt.setInt(1, getCod_Docente());
            stmt.setString(2, String.valueOf(getCod_Rol()));
            stmt.setString(3, getNombre_Usuario());
            stmt.setString(4, getContraenia_Usuario());
            stmt.setBoolean(5, this.isEstado_Usuario());

            stmt.executeUpdate();

            resultado = true;

        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            stmt.close();
        }

        return resultado;
    }

    //ACTUALIZAR USUARIOS
    public boolean actualizar_usuario(Conexion con) {
        boolean resultado = false;
        String sql = "UPDATE usuarios SET Estado_Usuario = "
                + Util.booleanToInt(isEstado_Usuario())
                + ", Nombre_Usuario = '" + getNombre_Usuario()
                + "' WHERE Cod_Usuario = " + getCod_Usuario();
        try {
            con.setQuery(sql);
            resultado = true;
        } catch (SQLException ex) {
            System.out.println("ERROR:Fallo en SQL: actualizar usuario " + ex.getMessage());
        }
        return resultado;
    }

    //ELIMINAR
    public boolean eliminar_usuario(Conexion con) {
        boolean resultado = false;

        String sql = "UPDATE usuarios SET Estado_Usuario = "
                + Util.booleanToInt(false)
                + " WHERE Cod_Usuario = " + getCod_Usuario();
        try {
            con.setQuery(sql);
            resultado = true;
        } catch (SQLException ex) {
            System.out.println("ERROR:Fallo en SQL: " + ex.getMessage());
        }
        return resultado;
    }

    public int getCod_Usuario() {
        return Cod_Usuario;
    }

    public void setCod_Usuario(int Cod_Usuario) {
        this.Cod_Usuario = Cod_Usuario;
    }

    public Personas getPersona() {
        return persona;
    }

    public void setPersona(Personas persona) {
        this.persona = persona;
    }

 


    public Character getCod_Rol() {
        return Cod_Rol;
    }

    public void setCod_Rol(Character Cod_Rol) {
        this.Cod_Rol = Cod_Rol;
    }

    public String getNombre_Usuario() {
        return Nombre_Usuario;
    }

    public void setNombre_Usuario(String Nombre_Usuario) {
        this.Nombre_Usuario = Nombre_Usuario;
    }

    public Boolean isEstado_Usuario() {
        return Estado_Usuario;
    }

    public void setEstado_Usuario(Boolean Estado_Usuario) {
        this.Estado_Usuario = Estado_Usuario;
    }

    public Roles getRol() {
        return rol;
    }

    public void setRol(Roles rol) {
        this.rol = rol;
    }

    public String getContraenia_Usuario() {
        return Contraenia_Usuario;
    }

    public void setContraenia_Usuario(String Contraenia_Usuario) {
        this.Contraenia_Usuario = Contraenia_Usuario;
    }

    public Integer getCod_Docente() {
        return Cod_Docente;
    }

    public void setCod_Docente(Integer Cod_Docente) {
        this.Cod_Docente = Cod_Docente;
    }

    @Override
    public String toString() {
        return this.Nombre_Usuario;
    }

    @Override
    public boolean equals(Object obj) {
        try {
            Usuarios usuario = (Usuarios) obj;
            return this.Nombre_Usuario == usuario.getNombre_Usuario();
        } catch (Exception ex) {
            return false;
        }
    }
}
