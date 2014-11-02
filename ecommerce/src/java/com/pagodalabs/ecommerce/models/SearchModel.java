/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pagodalabs.ecommerce.models;

import com.pagodalabs.ecommerce.db.DBConnection;
import com.pagodalabs.ecommerce.entities.Search;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author CodingFr3ak
 */
public class SearchModel {
    public static int insert(Search search) throws ClassNotFoundException, SQLException{
        DBConnection connection=new DBConnection();
        connection.open();
        String sql="INSERT INTO gc_search(code,term) VALUES(?,?)";
        
        PreparedStatement statement= connection.initStatement(sql);
       
        statement.setString(1,search.getCode());
        statement.setString(2,search.getTerm());
       
        
        int result=connection.executeUpdate();
        connection.close();
        return result;
        
    }
    
    /*public static int Update(Search search) throws ClassNotFoundException, SQLException{
        DBConnection connection=new DBConnection();
        connection.open();
        String sql="Update users set code=?,term=? WHERE id=?";
        
        System.out.println(user.toString());
        PreparedStatement statement= connection.initStatement(sql);
       
        statement.setString(1,user.getUserName());
        statement.setString(2,user.getPassword());
        statement.setString(3,user.getEmail());
        
        statement.setBoolean(4,user.getStatus());
        statement.setInt(5,user.getUserId());
        
        
        int result=connection.executeUpdate();
        connection.close();
        return result;
        
    }*/
    
        /*public static int Delete(Integer id) throws ClassNotFoundException, SQLException{
        DBConnection connection=new DBConnection();
        connection.open();
        String sql="DELETE FROM gc_search WHERE user_id=?";
        
        
        PreparedStatement statement= connection.initStatement(sql);
       
        statement.setString(1,id.toString());

        
        
        int result=connection.executeUpdate();
        connection.close();
        return result;
        
    }*/
    
    public static ArrayList<Search> getAll() throws ClassNotFoundException, SQLException{
        DBConnection connection=new DBConnection();
        connection.open();
        ArrayList<Search> searchs=new ArrayList<Search>();
        String sql="SELECT * from gc_search";
        PreparedStatement statement= connection.initStatement(sql);
        ResultSet rs=connection.executeQuery();
       while(rs.next()){
            Search search=new Search();
            
            search.setCode(rs.getString("code"));
            search.setTerm(rs.getString("term"));
            
            searchs.add(search);
            
        }
        connection.close();                
        return searchs;
    }
    
    public static Search getByPk(int code) throws ClassNotFoundException, SQLException{
        DBConnection connection=new DBConnection();
        connection.open();
        Search search=null;
        String sql="SELECT * from gc_search where code=?";
        PreparedStatement statement= connection.initStatement(sql);
        statement.setInt(1, code);
        ResultSet rs=connection.executeQuery();
       while(rs.next()){
            search=new Search();
            search.setCode(rs.getString("code"));
            search.setTerm(rs.getString("term"));
            
            
        }
        connection.close();                
        return search;
    }
    
}
