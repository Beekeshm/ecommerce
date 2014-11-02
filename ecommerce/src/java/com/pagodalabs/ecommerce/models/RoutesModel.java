/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pagodalabs.ecommerce.models;

import com.pagodalabs.ecommerce.db.DBConnection;
import com.pagodalabs.ecommerce.entities.Routes;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author CodingFr3ak
 */
public class RoutesModel {
    public static int insert(Routes route) throws ClassNotFoundException, SQLException{
        DBConnection connection=new DBConnection();
        connection.open();
        String sql="INSERT INTO gc_routes(slug,route) VALUES(?,?)";
        
        PreparedStatement statement= connection.initStatement(sql);
       
        statement.setString(1,route.getSlug());
        statement.setString(2,route.getRoute());
               
        int result=connection.executeUpdate();
        connection.close();
        return result;
        
    }
    
    public static int Update(Routes route) throws ClassNotFoundException, SQLException{
        DBConnection connection=new DBConnection();
        connection.open();
        String sql="Update gc_routes set slug=?,route=? WHERE id=?";
        
        System.out.println(route.toString());
        PreparedStatement statement= connection.initStatement(sql);
       
        statement.setString(1,route.getRoute());
        statement.setString(2,route.getSlug());
        statement.setInt(3,route.getId());
        
       
        
        
        int result=connection.executeUpdate();
        connection.close();
        return result;
        
    }
    
        public static int Delete(Integer id) throws ClassNotFoundException, SQLException{
        DBConnection connection=new DBConnection();
        connection.open();
        String sql="DELETE FROM gc_routes WHERE id=?";
        
        
        PreparedStatement statement= connection.initStatement(sql);
       
        statement.setString(1,id.toString());

        
        
        int result=connection.executeUpdate();
        connection.close();
        return result;
        
    }
    
    public static ArrayList<Routes> getAll() throws ClassNotFoundException, SQLException{
        DBConnection connection=new DBConnection();
        connection.open();
        ArrayList<Routes> routes=new ArrayList<Routes>();
        String sql="SELECT * from gc_routes";
        PreparedStatement statement= connection.initStatement(sql);
        ResultSet rs=connection.executeQuery();
       while(rs.next()){
            Routes route=new Routes();
            route.setId(Integer.parseInt(rs.getString("id")));
            route.setSlug(rs.getString("slug"));
            route.setRoute(rs.getString("route"));
            routes.add(route);
            
        }
        connection.close();                
        return routes;
    }
    
    public static Routes getByPk(int id) throws ClassNotFoundException, SQLException{
        DBConnection connection=new DBConnection();
        connection.open();
        Routes route=null;
        String sql="SELECT * from gc_routes where id=?";
        PreparedStatement statement= connection.initStatement(sql);
        statement.setInt(1, id);
        ResultSet rs=connection.executeQuery();
       while(rs.next()){
            route=new Routes();
            route.setId(Integer.parseInt(rs.getString("id")));
            route.setSlug(rs.getString("slug"));
            route.setRoute(rs.getString("route"));
            
            
        }
        connection.close();                
        return route;
    }
}
