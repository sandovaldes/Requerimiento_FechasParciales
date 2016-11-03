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
public class ParcialReservas {

    public ParcialReservas() {
    }

    private int Cod_Parcial_Reserva;
    private int Cod_Materia;
    private int Cod_Usuario;
    private int Cod_Aula;
    private int Cod_Seccion;
    private Date Dia_Parcial;
    private String Hora_Parcial;
    private Boolean Aula_Adicional_Parcial;
    private Boolean Vigilancia_PArcial;
    private Boolean Instructor;
    private Boolean Estado_ReservaParcial;
    private MateriasD materia;

    public ParcialReservas(int Cod_Parcial_Reserva, int Cod_Materia, int Cod_Usuario, int Cod_Aula, int Cod_Seccion, Date Dia_Parcial, String Hora_Parcial, Boolean Aula_Adicional_Parcial, Boolean Vigilancia_PArcial, Boolean Instructor, Boolean Estado_ReservaParcial) {
        this.Cod_Parcial_Reserva = Cod_Parcial_Reserva;
        this.Cod_Materia = Cod_Materia;
        this.Cod_Usuario = Cod_Usuario;
        this.Cod_Aula = Cod_Aula;
        this.Cod_Seccion = Cod_Seccion;
        this.Dia_Parcial = Dia_Parcial;
        this.Hora_Parcial = Hora_Parcial;
        this.Aula_Adicional_Parcial = Aula_Adicional_Parcial;
        this.Vigilancia_PArcial = Vigilancia_PArcial;
        this.Instructor = Instructor;
        this.Estado_ReservaParcial = Estado_ReservaParcial;
    }

    public static ArrayList getParcialReservas(Conexion con) throws SQLException {
        Conexion subquery = new Conexion();
        ArrayList lista = new ArrayList();
        con.setRs("SELECT * FROM parcial_revervas WHERE Estado_ReservaParcial = 1");
        ResultSet rs = con.getRs();

        while (rs.next()) {
            ParcialReservas rp = new ParcialReservas(
                    rs.getInt("Cod_Parcial_Reserva"),
                    rs.getInt("Cod_Materia"),
                    rs.getInt("Cod_Usuario"),
                    rs.getInt("Cod_Aula"),
                    rs.getInt("Cod_Seccion"),
                    rs.getDate("Dia_Parcial"),
                    rs.getString("Hora_Parcial"),
                    rs.getBoolean("Aula_Adicional_Parcial"),
                    rs.getBoolean("Vigilancia_PArcial"),
                    rs.getBoolean("Instructor"),
                    rs.getBoolean("Estado_ReservaParcial")
            );
            
            rp.setMateria(MateriasD.getMaterias(rs.getInt("Cod_Materia"), con));

            lista.add(rp);
        }

        return lista;
    }

    public Integer GuardarFormulario(Conexion con) {
        Integer id = null;
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String sql = "INSERT INTO parcial_revervas"
                    + "(Cod_Materia, Cod_Usuario, Cod_Aula, Cod_Seccion, Dia_Parcial, Hora_Parcial, Aula_Adicional_Parcial, Vigilancia_PArcial, Instructor, Estado_ReservaParcial)"
                    + " VALUES (" + getCod_Materia() + ", " + getCod_Usuario() + ", "
                    + getCod_Aula() + ", " + getCod_Seccion() + " , STR_TO_DATE('" + df.format(getDia_Parcial()) + "', '%d/%m/%Y'), '"
                    + getHora_Parcial() + "', "
                    + Util.booleanToInt(isAula_Adicional_Parcial()) + ", " + Util.booleanToInt(isVigilancia_PArcial()) + ", " + Util.booleanToInt(isInstructor()) + ", " + Util.booleanToInt(isEstado_ReservaParcial()) + ")";
        
        try {
            id = con.insertStatement(sql);
        } catch (SQLException ex) {
            System.out.println("ERROR:Fallo en SQL en guardar recurso: " + ex.getMessage());
            Logger.getLogger(ParcialReservas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }

    public int getCod_Parcial_Reserva() {
        return Cod_Parcial_Reserva;
    }

    public void setCod_Parcial_Reserva(int Cod_Parcial_Reserva) {
        this.Cod_Parcial_Reserva = Cod_Parcial_Reserva;
    }

    public int getCod_Materia() {
        return Cod_Materia;
    }

    public void setCod_Materia(int Cod_Materia) {
        this.Cod_Materia = Cod_Materia;
    }

    public int getCod_Usuario() {
        return Cod_Usuario;
    }

    public void setCod_Usuario(int Cod_Usuario) {
        this.Cod_Usuario = Cod_Usuario;
    }

    public int getCod_Aula() {
        return Cod_Aula;
    }

    public void setCod_Aula(int Cod_Aula) {
        this.Cod_Aula = Cod_Aula;
    }

    public int getCod_Seccion() {
        return Cod_Seccion;
    }

    public void setCod_Seccion(int Cod_Seccion) {
        this.Cod_Seccion = Cod_Seccion;
    }

    public Date getDia_Parcial() {
        return Dia_Parcial;
    }

    public void setDia_Parcial(Date Dia_Parcial) {
        this.Dia_Parcial = Dia_Parcial;
    }

    public String getHora_Parcial() {
        return Hora_Parcial;
    }

    public void setHora_Parcial(String Hora_Parcial) {
        this.Hora_Parcial = Hora_Parcial;
    }

    public Boolean isAula_Adicional_Parcial() {
        return Aula_Adicional_Parcial;
    }

    public void setAula_Adicional_Parcial(Boolean Aula_Adicional_Parcial) {
        this.Aula_Adicional_Parcial = Aula_Adicional_Parcial;
    }

    public Boolean isVigilancia_PArcial() {
        return Vigilancia_PArcial;
    }

    public void setVigilancia_PArcial(Boolean Vigilancia_PArcial) {
        this.Vigilancia_PArcial = Vigilancia_PArcial;
    }

    public Boolean isEstado_ReservaParcial() {
        return Estado_ReservaParcial;
    }

    public void setEstado_ReservaParcial(Boolean Estado_ReservaParcial) {
        this.Estado_ReservaParcial = Estado_ReservaParcial;
    }

    public Boolean isInstructor() {
        return Instructor;
    }

    public void setInstructor(Boolean Instructor) {
        this.Instructor = Instructor;
    }

    public MateriasD getMateria() {
        return materia;
    }

    public void setMateria(MateriasD materia) {
        this.materia = materia;
    }
}