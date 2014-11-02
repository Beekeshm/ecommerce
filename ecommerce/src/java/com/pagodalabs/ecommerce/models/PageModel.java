/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pagodalabs.ecommerce.models;

import com.pagodalabs.ecommerce.db.DBConnection;
import com.pagodalabs.ecommerce.entities.Pages;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author CodingFr3ak
 */
public class PageModel {

    public static int insert(Pages page) throws ClassNotFoundException, SQLException {
        DBConnection connection = new DBConnection();
        connection.open();
        String sql = "INSERT INTO gc_pages(parent_id,title,menu_title,slug,route_id,content,sequence,seo_title,meta,url,new_window) VALUES(?,?,?,?,?,?,?,?,?,?,?)";

        PreparedStatement statement = connection.initStatement(sql);

        //statement.setInt(1,setting.getId());
        statement.setInt(1, page.getParentId());
        statement.setString(2, page.getTitle());
        statement.setString(3, page.getMenuTitle());
        statement.setString(4, page.getSlug());
        statement.setInt(5, page.getRouteId());
        statement.setString(6, page.getContent());
        statement.setDouble(7, page.getSequence());
        statement.setString(8, page.getSeoTitle());
        statement.setString(9, page.getMeta());
        statement.setString(10, page.getUrl());
        statement.setBoolean(11, page.getNewWindow());

        int result = connection.executeUpdate();
        connection.close();
        return result;

    }

    public static int Update(Pages page) throws ClassNotFoundException, SQLException {
        DBConnection connection = new DBConnection();
        connection.open();
        String sql = "Update gc_pages set parent_id=?,title=?,menu_title=?,slug=?,route_id=?,content=?,sequence=?,seo_title=?,meta=?,url=?,new_window=? WHERE id=?";

        System.out.println(page.toString());
        PreparedStatement statement = connection.initStatement(sql);

        statement.setInt(1, page.getParentId());
        statement.setString(2, page.getTitle());
        statement.setString(3, page.getMenuTitle());
        statement.setString(4, page.getSlug());
        statement.setInt(5, page.getRouteId());
        statement.setString(6, page.getContent());
        statement.setDouble(7, page.getSequence());
        statement.setString(8, page.getSeoTitle());
        statement.setString(9, page.getMeta());
        statement.setString(10, page.getUrl());
        statement.setBoolean(11, page.getNewWindow());
        statement.setInt(12, page.getId());
        int result = connection.executeUpdate();
        connection.close();
        return result;

    }

    public static int Delete(Integer id) throws ClassNotFoundException, SQLException {
        DBConnection connection = new DBConnection();
        connection.open();
        String sql = "DELETE FROM gc_pages WHERE id=?";

        PreparedStatement statement = connection.initStatement(sql);

        statement.setString(1, id.toString());

        int result = connection.executeUpdate();
        connection.close();
        return result;

    }

    public static ArrayList<Pages> getAll() throws ClassNotFoundException, SQLException {
        DBConnection connection = new DBConnection();
        connection.open();
        ArrayList<Pages> pages = new ArrayList<Pages>();
        String sql = "SELECT * from gc_pages";
        PreparedStatement statement = connection.initStatement(sql);
        ResultSet rs = connection.executeQuery();
        while (rs.next()) {
            Pages page = new Pages();
            page.setId(Integer.parseInt(rs.getString("id")));
            page.setParentId(rs.getInt("parent_id"));
            page.setTitle(rs.getString("title"));
            page.setMenuTitle(rs.getString("menu_title"));
            page.setSlug(rs.getString("slug"));
            page.setRouteId(rs.getInt("route_id"));
            page.setContent(rs.getString("content"));
            page.setSequence(rs.getInt("sequence"));
            page.setSeoTitle(rs.getString("seo_title"));
            page.setMeta(rs.getString("meta"));
            page.setUrl(rs.getString("url"));
            page.setNewWindow(rs.getBoolean("new_window"));

            pages.add(page);

        }
        connection.close();
        return pages;
    }

    public static Pages getByPk(int id) throws ClassNotFoundException, SQLException {
        DBConnection connection = new DBConnection();
        connection.open();
        Pages page = null;
        String sql = "SELECT * from gc_pages where id=?";
        PreparedStatement statement = connection.initStatement(sql);
        statement.setInt(1, id);
        ResultSet rs = connection.executeQuery();
        while (rs.next()) {
            page = new Pages();
            page.setId(Integer.parseInt(rs.getString("id")));
            page.setParentId(rs.getInt("parent_id"));
            page.setTitle(rs.getString("title"));
            page.setMenuTitle(rs.getString("menu_title"));
            page.setSlug(rs.getString("slug"));
            page.setRouteId(rs.getInt("route_id"));
            page.setContent(rs.getString("content"));
            page.setSequence(rs.getInt("sequence"));
            page.setSeoTitle(rs.getString("seo_title"));
            page.setMeta(rs.getString("meta"));
            page.setUrl(rs.getString("url"));
            page.setNewWindow(rs.getBoolean("new_window"));

        }
        connection.close();
        return page;
    }

}
