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
public class Products {
    private Integer productId;
    private String sku;
    private String name;
    private String slug;
    private Integer routeId;
    private String description;
    private String excerpt;
    private double price;
    private double saleprice;
    private Boolean freeShipping;
    private Boolean shippable;
    private Boolean taxable;
    private Boolean fixedQuantity;
    private String weight;
    private Boolean trackStock;
    private Integer quantity;
    private String realtedProducts;
    private String images;
    private String seoTitle;
    private String meta;
    private Boolean enabled;

    public Products() {
    }
    

    public Products(Integer productId, String sku, String name, String slug, Integer routeId, String description, String excerpt, double price, double saleprice, Boolean freeShipping, Boolean shippable, Boolean taxable, Boolean fixedQuantity, String weight, Boolean trackStock, Integer quantity, String realtedProducts, String images, String seoTitle, String meta, Boolean enabled) {
        this.productId = productId;
        this.sku = sku;
        this.name = name;
        this.slug = slug;
        this.routeId = routeId;
        this.description = description;
        this.excerpt = excerpt;
        this.price = price;
        this.saleprice = saleprice;
        this.freeShipping = freeShipping;
        this.shippable = shippable;
        this.taxable = taxable;
        this.fixedQuantity = fixedQuantity;
        this.weight = weight;
        this.trackStock = trackStock;
        this.quantity = quantity;
        this.realtedProducts = realtedProducts;
        this.images = images;
        this.seoTitle = seoTitle;
        this.meta = meta;
        this.enabled = enabled;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Integer getRouteId() {
        return routeId;
    }

    public void setRouteId(Integer routeId) {
        this.routeId = routeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExcerpt() {
        return excerpt;
    }

    public void setExcerpt(String excerpt) {
        this.excerpt = excerpt;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSaleprice() {
        return saleprice;
    }

    public void setSaleprice(double saleprice) {
        this.saleprice = saleprice;
    }

    public Boolean getFreeShipping() {
        return freeShipping;
    }

    public void setFreeShipping(Boolean freeShipping) {
        this.freeShipping = freeShipping;
    }

    public Boolean getShippable() {
        return shippable;
    }

    public void setShippable(Boolean shippable) {
        this.shippable = shippable;
    }

    public Boolean getTaxable() {
        return taxable;
    }

    public void setTaxable(Boolean taxable) {
        this.taxable = taxable;
    }

    public Boolean getFixedQuantity() {
        return fixedQuantity;
    }

    public void setFixedQuantity(Boolean fixedQuantity) {
        this.fixedQuantity = fixedQuantity;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public Boolean getTrackStock() {
        return trackStock;
    }

    public void setTrackStock(Boolean trackStock) {
        this.trackStock = trackStock;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getRealtedProducts() {
        return realtedProducts;
    }

    public void setRealtedProducts(String realtedProducts) {
        this.realtedProducts = realtedProducts;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public String getSeoTitle() {
        return seoTitle;
    }

    public void setSeoTitle(String seoTitle) {
        this.seoTitle = seoTitle;
    }

    public String getMeta() {
        return meta;
    }

    public void setMeta(String meta) {
        this.meta = meta;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
    
    
    
    
    
    
}
