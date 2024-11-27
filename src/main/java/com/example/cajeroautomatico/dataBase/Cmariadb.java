package com.example.cajeroautomatico.dataBase;

import java.sql.Connection;
import java.sql.DriverManager;

public class Cmariadb {
    String url =  "jdbc:mariadb://localhost:3307/cuentas";
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

    public Connection getConn() {
        return conn;
    }
}
