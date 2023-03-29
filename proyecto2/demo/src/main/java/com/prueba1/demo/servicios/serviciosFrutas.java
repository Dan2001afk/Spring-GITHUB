package com.prueba1.demo.servicios;

import com.prueba1.demo.entidad.frutas;

import java.util.ArrayList;

public class serviciosFrutas {
    private ArrayList<frutas> lista = new ArrayList<>();
    public serviciosFrutas(){
        lista.add(new frutas("Manzana","verde","mediana","redonda",1000,3));
        lista.add(new frutas("Pera","verde","mediana","ovalada",1300,1));
        lista.add(new frutas("Banano","Amarillo","grande","largo",800,1));
        lista.add(new frutas("Mango","verde","pequeño","redonda",2700,2));
        lista.add(new frutas("sandia","verde","grande","redonda",7000,1));
        lista.add(new frutas("Manzana","verde","mediana","redonda",5500,4));
        lista.add(new frutas("Fresa","Rojo","pequeño","ovalada",2000,30));
    }
    public int cantidadfrutas(){
        return lista.size();

    }
    public ArrayList<frutas> mostrarlista(){
        return lista;
    }

    public String agregarfrutas(frutas p){
        lista.add(p);
        return "fruta registrada correctamente";
    }
    public String eliminarfruta(frutas f){
        lista.remove(f);
        return "fruta eliminada correctamente";
    }


    public frutas buscarfruta(String nombre){
        frutas fru=null;
        for(frutas p:lista){
            if(p.getNombre().equalsIgnoreCase(nombre)){
                fru=p;
                break;
            }
        }
        return fru;
    }
}
