/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pagodalabs.ecommerce.models;

import com.pagodalabs.ecommerce.db.DBConnection;
import com.pagodalabs.ecommerce.entities.Products;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author CodingFr3ak
 */
public class ProductModel {
     public static int insert(Products product) throws ClassNotFoundException, SQLException{
        DBConnection connection=new DBConnection();
        connection.open();
        String sql="INSERT INTO gc_products(sku,name,slug,route_id,description,excerpt,price,saleprice,free_shipping,shippable,taxable,fixed_quantity,weight,track_stock,quantity,related_products,images,seo_title,meta,enabled) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        PreparedStatement statement= connection.initStatement(sql);
       
        //statement.setInt(1,setting.getId());
         statement.setString(1, product.getSku());
         statement.setString(2, product.getName());
         statement.setString(3, product.getSlug());
         statement.setInt(4, product.getRouteId());
         statement.setString(5, product.getDescription());
         statement.setString(6, product.getExcerpt());
         statement.setDouble(7, product.getPrice());
         statement.setDouble(8, product.getSaleprice());
         statement.setBoolean(9, product.getFreeShipping());
         statement.setBoolean(10, product.getShippable());
         statement.setBoolean(11, product.getTaxable());
         statement.setBoolean(12, product.getFixedQuantity());
         statement.setString(13, product.getWeight());
         statement.setBoolean(14, product.getTrackStock());
         statement.setInt(15, product.getQuantity());
         statement.setString(16, product.getRealtedProducts());
         statement.setString(17, product.getImages());
         statement.setString(18, product.getSeoTitle());
         statement.setString(19, product.getMeta());
         statement.setBoolean(20, product.getEnabled());
        
        
       
        
        
        int result=connection.executeUpdate();
        connection.close();
        return result;
        
    }
    
    public static int Update(Products product) throws ClassNotFoundException, SQLException{
        DBConnection connection=new DBConnection();
        connection.open();
        String sql="Update gc_products set sku=?,name=?,slug=?,route_id=?,description=?,excerpt=?,price=?,saleprice=?,free_shipping=?,shippable,taxable=?,fixed_quantity=?,weight=?,track_stock=?,quantity=?,related_products=?,images=?,seo_title=?,meta=?,enabled=? WHERE id=?";
        
        System.out.println(product.toString());
        PreparedStatement statement= connection.initStatement(sql);
       
        statement.setString(1, product.getSku());
         statement.setString(2, product.getName());
         statement.setString(3, product.getSlug());
         statement.setInt(4, product.getRouteId());
         statement.setString(5, product.getDescription());
         statement.setString(6, product.getExcerpt());
         statement.setDouble(7, product.getPrice());
         statement.setDouble(8, product.getSaleprice());
         statement.setBoolean(9, product.getFreeShipping());
         statement.setBoolean(10, product.getShippable());
         statement.setBoolean(11, product.getTaxable());
         statement.setBoolean(12, product.getFixedQuantity());
         statement.setString(13, product.getWeight());
         statement.setBoolean(14, product.getTrackStock());
         statement.setInt(15, product.getQuantity());
         statement.setString(16, product.getRealtedProducts());
         statement.setString(17, product.getImages());
         statement.setString(18, product.getSeoTitle());
         statement.setString(19, product.getMeta());
         statement.setBoolean(20, product.getEnabled());
         statement.setInt(21,product.getProductId());
        int result=connection.executeUpdate();
        connection.close();
        return result;
        
    }
    
        public static int Delete(Integer id) throws ClassNotFoundException, SQLException{
        DBConnection connection=new DBConnection();
        connection.open();
        String sql="DELETE FROM gc_products WHERE id=?";
        
        
        PreparedStatement statement= connection.initStatement(sql);
       
        statement.setString(1,id.toString());

        
        
        int result=connection.executeUpdate();
        connection.close();
        return result;
        
    }
    
    public static ArrayList<Products> getAll() throws ClassNotFoundException, SQLException{
        DBConnection connection=new DBConnection();
        connection.open();
        ArrayList<Products> products=new ArrayList<Products>();
        String sql="SELECT * from gc_products";
        PreparedStatement statement= connection.initStatement(sql);
        ResultSet rs=connection.executeQuery();
       while(rs.next()){
            Products product=new Products();
            product.setProductId(Integer.parseInt(rs.getString("id")));
            product.setSku(rs.getString("sku"));
            product.setName(rs.getString("name"));
            product.setSlug(rs.getString("slug"));
            product.setRouteId(rs.getInt("route_id"));
            product.setDescription(rs.getString("description"));
            product.setExcerpt(rs.getString("excerpt"));
            product.setPrice(rs.getInt("price"));
            product.setSaleprice(rs.getInt("saleprice"));
            product.setFreeShipping(rs.getBoolean("free_shipping"));
            product.setShippable(rs.getBoolean("shippable"));
            product.setTaxable(rs.getBoolean("taxable"));
            product.setFixedQuantity(rs.getBoolean("fixed_quantity"));
            product.setWeight(rs.getString("weight"));
            product.setTrackStock(rs.getBoolean("track_stock"));
            product.setQuantity(rs.getInt("quantity"));
            product.setRealtedProducts(rs.getString("related_products"));
            product.setImages(rs.getString("images"));
            product.setSeoTitle(rs.getString("seo_title"));
            product.setMeta(rs.getString("meta"));
            product.setEnabled(rs.getBoolean("enabled"));
            
            
            
            
            products.add(product);
            
        }
        connection.close();                
        return products;
    }
    
    public static Products getByPk(int id) throws ClassNotFoundException, SQLException{
        DBConnection connection=new DBConnection();
        connection.open();
        Products product=null;
        String sql="SELECT * from gc_products where id=?";
        PreparedStatement statement= connection.initStatement(sql);
        statement.setInt(1, id);
        ResultSet rs=connection.executeQuery();
       while(rs.next()){
            product=new Products();
            product.setProductId(Integer.parseInt(rs.getString("id")));
            product.setSku(rs.getString("sku"));
            product.setName(rs.getString("name"));
            product.setSlug(rs.getString("slug"));
            product.setRouteId(rs.getInt("route_id"));
            product.setDescription(rs.getString("description"));
            product.setExcerpt(rs.getString("excerpt"));
            product.setPrice(rs.getInt("price"));
            product.setSaleprice(rs.getInt("saleprice"));
            product.setFreeShipping(rs.getBoolean("free_shipping"));
            product.setShippable(rs.getBoolean("shippable"));
            product.setTaxable(rs.getBoolean("taxable"));
            product.setFixedQuantity(rs.getBoolean("fixed_quantity"));
            product.setWeight(rs.getString("weight"));
            product.setTrackStock(rs.getBoolean("track_stock"));
            product.setQuantity(rs.getInt("quantity"));
            product.setRealtedProducts(rs.getString("related_products"));
            product.setImages(rs.getString("images"));
            product.setSeoTitle(rs.getString("seo_title"));
            product.setMeta(rs.getString("meta"));
            product.setEnabled(rs.getBoolean("enabled"));
            
            
        }
        connection.close();                
        return product;
    }
    
}
