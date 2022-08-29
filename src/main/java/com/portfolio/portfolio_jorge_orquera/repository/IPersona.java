package com.portfolio.portfolio_jorge_orquera.repository;

import com.portfolio.portfolio_jorge_orquera.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersona extends JpaRepository<Persona, Long>{
    
}
