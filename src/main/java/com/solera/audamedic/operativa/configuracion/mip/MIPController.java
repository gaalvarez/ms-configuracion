package com.solera.audamedic.operativa.configuracion.mip;


import com.solera.audamedic.operativa.configuracion.entity.MIP;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
Test with culr
curl --location --request POST 'http://localhost:8080/api/mip' \
--header 'Content-Type: application/json' \
--data-raw '{
    "tipo": "Medicamento",
    "nombreMIP": "Paraceton",
    "descripcionMIP": "Descripción de un medicamento que puede ser así"
}'
 */

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/mip")
public class MIPController {

    private final MIPService mipService;

    @PostMapping
    public ResponseEntity<MIP> createMIP(@RequestBody MIPDTO mipDto) {
        MIP mip = mipService.createMIP(mipDto);
        return ResponseEntity.ok(mip);
    }
}