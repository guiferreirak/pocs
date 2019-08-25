package com.demo.qrcode.entrypoints.converter.impl;

import com.demo.qrcode.entrypoints.converter.ClienteHttpConverter;
import com.demo.qrcode.entrypoints.data.request.ClienteContractRequest;
import com.demo.qrcode.usecase.data.input.ClienteBusinessInput;
import org.springframework.stereotype.Component;

import static java.util.Objects.isNull;

@Component
public class ClienteHttpConverterImpl implements ClienteHttpConverter {

    @Override
    public ClienteBusinessInput toUsecase(ClienteContractRequest request) {
        if(isNull(request))
            return null;

        return ClienteBusinessInput
                .builder()
                .nome(request.getNome())
                .cpf(request.getCpf())
                .endereco(request.getEndereco())
                .dataNascimento(request.getDataNascimento())
                .build();
    }
}
