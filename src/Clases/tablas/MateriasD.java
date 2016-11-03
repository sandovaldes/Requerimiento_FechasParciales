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
public class MateriasD {

    private int Cod_Materia;
    private int Cod_Facultad;
    private String Abrev_Materia;
    private String Nombre_Materia;
    private int UV;
    private String Ciclo_Materia;
    private Boolean Estado_Materia;
    
    public MateriasD() {
    }

    public MateriasD(int Cod_Materia, int Cod_Facultad, String Abrev_Materia, String Nombre_Materia, int UV, String Ciclo_Materia, Boolean Estado_Materia) {
        this.Cod_Materia = Cod_Materia;
        this.Cod_Facultad = Cod_Facultad;
        this.Abrev_Materia = Abrev_Materia;
        this.Nombre_Materia = Nombre_Materia;
        this.UV = UV;
        this.Ciclo_Materia = Ciclo_Materia;
        this.Estado_Materia = Estado_Materia;
    }

     public static ArrayList getMaterias(Conexion con) throws SQLException {
        ArrayList lista = new ArrayList();
        con.setRs("SELECT * FROM materias WHERE Estado_Materia = 1");
        ResultSet rs = con.getRs();

        while (rs.next()) {
            MateriasD materia = new MateriasD(
                    rs.getInt("Cod_Materia"),
                    rs.getInt("Cod_Facultad"),
                    rs.getString("Abrev_Materia"),
                    rs.getString("Nombre_Materia"),
                    rs.getInt("UV"),
                    rs.getString("Ciclo_Materia"),
                    rs.getBoolean("Estado_Materia")
            );

            lista.add(materia);
        }

        return lista;
    }
    
    public Integer guardar_materias(Conexion con) {
        Integer id = null;

        String sql = "INSERT INTO materias (Cod_Facultad,Abrev_Materia,Nombre_Materia,UV,Ciclo_Materia,Estado_Materia) "
                + " VALUES (" + getCod_Facultad() + ", '" + getAbrev_Materia() + "', '"
                + getNombre_Materia() + "', " + getUV() + ", '" + getCiclo_Materia() + "', "
                + Util.booleanToInt(isEstado_Materia()) + ")";
        System.out.println("SQL: " + sql);
        try {
            id = con.insertStatement(sql);
        } catch (SQLException ex) {
            System.out.println("ERROR:Fallo en SQL guardar materia: " + ex.getMessage());
            Logger.getLogger(MateriasD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
    
    public boolean actualizar_materia(Conexion con) {
        boolean valor = false;
        String sql;
        try {
            sql = ("UPDATE materias SET "
                    + "Cod_Facultad = " + getCod_Facultad() + ", "
                    + "Abrev_Materia = '" + getAbrev_Materia() + "', "
                    + "Nombre_Materia = '" + getNombre_Materia() + "', "
                    + "UV = " + getUV() + ", "
                    + "Ciclo_Materia = '" + getCiclo_Materia() + "', "
                    + "Estado_Materia = " + Util.booleanToInt(isEstado_Materia())
                    + " WHERE Cod_Materia = " + this.getCod_Materia());

            con.setQuery(sql);
            System.out.println("SQL: " + sql);
            valor = true;
        } catch (SQLException ex) {

            System.out.println("ERROR:Fallo en SQL en modificacion de materia: " + ex.getMessage());
        }
        return valor;
    }

    public boolean eliminar_materia(Conexion con) {
        boolean resultado = false;
        String sql = "UPDATE materias SET Estado_Materia = "
                + Util.booleanToInt(false)
                + " WHERE Cod_Materia = " + this.getCod_Materia();
        try {
            con.setQuery(sql);
            resultado = true;
        } catch (SQLException ex) {
            System.out.println("ERROR:Fallo en SQL en eliminar materia: " + ex.getMessage());
        }
        return resultado;
    }
    
    public String getAbrev_Materia() {
        return Abrev_Materia;
    }

    public void setAbrev_Materia(String Abrev_Materia) {
        this.Abrev_Materia = Abrev_Materia;
    }

    public int getCod_Materia() {
        return Cod_Materia;
    }

    public void setCod_Materia(int Cod_Materia) {
        this.Cod_Materia = Cod_Materia;
    }

    public int getCod_Facultad() {
        return Cod_Facultad;
    }

    public void setCod_Facultad(int Cod_Facultad) {
        this.Cod_Facultad = Cod_Facultad;
    }

    public String getNombre_Materia() {
        return Nombre_Materia;
    }

    public void setNombre_Materia(String Nombre_Materia) {
        this.Nombre_Materia = Nombre_Materia;
    }

    public int getUV() {
        return UV;
    }

    public void setUV(int UV) {
        this.UV = UV;
    }

    public String getCiclo_Materia() {
        return Ciclo_Materia;
    }

    public void setCiclo_Materia(String Ciclo_Materia) {
        this.Ciclo_Materia = Ciclo_Materia;
    }

    public Boolean isEstado_Materia() {
        return Estado_Materia;
    }

    public void setEstado_Materia(Boolean Estado_Materia) {
        this.Estado_Materia = Estado_Materia;
    }

    @Override
    public String toString() {
        return this.Nombre_Materia;
    }
}
