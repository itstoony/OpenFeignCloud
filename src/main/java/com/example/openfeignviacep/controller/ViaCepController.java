package com.example.openfeignviacep.controller;

import com.example.openfeignviacep.response.ViaCepResponse;
import com.example.openfeignviacep.service.ViaCepService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/search")
@RequiredArgsConstructor
public class ViaCepController {

    private final ViaCepService service;

    @GetMapping("/{cep}")
    public ResponseEntity<ViaCepResponse> getCEP(@PathVariable String cep) {
        return new ResponseEntity<>(service.getCEP(cep), HttpStatus.OK);
    }

}
