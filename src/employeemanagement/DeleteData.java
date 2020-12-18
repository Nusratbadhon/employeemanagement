
package employeemanagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DeleteData {
     private  Connection connection = null;
  private Statement statement = null;
  private PreparedStatement preparedStatement = null;
  private ResultSet result = null;
  private Scanner sc = null;
     void deleteData(){
        try {
            connection = ApiClient.getInstance();
            sc = new Scanner(System.in);
            
            String query = "DELETE FROM employee_info_table where no = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            System.out.println("Choose no :");
            preparedStatement.setInt(1, sc.nextInt());

    
            preparedStatement.execute();
      
            System.out.println("Data deleted successful");
            System.out.println("\n");
        } catch (SQLException ex) {
            Logger.getLogger(DeleteData.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DeleteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
     
       
    }
    
}
