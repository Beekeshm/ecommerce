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
public class GiftCards {
    private Integer id;
    private String orderNumber;
    private String code;
    private String expiryDate;
    private double beginningAmount;
    private double amountUsed;
    private String toName;
    private String toEmail;
    private String from;
    private String personalMessage;
    private Integer activated;

    public GiftCards(Integer id, String orderNumber, String code, String expiryDate, double beginningAmount, double amountUsed, String toName, String toEmail, String from, String personalMessage, Integer activated) {
        this.id = id;
        this.orderNumber = orderNumber;
        this.code = code;
        this.expiryDate = expiryDate;
        this.beginningAmount = beginningAmount;
        this.amountUsed = amountUsed;
        this.toName = toName;
        this.toEmail = toEmail;
        this.from = from;
        this.personalMessage = personalMessage;
        this.activated = activated;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public double getBeginningAmount() {
        return beginningAmount;
    }

    public void setBeginningAmount(double beginningAmount) {
        this.beginningAmount = beginningAmount;
    }

    public double getAmountUsed() {
        return amountUsed;
    }

    public void setAmountUsed(double amountUsed) {
        this.amountUsed = amountUsed;
    }

    public String getToName() {
        return toName;
    }

    public void setToName(String toName) {
        this.toName = toName;
    }

    public String getToEmail() {
        return toEmail;
    }

    public void setToEmail(String toEmail) {
        this.toEmail = toEmail;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getPersonalMessage() {
        return personalMessage;
    }

    public void setPersonalMessage(String personalMessage) {
        this.personalMessage = personalMessage;
    }

    public Integer getActivated() {
        return activated;
    }

    public void setActivated(Integer activated) {
        this.activated = activated;
    }
    
    
    
           
}
