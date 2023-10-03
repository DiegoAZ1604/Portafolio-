/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.ResultSetMetaData;
import java.sql.PreparedStatement;

/**
 *
 * @author diegod
 */
public class Conexion {
    
    private Connection conn;
    private Statement stm;
    
    //conexion
    public Conexion(String pIP, String pListener, String pUsuario, String pClave){
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            this.conn = DriverManager.getConnection("jdbc:oracle:thin:@" + pIP + ":1521:" 
                    + pListener, pUsuario, pClave);
        } catch(Exception ee){
            System.out.println("Error en conexion");
        }
    }
    
    public Connection getConnection(){
        return this.conn;
    }
    
    public ArrayList<Object[]> consultar(String query){
        ArrayList<Object[]> aResultados = new ArrayList<>();
        
        try{
            ResultSet rs = this.stm.executeQuery(query);
            int columnCount = ((ResultSetMetaData) rs.getMetaData()).getColumnCount();
            
            while(rs.next()){
                Object[] fila = new Object[columnCount];
                for (int i = 1; i < columnCount; i++) {
                    fila[i-1] = rs.getObject(i);
                }
                aResultados.add(fila);
            }
        } catch (Exception ee){
            System.out.println("Error consultando");
        }
        return aResultados;
    }
    
    public void insertar(String query, Object[] params){
        try{
            PreparedStatement pStmt = this.conn.prepareStatement(query);
            if (params != null) {
                for(int i = 0; i < params.length; i++)
                    pStmt.setObject(i + 1, params[i]);
                pStmt.executeUpdate();
            }
        } catch(Exception ee){System.out.println("Error en insercion");}
    }
    
}
