
package employeemanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

abstract class ApiClient {
     private static Connection connection = null;
     static Connection getInstance() throws SQLException, ClassNotFoundException{
        if(connection== null){
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost/employee_management_system?"+"user=root");
    }
        return connection;
    }

    static void close() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
    

