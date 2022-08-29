package com.portfolio.portfolio_jorge_orquera.interfaces;

import com.portfolio.portfolio_jorge_orquera.entity.Persona;
import java.util.List;


public interface IPersonaService {
    //Trae lista de personas
    public List<Persona> getPersona();
    
    //Guarda persona
    public void savePersona(Persona pers);
    
    //Eliminar persona por ID
    public void deletePersona(Long id);
    
    //Buscar persona por ID
    public Persona findPersona(Long id);
}
