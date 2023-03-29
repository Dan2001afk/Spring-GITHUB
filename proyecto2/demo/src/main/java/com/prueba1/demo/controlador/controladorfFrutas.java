package com.prueba1.demo.controlador;

import com.prueba1.demo.entidad.frutas;
import com.prueba1.demo.servicios.serviciosFrutas;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin(origins = "*",maxAge = 3600)

@RestController

public class controladorfFrutas {
    serviciosFrutas servicio = new serviciosFrutas();
    @RequestMapping("/saludar")
        public String hola(){/*metodo saludo*/ return "hola mundo";}

    @GetMapping("/cantidadfrutas")
    public String cantidad (){
        return "la cantidad de productos es: "+servicio.cantidadfrutas();

    }
    @GetMapping("/lista")
    public ArrayList<frutas> serviciosfrutas(){
            return servicio.mostrarlista();

    }

    @PostMapping("/agregarfruta/")
    public String agregarPersonas(@RequestBody frutas p){
        return servicio.agregarfrutas(p);
    }
    @CrossOrigin(origins = "*",maxAge = 3600)
    @PostMapping("/eliminarfruta/")
    public String eliminarfruta(@RequestBody frutas f){
        return servicio.eliminarfruta(f);
    }


    @GetMapping("/buscarfruta/{dato}")
    public frutas buscar (@PathVariable("dato") String nombre){
            return servicio.buscarfruta(nombre);
    }
}
