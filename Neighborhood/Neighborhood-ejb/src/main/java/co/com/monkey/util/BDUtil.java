/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.monkey.util;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author daperador
 */
public class BDUtil implements Serializable
{
    
    public static void closeResource(Connection con){
        try {
            if(con!=null){
                con.close();
            }
        } catch (SQLException ex) {
            //no requiere ninguna accion
        }
    }
    
    public static void closeResource(ResultSet rs){
        try {
            if(rs!=null){
                rs.close();
            }
        } catch (SQLException ex) {
            //no requiere ninguna accion
        }
    }
    
    public static void closeResource(PreparedStatement ps){
        try {
            if(ps!=null){
                ps.close();
            }
        } catch (SQLException ex) {
            //no requiere ninguna accion
        }
    }
    
}
