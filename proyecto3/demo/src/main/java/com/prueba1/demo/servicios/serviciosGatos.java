package com.prueba1.demo.servicios;

import com.prueba1.demo.entidad.gatos;

import java.util.ArrayList;

public class serviciosGatos {
    private ArrayList<gatos> lista = new ArrayList<>();
    public serviciosGatos(){
        lista.add(new gatos("Peluche","Azul ruso",2,"negro","grande"));
        lista.add(new gatos("Coco","asiatico",1,"blanco","pequeño"));
        lista.add(new gatos("Nena","americano",4,"manchado","media"));
        lista.add(new gatos("Moky","Angora",6,"cafe","pequeño"));
        lista.add(new gatos("Candy","persa",2,"blanco","pequeño"));
        lista.add(new gatos("Petulia","elfo",8,"negro","media"));
        lista.add(new gatos("Pluma","bambino",4,"negro","grande"));
    }
    public int cantidadGatos(){
        return lista.size();

    }
    public ArrayList<gatos> mostrarlista(){
        return lista;
    }

    public String agregargatos(gatos p){
        lista.add(p);
        return "gato registrado correctamente";
    }
    public String eliminargatos(gatos f){
        lista.remove(f);
        return "gato eliminado correctamente";
    }


    public gatos buscargato(String nombre){
        gatos gat=null;
        for(gatos p:lista){
            if(p.getNombre().equalsIgnoreCase(nombre)){
                gat=p;
                break;
            }
        }
        return gat;
    }
}
