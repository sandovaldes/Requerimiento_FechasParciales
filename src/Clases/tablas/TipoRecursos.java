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
public class TipoRecursos {

    private int Cod_Tipo_Recurso;
    private String Tipo_Recurso;
    private Boolean Estado_Tipo_Recurso;

    public TipoRecursos() {
    }

    public TipoRecursos(int Cod_Tipo_Recurso, String Tipo_Recurso, Boolean Estado_Tipo_Recurso) {
        this.Cod_Tipo_Recurso = Cod_Tipo_Recurso;
        this.Tipo_Recurso = Tipo_Recurso;
        this.Estado_Tipo_Recurso = Estado_Tipo_Recurso;
    }

    public ArrayList getTipoRecursos(Conexion con) throws SQLException {
        ArrayList lista = new ArrayList();
        con.setRs("Select * from tipo_recursos");
        ResultSet rs = con.getRs();

        while (rs.next()) {
            TipoRecursos tipoRecurso = new TipoRecursos(
                    rs.getInt("Cod_Tipo_Recurso"),
                    rs.getString("Tipo_Recurso"),
                    rs.getBoolean("Estado_Tipo_Recurso")
            );

            lista.add(tipoRecurso);
        }

        return lista;
    }

    public Integer guardar_tipo_recurdo(Conexion con) {
        Integer id = null;
        String sql = "INSERT INTO tipo_recursos (Tipo_Recurso, Estado_Tipo_Recurso)"
                + "VALUES ("
                + getTipo_Recurso() + "', "
                + Util.booleanToInt(isEstado_Tipo_Recurso()) + ")";
        try {
            id = con.insertStatement(sql);
        } catch (SQLException ex) {
            System.out.println("ERROR:Fallo en SQL guardar_tipo_recurdo: " + ex.getMessage());
            Logger.getLogger(TipoRecursos.class.getName()).log(Level.SEVERE, null, ex);
        }

        return id;
    }

    public boolean actualizar_tipo_Recurso(Conexion con) {
        boolean resultado = false;
        String sql = "UPDATE tipo_recursos SET Estado_Tipo_Recurso = "
                + Util.booleanToInt(isEstado_Tipo_Recurso())
                + ", Tipo_Recurso = '" + getTipo_Recurso()
                + " WHERE Cod_Tipo_Recurso = " + getCod_Tipo_Recurso();
        try {
            con.setQuery(sql);
            resultado = true;
        } catch (SQLException ex) {
            System.out.println("ERROR:Fallo en SQLen actualizar tipo recurso: " + ex.getMessage());
        }
        return resultado;
    }

    public boolean eliminar_Tipo_Recurso(Conexion con) {
        boolean resultado = false;
        String sql = "UPDATE facultad SET Estado_Cod_Tipo_Recurso = "
                + Util.booleanToInt(false)
                + " WHERE Cod_Tipo_Recurso = " + getCod_Tipo_Recurso();
        try {
            con.setQuery(sql);
            resultado = true;
        } catch (SQLException ex) {
            System.out.println("ERROR:Fallo en SQL en eliminar Tipo_Recurso: " + ex.getMessage());
        }
        return resultado;
    }

    public int getCod_Tipo_Recurso() {
        return Cod_Tipo_Recurso;
    }

    public void setCod_Tipo_Recurso(int Cod_Tipo_Recurso) {
        this.Cod_Tipo_Recurso = Cod_Tipo_Recurso;
    }

    public String getTipo_Recurso() {
        return Tipo_Recurso;
    }

    public void setTipo_Recurso(String Tipo_Recurso) {
        this.Tipo_Recurso = Tipo_Recurso;
    }

    public Boolean isEstado_Tipo_Recurso() {
        return Estado_Tipo_Recurso;
    }

    public void setEstado_Tipo_Recurso(Boolean Estado_Tipo_Recurso) {
        this.Estado_Tipo_Recurso = Estado_Tipo_Recurso;
    }
}