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
public class RequerimientoSolicitudes {

   public RequerimientoSolicitudes(){
   }


    private int Cod_Requerimiento_Solicitud;
    private int Cod_Usuario;
    private int Cod_Aula;
    private int Cod_Materia;
    private int Cod_Seccion;
    private int Cod_Recurso;
    private Date Fecha_Req_Solicitud;
    private String Detalle_Req_Solicitud;
    private int Cantidad_Req_Solicitado;
    private Boolean Estado_Req_Solicitud;

    public RequerimientoSolicitudes(int Cod_Requerimiento_Solicitud, int Cod_Usuario, int Cod_Aula, int Cod_Materia, int Cod_Seccion, int Cod_Recurso, Date Fecha_Req_Solicitud, String Detalle_Req_Solicitud, int Cantidad_Req_Solicitado, Boolean Estado_Req_Solicitud) {
        this.Cod_Requerimiento_Solicitud = Cod_Requerimiento_Solicitud;
        this.Cod_Usuario = Cod_Usuario;
        this.Cod_Aula = Cod_Aula;
        this.Cod_Materia = Cod_Materia;
        this.Cod_Seccion = Cod_Seccion;
        this.Cod_Recurso = Cod_Recurso;
        this.Fecha_Req_Solicitud = Fecha_Req_Solicitud;
        this.Detalle_Req_Solicitud = Detalle_Req_Solicitud;
        this.Cantidad_Req_Solicitado = Cantidad_Req_Solicitado;
        this.Estado_Req_Solicitud = Estado_Req_Solicitud;
    }





    public ArrayList getRequerimientoSolicitudes(Conexion con) throws SQLException {
        ArrayList lista = new ArrayList();
        con.setRs("Select * from requerimiento_solicitudes");
        ResultSet rs = con.getRs();

        while (rs.next()) {
            RequerimientoSolicitudes reqSol = new RequerimientoSolicitudes(
                    rs.getInt("Cod_Requerimiento_Solicitud"),
                    rs.getInt("Cod_Usuario"),
                    rs.getInt("Cod_Aula"),
                    rs.getInt("Cod_Materia"),
                    rs.getInt("Cod_Seccion"),
                    rs.getInt("Cod_Recurso"),
                    rs.getDate("Fecha_Req_Solicitud"),
                    rs.getString("Detalle_Req_Solicitud"),
                    rs.getInt("Cantidad_Req_Solicitado"),
                    rs.getBoolean("Estado_Req_Solicitud")
            );
            
            lista.add(reqSol);
        }

        return lista;
    }
    
    
       public boolean GuardarFormulario(Conexion con) {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        boolean valor = false;
        try {
            con.setQuery("INSERT INTO form_disponibilidad_de_docentes "
                    + "(Cod_Usuario, Cod_Aula, Cod_Materia, Cod_Seccion, Cod_Recurso, Fecha_Req_Solicitud, Detalle_Req_Solicitud, Cantidad_Req_Solicitado, Estado_Req_Solicitud)"
                    + " VALUES ('" + getCod_Usuario() + "', '" + getCod_Aula() + "', '"
                    + getCod_Materia() + getCod_Seccion() +getCod_Recurso() + "' , STR_TO_DATE('" + df.format(getFecha_Req_Solicitud()) + "', '%d/%m/%Y') , '"
                    + getDetalle_Req_Solicitud() + getCantidad_Req_Solicitado() + "' , " + Util.booleanToInt(isEstado_Req_Solicitud()) + ")");

            valor = true;
        } catch (SQLException ex) {
            System.out.println("ERROR:Fallo en SQL: " + ex.getMessage());
        }
        return valor;
    }
    
    

    //    @Override
//    public String toString() {
//        return nombreCompleto();
//    }

    public int getCod_Requerimiento_Solicitud() {
        return Cod_Requerimiento_Solicitud;
    }

    public void setCod_Requerimiento_Solicitud(int Cod_Requerimiento_Solicitud) {
        this.Cod_Requerimiento_Solicitud = Cod_Requerimiento_Solicitud;
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

    public int getCod_Materia() {
        return Cod_Materia;
    }

    public void setCod_Materia(int Cod_Materia) {
        this.Cod_Materia = Cod_Materia;
    }

    public int getCod_Seccion() {
        return Cod_Seccion;
    }

    public void setCod_Seccion(int Cod_Seccion) {
        this.Cod_Seccion = Cod_Seccion;
    }

    public int getCod_Recurso() {
        return Cod_Recurso;
    }

    public void setCod_Recurso(int Cod_Recurso) {
        this.Cod_Recurso = Cod_Recurso;
    }

    public Date getFecha_Req_Solicitud() {
        return Fecha_Req_Solicitud;
    }

    public void setFecha_Req_Solicitud(Date Fecha_Req_Solicitud) {
        this.Fecha_Req_Solicitud = Fecha_Req_Solicitud;
    }

    public String getDetalle_Req_Solicitud() {
        return Detalle_Req_Solicitud;
    }

    public void setDetalle_Req_Solicitud(String Detalle_Req_Solicitud) {
        this.Detalle_Req_Solicitud = Detalle_Req_Solicitud;
    }

    public int getCantidad_Req_Solicitado() {
        return Cantidad_Req_Solicitado;
    }

    public void setCantidad_Req_Solicitado(int Cantidad_Req_Solicitado) {
        this.Cantidad_Req_Solicitado = Cantidad_Req_Solicitado;
    }

    public Boolean isEstado_Req_Solicitud() {
        return Estado_Req_Solicitud;
    }

    public void setEstado_Req_Solicitud(Boolean Estado_Req_Solicitud) {
        this.Estado_Req_Solicitud = Estado_Req_Solicitud;
    }

    
}