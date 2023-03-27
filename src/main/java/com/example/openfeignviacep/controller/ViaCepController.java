package com.example.openfeignviacep.controller;

import com.example.openfeignviacep.service.ViaCepService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consulta-cep")
@RequiredArgsConstructor
public class ViaCepController {

    private final ViaCepService service;


}
