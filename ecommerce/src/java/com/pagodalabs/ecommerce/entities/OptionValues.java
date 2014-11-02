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
public class OptionValues {
    
    private Integer id;
    private Integer optionId;
    private String name;
    private String value;
    private double price;
    private double weight;
    private Integer sequence;
    private Integer limit;

    public OptionValues(Integer id, Integer optionId, String name, String value, double price, double weight, Integer sequence, Integer limit) {
        this.id = id;
        this.optionId = optionId;
        this.name = name;
        this.value = value;
        this.price = price;
        this.weight = weight;
        this.sequence = sequence;
        this.limit = limit;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOptionId() {
        return optionId;
    }

    public void setOptionId(Integer optionId) {
        this.optionId = optionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
    
    
            
    
}
