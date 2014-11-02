/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pagodalabs.ecommerce.models;

import com.pagodalabs.ecommerce.db.DBConnection;
import com.pagodalabs.ecommerce.entities.OrderItems;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author CodingFr3ak
 */
public class OrderItemModel {

    public static int insert(OrderItems item) throws ClassNotFoundException, SQLException {
        DBConnection connection = new DBConnection();
        connection.open();
        String sql = "INSERT INTO gc_order_items(order_id,product_id,quantity,contents) VALUES(?,?,?,?)";

        PreparedStatement statement = connection.initStatement(sql);

        //statement.setInt(1,setting.getId());
        statement.setInt(1, item.getOrderId());
        statement.setInt(2, item.getProductId());
        statement.setInt(3, item.getQuantity());
        statement.setString(4, item.getContents());

        int result = connection.executeUpdate();
        connection.close();
        return result;

    }

    public static int Update(OrderItems item) throws ClassNotFoundException, SQLException {
        DBConnection connection = new DBConnection();
        connection.open();
        String sql = "Update gc_order_items set order_id=?,product_id=?,quantity=?,contents=? WHERE id=?";

        System.out.println(item.toString());
        PreparedStatement statement = connection.initStatement(sql);

        statement.setInt(1, item.getOrderId());
        statement.setInt(2, item.getProductId());
        statement.setInt(3, item.getQuantity());
        statement.setString(4, item.getContents());
        statement.setInt(5, item.getId());
        int result = connection.executeUpdate();
        connection.close();
        return result;

    }

    public static int Delete(Integer id) throws ClassNotFoundException, SQLException {
        DBConnection connection = new DBConnection();
        connection.open();
        String sql = "DELETE FROM gc_order_items WHERE id=?";

        PreparedStatement statement = connection.initStatement(sql);

        statement.setString(1, id.toString());

        int result = connection.executeUpdate();
        connection.close();
        return result;

    }

    public static ArrayList<OrderItems> getAll() throws ClassNotFoundException, SQLException {
        DBConnection connection = new DBConnection();
        connection.open();
        ArrayList<OrderItems> items = new ArrayList<OrderItems>();
        String sql = "SELECT * from gc_order_items";
        PreparedStatement statement = connection.initStatement(sql);
        ResultSet rs = connection.executeQuery();
        while (rs.next()) {
            OrderItems item = new OrderItems();
            item.setId(Integer.parseInt(rs.getString("id")));
            item.setOrderId(rs.getInt("order_id"));
            item.setProductId(rs.getInt("product_id"));
            item.setQuantity(rs.getInt("quantity"));
            item.setContents(rs.getString("contents"));

            items.add(item);

        }
        connection.close();
        return items;
    }

    public static OrderItems getByPk(int id) throws ClassNotFoundException, SQLException {
        DBConnection connection = new DBConnection();
        connection.open();
        OrderItems item = null;
        String sql = "SELECT * from gc_order_items where id=?";
        PreparedStatement statement = connection.initStatement(sql);
        statement.setInt(1, id);
        ResultSet rs = connection.executeQuery();
        while (rs.next()) {
            item = new OrderItems();
            item.setId(Integer.parseInt(rs.getString("id")));
            item.setOrderId(rs.getInt("order_id"));
            item.setProductId(rs.getInt("product_id"));
            item.setQuantity(rs.getInt("quantity"));
            item.setContents(rs.getString("contents"));
        }
        connection.close();
        return item;
    }

}
