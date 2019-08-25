package com.demo.qrcode.usecase.converter.impl;

import com.demo.qrcode.gateway.data.ClienteDocument;
import com.demo.qrcode.usecase.converter.ClienteUseCaseConverter;
import com.demo.qrcode.usecase.data.input.ClienteBusinessInput;
import com.demo.qrcode.usecase.data.output.ClienteBusinessOutput;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

import static java.util.Objects.isNull;

@Component
@RequiredArgsConstructor
public class ClienteUseCaseConverterImpl implements ClienteUseCaseConverter {

    @Override
    public ClienteDocument toClienteDocument(ClienteBusinessInput clienteBusinessInput) {
        if(isNull(clienteBusinessInput))
            return null;

        return ClienteDocument
                .builder()
                .idCliente(getUUID())
                .nome(clienteBusinessInput.getNome())
                .cpf(clienteBusinessInput.getCpf())
                .endereco(clienteBusinessInput.getEndereco())
                .dataNascimento(clienteBusinessInput.getDataNascimento())
                .build();
    }

    @Override
    public ClienteBusinessOutput toBusinessOutput(ClienteDocument clienteDocument) {
        return ClienteBusinessOutput
                .builder()
                .idCliente(clienteDocument.getIdCliente())
                .nome(clienteDocument.getNome())
                .cpf(clienteDocument.getCpf())
                .endereco(clienteDocument.getEndereco())
                .dataNascimento(clienteDocument.getDataNascimento())
                .build();
    }

    private String getUUID() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }
}
