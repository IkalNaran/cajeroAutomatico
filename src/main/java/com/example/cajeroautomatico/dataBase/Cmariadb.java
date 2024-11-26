package com.example.cajeroautomatico.dataBase;

import java.sql.Connection;
import java.sql.DriverManager;

public class Cmariadb {
    String url =  "jdbc:mariadb://localhost:3306/nombre_bd";
    String user= "root";
    String pass = "C0smopolis.";
    Connection conn = null;
    public void connection(){
        try{
            conn = DriverManager.getConnection(url, user, pass);
            System.out.println("Conexion exitosa");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
