package com.company.w9HW;

import java.sql.*;

public class Database {
    String url = "jdbc:postgresql://localhost:5432/assignment4";
    String username = "postgres";
    String password = "ablayhan2003";
    String sql="SELECT name,surname,grade FROM info WHERE id=14";
    private static Database instance;
    private Database() throws ClassNotFoundException, SQLException {
       this.sql=sql;
    }
    public static Database getInstance() throws ClassNotFoundException, SQLException{
        if(instance==null){
            instance=new Database();
        }
        return instance;
    }

    public void getSql(){
        try {
            String sql="SELECT name,surname,grade FROM info WHERE id=15";
            Connection connection = DriverManager.getConnection(url, username, password);
           Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);
            String name=null;
            String surname=null;
            int grade=0;
            while (result.next()) {
                name = result.getString("name");
                surname = result.getString("surname");
                grade = result.getInt("grade");
            }
            System.out.println("Name:" + name + " Surname:" + surname + " Grade:" + grade);
            connection.close();
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
