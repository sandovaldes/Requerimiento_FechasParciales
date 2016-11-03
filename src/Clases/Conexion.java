/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.*;
import javax.swing.*;

/**
 *
 * @author Erika
 */
public class Conexion {

    private Connection conexion;
    private ResultSet rs;
    private Statement sentencia;
    private PreparedStatement sentenciaPreparada;

    //Contructor
    public Conexion() throws SQLException {
        try {
            //obtenemos el driver de para mysql
            Class.forName("com.mysql.jdbc.Driver");
            // Se obtiene una conexión con la base de datos.
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/auto_formulario", "programacion4", "programacion4");
            // Permite ejecutar sentencias SQL sin parámetros
            sentencia = conexion.createStatement();
        } catch (ClassNotFoundException e1) {
            //Error si no puedo leer el driver de MySQL
            System.out.println("ERROR:No encuentro el driver de la BD: " + e1.getMessage());
        }
    }

    public void setRs(String consulta) {
        try {
            this.rs = sentencia.executeQuery(consulta);
        } catch (SQLException e2) {
            System.out.println("ERROR:Fallo en SQL: " + e2.getMessage());
        }
    }

    public void setRs(String consulta, Object[] parametros) {
        try
        {
            this.sentenciaPreparada = conexion.prepareStatement(consulta);
            for(int i = 0; i < parametros.length; i++)
            {
                this.sentenciaPreparada.setObject(i+1, (String)parametros[i]);
            }
            this.rs = sentenciaPreparada.executeQuery();
        } catch (SQLException e2) {
            System.out.println("ERROR:Fallo en SQL: " + e2.getMessage());
        }
    }

    public Integer insertStatement(String sql) throws SQLException {
        //statement = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ResultSet generado = null;
        Integer resultado = null;
        int affectedRows = this.sentencia.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);

        if (affectedRows != 0) {
            try {
                generado = this.sentencia.getGeneratedKeys();
                if (generado.next()) {
                    resultado = generado.getInt(1);
                }

            } catch (Exception e) {
                System.out.println("ERROR:Fallo en: " + e.getMessage());
            } finally {
                if (generado != null) {
                    generado.close();
                }
            }
        }

        return resultado;
    }

    //Metodo que recibe un sql como parametro que sea un update,insert.delete
    public void setQuery(String query) throws SQLException {
        this.sentencia.execute(query, Statement.RETURN_GENERATED_KEYS);
    }

    //Metodo que cierra la conexion
    public void cerrarConexion() throws SQLException {
        conexion.close();
    }

    public ResultSet getRs() {
        return rs;
    }

    public Connection getConexion() {
        return conexion;
    }
}
