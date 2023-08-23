package com.solera.audamedic.operativa.configuracion.messaging;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConfiguracionUpdatedEvent implements Serializable {
    private List<String> updatedEntityNames;
    private Boolean allUpdated;
}