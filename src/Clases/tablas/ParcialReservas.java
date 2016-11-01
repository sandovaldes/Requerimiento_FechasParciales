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
    private Date Hora_Parcial;
    private Boolean Aula_Adicional_Parcial;
    private Boolean Vigilancia_PArcial;
    private Boolean Estado_ReservaParcial;

    public ParcialReservas(int Cod_Parcial_Reserva, int Cod_Materia, int Cod_Usuario, int Cod_Aula, int Cod_Seccion, Date Dia_Parcial, Date Hora_Parcial, Boolean Aula_Adicional_Parcial, Boolean Vigilancia_PArcial, Boolean Estado_ReservaParcial) {
        this.Cod_Parcial_Reserva = Cod_Parcial_Reserva;
        this.Cod_Materia = Cod_Materia;
        this.Cod_Usuario = Cod_Usuario;
        this.Cod_Aula = Cod_Aula;
        this.Cod_Seccion = Cod_Seccion;
        this.Dia_Parcial = Dia_Parcial;
        this.Hora_Parcial = Hora_Parcial;
        this.Aula_Adicional_Parcial = Aula_Adicional_Parcial;
        this.Vigilancia_PArcial = Vigilancia_PArcial;
        this.Estado_ReservaParcial = Estado_ReservaParcial;
    }

    public ArrayList getParcialReservas(Conexion con) throws SQLException {
        ArrayList lista = new ArrayList();
        con.setRs("Select * from parcial_reservas");
        ResultSet rs = con.getRs();

        while (rs.next()) {
            ParcialReservas rp = new ParcialReservas(
                    rs.getInt("Cod_Parcial_Reserva"),
                    rs.getInt("Cod_Materia"),
                    rs.getInt("Cod_Usuario"),
                    rs.getInt("Cod_Aula"),
                    rs.getInt("Cod_Seccion"),
                    rs.getDate("Dia_Parcial"),
                    rs.getDate("Hora_Parcial"),
                    rs.getBoolean("Aula_Adicional_Parcial"),
                    rs.getBoolean("Estado_Ubicacion"),
                    rs.getBoolean("Estado_ReservaParcial")
            );

            lista.add(rp);
        }

        return lista;
    }

    public boolean GuardarFormulario(Conexion con) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        boolean valor = false;
        try {
            con.setQuery("INSERT INTO parcial_reservas"
                    + "(Cod_Materia, Cod_Usuario, Cod_Aula, Cod_Seccion, Dia_Parcial, Hora_Parcial, Aula_Adicional_Parcial, Vigilancia_PArcial, Estado_ReservaParcial)"
                    + " VALUES ('" + getCod_Materia() + "', '" + getCod_Usuario() + "', '"
                    + getCod_Aula() + getCod_Seccion() + "' , STR_TO_DATE('" + df.format(getDia_Parcial()) + "', '%d/%m/%Y') , '"
                    + "' , STR_TO_DATE('" + df.format(getHora_Parcial()) + "', '%y-%m-%d') , '"
                    + "' , " + Util.booleanToInt(isAula_Adicional_Parcial()) + "', '" + Util.booleanToInt(isVigilancia_PArcial()) + "', '" + Util.booleanToInt(isEstado_ReservaParcial()) + ")");

            valor = true;
        } catch (SQLException ex) {
            System.out.println("ERROR:Fallo en SQL en guardar reserva parcial: " + ex.getMessage());
        }
        return valor;
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

    public Date getHora_Parcial() {
        return Hora_Parcial;
    }

    public void setHora_Parcial(Date Hora_Parcial) {
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
}
