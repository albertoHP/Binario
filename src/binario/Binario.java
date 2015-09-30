/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binario;
import java.util.Scanner;
import binario.Pelota;
import java.util.InputMismatchException;
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
        
        int bits[][]= new int[1][8];
         int valor, resto;
       
         
        do{
            
            
           
            
            
            
           do{
               Scanner leer = new Scanner(System.in);
               try
               {
                System.out.println("Ingrese un numero en base decimal porfavor:");
                respuesta = leer.nextInt();
                break;
            }
               catch(InputMismatchException in)
               {
               System.out.println("Ingrese un numero porfavor"); 
            }
           }while(true); 
            
                
           
            
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
            Scanner leer = new Scanner(System.in);
            try{
                System.out.println("¿Desea ingresar otro numero? 1-si 2-no");
            seguir = leer.nextInt();
            break;
            }
            catch(InputMismatchException in)
                    {
                        System.out.println("Ingrese un numero porfavor");
                        
                    }
         
        }while(true);
            
        
            
        
        
        }while(seguir==1);
        
        System.out.println("Gracias por utilizar el transformador.");
        
         }
         
        
    }
    

