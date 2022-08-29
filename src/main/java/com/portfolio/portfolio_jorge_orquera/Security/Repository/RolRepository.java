package com.portfolio.portfolio_jorge_orquera.Security.Repository;

import com.portfolio.portfolio_jorge_orquera.Security.Entity.Rol;
import com.portfolio.portfolio_jorge_orquera.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Notación que indica que es un repositorio
@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {

    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
