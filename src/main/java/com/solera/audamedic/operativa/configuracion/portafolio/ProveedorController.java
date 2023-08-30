package com.solera.audamedic.operativa.configuracion.portafolio;

import com.solera.audamedic.operativa.configuracion.entity.Portafolio;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/proveedores")
public class ProveedorController {

    private final PortafolioService portafolioService;

    @GetMapping("/{id}/portafolios")
    public ResponseEntity<List<Portafolio>> getPortafoliosByProveedorId(@PathVariable Long id) {
        log.info("Requesting portafolio by provider id " + id);
        List<Portafolio> portafolios = portafolioService.findListByProveedorId(id);
        return new ResponseEntity<>(portafolios, HttpStatus.OK);
    }

}
