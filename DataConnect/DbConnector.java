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

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url,username,password);
    }

    private PreparedStatement getStatement(String query,Connection con) throws SQLException {
        return con.prepareStatement(query);
    }
    private ResultSet getResult() throws SQLException {
        return statement.executeQuery();
    }
    public void closeConnection(){
        try {
            con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void closeStatement(){
        try {
            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public void addUser(int id,String fName,String sName,String group,int math,int english,int history) throws SQLException {
        String query = "INSERT INTO journal VALUES ('"+ id + "','"+ fName +"','"+ sName +"','"+group+"','"+math+"','"+english+"','"+history+"')";
        con = getConnection();
        statement = getStatement(query,con);
        statement.execute();

        closeConnection();

        closeStatement();
    }
    private Student getStudent(ResultSet result) throws SQLException {
        Student student = new Student();
        student.setId(result.getInt(1));
        student.setName(result.getString(2));
        student.setSname(result.getString(3));
        student.setGroup(result.getString(4));
        student.getGrades().setM(result.getInt(5));
        student.getGrades().setE(result.getInt(6));
        student.getGrades().setH(result.getInt(7));
        return student;
    }

    public Student findUser(int findid) throws SQLException {
        String query = "SELECT * fROM  journal WHERE id = '"+findid+"'";
        con = getConnection();
        statement = getStatement(query,con);
        result = statement.executeQuery();
        return getStudent(result);
    }
    
}
