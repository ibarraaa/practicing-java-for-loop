
//package javaFundamentals;
import java.util.Scanner;
class authentication {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       
       String[] email = { 
           "john@example.com",
           "hiruki@example.com",
           "ace@example.com",
           "benten@example.com",
           "abu@example.com"
           };
       
       String[] password = {
            "john123",
            "hiruki123",
            "ace123",
            "benten123",
            "abu123"
       };
       
       System.out.println("Enter Your Email: ");
       String searchEmail = s.nextLine();
       System.out.println("Enter Your Password: ");
       String searchPassword = s.nextLine();
       
       
      for(int i=0; i < email.length;  i++){
          if(searchEmail.equals(email[i]) && searchPassword.equals(password[i])){
              System.out.println("Welcome, " + email[i]);
              break;
          }
      }
    
      
       
       
    }
}
        
        
    
