package com.solera.audamedic.operativa.configuracion.entity;

import lombok.Data;

import jakarta.persistence.*;

@Entity
@Table(name = "\"Portafolio_MIP\"")
@Data
public class PortafolioMIP {

    @Id
    @ManyToOne
    @JoinColumn(name = "\"PortafolioID\"", referencedColumnName = "\"PortafolioID\"")
    private Portafolio portafolio;

    @Id
    @ManyToOne
    @JoinColumn(name = "\"MIPID\"", referencedColumnName = "\"MIPID\"")
    private MIP mip;
}
