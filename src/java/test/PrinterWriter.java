/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.test;

import java.io.PrintWriter;
import java.io.File;

/**
 *
 * @author CWinkley
 */
public class PrinterWriter {
    
    public static void main(String[] args){
        try{
            File file = new File("address_book.txt");
            if(file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else{
                System.out.println("File exists");
                PrintWriter writer = new PrintWriter(System.out);
            }
        }
        writer.print("<html><body><p>hello</p></body></html>");
        writer.println();
    }
    
}
