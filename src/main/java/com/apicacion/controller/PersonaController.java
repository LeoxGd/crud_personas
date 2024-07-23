package com.apicacion.controller;

import com.apicacion.model.Persona;
import com.apicacion.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {
    
    @Autowired IPersonaService persoServ;
    
    
    @PostMapping("/persona/crear")
    public void crearPersona(@RequestBody Persona perso){ //Crear <C>
        persoServ.createPersona(perso);
    }
    
    
    @GetMapping("/persona/traerPersona/{id}")
    public Persona taerPersona(@PathVariable Long id){        
        return persoServ.getPersona(id); // traer 1 persona <R>
    }    
    
    
    @PutMapping("/editar/persona")
    public void editarPersona(@RequestBody Persona perso){ //Borrar <U>
        persoServ.createPersona(perso);
    }
    
    
    @DeleteMapping("/borrar/persona/{id}")
    public void borrarPersona(@PathVariable Long id){ //Borrar <D>
        persoServ.deletePersona(id);
    }
    
    
    @GetMapping("/persona/listarPersonas")
    public List<Persona> taerListaPersonas(){
        List<Persona> listaPersonas = persoServ.getListPersonas(); // Listar
        return listaPersonas;
    }

}
