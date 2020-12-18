
package employeemanagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CreateData {
    private Connection connection = null;
    private ResultSet result = null;
    private  Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private Scanner sc = null;
   
   void createData() throws ClassNotFoundException  {
       try {
           connection = ApiClient.getInstance();
           sc = new Scanner(System.in);
           
          String query;
          query = "INSERT INTO employee_info_table(name,f_name,age,gender,email,phone,post,salary)"+ "VALUES(?,?,?,?,?,?,?,?)";
          preparedStatement = connection.prepareStatement(query);
          System.out.println("\nInsert the name\n");
          preparedStatement.setString(1,sc.nextLine());
          System.out.println("\nInsert First name\n");
          preparedStatement.setString(2,sc.nextLine());
          System.out.println("\nInsert age\n");
          preparedStatement.setString(3,sc.nextLine());
          System.out.println("\nInsert gender\n");
          preparedStatement.setString(4,sc.nextLine());
          System.out.println("\nInsert email\n");
          preparedStatement.setString(5,sc.nextLine());
          System.out.println("\nInsert phone\n");
          preparedStatement.setString(6,sc.nextLine());
          System.out.println("\nInsert post\n");
          preparedStatement.setString(7,sc.nextLine());
          System.out.println("\nInsert salary\n");
          preparedStatement.setString(8,sc.nextLine());
       
           
  
           preparedStatement.execute();
           System.out.println("Created data successful");
           System.out.println("\n");
           

           
       } catch (SQLException ex) {
           Logger.getLogger(CreateData.class.getName()).log(Level.SEVERE, null, ex);
           System.out.println("ERROR ");
       }
       
    
  }


}

    

