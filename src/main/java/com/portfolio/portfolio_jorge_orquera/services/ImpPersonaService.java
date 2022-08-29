package com.portfolio.portfolio_jorge_orquera.services;

import com.portfolio.portfolio_jorge_orquera.entity.Persona;
import com.portfolio.portfolio_jorge_orquera.interfaces.IPersonaService;
import com.portfolio.portfolio_jorge_orquera.repository.IPersona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaService{
    @Autowired IPersona ipersonarepository;
    
    @Override
    public List<Persona> getPersona() {
        List<Persona> listapersonas = ipersonarepository.findAll();
        return listapersonas;
    }

    @Override
    public void savePersona(Persona pers) {
        ipersonarepository.save(pers);
    }

    @Override
    public void deletePersona(Long id) {
        ipersonarepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona pers = ipersonarepository.findById(id).orElse(null);
        return pers;
    }
    
}
