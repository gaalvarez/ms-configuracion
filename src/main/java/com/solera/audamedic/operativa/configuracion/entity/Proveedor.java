package com.solera.audamedic.operativa.configuracion.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

@Entity
@Table(name = "\"Proveedor\"")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Proveedor {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "proveedor_sequence")
    @SequenceGenerator(name = "proveedor_sequence", sequenceName = "seq_proveedor", allocationSize = 1)
    @Column(name = "\"ProveedorID\"")
    private Integer proveedorID;

    @Column(name = "\"Nombre\"", length = 255)
    private String nombre;

    @Column(name = "\"Direccion\"", length = 255)
    private String direccion;

    @Column(name = "\"Telefono\"", length = 20)
    private String telefono;
}
