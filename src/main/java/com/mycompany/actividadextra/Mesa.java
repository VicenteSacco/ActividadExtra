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
public class Mesa {
  
  public String Circunscripcion;
  public int numMesa;
  public ArrayList<Voto>ListaVoto=new ArrayList<Voto>();
  public ArrayList<Elector>ListaElector=new ArrayList<Elector>();
  
  public Elector EliminaElector(String rut){
    int i;
    int tamnyo= ListaElector.size();
    Elector elector;
    for(i=0;i<tamnyo;i++){
        if(rut.equals(ListaElector.get(i).getRut())){
          elector = ListaElector.get(i) ;
          ListaElector.remove(i);
          return elector;
        }
      }
     return null ;
  }

  public int CuadraMesa(ArrayList<Voto>ListaVoto, ArrayList<Elector>ListaElector){
    int i=ListaVoto.size();
    int j=ListaElector.size();
    int x,cont=0;
    //Contamos los que asistieron a votar.
    for(x=1;x<j;x++){
        if(ListaElector.get(x).isAsiste()==true)
            cont++;
    }
    if(cont==i){
      return 0;
    }
    if(cont>i){
      return 1;
    }
    else{
      return -1;
    }
  }
}
