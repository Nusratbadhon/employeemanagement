
package employeemanagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadData {
    private Statement statement = null;
private PreparedStatement preparedStatement = null;
private ResultSet result = null;
private Connection connection = null;
private Scanner sc = null;

 void readData(){
     {
        try {
            connection = ApiClient.getInstance();
            sc = new Scanner(System.in);
       

            String q = "SELECT name,age,f_name,gender,post FROM employee_info_table WHERE salary=?";
            preparedStatement = connection.prepareStatement(q);
            while(true){
            System.out.println("Enter Salary : ");
            preparedStatement.setInt(1, sc.nextInt());
            result = preparedStatement.executeQuery();
            
            
      
                while (result.next()) {
                    System.out.println("Name: " + result.getString("name"));
                   
                    System.out.println("First name: " + result.getString("f_name"));
                    System.out.println("Age: " + result.getString("age"));
                                    
                    System.out.println("Gender : " + result.getString("gender"));
                    System.out.println("Post: " + result.getString("post"));
                    System.out.println("\n");
                }
            }
            
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ReadData.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Myerror: ");
        }
        
      
    }

 }
    
}
