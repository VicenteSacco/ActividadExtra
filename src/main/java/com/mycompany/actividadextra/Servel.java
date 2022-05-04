/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividadextra;
import java.util.*;
/**
 *
 * @author Vicente Sacco
 */
public class Servel{

  private ArrayList<Mesa>ListaMesa =new ArrayList <Mesa>();
  
  public Boolean AgregaMesa(int numMesa ,Mesa mesa){
    for(int i=0; i<ListaMesa.size(); i++){
      if(numMesa == ListaMesa.get(i).numMesa)
        return false;
    }
    ListaMesa.add(mesa);
    return true;
  }
  public Elector EliminaElector(String rut ){
    int i;
    int j;
    int tamanyo= ListaMesa.size();
    
    //Recorremos la lista de mesas.
    for(i=0;i<tamanyo;i++){
      //Recorremos la lista de electores.
      for(j=0;j<ListaMesa.get(i).ListaElector.size();j++)
        if(rut.equals(ListaMesa.get(i).ListaElector.get(j).getRut()))
            return  ListaMesa.get(i).EliminaElector(rut);
    }
    return null;
  }
  
  public int [] CuadrarMesas(){
    
      int i ;
      int tamanyo = ListaMesa.size();
      int entero1 =0;
      int entero2 =0;
      int entero3 =0;
      
      
      for(i=0;i<tamanyo;i++){
         if(ListaMesa.get(i).CuadraMesa(ListaMesa.get(i).ListaVoto, ListaMesa.get(i).ListaElector)==0){
           entero1++;
         }
         if(ListaMesa.get(i).CuadraMesa(ListaMesa.get(i).ListaVoto, ListaMesa.get(i).ListaElector)==1){
           entero2++;
         }
        if(ListaMesa.get(i).CuadraMesa(ListaMesa.get(i).ListaVoto, ListaMesa.get(i).ListaElector)==-1){
          entero3++;
        }
      }
      int arreglo[]={entero1,entero2,entero3};
     
      System.out.println("hola");
    return arreglo ;
  }
}