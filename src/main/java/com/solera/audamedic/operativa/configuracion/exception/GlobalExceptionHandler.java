package com.solera.audamedic.operativa.configuracion.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<?> manageResourceNotFoundException(ResourceNotFoundException ex) {
        return new ResponseEntity<>(new ApiErrorDTO(HttpStatus.NOT_FOUND, ex.getMessage(), ex.getCode()), HttpStatus.NOT_FOUND);
    }

    // Otros manejadores de excepciones personalizadas
}