/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases.tablas;

import Clases.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Erika
 */
public class Personas {

    private int Cod_Personas;
    private String DUI;
    private String Prim_Nombre;
    private String Seg_Nombre;
    private String Prim_Apellido;
    private String Seg_Apellido;
    private String Genero;
    private String Estado_Civil;
    private Date Fecha_Nacimiento;
    private String Telefono;
    private String Direccion;
    private Boolean Estado_Persona;

    public Personas() {
    }

    public Personas(String Prim_Nombre, String Seg_Nombre, String Prim_Apellido, String Seg_Apellido) {
        this.Prim_Nombre = Prim_Nombre;
        this.Seg_Nombre = Seg_Nombre;
        this.Prim_Apellido = Prim_Apellido;
        this.Seg_Apellido = Seg_Apellido;
    }

    public Personas(int Cod_Personas, String DUI, String Prim_Nombre, String Seg_Nombre, String Prim_Apellido, String Seg_Apellido, String Genero, String Estado_Civil, Date Fecha_Nacimiento, String Telefono, String Direccion, Boolean Estado_Persona) {
        this.Cod_Personas = Cod_Personas;
        this.DUI = DUI;
        this.Prim_Nombre = Prim_Nombre;
        this.Seg_Nombre = Seg_Nombre;
        this.Prim_Apellido = Prim_Apellido;
        this.Seg_Apellido = Seg_Apellido;
        this.Genero = Genero;
        this.Estado_Civil = Estado_Civil;
        this.Fecha_Nacimiento = Fecha_Nacimiento;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
        this.Estado_Persona = Estado_Persona;
    }

    public static ArrayList getPersonas(Conexion con) throws SQLException {
        ArrayList lista = new ArrayList();
        con.setRs("Select * from personas");
        ResultSet rs = con.getRs();

        while (rs.next()) {
            Personas persona = new Personas(
                    rs.getInt("Cod_Personas"),
                    rs.getString("DUI"),
                    rs.getString("Prim_Nombre"),
                    rs.getString("Seg_Nombre"),
                    rs.getString("Prim_Apellido"),
                    rs.getString("Seg_Apellido"),
                    rs.getString("Genero"),
                    rs.getString("Estado_Civil"),
                    rs.getDate("Fecha_Nacimiento"),
                    rs.getString("Telefono"),
                    rs.getString("Direccion"),
                    rs.getBoolean("Estado_Persona")
            );

            lista.add(persona);
        }

        return lista;
    }

    public static Personas getPersona(Conexion con, int id) throws SQLException {
        Personas persona = null;
        con.setRs("Select * from personas where Cod_Personas =" + id);
        ResultSet rs = con.getRs();

        while (rs.next()) {
            persona = new Personas(
                    rs.getInt("Cod_Personas"),
                    rs.getString("DUI"),
                    rs.getString("Prim_Nombre"),
                    rs.getString("Seg_Nombre"),
                    rs.getString("Prim_Apellido"),
                    rs.getString("Seg_Apellido"),
                    rs.getString("Genero"),
                    rs.getString("Estado_Civil"),
                    rs.getDate("Fecha_Nacimiento"),
                    rs.getString("Telefono"),
                    rs.getString("Direccion"),
                    rs.getBoolean("Estado_Persona")
            );
        }

        return persona;
    }

    public Integer guardar_personas(Conexion con) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Integer id = null;

        String sql = "INSERT INTO personas "
                + "(DUI,Prim_Nombre,Seg_Nombre,Prim_Apellido,Seg_Apellido,"
                + "Genero,Estado_Civil,Fecha_Nacimiento,Telefono,Direccion,Estado_Persona)"
                + " VALUES( "
                + "'" + getDUI() + "', "
                + "'" + getPrim_Nombre() + "', "
                + "'" + getSeg_Nombre() + "', "
                + "'" + getPrim_Apellido() + "', "
                + "'" + getSeg_Apellido() + "', "
                + "'" + getGenero() + "', "
                + "'" + getEstado_Civil() + "', "
                + "STR_TO_DATE('" + df.format(getFecha_Nacimiento()) + "', '%d/%m/%Y'), "
                + "'" + getTelefono() + "', 1 )";

        System.out.println(sql);
        try {
            id = con.insertStatement(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Personas.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("ERROR:Fallo en SQL: " + ex.getMessage());
        }
        return id;
    }

    public boolean actualizar_personas(Conexion con) {
        boolean valor = false;
        try {
            String sql = ("UPDATE peronas SET"
                    //  + " Cod_Docente ="    + " '" + getCod_docente() + "' " + ","
                    + " DUI =" + " '" + getDUI() + "' " + ","
                    + " Prim_Nombre =" + " '" + getPrim_Nombre() + "' " + ","
                    + " Seg_Nombre = " + " '" + getSeg_Nombre() + "' " + ","
                    + " Prim_Apellido =" + " '" + getPrim_Apellido() + "' " + ","
                    + " Seg_Apellido =" + " '" + getSeg_Apellido() + "' " + ","
                    + " Genero = " + " '" + getGenero() + "'" + ","
                    + " Estado_Civil =" + " '" + getEstado_Civil() + "'" + ","
                    + " Fecha_Nacimiento =" + " '" + getFecha_Nacimiento() + "'" + ","
                    + " Telefono_Particular = " + " '" + getTelefono() + "'" + ","
                    + "Direccion =" + " '" + getDireccion() + "'"
                    + "' "
                    + " WHERE Cod_Peronas = " + this.getCod_Personas());
            con.setQuery(sql);
            valor = true;
        } catch (SQLException ex) {
            System.out.println("ERROR:Fallo en SQL en modificacion de personas: " + ex.getMessage());
        }
        return valor;
    }

    public boolean eliminar_personas(Conexion con) {
        boolean valor = false;
        try {
            String sql = ("UPDATE personas SET Estado_Persona='' WHERE Cod_personas = " + this.getCod_Personas());
            con.setQuery(sql);
            System.out.println("SQL: " + sql);
            valor = true;

        } catch (SQLException ex) {
            System.out.println("ERROR:Fallo en SQL en eliminacion de personas: " + ex.getMessage());
        }
        return valor;
    }

    //    @Override
//    public String toString() {
//        return nombreCompleto();
//    }
    public int getCod_Personas() {
        return Cod_Personas;
    }

    public void setCod_Personas(int Cod_Personas) {
        this.Cod_Personas = Cod_Personas;
    }

    public String getDUI() {
        return DUI;
    }

    public void setDUI(String DUI) {
        this.DUI = DUI;
    }

    public String getPrim_Nombre() {
        return Prim_Nombre;
    }

    public void setPrim_Nombre(String Prim_Nombre) {
        this.Prim_Nombre = Prim_Nombre;
    }

    public String getSeg_Nombre() {
        return Seg_Nombre;
    }

    public void setSeg_Nombre(String Seg_Nombre) {
        this.Seg_Nombre = Seg_Nombre;
    }

    public String getPrim_Apellido() {
        return Prim_Apellido;
    }

    public void setPrim_Apellido(String Prim_Apellido) {
        this.Prim_Apellido = Prim_Apellido;
    }

    public String getSeg_Apellido() {
        return Seg_Apellido;
    }

    public void setSeg_Apellido(String Seg_Apellido) {
        this.Seg_Apellido = Seg_Apellido;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getEstado_Civil() {
        return Estado_Civil;
    }

    public void setEstado_Civil(String Estado_Civil) {
        this.Estado_Civil = Estado_Civil;
    }

    public Date getFecha_Nacimiento() {
        return Fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(Date Fecha_Nacimiento) {
        this.Fecha_Nacimiento = Fecha_Nacimiento;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public Boolean isEstado_Persona() {
        return Estado_Persona;
    }

    public void setEstado_Persona(Boolean Estado_Persona) {
        this.Estado_Persona = Estado_Persona;
    }

    public String nombreCompleto() {
        return Prim_Nombre + " " + Seg_Nombre + " " + Prim_Apellido + " " + Seg_Apellido;
    }

    @Override
    public String toString() {
        return nombreCompleto();
    }

}
