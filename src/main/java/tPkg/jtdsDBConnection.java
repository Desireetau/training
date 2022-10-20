package tPkg;

import java.sql.*;

public class jtdsDBConnection {

    public static void main (String[]args) throws SQLException {

        DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
        Connection conn = DriverManager.getConnection("jdbc:jtds:sqlserver://LAPTOP-FI1QQ2JI/AdventureWorks2019;integratedSecurity=true;authenticationScheme=JavaKerberos;encrypt=true;trustedServerCertificate=true;");
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


    public jtdsDBConnection() throws SQLException {
    }
}

