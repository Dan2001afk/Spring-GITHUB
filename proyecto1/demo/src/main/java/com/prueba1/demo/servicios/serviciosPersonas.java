package com.prueba1.demo.servicios;

import com.prueba1.demo.entidad.personas;

import java.util.ArrayList;

public class serviciosPersonas {

    private ArrayList<personas> lista = new ArrayList<>();

    public serviciosPersonas() {
        lista.add(new personas(1073428852, "Vanesa", "Gordillo", 10, "van3202@gmail.com", 12245635));
        lista.add(new personas(1073428841, "Camilo", "Gonzalez", 15, "Camilocubides02@gmail.com", 20114563));
        lista.add(new personas(1073428817, "Geraldine", "Guerra", 20, "gerald2@gmail.com", 1002435));
        lista.add(new personas(1073428810, "Daniel", "Ramirez", 30, "Camolo.777@gmail.com", 2103466));
        lista.add(new personas(1173428852, "Felipe", "Otiz", 40, "felipe12@gmail.com", 4522121));
    }

    public int cantidad() {
        return lista.size();/*muestra tamaño*/

    }

    public ArrayList<personas> mostrar() {
        return lista;/*muestra toda la lista*/
    }

    public String agregarPersonas(personas p) {
        lista.add(p);
        return "se registro la persona correctamente";
    }


    public personas buscarPersona(String nombre) {
        personas per = null;
        for (personas p : lista) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                per = p;
                break;
            }
        }
        return per;
    }

    public String eliminarPersona(String nombre) {
        if (buscarPersona(nombre) != null) {
            lista.remove(buscarPersona(nombre));
            return "Se elimino Correctamente";
        } else {
            return "no se encontro ";
        }

    }
}
