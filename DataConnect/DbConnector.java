package DataConnect;

import Service.Student;

import java.sql.*;
import java.util.List;

public class DbConnector {
    private final static String username = "postgres";
    private final static String password = "postgres";
    private final static String url ="jdbc:postgresql://localhost:5433/students";
    private Connection con;
    private PreparedStatement statement;
    private ResultSet result;


    public void addUser(int id,String fName,String sName,String group,int math,int english,int history) throws SQLException {
        String query = "INSERT INTO journal VALUES ('"+ id + "','"+ fName +"','"+ sName +"','"+group+"','"+math+"','"+english+"','"+history+"')";
        con = DriverManager.getConnection(url,username,password);
        statement = con.prepareStatement(query);
        statement.executeQuery();
    }
    public List<String> findUser(int findid) throws SQLException {
        String query = "SELECT * fROM  journal WHERE id = '"+findid+"'";
        con = DriverManager.getConnection(url,username,password);
        statement = con.prepareStatement(query);
        result = statement.executeQuery();
        Student student = new Student();
        return result;
    }
    
}
