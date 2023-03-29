package com.prueba1.demo.controlador;

import com.prueba1.demo.entidad.personas;
import com.prueba1.demo.servicios.serviciosPersonas;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin(origins = "*",maxAge = 3600)


@RestController


public class controladorPersonas {
    serviciosPersonas servicio = new serviciosPersonas();
    @RequestMapping("/saludar")
        public String hola(){ return "hola mundo";}

    @GetMapping("/cantidad")
    public String cantidad (){
        return "la cantidad de productos es: "+servicio.cantidad();

    }
    @GetMapping("/lista")
    public ArrayList<personas> serviciosPersonas(){
            return servicio.mostrar();

    }

    @PostMapping("/agregarPersonas")
    public String agregarPersonas(@RequestBody personas p){
            return servicio.agregarPersonas(p);
    }
    @GetMapping("/buscarPersona/{dato}")
    public personas buscar (@PathVariable("dato") String nombre){
            return servicio.buscarPersona(nombre);
    }
}
