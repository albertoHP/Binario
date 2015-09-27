/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binario;
import java.util.Scanner;
/**
 *
 * @author alberto
 */
public class Binario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("¡Bienvenido al transformador!");
        int respuesta, seguir;
        Scanner leer = new Scanner(System.in);
        int bits[][]= new int[1][8];
         int valor, resto;
        
        
        do{
            do{
            System.out.println("Ingrese un numero en base decimal porfavor:");
            respuesta = leer.nextInt();
            
            if(respuesta<0 || respuesta>256){
                System.out.println("ERROR");
            }
        }while(respuesta<0 || respuesta>256);
            
          int i=7, cont=0;
            do{
                cont++;
               valor=respuesta/2;
               resto=respuesta - (valor*2);
               respuesta = valor;
               bits[0][i]=resto;
               i--;
               
               
               
               
           }while(respuesta!=1 && i>=0 && i<=7 && cont!=8);
            
            
            
            if(respuesta==1 && i>=0 && i<=7){
                   bits[0][i]=respuesta;
               }
            
            
            
            
            if(i>=0 && i<=7 || respuesta==0){
                System.out.println("Su numero en base decimal, transformado a codigo binario es:");
              for( i=0; i<=7;i++){
                
                System.out.print(bits[0][i]+"\t");
                bits[0][i]=0;
            } 
               System.out.println();  
            }else{
                System.out.println("Error");
            }
            
           
            
        do{
            System.out.println("¿Desea ingresar otro numero? 1-si 2-no");
        seguir = leer.nextInt();
        if(seguir<=0 || seguir>2){
            System.out.println("ERROr");
        }
        }while(seguir<=0 || seguir>2);
        }while(seguir==1);
        
        System.out.println("Gracias por utilizar el transformador.");
        
        
        
        
        
        
    }
    
}
