package com.solera.audamedic.operativa.configuracion.portafolio;

import com.solera.audamedic.operativa.configuracion.entity.Portafolio;

import java.util.List;

public interface CustomPortafolioRepository {
    List<Portafolio> findProveedoresByProveedorId(Long proveedorId);

}
