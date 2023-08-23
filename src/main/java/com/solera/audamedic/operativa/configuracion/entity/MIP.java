package com.solera.audamedic.operativa.configuracion.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

@Entity
@Table(name = "\"MIP\"")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MIP {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mip_sequence")
    @SequenceGenerator(name = "mip_sequence", sequenceName = "seq_mip", allocationSize = 1)
    @Column(name = "\"MIPID\"")
    private Long mipID;

    @Column(name = "\"Tipo\"", length = 20)
    private String tipo;

    @Column(name = "\"NombreMIP\"", length = 255)
    private String nombreMIP;

    @Lob
    @Column(name = "\"DescripcionMIP\"")
    private String descripcionMIP;
}
