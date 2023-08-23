package com.solera.audamedic.operativa.configuracion.portafolio;

import com.solera.audamedic.operativa.configuracion.entity.Portafolio;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

import java.util.List;

public class CustomPortafolioRepositoryImpl implements  CustomPortafolioRepository {
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public List<Portafolio> findProveedoresByProveedorId(Long proveedorId) {
        final String sql = "SELECT p.* FROM Portafolio p WHERE p.ProveedorID = :proveedorId";
        Query query = entityManager.createNativeQuery(sql, Portafolio.class);
        query.setParameter("proveedorId", proveedorId);
        return query.getResultList();
    }
}
