/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stomp
 */
import java.util.*;
import java.io.*;


public class JavaTest {
    
    public static void main(String args[] ){
        
        int opt = 1;
      do{  
         
        Scanner input = new Scanner(System.in);
        System.out.print("ID: ");
        int id = input.nextInt();
        input.nextLine();
        System.out.print("First name: ");
        String fname = input.nextLine();
        System.out.print("Last name: ");
        String lname = input.nextLine();
        System.out.print("Address: ");
        String street = input.nextLine();
        System.out.print("Age:");
        int age = input.nextInt();
        input.nextLine();
        System.out.print("Gender: ");
        String gender = input.nextLine();
        
        
        Address address = new Address(id, fname, lname, street, age, gender);
        //System.out.print(address.toString());
        address.addresslist.add(address);
        
        
        for(int i = 0; i<address.addresslist.size(); i++){
            System.out.println(address.toString());
        }     
      
          System.out.println("Enter in another record?");
          String choice = input.nextLine();
          
          if(choice.equalsIgnoreCase("y"))
          {
              opt = 1;
          }else {
              opt = 0;
          }
        
      }while(opt != 0); 
      
        System.out.println("Good bye");
    }
    
//    public void fileOutPut(Address address){
//        
//    }
    
    
}
