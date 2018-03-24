/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.service;

import java.util.List;

/**
 *
 * @author lyndenmarshall
 */
public class MavenAssign1Page {
   
    String name;
    String city;
    String country;
    List<MavenAssign1Item> records;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    public List<MavenAssign1Item> getRecords() {
        return records;
    }

    public void setRecords(List<MavenAssign1Item> records) {
        this.records = records;
    }
    
    
}

