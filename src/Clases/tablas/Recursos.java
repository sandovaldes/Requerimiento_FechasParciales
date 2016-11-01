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
public class Recursos {

    public Recursos() {
    }

    private int Cod_Recurso;
    private int Cod_Tipo_Recurso;
    private String Descripcion_Recurso;
    private Boolean Estado_Recurso;

    public Recursos(int Cod_Recurso, int Cod_Tipo_Recurso, String Descripcion_Recurso, Boolean Estado_Recurso) {
        this.Cod_Recurso = Cod_Recurso;
        this.Cod_Tipo_Recurso = Cod_Tipo_Recurso;
        this.Descripcion_Recurso = Descripcion_Recurso;
        this.Estado_Recurso = Estado_Recurso;
    }

    public ArrayList getRecursos(Conexion con) throws SQLException {
        ArrayList lista = new ArrayList();
        con.setRs("Select * from recursos");
        ResultSet rs = con.getRs();

        while (rs.next()) {
            Recursos recurso = new Recursos(
                    rs.getInt("Cod_Recurso"),
                    rs.getInt("Cod_Tipo_Recurso"),
                    rs.getString("Descripcion_Recurso"),
                    rs.getBoolean("Estado_Recurso")
            );

            lista.add(recurso);
        }

        return lista;
    }

    public Integer guardar_recursos(Conexion con) {
        Integer id = null;
        String sql = "INSERT INTO recursos (Cod_Tipo_Recurso,Descripcion_Recurso,Estado_recurso)"
                + "VALUES ("
                + getCod_Tipo_Recurso() + "', "
                + getDescripcion_Recurso() + "', "
                + Util.booleanToInt(isEstado_Recurso()) + ")";
        try {
            id = con.insertStatement(sql);
        } catch (SQLException ex) {
            System.out.println("ERROR:Fallo en SQL en guardar recurso: " + ex.getMessage());
            Logger.getLogger(Recursos.class.getName()).log(Level.SEVERE, null, ex);
        }

        return id;
    }

    public boolean actualizar_recurso(Conexion con) {
        boolean resultado = false;
        String sql = "UPDATE recurso SET Estado_Facultad = "
                + Util.booleanToInt(isEstado_Recurso())
                + ", Cod_Tipo_Recurso = '" + getCod_Tipo_Recurso()
                + ", Descripcion_Recurso = '" + getDescripcion_Recurso()
                + " WHERE Cod_Recurso = " + getCod_Recurso();
        try {
            con.setQuery(sql);
            resultado = true;
        } catch (SQLException ex) {
            System.out.println("ERROR:Fallo en SQLen actualizarrecurso: " + ex.getMessage());
        }
        return resultado;
    }

    public boolean eliminar_recurso(Conexion con) {
        boolean resultado = false;
        String sql = "UPDATE recurso SET Estado_Recurso = "
                + Util.booleanToInt(false)
                + " WHERE Cod_Recurso = " + getCod_Recurso();
        try {
            con.setQuery(sql);
            resultado = true;
        } catch (SQLException ex) {
            System.out.println("ERROR:Fallo en SQL en eliminar recurso: " + ex.getMessage());
        }
        return resultado;
    }

    public int getCod_Recurso() {
        return Cod_Recurso;
    }

    public void setCod_Recurso(int Cod_Recurso) {
        this.Cod_Recurso = Cod_Recurso;
    }

    public int getCod_Tipo_Recurso() {
        return Cod_Tipo_Recurso;
    }

    public void setCod_Tipo_Recurso(int Cod_Tipo_Recurso) {
        this.Cod_Tipo_Recurso = Cod_Tipo_Recurso;
    }

    public String getDescripcion_Recurso() {
        return Descripcion_Recurso;
    }

    public void setDescripcion_Recurso(String Descripcion_Recurso) {
        this.Descripcion_Recurso = Descripcion_Recurso;
    }

    public Boolean isEstado_Recurso() {
        return Estado_Recurso;
    }

    public void setEstado_Recurso(Boolean Estado_Recurso) {
        this.Estado_Recurso = Estado_Recurso;
    }
}