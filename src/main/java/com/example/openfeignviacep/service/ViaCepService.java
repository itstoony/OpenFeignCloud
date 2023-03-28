package com.example.openfeignviacep.service;

import com.example.openfeignviacep.client.ViaCepClient;
import com.example.openfeignviacep.response.ViaCepResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ViaCepService {

    private final ViaCepClient client;

    public ViaCepResponse getCEP(String cep) {
        return client.getCep(cep);
    }

}
