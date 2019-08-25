package com.demo.qrcode.usecase.impl;

import com.demo.qrcode.gateway.ClienteRepository;
import com.demo.qrcode.gateway.data.ClienteDocument;
import com.demo.qrcode.usecase.ClienteUseCase;
import com.demo.qrcode.usecase.converter.ClienteUseCaseConverter;
import com.demo.qrcode.usecase.data.input.ClienteBusinessInput;
import com.demo.qrcode.usecase.data.output.ClienteBusinessOutput;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ClienteUseCaseImpl implements ClienteUseCase {

    private final ClienteRepository repository;
    private final ClienteUseCaseConverter converter;

    @Override
    public ClienteBusinessOutput cadastrarCliente(ClienteBusinessInput clienteBusinessInput) throws Exception {

        try{
            ClienteDocument clienteDocument = converter.toClienteDocument(clienteBusinessInput);
            ClienteBusinessOutput businessOutput = converter.toBusinessOutput(repository.save(clienteDocument));

            return businessOutput;
        }catch (Exception ex){
            ex.printStackTrace();
            throw new Exception("Erro ao inserir Cliente na base");
        }

    }
}
