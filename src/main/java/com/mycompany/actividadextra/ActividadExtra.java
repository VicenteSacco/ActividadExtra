package com.mycompany.actividadextra;
import java.util.Scanner;
/**
 *
 * @author Vicente Sacco
 */
public class ActividadExtra {

    public static void main(String[] args) {
        
        Scanner Entrada = new Scanner(System.in);
        int Opcion;
        //Variables inicializadas para hacer correr el codigo.
        int num =0;
        String rut = null;
        Mesa mesa = null;
        Servel Servel = new Servel();
        
        do{
            //Se pregunta por la opcion.
            System.out.println("1- Agregar Mesa");
            System.out.println("2- Eliminar Elector");
            System.out.println("3- Cuadrar Mesa");
            System.out.println("4- Salir");
            
            //Se inicializa la opcion.
            Opcion=Entrada.nextInt();

            
            //Se crea el case para hacer el menu.
            switch(Opcion){
              case 1 -> Servel.AgregaMesa(num,mesa);

              case 2 -> Servel.EliminaElector(rut);

              case 3 -> Servel.CuadrarMesas();  
            }   
        }while(Opcion !=4);
   }
}

