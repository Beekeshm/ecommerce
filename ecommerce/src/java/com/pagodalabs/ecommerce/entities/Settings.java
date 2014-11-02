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
public class Settings {
    private Integer id;
    private String code;
    private String settingKey;
    private String setting;
    public Settings() {
    }

    public Settings(Integer id, String code, String settingKey, String setting) {
        this.id = id;
        this.code = code;
        this.settingKey = settingKey;
        this.setting = setting;
    }

    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSettingKey() {
        return settingKey;
    }

    public void setSettingKey(String settingKey) {
        this.settingKey = settingKey;
    }

    public String getSetting() {
        return setting;
    }

    public void setSetting(String setting) {
        this.setting = setting;
    }
    
    
}
