/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases.tablas;

import Clases.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Erika
 */
public class Bitacoras {

   public Bitacoras(){
   }


   
    private int Cod_Bitacora;
    private int Cod_Usuario;
    private Date Fecha_Bitacora;
    private Date Hora_Entrada_B;
    private Date Hora_Salida_B;
    private Boolean Estado_Bitacora;

    public Bitacoras(int Cod_Bitacora, int Cod_Usuario, Date Fecha_Bitacora, Date Hora_Entrada_B, Date Hora_Salida_B, Boolean Estado_Bitacora) {
        this.Cod_Bitacora = Cod_Bitacora;
        this.Cod_Usuario = Cod_Usuario;
        this.Fecha_Bitacora = Fecha_Bitacora;
        this.Hora_Entrada_B = Hora_Entrada_B;
        this.Hora_Salida_B = Hora_Salida_B;
        this.Estado_Bitacora = Estado_Bitacora;
    }





    public ArrayList getBitacoras(Conexion con) throws SQLException {
        ArrayList lista = new ArrayList();
        con.setRs("Select * from bitacora");
        ResultSet rs = con.getRs();

        while (rs.next()) {
            Bitacoras bit = new Bitacoras(
                    rs.getInt("Cod_Bitacora"),
                    rs.getInt("Cod_Usuario"),
                    rs.getDate("Fecha_Bitacora"),
                    rs.getDate("Hora_Entrada_B"),
                    rs.getDate("Hora_Salida_B"),
                    rs.getBoolean("Estado_Bitacora")
            );
            
            lista.add(bit);
        }

        return lista;
    }

    public int getCod_Bitacora() {
        return Cod_Bitacora;
    }

    public void setCod_Bitacora(int Cod_Bitacora) {
        this.Cod_Bitacora = Cod_Bitacora;
    }

    public int getCod_Usuario() {
        return Cod_Usuario;
    }

    public void setCod_Usuario(int Cod_Usuario) {
        this.Cod_Usuario = Cod_Usuario;
    }

    public Date getFecha_Bitacora() {
        return Fecha_Bitacora;
    }

    public void setFecha_Bitacora(Date Fecha_Bitacora) {
        this.Fecha_Bitacora = Fecha_Bitacora;
    }

    public Date getHora_Entrada_B() {
        return Hora_Entrada_B;
    }

    public void setHora_Entrada_B(Date Hora_Entrada_B) {
        this.Hora_Entrada_B = Hora_Entrada_B;
    }

    public Date getHora_Salida_B() {
        return Hora_Salida_B;
    }

    public void setHora_Salida_B(Date Hora_Salida_B) {
        this.Hora_Salida_B = Hora_Salida_B;
    }

    public Boolean isEstado_Bitacora() {
        return Estado_Bitacora;
    }

    public void setEstado_Bitacora(Boolean Estado_Bitacora) {
        this.Estado_Bitacora = Estado_Bitacora;
    }

//    @Override
//    public String toString() {
//        return nombreCompleto();
//    }
    
    
}