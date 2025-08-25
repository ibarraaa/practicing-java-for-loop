package javaFundamentals;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       String[] names ={
           "david",
           "alene",
           "john",
           "ace",
           "jasmer",
           "emman",
           "squid"
       };
        System.out.println("Enter name: ");
        String search = s.nextLine();
        
        for(int i = 0; i < names.length ; i++){
            if(names[i].equalsIgnoreCase(search)){
                System.out.println("we found " + names[i]);
                    break;
            }else{
                System.out.println( names[i]);
                
            }
        }
        
        
        
    }
}
