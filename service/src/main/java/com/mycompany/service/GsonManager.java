/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.service;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.logging.Logger;

/**
 *
 * @author dgebremichael
 */
public class GsonManager {
    
     private static Logger logger = Logger.getLogger("GsonManager");
     
     

    private static String readUrl(String urlString) throws Exception {
        BufferedReader reader = null;
        try {
            URL url = new URL(urlString);
            reader = new BufferedReader(new InputStreamReader(url.openStream()));
            StringBuilder buffer = new StringBuilder();
            int read;
            char[] chars = new char[1024];
            while ((read = reader.read(chars)) != -1) {
                buffer.append(chars, 0, read);
            }

            return buffer.toString();
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
    }

    public void jsonRet() throws Exception {
        String json = readUrl("https://www.w3schools.com/angular/customers.php");

        Gson gson = new Gson();
        MavenAssign1Page page = gson.fromJson(json, MavenAssign1Page.class);

        System.out.println(page.name);
        for (MavenAssign1Item records : page.records) {
            logger.info(records.name+"   " +records.city);
            System.out.println("    " + records.name+"   " +records.city);
        }
    }

    public static void main(String[] args) throws MalformedURLException, FileNotFoundException, Exception {

        new GsonManager().jsonRet();
    }

   
}
