package com.portfolio.portfolio_jorge_orquera.Dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class DtoEducacion {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;

    public DtoEducacion() {
    }

    public DtoEducacion(String nombreE, String descripcionE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
    }    
}

