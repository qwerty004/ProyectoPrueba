package food;

import java.util.Arrays;
import java.util.Random;


/**
 * 
 * @author David Ordóñez Valiña
 */
class Main {
 
     public static void main(String[] args) {
      
         Random rd = new Random();
         int a;
       
        int [] numeros = new int [2];
        int [] todos = new int [12];
         
         for (int i = 0; i < numeros.length; i++) {
             a= rd.nextInt(12)+1;
             if (todos[a-1]==0) {
                 numeros[i]=a;
             }
             else {
                 a= rd.nextInt(50)+1;
             if (todos[a-1]==0) {
                 numeros[i]=a;
             }
             }
                 
             
             
         }
         System.out.println(Arrays.toString(numeros));
    }
  
             
     
    
}