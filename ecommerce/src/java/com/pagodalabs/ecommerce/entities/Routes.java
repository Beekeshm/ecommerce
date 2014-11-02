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
public class Routes {
    private Integer id;
    private String slug;
    private String route;

    public Routes() {
    }
    

    public Routes(Integer id, String slug, String route) {
        this.id = id;
        this.slug = slug;
        this.route = route;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }
    
    
    
}
