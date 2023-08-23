package com.solera.audamedic.operativa.configuracion.exception;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@AllArgsConstructor
public class ApiErrorDTO {

    private HttpStatus status;
    private String message;
    private String code;
}

