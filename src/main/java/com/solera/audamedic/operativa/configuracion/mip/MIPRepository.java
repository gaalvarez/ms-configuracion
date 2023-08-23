package com.solera.audamedic.operativa.configuracion.mip;

import com.solera.audamedic.operativa.configuracion.entity.MIP;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MIPRepository extends JpaRepository<MIP, Long> {
}