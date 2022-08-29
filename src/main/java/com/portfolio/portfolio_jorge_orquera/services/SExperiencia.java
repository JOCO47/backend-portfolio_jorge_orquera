package com.portfolio.portfolio_jorge_orquera.services;

import com.portfolio.portfolio_jorge_orquera.entity.Experiencia;
import com.portfolio.portfolio_jorge_orquera.repository.RExperiencia;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SExperiencia {
    @Autowired
    RExperiencia rExperiencia;
    
    public List<Experiencia> list(){
        return rExperiencia.findAll();
    }
    
    public Optional<Experiencia> getOne(int id){
        return rExperiencia.findById(id);
    }
    
    public Optional<Experiencia> getByNombreE(String nombreE){
        return rExperiencia.findByNombreE(nombreE);
    }
    
    public void save(Experiencia exp){
        rExperiencia.save(exp);
    }
    
    public void delete(int id){
        rExperiencia.deleteById(id);
    }
    
    public boolean ExistsById(int id){
        return rExperiencia.existsById(id);
    }
    
    public boolean ExistsByNombreE(String nombreE){
        return rExperiencia.existsByNombreE(nombreE);
    }
}
