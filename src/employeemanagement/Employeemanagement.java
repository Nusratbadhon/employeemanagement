
package employeemanagement;

import java.sql.SQLException;
import java.util.Scanner;

public class Employeemanagement {

    
    public static void main(String[] args) throws ClassNotFoundException {
      
    while(true){
        System.out.println("C=Create data");
        System.out.println("R=Read data");
        System.out.println("U=Update data");
        System.out.println("D=Delete data");
        
            Scanner sc = null;
        sc = new Scanner(System.in);
        System.out.println("Enter any character :");
        String chr=sc.nextLine();
       switch(chr)
       {
           case "C":
               System.out.println("Create data");
               CreateData cd = new CreateData();
               cd.createData();
               break;
           case "R":
               System.out.println("Read data");
               ReadData rd = new ReadData();
               rd.readData();
               break;
           case "U":
               System.out.println("Update data");
               UpdateData ud = new UpdateData();
               ud.updateData();
               break;
           case "D":
               System.out.println("Delete data");
               DeleteData dl = new DeleteData();
               dl.deleteData();
               break;
           case "CLOSE":
               ApiClient.close();
               System.out.println("Database close successful");
               break;
           default:
               System.out.println("ERROR");
               System.out.println("\n");
       }
       
          System.out.println("CLOSE = Database close");
         
    }
    
}
}
    
    

