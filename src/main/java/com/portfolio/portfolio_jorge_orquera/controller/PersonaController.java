package com.portfolio.portfolio_jorge_orquera.controller;

import com.portfolio.portfolio_jorge_orquera.entity.Persona;
import com.portfolio.portfolio_jorge_orquera.interfaces.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "https://jorge-orquera.web.app")
public class PersonaController {
    @Autowired IPersonaService ipersonaservice;
    
   @GetMapping ("/personas/traer")
    public List<Persona> getPersona(){
        return ipersonaservice.getPersona();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("/personas/crear")
    public String createPersona(@RequestBody Persona pers){
        ipersonaservice.savePersona(pers);
        return "La persona fue creada correctamente";
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/personas/borrar/{id}")
    public String deletePersona(@PathVariable Long id){
        ipersonaservice.deletePersona(id);
        return "La persona fue eliminada correctamente";
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping ("/personas/editar/{id}")
    public Persona editPersona(@PathVariable Long id,
                                @RequestParam("nombre") String nuevonombre,
                                @RequestParam("apellido") String nuevoapellido,
                                @RequestParam("img") String nuevaimg){
        Persona pers = ipersonaservice.findPersona(id);
        pers.setNombre(nuevonombre);
        pers.setApellido(nuevoapellido);
        pers.setImg(nuevaimg);
        
        ipersonaservice.savePersona(pers);
        return pers;
    }
    
    @GetMapping ("/personas/traerperfil")
    public Persona findPersona(){
        return ipersonaservice.findPersona((long)1);
    }
}


