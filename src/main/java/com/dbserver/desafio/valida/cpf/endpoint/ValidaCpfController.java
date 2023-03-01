package com.dbserver.desafio.valida.cpf.endpoint;

import com.dbserver.desafio.valida.cpf.endpoint.dto.StatusCpfDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
@RequiredArgsConstructor
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class ValidaCpfController {

    @GetMapping("/valida-cpf/{cpf}")
    public ResponseEntity<StatusCpfDTO> cadastrarPauta(@PathVariable("cpf") String cpf) {

        Random random = new Random();
        if(random.nextBoolean()){
            return ResponseEntity.ok(StatusCpfDTO.builder().statusDTO("ABLE_TO_VOTE").build());
        }

        return ResponseEntity.notFound().build();
    }
}
