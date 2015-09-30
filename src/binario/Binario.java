/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binario;
import java.util.Scanner;
import binario.Pelota;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;
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
        JOptionPane.showMessageDialog(null,"Bienvenido al transformador");
        int  respuesta, seguir;
        
        int bits[][]= new int[1][8];
         int valor, resto;
       
         
        do{
            
            
           
            
            
            
           do{
               Scanner leer = new Scanner(System.in);
               try
               {
                  
                do{
                    respuesta=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un" +
               " numero en base decimal"));
                    if(respuesta <0 || respuesta>255){
                        JOptionPane.showMessageDialog(null, "¡Numero fuera de rango!",
  "Transformador Binario", JOptionPane.WARNING_MESSAGE);
                    }
                }while(respuesta <0 || respuesta>255);   
                
                break;
            }
               catch(NumberFormatException in)
               {
               JOptionPane.showMessageDialog(null, "¡El valor ingresado no es un numero!",
  "Transformador Binario", JOptionPane.WARNING_MESSAGE);
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
                JOptionPane.showMessageDialog(null, "El codigo binario es:",
  "Transformador Binario", JOptionPane.INFORMATION_MESSAGE);
              for( i=0; i<=7;i++){
                
                System.out.print(bits[0][i]+"\t");
                bits[0][i]=0;
            } 
               System.out.println();  
            }else{
                System.out.println("Error");
            }
            
           
        
            
                
                 seguir=JOptionPane.showConfirmDialog(null,"¿Desea ingresar otro numero?");
              if (JOptionPane.OK_OPTION == seguir){
   
                seguir=1;
                }
                 else{
    
                seguir=2;
              }
           
            
        
        }while(seguir==1);
        
        JOptionPane.showMessageDialog(null, "Gracias por utilizar el transformador.",
  "Transformador Binario", JOptionPane.WARNING_MESSAGE);
        
         }
         
        
    }
    

