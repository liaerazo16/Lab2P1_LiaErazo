/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_liaerazo;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Paola
 */
public class Lab2P1_LiaErazo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random random = new Random();
        int seguir = 0;
        System.out.println("\tMENU");
        System.out.println(" 1. Los juegos del hambre ");
        System.out.println(" 2. Wordle ");
        System.out.println(" 3. Movimiento de un pendulo ");
        System.out.println("\nIngrese el ejercicio que desea realizar:");
        int opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Bienvenidos a los 75 Juegos del hambre!");
                System.out.println("Eliga distrito donde se seleccionan los tributos :");
                System.out.println("Distritos disponibles : 1, 11, 12");
                int distrito=leer.nextInt();
                 int fem=0;
                 int masc=0;
                 String Trib_fem="";
                 String Trib_masc="";
                  switch(distrito){
                      case 1:
                          switch(fem){
                              case 1:
                                  Trib_fem="Cashmere";
                                  break;
                              case 2:
                                  Trib_fem="Glimmer";
                                  break;
                          }//tributo femenino
                          switch(masc){
                              case 1:
                                  Trib_masc="Gloss";
                                  break;
                              case 2:
                                  Trib_masc="Marvel";
                                  break;
                          }//tributo masculino
                          break;//distrito 1
                      case 11:
                          switch(fem){
                              case 1:
                                  Trib_fem="Rue";
                                  break;
                              case 2:
                                  Trib_fem="Johanna Mason";
                                  break;
                          }//tributo femenino
                          switch(masc){
                              case 1:
                                  Trib_masc="Finnick Odair";
                                  break;
                              case 2:
                                  Trib_masc="Thresh";
                                  break;
                          }//tributo masculino
                          break;
                      case 12:
                          switch(fem){
                              case 1:
                                  Trib_fem="Katniss Everdeen";
                                  break;
                              case 2:
                                  Trib_fem="Lucy Gray";
                                  break;
                          }//tributo femenino
                          switch(masc){
                              case 1:
                                  Trib_masc="Peeta Mellark";
                                  break;
                              case 2:
                                  Trib_masc="Haymich Abernathy";
                                  break;
                          }//tributo masculino
                          
                          System.out.println("¿Desea continuar? si(0) no(1)");
                          break;
                  }//ejercicio 1
                break;
            case 2:

                break;
            case 3:

                break;
            default :System.out.println("Error, intentelo de nuevo");
        }
    }

}
