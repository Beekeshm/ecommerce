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
public class Pages {
    private Integer id;
    private Integer parentId;
    private String title;
    private String menuTitle;
    private String slug;
    private Integer routeId;
    private String content;
    private Integer sequence;
    private String seoTitle;
    private String meta;
    private String url;
    private Boolean newWindow;

    public Pages() {
    }
    

    public Pages(Integer id, Integer parentId, String title, String menuTitle, String slug, Integer routeId, String content, Integer sequence, String seoTitle, String meta, String url, Boolean newWindow) {
        this.id = id;
        this.parentId = parentId;
        this.title = title;
        this.menuTitle = menuTitle;
        this.slug = slug;
        this.routeId = routeId;
        this.content = content;
        this.sequence = sequence;
        this.seoTitle = seoTitle;
        this.meta = meta;
        this.url = url;
        this.newWindow = newWindow;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMenuTitle() {
        return menuTitle;
    }

    public void setMenuTitle(String menuTitle) {
        this.menuTitle = menuTitle;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean getNewWindow() {
        return newWindow;
    }

    public void setNewWindow(Boolean newWindow) {
        this.newWindow = newWindow;
    }
    
    
    
    
}
