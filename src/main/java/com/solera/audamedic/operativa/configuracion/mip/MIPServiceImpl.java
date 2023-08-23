package com.solera.audamedic.operativa.configuracion.mip;

import com.solera.audamedic.operativa.configuracion.entity.MIP;
import com.solera.audamedic.operativa.configuracion.exception.SendEventException;
import com.solera.audamedic.operativa.configuracion.messaging.ConfiguracionUpdatedEvent;
import com.solera.audamedic.operativa.configuracion.messaging.ConfiguracionUpdatedPub;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Slf4j
@Service
@RequiredArgsConstructor
public class MIPServiceImpl implements MIPService {

    private final MIPRepository mipRepository;
    private final ConfiguracionUpdatedPub configuracionUpdatedPub;

    @Override
    public MIP createMIP(MIPDTO mipDto) {
        MIP mip = new MIP();
        mip.setTipo(mipDto.getTipo());
        mip.setNombreMIP(mipDto.getNombreMIP());
        mip.setDescripcionMIP(mipDto.getDescripcionMIP());
        final MIP newMip = mipRepository.save(mip);
        sendConfigurationUpdatedEvent();
        return newMip;
    }

    /**
     * Para que el envío de eventos no interfiera con la creación se maneja la excepción así
     * de lo contrario se debería quitar el try y solo enviar el llamado al envío del mensaje.
     */
    private void sendConfigurationUpdatedEvent() {
        try {
            configuracionUpdatedPub.sendConfigurationUpdatedEvent(Arrays.asList(MIP.class.getSimpleName()), false);
        } catch (SendEventException ex) {
            log.warn(ex.getMessage(), ex);
        }
    }
}
