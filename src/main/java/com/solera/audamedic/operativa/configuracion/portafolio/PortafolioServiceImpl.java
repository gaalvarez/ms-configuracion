package com.solera.audamedic.operativa.configuracion.portafolio;

import com.solera.audamedic.operativa.configuracion.entity.Portafolio;
import com.solera.audamedic.operativa.configuracion.exception.ResourceNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PortafolioServiceImpl implements PortafolioService {

    private final PortafolioRepository portafolioRepository;

    @Override
    public Portafolio findByPortafolioID(Long id) {
        return portafolioRepository.findByPortafolioID(id)
                .orElseThrow(() -> new ResourceNotFoundException("No existe un portafolio con el id: %d".formatted(id), "DATA_ERROR_01"));
    }

    @Override
    public List<Portafolio> findListByProveedorId(Long proveedorID) {
        return portafolioRepository.findListByProveedorId(proveedorID);
    }

}
