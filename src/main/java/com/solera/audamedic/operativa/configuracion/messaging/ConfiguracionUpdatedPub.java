package com.solera.audamedic.operativa.configuracion.messaging;

import com.solera.audamedic.operativa.configuracion.exception.SendEventException;

import java.util.List;

public interface ConfiguracionUpdatedPub {
    void sendConfigurationUpdatedEvent(List<String> updatedEntities, Boolean allUpdated) throws SendEventException;
}
