package com.solera.audamedic.operativa.configuracion.messaging;

import com.solera.audamedic.operativa.configuracion.exception.SendEventException;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.AmqpException;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ConfiguracionUpdatedPubImpl implements ConfiguracionUpdatedPub {

    private final RabbitTemplate rabbitTemplate;
    private final FanoutExchange fanoutExchange;


    @Override
    public void sendConfigurationUpdatedEvent(List<String> updatedEntities, Boolean allUpdated) throws SendEventException {
        ConfiguracionUpdatedEvent event = new ConfiguracionUpdatedEvent(updatedEntities, allUpdated);
        try {
            rabbitTemplate.convertAndSend(fanoutExchange.getName(), "", event);
        } catch (AmqpException ex) {
            throw new SendEventException(ex);
        }
    }
}
