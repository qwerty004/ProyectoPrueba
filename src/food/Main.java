package food;

import java.io.FileWriter;
import java.io.IOException;



class Main {
 
     public static void main(String[] args) throws IOException {
         try (FileWriter fichero = new FileWriter("ListadoPeliculas.txt")) {
             
             for (int i = 0; i < 10; i++) {
                 fichero.write("Hola ");
                 
             }
         } 
         catch (Exception e) {
             System.out.println(e.getMessage());
         }
         
    }
  
             
     
    
}