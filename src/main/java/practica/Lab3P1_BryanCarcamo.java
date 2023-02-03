/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

import java.util.Scanner;

/**
 *
 * @author Bryan Carcamo
 */
public class Lab3P1_BryanCarcamo {
    public static void main(String[] args) {
        Scanner lea=new Scanner (System.in);
        
        int opcion=0;
        while(opcion!=4){
        System.out.println("---------MENU--------");
        System.out.println("1.Triangulos ");
        System.out.println("2.Calculando Pi ");
        System.out.println("3.Construyendo Casas ");
        System.out.println("4.Salir ");
        System.out.println("Opcion: ");
       opcion=lea.nextInt();
       
       switch(opcion){
       
           case 1: 
               int cantidad=0;
               String simboloSuperior="";
               String simboloInferior="";
               int repeticion=0; 
               System.out.println("Ingrese el tamaño de la figura: ");
               cantidad=lea.nextInt();
               
               System.out.println("Ingrese el simbolo del traingulo superior: ");
               simboloSuperior=lea.next();
               
               System.out.println("Ingrese el simbolo del traingulo inferior: ");
               simboloInferior=lea.next();
             
               if(cantidad>=4 && cantidad<=16){
               
              for(int i=0;i<=cantidad;i++){
              
             for(int j=cantidad-i;j>0;j--){
                 System.out.print(simboloInferior);
              }
             for(int k=0;k<i;k++){
                 System.out.print(simboloSuperior);
              }
                  System.out.println("");
              }
               }else{
                   System.out.println("Error con el ingreso de datos");
               }
               break;
           case 2: 
               System.out.println("Ingrese el limite de la sumatoria: ");
               int n=lea.nextInt();
              
               double suma=0;
               
               double promedio=0;
               double limite=0;
               for(int i=0;i<n;i++){
               
               double numerador=Math.pow(-1,n);
               double denominador=2*n+1;
               double total=4*(numerador/denominador);
               suma=suma+total;
               promedio=suma/limite;
               limite++;
               }
               System.out.println("La aproximacion es: "+promedio);
               
               break;
              
           case 3:
               System.out.println("Ingrese el tamaño de la figura");
               int num=lea.nextInt();
               
               if(num>4){
                   
                for(int i=0;i<=num;i++){
                  for(int j=num-i;j>0;j--){
                      System.out.print(" ");
                }
                  for(int k=0;k<i;k++){
                      System.out.print(" * ");
                  }
                    System.out.println(" ");
                }
                
             
                   //centro
                    for(int i=0;i<=num-2;i++){
                    System.out.print(" *");
                     for(int j=0;j<=num-2;j++){
                    System.out.print("  ");  
                }
                        System.out.println(" *");
                }
                   
                  //inferior  
                 for(int i=0;i<=num;i++){
                    System.out.print(" *");  
                }
                   System.out.println("");
               }else{
                   System.out.println("Error al ingresar los datos");
               }
              break; 
           case 4:
               System.out.println("Feliz dia");
               break;
               
            
       }
       
        }
    }
}
