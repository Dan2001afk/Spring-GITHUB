package com.prueba1.demo.controlador;

import com.prueba1.demo.entidad.gatos;
import com.prueba1.demo.servicios.serviciosGatos;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin(origins = "*",maxAge = 3600)

@RestController

public class controladorgatos {
    serviciosGatos servicio = new serviciosGatos();
    @RequestMapping("/saludar")
        public String hola(){/*metodo saludo*/ return "hola mundo";}

    @GetMapping("/cantidadGatos/")
    public String cantidad (){
        return "la cantidad de productos es: "+servicio.cantidadGatos();

    }
    @GetMapping("/lista")
    public ArrayList<gatos> servicioGatos(){
            return servicio.mostrarlista();

    }

    @PostMapping("/agregargatos/")
    public String agregarPersonas(@RequestBody gatos p){
        return servicio.agregargatos(p);
    }
    @CrossOrigin(origins = "*",maxAge = 3600)
    @PostMapping("/eliminargatos/")
    public String eliminarfruta(@RequestBody gatos f){
        return servicio.eliminargatos(f);
    }


    @GetMapping("/buscargato/{dato}")
    public gatos buscar (@PathVariable("dato") String nombre){
            return servicio.buscargato(nombre);
    }
}
