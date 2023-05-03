/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p2_liaerazo;
import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class Lab2P2_LiaErazo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(" MENU ");
        System.out.println("1. Clasificando numeros");
        System.out.println("2. Aproximado PI");
        System.out.println("3. MCD");
        System.out.println(" Ingrese una opcion");
        int opcion =leer.nextInt();
        while (opcion!=4){
            switch (opcion){
                case 1:
                boolean primo=true;
                System.out.println("Ingrese un numero que desea evaluar");
                int numero= sc.nextInt();
                 while (primo &2!=numero){
                    if (numero%2==0){
                        primo= false;
                         System.out.println("El numero ingresado es par:");
                    }else{
                        System.out.println("El numero ingresado es primo");
                    }   
                 }  
                 break;
                case 3:
                int A,B;
                System.out.println("Ingrese un numero");
                A=leer.nextInt();
                System.out.println("Ingrese un segundo numero");
                B=leer.nextInt();
                if (A<B){
                int mcd = B-A;
                }else{
                int mcd = A-B;
                }
                int mcd = 0;
               System.out.println("El MCD es:"+mcd);
            }
            }
        }
  }