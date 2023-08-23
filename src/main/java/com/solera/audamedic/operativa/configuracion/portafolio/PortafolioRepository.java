package com.solera.audamedic.operativa.configuracion.portafolio;

import com.solera.audamedic.operativa.configuracion.entity.Portafolio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface PortafolioRepository extends JpaRepository<Portafolio, Long>, CustomPortafolioRepository {

    Optional<Portafolio> findByPortafolioID(Long id);

    @Query("SELECT p FROM Portafolio p WHERE p.proveedor.proveedorID = :proveedorID")
    List<Portafolio> findListByProveedorId(@Param("proveedorID") Long proveedorID);
}
