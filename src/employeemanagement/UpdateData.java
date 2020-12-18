
package employeemanagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UpdateData {
     private Connection connection = null;
      private Statement statement = null;
      private PreparedStatement preparedStatement = null;
      private  ResultSet result = null;
      private  Scanner sc = null;
     
       void updateData() {
        try{
         connection = ApiClient.getInstance();
         sc = new Scanner(System.in);
         String query;
          query = "UPDATE employee_info_table SET salary = ? where no = ?";
            preparedStatement = connection.prepareStatement(query);
               System.out.println("Input update salary :");
            preparedStatement.setInt   (1, sc.nextInt());
            System.out.println("Update no :");
            preparedStatement.setInt(2, sc.nextInt());
            preparedStatement.executeUpdate();
            System.out.println("Updated data successful");
            System.out.println("\n");
            
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
         
       
    }
    
}
