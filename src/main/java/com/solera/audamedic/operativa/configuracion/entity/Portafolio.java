package com.solera.audamedic.operativa.configuracion.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

@Entity
@Table(name = "\"Portafolio\"")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Portafolio {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "portafolio_sequence")
    @SequenceGenerator(name = "portafolio_sequence", sequenceName = "seq_portafolio", allocationSize = 1)
    @Column(name = "\"PortafolioID\"")
    private Long portafolioID;

    @ManyToOne
    @JoinColumn(name = "\"ProveedorID\"", referencedColumnName = "\"ProveedorID\"")
    private Proveedor proveedor;

    @Column(name = "\"NombrePortafolio\"", length = 255)
    private String nombrePortafolio;

    @Lob
    @Column(name = "\"Descripcion\"")
    private String descripcion;
}
