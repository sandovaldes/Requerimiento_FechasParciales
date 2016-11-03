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
public class Aulas {

    private int Cod_Aulas;
    private int Cod_Ubicacion;
    private String Descripcion_Ubicacion;
    private Boolean Estado_Ubicacion;

    public Aulas() {
    }

    public Aulas(String Descripcion_Ubicacion) {
        this.Descripcion_Ubicacion = Descripcion_Ubicacion;
    }

    public Aulas(int Cod_Aulas, int Cod_Ubicacion, String Descripcion_Ubicacion, Boolean Estado_Ubicacion) {
        this.Cod_Aulas = Cod_Aulas;
        this.Cod_Ubicacion = Cod_Ubicacion;
        this.Descripcion_Ubicacion = Descripcion_Ubicacion;
        this.Estado_Ubicacion = Estado_Ubicacion;
    }

    public static ArrayList getAulas(Conexion con) throws SQLException {
        ArrayList lista = new ArrayList();
        con.setRs("Select * from aulas");
        ResultSet rs = con.getRs();

        while (rs.next()) {
            Aulas aula = new Aulas(
                    rs.getInt("Cod_Aulas"),
                    rs.getInt("Cod_Ubicacion"),
                    rs.getString("Descripcion_Ubicacion"),
                    rs.getBoolean("Estado_Ubicacion")
            );

            lista.add(aula);
        }

        return lista;
    }

    public Integer guardar_aulas(Conexion con) {
        Integer id = null;
        String sql = "INSERT INTO aulas (Cod_Ubicacion,Descripcion_Ubicacion, Estado_Ubicacion)"
                + "VALUES ("
                + getCod_Ubicacion() + "', "
                + getDescripcion_Ubicacion() + "', "
                + Util.booleanToInt(isEstado_Ubicacion()) + ")";
        try {
            id = con.insertStatement(sql);
        } catch (SQLException ex) {
            System.out.println("ERROR:Fallo en SQL guardar_aulas: " + ex.getMessage());
        }
        return id;
    }

    public boolean actualizar_aulas(Conexion con) {
        boolean resultado = false;
        String sql = "UPDATE aulas SET Estado_Ubicacion = "
                + Util.booleanToInt(isEstado_Ubicacion())
                + ", Cod_Ubicacion = '" + getCod_Ubicacion()
                + ", Descripcion_Ubicacion = '" + getDescripcion_Ubicacion()
                + " WHERE Cod_Aulas = " + getCod_Aulas();
        try {
            con.setQuery(sql);
            resultado = true;
        } catch (SQLException ex) {
            System.out.println("ERROR:Fallo en SQLen actualizar aulas: " + ex.getMessage());
        }
        return resultado;
    }

    public boolean eliminar_aulas(Conexion con) {
        boolean resultado = false;
        String sql = "UPDATE aulas SET Estado_Aulas = "
                + Util.booleanToInt(false)
                + " WHERE Cod_Aulas = " + getCod_Aulas();
        try {
            con.setQuery(sql);
            resultado = true;
        } catch (SQLException ex) {
            System.out.println("ERROR:Fallo en SQL en eliminar aulas: " + ex.getMessage());
        }
        return resultado;
    }

    public int getCod_Aulas() {
        return Cod_Aulas;
    }

    public void setCod_Aulas(int Cod_Aulas) {
        this.Cod_Aulas = Cod_Aulas;
    }

    public int getCod_Ubicacion() {
        return Cod_Ubicacion;
    }

    public void setCod_Ubicacion(int Cod_Ubicacion) {
        this.Cod_Ubicacion = Cod_Ubicacion;
    }

    public String getDescripcion_Ubicacion() {
        return Descripcion_Ubicacion;
    }

    public void setDescripcion_Ubicacion(String Descripcion_Ubicacion) {
        this.Descripcion_Ubicacion = Descripcion_Ubicacion;
    }

    public Boolean isEstado_Ubicacion() {
        return Estado_Ubicacion;
    }

    public void setEstado_Ubicacion(Boolean Estado_Ubicacion) {
        this.Estado_Ubicacion = Estado_Ubicacion;
    }

    @Override
    public String toString() {
        return Descripcion_Ubicacion;
    }
}
