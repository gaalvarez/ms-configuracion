package com.solera.audamedic.operativa.configuracion.portafolio;

import com.solera.audamedic.operativa.configuracion.entity.Portafolio;

import java.util.List;

public interface PortafolioService {
    Portafolio findByPortafolioID(Long id);

    List<Portafolio> findListByProveedorId(Long proveedorID);
}
