/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pagodalabs.ecommerce.models;

import com.pagodalabs.ecommerce.db.DBConnection;
import com.pagodalabs.ecommerce.entities.Order;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author CodingFr3ak
 */
public class OrderModel {
     public static int insert(Order order) throws ClassNotFoundException, SQLException {
        DBConnection connection = new DBConnection();
        connection.open();
        String sql = "INSERT INTO gc_orders(order_number,customer_id,status,ordered_on,shipped_on,tax,total,subtotal,gift_card_discount,coupon_discount,shipping,shipping_method,notes,payment_info,referral,company,firstname,lastname,phone,email,ship_company,ship_firstname,ship_lastname,ship_email,ship_phone,ship_address1,ship_address2,ship_city,ship_zip,ship_zone_id,ship_country,ship_country_code,ship_country_id,bill_company,bill_firstname,bill_lastname,bill_email,bill_phone,bill_address1,bill_address2,bill_city,bill_zip,bill_zone,bill_zone_id,bill_country,bill_country_code,bill_country_id) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        PreparedStatement statement = connection.initStatement(sql);

        //statement.setInt(1,setting.getId());
        statement.setString(1, order.getOrderNumber());
        statement.setInt(2, order.getCustomerId());
        statement.setString(3, order.getStatus());
        statement.setString(4, order.getOrderedOn());
        statement.setString(5, order.getShippedOn());
        statement.setDouble(6,order.getTax());
        statement.setDouble(7, order.getTotal());
        statement.setDouble(8, order.getSubtotal());
        statement.setDouble(9, order.getGiftCardDiscount());
        statement.setDouble(10, order.getCouponDiscount());
        statement.setDouble(11, order.getShipping());
        statement.setString(12, order.getShippingNotes());
        statement.setString(13, order.getShippingMethod());
        statement.setString(14, order.getNotes());
        statement.setString(15, order.getPaymentInfo());
        statement.setString(16, order.getReferral());
        statement.setString(17, order.getCompany());
        statement.setString(18, order.getFirstname());
        statement.setString(19, order.getLastname());
        statement.setString(20, order.getPhone());
        statement.setString(21, order.getEmail());
        statement.setString(22, order.getShipCompany());
        statement.setString(23, order.getShipFirstname());
        statement.setString(24, order.getShipLastname());
        statement.setString(25, order.getShipEmail());
        statement.setString(26, order.getShipPhone());
        statement.setString(27, order.getShipAddress1());
        statement.setString(28, order.getShipAddress2());
        statement.setString(29, order.getShipCity());
        statement.setString(30, order.getShipZip());
        statement.setString(31, order.getShipZone());
        statement.setInt(32, order.getShipZoneId());
        statement.setString(33, order.getShipCountry());
        statement.setString(34, order.getShipCountryCode());
        statement.setInt(35, order.getShipCountryId());
        statement.setString(36, order.getBillCompany());
        statement.setString(37, order.getBillFirstname());
        statement.setString(38, order.getBillLastname());
        statement.setString(39, order.getBillEmail());
        statement.setString(40, order.getBillPhone());
        statement.setString(41, order.getBillAddress1());
        statement.setString(42, order.getBillAddress2());
        statement.setString(43, order.getBillCity());
        statement.setString(44, order.getBillZip());
        statement.setString(45, order.getBillZone());
        statement.setInt(46, order.getBillZoneId());
        statement.setString(47, order.getBillCountry());
        statement.setString(48, order.getBillCountryCode());
        statement.setInt(49, order.getBillCountryId());
        int result = connection.executeUpdate();
        connection.close();
        return result;

    }

    public static int Update(Order order) throws ClassNotFoundException, SQLException {
        DBConnection connection = new DBConnection();
        connection.open();
        String sql = "Update gc_orders set order_number=?,customer_id=?,status=?,ordered_on=?,shipped_on=?,tax=?,total=?,subtotal=?,gift_card_discount=?,coupon_discount=?,shipping=?,shipping_method=?,notes=?,payment_info=?,referral=?,company=?,firstname=?,lastname=?,phone=?,email=?,ship_company=?,ship_firstname=?,ship_lastname=?,ship_email=?,ship_phone=?,ship_address1=?,ship_address2=?,ship_city=?,ship_zip=?,ship_zone_id=?,ship_country=?,ship_country_code=?,ship_country_id=?,bill_company=?,bill_firstname=?,bill_lastname=?,bill_email=?,bill_phone=?,bill_address1=?,bill_address2=?,bill_city=?,bill_zip=?,bill_zone=?,bill_zone_id=?,bill_country=?,bill_country_code=?,bill_country_id=?) WHERE id=?";

        System.out.println(order.toString());
        PreparedStatement statement = connection.initStatement(sql);
        statement.setString(1, order.getOrderNumber());
        statement.setInt(2, order.getCustomerId());
        statement.setString(3, order.getStatus());
        statement.setString(4, order.getOrderedOn());
        statement.setString(5, order.getShippedOn());
        statement.setDouble(6,order.getTax());
        statement.setDouble(7, order.getTotal());
        statement.setDouble(8, order.getSubtotal());
        statement.setDouble(9, order.getGiftCardDiscount());
        statement.setDouble(10, order.getCouponDiscount());
        statement.setDouble(11, order.getShipping());
        statement.setString(12, order.getShippingNotes());
        statement.setString(13, order.getShippingMethod());
        statement.setString(14, order.getNotes());
        statement.setString(15, order.getPaymentInfo());
        statement.setString(16, order.getReferral());
        statement.setString(17, order.getCompany());
        statement.setString(18, order.getFirstname());
        statement.setString(19, order.getLastname());
        statement.setString(20, order.getPhone());
        statement.setString(21, order.getEmail());
        statement.setString(22, order.getShipCompany());
        statement.setString(23, order.getShipFirstname());
        statement.setString(24, order.getShipLastname());
        statement.setString(25, order.getShipEmail());
        statement.setString(26, order.getShipPhone());
        statement.setString(27, order.getShipAddress1());
        statement.setString(28, order.getShipAddress2());
        statement.setString(29, order.getShipCity());
        statement.setString(30, order.getShipZip());
        statement.setString(31, order.getShipZone());
        statement.setInt(32, order.getShipZoneId());
        statement.setString(33, order.getShipCountry());
        statement.setString(34, order.getShipCountryCode());
        statement.setInt(35, order.getShipCountryId());
        statement.setString(36, order.getBillCompany());
        statement.setString(37, order.getBillFirstname());
        statement.setString(38, order.getBillLastname());
        statement.setString(39, order.getBillEmail());
        statement.setString(40, order.getBillPhone());
        statement.setString(41, order.getBillAddress1());
        statement.setString(42, order.getBillAddress2());
        statement.setString(43, order.getBillCity());
        statement.setString(44, order.getBillZip());
        statement.setString(45, order.getBillZone());
        statement.setInt(46, order.getBillZoneId());
        statement.setString(47, order.getBillCountry());
        statement.setString(48, order.getBillCountryCode());
        statement.setInt(49, order.getBillCountryId());
        statement.setInt(50, order.getId());

                int result = connection.executeUpdate();

        connection.close();
        return result;

    }

    public static int Delete(Integer id) throws ClassNotFoundException, SQLException {
        DBConnection connection = new DBConnection();
        connection.open();
        String sql = "DELETE FROM gc_orders WHERE id=?";

        PreparedStatement statement = connection.initStatement(sql);

        statement.setString(1, id.toString());

        int result = connection.executeUpdate();
        connection.close();
        return result;

    }

    public static ArrayList<Order> getAll() throws ClassNotFoundException, SQLException {
        DBConnection connection = new DBConnection();
        connection.open();
        ArrayList<Order> orders = new ArrayList<Order>();
        String sql = "SELECT * from gc_orders";
        PreparedStatement statement = connection.initStatement(sql);
        ResultSet rs = connection.executeQuery();
        while (rs.next()) {
            Order order = new Order();
            order.setId(Integer.parseInt(rs.getString("id")));
            order.setOrderNumber(rs.getString("order_number"));
            order.setCustomerId(rs.getInt("customer_id"));
            order.setStatus(rs.getString("status"));
            order.setOrderedOn(rs.getString("ordered_on"));
            order.setShippedOn(rs.getString("shipped_on"));            
            order.setTax(rs.getInt("tax"));
            order.setTotal(rs.getInt("total"));
            order.setSubtotal(rs.getInt("subtotal"));
            order.setGiftCardDiscount(rs.getDouble("gift_card_discount"));
            order.setCouponDiscount(rs.getDouble("coupon_discount"));
            order.setShipping(rs.getInt("shipping"));
            order.setShippingNotes(rs.getString("shipping_notes"));
            order.setShippingMethod(rs.getString("shipping_method"));
            order.setNotes(rs.getString("notes"));
            order.setPaymentInfo(rs.getString("payment_info"));
            order.setReferral(rs.getString("referral"));
            order.setCompany(rs.getString("company"));
            order.setFirstname(rs.getString("firstname"));
            order.setLastname(rs.getString("lastname"));
            order.setPhone(rs.getString("phone"));
            order.setEmail(rs.getString("email"));
            order.setShipCompany(rs.getString("ship_company"));
            order.setShipFirstname(rs.getString("ship_firstname"));
            order.setShipLastname(rs.getString("ship_lastname"));
            order.setShipEmail(rs.getString("ship_email"));
            order.setShipPhone(rs.getString("ship_phone"));
            order.setShipAddress1(rs.getString("ship_address1"));
            order.setShipAddress2(rs.getString("ship_address2"));
            order.setShipCity(rs.getString("ship_city"));
            order.setShipZip(rs.getString("ship_zip"));
            order.setShipZone(rs.getString("ship_zone"));
            order.setShipZoneId(rs.getInt("ship_zone_id"));
            order.setShipCountry(rs.getString("ship_country"));
            order.setShipCountryCode(rs.getString("ship_country_code"));
            order.setShipCountryId(rs.getInt("ship_country_id"));
            order.setBillCompany(rs.getString("bill_company"));
            order.setBillFirstname(rs.getString("bill_firstname"));
            order.setBillLastname(rs.getString("bill_lastname"));
            order.setBillEmail(rs.getString("bill_email"));
            order.setBillPhone(rs.getString("bill_phone"));
            order.setBillAddress1(rs.getString("bill_address1"));
            order.setBillAddress2(rs.getString("bill_address2"));
            order.setBillCity(rs.getString("bill_city"));
            order.setBillZip(rs.getString("bill_zip"));
            order.setBillZone(rs.getString("bill_zone"));
            order.setBillZoneId(rs.getInt("bill_zone_id"));
            order.setBillCountry(rs.getString("bill_country"));
            order.setBillCountryCode(rs.getString("bill_country_code"));
            order.setBillCountryId(rs.getInt("bill_country_id"));
            
            
            

            orders.add(order);

        }
        connection.close();
        return orders;
    }

    public static Order getByPk(int id) throws ClassNotFoundException, SQLException {
        DBConnection connection = new DBConnection();
        connection.open();
        Order order = null;
        String sql = "SELECT * from gc_orders where id=?";
        PreparedStatement statement = connection.initStatement(sql);
        statement.setInt(1, id);
        ResultSet rs = connection.executeQuery();
        while (rs.next()) {
            order = new Order();
            order.setId(Integer.parseInt(rs.getString("id")));
            order.setOrderNumber(rs.getString("order_number"));
            order.setCustomerId(rs.getInt("customer_id"));
            order.setStatus(rs.getString("status"));
            order.setOrderedOn(rs.getString("ordered_on"));
            order.setShippedOn(rs.getString("shipped_on"));            
            order.setTax(rs.getInt("tax"));
            order.setTotal(rs.getInt("total"));
            order.setSubtotal(rs.getInt("subtotal"));
            order.setGiftCardDiscount(rs.getDouble("gift_card_discount"));
            order.setCouponDiscount(rs.getDouble("coupon_discount"));
            order.setShipping(rs.getInt("shipping"));
            order.setShippingNotes(rs.getString("shipping_notes"));
            order.setShippingMethod(rs.getString("shipping_method"));
            order.setNotes(rs.getString("notes"));
            order.setPaymentInfo(rs.getString("payment_info"));
            order.setReferral(rs.getString("referral"));
            order.setCompany(rs.getString("company"));
            order.setFirstname(rs.getString("firstname"));
            order.setLastname(rs.getString("lastname"));
            order.setPhone(rs.getString("phone"));
            order.setEmail(rs.getString("email"));
            order.setShipCompany(rs.getString("ship_company"));
            order.setShipFirstname(rs.getString("ship_firstname"));
            order.setShipLastname(rs.getString("ship_lastname"));
            order.setShipEmail(rs.getString("ship_email"));
            order.setShipPhone(rs.getString("ship_phone"));
            order.setShipAddress1(rs.getString("ship_address1"));
            order.setShipAddress2(rs.getString("ship_address2"));
            order.setShipCity(rs.getString("ship_city"));
            order.setShipZip(rs.getString("ship_zip"));
            order.setShipZone(rs.getString("ship_zone"));
            order.setShipZoneId(rs.getInt("ship_zone_id"));
            order.setShipCountry(rs.getString("ship_country"));
            order.setShipCountryCode(rs.getString("ship_country_code"));
            order.setShipCountryId(rs.getInt("ship_country_id"));
            order.setBillCompany(rs.getString("bill_company"));
            order.setBillFirstname(rs.getString("bill_firstname"));
            order.setBillLastname(rs.getString("bill_lastname"));
            order.setBillEmail(rs.getString("bill_email"));
            order.setBillPhone(rs.getString("bill_phone"));
            order.setBillAddress1(rs.getString("bill_address1"));
            order.setBillAddress2(rs.getString("bill_address2"));
            order.setBillCity(rs.getString("bill_city"));
            order.setBillZip(rs.getString("bill_zip"));
            order.setBillZone(rs.getString("bill_zone"));
            order.setBillZoneId(rs.getInt("bill_zone_id"));
            order.setBillCountry(rs.getString("bill_country"));
            order.setBillCountryCode(rs.getString("bill_country_code"));
            order.setBillCountryId(rs.getInt("bill_country_id"));
        }
        connection.close();
        return order;
    }
    
    
}
