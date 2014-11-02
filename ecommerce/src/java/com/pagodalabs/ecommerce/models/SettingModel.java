/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pagodalabs.ecommerce.models;

import com.pagodalabs.ecommerce.db.DBConnection;
import com.pagodalabs.ecommerce.entities.Settings;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author CodingFr3ak
 */
public class SettingModel {
     public static int insert(Settings setting) throws ClassNotFoundException, SQLException{
        DBConnection connection=new DBConnection();
        connection.open();
        String sql="INSERT INTO gc_settings(key,setting_key,setting) VALUES(?,?,?)";
        
        PreparedStatement statement= connection.initStatement(sql);
       
        //statement.setInt(1,setting.getId());
        statement.setString(1,setting.getCode());
        statement.setString(2,setting.getSettingKey());
        statement.setString(3,setting.getSetting());
       
        
        
        int result=connection.executeUpdate();
        connection.close();
        return result;
        
    }
    
    public static int Update(Settings setting) throws ClassNotFoundException, SQLException{
        DBConnection connection=new DBConnection();
        connection.open();
        String sql="Update gc_settings set key=?,setting_key=?,setting=? WHERE id=?";
        
        System.out.println(setting.toString());
        PreparedStatement statement= connection.initStatement(sql);
       
        statement.setString(1,setting.getCode());
        statement.setString(2,setting.getSettingKey());
        statement.setString(3,setting.getSetting());       
        
        statement.setInt(4,setting.getId());
        
        
        int result=connection.executeUpdate();
        connection.close();
        return result;
        
    }
    
        public static int Delete(Integer id) throws ClassNotFoundException, SQLException{
        DBConnection connection=new DBConnection();
        connection.open();
        String sql="DELETE FROM gc_settings WHERE id=?";
        
        
        PreparedStatement statement= connection.initStatement(sql);
       
        statement.setString(1,id.toString());

        
        
        int result=connection.executeUpdate();
        connection.close();
        return result;
        
    }
    
    public static ArrayList<Settings> getAll() throws ClassNotFoundException, SQLException{
        DBConnection connection=new DBConnection();
        connection.open();
        ArrayList<Settings> settings=new ArrayList<Settings>();
        String sql="SELECT * from gc_settings";
        PreparedStatement statement= connection.initStatement(sql);
        ResultSet rs=connection.executeQuery();
       while(rs.next()){
            Settings setting=new Settings();
            setting.setId(Integer.parseInt(rs.getString("id")));
            setting.setCode(rs.getString("key"));
            setting.setSettingKey(rs.getString("setting_key"));
            setting.setSetting(rs.getString("setting"));
            settings.add(setting);
            
        }
        connection.close();                
        return settings;
    }
    
    public static Settings getByPk(int id) throws ClassNotFoundException, SQLException{
        DBConnection connection=new DBConnection();
        connection.open();
        Settings setting=null;
        String sql="SELECT * from gc_settings where id=?";
        PreparedStatement statement= connection.initStatement(sql);
        statement.setInt(1, id);
        ResultSet rs=connection.executeQuery();
       while(rs.next()){
            setting=new Settings();
            setting.setId(Integer.parseInt(rs.getString("id")));
            setting.setCode(rs.getString("key"));
            setting.setSettingKey(rs.getString("setting_key"));
            setting.setSetting(rs.getString("setting"));
            
            
        }
        connection.close();                
        return setting;
    }
    
}
