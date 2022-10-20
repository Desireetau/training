package tPkg;

import com.sun.jna.WString;

import java.sql.*;

public class sqlConnection {

    public static void main (String[]args) throws SQLException {

        DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
        Connection conn = DriverManager.getConnection("jdbc:sqlserver://LAPTOP-FI1QQ2JI;databaseName=AdventureWorks2019;integratedSecurity=true;encrypt=false;trustedServerCertificate=true;");
        Statement st = conn.createStatement();
        String Sql = "SELECT DISTINCT TOP (4) FirstName,LastName FROM AdventureWorks2019.Person.Person";
        ResultSet rs = st.executeQuery(Sql);

        if (conn != null) {

            System.out.println("Connection Established");
        }

        ResultSetMetaData rsmd = rs.getMetaData();
        int columnsNumber = rsmd.getColumnCount();
        while (rs.next()){
            for(int i=1; i <=columnsNumber; i++){
                System.out.println(rs.getString(i) +" ");
            }
            System.out.println(); //Move to the next line to print the next row
        }
    }

    public sqlConnection() throws SQLException {
    }
}
