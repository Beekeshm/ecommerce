/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pagodalabs.ecommerce.entities;

/**
 *
 * @author Beekesh
 */
public class Order {
    private Integer id;
    private String orderNumber;
    private Integer customerId;
    private String status;
    private String orderedOn;
    private String shippedOn;
    private float tax;
    private float total;
    private float subtotal;
    private float giftCardDiscount;
    private float couponDiscount;
    private float shipping;
    private String shippingNotes;
    private String shippingMethod;
    private String notes;
    private String paymentInfo;
    private String referral;
    private String company;
    private String firstname;
    private String lastname;
    private String phone;
    private String email;
    private String shipCompany;
    private String shipFirstname;
    private String shipLastname;
    private String shipEmail;
    private String shipPhone;
    private String shipAddress1;
    private String shipAddress2;
    private String shipCity;
    private String shipZip;
    private String shipZone;
    private Integer shipZoneId;
    private String shipCountry;
    private String shipCountryCode;
    private Integer shipCountryId;    
    private String billCompany;
    private String billFirstname;
    private String billLastname;
    private String billEmail;
    private String billPhone;
    private String billAddress1;
    private String billAddress2;
    private String billCity;
    private String billZip;
    private String billZone;
    private Integer billZoneId;
    private String billCountry;
    private String billCountryCode;
    private Integer billCountryId;

    public Order() {
    }
    

    public Order(Integer id, String orderNumber, Integer customerId, String status, String orderedOn, String shippedOn, double tax, double total, double subtotal, double giftCardDiscount, double couponDiscount, double shipping, String shippingNotes, String shippingMethod, String notes, String paymentInfo, String referral, String company, String firstname, String lastname, String phone, String email, String shipCompany, String shipFirstname, String shipLastname, String shipEmail, String shipPhone, String shipAddress1, String shipAddress2, String shipCity, String shipZip, String shipZone, Integer shipZoneId, String shipCountry, String shipCountryCode, Integer shipCountryId, String billCompany, String billFirstname, String billLastname, String billEmail, String billPhone, String billAddress1, String billAddress2, String billCity, String billZip, String billZone, Integer billZoneId, String billCountry, String billCountryCode, Integer billCountryId) {
        this.id = id;
        this.orderNumber = orderNumber;
        this.customerId = customerId;
        this.status = status;
        this.orderedOn = orderedOn;
        this.shippedOn = shippedOn;
        this.tax = tax;
        this.total = total;
        this.subtotal = subtotal;
        this.giftCardDiscount = giftCardDiscount;
        this.couponDiscount = couponDiscount;
        this.shipping = shipping;
        this.shippingNotes = shippingNotes;
        this.shippingMethod = shippingMethod;
        this.notes = notes;
        this.paymentInfo = paymentInfo;
        this.referral = referral;
        this.company = company;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
        this.email = email;
        this.shipCompany = shipCompany;
        this.shipFirstname = shipFirstname;
        this.shipLastname = shipLastname;
        this.shipEmail = shipEmail;
        this.shipPhone = shipPhone;
        this.shipAddress1 = shipAddress1;
        this.shipAddress2 = shipAddress2;
        this.shipCity = shipCity;
        this.shipZip = shipZip;
        this.shipZone = shipZone;
        this.shipZoneId = shipZoneId;
        this.shipCountry = shipCountry;
        this.shipCountryCode = shipCountryCode;
        this.shipCountryId = shipCountryId;
        this.billCompany = billCompany;
        this.billFirstname = billFirstname;
        this.billLastname = billLastname;
        this.billEmail = billEmail;
        this.billPhone = billPhone;
        this.billAddress1 = billAddress1;
        this.billAddress2 = billAddress2;
        this.billCity = billCity;
        this.billZip = billZip;
        this.billZone = billZone;
        this.billZoneId = billZoneId;
        this.billCountry = billCountry;
        this.billCountryCode = billCountryCode;
        this.billCountryId = billCountryId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOrderedOn() {
        return orderedOn;
    }

    public void setOrderedOn(String orderedOn) {
        this.orderedOn = orderedOn;
    }

    public String getShippedOn() {
        return shippedOn;
    }

    public void setShippedOn(String shippedOn) {
        this.shippedOn = shippedOn;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getGiftCardDiscount() {
        return giftCardDiscount;
    }

    public void setGiftCardDiscount(double giftCardDiscount) {
        this.giftCardDiscount = giftCardDiscount;
    }

    public double getCouponDiscount() {
        return couponDiscount;
    }

    public void setCouponDiscount(double couponDiscount) {
        this.couponDiscount = couponDiscount;
    }

    public double getShipping() {
        return shipping;
    }

    public void setShipping(double shipping) {
        this.shipping = shipping;
    }

    public String getShippingNotes() {
        return shippingNotes;
    }

    public void setShippingNotes(String shippingNotes) {
        this.shippingNotes = shippingNotes;
    }

    public String getShippingMethod() {
        return shippingMethod;
    }

    public void setShippingMethod(String shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getPaymentInfo() {
        return paymentInfo;
    }

    public void setPaymentInfo(String paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

    public String getReferral() {
        return referral;
    }

    public void setReferral(String referral) {
        this.referral = referral;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getShipCompany() {
        return shipCompany;
    }

    public void setShipCompany(String shipCompany) {
        this.shipCompany = shipCompany;
    }

    public String getShipFirstname() {
        return shipFirstname;
    }

    public void setShipFirstname(String shipFirstname) {
        this.shipFirstname = shipFirstname;
    }

    public String getShipLastname() {
        return shipLastname;
    }

    public void setShipLastname(String shipLastname) {
        this.shipLastname = shipLastname;
    }

    public String getShipEmail() {
        return shipEmail;
    }

    public void setShipEmail(String shipEmail) {
        this.shipEmail = shipEmail;
    }

    public String getShipPhone() {
        return shipPhone;
    }

    public void setShipPhone(String shipPhone) {
        this.shipPhone = shipPhone;
    }

    public String getShipAddress1() {
        return shipAddress1;
    }

    public void setShipAddress1(String shipAddress1) {
        this.shipAddress1 = shipAddress1;
    }

    public String getShipAddress2() {
        return shipAddress2;
    }

    public void setShipAddress2(String shipAddress2) {
        this.shipAddress2 = shipAddress2;
    }

    public String getShipCity() {
        return shipCity;
    }

    public void setShipCity(String shipCity) {
        this.shipCity = shipCity;
    }

    public String getShipZip() {
        return shipZip;
    }

    public void setShipZip(String shipZip) {
        this.shipZip = shipZip;
    }

    public String getShipZone() {
        return shipZone;
    }

    public void setShipZone(String shipZone) {
        this.shipZone = shipZone;
    }

    public Integer getShipZoneId() {
        return shipZoneId;
    }

    public void setShipZoneId(Integer shipZoneId) {
        this.shipZoneId = shipZoneId;
    }

    public String getShipCountry() {
        return shipCountry;
    }

    public void setShipCountry(String shipCountry) {
        this.shipCountry = shipCountry;
    }

    public String getShipCountryCode() {
        return shipCountryCode;
    }

    public void setShipCountryCode(String shipCountryCode) {
        this.shipCountryCode = shipCountryCode;
    }

    public Integer getShipCountryId() {
        return shipCountryId;
    }

    public void setShipCountryId(Integer shipCountryId) {
        this.shipCountryId = shipCountryId;
    }

    public String getBillCompany() {
        return billCompany;
    }

    public void setBillCompany(String billCompany) {
        this.billCompany = billCompany;
    }

    public String getBillFirstname() {
        return billFirstname;
    }

    public void setBillFirstname(String billFirstname) {
        this.billFirstname = billFirstname;
    }

    public String getBillLastname() {
        return billLastname;
    }

    public void setBillLastname(String billLastname) {
        this.billLastname = billLastname;
    }

    public String getBillEmail() {
        return billEmail;
    }

    public void setBillEmail(String billEmail) {
        this.billEmail = billEmail;
    }

    public String getBillPhone() {
        return billPhone;
    }

    public void setBillPhone(String billPhone) {
        this.billPhone = billPhone;
    }

    public String getBillAddress1() {
        return billAddress1;
    }

    public void setBillAddress1(String billAddress1) {
        this.billAddress1 = billAddress1;
    }

    public String getBillAddress2() {
        return billAddress2;
    }

    public void setBillAddress2(String billAddress2) {
        this.billAddress2 = billAddress2;
    }

    public String getBillCity() {
        return billCity;
    }

    public void setBillCity(String billCity) {
        this.billCity = billCity;
    }

    public String getBillZip() {
        return billZip;
    }

    public void setBillZip(String billZip) {
        this.billZip = billZip;
    }

    public String getBillZone() {
        return billZone;
    }

    public void setBillZone(String billZone) {
        this.billZone = billZone;
    }

    public Integer getBillZoneId() {
        return billZoneId;
    }

    public void setBillZoneId(Integer billZoneId) {
        this.billZoneId = billZoneId;
    }

    public String getBillCountry() {
        return billCountry;
    }

    public void setBillCountry(String billCountry) {
        this.billCountry = billCountry;
    }

    public String getBillCountryCode() {
        return billCountryCode;
    }

    public void setBillCountryCode(String billCountryCode) {
        this.billCountryCode = billCountryCode;
    }

    public Integer getBillCountryId() {
        return billCountryId;
    }

    public void setBillCountryId(Integer billCountryId) {
        this.billCountryId = billCountryId;
    }
    
    
    
    
}


