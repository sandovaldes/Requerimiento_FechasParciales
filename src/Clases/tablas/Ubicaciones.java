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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Erika
 */
public class Ubicaciones {

    public Ubicaciones() {
    }

    private int Cod_Ubicacion;
    private String Edificio;
    private Boolean Estado_Ubicacion;

    public Ubicaciones(int Cod_Ubicacion, String Edificio, Boolean Estado_Ubicacion) {
        this.Cod_Ubicacion = Cod_Ubicacion;
        this.Edificio = Edificio;
        this.Estado_Ubicacion = Estado_Ubicacion;
    }

    public ArrayList getUbicaciones(Conexion con) throws SQLException {
        ArrayList lista = new ArrayList();
        con.setRs("Select * from ubicaciones");
        ResultSet rs = con.getRs();

        while (rs.next()) {
            Ubicaciones ubicacion = new Ubicaciones(
                    rs.getInt("Cod_Ubicacion"),
                    rs.getString("Edificio"),
                    rs.getBoolean("Estado_Ubicacion")
            );

            lista.add(ubicacion);
        }

        return lista;
    }

    public Integer guardar_Ubicacion(Conexion con) {
        Integer id = null;
        String sql = "INSERT INTO Ubicaciones (Edificio, Estado_Ubicacion)"
                + "VALUES ("
                + getEdificio() + "', "
                + Util.booleanToInt(isEstado_Ubicacion()) + ")";
        try {
            id = con.insertStatement(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Ubicaciones.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("ERROR:Fallo en SQL guardar Ubicacion: " + ex.getMessage());
        }

        return id;
    }

    public boolean actualizar_Ubicacion(Conexion con) {
        boolean resultado = false;
        String sql = "UPDATE facultad SET Estado_Facultad = "
                + Util.booleanToInt(isEstado_Ubicacion())
                + ", Edificio = '" + getEdificio()
                + " WHERE Cod_Ubicacion = " + getCod_Ubicacion();
        try {
            con.setQuery(sql);
            resultado = true;
        } catch (SQLException ex) {
            System.out.println("ERROR:Fallo en SQLen actualizar Ubicacion: " + ex.getMessage());
        }
        return resultado;
    }

    public boolean eliminar_Ubicacion(Conexion con) {
        boolean resultado = false;
        String sql = "UPDATE Ubicaciones SET Estado_Ubicacion = "
                + Util.booleanToInt(false)
                + " WHERE Cod_Ubicacion = " + getCod_Ubicacion();
        try {
            con.setQuery(sql);
            resultado = true;
        } catch (SQLException ex) {
            System.out.println("ERROR:Fallo en SQL en eliminar Ubicacion: " + ex.getMessage());
        }
        return resultado;
    }

    //    @Override
//    public String toString() {
//        return nombreCompleto();
//    }
    public int getCod_Ubicacion() {
        return Cod_Ubicacion;
    }

    public void setCod_Ubicacion(int Cod_Ubicacion) {
        this.Cod_Ubicacion = Cod_Ubicacion;
    }

    public String getEdificio() {
        return Edificio;
    }

    public void setEdificio(String Edificio) {
        this.Edificio = Edificio;
    }

    public Boolean isEstado_Ubicacion() {
        return Estado_Ubicacion;
    }

    public void setEstado_Ubicacion(Boolean Estado_Ubicacion) {
        this.Estado_Ubicacion = Estado_Ubicacion;
    }
}